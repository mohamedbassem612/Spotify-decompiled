package p;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c1p0 extends FrameLayout {
    public iu30 a;
    public v0p0 b;
    public final long c;
    public boolean d;
    public float e;
    public int f;
    public boolean g;
    public cc5 h;
    public final Handler i;

    public c1p0(Context context) {
        super(context);
        this.c = ViewConfiguration.getLongPressTimeout();
        this.i = new Handler(Looper.getMainLooper());
        setClipChildren(false);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
    }

    public final void a() {
        cc5 cc5Var = this.h;
        if (cc5Var != null) {
            this.i.removeCallbacks(cc5Var);
        }
        this.h = null;
        this.d = false;
        this.e = 0.0f;
        this.f = 0;
        this.g = false;
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public final iu30 getOnEvent() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        iu30 iu30Var;
        v0p0 v0p0Var = this.b;
        if (v0p0Var == null || !v0p0Var.a) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a();
            cc5 cc5Var = new cc5(this, motionEvent.getRawY(), (byte) 1);
            this.h = cc5Var;
            this.i.postDelayed(cc5Var, this.c);
        } else if (actionMasked == 1 || actionMasked == 3) {
            if (this.d && (iu30Var = this.a) != null) {
                iu30Var.invoke(w0p0.a);
            }
            a();
        }
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L49
            r3 = 2
            if (r0 == r3) goto Lf
            r3 = 3
            if (r0 == r3) goto L49
            goto L48
        Lf:
            p.v0p0 r0 = r5.b
            if (r0 == 0) goto L48
            float r3 = r5.e
            float r6 = r6.getRawY()
            float r3 = r3 - r6
            int r6 = r5.f
            float r6 = (float) r6
            float r6 = r6 + r3
            int r6 = (int) r6
            float r6 = r0.a(r6)
            p.iu30 r0 = r5.a
            if (r0 == 0) goto L2f
            p.y0p0 r3 = new p.y0p0
            r3.<init>(r6)
            r0.invoke(r3)
        L2f:
            r0 = 1061158912(0x3f400000, float:0.75)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 < 0) goto L36
            r1 = r2
        L36:
            boolean r6 = r5.g
            if (r1 == r6) goto L48
            r5.g = r1
            p.iu30 r5 = r5.a
            if (r5 == 0) goto L48
            p.a1p0 r6 = new p.a1p0
            r6.<init>(r1)
            r5.invoke(r6)
        L48:
            return r2
        L49:
            p.v0p0 r0 = r5.b
            if (r0 == 0) goto L7d
            float r3 = r5.e
            float r6 = r6.getRawY()
            float r3 = r3 - r6
            int r6 = r5.f
            float r6 = (float) r6
            float r6 = r6 + r3
            int r6 = (int) r6
            float r6 = r0.a(r6)
            r3 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L65
            r6 = r2
            goto L66
        L65:
            r6 = r1
        L66:
            int r4 = r5.f
            float r0 = r0.a(r4)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L71
            r1 = r2
        L71:
            p.iu30 r0 = r5.a
            if (r0 == 0) goto L7d
            p.x0p0 r3 = new p.x0p0
            r3.<init>(r6, r1)
            r0.invoke(r3)
        L7d:
            r5.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c1p0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            cc5 cc5Var = this.h;
            if (cc5Var != null) {
                this.i.removeCallbacks(cc5Var);
            }
            this.h = null;
        }
    }

    public final void setGestureConfig(v0p0 v0p0Var) {
        this.b = v0p0Var;
    }

    public final void setOnEvent(iu30 iu30Var) {
        this.a = iu30Var;
    }
}
