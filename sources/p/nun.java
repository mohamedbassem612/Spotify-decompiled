package p;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nun implements k1q0 {
    public final ConstraintLayout a;

    public nun(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        nk80 nk80VarI = hsl1Var.a.i(519);
        ConstraintLayout constraintLayout = this.a;
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(2131165613);
        mun munVar = new mun((byte) 0, Math.max(nk80VarI.a, dimensionPixelSize), Math.max(nk80VarI.c, dimensionPixelSize));
        kil kilVar = new kil();
        kilVar.f(constraintLayout);
        munVar.invoke(kilVar);
        kilVar.b(constraintLayout);
        return hsl1Var;
    }

    public nun(ConstraintLayout constraintLayout, EncoreButton encoreButton, TextView textView, TextView textView2) {
        this.a = constraintLayout;
    }
}
