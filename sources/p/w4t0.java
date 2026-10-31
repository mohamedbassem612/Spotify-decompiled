package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w4t0 extends x7e0 implements b031 {
    public final bpb1 N0;
    public yf20 O0;
    public String P0;
    public final bpb1 X;
    public final j0d1 Y;
    public final llm Z;
    public final p1f0 d;
    public final zhq0 e;
    public final ve20 f;
    public final bpb1 g;
    public final bpb1 h;
    public final p1f0 i;
    public final bpb1 t;

    public w4t0(p1f0 p1f0Var, zhq0 zhq0Var, q8n q8nVar, ve20 ve20Var) {
        this.d = p1f0Var;
        this.e = zhq0Var;
        this.f = ve20Var;
        bpb1 bpb1VarB = gio1.b(new b5t0(null));
        this.g = bpb1VarB;
        this.h = bpb1VarB;
        this.i = p1f0Var;
        bpb1 bpb1VarB2 = gio1.b(zic1.a);
        this.t = bpb1VarB2;
        this.X = bpb1VarB2;
        j0d1 j0d1VarB = guo1.B();
        this.Y = j0d1VarB;
        this.Z = smo1.e(ha71.A(j0d1VarB, q8nVar));
        this.N0 = gio1.b(z6x.a);
    }

    @Override // p.b031
    public final void a(Bundle bundle) {
        this.f.b(bundle.getString("filter_state"));
        this.P0 = bundle.getString("currently_loaded_category");
        this.O0 = (yf20) bundle.getParcelable("filter_section");
    }

    @Override // p.x7e0
    public final void e() {
        this.d.A(this.N0);
        c921.y(this.Z, (o8n) null, 0, new i2p0(this, (lnm) null, (byte) 21), 3);
    }

    @Override // p.x7e0
    public final void f() {
        op71.s(this.Y);
        this.d.u();
    }

    @Override // p.b031
    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        bundle.putString("filter_state", (String) this.f.a().getValue());
        bundle.putString("currently_loaded_category", this.P0);
        bundle.putParcelable("filter_section", this.O0);
        return bundle;
    }
}
