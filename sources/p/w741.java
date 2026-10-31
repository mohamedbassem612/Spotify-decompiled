package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w741 {
    public static final String[] b = {"api_server_url", "auth_server_url"};
    public final Context a;

    public w741(Context context) {
        this.a = context.getApplicationContext();
    }

    public static Intent b(String str) {
        Intent intent = new Intent(str);
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(a930 a930Var, onm onmVar) {
        nj4 nj4Var;
        if (onmVar instanceof nj4) {
            nj4Var = (nj4) onmVar;
            int i = nj4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nj4Var.d = i - Integer.MIN_VALUE;
            } else {
                nj4Var = new nj4(this, onmVar);
            }
        } else {
            nj4Var = new nj4(this, onmVar);
        }
        Object objK = nj4Var.b;
        int i2 = nj4Var.d;
        Context context = this.a;
        if (i2 == 0) {
            hm5.M(objK);
            if (a930Var instanceof dj4) {
                nj4Var.d = 1;
                bya0.a();
                throw null;
            }
            if (!(a930Var instanceof yw21)) {
                hhg1.g(a930Var, "Unknown font type: ");
                return null;
            }
            yw21 yw21Var = (yw21) a930Var;
            nj4Var.a = yw21Var;
            nj4Var.d = 2;
            objK = vpb1.k(yw21Var, context, nj4Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 == 1) {
                hm5.M(objK);
                return objK;
            }
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a930Var = nj4Var.a;
            hm5.M(objK);
        }
        return vyo1.A((Typeface) objK, ((yw21) a930Var).c(), context);
    }

    public Typeface c(a930 a930Var) {
        Object m231Var;
        Typeface typefaceJ;
        boolean z = a930Var instanceof dj4;
        Context context = this.a;
        if (z) {
            return bya0.b(context, (dj4) a930Var);
        }
        if (a930Var instanceof yw21) {
            yw21 yw21Var = (yw21) a930Var;
            if (p8p1.q(0, 0)) {
                typefaceJ = vpb1.j(yw21Var, context);
            } else if (p8p1.q(0, 1)) {
                try {
                    m231Var = vpb1.j((yw21) a930Var, context);
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                typefaceJ = (Typeface) (m231Var instanceof m231 ? null : m231Var);
            } else {
                if (p8p1.q(0, 2)) {
                    hhg1.h("Unsupported Async font load path");
                    return null;
                }
                hhg1.n("Unknown loading type ".concat(p8p1.F(0)));
            }
            return vyo1.A(typefaceJ, yw21Var.c(), context);
        }
        return null;
    }
}
