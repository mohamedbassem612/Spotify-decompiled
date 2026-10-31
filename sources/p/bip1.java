package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bip1 extends rin1 {
    private static final bip1 zze;
    private int zza;
    private win1 zzd = mjn1.e;

    static {
        bip1 bip1Var = new bip1();
        zze = bip1Var;
        rin1.m(bip1.class, bip1Var);
    }

    public static bip1 A(byte[] bArr, hin1 hin1Var) {
        rin1 rin1VarR = rin1.r(zze, bArr, bArr.length, hin1Var);
        rin1.s(rin1VarR);
        return (bip1) rin1VarR;
    }

    public static xhp1 B() {
        return (xhp1) zze.h();
    }

    public final /* synthetic */ void C(int i) {
        this.zza = i;
    }

    public final void D(aip1 aip1Var) {
        win1 win1VarZzg = this.zzd;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zzd = win1VarZzg;
        }
        win1VarZzg.add(aip1Var);
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzd", aip1.class});
        }
        if (i2 == 3) {
            return new bip1();
        }
        if (i2 == 4) {
            return new xhp1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(bip1.class);
    }

    public final int x() {
        return this.zza;
    }

    public final win1 y() {
        return this.zzd;
    }

    public final int z() {
        return this.zzd.size();
    }
}
