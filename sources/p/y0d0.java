package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.car.app.model.Alert;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class y0d0 implements gc81 {
    public static final Method Z0;
    public static final Method a1;
    public loo N0;
    public View O0;
    public AdapterView.OnItemClickListener P0;
    public final Handler U0;
    public Rect W0;
    public boolean X;
    public boolean X0;
    public final ik5 Y0;
    public final Context a;
    public ListAdapter b;
    public m9v c;
    public int f;
    public int g;
    public boolean i;
    public boolean t;
    public final int d = -2;
    public int e = -2;
    public final short h = 1002;
    public int Y = 0;
    public final int Z = Alert.DURATION_SHOW_INDEFINITELY;
    public final w0d0 Q0 = new w0d0(this, (byte) 1);
    public final lgs R0 = new lgs(this, 5);
    public final x0d0 S0 = new x0d0(this);
    public final w0d0 T0 = new w0d0(this, (byte) 0);
    public final Rect V0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                Z0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                a1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public y0d0(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        this.a = context;
        this.U0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, moz0.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        ik5 ik5Var = new ik5(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, moz0.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            ik5Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        ik5Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : f0o1.j(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.Y0 = ik5Var;
        ik5Var.setInputMethodMode(1);
    }

    @Override // p.gc81
    public final boolean a() {
        return this.Y0.isShowing();
    }

    public final Drawable b() {
        return this.Y0.getBackground();
    }

    public final int c() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // p.gc81
    public final void dismiss() {
        ik5 ik5Var = this.Y0;
        ik5Var.dismiss();
        ik5Var.setContentView(null);
        this.c = null;
        this.U0.removeCallbacks(this.Q0);
    }

    public final void g(int i) {
        this.g = i;
        this.i = true;
    }

    public final int j() {
        if (this.i) {
            return this.g;
        }
        return 0;
    }

    public void k(ListAdapter listAdapter) {
        loo looVar = this.N0;
        if (looVar == null) {
            this.N0 = new loo(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(looVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.N0);
        }
        m9v m9vVar = this.c;
        if (m9vVar != null) {
            m9vVar.setAdapter(this.b);
        }
    }

    @Override // p.gc81
    public final void m() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        m9v m9vVar;
        m9v m9vVar2 = this.c;
        Context context = this.a;
        ik5 ik5Var = this.Y0;
        if (m9vVar2 == null) {
            m9v m9vVarQ = q(context, !this.X0);
            this.c = m9vVarQ;
            m9vVarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.P0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new v0d0(this, (byte) 0));
            this.c.setOnScrollListener(this.S0);
            ik5Var.setContentView(this.c);
        }
        Drawable background = ik5Var.getBackground();
        Rect rect = this.V0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.i) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = ik5Var.getMaxAvailableHeight(this.O0, this.g, ik5Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), os00.INVALID_ID);
            }
            int iA = this.c.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = ik5Var.getInputMethodMode() == 2;
        ik5Var.setWindowLayoutType(this.h);
        if (ik5Var.isShowing()) {
            if (this.O0.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.O0.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        ik5Var.setWidth(i5 == -1 ? -1 : 0);
                        ik5Var.setHeight(0);
                    } else {
                        ik5Var.setWidth(i5 == -1 ? -1 : 0);
                        ik5Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                ik5Var.setOutsideTouchable(true);
                View view = this.O0;
                int i6 = width;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                ik5Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.O0.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        ik5Var.setWidth(width2);
        ik5Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = Z0;
            if (method != null) {
                try {
                    method.invoke(ik5Var, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        } else {
            x74.p0(ik5Var);
        }
        ik5Var.setOutsideTouchable(true);
        ik5Var.setTouchInterceptor(this.R0);
        if (this.X) {
            ik5Var.setOverlapAnchor(this.t);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = a1;
            if (method2 != null) {
                try {
                    method2.invoke(ik5Var, this.W0);
                } catch (Exception unused2) {
                }
            }
        } else {
            x74.o0(ik5Var, this.W0);
        }
        ik5Var.showAsDropDown(this.O0, this.f, this.g, this.Y);
        this.c.setSelection(-1);
        if ((!this.X0 || this.c.isInTouchMode()) && (m9vVar = this.c) != null) {
            m9vVar.setListSelectionHidden(true);
            m9vVar.requestLayout();
        }
        if (this.X0) {
            return;
        }
        this.U0.post(this.T0);
    }

    @Override // p.gc81
    public final m9v n() {
        return this.c;
    }

    public final void o(Drawable drawable) {
        this.Y0.setBackgroundDrawable(drawable);
    }

    public m9v q(Context context, boolean z) {
        return new m9v(context, z);
    }

    public final void r(int i) {
        Drawable background = this.Y0.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.V0;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
