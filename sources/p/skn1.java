package p;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class skn1 extends rin1 {
    private static final skn1 zzj;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private uin1 zzi = sin1.e;

    static {
        skn1 skn1Var = new skn1();
        zzj = skn1Var;
        rin1.m(skn1.class, skn1Var);
    }

    public static qkn1 x() {
        return (qkn1) zzj.h();
    }

    public final /* synthetic */ void A(String str) {
        this.zze = "18.9.3";
    }

    public final /* synthetic */ void B(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.zzf = str2;
    }

    public final /* synthetic */ void C(String str) {
        String str2 = Build.MANUFACTURER;
        Objects.requireNonNull(str2);
        this.zzg = str2;
    }

    public final /* synthetic */ void D(String str) {
        Objects.requireNonNull(str);
        this.zzh = str;
    }

    public final void E(Iterable iterable) {
        List list = this.zzi;
        if (!((ohn1) list).a) {
            int size = list.size();
            this.zzi = ((sin1) list).zzg(size + size);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            rkn1 rkn1Var = (rkn1) it.next();
            uin1 uin1Var = this.zzi;
            if (rkn1Var == rkn1.i1) {
                rkn1Var.getClass();
                xin1.a();
                throw null;
            }
            ((sin1) uin1Var).zzh(rkn1Var.a);
        }
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzj, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zza", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new skn1();
        }
        if (i2 == 4) {
            return new qkn1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(skn1.class);
    }

    public final /* synthetic */ void y(int i) {
        this.zza = i;
    }

    public final /* synthetic */ void z(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
    }
}
