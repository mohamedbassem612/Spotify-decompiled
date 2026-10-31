package com.spotify.watchfeed.uiusecases.associatedtextsrow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/spotify/watchfeed/uiusecases/associatedtextsrow/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getChildScrollDirection", "()I", "Landroidx/viewpager2/widget/ViewPager2;", "getParentViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "src_main_java_com_spotify_watchfeed_uiusecases_associatedtextsrow-associatedtextsrow"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class NestedScrollableHost extends FrameLayout {
    public final int a;
    public float b;
    public float c;

    public NestedScrollableHost(Context context) {
        super(context);
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    private final int getChildScrollDirection() {
        View child;
        View child2 = getChild();
        if (child2 != null && child2.canScrollHorizontally(1)) {
            return 0;
        }
        View child3 = getChild();
        if (child3 != null && child3.canScrollHorizontally(-1)) {
            return 0;
        }
        View child4 = getChild();
        return ((child4 == null || !child4.canScrollVertically(1)) && ((child = getChild()) == null || !child.canScrollVertically(-1))) ? -1 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x000d, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.viewpager2.widget.ViewPager2 getParentViewPager() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L13
            boolean r1 = r0 instanceof androidx.viewpager2.widget.ViewPager2
            if (r1 == 0) goto L22
        L13:
            if (r0 == 0) goto L2d
            r1 = r0
            androidx.viewpager2.widget.ViewPager2 r1 = (androidx.viewpager2.widget.ViewPager2) r1
            int r1 = r1.getOrientation()
            int r3 = r4.getChildScrollDirection()
            if (r1 == r3) goto L2d
        L22:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L2d:
            androidx.viewpager2.widget.ViewPager2 r0 = (androidx.viewpager2.widget.ViewPager2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.watchfeed.uiusecases.associatedtextsrow.NestedScrollableHost.getParentViewPager():androidx.viewpager2.widget.ViewPager2");
    }

    public final boolean a(float f, int i) {
        int i2 = -((int) Math.signum(f));
        if (i == 0) {
            View child = getChild();
            if (child != null) {
                return child.canScrollHorizontally(i2);
            }
            return false;
        }
        if (i != 1) {
            bhn0.q();
            return false;
        }
        View child2 = getChild();
        if (child2 != null) {
            return child2.canScrollVertically(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewPager2 parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (motionEvent.getAction() == 0) {
                    this.b = motionEvent.getX();
                    this.c = motionEvent.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.b;
                    float y = motionEvent.getY() - this.c;
                    boolean z = orientation == 0;
                    float fAbs = Math.abs(x) * (z ? 0.5f : 1.0f);
                    float fAbs2 = Math.abs(y) * (z ? 1.0f : 0.5f);
                    float f = this.a;
                    if (fAbs > f || fAbs2 > f) {
                        if (z == (fAbs2 > fAbs)) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z) {
                                x = y;
                            }
                            if (a(x, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }
}
