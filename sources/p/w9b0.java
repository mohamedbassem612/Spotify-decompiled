package p;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w9b0 implements v1i {
    public final hj90 a;
    public final TextView b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public w9b0(hj90 hj90Var) {
        this.a = hj90Var;
        TextView textView = hj90Var.a;
        this.b = textView;
        TextView textView2 = hj90Var.b;
        this.c = textView2.getMaxLines();
        this.d = textView2.getTextAlignment();
        this.e = textView.getPaddingStart();
        this.f = textView.getPaddingEnd();
        this.g = textView.getPaddingTop();
        this.h = textView.getPaddingBottom();
    }

    public final View getView() {
        return this.b;
    }
}
