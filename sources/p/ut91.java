package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ut91 implements o6w0 {
    public final dg30 a;
    public final vox0 b;
    public final w7q0 c;
    public final z4q0 d;
    public final v1q0 e;
    public final y4q0 f;
    public final gw70 g;
    public final i8h1 h;
    public final l6h1 i;
    public final kr91 j;
    public final q8n k;

    public ut91(q8n q8nVar, dg30 dg30Var, gw70 gw70Var, v1q0 v1q0Var, y4q0 y4q0Var, z4q0 z4q0Var, w7q0 w7q0Var, vox0 vox0Var, kr91 kr91Var, l6h1 l6h1Var, i8h1 i8h1Var) {
        this.a = dg30Var;
        this.b = vox0Var;
        this.c = w7q0Var;
        this.d = z4q0Var;
        this.e = v1q0Var;
        this.f = y4q0Var;
        this.g = gw70Var;
        this.h = i8h1Var;
        this.i = l6h1Var;
        this.j = kr91Var;
        this.k = q8nVar;
    }

    @Override // p.o6w0
    public final r4j0 a(Context context) {
        return new tt91(this.k, this.a, this.g, this.e, this.f, this.d, this.c, this.b, this.j, this.i, this.h);
    }
}
