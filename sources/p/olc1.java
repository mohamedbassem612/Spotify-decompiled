package p;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class olc1 implements mto0 {
    public final bi90 a;

    public olc1(bi90 bi90Var) {
        this.a = bi90Var;
    }

    public final void a(Context context, nx40 nx40Var) {
        String str;
        su31 su31Var = (tw31) nx40Var;
        TextView textViewC = su31Var.c();
        rh90 rh90Var = this.a;
        if (rh90Var instanceof rh90) {
            str = rh90Var.c;
        } else {
            if (!(rh90Var instanceof mh90)) {
                eg.o();
                return;
            }
            str = ((mh90) rh90Var).c;
        }
        textViewC.setText(str);
        su31Var.c().setTextAppearance(2132018004);
        ((View) su31Var.b.d).setVisibility(4);
    }
}
