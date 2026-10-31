package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t64 implements Function {
    public final /* synthetic */ byte a = 2;
    public final m210 b;
    public final g510 c;

    public t64(int i, m210 m210Var, g510 g510Var) {
        this.b = m210Var;
        this.c = g510Var;
    }

    public void a(w7h1 w7h1Var, ou80 ou80Var) {
        this.c.b(this.b, w7h1Var, ou80Var);
    }

    public Object apply(Object obj) {
        byte b = this.a;
        g510 g510Var = this.c;
        m210 m210Var = this.b;
        switch (b) {
            case 1:
                break;
        }
        return g510.q(g510Var, m210Var, (w7h1) obj);
    }

    public t64(boolean z, m210 m210Var, g510 g510Var) {
        this.b = m210Var;
        this.c = g510Var;
    }

    public t64(g510 g510Var, m210 m210Var) {
        this.c = g510Var;
        this.b = m210Var;
    }
}
