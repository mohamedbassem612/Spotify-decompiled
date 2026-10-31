package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.comscore.streaming.ContentType;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p.b8k1;
import p.bih1;
import p.eg;
import p.fjr0;
import p.mdk1;
import p.ndk1;
import p.odk1;
import p.os00;
import p.pdk1;
import p.qdk1;
import p.r7k1;
import p.seg1;
import p.y511;
import p.zdc;
import p.zgd1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ViewPager extends ViewGroup {
    public static final int[] l1 = {R.attr.layout_gravity};
    public static final y511 m1 = new y511((byte) 1);
    public boolean N0;
    public boolean O0;
    public int P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public int U0;
    public float V0;
    public float W0;
    public float X0;
    public int Y0;
    public VelocityTracker Z0;
    public final ArrayList a;
    public int a1;
    public final ndk1 b;
    public EdgeEffect b1;
    public final Rect c;
    public EdgeEffect c1;
    public Parcelable d;
    public boolean d1;
    public Scroller e;
    public boolean e1;
    public int f;
    public int f1;
    public Drawable g;
    public ArrayList g1;
    public final float h;
    public pdk1 h1;
    public final float i;
    public ArrayList i1;
    public final seg1 j1;
    public int k1;
    public int t;

    public ViewPager(Context context) {
        super(context);
        this.a = new ArrayList();
        this.b = new ndk1();
        this.c = new Rect();
        this.d = null;
        this.h = -3.4028235E38f;
        this.i = Float.MAX_VALUE;
        this.P0 = 1;
        this.Y0 = -1;
        this.d1 = true;
        this.j1 = new seg1(this, (byte) 7);
        this.k1 = 0;
        g();
    }

    public static boolean b(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 < childAt.getLeft() || i5 >= childAt.getRight() || (i4 = i3 + scrollY) < childAt.getTop() || i4 >= childAt.getBottom() || !b(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.O0 != z) {
            this.O0 = z;
        }
    }

    public final boolean a(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        boolean zRequestFocus = false;
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            Rect rect = this.c;
            if (i == 17) {
                int i2 = d(rect, viewFindNextFocus).left;
                int i3 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i2 < i3) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            } else if (i == 66) {
                int i4 = d(rect, viewFindNextFocus).left;
                int i5 = d(rect, viewFindFocus).left;
                if (viewFindFocus == null || i4 > i5) {
                    zRequestFocus = viewFindNextFocus.requestFocus();
                }
            }
        } else if (i != 17) {
        }
        if (zRequestFocus) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return zRequestFocus;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3).getVisibility() == 0) {
                    e();
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            if (getChildAt(i).getVisibility() == 0) {
                e();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        odk1 odk1Var = (odk1) layoutParams;
        boolean z = odk1Var.a | (view.getClass().getAnnotation(mdk1.class) != null);
        odk1Var.a = z;
        if (!this.N0) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            eg.m("Cannot add pager decor view during layout");
        } else {
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void c(boolean z) {
        int i = 0;
        boolean z2 = this.k1 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.e.isFinished()) {
                this.e.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.e.getCurrX();
                int currY = this.e.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        i(currX);
                    }
                }
            }
        }
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            ((ndk1) arrayList.get(i)).getClass();
            i++;
        }
        if (z2) {
            seg1 seg1Var = this.j1;
            if (!z) {
                seg1Var.run();
            } else {
                WeakHashMap weakHashMap = b8k1.a;
                postOnAnimation(seg1Var);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof odk1) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.e.isFinished() || !this.e.computeScrollOffset()) {
            c(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.e.getCurrX();
        int currY = this.e.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!i(currX)) {
                this.e.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = b8k1.a;
        postInvalidateOnAnimation();
    }

    public final Rect d(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zA;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zA = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode != 61) {
                            zA = false;
                        } else if (keyEvent.hasNoModifiers()) {
                            zA = a(2);
                        } else if (keyEvent.hasModifiers(1)) {
                            zA = a(1);
                        } else {
                            zA = false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zA = false;
                    } else {
                        zA = a(66);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    zA = false;
                } else {
                    zA = a(17);
                }
            }
            if (!zA) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                e();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        if (getOverScrollMode() != 0) {
            this.b1.finish();
            this.c1.finish();
        } else {
            if (!this.b1.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.h * width);
                this.b1.setSize(height, width);
                zDraw = this.b1.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.c1.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.i + 1.0f)) * width2);
                this.c1.setSize(height2, width2);
                zDraw |= this.c1.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        }
        if (zDraw) {
            WeakHashMap weakHashMap = b8k1.a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.g;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        ArrayList arrayList = this.a;
        if (arrayList.size() <= 0) {
            return;
        }
        ((ndk1) arrayList.get(0)).getClass();
        throw null;
    }

    public final ndk1 f() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return null;
            }
            ndk1 ndk1Var = (ndk1) arrayList.get(i);
            if (ndk1Var.a == 0) {
                return ndk1Var;
            }
            i++;
        }
    }

    public final void g() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.e = new Scroller(context, m1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.U0 = viewConfiguration.getScaledPagingTouchSlop();
        viewConfiguration.getScaledMaximumFlingVelocity();
        this.b1 = new EdgeEffect(context);
        this.c1 = new EdgeEffect(context);
        this.a1 = (int) (2.0f * f);
        this.S0 = (int) (f * 16.0f);
        b8k1.p(this, new zdc(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        r7k1.c(this, new bih1(this));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new odk1(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        odk1 odk1Var = new odk1(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1);
        odk1Var.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
        return odk1Var;
    }

    public fjr0 getAdapter() {
        return null;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return 0;
    }

    public int getOffscreenPageLimit() {
        return this.P0;
    }

    public int getPageMargin() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    public final void h(int i, int i2, float f) {
        int iMax;
        int width;
        int left;
        if (this.f1 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                odk1 odk1Var = (odk1) childAt.getLayoutParams();
                if (odk1Var.a) {
                    int i4 = odk1Var.b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        pdk1 pdk1Var = this.h1;
        if (pdk1Var != null) {
            pdk1Var.c(f, i);
        }
        ArrayList arrayList = this.g1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                pdk1 pdk1Var2 = (pdk1) this.g1.get(i6);
                if (pdk1Var2 != null) {
                    pdk1Var2.c(f, i);
                }
            }
        }
        this.e1 = true;
    }

    public final boolean i(int i) {
        int i2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            if (!this.d1) {
                this.e1 = false;
                h(0, 0, 0.0f);
                if (!this.e1) {
                    eg.m("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f = clientWidth > 0 ? this.f / clientWidth : 0.0f;
        int i3 = -1;
        boolean z = true;
        float f2 = 0.0f;
        int i4 = 0;
        ndk1 ndk1Var = null;
        while (i4 < arrayList.size()) {
            ndk1 ndk1Var2 = (ndk1) arrayList.get(i4);
            if (!z && ndk1Var2.a != (i2 = i3 + 1)) {
                ndk1 ndk1Var3 = this.b;
                ndk1Var3.b = f2 + 0.0f + f;
                ndk1Var3.a = i2;
                throw null;
            }
            f2 = ndk1Var2.b;
            float f3 = f2 + 0.0f + f;
            if (!z && scrollX < f2) {
                break;
            }
            if (scrollX < f3 || i4 == arrayList.size() - 1) {
                ndk1Var = ndk1Var2;
                break;
            }
            i3 = ndk1Var2.a;
            i4++;
            z = false;
            ndk1Var = ndk1Var2;
        }
        int clientWidth2 = getClientWidth();
        int i5 = this.f;
        int i6 = clientWidth2 + i5;
        float f4 = clientWidth2;
        int i7 = ndk1Var.a;
        float f5 = ((i / f4) - ndk1Var.b) / (0.0f + (i5 / f4));
        this.e1 = false;
        h(i7, (int) (i6 * f5), f5);
        if (this.e1) {
            return true;
        }
        eg.m("onPageScrolled did not call superclass implementation");
        return false;
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.a.isEmpty()) {
            if (!this.e.isFinished()) {
                this.e.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        ndk1 ndk1VarF = f();
        int iMin = (int) ((ndk1VarF != null ? Math.min(ndk1VarF.b, this.i) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            c(false);
            scrollTo(iMin, getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d1 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.j1);
        Scroller scroller = this.e;
        if (scroller != null && !scroller.isFinished()) {
            this.e.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f <= 0 || this.g == null) {
            return;
        }
        this.a.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r13.R0 != false) goto L84;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                odk1 odk1Var = (odk1) childAt.getLayoutParams();
                if (odk1Var.a) {
                    int i9 = odk1Var.b;
                    int i10 = i9 & 7;
                    int i11 = i9 & ContentType.LONG_FORM_ON_DEMAND;
                    if (i10 != 1) {
                        if (i10 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i10 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i5 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i11 != 16) {
                            if (i11 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i11 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i12 = paddingLeft + scrollX;
                            childAt.layout(i12, paddingTop, childAt.getMeasuredWidth() + i12, childAt.getMeasuredHeight() + paddingTop);
                            i7++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i13 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i13;
                        int i14 = paddingLeft + scrollX;
                        childAt.layout(i14, paddingTop, childAt.getMeasuredWidth() + i14, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i5 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i15 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i15;
                    if (i11 != 16) {
                        if (i11 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i16 = paddingLeft + scrollX;
                        childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                        i7++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i17 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i17;
                    int i18 = paddingLeft + scrollX;
                    childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                    i7++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8 && !((odk1) childAt2.getLayoutParams()).a) {
                e();
            }
        }
        this.f1 = i7;
        if (this.d1) {
            ndk1 ndk1VarF = f();
            int iMax3 = ndk1VarF != null ? (int) (Math.max(this.h, Math.min(ndk1VarF.b, this.i)) * getClientWidth()) : 0;
            z2 = false;
            c(false);
            scrollTo(iMax3, 0);
            i(iMax3);
        } else {
            z2 = false;
        }
        this.d1 = z2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        odk1 odk1Var;
        odk1 odk1Var2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.T0 = Math.min(measuredWidth / 10, this.S0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (odk1Var2 = (odk1) childAt.getLayoutParams()) != null && odk1Var2.a) {
                int i6 = odk1Var2.b;
                int i7 = i6 & 7;
                int i8 = i6 & ContentType.LONG_FORM_ON_DEMAND;
                boolean z = true;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = os00.INVALID_ID;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) odk1Var2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) odk1Var2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.t = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.N0 = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((odk1Var = (odk1) childAt2.getLayoutParams()) == null || !odk1Var.a)) {
                odk1Var.getClass();
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * 0.0f), 1073741824), this.t);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i4 = childCount;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            if (getChildAt(i2).getVisibility() == 0) {
                e();
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof qdk1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        qdk1 qdk1Var = (qdk1) parcelable;
        super.onRestoreInstanceState(qdk1Var.a);
        this.d = qdk1Var.d;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        qdk1 qdk1Var = new qdk1(super.onSaveInstanceState());
        qdk1Var.c = 0;
        return qdk1Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f;
            j(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            motionEvent.getEdgeFlags();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.N0) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(fjr0 fjr0Var) {
        ArrayList arrayList = this.i1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.i1.size();
        for (int i = 0; i < size; i++) {
            TabLayout tabLayout = ((zgd1) this.i1.get(i)).a;
            if (tabLayout.m1 == this) {
                tabLayout.i();
            }
        }
    }

    public void setCurrentItem(int i) {
        setScrollingCacheEnabled(false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.P0) {
            this.P0 = i;
        }
    }

    @Deprecated
    public void setOnPageChangeListener(pdk1 pdk1Var) {
        this.h1 = pdk1Var;
    }

    public void setPageMargin(int i) {
        int i2 = this.f;
        this.f = i;
        int width = getWidth();
        j(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.g = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.k1 == i) {
            return;
        }
        this.k1 = i;
        pdk1 pdk1Var = this.h1;
        if (pdk1Var != null) {
            pdk1Var.e(i);
        }
        ArrayList arrayList = this.g1;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                pdk1 pdk1Var2 = (pdk1) this.g1.get(i2);
                if (pdk1Var2 != null) {
                    pdk1Var2.e(i);
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = new ndk1();
        this.c = new Rect();
        this.d = null;
        this.h = -3.4028235E38f;
        this.i = Float.MAX_VALUE;
        this.P0 = 1;
        this.Y0 = -1;
        this.d1 = true;
        this.j1 = new seg1(this, (byte) 7);
        this.k1 = 0;
        g();
    }
}
