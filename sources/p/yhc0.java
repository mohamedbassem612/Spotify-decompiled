package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.encoremobile.facepile.FaceView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yhc0 implements isw {
    public final ks6 a;
    public final ConstraintLayout b;
    public final /* synthetic */ zhc0 c;

    public yhc0(Context context, ViewGroup viewGroup, zhc0 zhc0Var) {
        this.c = zhc0Var;
        ks6 ks6VarH = ks6.h(LayoutInflater.from(context), viewGroup);
        this.a = ks6VarH;
        this.b = ks6VarH.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // p.isw
    public final void a(Object obj, ysw yswVar) throws NoWhenBranchMatchedException {
        xsw0 xsw0Var;
        int i;
        xhc0 xhc0Var = (xhc0) obj;
        zhc0 zhc0Var = this.c;
        gw70 gw70Var = (gw70) zhc0Var.b;
        ks6 ks6Var = this.a;
        Group group = (Group) ks6Var.d;
        TextView textView = (TextView) ks6Var.g;
        AdditionalInfoView additionalInfoView = (AdditionalInfoView) ks6Var.b;
        RecyclerView recyclerView = (RecyclerView) ks6Var.Q0;
        TextView textView2 = (TextView) ks6Var.i;
        TextView textView3 = (TextView) ks6Var.P0;
        TextView textView4 = (TextView) ks6Var.O0;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ks6Var.e;
        group.setVisibility(xhc0Var.b() != null ? 0 : 8);
        Barrier barrier = (Barrier) ks6Var.f;
        aic0 aic0VarB = xhc0Var.b();
        barrier.setVisibility((aic0VarB != null ? aic0VarB.a() : null) != null ? 0 : 8);
        FrameLayout frameLayout = (FrameLayout) ks6Var.N0;
        aic0 aic0VarB2 = xhc0Var.b();
        frameLayout.setVisibility(((aic0VarB2 != null ? aic0VarB2.a() : null) == null || xhc0Var.b().g() == null) ? 8 : 0);
        aic0 aic0VarB3 = xhc0Var.b();
        if (aic0VarB3 != null) {
            if (aic0VarB3.a() != null) {
                shapeableImageView.setVisibility(0);
                ixg ixgVarF = gw70Var.f(aic0VarB3.a().b());
                ixgVarF.h();
                ixgVarF.k(shapeableImageView, (ird1) null);
                shapeableImageView.setContentDescription(aic0VarB3.a().a());
            } else {
                shapeableImageView.setVisibility(8);
            }
            if (aic0VarB3.a() != null && aic0VarB3.g() != null) {
                ((FaceView) ks6Var.Z).e(new af10(gw70Var, (nww0) zhc0Var.c), new td10(aic0VarB3.g().g(), aic0VarB3.g().getUsername(), aic0VarB3.g().getDisplayName(), aic0VarB3.g().b()));
            }
            ((TextView) ks6Var.R0).setText(aic0VarB3.getTitle());
            textView4.setVisibility(aic0VarB3.h().length() > 0 ? 0 : 8);
            textView4.setText(aic0VarB3.h());
            ((Group) ks6Var.t).setVisibility(aic0VarB3.b() != null ? 0 : 8);
            dic0 dic0VarB = aic0VarB3.b();
            if (dic0VarB != null) {
                ((TextView) ks6Var.h).setText(dic0VarB.b());
                textView3.setVisibility(dic0VarB.a() != null ? 0 : 8);
                textView3.setText(dic0VarB.a());
                textView2.setVisibility(dic0VarB.g().length() > 0 ? 0 : 8);
                textView2.setText(dic0VarB.g());
            }
        }
        recyclerView.setVisibility(xhc0Var.j() != null ? 0 : 8);
        pqe1 pqe1VarJ = xhc0Var.j();
        if (pqe1VarJ instanceof fqe1) {
            xsw0Var = new xsw0(xhc0Var.j().getItems(), (byte) 2);
        } else if (pqe1VarJ instanceof nqe1) {
            xsw0Var = new xsw0(xhc0Var.j().getItems(), (byte) 3);
        } else {
            if (pqe1VarJ != null) {
                eg.o();
                return;
            }
            xsw0Var = null;
        }
        recyclerView.setAdapter(xsw0Var);
        ((CardView) ks6Var.X).setVisibility(xhc0Var.h() != null ? 0 : 8);
        List listH = xhc0Var.h();
        if (listH != null) {
            i = 0;
            z511 xsw0Var2 = new xsw0((byte) 0);
            xsw0Var2.A(listH);
            ((RecyclerView) ks6Var.Y).setAdapter(xsw0Var2);
        } else {
            i = 0;
        }
        additionalInfoView.setVisibility(!xhc0Var.a().isEmpty() ? i : 8);
        additionalInfoView.setInfo(xhc0Var.a());
        textView.setVisibility(xhc0Var.g() != null ? i : 8);
        textView.setText(xhc0Var.g());
    }

    @Override // p.isw
    public final View getView() {
        return this.b;
    }
}
