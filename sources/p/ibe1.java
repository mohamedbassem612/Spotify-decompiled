package p;

import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ibe1 extends w611 {
    public final f9e1 U0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ibe1(qxx0 qxx0Var, f9e1 f9e1Var) {
        TextView textView = f9e1Var.a;
        super(textView);
        this.U0 = f9e1Var;
        textView.setOnClickListener(new gl61(qxx0Var, (byte) 8));
    }
}
