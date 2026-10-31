package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c4f1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static c4f1 X;
    public static c4f1 Y;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final b4f1 d;
    public final b4f1 e;
    public int f;
    public int g;
    public m5f1 h;
    public boolean i;
    public boolean t;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.b4f1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [p.b4f1] */
    public c4f1(View view, CharSequence charSequence) {
        final byte b = 0;
        this.d = new Runnable(this) { // from class: p.b4f1
            public final /* synthetic */ c4f1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                c4f1 c4f1Var = this.b;
                switch (b2) {
                    case 0:
                        c4f1Var.c(false);
                        break;
                    default:
                        c4f1Var.a();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.e = new Runnable(this) { // from class: p.b4f1
            public final /* synthetic */ c4f1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                c4f1 c4f1Var = this.b;
                switch (b3) {
                    case 0:
                        c4f1Var.c(false);
                        break;
                    default:
                        c4f1Var.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = f8k1.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? mmg1.d(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.t = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(c4f1 c4f1Var) {
        c4f1 c4f1Var2 = X;
        if (c4f1Var2 != null) {
            c4f1Var2.a.removeCallbacks(c4f1Var2.d);
        }
        X = c4f1Var;
        if (c4f1Var != null) {
            c4f1Var.a.postDelayed(c4f1Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        c4f1 c4f1Var = Y;
        View view = this.a;
        if (c4f1Var == this) {
            Y = null;
            m5f1 m5f1Var = this.h;
            if (m5f1Var != null) {
                View view2 = (View) m5f1Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) m5f1Var.a).getSystemService("window")).removeView(view2);
                }
                this.h = null;
                this.t = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (X == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            c4f1 c4f1Var = Y;
            if (c4f1Var != null) {
                c4f1Var.a();
            }
            Y = this;
            this.i = z;
            m5f1 m5f1Var = new m5f1(view.getContext());
            View view2 = (View) m5f1Var.b;
            Context context = (Context) m5f1Var.a;
            this.h = m5f1Var;
            int width = this.f;
            int i4 = this.g;
            boolean z2 = this.i;
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) m5f1Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) m5f1Var.c).setText(this.b);
            int[] iArr = (int[]) m5f1Var.g;
            int[] iArr2 = (int[]) m5f1Var.f;
            Rect rect = (Rect) m5f1Var.e;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131167154);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131167153);
                height = i4 + dimensionPixelOffset2;
                i = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(z2 ? 2131167158 : 2131167157);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            int i5 = width;
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context2 = view.getContext(); context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                i3 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = 0;
                    i3 = 1;
                } else {
                    Resources resources = context.getResources();
                    i3 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i2 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i6 = iArr2[i2] - iArr[i2];
                iArr2[i2] = i6;
                iArr2[i3] = iArr2[i3] - iArr[i3];
                layoutParams.x = (i6 + i5) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, i2);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i7 = iArr2[i3];
                int i8 = ((i7 + i) - dimensionPixelOffset3) - measuredHeight;
                int i9 = i7 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= rect.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) context.getSystemService("window")).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.i) {
                j2 = 2500;
            } else {
                WeakHashMap weakHashMap = b8k1.a;
                if ((view.getWindowSystemUiVisibility() & 1) == i3) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            b4f1 b4f1Var = this.e;
            view.removeCallbacks(b4f1Var);
            view.postDelayed(b4f1Var, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.h == null || !this.i) {
            View view2 = this.a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.t = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.h == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (this.t) {
                        this.f = x;
                        this.g = y;
                        this.t = false;
                        b(this);
                    } else {
                        int iAbs = Math.abs(x - this.f);
                        int i = this.c;
                        if (iAbs > i || Math.abs(y - this.g) > i) {
                            this.f = x;
                            this.g = y;
                            this.t = false;
                            b(this);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
