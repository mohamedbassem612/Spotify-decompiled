package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dno1 extends iao1 {
    private static final dno1 zzb;

    static {
        dno1 dno1Var = new dno1();
        zzb = dno1Var;
        iao1.f(dno1.class, dno1Var);
    }

    public static dno1 q() {
        return zzb;
    }

    @Override // p.iao1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ogo1(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new dno1();
        }
        if (i2 == 4) {
            return new ymo1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
