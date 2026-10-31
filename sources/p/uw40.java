package p;

import android.R;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw40 implements tw40 {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final Button d;

    public uw40(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.text2);
        this.c = textView2;
        this.d = (Button) view.findViewById(2131428621);
        TextView[] textViewArr = {textView};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        TextView[] textViewArr2 = {textView2};
        r6p1.y(textViewArr2);
        r6p1.x(textViewArr2);
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
