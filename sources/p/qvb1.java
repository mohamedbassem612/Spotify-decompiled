package p;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qvb1 extends FrameLayout {
    public RecyclerView a;
    public agz0 b;
    public kl1 c;
    public cgz0 d;
    public bgz0 e;
    public final ovb1 f;
    public final zl7 g;
    public final ce0 h;
    public static final /* synthetic */ mma0[] t = {new een0(qvb1.class, "state", "getState()Lcom/spotify/quickscroll/quickscroll2impl/StepScroller$State;", 0)};
    public static final fza i = new fza((byte) 26);
    public static final pvb1 N0 = new pvb1(0, false, false, false);
    public static final pvb1 O0 = new pvb1(0, false, false, true);

    public qvb1(Context context) {
        super(context, null, 0);
        this.f = new ovb1(this);
        this.g = new zl7(this, (byte) 21);
        this.h = new ce0(N0, this, (byte) 22);
    }

    public final void a(RecyclerView recyclerView, agz0 agz0Var, cgz0 cgz0Var, bgz0 bgz0Var, kl1 kl1Var) {
        this.a = recyclerView;
        this.b = agz0Var;
        this.d = cgz0Var;
        this.e = bgz0Var;
        this.c = kl1Var;
        recyclerView.m(this.g);
    }

    public final LinearLayoutManager b() {
        RecyclerView recyclerView = this.a;
        if (recyclerView != null) {
            return recyclerView.getLayoutManager();
        }
        u890.C("recyclerView");
        throw null;
    }

    public final pvb1 c() {
        mma0 mma0Var = t[0];
        return (pvb1) ((sgp0) this.h).a;
    }

    public final pfz0 d() {
        nvb1 nvb1Var = this.f.c;
        mma0 mma0Var = ovb1.h[1];
        return (pfz0) ((sgp0) nvb1Var).a;
    }

    public final void e(int i2) {
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i2);
    }

    public final void f(pvb1 pvb1Var) {
        this.h.c(t[0], this, pvb1Var);
    }

    public final void g(pfz0 pfz0Var) {
        ovb1 ovb1Var = this.f;
        ovb1Var.c.c(ovb1.h[1], ovb1Var, pfz0Var);
    }

    public final void h() {
        if (c().a == 0 || c().b) {
            return;
        }
        float f = 0.0f;
        if (b().R() != 0) {
            RecyclerView recyclerView = this.a;
            if (recyclerView == null) {
                u890.C("recyclerView");
                throw null;
            }
            int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            RecyclerView recyclerView2 = this.a;
            if (recyclerView2 == null) {
                u890.C("recyclerView");
                throw null;
            }
            int iComputeVerticalScrollExtent = recyclerView2.computeVerticalScrollExtent();
            RecyclerView recyclerView3 = this.a;
            if (recyclerView3 == null) {
                u890.C("recyclerView");
                throw null;
            }
            int iComputeVerticalScrollOffset = recyclerView3.computeVerticalScrollOffset();
            i.getClass();
            int i2 = iComputeVerticalScrollRange - iComputeVerticalScrollExtent;
            if (i2 > 0) {
                f = iComputeVerticalScrollOffset / i2;
            }
        }
        this.f.a(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f(O0);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int paddingStart = getPaddingStart() + i2;
        int paddingTop = getPaddingTop() + i3;
        int paddingEnd = i4 - getPaddingEnd();
        int paddingBottom = i5 - getPaddingBottom();
        ovb1 ovb1Var = this.f;
        ovb1Var.getClass();
        Rect rect = new Rect(paddingStart, paddingTop, paddingEnd, paddingBottom);
        Rect rect2 = ovb1Var.e;
        if (rect.equals(rect2)) {
            return;
        }
        rect2.set(rect);
        if (ovb1Var.g.c().b) {
            return;
        }
        ovb1Var.a(ovb1Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a5  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iR;
        Rect rect;
        qvb1 qvb1Var;
        agz0 agz0Var;
        agz0 agz0Var2;
        int handleHeight;
        agz0 agz0Var3;
        int iMax;
        int iHeight;
        RecyclerView recyclerView;
        int action = motionEvent.getAction();
        ovb1 ovb1Var = this.f;
        if (action == 0) {
            if (c().a == 0) {
                agz0 agz0Var4 = this.b;
                if (agz0Var4 == null) {
                    u890.C("handle");
                    throw null;
                }
                if (agz0Var4.getVisibility() == 0) {
                    agz0 agz0Var5 = this.b;
                    if (agz0Var5 == null) {
                        u890.C("handle");
                        throw null;
                    }
                    if (agz0Var5.getAlpha() != 0.0f) {
                        rect = ovb1Var.f;
                        qvb1Var = ovb1Var.g;
                        agz0Var = qvb1Var.b;
                        if (agz0Var != null) {
                            u890.C("handle");
                            throw null;
                        }
                        agz0Var.getHitRect(rect);
                        agz0Var2 = qvb1Var.b;
                        if (agz0Var2 != null) {
                            u890.C("handle");
                            throw null;
                        }
                        handleHeight = agz0Var2.getHandleHeight();
                        agz0Var3 = qvb1Var.b;
                        if (agz0Var3 != null) {
                            u890.C("handle");
                            throw null;
                        }
                        iMax = Math.max(handleHeight, agz0Var3.getHandleWidth());
                        iHeight = (iMax - rect.height()) / 2;
                        if (ovb1Var.d) {
                            rect.set(0, rect.top - iHeight, iMax, rect.bottom + iHeight);
                        } else {
                            int i2 = rect.right;
                            rect.set(i2 - iMax, rect.top - iHeight, i2, rect.bottom + iHeight);
                        }
                        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            f(pvb1.a(c(), 0, true, false, 5));
                            recyclerView = this.a;
                            if (recyclerView != null) {
                                recyclerView.requestDisallowInterceptTouchEvent(true);
                                return true;
                            }
                            u890.C("recyclerView");
                            throw null;
                        }
                    }
                }
            } else {
                rect = ovb1Var.f;
                qvb1Var = ovb1Var.g;
                agz0Var = qvb1Var.b;
                if (agz0Var != null) {
                    u890.C("handle");
                    throw null;
                }
                agz0Var.getHitRect(rect);
                agz0Var2 = qvb1Var.b;
                if (agz0Var2 != null) {
                    u890.C("handle");
                    throw null;
                }
                handleHeight = agz0Var2.getHandleHeight();
                agz0Var3 = qvb1Var.b;
                if (agz0Var3 != null) {
                    u890.C("handle");
                    throw null;
                }
                iMax = Math.max(handleHeight, agz0Var3.getHandleWidth());
                iHeight = (iMax - rect.height()) / 2;
                if (ovb1Var.d) {
                    rect.set(0, rect.top - iHeight, iMax, rect.bottom + iHeight);
                } else {
                    int i3 = rect.right;
                    rect.set(i3 - iMax, rect.top - iHeight, i3, rect.bottom + iHeight);
                }
                if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    f(pvb1.a(c(), 0, true, false, 5));
                    recyclerView = this.a;
                    if (recyclerView != null) {
                        recyclerView.requestDisallowInterceptTouchEvent(true);
                        return true;
                    }
                    u890.C("recyclerView");
                    throw null;
                }
            }
        }
        if (motionEvent.getAction() != 2 || !c().b) {
            if ((motionEvent.getAction() != 1 && motionEvent.getAction() != 3) || !c().b) {
                return super.onTouchEvent(motionEvent);
            }
            RecyclerView recyclerView2 = this.a;
            if (recyclerView2 == null) {
                u890.C("recyclerView");
                throw null;
            }
            recyclerView2.requestDisallowInterceptTouchEvent(false);
            f(pvb1.a(c(), 0, false, false, 5));
            return true;
        }
        ovb1Var.getClass();
        float y = motionEvent.getY();
        Rect rect2 = ovb1Var.e;
        float f = y - rect2.top;
        int iHeight2 = rect2.height();
        agz0 agz0Var6 = ovb1Var.g.b;
        if (agz0Var6 == null) {
            u890.C("handle");
            throw null;
        }
        float height = iHeight2 - agz0Var6.getHeight();
        float fO = yoi1.o(height > 0.0f ? f / height : 0.0f, 0.0f, 1.0f);
        ovb1Var.a = fO;
        float fO2 = yoi1.o(yoi1.o(fO, 0.0f, 1.0f), 0.0f, 1.0f);
        ovb1Var.a = fO2;
        ovb1Var.b((fO2 * height) + rect2.top);
        float f2 = ovb1Var.a;
        if (f2 >= 1.0f) {
            iR = b().R() - 1;
        } else {
            int iR2 = (int) (b().R() * f2);
            iR = iR2 >= 0 ? iR2 : 0;
        }
        b().H0(iR);
        h();
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        f(O0);
    }
}
