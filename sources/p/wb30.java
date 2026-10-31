package p;

import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wb30 extends w611 {
    public final ij90 U0;

    /* JADX WARN: Illegal instructions before constructor call */
    public wb30(xb30 xb30Var, ij90 ij90Var) {
        TextView textView = ij90Var.a;
        super(textView);
        this.U0 = ij90Var;
        textView.setOnClickListener(new zfs(xb30Var, (byte) 13));
    }
}
