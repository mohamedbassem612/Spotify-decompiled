package p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fva1 extends t2u {
    public final hq81 V1;
    public l6s W1;
    public sss X1;
    public mxr Y1;
    public Rect Z1;

    public fva1(hq81 hq81Var) {
        this.V1 = hq81Var;
    }

    public static void j1(View view, ffv0 ffv0Var, float f) {
        view.setTranslationX(ffv0Var.b());
        view.setTranslationY(ffv0Var.c());
        int iC = l1d.C(ffv0Var.a());
        if (iC == 0) {
            view.setTranslationY(view.getTranslationY() - f);
            return;
        }
        if (iC == 1) {
            view.setTranslationX(view.getTranslationX() + f);
            return;
        }
        if (iC == 2) {
            view.setTranslationY(view.getTranslationY() + f);
        } else if (iC == 3) {
            view.setTranslationX(view.getTranslationX() - f);
        } else {
            eg.o();
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        View view = ((zf30) this).j1;
        if (view != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public final int b1() {
        return 2132017872;
    }

    public final Dialog c1(Bundle bundle) {
        Dialog dialogC1 = super.c1(bundle);
        Window window = dialogC1.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388659;
            attributes.flags |= 512;
            window.setAttributes(attributes);
            d55.i(window, false);
        }
        dialogC1.setOnShowListener(new l1r0(this, (byte) 3));
        return dialogC1;
    }

    public final void i1(View view, ffv0 ffv0Var, float f, float f2) {
        gch0 gch0Var = new gch0();
        wdm wdmVar = new wdm();
        wdmVar.B(f2);
        int iA = ffv0Var.a();
        dva1 dva1Var = new dva1(f, ffv0Var.d());
        int iC = l1d.C(iA);
        if (iC == 0) {
            wdmVar.C(dva1Var);
        } else if (iC == 1) {
            wdmVar.H(dva1Var);
        } else if (iC == 2) {
            wdmVar.J(dva1Var);
        } else {
            if (iC != 3) {
                eg.o();
                return;
            }
            wdmVar.I(dva1Var);
        }
        gch0Var.setShapeAppearanceModel(wdmVar.d());
        gch0Var.m(ColorStateList.valueOf(ago1.o(P0(), 2130968742, 0)));
        view.setBackground(gch0Var);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        mxr mxrVar = this.Y1;
        if (mxrVar == null) {
            u890.C("ubiLogger");
            throw null;
        }
        mxrVar.y();
        super.onDismiss(dialogInterface);
    }

    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle != null) {
            Z0(false, false);
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l6s l6sVar = this.W1;
        if (l6sVar == null) {
            u890.C("viewBinderFactory");
            throw null;
        }
        mxr mxrVarJ = l6sVar.j(P0(), layoutInflater);
        mxrVarJ.t();
        sss sssVar = this.X1;
        if (sssVar == null) {
            u890.C("mobiusControllerProvider");
            throw null;
        }
        MobiusLoop.Controller controllerA = sssVar.a();
        fta1.a(controllerA, ((zf30) this).s1);
        mwa1 mwa1Var = new mwa1(mxrVarJ);
        FrameLayout frameLayout = new FrameLayout(P0());
        frameLayout.setClipChildren(false);
        frameLayout.setOnClickListener(new gl61(this, (byte) 5));
        ConstraintLayout constraintLayoutR = mxrVarJ.r();
        constraintLayoutR.setLayoutParams(new FrameLayout.LayoutParams(constraintLayoutR.getContext().getResources().getDimensionPixelOffset(2131167042), -2));
        float dimension = constraintLayoutR.getContext().getResources().getDimension(2131167043);
        float dimension2 = constraintLayoutR.getContext().getResources().getDimension(2131167044);
        if (!constraintLayoutR.isLaidOut() || constraintLayoutR.isLayoutRequested()) {
            constraintLayoutR.addOnLayoutChangeListener(new eva1(this, dimension2, dimension));
        } else {
            Rect rect = this.Z1;
            if (rect == null) {
                u890.C("anchorRect");
                throw null;
            }
            ffv0 ffv0VarG = lap1.g(constraintLayoutR, rect, N0());
            j1(constraintLayoutR, ffv0VarG, dimension2);
            i1(constraintLayoutR, ffv0VarG, dimension2, dimension);
        }
        frameLayout.addView(mxrVarJ.r());
        controllerA.c(mwa1Var);
        return frameLayout;
    }
}
