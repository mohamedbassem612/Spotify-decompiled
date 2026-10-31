package p;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bvn0 implements yun0 {
    public final czn0 a;
    public xun0 d;
    public xun0 e;
    public zf30 g;
    public final ArrayDeque b = new ArrayDeque();
    public final ArrayDeque c = new ArrayDeque();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public final ek2 i = new ek2(this, (byte) 15);

    public bvn0(czn0 czn0Var) {
        this.a = czn0Var;
    }

    public static void p(xun0 xun0Var, ArrayDeque arrayDeque, th30 th30Var) {
        ti30 ti30VarJ;
        zf30 zf30VarB = xun0Var.b();
        if (zf30VarB != null) {
            if (zf30VarB.q0()) {
                try {
                    Field field = ti30.e;
                    ti30VarJ = cbp1.j(th30Var, zf30VarB);
                } catch (IllegalStateException unused) {
                    return;
                }
            } else {
                Field field2 = ti30.e;
                ti30VarJ = cbp1.k(zf30VarB);
            }
            arrayDeque.push(new q0a(ti30VarJ, xun0Var.a()));
        }
    }

    public static void s(bvn0 bvn0Var, nu9 nu9Var, boolean z, iu30 iu30Var, akr akrVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            iu30Var = htn0.c;
        }
        xun0 xun0Var = bvn0Var.d;
        if (xun0Var != null) {
            if ((xun0Var.a().d instanceof b6w0) && !z) {
                n0g0 n0g0Var = new n0g0(akrVar, (byte) 13);
                iu30Var.invoke(xun0Var);
                n0g0Var.invoke();
                bvn0Var.d = null;
                return;
            }
            zf30 zf30VarB = xun0Var.b();
            if (zf30VarB == null || !zf30VarB.q0()) {
                return;
            }
            avn0 avn0Var = new avn0(nu9Var, xun0Var, (byte) 0);
            iu30Var.invoke(xun0Var);
            avn0Var.invoke();
            bvn0Var.d = null;
        }
    }

    @Override // p.yun0
    public final void a() {
        this.c.clear();
        this.b.clear();
    }

    @Override // p.yun0
    public final void b(xun0 xun0Var) {
        this.d = xun0Var;
    }

    @Override // p.yun0
    public final xxn0 c() {
        return new xxn0(this.d, this.e, this.c, this.b);
    }

    @Override // p.yun0
    public final void d(o2q0 o2q0Var) {
        this.f.remove(o2q0Var);
        this.h.remove(o2q0Var);
    }

    @Override // p.yun0
    public final int e() {
        return this.b.size() + this.c.size() + (this.e != null ? 1 : 0);
    }

    @Override // p.yun0
    public final void f(nu9 nu9Var, e6w0 e6w0Var, th30 th30Var, akr akrVar) {
        xg30 xg30VarA;
        xun0 xun0Var = this.d;
        e6w0 e6w0Var2 = (xun0Var == null || (xg30VarA = xun0Var.a()) == null) ? null : xg30VarA.d;
        this.a.getClass();
        zig1 zig1Var = new zig1(czn0.b(e6w0Var, e6w0Var2), e6w0Var2, e6w0Var);
        int iC = l1d.C(zig1Var.c());
        if (iC == 0) {
            s(this, nu9Var, false, new d(this, th30Var, (byte) 13), akrVar, 1);
            return;
        }
        if (iC == 1) {
            this.e = this.d;
            return;
        }
        ArrayDeque arrayDeque = this.b;
        if (iC == 2) {
            if (((d6w0) zig1Var.b()).a && ((d6w0) zig1Var.a()).a) {
                s(this, nu9Var, false, new zun0(this, th30Var, (byte) 1), akrVar, 1);
                return;
            } else {
                arrayDeque.clear();
                s(this, nu9Var, false, null, akrVar, 3);
                return;
            }
        }
        if (iC != 3) {
            eg.o();
            return;
        }
        arrayDeque.clear();
        zun0 zun0Var = new zun0(this, th30Var, (byte) 0);
        xun0 xun0Var2 = this.e;
        if (xun0Var2 != null) {
            if (xun0Var2.a().d instanceof b6w0) {
                n0g0 n0g0Var = new n0g0(akrVar, (byte) 14);
                zun0Var.invoke(xun0Var2);
                n0g0Var.invoke();
                this.e = null;
            } else {
                zf30 zf30VarB = xun0Var2.b();
                if (zf30VarB != null && zf30VarB.q0()) {
                    avn0 avn0Var = new avn0(nu9Var, xun0Var2, (byte) 1);
                    zun0Var.invoke(xun0Var2);
                    avn0Var.invoke();
                    this.e = null;
                }
            }
        }
        s(this, nu9Var, false, null, akrVar, 3);
    }

    @Override // p.yun0
    public final void g(o2q0 o2q0Var) {
        this.f.add(o2q0Var);
        r(o2q0Var);
    }

    @Override // p.yun0
    public final xun0 h() {
        return this.d;
    }

    @Override // p.yun0
    public final ArrayDeque i() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // p.yun0
    public final void j(nu9 nu9Var, boolean z, akr akrVar, th30 th30Var) {
        xg30 xg30VarA;
        e6w0 e6w0Var;
        xg30 xg30VarA2;
        xg30 xg30VarA3;
        xxn0 xxn0VarC = c();
        this.a.getClass();
        xun0 xun0VarB = xxn0VarC.b();
        e6w0 e6w0Var2 = (xun0VarB == null || (xg30VarA3 = xun0VarB.a()) == null) ? null : xg30VarA3.d;
        if (!((ArrayDeque) xxn0VarC.c()).isEmpty()) {
            q0a q0aVar = (q0a) ((ArrayDeque) xxn0VarC.c()).peek();
            if (q0aVar == null || (xg30VarA2 = q0aVar.a()) == null) {
                e6w0Var = null;
            } else {
                e6w0Var = xg30VarA2.d;
            }
        } else if (xxn0VarC.d() != null) {
            e6w0Var = xxn0VarC.d().a().d;
        } else {
            q0a q0aVar2 = (q0a) ((ArrayDeque) xxn0VarC.a()).peek();
            if (q0aVar2 == null || (xg30VarA = q0aVar2.a()) == null) {
                e6w0Var = null;
            } else {
                e6w0Var = xg30VarA.d;
            }
        }
        zig1 zig1Var = new zig1(czn0.b(e6w0Var, e6w0Var2), e6w0Var2, e6w0Var);
        int iC = l1d.C(zig1Var.c());
        if (iC == 0) {
            s(this, nu9Var, z, null, akrVar, 2);
            ArrayDeque arrayDeque = this.c;
            if (arrayDeque.isEmpty()) {
                return;
            }
            this.d = ezn1.q((q0a) arrayDeque.pop(), th30Var);
            return;
        }
        if (iC == 1) {
            t8e1.o(zig1Var, "Navigation from Normal mode back to overlays is not supported. Executed transition: ");
            return;
        }
        if (iC != 2) {
            if (iC != 3) {
                eg.o();
                return;
            }
            s(this, nu9Var, z, null, akrVar, 2);
            this.d = this.e;
            this.e = null;
            return;
        }
        if (!((d6w0) zig1Var.b()).a && !(zig1Var.b() instanceof b6w0)) {
            t8e1.o(zig1Var, "Navigation from an overlay mode back to overlays is not supported. Unless Overlay mode is flagged with Overlay(addToStack = true). Executed transition: ");
            return;
        }
        s(this, nu9Var, z, null, akrVar, 2);
        ArrayDeque arrayDeque2 = this.b;
        if (arrayDeque2.isEmpty()) {
            this.d = this.e;
            this.e = null;
        } else {
            q0a q0aVar3 = (q0a) arrayDeque2.pop();
            q0aVar3.getClass();
            this.d = ezn1.q(q0aVar3, th30Var);
        }
    }

    @Override // p.yun0
    public final void k() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            r((o2q0) it.next());
        }
    }

    @Override // p.yun0
    public final ArrayDeque l() {
        return this.b;
    }

    @Override // p.yun0
    public final xun0 m() {
        return this.e;
    }

    @Override // p.yun0
    public final void n() {
        q();
        this.d = null;
        this.e = null;
        this.c.clear();
        this.b.clear();
    }

    @Override // p.yun0
    public final void o(xun0 xun0Var) {
        this.e = xun0Var;
    }

    public final void q() {
        tac0 tac0Var;
        zf30 zf30Var = this.g;
        if (zf30Var != null && (tac0Var = zf30Var.s1) != null) {
            tac0Var.d(this.i);
        }
        this.g = null;
        this.h.clear();
    }

    public final void r(o2q0 o2q0Var) {
        xun0 xun0Var = this.d;
        zf30 zf30VarB = xun0Var != null ? xun0Var.b() : null;
        xun0 xun0Var2 = this.d;
        xg30 xg30VarA = xun0Var2 != null ? xun0Var2.a() : null;
        String str = xg30VarA != null ? xg30VarA.b : null;
        if (zf30VarB == null || str == null) {
            return;
        }
        if (zf30VarB.q0()) {
            o2q0Var.b(str, zf30VarB);
            return;
        }
        if (this.g != zf30VarB) {
            q();
            this.g = zf30VarB;
            zf30VarB.s1.a(this.i);
        }
        this.h.add(o2q0Var);
    }
}
