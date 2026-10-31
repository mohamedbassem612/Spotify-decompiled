package com.spotify.legacyglue.recyclerview;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p.a8o;
import p.b8k1;
import p.bno1;
import p.boo1;
import p.d20;
import p.eba;
import p.eg;
import p.xfz0;
import p.zl7;
import p.znz0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class RecyclerViewFastScroller extends View {
    public static final /* synthetic */ int T0 = 0;
    public final Handler N0;
    public final xfz0 O0;
    public final zl7 P0;
    public final Rect Q0;
    public int R0;
    public ObjectAnimator S0;
    public RecyclerView a;
    public final Drawable b;
    public final int c;
    public final int d;
    public boolean e;
    public final int f;
    public LinearLayoutManager g;
    public final eba h;
    public final Paint i;
    public boolean t;

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new eba(this);
        Paint paint = new Paint();
        this.i = paint;
        this.N0 = new Handler();
        this.O0 = new xfz0(this, (byte) 2);
        this.P0 = new zl7(this, (byte) 15);
        this.Q0 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, znz0.d, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        this.b = drawable;
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, a8o.y(72.0f, getResources()));
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, a8o.y(32.0f, getResources()));
        this.f = typedArrayObtainStyledAttributes.getInt(0, 1000);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        drawable.getClass();
        paint.setColor(color);
        setVisibility(4);
    }

    public final void b() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, bno1.t(this) ? -getMeasuredWidth() : getMeasuredWidth()));
        this.S0 = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        this.S0.setInterpolator(boo1.x(this.a.getContext()));
        this.S0.addListener(new d20(this, (byte) 13));
        this.S0.start();
    }

    public final void c() {
        Handler handler = this.N0;
        xfz0 xfz0Var = this.O0;
        handler.removeCallbacks(xfz0Var);
        handler.postDelayed(xfz0Var, this.f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.N0.removeCallbacks(this.O0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int intrinsicWidth;
        eba ebaVar = this.h;
        canvas.drawRect((Rect) ebaVar.b, this.i);
        Drawable drawable = this.b;
        Rect rect = this.Q0;
        drawable.getPadding(rect);
        Rect rect2 = (Rect) ebaVar.c;
        int iCenterY = rect2.centerY();
        int intrinsicHeight = iCenterY - (drawable.getIntrinsicHeight() / 2);
        int intrinsicHeight2 = (drawable.getIntrinsicHeight() / 2) + iCenterY;
        if (bno1.t(this)) {
            i = rect2.left + rect.right;
            intrinsicWidth = drawable.getIntrinsicWidth() + i;
        } else {
            int intrinsicWidth2 = rect2.right - drawable.getIntrinsicWidth();
            int i2 = rect.right;
            i = intrinsicWidth2 - i2;
            intrinsicWidth = rect2.right - i2;
        }
        drawable.setBounds(i, intrinsicHeight, intrinsicWidth, intrinsicHeight2);
        drawable.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.d, 1073741824), i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        eba ebaVar = this.h;
        ((Rect) ebaVar.b).set(0, 0, measuredWidth, measuredHeight);
        Rect rect = (Rect) ebaVar.c;
        rect.set(0, 0, measuredWidth, this.c);
        rect.offsetTo(0, Math.round((((Rect) ebaVar.b).height() - ((RecyclerViewFastScroller) ebaVar.d).c) * ebaVar.a));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.t;
        Drawable drawable = this.b;
        eba ebaVar = this.h;
        if (z && motionEvent.getAction() == 0 && ((Rect) ebaVar.c).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.e = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            drawable.setState(new int[]{R.attr.state_pressed});
            c();
            return true;
        }
        if (motionEvent.getAction() != 2 || !this.e) {
            if (!this.e || (motionEvent.getAction() != 1 && motionEvent.getAction() != 3)) {
                return super.onTouchEvent(motionEvent);
            }
            c();
            drawable.setState(new int[0]);
            getParent().requestDisallowInterceptTouchEvent(false);
            this.e = false;
            return true;
        }
        c();
        ebaVar.getClass();
        ebaVar.g((motionEvent.getY() - (((Rect) ebaVar.c).height() / 2.0f)) / ((Rect) ebaVar.b).height());
        if (!(this.a.getLayoutManager() instanceof LinearLayoutManager)) {
            eg.m("Must be instance of LinearLayoutManager!");
            return false;
        }
        LinearLayoutManager layoutManager = this.a.getLayoutManager();
        this.g = layoutManager;
        int iR = (int) (layoutManager.R() * ebaVar.a);
        LinearLayoutManager linearLayoutManager = this.g;
        if (iR != 0) {
            linearLayoutManager.H0(iR);
        } else {
            linearLayoutManager.w1(iR, -this.R0);
        }
        WeakHashMap weakHashMap = b8k1.a;
        postInvalidateOnAnimation();
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        boolean z2 = this.t;
        this.t = false;
        this.N0.removeCallbacks(this.O0);
        if (z2) {
            b();
        }
    }

    public void setFirstItemDecorationHeight(int i) {
        this.R0 = i;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        zl7 zl7Var = this.P0;
        if (recyclerView2 != null) {
            recyclerView2.p0(zl7Var);
            this.g = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            recyclerView.m(zl7Var);
        }
    }

    public RecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970004);
    }

    public RecyclerViewFastScroller(Context context) {
        this(context, null);
    }
}
