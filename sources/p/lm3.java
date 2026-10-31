package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lm3 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ om3 b;

    public /* synthetic */ lm3(om3 om3Var, byte b) {
        this.a = b;
        this.b = om3Var;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                hu3 hu3Var = this.b.d;
                LinkedHashMap linkedHashMap = hu3Var.b;
                t45 t45VarA = hu3Var.a.a("allboarding_post");
                t45VarA.h = "android-libs-allboarding";
                t45.m(t45VarA, "allboarding_post", 4);
                linkedHashMap.put("allboarding_post", t45VarA);
                break;
            default:
                hu3 hu3Var2 = this.b.d;
                LinkedHashMap linkedHashMap2 = hu3Var2.b;
                t45 t45VarA2 = hu3Var2.a.a("allboarding_initial_load");
                t45VarA2.h = "android-libs-allboarding";
                t45.m(t45VarA2, "allboarding_initial_load", 4);
                linkedHashMap2.put("allboarding_initial_load", t45VarA2);
                break;
        }
    }
}
