package p;

import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xx31 extends vx31 {
    public final TextView e;

    public xx31(s7s0 s7s0Var) {
        super(s7s0Var);
        TextView textView = (TextView) s7s0Var.findViewById(2131430299);
        this.e = textView;
        float[] fArr = new float[10];
        textView.getPaint().getTextWidths("0123456789", fArr);
        float f = 0.0f;
        for (int i = 0; i < 10; i++) {
            float f2 = fArr[i];
            if (f2 > f) {
                f = f2;
            }
        }
        this.e.getLayoutParams().width = (int) ((f * 2.0f) + 0.5f);
        v9w0 v9w0VarQ = b2u.q(this.a.findViewById(2131430720));
        Collections.addAll(v9w0VarQ.c, this.c, this.d, this.e);
        v9w0VarQ.a();
    }
}
