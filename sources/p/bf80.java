package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bf80 implements o6w0 {
    public final w7q0 a;
    public final y4q0 b;
    public final v1q0 c;
    public final rd80 d;

    public bf80(w7q0 w7q0Var, y4q0 y4q0Var, v1q0 v1q0Var, rd80 rd80Var) {
        this.a = w7q0Var;
        this.b = y4q0Var;
        this.c = v1q0Var;
        this.d = rd80Var;
    }

    @Override // p.o6w0
    public final r4j0 a(Context context) {
        return new ef80(context, this.a, this.b, this.c, this.d);
    }
}
