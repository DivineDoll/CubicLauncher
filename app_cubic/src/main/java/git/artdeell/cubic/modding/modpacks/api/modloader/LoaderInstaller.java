package git.artdeell.cubic.modding.modpacks.api.modloader;

import git.artdeell.cubic.instances.InstanceInstaller;

import java.io.IOException;

public interface LoaderInstaller {
    boolean requiresGuiInstallation();
    InstanceInstaller createInstaller() throws IOException;
    String installHeadlessly() throws IOException;
}
