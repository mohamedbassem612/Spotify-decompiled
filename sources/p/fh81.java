package p;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fh81 extends m8v implements fr91 {
    public final bh81 A1;
    public final ph81 i1;
    public final far0 j1;
    public final kly0 k1;
    public final be0 l1;
    public final bh81 m1;
    public final bpb1 n1;
    public final xe01 o1;
    public final bpb1 p1;
    public final xe01 q1;
    public final bpb1 r1;
    public final xe01 s1;
    public final mr20 t1;
    public e5l0 u1;
    public final FrameLayout v1;
    public final FrameLayout w1;
    public final CoordinatorLayout x1;
    public boolean y1;
    public boolean z1;
    public static final /* synthetic */ mma0[] C1 = {new een0(fh81.class, "contentView", "getContentView()Landroid/view/View;", 0), new een0(fh81.class, "mainLayoutConfig", "getMainLayoutConfig()Lcom/spotify/mainlayout/contenttypes/sidedrawer/SideDrawerMainLayoutConfig;", 0), new een0(fh81.class, "drawerState", "getDrawerState()I", 0)};
    public static final mta B1 = new mta((byte) 25);

    /* JADX WARN: Multi-variable type inference failed */
    public fh81(dg30 dg30Var, ph81 ph81Var, far0 far0Var, thq thqVar) {
        super(dg30Var);
        this.i1 = ph81Var;
        this.j1 = far0Var;
        this.k1 = thqVar;
        this.l1 = new be0(this, (byte) 2);
        this.m1 = new bh81(this, (byte) 1);
        Boolean bool = Boolean.FALSE;
        bpb1 bpb1VarB = gio1.b(bool);
        this.n1 = bpb1VarB;
        this.o1 = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b(bool);
        this.p1 = bpb1VarB2;
        this.q1 = d5p1.h(bpb1VarB2);
        bpb1 bpb1VarB3 = gio1.b(bool);
        this.r1 = bpb1VarB3;
        this.s1 = d5p1.h(bpb1VarB3);
        this.t1 = rqt0.u(hu20.e(rqt0.u(new nev0(d5p1.h(((f0i) dg30Var).a.j), (byte) 5)), new af01((lnm) null, this, (byte) 20)));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup.LayoutParams j8vVar = new j8v();
        ((j8v) j8vVar).a = 8388611;
        frameLayout.setLayoutParams(j8vVar);
        frameLayout.setBackgroundColor(-16777216);
        ks21 ks21Var = new ks21(this, (byte) 21);
        WeakHashMap weakHashMap = b8k1.a;
        r7k1.c(frameLayout, ks21Var);
        this.v1 = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout2.setBackgroundColor(x74.D(frameLayout2.getContext(), 2131103929));
        frameLayout2.setClipToOutline(true);
        this.w1 = frameLayout2;
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext());
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setClickable(false);
        this.x1 = coordinatorLayout;
        this.y1 = true;
        this.A1 = new bh81(this, (byte) 2);
        setLayoutParams(new j8v());
        frameLayout.addView(frameLayout2);
        frameLayout2.addView(coordinatorLayout);
        addView(frameLayout);
        setScrimColor(-1291845632);
        ah81 ah81Var = new ah81(this);
        ArrayList arrayList = ((m8v) this).V0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((m8v) this).V0 = arrayList;
        }
        arrayList.add(ah81Var);
        c921.y(cto1.q(dg30Var), (o8n) null, 0, new vse0(this, (lnm) null, (byte) 19), 3);
        c921.y(cto1.q(dg30Var), (o8n) null, 0, new b751(this, (lnm) null, (byte) 19), 3);
        c921.y(cto1.q(dg30Var), (o8n) null, 0, new ch81(this, null), 3);
    }

    private final int getDrawerState() {
        mma0 mma0Var = C1[2];
        return ((Number) this.A1.a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawerState(int i) {
        this.A1.c(C1[2], this, Integer.valueOf(i));
    }

    public static void w(fh81 fh81Var) {
        View viewD = fh81Var.d(8388611);
        fh81Var.v(viewD != null ? m8v.j(viewD) : false ? 1.0f : 0.0f);
    }

    public final View getContentView() {
        mma0 mma0Var = C1[0];
        return (View) this.l1.a;
    }

    public final th81 getMainLayoutConfig() {
        mma0 mma0Var = C1[1];
        return (th81) this.m1.a;
    }

    @Override // p.fr91
    public CoordinatorLayout getSnackbarContainer() {
        if (!((Boolean) this.p1.getValue()).booleanValue() || this.z1) {
            return null;
        }
        return this.x1;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y1 = true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (this.z1 && getDrawerState() == 2) || super.onInterceptTouchEvent(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.y1) {
            this.y1 = false;
            w(this);
            View viewD = d(8388611);
            Boolean boolValueOf = Boolean.valueOf(viewD != null ? m8v.j(viewD) : false);
            bpb1 bpb1Var = this.n1;
            bpb1Var.getClass();
            bpb1Var.m(null, boolValueOf);
            x();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z1 && getDrawerState() == 2) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void setContentView(View view) {
        this.l1.c(C1[0], this, view);
    }

    public void setIsOverlapped(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        bpb1 bpb1Var = this.r1;
        bpb1Var.getClass();
        bpb1Var.m(null, boolValueOf);
        this.v1.setImportantForAccessibility(z ? 4 : 1);
    }

    public final void setMainLayoutConfig(th81 th81Var) {
        this.m1.c(C1[1], this, th81Var);
    }

    public final void t() {
        View viewD = d(8388611);
        if (viewD != null ? m8v.j(viewD) : false) {
            this.z1 = true;
            View viewD2 = d(8388611);
            if (viewD2 != null) {
                b(viewD2);
            } else {
                tw20.t(m8v.h(8388611), "No drawer view found with gravity ");
            }
        }
    }

    public final void u(boolean z) {
        if (!z) {
            this.z1 = false;
            Boolean bool = Boolean.TRUE;
            bpb1 bpb1Var = this.p1;
            bpb1Var.getClass();
            bpb1Var.m(null, bool);
        }
        View viewD = d(8388611);
        if (viewD != null) {
            m(viewD, z);
        } else {
            tw20.t(m8v.h(8388611), "No drawer view found with gravity ");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(float f) {
        float fR;
        View contentView = getContentView();
        if (contentView != null) {
            th81 mainLayoutConfig = getMainLayoutConfig();
            int i = mainLayoutConfig != null ? mainLayoutConfig.a : 0;
            int i2 = i == 0 ? -1 : dh81.a[l1d.C(i)];
            if (i2 == -1 || i2 == 1) {
                fR = 0.0f;
            } else {
                if (i2 != 2) {
                    eg.o();
                    return;
                }
                fR = mta.r(B1, this.v1.getWidth() * f, getLayoutDirection() == 1);
            }
            contentView.setTranslationX(fR);
        }
    }

    public final void x() {
        Set setSingleton;
        View viewD = d(8388611);
        boolean z = true;
        if (!(viewD != null ? m8v.l(viewD) : false) && getDrawerState() != 1 && getDrawerState() != 2) {
            z = false;
        }
        bpb1 bpb1Var = this.p1;
        if (((Boolean) bpb1Var.getValue()).booleanValue() != z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            bpb1Var.getClass();
            bpb1Var.m(null, boolValueOf);
        }
        if (z) {
            FrameLayout frameLayout = this.w1;
            d7 d7Var = new d7(frameLayout, (byte) 8);
            if (d7Var.hasNext()) {
                Object next = d7Var.next();
                if (d7Var.hasNext()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(next);
                    while (d7Var.hasNext()) {
                        linkedHashSet.add(d7Var.next());
                    }
                    setSingleton = linkedHashSet;
                } else {
                    setSingleton = Collections.singleton(next);
                }
            } else {
                setSingleton = w7x.a;
            }
            if (dm61.u0(this.x1, setSingleton).isEmpty()) {
                frameLayout.addView((View) ((mg81) this.k1.get()).a(this), 0);
            }
        }
    }

    public final void y() {
        if (!((Boolean) this.p1.getValue()).booleanValue() || ((Boolean) this.r1.getValue()).booleanValue()) {
            e5l0 e5l0Var = this.u1;
            if (e5l0Var != null) {
                e5l0Var.i();
            }
            this.u1 = null;
            return;
        }
        if (this.u1 == null) {
            far0 far0Var = this.j1;
            far0Var.b(1);
            this.u1 = new e5l0(far0Var, (byte) 18);
        }
    }
}
