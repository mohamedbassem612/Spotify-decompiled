package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pto0 implements nx40 {
    public final ewn0 a;

    public pto0(Context context, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131625304, viewGroup, false);
        int i = 2131428438;
        if (((TextView) m5n1.t(constraintLayoutInflate, 2131428438)) != null) {
            i = 2131431356;
            if (((TextView) m5n1.t(constraintLayoutInflate, 2131431356)) != null) {
                this.a = new ewn0((Object) constraintLayoutInflate, (byte) 4);
                return;
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final View getView() {
        return (ConstraintLayout) this.a.b;
    }
}
