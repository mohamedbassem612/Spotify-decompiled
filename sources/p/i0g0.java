package p;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.spotify.mainlayout.ui.view.MainLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i0g0 {
    public final MainLayout a;
    public final y6p0 b;
    public final List c;
    public d8b1 d;
    public boolean e;
    public final ce0 f;
    public c0g0 g;
    public static final /* synthetic */ mma0[] i = {new een0(i0g0.class, "state", "getState()Lcom/spotify/mainlayout/ui/view/animation/MainLayoutNowPlayingViewAnimator$State;", 0)};
    public static final twb h = new twb((byte) 15);
    public static final d0g0 j = new d0g0(c7p0.a, true);

    public i0g0(MainLayout mainLayout) {
        this.a = mainLayout;
        zud0 zud0Var = new zud0(mainLayout, (byte) 6);
        og30 og30Var = new og30(zud0Var);
        wtn0 wtn0Var = new wtn0(zud0Var);
        y6p0 y6p0Var = new y6p0(zud0Var);
        this.b = y6p0Var;
        this.c = p7h.M(new azf0[]{og30Var, wtn0Var, y6p0Var});
        this.f = new ce0(j, this, (byte) 16);
    }

    public static void a(i0g0 i0g0Var, zyf0 zyf0Var, Float f, boolean z, int i2) {
        List list = i0g0Var.c;
        if ((i2 & 2) != 0) {
            f = null;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        d8b1 d8b1Var = i0g0Var.d;
        if (d8b1Var != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
            }
            if (d8b1Var.f) {
                d8b1Var.b(true);
            }
        }
        if (!i0g0Var.a.isLaidOut() || !z) {
            i0g0Var.g = null;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((azf0) it.next()).b(zyf0Var);
            }
            return;
        }
        ArrayList arrayListB = i0g0Var.b();
        ArrayList arrayListC = i0g0Var.c(zyf0Var);
        i0g0Var.g = null;
        if (arrayListB.equals(arrayListC)) {
            return;
        }
        Set setSingleton = Collections.singleton(zyf0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((azf0) it2.next()).d(setSingleton);
        }
        e(arrayListB);
        float fD = i0g0Var.d();
        ir20 ir20Var = new ir20((byte) 0);
        ir20Var.b = 0.0f;
        d8b1 d8b1Var2 = new d8b1(ir20Var);
        e8b1 e8b1Var = new e8b1(fD);
        e8b1Var.a();
        e8b1Var.b(1500.0f);
        d8b1Var2.m = e8b1Var;
        if (f != null) {
            fD = f.floatValue();
        }
        d8b1Var2.a = fD;
        g0g0 g0g0Var = new g0g0(d8b1Var2, i0g0Var, arrayListB, arrayListC);
        if (d8b1Var2.f) {
            hhg1.h("Error: Update listeners must be added beforethe animation.");
            return;
        }
        ArrayList arrayList = d8b1Var2.l;
        if (!arrayList.contains(g0g0Var)) {
            arrayList.add(g0g0Var);
        }
        h0g0 h0g0Var = new h0g0(i0g0Var, zyf0Var);
        ArrayList arrayList2 = d8b1Var2.k;
        if (!arrayList2.contains(h0g0Var)) {
            arrayList2.add(h0g0Var);
        }
        d8b1Var2.e();
        i0g0Var.d = d8b1Var2;
    }

    public static void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ue5 ue5Var = (ue5) it.next();
            ue5Var.a.c(ue5Var.b);
        }
    }

    public final ArrayList b() {
        c0g0 c0g0Var = this.g;
        if (c0g0Var == null) {
            List<azf0> list = this.c;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (azf0 azf0Var : list) {
                arrayList.add(new ue5(azf0Var, azf0Var.a()));
            }
            return arrayList;
        }
        int iD = d();
        Integer numValueOf = Integer.valueOf(iD);
        if (iD <= 0) {
            numValueOf = null;
        }
        return uyn1.u(c0g0Var.a, c0g0Var.b, numValueOf != null ? yoi1.o(this.b.c.getTranslationY() / numValueOf.intValue(), 0.0f, 1.0f) : 0.0f);
    }

    public final ArrayList c(zyf0 zyf0Var) {
        List<azf0> list = this.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (azf0 azf0Var : list) {
            arrayList.add(new ue5(azf0Var, azf0Var.e(zyf0Var)));
        }
        return arrayList;
    }

    public final int d() {
        y6p0 y6p0Var = this.b;
        return Math.abs(y6p0Var.g.getTop() - y6p0Var.f.getTop());
    }

    public final void f(f0g0 f0g0Var) {
        this.f.c(i[0], this, f0g0Var);
    }
}
