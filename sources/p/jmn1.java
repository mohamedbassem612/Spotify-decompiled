package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jmn1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final jmn1 zzh;
    private int zzd;
    private fmn1 zze;
    private String zzf = "";
    private String zzg = "";

    static {
        jmn1 jmn1Var = new jmn1();
        zzh = jmn1Var;
        rin1.m(jmn1.class, jmn1Var);
    }

    public static imn1 A() {
        return (imn1) zzh.h();
    }

    public final /* synthetic */ void B(fmn1 fmn1Var) {
        Objects.requireNonNull(fmn1Var);
        this.zze = fmn1Var;
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
            return new jmn1();
        }
        if (i2 == 4) {
            return new imn1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(jmn1.class);
    }

    public final fmn1 x() {
        fmn1 fmn1Var = this.zze;
        return fmn1Var == null ? fmn1.A() : fmn1Var;
    }

    public final String y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
