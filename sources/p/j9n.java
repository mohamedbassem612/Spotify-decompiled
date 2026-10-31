package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j9n implements wgn {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ j9n(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final List a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Collections.singletonList(new efn(a860.k(((fo80) ((xb00) obj).r.getValue()).a().getBytes(nne.a), d860.e)));
            case 1:
                Function0 function0 = (Function0) ((mjv) obj).b;
                String str = function0 != null ? (String) function0.invoke() : null;
                return p7h.N(str != null ? new bfn(str) : null);
            case 2:
                Context context = (Context) obj;
                return p7h.M(new ugn[]{new jgn(upn1.n(context)), new sfn(String.valueOf(yoi1.A(context.getResources().getConfiguration()).b(0)))});
            default:
                zym0 zym0Var = (ajg) obj;
                String strC = zym0Var.c();
                if (strC == null || strC.length() == 0) {
                    strC = "no-installer-package";
                }
                return p7h.M(new ugn[]{new ifn(strC), new ign((String) zym0Var.e.getValue())});
        }
    }
}
