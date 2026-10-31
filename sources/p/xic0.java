package p;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class xic0 extends i611 {
    public RecyclerView a;
    public Scroller b;
    public final vu91 c = new vu91(this);
    public final /* synthetic */ byte d;
    public vqq0 e;
    public uqq0 f;

    public xic0(byte b) {
        this.d = b;
    }

    public static int e(View view, dyb0 dyb0Var) {
        return ((dyb0Var.e(view) / 2) + dyb0Var.g(view)) - ((dyb0Var.n() / 2) + dyb0Var.m());
    }

    public static View g(a aVar, dyb0 dyb0Var) {
        int I = aVar.I();
        View view = null;
        if (I == 0) {
            return null;
        }
        int iN = (dyb0Var.n() / 2) + dyb0Var.m();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = aVar.H(i2);
            int iAbs = Math.abs(((dyb0Var.e(viewH) / 2) + dyb0Var.g(viewH)) - iN);
            if (iAbs < i) {
                view = viewH;
                i = iAbs;
            }
        }
        return view;
    }

    public static View h(a aVar, dyb0 dyb0Var) {
        int I = aVar.I();
        View view = null;
        if (I == 0) {
            return null;
        }
        int iN = (dyb0Var.n() / 2) + dyb0Var.m();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < I; i2++) {
            View viewH = aVar.H(i2);
            int iAbs = Math.abs(((dyb0Var.e(viewH) / 2) + dyb0Var.g(viewH)) - iN);
            if (iAbs < i) {
                view = viewH;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // p.i611
    public final boolean a(int i, int i2) {
        wic0 wic0VarD;
        int iJ;
        a layoutManager = this.a.getLayoutManager();
        if (layoutManager == null || this.a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof r611) || (wic0VarD = d(layoutManager)) == null || (iJ = j(layoutManager, i, i2)) == -1) {
            return false;
        }
        wic0VarD.a = iJ;
        layoutManager.S0(wic0VarD);
        return true;
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        vu91 vu91Var = this.c;
        if (recyclerView2 != null) {
            recyclerView2.p0(vu91Var);
            this.a.setOnFlingListener((i611) null);
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                eg.m("An instance of OnFlingListener already set.");
                return;
            }
            this.a.m(vu91Var);
            this.a.setOnFlingListener(this);
            this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
            m();
        }
    }

    public int[] c(a aVar, View view) {
        switch (this.d) {
            case 0:
                int[] iArr = new int[2];
                if (aVar.q()) {
                    dyb0 uqq0Var = this.f;
                    if (uqq0Var == null || ((a) uqq0Var.b) != aVar) {
                        uqq0Var = new uqq0(aVar);
                        this.f = uqq0Var;
                    }
                    iArr[0] = ((uqq0Var.e(view) / 2) + uqq0Var.g(view)) - ((uqq0Var.n() / 2) + uqq0Var.m());
                } else {
                    iArr[0] = 0;
                }
                if (aVar.r()) {
                    dyb0 dyb0VarK = k(aVar);
                    iArr[1] = ((dyb0VarK.e(view) / 2) + dyb0VarK.g(view)) - ((dyb0VarK.n() / 2) + dyb0VarK.m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (aVar.q()) {
                    dyb0 uqq0Var2 = this.f;
                    if (uqq0Var2 == null || ((a) uqq0Var2.b) != aVar) {
                        uqq0Var2 = new uqq0(aVar);
                        this.f = uqq0Var2;
                    }
                    iArr2[0] = e(view, uqq0Var2);
                } else {
                    iArr2[0] = 0;
                }
                if (aVar.r()) {
                    iArr2[1] = e(view, l(aVar));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    public wic0 d(a aVar) {
        switch (this.d) {
            case 1:
                if (aVar instanceof r611) {
                    return new ckr0((byte) 0, this.a.getContext(), this);
                }
                return null;
            default:
                if (aVar instanceof r611) {
                    return new ckr0((byte) 2, this.a.getContext(), this);
                }
                return null;
        }
    }

    public int f(a aVar, dyb0 dyb0Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, os00.INVALID_ID, Alert.DURATION_SHOW_INDEFINITELY, os00.INVALID_ID, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int I = aVar.I();
        float f = 1.0f;
        if (I != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < I; i5++) {
                View viewH = aVar.H(i5);
                int iV = a.V(viewH);
                if (iV != -1) {
                    if (iV < i4) {
                        view = viewH;
                        i4 = iV;
                    }
                    if (iV > i3) {
                        view2 = viewH;
                        i3 = iV;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(dyb0Var.d(view), dyb0Var.d(view2)) - Math.min(dyb0Var.g(view), dyb0Var.g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    public View i(a aVar) {
        switch (this.d) {
            case 0:
                if (aVar.r()) {
                    return g(aVar, k(aVar));
                }
                if (!aVar.q()) {
                    return null;
                }
                dyb0 uqq0Var = this.f;
                if (uqq0Var == null || ((a) uqq0Var.b) != aVar) {
                    uqq0Var = new uqq0(aVar);
                    this.f = uqq0Var;
                }
                return g(aVar, uqq0Var);
            default:
                if (aVar.r()) {
                    return h(aVar, l(aVar));
                }
                if (!aVar.q()) {
                    return null;
                }
                dyb0 uqq0Var2 = this.f;
                if (uqq0Var2 == null || ((a) uqq0Var2.b) != aVar) {
                    uqq0Var2 = new uqq0(aVar);
                    this.f = uqq0Var2;
                }
                return h(aVar, uqq0Var2);
        }
    }

    public int j(a aVar, int i, int i2) {
        int iR;
        View viewI;
        int iV;
        int i3;
        PointF pointFA;
        int iF;
        int iF2;
        dyb0 dyb0VarL;
        PointF pointFA2;
        boolean z = false;
        switch (this.d) {
            case 0:
                if (!(aVar instanceof r611) || (iR = aVar.R()) == 0 || (viewI = i(aVar)) == null || (iV = a.V(viewI)) == -1 || (pointFA = ((r611) aVar).a((i3 = iR - 1))) == null) {
                    return -1;
                }
                if (aVar.q()) {
                    dyb0 uqq0Var = this.f;
                    if (uqq0Var == null || ((a) uqq0Var.b) != aVar) {
                        uqq0Var = new uqq0(aVar);
                        this.f = uqq0Var;
                    }
                    iF = f(aVar, uqq0Var, i, 0);
                    if (pointFA.x < 0.0f) {
                        iF = -iF;
                    }
                } else {
                    iF = 0;
                }
                if (aVar.r()) {
                    iF2 = f(aVar, k(aVar), 0, i2);
                    if (pointFA.y < 0.0f) {
                        iF2 = -iF2;
                    }
                } else {
                    iF2 = 0;
                }
                if (aVar.r()) {
                    iF = iF2;
                }
                if (iF == 0) {
                    return -1;
                }
                int i4 = iV + iF;
                int i5 = i4 < 0 ? 0 : i4;
                return i5 >= iR ? i3 : i5;
            default:
                int iR2 = aVar.R();
                if (iR2 == 0) {
                    return -1;
                }
                View view = null;
                if (aVar.r()) {
                    dyb0VarL = l(aVar);
                } else if (aVar.q()) {
                    dyb0 uqq0Var2 = this.f;
                    if (uqq0Var2 == null || ((a) uqq0Var2.b) != aVar) {
                        uqq0Var2 = new uqq0(aVar);
                        this.f = uqq0Var2;
                    }
                    dyb0VarL = uqq0Var2;
                } else {
                    dyb0VarL = null;
                }
                if (dyb0VarL == null) {
                    return -1;
                }
                int I = aVar.I();
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i8 = 0; i8 < I; i8++) {
                    View viewH = aVar.H(i8);
                    if (viewH != null) {
                        int iE = e(viewH, dyb0VarL);
                        if (iE <= 0 && iE > i7) {
                            view2 = viewH;
                            i7 = iE;
                        }
                        if (iE >= 0 && iE < i6) {
                            view = viewH;
                            i6 = iE;
                        }
                    }
                }
                boolean z2 = !aVar.q() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return a.V(view);
                }
                if (!z2 && view2 != null) {
                    return a.V(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int iV2 = a.V(view);
                int iR3 = aVar.R();
                if ((aVar instanceof r611) && (pointFA2 = ((r611) aVar).a(iR3 - 1)) != null && (pointFA2.x < 0.0f || pointFA2.y < 0.0f)) {
                    z = true;
                }
                int i9 = iV2 + (z == z2 ? -1 : 1);
                if (i9 < 0 || i9 >= iR2) {
                    return -1;
                }
                return i9;
        }
    }

    public dyb0 k(a aVar) {
        vqq0 vqq0Var = this.e;
        if (vqq0Var != null && ((a) vqq0Var.b) == aVar) {
            return vqq0Var;
        }
        vqq0 vqq0Var2 = new vqq0(aVar);
        this.e = vqq0Var2;
        return vqq0Var2;
    }

    public dyb0 l(a aVar) {
        vqq0 vqq0Var = this.e;
        if (vqq0Var != null && ((a) vqq0Var.b) == aVar) {
            return vqq0Var;
        }
        vqq0 vqq0Var2 = new vqq0(aVar);
        this.e = vqq0Var2;
        return vqq0Var2;
    }

    public final void m() {
        a layoutManager;
        View viewI;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewI = i(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewI);
        int i = iArrC[0];
        if (i == 0 && iArrC[1] == 0) {
            return;
        }
        this.a.x0(i, iArrC[1], (Interpolator) null, false);
    }
}
