package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class vfg1 extends xfg1 {
    public final yfg1 c;
    public agg1 d;

    public vfg1(float f, float f2, yfg1 yfg1Var) {
        super(f, f2);
        this.c = yfg1Var;
        agg1 agg1Var = new agg1();
        agg1Var.b = new ArrayList();
        this.d = agg1Var;
        agg1Var.a = 1;
    }

    public final wfg1 a(float f) {
        cti1 cti1Var = new cti1(this.a, this.b, f);
        this.d.b.add(cti1Var);
        this.a = 1.0f;
        this.b = f;
        agg1 agg1Var = this.d;
        wfg1 wfg1Var = new wfg1(1.0f, f, this.c);
        wfg1Var.d = agg1Var;
        wfg1Var.f = this;
        wfg1Var.e = cti1Var;
        return wfg1Var;
    }
}
