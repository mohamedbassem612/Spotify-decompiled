package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vvc1 {
    public final yqg a;
    public final gg11 b;
    public final Single c;
    public final nfa0 d;
    public final idd1 e = new idd1(new fjc1(this, (byte) 6));

    public vvc1(yqg yqgVar, gg11 gg11Var, Single single, nfa0 nfa0Var) {
        this.a = yqgVar;
        this.b = gg11Var;
        this.c = single;
        this.d = nfa0Var;
    }

    public final ros0 a() {
        ros0 m231Var;
        String strE = ((dma1) this.e.getValue()).e(wvc1.a(), null);
        if (strE == null) {
            return new ros0();
        }
        try {
            m231Var = (ros0) this.d.a(strE, ros0.Companion.serializer());
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        ros0 ros0Var = m231Var instanceof m231 ? null : m231Var;
        return ros0Var == null ? new ros0() : ros0Var;
    }
}
