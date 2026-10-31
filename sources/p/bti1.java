package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bti1 implements nx40 {
    public final View a;
    public final TextView b;
    public final TextView c;

    public bti1(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.text1);
        this.c = (TextView) view.findViewById(2131431565);
    }

    public final View getView() {
        return this.a;
    }
}
