package com.spotify.legacyglue.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import app.p000rive.semantics.SemanticState;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p.ckf1;
import p.eg;
import p.hhg1;
import p.i0e;
import p.j0e;
import p.k1e;
import p.nl51;
import p.pkf1;
import p.twd;
import p.uwd;
import p.w611;
import p.wes0;
import p.z511;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Deprecated
public class CarouselView extends RecyclerView {
    public final LinkedHashSet l2;
    public j0e m2;
    public boolean n2;
    public final k1e o2;

    public CarouselView(Context context) {
        super(context);
        this.l2 = new LinkedHashSet();
        this.o2 = new k1e((byte) 0);
        setHasFixedSize(true);
        setScrollingTouchSlop(1);
    }

    private j0e getSnappingLayoutManager() {
        return getLayoutManager();
    }

    public final void C0(int i) {
        Iterator it = this.l2.iterator();
        while (it.hasNext()) {
            uwd uwdVar = ((twd) it.next()).a;
            int i2 = uwdVar.a;
            pkf1 pkf1Var = (pkf1) ((nl51) uwdVar.h).b;
            if (i > i2) {
                pkf1Var.r2.invoke(ckf1.a);
            } else if (i < i2) {
                pkf1Var.r2.invoke(ckf1.b);
            }
            uwdVar.a = i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    public final boolean O(int i, int i2) {
        int iR;
        boolean z;
        j0e snappingLayoutManager = getSnappingLayoutManager();
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) snappingLayoutManager;
        carouselLayoutManager.getClass();
        if (Math.abs(i) < 1500) {
            iR = carouselLayoutManager.S0 + carouselLayoutManager.W0();
        } else {
            int i3 = carouselLayoutManager.V0;
            if (i > 0) {
                if (!carouselLayoutManager.Y0) {
                    i3++;
                }
            } else if (!carouselLayoutManager.X0) {
                i3--;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            iR = i3 > carouselLayoutManager.R() - 1 ? carouselLayoutManager.R() - 1 : i3;
        }
        CarouselLayoutManager carouselLayoutManager2 = (CarouselLayoutManager) snappingLayoutManager;
        View viewH = carouselLayoutManager2.H(iR - carouselLayoutManager2.S0);
        if (viewH != null) {
            z = a.M(viewH) != carouselLayoutManager2.Z0(viewH) + (viewH.getParent() instanceof CarouselView ? ((CarouselView) viewH.getParent()).getPaddingLeft() : 0);
        }
        y0(iR);
        if (this.o2.c != 0) {
            C0(iR);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(int i) {
        a snappingLayoutManager = getSnappingLayoutManager();
        k1e k1eVar = this.o2;
        int i2 = k1eVar.d;
        if (i2 == 0 && i != i2) {
            View childAt = getChildAt(0);
            if (childAt != null) {
                k1eVar.b = snappingLayoutManager.O(childAt);
            } else {
                k1eVar.b = getMeasuredWidth();
            }
            k1eVar.e = ((CarouselLayoutManager) snappingLayoutManager).V0;
            k1eVar.c = 0;
        }
        k1eVar.d = i;
        if (i == 0) {
            int i3 = ((CarouselLayoutManager) snappingLayoutManager).V0;
            Iterator it = this.l2.iterator();
            while (it.hasNext()) {
                wes0 wes0VarN = ((pkf1) ((twd) it.next()).a.g).N(i3);
                wes0 wes0Var = wes0VarN instanceof wes0 ? wes0VarN : null;
                if (wes0Var != null) {
                    wes0Var.c();
                }
            }
        }
    }

    public final void g0(int i, int i2) {
        int i3;
        int i4;
        wes0 wes0Var;
        k1e k1eVar = this.o2;
        if (i != 0 && i2 == 0) {
            i3 = k1eVar.c + i;
            k1eVar.c = i3;
        } else if (i != 0 || i2 == 0) {
            i3 = k1eVar.c + i;
            k1eVar.c = i3;
        } else {
            i3 = i2 + k1eVar.c;
            k1eVar.c = i3;
        }
        Math.abs(i3 / k1eVar.b);
        int i5 = k1eVar.c;
        if (i5 > 0) {
            i4 = k1eVar.e + 1;
        } else {
            int i6 = k1eVar.e;
            i4 = i5 < 0 ? i6 - 1 : i6;
        }
        for (twd twdVar : this.l2) {
            int i7 = k1eVar.e;
            uwd uwdVar = twdVar.a;
            pkf1 pkf1Var = (pkf1) uwdVar.g;
            if (((CarouselLayoutManager) pkf1Var.getLayoutManager()).c1) {
                if (i7 < i4 && uwdVar.b) {
                    w611 w611VarN = pkf1Var.N(i4);
                    wes0Var = w611VarN instanceof wes0 ? (wes0) w611VarN : null;
                    if (wes0Var != null) {
                        wes0Var.d();
                    }
                } else if (i7 > i4 && uwdVar.c) {
                    w611 w611VarN2 = pkf1Var.N(i4);
                    wes0Var = w611VarN2 instanceof wes0 ? (wes0) w611VarN2 : null;
                    if (wes0Var != null) {
                        wes0Var.d();
                    }
                }
            }
        }
    }

    public int getCurrentPosition() {
        j0e j0eVar = this.m2;
        if (j0eVar != null) {
            return ((CarouselLayoutManager) j0eVar).V0;
        }
        eg.m("Cannot get the current position without a LayoutManager.");
        return 0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.n2 && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        k1e k1eVar = this.o2;
        if (k1eVar.d != 0) {
            return false;
        }
        if (i == 21) {
            sendAccessibilityEvent(SemanticState.Obscured);
            int i2 = k1eVar.e;
            if (i2 > 0) {
                setPosition(i2 - 1);
            }
            return true;
        }
        if (i != 22) {
            return false;
        }
        sendAccessibilityEvent(SemanticState.Obscured);
        z511 adapter = getAdapter();
        if (adapter != null && k1eVar.e < adapter.e()) {
            setPosition(k1eVar.e + 1);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.n2) {
            return true;
        }
        j0e snappingLayoutManager = getSnappingLayoutManager();
        motionEvent.getAction();
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && getScrollState() == 0) {
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) snappingLayoutManager;
            setPosition(carouselLayoutManager.S0 + carouselLayoutManager.W0());
        }
        return zOnTouchEvent;
    }

    public void setLayoutManager(a aVar) {
        if (!(aVar instanceof j0e)) {
            hhg1.h("You must provide a SnappingLayoutManager to CarouselRecyclerView.");
        } else {
            this.m2 = (j0e) aVar;
            super.setLayoutManager(aVar);
        }
    }

    public void setOnLayoutChildrenListener(i0e i0eVar) {
        ((CarouselLayoutManager) getSnappingLayoutManager()).j1 = i0eVar;
    }

    public void setPosition(int i) {
        y0(i);
        C0(i);
    }

    public void setScrollLock(boolean z) {
        this.n2 = z;
    }

    public CarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l2 = new LinkedHashSet();
        this.o2 = new k1e((byte) 0);
        setHasFixedSize(true);
        setScrollingTouchSlop(1);
    }

    public CarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l2 = new LinkedHashSet();
        this.o2 = new k1e((byte) 0);
        setHasFixedSize(true);
        setScrollingTouchSlop(1);
    }
}
