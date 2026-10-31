package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gw10 {
    public final bpb1 a;
    public final xe01 b;
    public final bpb1 c;
    public final bpb1 d;
    public final bpb1 e;
    public final xe01 f;
    public final bpb1 g;
    public final xe01 h;
    public final bpb1 i;
    public final xe01 j;
    public final bpb1 k;
    public final xe01 l;

    public gw10() {
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
        this.c = gio1.b((Object) null);
        Boolean bool = Boolean.FALSE;
        this.d = gio1.b(bool);
        bpb1 bpb1VarB2 = gio1.b((Object) null);
        this.e = bpb1VarB2;
        this.f = d5p1.h(bpb1VarB2);
        bpb1 bpb1VarB3 = gio1.b(0);
        this.g = bpb1VarB3;
        this.h = d5p1.h(bpb1VarB3);
        bpb1 bpb1VarB4 = gio1.b((Object) null);
        this.i = bpb1VarB4;
        this.j = d5p1.h(bpb1VarB4);
        bpb1 bpb1VarB5 = gio1.b(bool);
        this.k = bpb1VarB5;
        this.l = d5p1.h(bpb1VarB5);
    }

    public final boolean a(uv10 uv10Var) {
        bpb1 bpb1Var = this.a;
        uv10 uv10Var2 = (uv10) bpb1Var.getValue();
        if (u890.j(uv10Var2, uv10Var)) {
            return true;
        }
        bpb1 bpb1Var2 = this.d;
        if (uv10Var2 == null || !((Boolean) bpb1Var2.getValue()).booleanValue()) {
            bpb1Var.m((Object) null, uv10Var);
            bpb1Var2.m((Object) null, Boolean.FALSE);
            return true;
        }
        this.e.m((Object) null, new ew10(uv10Var2, uv10Var));
        return false;
    }
}
