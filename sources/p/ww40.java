package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ww40 implements vw40 {
    public final View a;
    public final TextView b;
    public final TextView c;

    public ww40(View view) {
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.text1);
        TextView textView = (TextView) view.findViewById(R.id.text2);
        this.c = textView;
        r6p1.y(new TextView[]{textView});
        r6p1.w(view);
    }

    public final View getView() {
        return this.a;
    }

    @Override // p.sw40
    public final void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    @Override // p.sw40
    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
