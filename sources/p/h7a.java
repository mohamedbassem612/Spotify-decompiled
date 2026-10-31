package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h7a implements o6w0 {
    public final dg30 a;
    public final y6a b;
    public final l4q c;
    public final gw70 d;
    public final y4q0 e;
    public final w7q0 f;
    public final v1q0 g;
    public final q8n h;

    public h7a(y6a y6aVar, q8n q8nVar, l4q l4qVar, dg30 dg30Var, gw70 gw70Var, v1q0 v1q0Var, y4q0 y4q0Var, w7q0 w7q0Var) {
        this.a = dg30Var;
        this.b = y6aVar;
        this.c = l4qVar;
        this.d = gw70Var;
        this.e = y4q0Var;
        this.f = w7q0Var;
        this.g = v1q0Var;
        this.h = q8nVar;
    }

    @Override // p.o6w0
    public final r4j0 a(Context context) {
        return new g7a(this.b, this.h, this.c, this.a, this.d, this.g, this.e, this.f);
    }
}
