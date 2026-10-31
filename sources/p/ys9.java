package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ys9 {
    public final np9 a;
    public final c21 b;
    public final zs9 c;
    public final ot9 d;
    public final ufc e;
    public final q8n f;
    public final xe01 g;
    public final bpb1 h;
    public final xe01 i;
    public final bpb1 j;
    public final xe01 k;
    public llm l;

    public ys9(np9 np9Var, c21 c21Var, zs9 zs9Var, ot9 ot9Var, ufc ufcVar, q8n q8nVar) {
        this.a = np9Var;
        this.b = c21Var;
        this.c = zs9Var;
        this.d = ot9Var;
        this.e = ufcVar;
        this.f = q8nVar;
        this.g = np9Var.j;
        bpb1 bpb1VarB = gio1.b(Float.valueOf(1.0f));
        this.h = bpb1VarB;
        this.i = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b(Boolean.TRUE);
        this.j = bpb1VarB2;
        this.k = d5p1.h(bpb1VarB2);
    }

    public final void a(float f) {
        np9 np9Var = this.a;
        np9Var.getClass();
        float fO = yoi1.o(f, 0.0f, 1.0f);
        np9Var.g.m((Object) null, Float.valueOf(fO));
        fdc fdcVar = np9Var.d;
        if (fdcVar != null) {
            float fO2 = yoi1.o(fO, 0.0f, 1.0f);
            if (fdcVar.b) {
                return;
            }
            uoa uoaVar = ((w590) fdcVar.d).g;
            uoaVar.getClass();
            float fO3 = yoi1.o(fO2, 0.0f, 1.0f);
            uoaVar.i = fO3;
            p3u0 p3u0Var = uoaVar.f;
            if (p3u0Var != null) {
                p3u0Var.X0(fO3);
            }
        }
    }

    public final void b(float f) {
        this.h.m((Object) null, Float.valueOf(yoi1.o(f, 0.0f, 1.0f)));
    }

    public final void c(boolean z) {
        this.j.m((Object) null, Boolean.valueOf(this.e.a() && z));
    }
}
