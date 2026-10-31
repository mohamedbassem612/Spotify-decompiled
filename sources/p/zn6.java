package p;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zn6 implements h0r0 {
    public final q7e0 a;
    public final eo6 b;
    public final uzo c;
    public final un6 d;
    public final t7o0 e;
    public final e2x0 f;
    public final uu00 g;
    public final cbr0 h;

    public zn6(q7e0 q7e0Var, eo6 eo6Var, uzo uzoVar, un6 un6Var, t7o0 t7o0Var, y1x0 y1x0Var, e2x0 e2x0Var, uu00 uu00Var) {
        this.a = q7e0Var;
        this.b = eo6Var;
        this.c = uzoVar;
        this.d = un6Var;
        this.e = t7o0Var;
        this.f = e2x0Var;
        this.g = uu00Var;
        yxe1 yxe1Var = new yxe1(new ehc1(eo6Var.a()));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarO0 = yon1.O0();
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.h = new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarO0, oap1.i(y1x0.c(eo6Var.b())), (nar0) null), new qod1("Artist Tour page"), u17.b, new t1r0(true), new s9h1(14, true, false, false)}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.h;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        o6e0 o6e0VarE = f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 10));
        ve3 ve3Var = new ve3(this, (byte) 29);
        n7e0 n7e0Var = new n7e0(new xn6(this), ad5.Z, o9p1.h);
        k391 k391Var = z391.X;
        return this.a.a(o6e0VarE, ve3Var, n7e0Var, new u7r0(a4p1.v(new e491[]{z391.f, z391.h, k391Var, k391Var}), null, null, false, false, 126));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        yn6 yn6Var;
        Object m231Var;
        if (onmVar instanceof yn6) {
            yn6Var = (yn6) onmVar;
            int i = yn6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yn6Var.d = i - Integer.MIN_VALUE;
            } else {
                yn6Var = new yn6(this, onmVar);
            }
        } else {
            yn6Var = new yn6(this, onmVar);
        }
        Object objJ = yn6Var.b;
        int i2 = yn6Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                eo6 eo6Var = this.b;
                if (!ihc1.y0(eo6Var.a())) {
                    return eo6Var.a();
                }
                ezc ezcVarG = yoi1.g(this.g.b(new oi("artist-concerts-page", false, new wk3(str, (byte) 11))));
                s4 s4Var = new s4((byte) 15);
                yn6Var.a = str;
                yn6Var.d = 1;
                objJ = b5p1.j(ezcVarG, s4Var, yn6Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = yn6Var.a;
                hm5.M(objJ);
            }
            jo70 jo70Var = ((uv00) objJ).a(jo70.class, str).b;
            m231Var = jo70Var != null ? jo70Var.a : null;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        String str2 = (String) (m231Var instanceof m231 ? null : m231Var);
        return str2 == null ? "" : str2;
    }
}
