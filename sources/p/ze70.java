package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.pses.v1.proto.ValueProposition;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ze70 extends zf30 {
    public final bf70 F1;
    public l7m0 G1;
    public wab H1;
    public fdc I1;
    public mxa1 J1;
    public g1f0 K1;
    public u0i L1;
    public boolean M1;
    public o8r N1;
    public ViewGroup O1;
    public ViewGroup P1;
    public ImageView Q1;
    public View R1;
    public View S1;
    public TextView T1;
    public View U1;
    public eg7 V1;

    public ze70(bf70 bf70Var) {
        this.F1 = bf70Var;
    }

    public static final void Y0(ze70 ze70Var) {
        View view = ze70Var.R1;
        if (view == null) {
            u890.C("gradient");
            throw null;
        }
        int measuredHeight = view.getMeasuredHeight();
        mxa1 mxa1Var = ze70Var.J1;
        if (mxa1Var == null) {
            u890.C("imageRetriever");
            throw null;
        }
        ConstraintLayout constraintLayoutFindViewById = ze70Var.Q0().findViewById(2131430629);
        ImageView imageView = ze70Var.Q1;
        if (imageView != null) {
            mxa1Var.e(constraintLayoutFindViewById, imageView, measuredHeight);
        } else {
            u890.C("artistImageView");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        o8r o8rVar = this.N1;
        if (o8rVar == null) {
            u890.C("debugMenuHelper");
            throw null;
        }
        View viewFindViewById = view.findViewById(2131431050);
        viewFindViewById.setOnLongClickListener(new n8r(o8rVar, viewFindViewById, (byte) 0));
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View viewInflate = layoutInflater.inflate(2131624697, viewGroup, false);
        this.O1 = (ViewGroup) viewInflate.findViewById(2131430629);
        this.P1 = (ViewGroup) viewInflate.findViewById(2131427871);
        this.Q1 = (ImageView) viewInflate.findViewById(2131427674);
        this.R1 = viewInflate.findViewById(2131429026);
        g1f0 g1f0Var = this.K1;
        if (g1f0Var == null) {
            u890.C("remoteProperties");
            throw null;
        }
        gb80 gb80VarS = g1f0Var.s();
        View viewFindViewById = viewInflate.findViewById(2131429641);
        viewFindViewById.getClass();
        viewFindViewById.setVisibility(gb80VarS != gb80.DISABLE ? 0 : 8);
        viewFindViewById.setOnClickListener(new t230(this, gb80VarS, (byte) 10));
        this.S1 = viewInflate.findViewById(2131431115);
        viewInflate.findViewById(2131427736);
        this.T1 = (TextView) viewInflate.findViewById(2131431564);
        ViewGroup viewGroup2 = this.O1;
        if (viewGroup2 == null) {
            u890.C("blueprintContainer");
            throw null;
        }
        this.U1 = viewGroup2.findViewById(2131431050);
        if (this.H1 == null) {
            u890.C("blueprint");
            throw null;
        }
        ViewGroup viewGroup3 = this.O1;
        if (viewGroup3 == null) {
            u890.C("blueprintContainer");
            throw null;
        }
        viewGroup3.findViewById(2131431115).setVisibility(8);
        TextView textView = this.T1;
        if (textView == null) {
            u890.C("valuePropositionTextView");
            throw null;
        }
        l7m0 l7m0Var = this.G1;
        if (l7m0Var == null) {
            u890.C("presenter");
            throw null;
        }
        ValueProposition valueProposition = ((wab) l7m0Var.b).d;
        String title = valueProposition != null ? valueProposition.getTitle() : null;
        if (title == null) {
            title = "";
        }
        if (ihc1.y0(title)) {
            if (this.G1 == null) {
                u890.C("presenter");
                throw null;
            }
            title = l0(this.M1 ? 2131957131 : 2131957738);
        }
        textView.setText(title);
        fdc fdcVar = this.I1;
        if (fdcVar == null) {
            u890.C("buttonProvider");
            throw null;
        }
        ArrayList arrayListV = fdcVar.V();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) k0().getDimension(2131167061);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = (int) k0().getDimension(2131167061);
        layoutParams2.bottomMargin = (int) k0().getDimension(2131167056);
        for (Object obj : arrayListV) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            zk8 zk8Var = (zk8) obj;
            u0i u0iVar = this.L1;
            if (u0iVar == null) {
                u890.C("authenticationButtonFactory");
                throw null;
            }
            mj8 mj8VarA = u0iVar.a((l0i) null);
            View view = mj8VarA.getView();
            mj8VarA.f(zk8Var.a);
            mj8VarA.n(zk8Var.b);
            view.setLayoutParams(i == p7h.L(arrayListV) ? layoutParams2 : layoutParams);
            String str = zk8Var.a.a.name() + i;
            WeakHashMap weakHashMap = b8k1.a;
            view.setTransitionName(str);
            ViewGroup viewGroup4 = this.P1;
            if (viewGroup4 == null) {
                u890.C("buttonContainer");
                throw null;
            }
            viewGroup4.addView(view);
            i = i2;
        }
        int i3 = k0().getConfiguration().orientation;
        mxa1 mxa1Var = this.J1;
        if (mxa1Var == null) {
            u890.C("imageRetriever");
            throw null;
        }
        if (!mxa1Var.d(i3)) {
            return viewInflate;
        }
        View view2 = this.R1;
        if (view2 != null) {
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new x22(this, (byte) 5));
            return viewInflate;
        }
        u890.C("gradient");
        throw null;
    }

    public final void z0() {
        View.OnLayoutChangeListener onLayoutChangeListener = this.V1;
        if (onLayoutChangeListener != null) {
            View view = this.R1;
            if (view == null) {
                u890.C("gradient");
                throw null;
            }
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        ((zf30) this).h1 = true;
    }
}
