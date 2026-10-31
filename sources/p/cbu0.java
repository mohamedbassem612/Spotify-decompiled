package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cbu0 {
    public final wao0 a;
    public final Object b;
    public w590 c;
    public final bpb1 d;
    public final bpb1 e;

    public cbu0(wao0 wao0Var, Object obj, w590 w590Var) {
        this.a = wao0Var;
        this.b = obj;
        this.c = w590Var;
        Boolean bool = Boolean.FALSE;
        this.d = gio1.b(bool);
        this.e = gio1.b(bool);
    }

    public final w590 a() {
        return this.c;
    }

    public final bpb1 b() {
        return this.e;
    }

    public final void c() {
        bpb1 bpb1Var = this.d;
        if (((Boolean) bpb1Var.getValue()).booleanValue()) {
            return;
        }
        bpb1Var.m((Object) null, Boolean.TRUE);
        this.a.invoke(this);
        this.c = null;
    }

    public final void d(zau0 zau0Var) {
        this.e.m((Object) null, Boolean.valueOf(!zau0Var.equals(this.b)));
    }

    public final void e(zau0 zau0Var) {
        w590 w590Var;
        if (((Boolean) this.d.getValue()).booleanValue() || (w590Var = this.c) == null || !this.b.equals(zau0Var)) {
            return;
        }
        w590Var.v();
    }
}
