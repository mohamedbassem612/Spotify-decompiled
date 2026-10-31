package p;

import android.util.TypedValue;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w0r0 implements sg30, pwn0, mmo, rsn0 {
    public final dg30 a;
    public final int b;
    public final akr c;
    public final yun0 d;
    public final hds e;
    public final yxn0 f;
    public final th30 g;
    public final ee5 h;
    public final kdn0 i;

    public w0r0(dg30 dg30Var, int i, akr akrVar, yun0 yun0Var, hds hdsVar, yxn0 yxn0Var) {
        this.a = dg30Var;
        this.b = i;
        this.c = akrVar;
        this.d = yun0Var;
        this.e = hdsVar;
        this.f = yxn0Var;
        th30 th30VarE0 = dg30Var.e0();
        this.g = th30VarE0;
        this.h = new ee5(true, 2130772008, 2130772011);
        th30VarE0.o.add(new q0r0(this));
        this.i = new kdn0();
    }

    public final void a() {
        this.d.i().clear();
    }

    public final void b(String str, zf30 zf30Var) {
        if (c() == zf30Var) {
            this.i.m(str);
        }
    }

    public final zf30 c() {
        Object next;
        Iterator it = this.g.c.u().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((zf30) next).q0()) {
                return (zf30) next;
            }
        }
        next = null;
        return (zf30) next;
    }

    public final kdn0 d() {
        return this.i;
    }

    public final void e(String str, String str2, String str3, ee5 ee5Var, zf30 zf30Var, e6w0 e6w0Var, boolean z) {
        q(str3, str2, str, ee5Var, zf30Var, e6w0Var, false);
    }

    public final void f() {
        p811 p811Var = new p811();
        p811Var.a = v0r0.b;
        if ((k() instanceof b6w0) && !j() && this.c.u.isEmpty()) {
            this.a.finish();
        } else {
            th30 th30Var = this.g;
            if (th30Var.U()) {
                return;
            }
            yun0 yun0Var = this.d;
            if (yun0Var.i().isEmpty() && yun0Var.h() == null) {
                return;
            }
            o(th30Var, "popFragment:commit", new pcp0(th30Var, this, p811Var, (byte) 13));
            o(th30Var, "popFragment:executePendingTransactions", new u0r0(th30Var, (byte) 0));
        }
        ((Function0) p811Var.a).invoke();
        n();
    }

    public final boolean g() {
        return j() || this.d.h() != null;
    }

    public final void h(zf30 zf30Var, String str, String str2, String str3, boolean z, e6w0 e6w0Var) {
        String strA;
        q(str3, str2, str, z ? this.h : null, zf30Var, e6w0Var, true);
        yun0 yun0Var = this.d;
        yun0Var.k();
        if (str == null) {
            ug30 ug30Var = zf30Var instanceof ug30 ? (ug30) zf30Var : null;
            strA = ug30Var != null ? ug30Var.A(this.a) : null;
        } else {
            strA = str;
        }
        yun0Var.b(new vun0(zf30Var, new xg30(strA, str2, str3, e6w0Var, (ee5) null)));
        this.e.a();
    }

    public final void i(String str, zf30 zf30Var, String str2, String str3, String str4, boolean z, e6w0 e6w0Var) {
        throw new UnsupportedOperationException("Haven't got around to implementing yet");
    }

    public final boolean j() {
        return this.d.e() > 0;
    }

    public final e6w0 k() {
        xg30 xg30VarA;
        xun0 xun0VarH = this.d.h();
        if (xun0VarH == null || (xg30VarA = xun0VarH.a()) == null) {
            return null;
        }
        return xg30VarA.d;
    }

    public final Observable l(zf30 zf30Var) {
        return Observable.create(new sp00(zf30Var, this.d, (Object) null, this.g, (byte) 16)).map(rh20.V0).distinctUntilChanged();
    }

    public final void m() {
        if (!(k() instanceof b6w0) || j()) {
            this.a.finish();
            return;
        }
        s0r0 s0r0Var = new s0r0(this, (byte) 0);
        akr akrVar = this.c;
        akrVar.n = s0r0Var;
        akrVar.x = new gxb(2);
        akrVar.z.add(akrVar.e.b());
        akrVar.l(5);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    public final void n() {
        xg30 xg30VarA;
        int i = this.b;
        dg30 dg30Var = this.a;
        View viewFindViewById = dg30Var.findViewById(i);
        viewFindViewById.getClass();
        boolean z = k() instanceof b6w0;
        yun0 yun0Var = this.d;
        viewFindViewById.setVisibility((z && yun0Var.m() == null) ? 8 : 0);
        e6w0 e6w0VarK = k();
        if (e6w0VarK instanceof b6w0) {
            e6w0VarK = null;
        }
        if (e6w0VarK == null) {
            xun0 xun0VarM = yun0Var.m();
            if (xun0VarM == null) {
                e6w0VarK = null;
            } else {
                zf30 zf30VarB = xun0VarM.b();
                if (zf30VarB == null || !zf30VarB.q0()) {
                    xun0VarM = null;
                }
                if (xun0VarM == null || (xg30VarA = xun0VarM.a()) == null) {
                    e6w0VarK = null;
                } else {
                    e6w0VarK = xg30VarA.d;
                }
            }
        }
        c6w0 c6w0Var = e6w0VarK instanceof c6w0 ? (c6w0) e6w0VarK : null;
        int i2 = c6w0Var != null ? c6w0Var.b : 0;
        int i3 = i2 == 0 ? -1 : r0r0.a[l1d.C(i2)];
        if (i3 == 1 || i3 == 2) {
            viewFindViewById.setBackgroundColor(0);
            return;
        }
        TypedValue typedValue = new TypedValue();
        dg30Var.getTheme().resolveAttribute(2130968768, typedValue, true);
        viewFindViewById.setBackgroundResource(typedValue.resourceId);
    }

    public final void o(th30 th30Var, String str, Function0 function0) {
        if (!th30Var.L && !th30Var.U()) {
            function0.invoke();
            return;
        }
        n57.e("Cannot perform action: " + str + " when fragment manager is in invalid state. \n\nFragmentManager={isDestroyed=" + th30Var.L + ", isStateSaved=" + th30Var.U() + "} \n\n Lifecycle={currentState=" + ((f0i) this.a).a.i.name() + "}");
    }

    public final void p() {
        this.d.k();
        this.e.a();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    public final void q(String str, String str2, String str3, ee5 ee5Var, zf30 zf30Var, e6w0 e6w0Var, boolean z) {
        Function0 kx70Var = new kx70(this, zf30Var, str3, str2, str, e6w0Var, ee5Var, (byte) 18);
        th30 th30Var = this.g;
        th30Var.getClass();
        nu9 nu9Var = new nu9(th30Var);
        boolean z2 = e6w0Var instanceof b6w0;
        akr akrVar = this.c;
        yun0 yun0Var = this.d;
        if (z2) {
            c6w0 c6w0VarK = k();
            c6w0 c6w0Var = c6w0VarK instanceof c6w0 ? c6w0VarK : null;
            if (c6w0Var != null && c6w0Var.e && yun0Var.m() == null && yun0Var.l().isEmpty()) {
                yun0Var.o(yun0Var.h());
            } else {
                yun0Var.f(nu9Var, e6w0Var, th30Var, akrVar);
            }
        } else {
            yun0Var.f(nu9Var, e6w0Var, th30Var, akrVar);
        }
        if (z2) {
            v0r0 v0r0Var = v0r0.c;
            akrVar.h(zf30Var, str, new s0r0(this, (byte) 1), kx70Var);
            kx70Var = v0r0Var;
        } else {
            if (ee5Var != null) {
                nu9Var.o(ee5Var.d, ee5Var.e, 0, 0);
            }
            nu9Var.n(this.b, zf30Var, (String) null);
            if (!z) {
                nu9Var.c(th30Var.L() == 0 ? "initial_backstack" : null);
            }
        }
        o(th30Var, "pushInternal:commit", new gyq0(nu9Var, (byte) 3));
        o(th30Var, "pushInternal:executePendingTransactions", new u0r0(th30Var, (byte) 1));
        kx70Var.invoke();
    }
}
