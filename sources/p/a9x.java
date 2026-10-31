package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.buttons.EncoreButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a9x {
    public final ConstraintLayout a;
    public final TextView b;
    public final EncoreButton c;
    public final TextView d;

    public a9x(ConstraintLayout constraintLayout, TextView textView, EncoreButton encoreButton, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = encoreButton;
        this.d = textView2;
    }

    public static a9x b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131624609, viewGroup, false);
        int i = 2131429964;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131429964);
        if (textView != null) {
            i = 2131430496;
            EncoreButton encoreButtonT = m5n1.t(constraintLayoutInflate, 2131430496);
            if (encoreButtonT != null) {
                i = 2131431356;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                if (textView2 != null) {
                    return new a9x(constraintLayoutInflate, textView, encoreButtonT, textView2);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public ConstraintLayout a() {
        return this.a;
    }

    public a9x(ConstraintLayout constraintLayout, EncoreButton encoreButton, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.c = encoreButton;
        this.b = textView;
        this.d = textView2;
    }
}
