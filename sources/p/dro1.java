package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dro1 extends iao1 {
    private static final dro1 zzb;
    private int zzd;
    private umo1 zze;
    private long zzf;

    static {
        dro1 dro1Var = new dro1();
        zzb = dro1Var;
        iao1.f(dro1.class, dro1Var);
    }

    public static xqo1 q() {
        return (xqo1) zzb.k();
    }

    public static /* synthetic */ void r(dro1 dro1Var, umo1 umo1Var) {
        dro1Var.zze = umo1Var;
        dro1Var.zzd |= 1;
    }

    public static /* synthetic */ void s(dro1 dro1Var, long j) {
        dro1Var.zzd |= 2;
        dro1Var.zzf = j;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new dro1();
        }
        if (i2 == 4) {
            return new xqo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
