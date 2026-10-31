package p;

import android.app.Activity;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jdo0 implements a6c1 {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public jdo0(Activity activity, List list, Uri uri, String str, String str2, iy61 iy61Var, fy61 fy61Var, m551 m551Var, int i) throws NoWhenBranchMatchedException {
        x6c1 w6c1Var;
        m551Var = (i & 256) != 0 ? null : m551Var;
        this.b = activity;
        this.c = list;
        this.d = uri;
        this.e = str;
        this.f = str2;
        this.g = iy61Var;
        this.h = fy61Var;
        this.i = m551Var;
        Iterator it = list.iterator();
        long jMax = 0;
        while (it.hasNext()) {
            w6c1 w6c1VarB = ((vk41) it.next()).b();
            if (w6c1VarB instanceof x6c1) {
                w6c1Var = x6c1.c;
                this.k = w6c1Var;
            } else {
                if (!(w6c1VarB instanceof w6c1)) {
                    eg.o();
                    throw null;
                }
                w6c1 w6c1Var2 = w6c1VarB;
                jMax = Math.max(jMax, w6c1Var2.C().toMillis(w6c1Var2.B()));
            }
        }
        w6c1Var = new w6c1(jMax, TimeUnit.MILLISECONDS);
        this.k = w6c1Var;
    }

    public static pim0 i(oim0 oim0Var, pim0 pim0Var) {
        pim0 pim0VarA;
        if (oim0Var instanceof uim0) {
            pim0VarA = ((uim0) oim0Var).a();
            pim0VarA.c = odo0.f(pim0VarA);
        } else {
            t0a t0aVar = new t0a();
            t0aVar.c = odo0.d(oim0Var);
            t0aVar.O0 = oim0Var;
            t0aVar.Q0 = new HashSet();
            pim0VarA = t0aVar;
        }
        if (pim0VarA.N0) {
            qf80.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        pim0VarA.i = true;
        pim0 pim0Var2 = pim0Var.f;
        if (pim0Var2 != null) {
            pim0Var2.e = pim0VarA;
            pim0VarA.f = pim0Var2;
        }
        pim0Var.f = pim0VarA;
        pim0VarA.e = pim0Var;
        return pim0VarA;
    }

    public static pim0 j(pim0 pim0Var) {
        boolean z = pim0Var.N0;
        if (z) {
            sdn0 sdn0Var = odo0.a;
            if (!z) {
                qf80.c("autoInvalidateRemovedNode called on unattached node");
            }
            odo0.a(pim0Var, -1, 2);
            pim0Var.E1();
            pim0Var.y1();
        }
        pim0 pim0Var2 = pim0Var.f;
        pim0 pim0Var3 = pim0Var.e;
        if (pim0Var2 != null) {
            pim0Var2.e = pim0Var3;
            pim0Var.f = null;
        }
        if (pim0Var3 != null) {
            pim0Var3.f = pim0Var2;
            pim0Var.e = null;
        }
        pim0Var3.getClass();
        return pim0Var3;
    }

    public static void p(oim0 oim0Var, oim0 oim0Var2, pim0 pim0Var) {
        if ((oim0Var instanceof uim0) && (oim0Var2 instanceof uim0)) {
            y4o1.r((uim0) oim0Var2, pim0Var);
            if (pim0Var.N0) {
                odo0.c(pim0Var);
                return;
            } else {
                pim0Var.t = true;
                return;
            }
        }
        if (!(pim0Var instanceof t0a)) {
            qf80.c("Unknown Modifier.Node type");
            return;
        }
        t0a t0aVar = (t0a) pim0Var;
        if (t0aVar.N0) {
            t0aVar.I1();
        }
        t0aVar.O0 = oim0Var2;
        t0aVar.c = odo0.d(oim0Var2);
        if (t0aVar.N0) {
            t0aVar.H1(false);
        }
        if (pim0Var.N0) {
            odo0.c(pim0Var);
        } else {
            pim0Var.t = true;
        }
    }

    @Override // p.a6c1
    public void a() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).e();
        }
    }

    @Override // p.a6c1
    public String b() {
        return (String) this.e;
    }

    @Override // p.a6c1
    public fy61 c() {
        return (fy61) this.h;
    }

    @Override // p.a6c1
    public void d() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).f();
        }
    }

    @Override // p.a6c1
    public void dispose() {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).a();
        }
        this.j = null;
    }

    @Override // p.a6c1
    public View e(rmr rmrVar, q881 q881Var) {
        this.j = rmrVar;
        ConstraintLayout constraintLayout = new ConstraintLayout((Activity) this.b);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(0);
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).c(constraintLayout, rmrVar, q881Var);
        }
        return constraintLayout;
    }

    @Override // p.a6c1
    public String f() {
        return (String) this.f;
    }

    @Override // p.a6c1
    public void g(u6c1 u6c1Var) {
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).d(u6c1Var);
        }
    }

    @Override // p.a6c1
    public oho1 getDuration() {
        return (oho1) this.k;
    }

    @Override // p.a6c1
    public iy61 h() {
        return (iy61) this.g;
    }

    public boolean k(int i) {
        return (((pim0) this.g).d & i) != 0;
    }

    public void l(pim0 pim0Var, ndo0 ndo0Var) {
        for (pim0 pim0Var2 = pim0Var.e; pim0Var2 != null; pim0Var2 = pim0Var2.e) {
            if (pim0Var2 == ((ido0) this.c)) {
                hmb0 hmb0VarV = ((hmb0) this.b).v();
                ndo0Var.Y0 = hmb0VarV != null ? (sh80) hmb0VarV.e1.d : null;
                this.e = ndo0Var;
                return;
            } else {
                if ((pim0Var2.c & 2) != 0) {
                    return;
                }
                pim0Var2.G1(ndo0Var);
            }
        }
    }

    public void m() {
        for (pim0 pim0Var = (pim0) this.g; pim0Var != null; pim0Var = pim0Var.f) {
            pim0Var.D1();
            if (pim0Var.i) {
                sdn0 sdn0Var = odo0.a;
                if (!pim0Var.N0) {
                    qf80.c("autoInvalidateInsertedNode called on unattached node");
                }
                odo0.a(pim0Var, -1, 1);
            }
            if (pim0Var.t) {
                odo0.c(pim0Var);
            }
            pim0Var.i = false;
            pim0Var.t = false;
        }
    }

    public void n(int i, wdn0 wdn0Var, wdn0 wdn0Var2, pim0 pim0Var, boolean z) {
        jdo0 jdo0Var;
        int i2;
        wdn0 wdn0Var3;
        wdn0 wdn0Var4;
        xen0 xen0Var = (xen0) this.k;
        if (xen0Var == null) {
            jdo0Var = this;
            i2 = i;
            wdn0Var3 = wdn0Var;
            wdn0Var4 = wdn0Var2;
            xen0 xen0Var2 = new xen0(jdo0Var, pim0Var, i2, wdn0Var3, wdn0Var4, z);
            jdo0Var.k = xen0Var2;
            xen0Var = xen0Var2;
        } else {
            jdo0Var = this;
            i2 = i;
            wdn0Var3 = wdn0Var;
            wdn0Var4 = wdn0Var2;
            xen0Var.j(pim0Var);
            xen0Var.k(i2);
            xen0Var.h(wdn0Var3);
            xen0Var.g(wdn0Var4);
            xen0Var.l(z);
        }
        jdo0Var.k = null;
        fj30.z(wdn0Var3.b - i2, wdn0Var4.b - i2, xen0Var);
        jdo0Var.k = xen0Var;
        int i3 = 0;
        for (pim0 pim0Var2 = ((gpd1) jdo0Var.f).e; pim0Var2 != null && pim0Var2 != ((ido0) jdo0Var.c); pim0Var2 = pim0Var2.e) {
            i3 |= pim0Var2.c;
            pim0Var2.d = i3;
        }
    }

    public void o() {
        cmb0 cmb0Var;
        mxq0 mxq0Var;
        hmb0 hmb0Var = (hmb0) this.b;
        ndo0 ndo0Var = (sh80) this.d;
        for (pim0 pim0Var = ((gpd1) this.f).e; pim0Var != null; pim0Var = pim0Var.e) {
            zlb0 zlb0VarH = oap1.h(pim0Var);
            if (zlb0VarH != null) {
                ndo0 ndo0Var2 = pim0Var.h;
                if (ndo0Var2 != null) {
                    cmb0Var = (cmb0) ndo0Var2;
                    zlb0 zlb0Var = cmb0Var.E1;
                    cmb0Var.Q1(zlb0VarH);
                    if (zlb0Var != pim0Var && (mxq0Var = cmb0Var.v1) != null) {
                        ((ge50) mxq0Var).c();
                    }
                } else {
                    cmb0Var = new cmb0(hmb0Var, zlb0VarH);
                    pim0Var.G1(cmb0Var);
                }
                ndo0Var.Y0 = cmb0Var;
                cmb0Var.X0 = ndo0Var;
                ndo0Var = cmb0Var;
            } else {
                pim0Var.G1(ndo0Var);
            }
        }
        hmb0 hmb0VarV = hmb0Var.v();
        ndo0Var.Y0 = hmb0VarV != null ? (sh80) hmb0VarV.e1.d : null;
        this.e = ndo0Var;
    }

    @Override // p.a6c1
    public void start() {
        rmr rmrVar = (rmr) this.j;
        if (rmrVar != null) {
            Uri uri = (Uri) this.d;
            if (uri != null) {
                rmrVar.d(uri, true);
            } else {
                rmrVar.f();
            }
        }
        Iterator it = ((List) this.c).iterator();
        while (it.hasNext()) {
            ((vk41) it.next()).g();
        }
        Function0 function0 = (Function0) this.i;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("[");
                pim0 pim0Var = (pim0) this.g;
                gpd1 gpd1Var = (gpd1) this.f;
                if (pim0Var == gpd1Var) {
                    sb.append("]");
                } else {
                    while (pim0Var != null && pim0Var != gpd1Var) {
                        sb.append(String.valueOf(pim0Var));
                        if (pim0Var.f == gpd1Var) {
                            sb.append("]");
                        } else {
                            sb.append(",");
                            pim0Var = pim0Var.f;
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public jdo0(hmb0 hmb0Var) {
        this.b = hmb0Var;
        ido0 ido0Var = new ido0((byte) 0);
        ido0Var.d = -1;
        this.c = ido0Var;
        sh80 sh80Var = new sh80(hmb0Var);
        this.d = sh80Var;
        this.e = sh80Var;
        gpd1 gpd1Var = sh80Var.E1;
        this.f = gpd1Var;
        this.g = gpd1Var;
        this.h = new wdn0();
    }
}
