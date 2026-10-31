package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uln1 extends rin1 {
    private static final uln1 zzf;
    private int zza;
    private String zzd = "";
    private inn1 zze;

    static {
        uln1 uln1Var = new uln1();
        zzf = uln1Var;
        rin1.m(uln1.class, uln1Var);
    }

    public static tln1 x() {
        return (tln1) zzf.h();
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001", new Object[]{"zza", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new uln1();
        }
        if (i2 == 4) {
            return new tln1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(uln1.class);
    }

    public final /* synthetic */ void y(inn1 inn1Var) {
        this.zze = inn1Var;
        this.zza |= 2;
    }
}
