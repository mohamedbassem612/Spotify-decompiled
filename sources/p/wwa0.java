package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwa0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n830 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwa0(n830 n830Var, byte b) {
        super(0);
        this.a = b;
        this.b = n830Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n830 n830Var = this.b;
        switch (b) {
            case 0:
                n830Var.b = true;
                n830Var.e();
                break;
            default:
                xjn0 xjn0Var = (xjn0) n830Var.e;
                i8h1 i8h1Var = xjn0Var.a;
                x6h1 x6h1VarC = xjn0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("support_site_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
        return rih1Var;
    }
}
