package p;

import android.R;
import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class vw31 extends su31 implements tw31 {
    public final TextView c;

    public vw31(s7s0 s7s0Var) {
        super(s7s0Var);
        TextView textView = (TextView) s7s0Var.findViewById(R.id.text1);
        this.c = textView;
        v9w0 v9w0VarQ = b2u.q(s7s0Var.findViewById(2131430720));
        Collections.addAll(v9w0VarQ.c, textView);
        v9w0VarQ.a();
    }

    @Override // p.tw31
    public final TextView c() {
        return this.c;
    }

    @Override // p.tw31
    public final void h(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
