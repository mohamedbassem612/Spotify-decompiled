package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p.jt80;
import p.kh0;
import p.kt80;
import p.o0c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzaa implements SplitInstallManager {
    private final zzbc zza;
    private final zzx zzb;
    private final zzs zzc;
    private final zzbe zzd;
    private final Handler zze = new Handler(Looper.getMainLooper());

    public zzaa(zzbc zzbcVar, zzx zzxVar, zzs zzsVar, zzbe zzbeVar) {
        this.zza = zzbcVar;
        this.zzb = zzxVar;
        this.zzc = zzsVar;
        this.zzd = zzbeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List zze(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    public final Task cancelInstall(int i) {
        return this.zza.zzc(i);
    }

    public final Task deferredInstall(List<String> list) {
        return this.zza.zzd(list);
    }

    public final Task deferredLanguageInstall(List<Locale> list) {
        return this.zza.zze(zze(list));
    }

    public final Task deferredLanguageUninstall(List<Locale> list) {
        return this.zza.zzf(zze(list));
    }

    public final Task deferredUninstall(List<String> list) {
        this.zzd.zzc(list);
        return this.zza.zzg(list);
    }

    public final Set<String> getInstalledLanguages() {
        Set<String> setZzd = this.zzc.zzd();
        return setZzd == null ? Collections.EMPTY_SET : setZzd;
    }

    public final Set<String> getInstalledModules() {
        return this.zzc.zzc();
    }

    public final Task getSessionState(int i) {
        return this.zza.zzh(i);
    }

    public final Task getSessionStates() {
        return this.zza.zzi();
    }

    public final synchronized void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzb.zzb(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, jt80 jt80Var, int i) {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        jt80Var.startIntentSenderForResult(splitInstallSessionState.resolutionIntent().getIntentSender(), i, null, 0, 0, 0, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    public final Task startInstall(SplitInstallRequest splitInstallRequest) {
        Set setZzd;
        com.google.android.play.core.splitinstall.internal.zzn zznVar = new com.google.android.play.core.splitinstall.internal.zzn();
        zznVar.zzb(1);
        splitInstallRequest.getLanguages().isEmpty();
        List<Locale> languages = splitInstallRequest.getLanguages();
        if (!languages.isEmpty() && (setZzd = this.zzc.zzd()) != null) {
            HashSet hashSet = new HashSet();
            Iterator<Locale> it = languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getLanguage());
            }
            if (setZzd.containsAll(hashSet)) {
                if (this.zzc.zzc().containsAll(splitInstallRequest.getModuleNames()) && Collections.disjoint(splitInstallRequest.getModuleNames(), this.zzd.zza())) {
                    this.zze.post(new zzy(this, splitInstallRequest));
                    return o0c.z(0);
                }
            }
        } else if (this.zzc.zzc().containsAll(splitInstallRequest.getModuleNames())) {
            this.zze.post(new zzy(this, splitInstallRequest));
            return o0c.z(0);
        }
        this.zzd.zzd(splitInstallRequest.getModuleNames());
        return this.zza.zzj(splitInstallRequest.getModuleNames(), zze(splitInstallRequest.getLanguages()), zznVar);
    }

    public final synchronized void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzb.zzd(splitInstallStateUpdatedListener);
    }

    public final synchronized void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzb.zzi(splitInstallStateUpdatedListener);
    }

    public final synchronized void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzb.zzj(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, kh0 kh0Var) {
        if (splitInstallSessionState.status() != 8 || splitInstallSessionState.resolutionIntent() == null) {
            return false;
        }
        kh0Var.a(new kt80(splitInstallSessionState.resolutionIntent().getIntentSender(), (Intent) null, 0, 0));
        return true;
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int i) {
        return startConfirmationDialogForResult(splitInstallSessionState, new zzz(this, activity), i);
    }
}
