package com.google.android.gms.internal.meet_coactivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Optional;
import java.util.function.Function;
import p.ikj1;
import p.n02;
import p.o02;
import p.u311;
import p.v311;
import p.zen1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzje extends BroadcastReceiver {
    public static final /* synthetic */ int zza = 0;
    private static final zzkz zzb = zzkz.zzj("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver");
    private static final o02 zzc = zza(n02.a, new zen1(u311.a));
    private final zziq zzd;

    public zzje(zziq zziqVar) {
        this.zzd = zziqVar;
    }

    private static o02 zza(n02 n02Var, v311 v311Var) {
        ikj1 ikj1Var = new ikj1();
        ikj1Var.a = "";
        ikj1Var.b = "";
        ikj1Var.g(v311Var);
        ikj1Var.e(n02Var);
        return ikj1Var.a();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        o02 o02VarZza;
        boolean zZzf;
        Optional optionalOfNullable = Optional.ofNullable(getResultExtras(false));
        if (optionalOfNullable.isPresent()) {
            Optional map = optionalOfNullable.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzjc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = zzje.zza;
                    return ((Bundle) obj).getByteArray("S11Y_SESSION_DETECTION_RESPONSE");
                }
            });
            if (((Boolean) map.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzjd
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = zzje.zza;
                    return Boolean.valueOf(((byte[]) obj).length > 0);
                }
            }).orElse(Boolean.FALSE)).booleanValue()) {
                try {
                    zzbe zzbeVarZzf = zzbe.zzf((byte[]) map.get(), zzsk.zza());
                    if (zzbeVarZzf.zzd().zze()) {
                        if (zzbeVarZzf.zzc().zzg()) {
                            zZzf = zzbeVarZzf.zzc().zzf();
                        } else {
                            zZzf = !(zzbeVarZzf.zzc().zza().zze() == 4);
                        }
                        n02 n02Var = n02.b;
                        if (zZzf) {
                            int iZzh = zzbeVarZzf.zzc().zzh();
                            int i = iZzh - 1;
                            if (iZzh == 0) {
                                throw null;
                            }
                            if (i != 0) {
                                zzb.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "sessionStatus", 111, "SessionDetectionResponseReceiver.java").zzo("Ongoing meeting.");
                                o02VarZza = zza(n02Var, zzkn.zzb(zzbeVarZzf.zza()));
                            } else {
                                zzb.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "sessionStatus", 107, "SessionDetectionResponseReceiver.java").zzo("Ongoing live sharing session.");
                                o02VarZza = zza(n02.c, zzkn.zzb(zzbeVarZzf.zza()));
                            }
                        } else {
                            zzb.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "sessionStatus", 101, "SessionDetectionResponseReceiver.java").zzo("Local user does not have live sharing enabled.");
                            o02VarZza = zza(n02Var, zzkn.zzb(zzbeVarZzf.zza()));
                        }
                    } else {
                        zzb.zze().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 151, "SessionDetectionResponseReceiver.java").zzo("Invalid state proto detected");
                        o02VarZza = zzc;
                    }
                } catch (zztj e) {
                    zzb.zze().zzg(e).zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 145, "SessionDetectionResponseReceiver.java").zzo("Error parsing bytes and converting to proto");
                    o02VarZza = zzc;
                }
            } else {
                zzb.zze().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 132, "SessionDetectionResponseReceiver.java").zzo("Received response from Meet but proto was empty");
                o02VarZza = zzc;
            }
        } else {
            zzb.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/SessionDetectionResponseReceiver", "parseResponse", 124, "SessionDetectionResponseReceiver.java").zzo("Result Extras was empty");
            o02VarZza = zzc;
        }
        ((zzit) this.zzd).zza.b(o02VarZza);
    }
}
