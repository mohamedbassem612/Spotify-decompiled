package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gzv implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0w b;
    public final /* synthetic */ lzn0 c;

    public /* synthetic */ gzv(r0w r0wVar, lzn0 lzn0Var, byte b) {
        this.a = b;
        this.b = r0wVar;
        this.c = lzn0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        lzn0 lzn0Var = this.c;
        b7x b7xVar = b7x.a;
        r0w r0wVar = this.b;
        switch (b) {
            case 0:
                ryv ryvVar = (ryv) obj;
                Set set = s4b1.f;
                String strZ = uic.x("spotify:edit:profile:bio").z();
                if (strZ != null) {
                    i8h1 i8h1Var = r0wVar.a;
                    x6h1 x6h1VarC = r0wVar.b.b.c();
                    x6h1VarC.i.add(new a7h1("user_biography_text", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    Bundle bundle = new Bundle();
                    String str = ryvVar.c;
                    if (str == null) {
                        str = "";
                    }
                    bundle.putString("extra_bio", str);
                    lzn0Var.a(strZ, tv80VarM, bundle);
                }
                break;
            default:
                syv syvVar = (syv) obj;
                lrz0 lrz0Var = syvVar.d;
                i8h1 i8h1Var2 = r0wVar.a;
                x6h1 x6h1VarC2 = r0wVar.b.b.c();
                x6h1VarC2.i.add(new a7h1("user_social_handle_text", knl0.a(1), (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                tv80 tv80VarM2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                Set set2 = s4b1.f;
                String strZ2 = uic.x("spotify:edit:profile:social-handle").z();
                if (strZ2 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("extra_social_handle", syvVar.c);
                    bundle2.putInt("extra_rate_limit_max_changes", lrz0Var.a);
                    bundle2.putInt("extra_rate_limit_window_days", lrz0Var.b);
                    lzn0Var.a(strZ2, tv80VarM2, bundle2);
                }
                break;
        }
    }
}
