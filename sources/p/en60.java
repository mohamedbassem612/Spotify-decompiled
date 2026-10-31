package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class en60 {
    public final String a;
    public final Map b;
    public final Map c;

    public en60(String str) {
        this.a = str;
        mmr0 mmr0Var = new mmr0(Float.valueOf(0.95f), ym60.e);
        Float fValueOf = Float.valueOf(0.5f);
        this.b = sqg0.J(new mmr0[]{mmr0Var, new mmr0(fValueOf, zm60.e), new mmr0(Float.valueOf(0.01f), bn60.e)});
        this.c = sqg0.J(new mmr0[]{new mmr0(fValueOf, an60.e), new mmr0(Float.valueOf(0.05f), cn60.e)});
    }
}
