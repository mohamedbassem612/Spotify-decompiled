package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yr41 implements txq0 {
    public final int a;
    public final List b;
    public Float c = null;
    public Float d = null;
    public pq41 e = null;
    public pq41 f = null;

    public yr41(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean B0() {
        return this.b.contains(this);
    }

    public final void a(pq41 pq41Var) {
        this.e = pq41Var;
    }

    public final void b(pq41 pq41Var) {
        this.f = pq41Var;
    }
}
