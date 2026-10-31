package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n4e0 {
    public final zle1 a;
    public final t45 b;
    public boolean c;
    public boolean d;

    public n4e0(zle1 zle1Var, String str, Map map) {
        this.a = zle1Var;
        t45 t45VarA = ((s45) zle1Var).a("mbs_load_root_content");
        t45VarA.h = "media-browser-service";
        this.b = t45VarA;
        t45.m(t45VarA, "loading_root", 4);
        t45.m(t45VarA, "get_root", 4);
        t45VarA.a("package_name", str);
        for (Map.Entry entry : map.entrySet()) {
            this.b.b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void a(int i, int i2) {
        if (this.d) {
            return;
        }
        this.d = true;
        t45 t45Var = this.b;
        t45Var.g("load_children");
        t45Var.a("outcome", g5d0.f(i));
        t45Var.a("source", g5d0.e(i2));
        t45Var.g("loading_root");
        this.a.b(t45Var.e());
    }

    public final void b(String str) {
        boolean z = this.c;
        t45 t45Var = this.b;
        if (z) {
            t45Var.b("duplicate_load", "true");
            return;
        }
        this.c = true;
        t45Var.b("root_id", str);
        t45.m(t45Var, "load_children", 4);
    }
}
