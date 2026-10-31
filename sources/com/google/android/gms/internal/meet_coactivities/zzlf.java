package com.google.android.gms.internal.meet_coactivities;

import java.util.Arrays;
import p.tw20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzlf extends zzms {
    private Object[] zza = new Object[8];
    private int zzb = 0;

    private final int zzh(zzlt zzltVar) {
        for (int i = 0; i < this.zzb; i++) {
            if (this.zza[i + i].equals(zzltVar)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.zzb; i++) {
            sb.append(" '");
            sb.append(zzb(i));
            sb.append("': ");
            sb.append(zzd(i));
        }
        sb.append(" }");
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzlt zzb(int i) {
        if (i < this.zzb) {
            return (zzlt) this.zza[i + i];
        }
        tw20.p();
        return null;
    }

    public final Object zzc(zzlt zzltVar) {
        int iZzh = zzh(zzltVar);
        if (iZzh != -1) {
            return zzltVar.zze(this.zza[iZzh + iZzh + 1]);
        }
        return null;
    }

    public final Object zzd(int i) {
        if (i < this.zzb) {
            return this.zza[i + i + 1];
        }
        tw20.p();
        return null;
    }

    public final void zze(zzlt zzltVar, Object obj) {
        int iZzh;
        if (!zzltVar.zzi() && (iZzh = zzh(zzltVar)) != -1) {
            zzpj.zza(obj, "metadata value");
            this.zza[iZzh + iZzh + 1] = obj;
            return;
        }
        int i = this.zzb + 1;
        Object[] objArrCopyOf = this.zza;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.zza = objArrCopyOf;
        }
        int i2 = this.zzb;
        zzpj.zza(zzltVar, "metadata key");
        objArrCopyOf[i2 + i2] = zzltVar;
        Object[] objArr = this.zza;
        int i3 = this.zzb;
        zzpj.zza(obj, "metadata value");
        objArr[i3 + i3 + 1] = obj;
        this.zzb++;
    }

    public final void zzf(zzlt zzltVar) {
        int i;
        int iZzh = zzh(zzltVar);
        if (iZzh >= 0) {
            int i2 = iZzh + iZzh;
            int i3 = i2 + 2;
            while (true) {
                i = this.zzb;
                if (i3 >= i + i) {
                    break;
                }
                Object obj = this.zza[i3];
                if (!obj.equals(zzltVar)) {
                    Object[] objArr = this.zza;
                    objArr[i2] = obj;
                    objArr[i2 + 1] = objArr[i3 + 1];
                    i2 += 2;
                }
                i3 += 2;
            }
            this.zzb = i - ((i3 - i2) >> 1);
            while (i2 < i3) {
                this.zza[i2] = null;
                i2++;
            }
        }
    }
}
