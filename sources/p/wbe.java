package p;

import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wbe extends j660 {
    public float n0;
    public final HashMap o0;
    public final HashMap p0;
    public final HashMap q0;
    public HashMap r0;
    public HashMap s0;
    public qlb1 t0;

    public wbe(ynb1 ynb1Var, int i) {
        super(ynb1Var, i);
        this.n0 = 0.5f;
        this.o0 = new HashMap();
        this.p0 = new HashMap();
        this.q0 = new HashMap();
        this.t0 = qlb1.a;
    }

    public final void a0(float f) {
        this.n0 = f;
    }

    public final float b0(String str) {
        HashMap map = this.s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.s0.get(str)).floatValue();
    }

    public final float c0(String str) {
        HashMap map = this.q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float d0(String str) {
        HashMap map = this.r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.r0.get(str)).floatValue();
    }

    public final float e0(String str) {
        HashMap map = this.p0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final void f0(qlb1 qlb1Var) {
        this.t0 = qlb1Var;
    }
}
