package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p.jt80;
import p.kh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface SplitInstallManager {
    Task cancelInstall(int i);

    Task deferredInstall(List<String> list);

    Task deferredLanguageInstall(List<Locale> list);

    Task deferredLanguageUninstall(List<Locale> list);

    Task deferredUninstall(List<String> list);

    Set<String> getInstalledLanguages();

    Set<String> getInstalledModules();

    Task getSessionState(int i);

    Task getSessionStates();

    void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, jt80 jt80Var, int i);

    boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, kh0 kh0Var);

    Task startInstall(SplitInstallRequest splitInstallRequest);

    void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);

    void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener);
}
