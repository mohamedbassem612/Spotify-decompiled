package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uu0 {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;

    public uu0(int[] iArr, int[] iArr2, c4z c4zVar) {
        Integer numValueOf;
        this.b = c4zVar;
        this.c = iArr;
        this.d = new err0(h(iArr));
        this.e = iArr2;
        this.f = new err0(i(iArr, iArr2));
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i = iArr[0];
            int i2 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i3 = iArr[i2];
                    i = i > i3 ? i3 : i;
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            numValueOf = Integer.valueOf(i);
        }
        this.h = new ksb0(numValueOf != null ? numValueOf.intValue() : 0, 90, 200);
    }

    public static final /* synthetic */ lzn0 f(uu0 uu0Var) {
        return (lzn0) uu0Var.b;
    }

    public static int h(int[] iArr) {
        int i = Integer.MAX_VALUE;
        for (int i2 : iArr) {
            if (i2 <= 0) {
                return 0;
            }
            if (i > i2) {
                i = i2;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    public static int i(int[] iArr, int[] iArr2) {
        int iH = h(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == iH) {
                iMin = Math.min(iMin, iArr2[i]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    public static ObjectAnimator k(uu0 uu0Var, float f, long j, tu0 tu0Var, tu0 tu0Var2, int i) {
        if ((i & 4) != 0) {
            tu0Var = null;
        }
        if ((i & 8) != 0) {
            tu0Var2 = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) uu0Var.f, "alpha", f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.setInterpolator(hlv.c);
        objectAnimatorOfFloat.addListener(new su0(tu0Var, tu0Var2, (byte) 0));
        return objectAnimatorOfFloat;
    }

    public static AnimatorSet l(uu0 uu0Var, float f, long j, tu0 tu0Var, tu0 tu0Var2, int i) {
        if ((i & 4) != 0) {
            tu0Var = null;
        }
        if ((i & 8) != 0) {
            tu0Var2 = null;
        }
        View view = (View) uu0Var.c;
        View view2 = (View) uu0Var.f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(hlv.c);
        animatorSet.playTogether(ObjectAnimator.ofFloat(view2, "alpha", f), ObjectAnimator.ofFloat(view, "alpha", f));
        animatorSet.addListener(new su0(tu0Var, tu0Var2, (byte) 1));
        return animatorSet;
    }

    public void a(v260 v260Var, b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-625801643);
        byte b2 = 2;
        int i2 = (x340Var.i(v260Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarG = rwq.g((any) this.d, new cxc0(), (o8n) null, x340Var, 0, 2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(z6x.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarG2 = rwq.g((ry50) this.g, Boolean.FALSE, (o8n) null, x340Var, 48, 2);
            boolean zI = x340Var.i(this) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            lnm lnmVar = null;
            if (zI || objT2 == m4cVar) {
                objT2 = new x060(this, ven0Var, lnmVar, b2);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            b = 0;
            j2i j2iVarR = apo.r(95051866, new uuy(ven0Var, this, linkedHashSet, v260Var, ven0VarG, ven0VarG2, (byte) 7), x340Var);
            if (this.a) {
                x340Var.i0(-99910498);
                j2iVarR.invoke(x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(1197779308);
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), fraVar, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                ktd.s(j2iVarR, x340Var, 6, true, false);
            }
            ((wmy) this.b).t(o5b0.Z, linkedHashSet);
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w260(this, v260Var, i, b);
        }
    }

    public void b(ne91 ne91Var, boolean z, cxc0 cxc0Var, v260 v260Var, b0k b0kVar, int i) {
        uu0 uu0Var = this;
        ne91 ne91Var2 = ne91Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-820308267);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(ne91Var2) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(cxc0Var) ? 256 : 128) | (x340Var.i(v260Var) ? 2048 : 1024) | (x340Var.i(uu0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z) {
                x340Var.i0(-1638969234);
                qim0 qim0VarB = h2c.a.b(nim0Var);
                boolean z3 = (i2 & 7168) == 2048 || x340Var.i(v260Var);
                Object objT = x340Var.T();
                if (z3 || objT == m4cVar) {
                    objT = new x260(v260Var, (byte) 0);
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0VarB, (iu30) objT);
                uwr uwrVar = cbx.a;
                t1c.a(dug.f(qim0VarC, ((vex) zex.a.e).c, er31.a(50)), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1638656909);
                x340Var.r(false);
            }
            boolean z4 = (i2 & 7168) == 2048 || x340Var.i(v260Var);
            Object objT2 = x340Var.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new x260(v260Var, (byte) 1);
                x340Var.s0(objT2);
            }
            qim0 qim0VarC2 = i541.C(nim0Var, (iu30) objT2);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarC2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uu0Var = this;
            ne91Var2 = ne91Var;
            uu0Var.c(ne91Var2, cxc0Var, x340Var, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 >> 6) & 896));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(uu0Var, ne91Var2, z, cxc0Var, v260Var, i, (byte) 18);
        }
    }

    public void c(ne91 ne91Var, cxc0 cxc0Var, b0k b0kVar, int i) {
        cxc0 cxc0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1336567574);
        int i2 = (x340Var.i(ne91Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            cxc0Var2 = cxc0Var;
            i2 |= x340Var.i(cxc0Var2) ? 32 : 16;
        } else {
            cxc0Var2 = cxc0Var;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            i1o1.d(ne91Var.a, cxc0Var2, (rzq) ((wmy) this.b).d, goa0.a, (qim0) null, apo.r(-579330727, new iv50(ne91Var, (byte) 1), x340Var), apo.r(780741120, new jv50(ne91Var, (byte) 1), x340Var), 0, (xu30) null, x340Var, (i2 & 112) | 1769472, 200);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c7e(this, ne91Var, cxc0Var, i, (byte) 1);
        }
    }

    public void d(v260 v260Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2075284278);
        int i2 = (x340Var.i(v260Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new y260(this, (byte) 1);
                x340Var.s0(objT);
            }
            dgo1.c("element_header_trailing_actions", (iu30) objT, apo.r(-1224915334, new w260(this, v260Var), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w260(this, v260Var, i, (byte) 2);
        }
    }

    public void e(ne91 ne91Var, cxc0 cxc0Var, v260 v260Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1755957278);
        int i2 = (x340Var.i(ne91Var) ? 4 : 2) | i | (x340Var.i(cxc0Var) ? 32 : 16) | (x340Var.i(v260Var) ? 256 : 128) | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256 || x340Var.i(v260Var);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new x260(v260Var, (byte) 2);
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(nim0.a, (iu30) objT);
            boolean z2 = i3 == 256 || x340Var.i(v260Var);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new gn50(v260Var, (byte) 7);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = j9k1.x(qim0VarC, (xu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            c(ne91Var, cxc0Var, x340Var, (i2 & 126) | ((i2 >> 3) & 896));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, this, ne91Var, cxc0Var, v260Var, (byte) 28);
        }
    }

    public void j() {
        xab1 xab1Var = (xab1) this.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.h = null;
        ((k9r) this.e).n();
    }

    public mmr0 m(x360 x360Var) {
        if (x360Var instanceof hvl1) {
            return new mmr0((w460) ((idd1) this.g).getValue(), tho1.v((hvl1) x360Var));
        }
        if (x360Var instanceof jzg1) {
            return new mmr0((xpw) ((idd1) this.h).getValue(), tho1.y((jzg1) x360Var));
        }
        if (!(x360Var instanceof mhq0)) {
            return null;
        }
        thq0 thq0Var = (thq0) ((idd1) this.f).getValue();
        mhq0 mhq0Var = (mhq0) x360Var;
        lay layVar = mhq0Var.c;
        return new mmr0(thq0Var, new rhq0(layVar.a, null, layVar.b, mhq0Var.a, 50));
    }

    public void n(String str, String str2) {
        t45 t45Var = null;
        t45 t45Var2 = (t45) ((AtomicReference) this.f).getAndSet(null);
        if (t45Var2 != null) {
            t45Var2.g("loading");
            t45Var2.a("outcome", str);
            if (str2 != null) {
                t45Var2.b("reason", str2);
            }
            ((tif1) this.h).f((String) this.d, "creator_page");
            t45Var = t45Var2;
        }
        if (t45Var != null) {
            ((zle1) this.b).b(t45Var.e());
        }
    }

    public Integer o(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.g).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        uu0 uu0Var = (uu0) this.e;
        if (uu0Var != null) {
            return uu0Var.o(i);
        }
        return null;
    }

    public void p() {
        this.a = false;
        ru0 ru0Var = (ru0) this.h;
        if (ru0Var == null || !ru0Var.a) {
            l(this, 0.0f, 300L, null, new tu0(this, (byte) 3), 4).start();
        } else {
            k(this, 0.0f, 300L, null, new tu0(this, (byte) 2), 4).start();
        }
    }

    public void q(flb0 flb0Var) {
        wp20 wp20Var = (wp20) this.g;
        if (wp20Var == null || flb0Var != ((flb0) this.h) || wp20Var.a()) {
            this.h = flb0Var;
            af5 af5Var = (af5) this.b;
            lee1 lee1VarF = z6p1.F((lee1) this.c, flb0Var);
            wp20Var = new wp20((List) this.f, af5Var, (wat) this.d, (f930) this.e, lee1VarF, this.a);
        }
        this.g = wp20Var;
    }

    public void r() {
        String str = (String) this.d;
        ((iac0) this.c).getLifecycle().a(new ct6(this, (byte) 13));
        boolean z = ((AtomicInteger) this.g).incrementAndGet() == 1;
        t45 t45VarA = ((zle1) this.b).a(str);
        t45.m(t45VarA, "loading", 4);
        t45VarA.a("first_load", String.valueOf(z));
        tif1.a((tif1) this.h, str, "creator_page", 4);
        ((AtomicReference) this.f).set(t45VarA);
    }

    public void s(boolean z) {
        View view = (View) this.c;
        ((View) this.f).setVisibility(z ? 0 : 8);
        view.setVisibility(z ? 0 : 8);
        view.setAlpha(z ? 1.0f : 0.0f);
    }

    public void t(boolean z) {
        if (this.a) {
            return;
        }
        View view = (View) this.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        if (z) {
            fjg1.a(constraintLayout, (jhg1) null);
        }
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        kilVar.g(view.getId(), 4, ((View) this.f).getId(), 3);
        kilVar.b(constraintLayout);
        long j = z ? 200L : 0L;
        ru0 ru0Var = (ru0) this.h;
        if (ru0Var == null || !ru0Var.a) {
            l(this, 1.0f, j, new tu0(this, (byte) 1), null, 8).start();
        } else {
            k(this, 1.0f, j, new tu0(this, (byte) 0), null, 8).start();
        }
    }

    public void u() {
        View view = (View) this.g;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
        fjg1.a(constraintLayout, (jhg1) null);
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        int visibility = view.getVisibility();
        View view2 = (View) this.e;
        if (visibility == 0) {
            kilVar.g(view2.getId(), 4, view.getId(), 3);
        } else {
            kilVar.g(view2.getId(), 4, constraintLayout.getId(), 4);
        }
        kilVar.b(constraintLayout);
    }

    public uu0 v(List list) {
        uu0 uu0Var = new uu0((zjn0) this.b, (l141) this.c, (y3j1) this.d, this.a, this, (List) this.f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wgy0 wgy0Var = (wgy0) it.next();
            ((LinkedHashMap) uu0Var.g).put(Integer.valueOf(wgy0Var.e), Integer.valueOf(wgy0Var.d));
        }
        return uu0Var;
    }

    public uu0(zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, boolean z, uu0 uu0Var, List list) {
        this.b = zjn0Var;
        this.c = l141Var;
        this.d = y3j1Var;
        this.a = z;
        this.e = uu0Var;
        this.f = list;
        this.g = new LinkedHashMap();
        zjj0.a.getClass();
        this.h = yjj0.a();
    }

    public uu0(zle1 zle1Var, iac0 iac0Var, String str, String str2) {
        xco0 xco0Var;
        this.b = zle1Var;
        this.c = iac0Var;
        this.d = str;
        this.e = str2;
        this.f = new AtomicReference(null);
        this.g = new AtomicInteger(0);
        if (!ihc1.h0("profile", "release", false)) {
            xco0Var = xco0.a;
        } else {
            xco0Var = e95.a;
        }
        this.h = xco0Var;
    }

    public uu0(g0l g0lVar, gur gurVar, iur iurVar, k9r k9rVar, eur eurVar, q8n q8nVar) {
        this.b = g0lVar;
        this.c = gurVar;
        this.d = iurVar;
        this.e = k9rVar;
        this.f = eurVar;
        this.g = q8nVar;
    }

    public uu0(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5) {
        this.b = constraintLayout;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
        this.g = view5;
        this.a = true;
    }

    public /* synthetic */ uu0(zjn0 zjn0Var, l141 l141Var, y3j1 y3j1Var, boolean z, List list, int i) {
        this(zjn0Var, l141Var, y3j1Var, z, (uu0) null, (i & 32) != 0 ? z6x.a : list);
    }

    public uu0(xfx xfxVar, gw70 gw70Var, agc0 agc0Var, lzn0 lzn0Var, boolean z) {
        this.b = lzn0Var;
        this.c = xfxVar;
        this.d = agc0Var;
        this.e = gw70Var;
        this.a = z;
        this.f = new idd1(new oh51(this, (byte) 0));
        this.g = new idd1(new l5v0(this, (byte) 13));
        this.h = new idd1(new oh51(this, (byte) 1));
    }

    public uu0(Context context, z98 z98Var, ycm ycmVar, uw0 uw0Var, d7p d7pVar, d7p d7pVar2, jjv0 jjv0Var, d771 d771Var, rt01 rt01Var, p6r0 p6r0Var, boolean z, boolean z2) {
        this.b = z98Var;
        this.c = ycmVar;
        this.d = d7pVar;
        this.e = d7pVar2;
        this.f = jjv0Var;
        this.g = d771Var;
        this.h = rt01Var;
        this.a = z2;
    }

    public uu0(String str, yqg yqgVar, di4 di4Var, boolean z, lmw lmwVar, o551 o551Var, pob pobVar, uny unyVar, psc pscVar) {
        this.b = str;
        this.c = yqgVar;
        this.d = di4Var;
        this.a = z;
        this.e = lmwVar;
        this.f = o551Var;
        this.g = unyVar;
        this.h = pscVar;
    }

    public uu0(koc0 koc0Var, ArrayList arrayList, wmy wmyVar, mr20 mr20Var, jus jusVar, r6h1 r6h1Var) {
        this.b = wmyVar;
        this.c = r6h1Var;
        this.d = ((roc0) koc0Var).d();
        this.e = ujo1.w(arrayList);
        this.f = ujo1.v(arrayList);
        this.g = new ry50(mr20Var, (byte) 2);
        this.a = jusVar.a();
        this.h = gio1.b(Boolean.valueOf(arrayList.isEmpty()));
    }

    public uu0(c4n0 c4n0Var, js6 js6Var, ywc0 ywc0Var, i4q i4qVar, ywp ywpVar, ywp ywpVar2, em6 em6Var, boolean z) {
        this.b = c4n0Var;
        this.c = js6Var;
        this.d = ywc0Var;
        this.e = ywpVar;
        this.f = ywpVar2;
        this.g = em6Var;
        this.a = z;
        this.h = new idd1(new bsc0(i4qVar, this, (byte) 1));
    }

    public uu0(List list, af5 af5Var, wat watVar, f930 f930Var, lee1 lee1Var, boolean z) {
        this.b = af5Var;
        this.c = lee1Var;
        this.a = z;
        this.d = watVar;
        this.e = f930Var;
        this.f = list;
    }
}
