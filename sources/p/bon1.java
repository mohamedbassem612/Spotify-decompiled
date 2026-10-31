package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bon1 extends rin1 {
    private static final bon1 zze;
    private int zza = 0;
    private Object zzd;

    static {
        bon1 bon1Var = new bon1();
        zze = bon1Var;
        rin1.m(bon1.class, bon1Var);
    }

    public static aon1 A() {
        return (aon1) zze.h();
    }

    public static bon1 z(byte[] bArr) {
        return (bon1) rin1.p(zze, bArr);
    }

    public final /* synthetic */ void B(aln1 aln1Var) {
        this.zzd = aln1Var;
        this.zza = 1;
    }

    public final int C() {
        int i = this.zza;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzd", "zza", aln1.class, hln1.class});
        }
        if (i2 == 3) {
            return new bon1();
        }
        if (i2 == 4) {
            return new aon1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(bon1.class);
    }

    public final aln1 x() {
        return this.zza == 1 ? (aln1) this.zzd : aln1.E();
    }

    public final hln1 y() {
        return this.zza == 2 ? (hln1) this.zzd : hln1.x();
    }
}
