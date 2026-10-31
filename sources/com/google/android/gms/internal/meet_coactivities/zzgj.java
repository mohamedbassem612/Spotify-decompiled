package com.google.android.gms.internal.meet_coactivities;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import p.b380;
import p.mzc;
import p.n02;
import p.nzc;
import p.o02;
import p.upn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzgj {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/CoActivityStartInfoProvider");
    private static final Duration zzb = Duration.ofSeconds(1);

    public static zzgi zza(final Context context, String str, final long j, zziv zzivVar, boolean z) {
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        b380 b380Var = zzde.zzc;
        int size = b380Var.size();
        for (int i = 0; i < size; i++) {
            zzj zzjVar = (zzj) b380Var.get(i);
            String str2 = (String) zzde.zzb.get(zzjVar);
            str2.getClass();
            try {
                if (packageManager.getApplicationInfo(str2, 0).enabled) {
                    arrayList.add(zzjVar);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "isInstalled", 135, "CoActivityStartInfoProvider.java").zzp("App Package %s is not installed", str2);
            }
        }
        if (arrayList.size() == 1) {
            zzj zzjVar2 = (zzj) arrayList.get(0);
            return new zzgi(zzb(zzjVar2, str, j, z), !zzc(packageManager, zzjVar2), null);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            zzj zzjVar3 = (zzj) arrayList.get(i2);
            final String str3 = (String) zzde.zzb.get(zzjVar3);
            str3.getClass();
            try {
                n02 n02Var = ((o02) upn1.t(new nzc() { // from class: com.google.android.gms.internal.meet_coactivities.zzis
                    public final Object attachCompleter(mzc mzcVar) {
                        Optional optionalEmpty = Optional.empty();
                        Objects.requireNonNull(mzcVar);
                        zzjb.zza(context, optionalEmpty, new zzje(new zzit(mzcVar)), Optional.of(str3), j);
                        return "zziq";
                    }
                }).b.get(zzb.toMillis(), TimeUnit.MILLISECONDS)).c;
                z2 = n02Var.equals(n02.b) || n02Var.equals(n02.c);
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                zza.zze().zzg(e).zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "isMeetingOngoing", 189, "CoActivityStartInfoProvider.java").zzp("Fail to detect ongoing calls in app: %s.", str3);
            }
            i2++;
            if (z2) {
                if (zzc(packageManager, zzjVar3)) {
                    zza.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "getCoActivityStartInfo", 68, "CoActivityStartInfoProvider.java").zzp("Package: %s hosting the ongoing meeting is updated.", str3);
                    return new zzgi(zzb(zzjVar3, str, j, z), false, null);
                }
                zza.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "getCoActivityStartInfo", 79, "CoActivityStartInfoProvider.java").zzp("Package: %s hosting the ongoing meeting is outdated. Cannot connect.", str3);
                return new zzgi(zzb(zzjVar3, str, j, z), true, null);
            }
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            zzj zzjVar4 = (zzj) arrayList.get(i3);
            i3++;
            if (zzc(packageManager, zzjVar4)) {
                return new zzgi(zzb(zzjVar4, str, j, z), false, null);
            }
        }
        return new zzgi(zzb(zzj.HOST_APP_UNKNOWN, str, j, z), false, null);
    }

    private static zzp zzb(zzj zzjVar, String str, long j, boolean z) {
        zzo zzoVarZzc = zzp.zzc();
        zzoVarZzc.zzc(zzjVar);
        zzoVarZzc.zza(str);
        zzoVarZzc.zzb(j);
        zzoVarZzc.zzd(z);
        return (zzp) zzoVarZzc.zzk();
    }

    private static boolean zzc(PackageManager packageManager, zzj zzjVar) {
        String str = (String) zzde.zzb.get(zzjVar);
        str.getClass();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            long longVersionCode = Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
            zzkz zzkzVar = zza;
            zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "isVersionUpdated", 152, "CoActivityStartInfoProvider.java").zzr("%s long version code is: %s", str, longVersionCode);
            Long l = (Long) zzde.zza.get(zzjVar);
            l.getClass();
            if (longVersionCode >= l.longValue()) {
                return true;
            }
            zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "isVersionUpdated", 159, "CoActivityStartInfoProvider.java").zzt("App Package %s is too old to support live sharing, minimal version is %s and app version is %s.,", str, l, Long.valueOf(longVersionCode));
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.zzc().zzh("com/google/android/meet/addons/internal/CoActivityStartInfoProvider", "isVersionUpdated", 154, "CoActivityStartInfoProvider.java").zzp("App Package %s is not installed", str);
            return false;
        }
    }
}
