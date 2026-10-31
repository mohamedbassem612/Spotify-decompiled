package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nns implements qzh {
    public final ntv0 a;

    public nns(Context context) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131626115, (ViewGroup) null, false);
        EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430897);
        if (encoreButtonT != null) {
            this.a = new ntv0(constraintLayoutInflate, encoreButtonT);
        } else {
            bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(2131430897)));
            throw null;
        }
    }

    public final void f(Object obj) {
        String str = ((zj51) obj).a;
        if (str != null) {
            this.a.b.setText(str);
        }
    }

    public final View getView() {
        return this.a.a;
    }

    public final void n(iu30 iu30Var) {
        this.a.b.setOnClickListener(new sis(iu30Var, (byte) 13));
    }
}
