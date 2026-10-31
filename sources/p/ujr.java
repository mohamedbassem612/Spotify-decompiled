package p;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ujr extends CoordinatorLayout implements fr91 {
    public static final /* synthetic */ int y1 = 0;
    public final ViewGroup b1;
    public final FrameLayout c1;
    public final ComposeView d1;
    public final CoordinatorLayout e1;
    public final View f1;
    public ValueAnimator g1;
    public Integer h1;
    public int i1;
    public iu30 j1;
    public final dxb k1;
    public final ien0 l1;
    public boolean m1;
    public Function0 n1;
    public Function0 o1;
    public boolean p1;
    public final Paint q1;
    public final Path r1;
    public final RectF s1;
    public final Rect t1;
    public float u1;
    public float v1;
    public float w1;
    public PointF x1;

    /* JADX WARN: Multi-variable type inference failed */
    public ujr(Context context) {
        super(context);
        dxb dxbVar = new dxb();
        this.k1 = dxbVar;
        ien0 ien0Var = new ien0(q6x.b);
        this.l1 = ien0Var;
        this.m1 = true;
        this.q1 = new Paint(1);
        this.r1 = new Path();
        this.s1 = new RectF();
        this.t1 = new Rect();
        LayoutInflater.from(getContext()).inflate(2131625171, (ViewGroup) this);
        this.b1 = (ViewGroup) findViewById(2131427751);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131427755);
        this.c1 = frameLayout;
        ComposeView composeViewFindViewById = findViewById(2131427758);
        this.d1 = composeViewFindViewById;
        this.e1 = findViewById(2131427760);
        View viewFindViewById = findViewById(2131427756);
        this.f1 = viewFindViewById;
        findViewById(2131427754).setViewCompositionStrategy(f4x0.V0);
        viewFindViewById.setAccessibilityDelegate(new vwd((byte) 1));
        viewFindViewById.setOnClickListener(new c20(this, (byte) 25));
        setImportantForAccessibility(2);
        WeakHashMap weakHashMap = shk1.a;
        weakHashMap.put(frameLayout, dxbVar);
        weakHashMap.put(composeViewFindViewById, dxbVar);
        xhk1.f(composeViewFindViewById, ien0Var);
        composeViewFindViewById.addOnLayoutChangeListener(new eg7(this, (byte) 7));
        rwq0.s(frameLayout, zrj.c1);
    }

    public final void A() {
        ComposeView composeView = this.d1;
        composeView.l();
        composeView.removeAllViews();
        composeView.setVisibility(8);
        this.e1.setVisibility(8);
        this.j1 = null;
        D();
    }

    public final void B(th30 th30Var, zf30 zf30Var, String str) {
        if (th30Var.L) {
            return;
        }
        nu9 nu9Var = new nu9(th30Var);
        nu9Var.n(2131427755, zf30Var, str);
        if (th30Var.U()) {
            nu9Var.g(true, true);
        } else {
            nu9Var.f();
        }
        this.c1.requestLayout();
        this.b1.requestLayout();
    }

    public final void C(lnn0 lnn0Var) {
        jon1.G(this.c1, lnn0Var, 8);
    }

    public final void D() {
        ComposeView composeView = this.d1;
        int height = composeView.getVisibility() == 0 ? composeView.getHeight() : 0;
        if (this.i1 != height) {
            this.i1 = height;
            this.k1.a.t(height);
            iu30 iu30Var = this.j1;
            if (iu30Var != null) {
                iu30Var.invoke(Integer.valueOf(height));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchDraw(Canvas canvas) {
        if (this.p1) {
            ViewGroup viewGroup = this.b1;
            if (viewGroup.getVisibility() == 0) {
                float f = getResources().getDisplayMetrics().density;
                if (f != this.w1) {
                    this.w1 = f;
                    this.u1 = 16.0f * f;
                    this.v1 = f * 25.0f;
                }
                float f2 = this.u1;
                float f3 = this.v1;
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                Rect rect = this.t1;
                rect.set(0, 0, width, height);
                offsetDescendantRectToMyCoords(viewGroup, rect);
                float f4 = rect.left;
                float f5 = rect.top;
                float f6 = rect.right;
                float f7 = rect.bottom;
                for (int i = 9; -1 < i; i--) {
                    float f8 = i / 10.0f;
                    float f9 = f3 * f8;
                    float f10 = 1.0f - f8;
                    int iArgb = Color.argb((int) (f10 * f10 * 0.06f * 255.0f), 0, 0, 0);
                    Paint paint = this.q1;
                    paint.setColor(iArgb);
                    paint.setStyle(Paint.Style.FILL);
                    RectF rectF = this.s1;
                    rectF.set(f4 - f9, f5 - f9, f6 + f9, f7 + f2);
                    Path path = this.r1;
                    path.reset();
                    float f11 = f9 + f2;
                    path.addRoundRect(rectF, f11, f11, Path.Direction.CW);
                    canvas.drawPath(path, paint);
                }
            }
        }
        super/*android.view.View*/.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Function0 function0;
        if (keyEvent.getKeyCode() != 111 || keyEvent.getAction() != 1 || (function0 = this.o1) == null) {
            return super/*android.view.View*/.dispatchKeyEvent(keyEvent);
        }
        function0.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PointF pointF;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            PointF pointF2 = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
            int[] iArr = new int[2];
            ViewGroup viewGroup = this.b1;
            viewGroup.getLocationOnScreen(iArr);
            float f = pointF2.x;
            int i = iArr[0];
            if (f >= i && f < viewGroup.getWidth() + i) {
                float f2 = pointF2.y;
                int i2 = iArr[1];
                pointF = (f2 < ((float) i2) || f2 >= ((float) (viewGroup.getHeight() + i2))) ? pointF2 : null;
            }
            this.x1 = pointF;
        } else {
            if (actionMasked == 1) {
                boolean zDispatchTouchEvent = super/*android.view.View*/.dispatchTouchEvent(motionEvent);
                post(new a6n(this, (byte) 3));
                return zDispatchTouchEvent;
            }
            if (actionMasked == 3) {
                this.x1 = null;
            }
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public final boolean getAllowHostingSnackbar$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet() {
        return this.m1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer getBackgroundColor() {
        Drawable background = getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    public final ViewGroup getBottomSheetContainer() {
        return this.b1;
    }

    public final boolean getShadowEnabled$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet() {
        return this.p1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getSnackbarContainer() {
        if (!this.m1) {
            return null;
        }
        CoordinatorLayout coordinatorLayout = this.e1;
        return coordinatorLayout.getVisibility() == 0 ? coordinatorLayout : this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dg30 context = getContext();
        dg30 dg30Var = context instanceof dg30 ? context : null;
        if (dg30Var == null) {
            return;
        }
        View decorView = dg30Var.getWindow().getDecorView();
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(decorView);
        if (hsl1VarA == null) {
            return;
        }
        nk80 nk80VarI = hsl1VarA.a.i(647);
        setPadding(nk80VarI.a, nk80VarI.b, nk80VarI.c, getPaddingBottom());
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ComposeView composeView = this.d1;
        composeView.l();
        composeView.removeAllViews();
        ValueAnimator valueAnimator = this.g1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g1 = null;
        this.j1 = null;
    }

    public final void setAllowHostingSnackbar$src_main_java_com_spotify_musicappplatform_bottomsheet_bottomsheet(boolean z) {
        this.m1 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setBackgroundColorImmediately(int i) {
        ValueAnimator valueAnimator = this.g1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g1 = null;
        this.h1 = Integer.valueOf(i);
        setBackgroundColor(i);
    }

    public final void setDraggable(boolean z) {
        int i = z ? 0 : 4;
        View view = this.f1;
        view.setVisibility(i);
        view.setFocusable(z);
        view.setImportantForAccessibility(z ? 1 : 2);
    }

    public final void setMaxWidth(int i) {
        ViewGroup viewGroup = this.b1;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            return;
        }
        h3n h3nVar = (h3n) layoutParams;
        ((ViewGroup.MarginLayoutParams) h3nVar).width = i;
        viewGroup.setLayoutParams(h3nVar);
        ComposeView composeView = this.d1;
        ViewGroup.LayoutParams layoutParams2 = composeView.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            return;
        }
        h3n h3nVar2 = (h3n) layoutParams2;
        ((ViewGroup.MarginLayoutParams) h3nVar2).width = i;
        composeView.setLayoutParams(h3nVar2);
        CoordinatorLayout coordinatorLayout = this.e1;
        ViewGroup.LayoutParams layoutParams3 = coordinatorLayout.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            return;
        }
        h3n h3nVar3 = (h3n) layoutParams3;
        ((ViewGroup.MarginLayoutParams) h3nVar3).width = i;
        coordinatorLayout.setLayoutParams(h3nVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setOnBackgroundClickListener(iu30 iu30Var) {
        setOnClickListener(new cg1(this, iu30Var, (byte) 27));
    }

    public final void setOnEscKeyPressedListener(Function0 function0) {
        this.o1 = function0;
    }

    public final void setOnGrappleClickListener(Function0 function0) {
        this.n1 = function0;
    }

    public final void setPinnedBottomTranslation(float f) {
        ComposeView composeView = this.d1;
        if (composeView.getVisibility() == 0) {
            composeView.setTranslationY(f);
            this.e1.setTranslationY(f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setShadowEnabled(boolean z) {
        this.p1 = z;
        invalidate();
    }

    public final void z(int i) {
        Integer num = this.h1;
        if (num != null && i == num.intValue()) {
            return;
        }
        Integer backgroundColor = getBackgroundColor();
        if (backgroundColor != null && i == backgroundColor.intValue()) {
            return;
        }
        this.h1 = Integer.valueOf(i);
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(backgroundColor != null ? backgroundColor.intValue() : 0), Integer.valueOf(i));
        valueAnimatorOfObject.setDuration(300L);
        valueAnimatorOfObject.addUpdateListener(new kb5(this, (byte) 6));
        ValueAnimator valueAnimator = this.g1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.g1 = valueAnimatorOfObject;
        valueAnimatorOfObject.start();
    }
}
