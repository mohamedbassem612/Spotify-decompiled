package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vep1 extends cip1 {
    private static final vep1 zzl;
    private int zzb;
    private int zzd;
    private int zze;
    private lip1 zzf;
    private lip1 zzg;
    private int zzh;
    private jip1 zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        vep1 vep1Var = new vep1();
        zzl = vep1Var;
        cip1.h(vep1.class, vep1Var);
    }

    public vep1() {
        rjp1 rjp1Var = rjp1.e;
        this.zzf = rjp1Var;
        this.zzg = rjp1Var;
        this.zzi = eip1.e;
    }

    @Override // p.cip1
    public final Object j(int i, cip1 cip1Var) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            jcx0 jcx0Var = jcx0.b1;
            return new tjp1(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006ࠬ\u0007ဇ\u0003\bဇ\u0004", new Object[]{"zzb", "zzd", jcx0Var, "zze", kcx0.b1, "zzf", b7p1.class, "zzg", b7p1.class, "zzh", kcx0.a1, "zzi", jcx0Var, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new vep1();
        }
        if (i2 == 4) {
            return new sdp1(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }
}
