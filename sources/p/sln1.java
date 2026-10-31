package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sln1 extends rin1 {
    public static final /* synthetic */ int zza = 0;
    private static final sln1 zzj;
    private int zzd;
    private String zze = "";
    private ain1 zzf;
    private String zzg;
    private String zzh;
    private ain1 zzi;

    static {
        sln1 sln1Var = new sln1();
        zzj = sln1Var;
        rin1.m(sln1.class, sln1Var);
    }

    public sln1() {
        vhn1 vhn1Var = ain1.b;
        this.zzf = vhn1Var;
        this.zzg = "";
        this.zzh = "";
        this.zzi = vhn1Var;
    }

    public static rln1 C() {
        return (rln1) zzj.h();
    }

    public final String A() {
        return this.zzh;
    }

    public final ain1 B() {
        return this.zzi;
    }

    public final /* synthetic */ void D(String str) {
        Objects.requireNonNull(str);
        this.zzd |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void E(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzd |= 2;
        this.zzf = ain1Var;
    }

    public final /* synthetic */ void F(String str) {
        Objects.requireNonNull(str);
        this.zzd |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void G(String str) {
        Objects.requireNonNull(str);
        this.zzd |= 8;
        this.zzh = str;
    }

    public final /* synthetic */ void H(ain1 ain1Var) {
        Objects.requireNonNull(ain1Var);
        this.zzd |= 16;
        this.zzi = ain1Var;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ည\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ည\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new sln1();
        }
        if (i2 == 4) {
            return new rln1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(sln1.class);
    }

    public final String x() {
        return this.zze;
    }

    public final ain1 y() {
        return this.zzf;
    }

    public final String z() {
        return this.zzg;
    }
}
