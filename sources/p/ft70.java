package p;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ft70 extends x7e0 {
    public final uwh d;
    public final uu00 e;
    public final lt70 f;
    public final llm g;
    public List h = z6x.a;
    public String i = "";

    public ft70(uwh uwhVar, uu00 uu00Var, lt70 lt70Var, q8n q8nVar) {
        this.d = uwhVar;
        this.e = uu00Var;
        this.f = lt70Var;
        this.g = i3a.k(q8nVar);
    }

    public final void e() {
        if (!this.h.isEmpty()) {
            i();
            return;
        }
        j();
        fn31.T(this.g, (o8n) null, 0, new a38(this, (lnm) null), 3);
    }

    public final void f() {
        smo1.p(this.g, (CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, onm onmVar) {
        dt70 dt70Var;
        if (onmVar instanceof dt70) {
            dt70Var = (dt70) onmVar;
            int i = dt70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dt70Var.c = i - Integer.MIN_VALUE;
            } else {
                dt70Var = new dt70(this, onmVar);
            }
        } else {
            dt70Var = new dt70(this, onmVar);
        }
        Object objT = dt70Var.a;
        int i2 = dt70Var.c;
        if (i2 == 0) {
            hm5.M(objT);
            dt70Var.c = 1;
            objT = blo1.t(this.e, str, mdz.class, dt70Var);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        mdz mdzVar = (mdz) objT;
        if (mdzVar != null) {
            return mdzVar.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, onm onmVar) {
        et70 et70Var;
        if (onmVar instanceof et70) {
            et70Var = (et70) onmVar;
            int i = et70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                et70Var.c = i - Integer.MIN_VALUE;
            } else {
                et70Var = new et70(this, onmVar);
            }
        } else {
            et70Var = new et70(this, onmVar);
        }
        Object objT = et70Var.a;
        int i2 = et70Var.c;
        if (i2 == 0) {
            hm5.M(objT);
            et70Var.c = 1;
            objT = blo1.t(this.e, str, va81.class, et70Var);
            d9n d9nVar = d9n.a;
            if (objT == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objT);
        }
        va81 va81Var = (va81) objT;
        if (va81Var != null) {
            return va81Var.b;
        }
        return null;
    }

    public final Object m(String str, a38 a38Var) {
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        int iOrdinal = blc0Var.ordinal();
        if (iOrdinal == 844) {
            return k(str, a38Var);
        }
        if (iOrdinal == 860) {
            return l(str, a38Var);
        }
        h(new Throwable("Invalid uri type: " + blc0Var));
        return "";
    }
}
