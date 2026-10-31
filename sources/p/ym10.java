package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class ym10 {
    public static final Map a;
    public static final Map b;

    static {
        p3v p3vVar = new p3v(250.0f);
        wmb0 wmb0Var = wmb0.a;
        mmr0 mmr0Var = new mmr0(wmb0Var, p3vVar);
        p3v p3vVar2 = new p3v(350.0f);
        wmb0 wmb0Var2 = wmb0.b;
        a = sqg0.J(new mmr0[]{mmr0Var, new mmr0(wmb0Var2, p3vVar2)});
        b = sqg0.J(new mmr0[]{new mmr0(wmb0Var, new p3v(500.0f)), new mmr0(wmb0Var2, new p3v(350.0f))});
    }
}
