package git.artdeell.cubic.utils.profiles;

public interface VersionSelectorListener {
    void onVersionSelected(String versionId, boolean isSnapshot);
}
