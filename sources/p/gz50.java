package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz50 extends dz50 implements ez50 {
    public final TextView e;
    public final TextView f;

    public gz50(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.text2);
        this.e = textView;
        textView.setVisibility(0);
        TextView textView2 = (TextView) view.findViewById(2131429973);
        this.f = textView2;
        textView2.setVisibility(0);
        TextView[] textViewArr = {textView};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        r6p1.w(view);
    }

    @Override // p.ez50
    public final void d(CharSequence charSequence) {
        this.e.setText(charSequence);
    }
}
