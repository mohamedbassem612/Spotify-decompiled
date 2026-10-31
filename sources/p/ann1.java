package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ann1 extends rin1 {
    private static final ann1 zzh;
    private int zza;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        ann1 ann1Var = new ann1();
        zzh = ann1Var;
        rin1.m(ann1.class, ann1Var);
    }

    public static zmn1 x() {
        return (zmn1) zzh.h();
    }

    public final /* synthetic */ void A(String str) {
        Objects.requireNonNull(str);
        this.zza |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void B(String str) {
        Objects.requireNonNull(str);
        this.zza |= 8;
        this.zzg = str;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"zza", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ann1();
        }
        if (i2 == 4) {
            return new zmn1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(ann1.class);
    }

    public final /* synthetic */ void y(String str) {
        this.zza |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void z(String str) {
        this.zza |= 2;
        this.zze = "18.9.3";
    }
}
