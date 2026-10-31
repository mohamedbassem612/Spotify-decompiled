package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yq91 extends kda {
    public static final int[] t = {2130970259, 2130970261};
    public final AccessibilityManager r;
    public boolean s;

    public yq91(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.r = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static yq91 i(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            hhg1.n("No suitable parent found from the given view. Please provide a valid view.");
            return null;
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? 2131624531 : 2131625272, viewGroup, false);
        yq91 yq91Var = new yq91(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) yq91Var.c.getChildAt(0)).getMessageView().setText(charSequence);
        yq91Var.e = i;
        return yq91Var;
    }

    public final void g() {
        b(3);
    }

    public final boolean h() {
        boolean zL;
        ua91 ua91VarF = ua91.F();
        eda edaVar = this.o;
        synchronized (ua91VarF.b) {
            zL = ua91VarF.L(edaVar);
        }
        return zL;
    }

    public final void j(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.s = false;
        } else {
            this.s = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new tqs(this, onClickListener, (byte) 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    public final void k() {
        ua91 ua91VarF = ua91.F();
        AccessibilityManager accessibilityManager = this.r;
        int recommendedTimeoutMillis = this.e;
        boolean z = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = this.s;
            if (i >= 29) {
                recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (z2 ? 4 : 0) | 3);
            } else if (z2 && accessibilityManager.isTouchExplorationEnabled()) {
                recommendedTimeoutMillis = -2;
            }
        }
        eda edaVar = this.o;
        synchronized (ua91VarF.b) {
            try {
                if (ua91VarF.L(edaVar)) {
                    et91 et91Var = (et91) ua91VarF.d;
                    et91Var.b = recommendedTimeoutMillis;
                    ((Handler) ua91VarF.c).removeCallbacksAndMessages(et91Var);
                    ua91VarF.S((et91) ua91VarF.d);
                    return;
                }
                et91 et91Var2 = (et91) ua91VarF.e;
                if (et91Var2 != null && et91Var2.a.get() == edaVar) {
                    z = true;
                }
                if (z) {
                    ((et91) ua91VarF.e).b = recommendedTimeoutMillis;
                } else {
                    ua91VarF.e = new et91(recommendedTimeoutMillis, edaVar);
                }
                et91 et91Var3 = (et91) ua91VarF.d;
                if (et91Var3 == null || !ua91VarF.w(et91Var3, 4)) {
                    ua91VarF.d = null;
                    ua91VarF.U();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
