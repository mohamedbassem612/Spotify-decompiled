package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x6z implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ k9 c;

    public /* synthetic */ x6z(String str, k9 k9Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = k9Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        k9 k9Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                uv00 uv00Var = (uv00) obj;
                ez00 ez00Var = uv00Var.a(mdz.class, str).b;
                if (ez00Var != null) {
                    return k9Var.h1(ez00Var);
                }
                swg0.h(l1d.t("Missing metadata for Uri: ", str, ". Response cacheStatus: "), bb00.u(uv00Var.a(mdz.class, str).c.b), ".");
                return null;
            default:
                uv00 uv00Var2 = (uv00) obj;
                ez00 ez00Var2 = uv00Var2.a(z1g1.class, str).b;
                if (ez00Var2 != null) {
                    return k9Var.h1(ez00Var2);
                }
                swg0.h(l1d.t("Missing metadata for Uri: ", str, ". Response cacheStatus: "), bb00.u(uv00Var2.a(z1g1.class, str).c.b), ".");
                return null;
        }
    }
}
