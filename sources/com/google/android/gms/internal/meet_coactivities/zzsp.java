package com.google.android.gms.internal.meet_coactivities;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.grn1;
import p.hhg1;
import p.jah;
import p.k220;
import p.lqn1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
final class zzsp {
    private static final zzsp zzb = new zzsp(true);
    final zzvb zza = new zzuu();
    private boolean zzc;
    private boolean zzd;

    private zzsp(boolean z) {
        zzg();
        zzg();
    }

    public static int zza(zzvq zzvqVar, int i, Object obj) {
        int iZzz = zzsc.zzz(i << 3);
        if (zzvqVar == zzvq.zzj) {
            zzth.zzd((zzuf) obj);
            iZzz += iZzz;
        }
        return iZzz + zzb(zzvqVar, obj);
    }

    public static int zzb(zzvq zzvqVar, Object obj) {
        int iZzd;
        int iZzz;
        zzvq zzvqVar2 = zzvq.zza;
        zzvr zzvrVar = zzvr.INT;
        switch (zzvqVar.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Double) obj).getClass();
                int i = zzsc.zzb;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i2 = zzsc.zzb;
                return 4;
            case 2:
                return zzsc.zzA(((Long) obj).longValue());
            case 3:
                return zzsc.zzA(((Long) obj).longValue());
            case 4:
                return zzsc.zzA(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i3 = zzsc.zzb;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i4 = zzsc.zzb;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i5 = zzsc.zzb;
                return 1;
            case 8:
                if (!(obj instanceof zzrr)) {
                    return zzsc.zzy((String) obj);
                }
                int i6 = zzsc.zzb;
                iZzd = ((zzrr) obj).zzd();
                iZzz = zzsc.zzz(iZzd);
                break;
                break;
            case 9:
                int i7 = zzsc.zzb;
                return ((zzuf) obj).zzz();
            case 10:
                if (!(obj instanceof zzto)) {
                    return zzsc.zzw((zzuf) obj);
                }
                int i8 = zzsc.zzb;
                iZzd = ((zzto) obj).zza();
                iZzz = zzsc.zzz(iZzd);
                break;
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof zzrr)) {
                    int i9 = zzsc.zzb;
                    iZzd = ((byte[]) obj).length;
                    iZzz = zzsc.zzz(iZzd);
                } else {
                    int i10 = zzsc.zzb;
                    iZzd = ((zzrr) obj).zzd();
                    iZzz = zzsc.zzz(iZzd);
                }
                break;
            case grn1.d /* 12 */:
                return zzsc.zzz(((Integer) obj).intValue());
            case 13:
                return obj instanceof zztb ? zzsc.zzA(((zztb) obj).zza()) : zzsc.zzA(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = zzsc.zzb;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = zzsc.zzb;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzsc.zzz((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzsc.zzA((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                jah.g("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
        return iZzz + iZzd;
    }

    public static int zzc(zzso zzsoVar, Object obj) {
        zzvq zzvqVarZzb = zzsoVar.zzb();
        int iZza = zzsoVar.zza();
        if (!zzsoVar.zze()) {
            return zza(zzvqVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int iZza2 = 0;
        if (!zzsoVar.zzd()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iZza2 += zza(zzvqVarZzb, iZza, it.next());
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iZza2 += zzb(zzvqVarZzb, it2.next());
        }
        return zzsc.zzz(iZza2) + zzsc.zzz(iZza << 3) + iZza2;
    }

    public static zzsp zze() {
        return zzb;
    }

    public static void zzi(zzsc zzscVar, zzvq zzvqVar, int i, Object obj) {
        if (zzvqVar == zzvq.zzj) {
            zzuf zzufVar = (zzuf) obj;
            zzth.zzd(zzufVar);
            zzscVar.zzq(i, 3);
            zzufVar.zzS(zzscVar);
            zzscVar.zzq(i, 4);
            return;
        }
        zzscVar.zzq(i, zzvqVar.zza());
        zzvr zzvrVar = zzvr.INT;
        switch (zzvqVar.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zzscVar.zzj(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                zzscVar.zzh(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                zzscVar.zzu(((Long) obj).longValue());
                break;
            case 3:
                zzscVar.zzu(((Long) obj).longValue());
                break;
            case 4:
                zzscVar.zzl(((Integer) obj).intValue());
                break;
            case 5:
                zzscVar.zzj(((Long) obj).longValue());
                break;
            case 6:
                zzscVar.zzh(((Integer) obj).intValue());
                break;
            case 7:
                zzscVar.zzb(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof zzrr)) {
                    zzscVar.zzp((String) obj);
                } else {
                    zzscVar.zzf((zzrr) obj);
                }
                break;
            case 9:
                ((zzuf) obj).zzS(zzscVar);
                break;
            case 10:
                zzscVar.zzn((zzuf) obj);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof zzrr)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    zzrz zzrzVar = (zzrz) zzscVar;
                    zzrzVar.zzs(length);
                    zzrzVar.zzc(bArr, 0, length);
                } else {
                    zzscVar.zzf((zzrr) obj);
                }
                break;
            case grn1.d /* 12 */:
                zzscVar.zzs(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof zztb)) {
                    zzscVar.zzl(((Integer) obj).intValue());
                } else {
                    zzscVar.zzl(((zztb) obj).zza());
                }
                break;
            case 14:
                zzscVar.zzh(((Integer) obj).intValue());
                break;
            case 15:
                zzscVar.zzj(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                zzscVar.zzs((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                zzscVar.zzu((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    private static boolean zzk(Map.Entry entry) {
        zzso zzsoVar = (zzso) entry.getKey();
        if (zzsoVar.zzc() != zzvr.MESSAGE) {
            return true;
        }
        if (!zzsoVar.zze()) {
            return zzl(entry.getValue());
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzl(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzug) {
            return ((zzug) obj).zzU();
        }
        if (obj instanceof zzto) {
            return true;
        }
        hhg1.n("Wrong object type used with protocol message reflection.");
        return false;
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int iZzz;
        int iZzw;
        zzso zzsoVar = (zzso) entry.getKey();
        Object value = entry.getValue();
        if (zzsoVar.zzc() != zzvr.MESSAGE || zzsoVar.zze() || zzsoVar.zzd()) {
            return zzc(zzsoVar, value);
        }
        if (value instanceof zzto) {
            int iZza = ((zzso) entry.getKey()).zza();
            int iZzz2 = zzsc.zzz(8);
            i = iZzz2 + iZzz2;
            iZzz = zzsc.zzz(iZza) + zzsc.zzz(16);
            int iZzz3 = zzsc.zzz(24);
            int iZza2 = ((zzto) value).zza();
            iZzw = lqn1.p(iZza2, iZza2, iZzz3);
        } else {
            int iZza3 = ((zzso) entry.getKey()).zza();
            int iZzz4 = zzsc.zzz(8);
            i = iZzz4 + iZzz4;
            iZzz = zzsc.zzz(iZza3) + zzsc.zzz(16);
            iZzw = zzsc.zzw((zzuf) value) + zzsc.zzz(24);
        }
        return i + iZzz + iZzw;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static final void zzn(zzso zzsoVar, Object obj) {
        boolean z;
        zzvq zzvqVarZzb = zzsoVar.zzb();
        byte[] bArr = zzth.zzb;
        obj.getClass();
        zzvq zzvqVar = zzvq.zza;
        zzvr zzvrVar = zzvr.INT;
        switch (zzvqVarZzb.zzb().ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                z = obj instanceof Integer;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 1:
                z = obj instanceof Long;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 2:
                z = obj instanceof Float;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 3:
                z = obj instanceof Double;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 4:
                z = obj instanceof Boolean;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 5:
                z = obj instanceof String;
                if (z) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 6:
                if ((obj instanceof zzrr) || (obj instanceof byte[])) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zztb)) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            case 8:
                if ((obj instanceof zzuf) || (obj instanceof zzto)) {
                }
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
            default:
                k220.q("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzsoVar.zza()), zzsoVar.zzb().zzb(), obj.getClass().getName()});
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzvb zzvbVar;
        zzsp zzspVar = new zzsp();
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzvbVar = this.zza;
            if (i >= iZzb) {
                break;
            }
            Map.Entry entryZzg = zzvbVar.zzg(i);
            zzspVar.zzh((zzso) entryZzg.getKey(), entryZzg.getValue());
            i++;
        }
        for (Map.Entry entry : zzvbVar.zzc()) {
            zzspVar.zzh((zzso) entry.getKey(), entry.getValue());
        }
        zzspVar.zzd = this.zzd;
        return zzspVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzsp) {
            return this.zza.equals(((zzsp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        zzvb zzvbVar;
        int i = 0;
        int iZzm = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzvbVar = this.zza;
            if (i >= iZzb) {
                break;
            }
            iZzm += zzm(zzvbVar.zzg(i));
            i++;
        }
        Iterator it = zzvbVar.zzc().iterator();
        while (it.hasNext()) {
            iZzm += zzm((Map.Entry) it.next());
        }
        return iZzm;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        boolean z = this.zzd;
        zzvb zzvbVar = this.zza;
        return z ? new zztn(zzvbVar.entrySet().iterator()) : zzvbVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzvb zzvbVar = this.zza;
            if (i >= iZzb) {
                zzvbVar.zza();
                this.zzc = true;
                return;
            } else {
                Map.Entry entryZzg = zzvbVar.zzg(i);
                if (entryZzg.getValue() instanceof zzsz) {
                    ((zzsz) entryZzg.getValue()).zzL();
                }
                i++;
            }
        }
    }

    public final void zzh(zzso zzsoVar, Object obj) {
        if (!zzsoVar.zze()) {
            zzn(zzsoVar, obj);
        } else {
            if (!(obj instanceof List)) {
                hhg1.n("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzn(zzsoVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof zzto) {
            this.zzd = true;
        }
        this.zza.put(zzsoVar, obj);
    }

    public final boolean zzj() {
        int i = 0;
        while (true) {
            int iZzb = this.zza.zzb();
            zzvb zzvbVar = this.zza;
            if (i >= iZzb) {
                Iterator it = zzvbVar.zzc().iterator();
                while (it.hasNext()) {
                    if (!zzk((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!zzk(zzvbVar.zzg(i))) {
                return false;
            }
            i++;
        }
    }

    private zzsp() {
    }
}
