package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vf01 {
    public final zy70 a;
    public final List b;
    public final int c;
    public final zy70 d;
    public final k291 e;
    public final va00 f;
    public final boolean g;

    public vf01(zy70 zy70Var, List list, int i, zy70 zy70Var2, k291 k291Var, va00 va00Var, boolean z) {
        this.a = zy70Var;
        this.b = list;
        this.c = i;
        this.d = zy70Var2;
        this.e = k291Var;
        this.f = va00Var;
        this.g = z;
    }

    public static vf01 b(vf01 vf01Var, int i, zy70 zy70Var, int i2) {
        if ((i2 & 1) != 0) {
            i = vf01Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            zy70Var = vf01Var.d;
        }
        k291 k291Var = vf01Var.e;
        return new vf01(vf01Var.a, vf01Var.b, i3, zy70Var, k291Var, vf01Var.f, vf01Var.g);
    }

    public final void a(zy70 zy70Var, q090 q090Var) {
        Context context = zy70Var.a;
        zy70 zy70Var2 = this.a;
        if (context != zy70Var2.a) {
            jah.h("Interceptor '", q090Var, "' cannot modify the request's context.");
            return;
        }
        if (zy70Var.b == eep0.a) {
            jah.h("Interceptor '", q090Var, "' cannot set the request's data to null.");
        } else if (zy70Var.c != zy70Var2.c) {
            jah.h("Interceptor '", q090Var, "' cannot modify the request's target.");
        } else {
            if (zy70Var.f156p == zy70Var2.f156p) {
                return;
            }
            jah.h("Interceptor '", q090Var, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        tf01 tf01Var;
        q090 q090Var;
        if (onmVar instanceof tf01) {
            tf01Var = (tf01) onmVar;
            int i = tf01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tf01Var.d = i - Integer.MIN_VALUE;
            } else {
                tf01Var = new tf01(this, onmVar);
            }
        } else {
            tf01Var = new tf01(this, onmVar);
        }
        Object obj = tf01Var.b;
        int i2 = tf01Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            List list = this.b;
            int i3 = this.c;
            q090 q090Var2 = (q090) list.get(i3);
            vf01 vf01VarB = b(this, i3 + 1, null, 6);
            tf01Var.a = q090Var2;
            tf01Var.d = 1;
            Object objA = q090Var2.a(vf01VarB, tf01Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            q090Var = q090Var2;
            obj = objA;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q090Var = tf01Var.a;
            hm5.M(obj);
        }
        iz70 iz70Var = (iz70) obj;
        a(iz70Var.getRequest(), q090Var);
        return iz70Var;
    }
}
