package p;

import com.spotify.adsinternal.adscore.model.Format;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z0x implements b1x {
    public final gw70 a;
    public final o290 b;
    public final ao0 c;

    public z0x(gw70 gw70Var, o290 o290Var, ao0 ao0Var) {
        this.a = gw70Var;
        this.b = o290Var;
        this.c = ao0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ji0 ji0Var, lnm lnmVar) {
        y0x y0xVar;
        m231 m231Var;
        if (lnmVar instanceof y0x) {
            y0xVar = (y0x) lnmVar;
            int i = y0xVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                y0xVar.d = i - os00.INVALID_ID;
            } else {
                y0xVar = new y0x(this, (onm) lnmVar);
            }
        } else {
            y0xVar = new y0x(this, (onm) lnmVar);
        }
        Object obj = y0xVar.b;
        int i2 = y0xVar.d;
        m231 m231Var2 = rih1.a;
        int i3 = 1;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String strR = ila0.r(ji0Var.g.a);
                if (strR == null || strR.length() == 0) {
                    i3 = 3;
                } else {
                    CompletableCreate completableCreateO = this.a.f(strR).o();
                    y0xVar.a = ji0Var;
                    y0xVar.d = 1;
                    Object objI = fc11.i(completableCreateO, y0xVar);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                }
                m231 m231Var3 = new m231(new IllegalStateException("Display Ad Failed to Prerender"));
                ao0.a(this.c, co0.i, ji0Var.a, (Long) null, kk0.e(i3), (String) null, 116);
                return m231Var3;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ji0Var = y0xVar.a;
            hm5.M(obj);
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null && (thA instanceof CancellationException)) {
            throw thA;
        }
        if (!(m231Var instanceof m231)) {
            return m231Var2;
        }
        m231 m231Var4 = new m231(new IllegalStateException("Display Ad Failed to Prerender"));
        ao0.a(this.c, co0.i, ji0Var.a, (Long) null, kk0.e(i3), (String) null, 116);
        return m231Var4;
    }

    public final boolean b(ji0 ji0Var) {
        return ji0Var.Z == Format.BANNER;
    }

    public final xu30 c() {
        return new oat(this, (byte) 25);
    }

    public final boolean d() {
        return true;
    }
}
