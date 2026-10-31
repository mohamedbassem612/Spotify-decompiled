package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hip1 extends rin1 {
    private static final hip1 zze;
    private int zza;
    private win1 zzd = mjn1.e;

    static {
        hip1 hip1Var = new hip1();
        zze = hip1Var;
        rin1.m(hip1.class, hip1Var);
    }

    public static dip1 x() {
        return (dip1) zze.h();
    }

    @Override // p.rin1
    public final Object u(int i) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new njn1(zze, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzd", gip1.class});
        }
        if (i2 == 3) {
            return new hip1();
        }
        if (i2 == 4) {
            return new dip1(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            return null;
        }
        return rin1.k(hip1.class);
    }

    public final /* synthetic */ void y(int i) {
        this.zza = i;
    }

    public final void z(gip1 gip1Var) {
        win1 win1VarZzg = this.zzd;
        if (!((ohn1) win1VarZzg).a) {
            int size = win1VarZzg.size();
            win1VarZzg = win1VarZzg.zzg(size + size);
            this.zzd = win1VarZzg;
        }
        win1VarZzg.add(gip1Var);
    }
}
