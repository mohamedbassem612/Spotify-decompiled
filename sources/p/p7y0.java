package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p7y0 implements anc0 {
    public final Context a;
    public final u9c0 b;
    public final koc0 c;
    public final a1r0 d;
    public final uro0 e;
    public final dto0 f;
    public final qnv0 g;
    public final e7y0 h;
    public xab1 i;

    public p7y0(Context context, u9c0 u9c0Var, koc0 koc0Var, a1r0 a1r0Var, uro0 uro0Var, dto0 dto0Var, qnv0 qnv0Var, e7y0 e7y0Var) {
        this.a = context;
        this.b = u9c0Var;
        this.c = koc0Var;
        this.d = a1r0Var;
        this.e = uro0Var;
        this.f = dto0Var;
        this.g = qnv0Var;
        this.h = e7y0Var;
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        o7y0 o7y0Var;
        boolean z;
        Throwable th;
        boolean z2;
        Boolean m231Var;
        if (onmVar instanceof o7y0) {
            o7y0Var = (o7y0) onmVar;
            int i = o7y0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7y0Var.e = i - Integer.MIN_VALUE;
            } else {
                o7y0Var = new o7y0(this, onmVar);
            }
        } else {
            o7y0Var = new o7y0(this, onmVar);
        }
        Object obj = o7y0Var.c;
        int i2 = o7y0Var.e;
        boolean z3 = false;
        if (i2 == 0) {
            hm5.M(obj);
            boolean zH = this.e.a.h(uro0.b, false);
            boolean zG = this.f.a.g(this.a);
            try {
                Single singleC = this.g.c(mmq0.g, 3, str);
                o7y0Var.a = zH;
                o7y0Var.b = zG;
                o7y0Var.e = 1;
                Object objJ = fc11.j(singleC, o7y0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
                z = zH;
                obj = objJ;
                z2 = zG;
            } catch (Throwable th2) {
                z = zH;
                th = th2;
                z2 = zG;
                m231Var = new m231(th);
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = o7y0Var.b;
            z = o7y0Var.a;
            try {
                hm5.M(obj);
            } catch (Throwable th3) {
                th = th3;
                m231Var = new m231(th);
            }
        }
        m231Var = Boolean.valueOf(((rmq0) obj).a);
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.t("Failed to get notification opt-in state", thA);
        }
        Boolean bool = Boolean.TRUE;
        if (m231Var instanceof m231) {
            m231Var = bool;
        }
        boolean z4 = (z2 && m231Var.booleanValue()) ? false : true;
        if (!z && z4) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // p.anc0
    public final void n() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.i = fn31.T(this.b, (o8n) null, 0, new ian0(this, (lnm) null, (byte) 19), 3);
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.i;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }
}
