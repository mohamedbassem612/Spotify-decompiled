package p;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fpr implements a4l {
    public final ynb0 a;
    public final ynb0 b;
    public final jo20 c;
    public final q8n d;
    public c9n e;
    public final bpb1 f;
    public final bpb1 g;
    public final xe01 h;
    public final xe01 i;

    public fpr(ynb0 ynb0Var, ynb0 ynb0Var2, jo20 jo20Var, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = jo20Var;
        this.d = q8nVar;
        this.e = cy30.t(q8nVar);
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.f = bpb1VarB;
        bpb1 bpb1VarB2 = gio1.b(z6x.a);
        this.g = bpb1VarB2;
        this.h = d5p1.h(bpb1VarB);
        this.i = d5p1.h(bpb1VarB2);
    }

    @Override // p.a4l
    public final void a() {
        if (this.c.isEnabled()) {
            smo1.q(this.e);
        }
    }

    @Override // p.a4l
    public final void b() {
        if (this.c.isEnabled()) {
            c9n c9nVarV = qmo1.v(this.e, new d4e(this, (byte) 14));
            this.e = c9nVarV;
            c921.y(c9nVarV, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 14), 3);
        }
    }

    public final void c(boolean z, a8l a8lVar) {
        a8lVar.toString();
        bpb1 bpb1Var = this.g;
        ArrayList arrayList = new ArrayList((Collection) bpb1Var.getValue());
        if (z) {
            arrayList.remove(a8lVar);
            arrayList.add(0, a8lVar);
        } else {
            arrayList.remove(a8lVar);
        }
        bpb1Var.m((Object) null, arrayList);
    }
}
