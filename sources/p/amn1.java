package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class amn1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final amn1 zzh;
    private int zzd;
    private yln1 zze;
    private String zzf = "";
    private String zzg = "";

    static {
        amn1 amn1Var = new amn1();
        zzh = amn1Var;
        rin1.m(amn1.class, amn1Var);
    }

    public static zln1 A() {
        return (zln1) zzh.h();
    }

    public final /* synthetic */ void B(yln1 yln1Var) {
        this.zze = yln1Var;
        this.zzd |= 1;
    }

    public final /* synthetic */ void C(String str) {
        this.zzd |= 2;
        this.zzf = "18.9.3";
    }

    public final /* synthetic */ void D(String str) {
        this.zzd |= 4;
        this.zzg = str;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new amn1();
        }
        if (i2 == 4) {
            return new zln1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(amn1.class);
    }

    public final yln1 x() {
        yln1 yln1Var = this.zze;
        return yln1Var == null ? yln1.I() : yln1Var;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
