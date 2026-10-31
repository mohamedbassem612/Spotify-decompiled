package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconEnhance;
import com.spotify.encoremobile.component.icons.IconSpotifyLogo;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b8s implements qzh, e391 {
    public final pbq a;

    public b8s(Context context, gw70 gw70Var, dui0 dui0Var) {
        pbq pbqVarN = pbq.N(LayoutInflater.from(context));
        kuo1.i(pbqVarN, gw70Var);
        this.a = pbqVarN;
        if (dui0Var instanceof bui0) {
            ConstraintLayout constraintLayoutK = pbqVarN.K();
            ViewGroup.LayoutParams layoutParams = constraintLayoutK.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                throw null;
            }
            layoutParams.width = pbqVarN.K().getResources().getDimensionPixelSize(2131166486);
            constraintLayoutK.setLayoutParams(layoutParams);
            k(false);
            return;
        }
        if (dui0Var instanceof cui0) {
            ConstraintLayout constraintLayoutK2 = pbqVarN.K();
            ViewGroup.LayoutParams layoutParams2 = constraintLayoutK2.getLayoutParams();
            if (layoutParams2 == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                throw null;
            }
            layoutParams2.width = pbqVarN.K().getResources().getDimensionPixelSize(2131166489);
            constraintLayoutK2.setLayoutParams(layoutParams2);
            k(false);
            return;
        }
        if (!dui0Var.equals(aj20.O0)) {
            eg.o();
            throw null;
        }
        ConstraintLayout constraintLayoutK3 = pbqVarN.K();
        ViewGroup.LayoutParams layoutParams3 = constraintLayoutK3.getLayoutParams();
        if (layoutParams3 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            throw null;
        }
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        constraintLayoutK3.setLayoutParams(layoutParams3);
    }

    public final ArtworkView b() {
        return (ArtworkView) this.a.t;
    }

    public final void f(Object obj) {
        fui0 fui0Var = (fui0) obj;
        pbq pbqVar = this.a;
        ArtworkView artworkView = (ArtworkView) pbqVar.t;
        TextView textView = (TextView) pbqVar.b;
        TextView textView2 = (TextView) pbqVar.c;
        TextView textView3 = (TextView) pbqVar.X;
        artworkView.h(new w07(new g07(fui0Var.b()), new rk70(2131232719)));
        ((TextView) pbqVar.e).setText(fui0Var.c());
        ((IconSpotifyLogo) pbqVar.i).setVisibility(8);
        ((IconEnhance) pbqVar.h).setVisibility(8);
        ((TextView) pbqVar.g).setVisibility(8);
        textView3.setVisibility(8);
        textView2.setVisibility(8);
        textView3.setPaintFlags(textView3.getPaintFlags() & (-17));
        String strA = fui0Var.a();
        if (strA == null || ihc1.y0(strA)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(fui0Var.a());
        }
    }

    public final View getView() {
        return this.a.K();
    }

    public final void k(boolean z) {
        pbq pbqVar = this.a;
        ConstraintLayout constraintLayoutK = pbqVar.K();
        ViewGroup.LayoutParams layoutParams = constraintLayoutK.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.height = pbqVar.K().getResources().getDimensionPixelSize(z ? 2131166487 : 2131166488) + layoutParams.width;
            constraintLayoutK.setLayoutParams(layoutParams);
        }
    }

    public final void n(iu30 iu30Var) {
        this.a.K().setOnClickListener(new o0s(iu30Var, (byte) 11));
    }
}
