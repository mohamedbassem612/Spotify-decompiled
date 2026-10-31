package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hu3 {
    public final zle1 a;
    public final LinkedHashMap b = new LinkedHashMap();

    public hu3(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public final void a(ti tiVar) {
        tiVar.toString();
        LinkedHashMap linkedHashMap = this.b;
        t45 t45Var = (t45) linkedHashMap.get("allboarding_initial_load");
        if (t45Var != null) {
            t45Var.g("allboarding_initial_load");
            t45Var.a("outcome", tiVar.a);
            this.a.b(t45Var.e());
        }
        linkedHashMap.remove("allboarding_initial_load");
    }

    public final void b(String str, ti tiVar) {
        tiVar.toString();
        String strConcat = "allboarding_load_more_".concat(str);
        LinkedHashMap linkedHashMap = this.b;
        t45 t45Var = (t45) linkedHashMap.get(strConcat);
        if (t45Var != null) {
            t45Var.g("allboarding_load_more");
            t45Var.a("outcome", tiVar.a);
            this.a.b(t45Var.e());
        }
        linkedHashMap.remove("allboarding_load_more_".concat(str));
    }

    public final void c(ti tiVar) {
        tiVar.toString();
        LinkedHashMap linkedHashMap = this.b;
        t45 t45Var = (t45) linkedHashMap.get("allboarding_post");
        if (t45Var != null) {
            t45Var.g("allboarding_post");
            t45Var.a("outcome", tiVar.a);
            this.a.b(t45Var.e());
        }
        linkedHashMap.remove("allboarding_post");
    }
}
