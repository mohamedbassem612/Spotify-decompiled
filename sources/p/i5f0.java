package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5f0 extends pim0 implements m7v {
    public final idn0 O0;
    public final o95 P0 = c97.b(1.0f);

    public i5f0(idn0 idn0Var) {
        this.O0 = idn0Var;
    }

    public final void t0(lsl lslVar) {
        float fFloatValue = ((Number) this.P0.e()).floatValue();
        long jG1 = lslVar.g1();
        cab cabVarA1 = lslVar.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).t(fFloatValue, fFloatValue, jG1);
            lslVar.s1();
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    public final void z1() {
        fn31.T(v1(), (o8n) null, 0, new p6d0((Object) this, (lnm) null, (byte) 19), 3);
    }
}
