package p;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u4r {
    public final String a;
    public final e761 b;
    public final ze3 c;
    public final iu30 d;
    public final c9n e;
    public final Object f = new Object();
    public volatile h191 g;

    public u4r(String str, e761 e761Var, ze3 ze3Var, iu30 iu30Var, c9n c9nVar) {
        this.a = str;
        this.b = e761Var;
        this.c = ze3Var;
        this.d = iu30Var;
        this.e = c9nVar;
    }

    public final Object a(Object obj, mma0 mma0Var) {
        h191 h191Var;
        Context context = (Context) obj;
        h191 h191Var2 = this.g;
        if (h191Var2 != null) {
            return h191Var2;
        }
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    Context applicationContext = context.getApplicationContext();
                    e761 e761Var = this.b;
                    ze3 ze3Var = this.c;
                    List list = (List) this.d.invoke(applicationContext);
                    this.g = new h191(new sqm((Object) applicationContext, (Object) this, (byte) 17), e761Var, Collections.singletonList(new vdd(list, null, (byte) 1)), ze3Var, this.e);
                }
                h191Var = this.g;
                h191Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return h191Var;
    }
}
