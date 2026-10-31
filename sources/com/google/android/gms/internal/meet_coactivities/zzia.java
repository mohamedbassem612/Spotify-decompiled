package com.google.android.gms.internal.meet_coactivities;

import com.google.android.meet.addons.AddonException;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import p.bi7;
import p.f280;
import p.m02;
import p.n8d0;
import p.u5;
import p.w5;
import p.yoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zzia {
    private static final zzkz zza = zzkz.zzj("com/google/android/meet/addons/internal/ExceptionUtils");

    public static n8d0 zza(n8d0 n8d0Var, final String str, final Object... objArr) {
        bi7 bi7Var = new bi7() { // from class: com.google.android.gms.internal.meet_coactivities.zzhz
            @Override // p.bi7
            public final n8d0 apply(Object obj) {
                zzia.zzf((Throwable) obj, str, objArr);
                return f280.b;
            }
        };
        Executor executor = zzir.zza;
        int i = w5.h;
        u5 u5Var = new u5(n8d0Var, Throwable.class, bi7Var);
        n8d0Var.b(u5Var, yoi1.K(executor, u5Var));
        return u5Var;
    }

    public static n8d0 zzb(n8d0 n8d0Var, final String str) {
        bi7 bi7Var = new bi7() { // from class: com.google.android.gms.internal.meet_coactivities.zzhy
            @Override // p.bi7
            public final n8d0 apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzia.zze(th);
                boolean z = th instanceof AddonException;
                String str2 = str;
                if (!z) {
                    Optional.empty();
                    throw new AddonException(str2, m02.a);
                }
                m02 m02Var = ((AddonException) th).a;
                Optional.empty();
                throw new AddonException(str2, m02Var);
            }
        };
        Executor executor = zzir.zza;
        int i = w5.h;
        u5 u5Var = new u5(n8d0Var, Throwable.class, bi7Var);
        n8d0Var.b(u5Var, yoi1.K(executor, u5Var));
        return u5Var;
    }

    public static Object zzc(Supplier supplier, String str) {
        try {
            return supplier.get();
        } catch (Throwable th) {
            zze(th);
            Optional.empty();
            throw new AddonException(str, m02.a);
        }
    }

    public static void zzd(final Runnable runnable, String str) {
    }

    public static void zze(Throwable th) {
        zzf(th, "", new Object[0]);
    }

    public static void zzf(Throwable th, String str, Object... objArr) {
        zza.zzd().zzg(th).zzh("com/google/android/meet/addons/internal/ExceptionUtils", "recordInternalException", 25, "ExceptionUtils.java").zzu(str, objArr);
    }
}
