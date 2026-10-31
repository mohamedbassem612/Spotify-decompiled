package com.google.android.gms.internal.meet_coactivities;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.common.base.VerifyException;
import java.util.Optional;
import java.util.function.Function;
import p.v311;
import p.xii0;
import p.zii0;
import p.zxl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zziy extends BroadcastReceiver {
    public static final /* synthetic */ int zza = 0;
    private static final zzkz zzb = zzkz.zzj("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver");
    private static final zzbe zzc;
    private final zii0 zzd;
    private final String zze;
    private final long zzf;

    static {
        zzav zzavVarZzb = zzbe.zzb();
        zzbc zzbcVarZza = zzbd.zza();
        zzbcVarZza.zza(false);
        zzavVarZzb.zzb(zzbcVarZza);
        zzba zzbaVarZzb = zzbb.zzb();
        zzbaVarZzb.zza(zzaz.zzb());
        zzavVarZzb.zza(zzbaVarZzb);
        zzap zzapVarZza = zzaq.zza();
        zzapVarZza.zza(2);
        zzavVarZzb.zzc(zzapVarZza);
        zzc = (zzbe) zzavVarZzb.zzk();
    }

    public zziy(zii0 zii0Var, String str, long j) {
        this.zzd = zii0Var;
        this.zze = str;
        this.zzf = j;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzbe zzbeVar;
        Optional optionalOfNullable = Optional.ofNullable(getResultExtras(false) == null ? intent.getExtras() : getResultExtras(false));
        if (optionalOfNullable.isPresent()) {
            zzbeVar = (zzbe) optionalOfNullable.map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zziw
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    int i = zziy.zza;
                    return ((Bundle) obj).getByteArray("S11Y_SESSION_DETECTION_RESPONSE");
                }
            }).map(new Function() { // from class: com.google.android.gms.internal.meet_coactivities.zzix
                /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.common.base.VerifyException */
                @Override // java.util.function.Function
                public final Object apply(Object obj) throws VerifyException {
                    byte[] bArr = (byte[]) obj;
                    int i = zziy.zza;
                    try {
                        return zzbe.zzf(bArr, zzsk.zza());
                    } catch (zztj e) {
                        throw new VerifyException(e);
                    }
                }
            }).orElse(zzc);
        } else {
            ((zzkv) zzb.zze().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver", "parseResponse", 121, "MeetingStatusBroadcastReceiver.java")).zzo("Received an empty event notification from Meet side event bus.");
            zzbeVar = zzc;
        }
        v311 v311VarZzb = zzkn.zzb(zzbeVar.zza());
        zzkz zzkzVar = zzb;
        ((zzkv) zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver", "maybeNotifyListener", 87, "MeetingStatusBroadcastReceiver.java")).zzp("Meeting status event of %s received.", zzbeVar);
        int iZzh = zzbeVar.zzc().zzh();
        if (iZzh == 0) {
            throw null;
        }
        if (iZzh == 1) {
            zzax zzaxVarZza = zzbeVar.zzc().zza();
            if ((zzaxVarZza.zzd().equals(this.zze) && this.zzf == 0) || this.zzf == zzaxVarZza.zza()) {
                ((zzkv) zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver", "maybeNotifyListener", 90, "MeetingStatusBroadcastReceiver.java")).zzo("Notifying ongoing live sharing experience.");
                zii0 zii0Var = this.zzd;
                zxl1 zxl1Var = new zxl1((byte) 14);
                zxl1Var.l(xii0.c);
                zxl1Var.k(v311VarZzb);
                zii0Var.onMeetingStatusChange(zxl1Var.f());
                return;
            }
        }
        if (zzbeVar.zzd().zze()) {
            ((zzkv) zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver", "maybeNotifyListener", 100, "MeetingStatusBroadcastReceiver.java")).zzo("Notifying ongoing conference in Meet app.");
            zii0 zii0Var2 = this.zzd;
            zxl1 zxl1Var2 = new zxl1((byte) 14);
            zxl1Var2.l(xii0.b);
            zxl1Var2.k(v311VarZzb);
            zii0Var2.onMeetingStatusChange(zxl1Var2.f());
            return;
        }
        if (zzbeVar.zzd().zze()) {
            return;
        }
        ((zzkv) zzkzVar.zzc().zzh("com/google/android/meet/addons/internal/sessiondetection/MeetingStatusBroadcastReceiver", "maybeNotifyListener", 110, "MeetingStatusBroadcastReceiver.java")).zzo("Notifying no meeting in the Meet app.");
        zii0 zii0Var3 = this.zzd;
        zxl1 zxl1Var3 = new zxl1((byte) 14);
        zxl1Var3.l(xii0.a);
        zxl1Var3.k(v311VarZzb);
        zii0Var3.onMeetingStatusChange(zxl1Var3.f());
    }
}
