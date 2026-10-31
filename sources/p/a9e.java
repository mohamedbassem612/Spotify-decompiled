package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9e implements nx40 {
    public final fta a;

    public a9e(Context context, ViewGroup viewGroup) {
        ConstraintLayout constraintLayoutInflate = LayoutInflater.from(context).inflate(2131624325, viewGroup, false);
        int i = 2131431091;
        View viewT = m5n1.t(constraintLayoutInflate, 2131431091);
        if (viewT != null) {
            i = 2131431115;
            TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431115);
            if (textView != null) {
                i = 2131431356;
                TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131431356);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = constraintLayoutInflate;
                    fta ftaVar = new fta(constraintLayout, viewT, textView, textView2, (byte) 21);
                    v9w0 v9w0VarQ = b2u.q(constraintLayout);
                    Collections.addAll(v9w0VarQ.c, textView2, textView);
                    v9w0VarQ.a();
                    this.a = ftaVar;
                    return;
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final View getView() {
        return (ConstraintLayout) this.a.b;
    }
}
