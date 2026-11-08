package git.artdeell.cubic.fragments;

import android.content.Context;

import androidx.annotation.NonNull;

import git.artdeell.cubic.R;

import git.artdeell.cubic.modding.forge.ForgelikeUtils;

public class ForgeInstallFragment extends ForgelikeInstallFragment {
    public static final String TAG = "ForgeInstallFragment";
    public ForgeInstallFragment() {
        super(ForgelikeUtils.FORGE_UTILS, TAG);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public int getTitleText() {
        return R.string.forge_dl_select_version;
    }

    @Override
    public int getNoDataMsg() {
        return R.string.forge_dl_no_installer;
    }
}
