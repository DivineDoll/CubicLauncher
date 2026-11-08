package git.artdeell.cubic.tasks.mojson;

import git.artdeell.cubic.JVersionList;
import git.artdeell.cubic.extra.ExtraConstants;
import git.artdeell.cubic.extra.ExtraCore;
import git.artdeell.cubic.instances.Instance;

import java.io.File;

public class MoJsonExtras {
    public static String normalizeVersionId(String versionString) {
        JVersionList versionList = (JVersionList) ExtraCore.getValue(ExtraConstants.RELEASE_TABLE);
        if(versionList == null || versionList.versions == null) return versionString;
        if(Instance.VERSION_LATEST_RELEASE.equals(versionString)) versionString = versionList.latest.get("release");
        if(Instance.VERSION_LATEST_SNAPSHOT.equals(versionString)) versionString = versionList.latest.get("snapshot");
        return versionString;
    }

    public static JVersionList.Version getListedVersion(String normalizedVersionString) {
        JVersionList versionList = (JVersionList) ExtraCore.getValue(ExtraConstants.RELEASE_TABLE);
        if(versionList == null || versionList.versions == null) return null; // can't have listed versions if there's no list
        for(JVersionList.Version version : versionList.versions) {
            if(version.id.equals(normalizedVersionString)) return version;
        }
        return null;
    }

    public interface DoneListener{
        void onDownloadDone(File[] classpath);
        void onDownloadFailed(Throwable throwable);
    }
}
