package p;

import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mgl1 implements iyf0, byf0 {
    public faa0 X;
    public final igl1 a;
    public final phl1 b;
    public final ajg c;
    public final nf90 d;
    public final y75 e;
    public final s8o f;
    public final dxz0 g;
    public final ygl1 h;
    public final i2i1 i;
    public final llm t;

    public mgl1(q8n q8nVar, igl1 igl1Var, phl1 phl1Var, ajg ajgVar, nf90 nf90Var, y75 y75Var, s8o s8oVar, dxz0 dxz0Var, ygl1 ygl1Var, i2i1 i2i1Var) {
        this.a = igl1Var;
        this.b = phl1Var;
        this.c = ajgVar;
        this.d = nf90Var;
        this.e = y75Var;
        this.f = s8oVar;
        this.g = dxz0Var;
        this.h = ygl1Var;
        this.i = i2i1Var;
        this.t = l1d.x(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        kgl1 kgl1Var;
        if (onmVar instanceof kgl1) {
            kgl1Var = (kgl1) onmVar;
            int i = kgl1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgl1Var.c = i - Integer.MIN_VALUE;
            } else {
                kgl1Var = new kgl1(this, onmVar);
            }
        } else {
            kgl1Var = new kgl1(this, onmVar);
        }
        Object objC = kgl1Var.a;
        int i2 = kgl1Var.c;
        Object obj = null;
        if (i2 == 0) {
            hm5.M(objC);
            if (this.g.b() != gbl.X) {
                return null;
            }
            kgl1Var.c = 1;
            objC = this.h.c(kgl1Var);
            Object obj2 = d9n.a;
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        for (Object obj3 : (Iterable) objC) {
            omr0 omr0Var = (omr0) obj3;
            if (!omr0Var.a() && omr0Var.c()) {
                obj = obj3;
                break;
            }
        }
        return (omr0) obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ohl1 ohl1Var, lnm lnmVar) {
        lgl1 lgl1Var;
        int i;
        Object objA;
        mhl1 mhl1Var;
        if (lnmVar instanceof lgl1) {
            lgl1Var = (lgl1) lnmVar;
            int i2 = lgl1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lgl1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                lgl1Var = new lgl1(this, lnmVar);
            }
        } else {
            lgl1Var = new lgl1(this, lnmVar);
        }
        Object obj = lgl1Var.c;
        int i3 = lgl1Var.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            y75 y75Var = this.e;
            i = (y75Var.d() && y75Var.a()) ? 1 : 0;
            Logger.g(gvg.h("WearAppOnboarding: trigger received; trigger=", ohl1Var.a(), ", group=", i != 0 ? "test" : rca.b), new Object[0]);
            lgl1Var.a = ohl1Var;
            lgl1Var.b = i;
            lgl1Var.e = 1;
            objA = a(lgl1Var);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = lgl1Var.b;
        ohl1 ohl1Var2 = lgl1Var.a;
        hm5.M(obj);
        i = i4;
        ohl1Var = ohl1Var2;
        objA = obj;
        omr0 omr0Var = (omr0) objA;
        if (omr0Var != null) {
            this.i.d(omr0Var.b(), ohl1Var);
            if (i != 0) {
                lgl1Var.a = null;
                lgl1Var.b = i;
                lgl1Var.e = 2;
                if (this.f.a(lgl1Var) == d9nVar) {
                    return d9nVar;
                }
            } else {
                igl1 igl1Var = this.a;
                dma1 dma1Var = igl1Var.c;
                if (igl1Var.i.d() && !dma1Var.h(jgl1.a(), false)) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.f(jgl1.c());
                    hma1VarEdit.f(jgl1.b());
                    hma1VarEdit.a(jgl1.a(), true);
                    hma1VarEdit.g();
                }
                mhl1 mhl1Var2 = nhl1.c;
                bma1 bma1VarC = jgl1.c();
                mhl1 mhl1Var3 = nhl1.b;
                String strE = dma1Var.e(bma1VarC, mhl1Var3.d());
                boolean zJ = u890.j(strE, mhl1Var3.d());
                mhl1 mhl1Var4 = mhl1.b;
                if (zJ) {
                    mhl1Var = mhl1Var3;
                } else {
                    mhl1Var = (!u890.j(strE, mhl1Var2.d()) && u890.j(strE, mhl1Var4.d())) ? mhl1Var4 : mhl1Var2;
                }
                if (mhl1Var.equals(mhl1Var3)) {
                    igl1Var.b(new khl1(ohl1Var.a()));
                    return rih1Var;
                }
                if (mhl1Var.equals(mhl1Var4)) {
                    if (igl1Var.f.b() - dma1Var.g(jgl1.b(), 0L) > 604800000) {
                        igl1Var.b(new lhl1(ohl1Var.a()));
                        return rih1Var;
                    }
                } else if (!mhl1Var.equals(mhl1Var2)) {
                    eg.o();
                    return null;
                }
            }
        }
        return rih1Var;
    }

    @Override // p.iyf0
    public final void c() {
        if (this.b.c.c()) {
            if (!u890.j(((zym0) this.c).c(), "com.android.vending")) {
                this.d.getClass();
                return;
            }
            faa0 faa0Var = this.X;
            if (faa0Var != null) {
                faa0Var.d(null);
            }
            this.X = c921.y(this.t, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 16), 3);
        }
    }

    @Override // p.iyf0
    public final void d() {
        faa0 faa0Var = this.X;
        if (faa0Var != null) {
            faa0Var.d(null);
        }
        this.X = null;
    }

    @Override // p.iyf0
    public final void g(ViewGroup viewGroup) {
    }
}
