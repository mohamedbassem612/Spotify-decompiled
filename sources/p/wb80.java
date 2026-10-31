package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.icons.IconX;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wb80 {
    public final ConstraintLayout a;
    public final TextView b;

    public /* synthetic */ wb80(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public static wb80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131626123, viewGroup, false);
        int i = 2131427747;
        if (m5n1.t(constraintLayoutInflate, 2131427747) != null) {
            i = 2131428647;
            if (m5n1.t(constraintLayoutInflate, 2131428647) != null) {
                i = 2131429349;
                if (((FrameLayout) m5n1.t(constraintLayoutInflate, 2131429349)) != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    int i2 = 2131431070;
                    if (m5n1.t(constraintLayoutInflate, 2131431070) != null) {
                        i2 = 2131431448;
                        if (m5n1.t(constraintLayoutInflate, 2131431448) != null) {
                            i2 = 2131431662;
                            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431662);
                            if (textView != null) {
                                return new wb80(constraintLayout, textView);
                            }
                        }
                    }
                    i = i2;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public wb80(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = constraintLayout2;
        this.b = textView;
    }

    public wb80(ConstraintLayout constraintLayout, IconX iconX, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    public wb80(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = constraintLayout2;
        this.b = textView;
    }
}
