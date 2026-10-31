package p;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class cwb extends ak5 {
    public static final /* synthetic */ int P0 = 0;
    public final boolean N0;
    public final mi3 O0;
    public boolean X;
    public boolean Y;
    public bwb Z;
    public BottomSheetBehavior f;
    public FrameLayout g;
    public CoordinatorLayout h;
    public FrameLayout i;
    public boolean t;

    public cwb(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(2130968814, typedValue, true) ? typedValue.resourceId : 2132018124;
        }
        super(context, i);
        this.t = true;
        this.X = true;
        this.O0 = new mi3(this, (byte) 1);
        d().g(1);
        this.N0 = getContext().getTheme().obtainStyledAttributes(new int[]{2130969213}).getBoolean(0, false);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        g();
        super.cancel();
    }

    public final void f() {
        if (this.g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), 2131624529, null);
            this.g = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(2131428248);
            FrameLayout frameLayout2 = (FrameLayout) this.g.findViewById(2131428458);
            this.i = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorZ = BottomSheetBehavior.z(frameLayout2);
            this.f = bottomSheetBehaviorZ;
            bottomSheetBehaviorZ.t(this.O0);
            this.f.H(this.t);
        }
    }

    public final BottomSheetBehavior g() {
        if (this.f == null) {
            f();
        }
        return this.f;
    }

    public final FrameLayout h(View view, int i, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.g.findViewById(2131428248);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.N0) {
            FrameLayout frameLayout = this.i;
            fp8 fp8Var = new fp8(this, (byte) 9);
            WeakHashMap weakHashMap = b8k1.a;
            r7k1.c(frameLayout, fp8Var);
        }
        this.i.removeAllViews();
        FrameLayout frameLayout2 = this.i;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(2131431463).setOnClickListener(new c20(this, (byte) 10));
        b8k1.p(this.i, new xf(this, (byte) 2));
        this.i.setOnTouchListener(new kgh((byte) 3));
        return this.g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.N0 && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // p.ak5, p.p0i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // p.p0i, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.C() != 5) {
            return;
        }
        this.f.L(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.t != z) {
            this.t = z;
            BottomSheetBehavior bottomSheetBehavior = this.f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.H(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.t) {
            this.t = true;
        }
        this.X = z;
        this.Y = true;
    }

    @Override // p.ak5, p.p0i, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(h(view, 0, null));
    }

    @Override // p.ak5, p.p0i, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(h(null, i, null));
    }

    @Override // p.ak5, p.p0i, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(h(view, 0, layoutParams));
    }

    public cwb(Context context) {
        this(context, 0);
        this.N0 = getContext().getTheme().obtainStyledAttributes(new int[]{2130969213}).getBoolean(0, false);
    }
}
