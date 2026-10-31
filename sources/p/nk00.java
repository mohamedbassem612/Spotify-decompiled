package p;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nk00 implements abu0 {
    public final /* synthetic */ pk00 a;
    public final /* synthetic */ ttm0 b;
    public final /* synthetic */ abu0 c;

    public nk00(pk00 pk00Var, ttm0 ttm0Var, abu0 abu0Var) {
        this.a = pk00Var;
        this.b = ttm0Var;
        this.c = abu0Var;
    }

    public final boolean b(zau0 zau0Var) {
        return false;
    }

    public final zau0 e(String str, boolean z) {
        pk00 pk00Var = this.a;
        LinkedHashMap linkedHashMap = pk00Var.e;
        Object objC = linkedHashMap.get(str);
        ttm0 ttm0Var = this.b;
        if (objC == null) {
            objC = ttm0Var.c(z);
            linkedHashMap.put(str, objC);
        }
        zau0 zau0Var = (zau0) objC;
        if (u890.j(pk00Var.f.get(), str)) {
            ttm0Var.a(zau0Var);
        }
        return zau0Var;
    }

    public final vm70 f(Context context) {
        return this.c.f(context);
    }

    public final void a(zau0 zau0Var) {
    }
}
