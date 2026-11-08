package git.artdeell.cubic.prefs.screens;

import android.os.Bundle;

import androidx.preference.SwitchPreferenceCompat;

import git.artdeell.cubic.utils.GpuUtils;

import git.artdeell.cubic.R;

public class LauncherPreferenceExperimentalFragment extends LauncherPreferenceFragment {

    @Override
    public void onCreatePreferences(Bundle b, String str) {
        addPreferencesFromResource(R.xml.pref_experimental);
        SwitchPreferenceCompat sysmem = requirePreference("freedrenoSysmem", SwitchPreferenceCompat.class);
        SwitchPreferenceCompat ubwc = requirePreference("ubwcWorkaround", SwitchPreferenceCompat.class);
        boolean hasFreedreno = GpuUtils.getGlInfo().isAdreno();
        sysmem.setVisible(hasFreedreno);
        ubwc.setVisible(hasFreedreno);
    }
}
