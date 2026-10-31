package p;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9d1 extends FrameLayout {
    public Function0 a;
    public boolean b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public final int g;
    public final int h;

    public v9d1(Context context) {
        super(context, null, 0);
        this.b = true;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.g = scaledTouchSlop;
        this.h = scaledTouchSlop * 4;
    }

    public final Function0 getOnSwipeUp() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L39;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.b
            r1 = 0
            if (r0 != 0) goto L7
            goto L83
        L7:
            int r0 = r8.getAction()
            r2 = 1
            if (r0 == 0) goto L6a
            if (r0 == r2) goto L5c
            r3 = 2
            if (r0 == r3) goto L17
            r8 = 3
            if (r0 == r8) goto L5c
            goto L83
        L17:
            boolean r0 = r7.f
            if (r0 == 0) goto L1e
            boolean r7 = r7.e
            return r7
        L1e:
            float r0 = r8.getX()
            float r3 = r7.c
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            float r8 = r8.getY()
            float r3 = r7.d
            float r8 = r8 - r3
            float r3 = java.lang.Math.abs(r8)
            int r4 = r7.g
            float r5 = (float) r4
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 > 0) goto L3f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto L83
        L3f:
            r7.f = r2
            int r4 = -r4
            float r4 = (float) r4
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L52
            r8 = 1067030938(0x3f99999a, float:1.2)
            float r0 = r0 * r8
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 <= 0) goto L52
            r7.e = r2
            return r2
        L52:
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L83
            r7.requestDisallowInterceptTouchEvent(r1)
            return r1
        L5c:
            android.view.ViewParent r8 = r7.getParent()
            if (r8 == 0) goto L65
            r8.requestDisallowInterceptTouchEvent(r1)
        L65:
            r7.e = r1
            r7.f = r1
            return r1
        L6a:
            float r0 = r8.getX()
            r7.c = r0
            float r8 = r8.getY()
            r7.d = r8
            r7.e = r1
            r7.f = r1
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L83
            r7.requestDisallowInterceptTouchEvent(r2)
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v9d1.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function0 function0;
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            this.e = false;
            this.f = false;
            return true;
        }
        if (this.d - motionEvent.getY() > this.h && (function0 = this.a) != null) {
            function0.invoke();
        }
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        this.e = false;
        this.f = false;
        return true;
    }

    public final void setOnSwipeUp(Function0 function0) {
        this.a = function0;
    }

    public final void setSwipeEnabled(boolean z) {
        this.b = z;
    }
}
