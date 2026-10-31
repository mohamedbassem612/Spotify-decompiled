package p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class cz50 implements bz50 {
    public final View a;
    public final TextView b;

    public cz50(View view) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.b = textView;
        TextView[] textViewArr = {textView};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        r6p1.w(view);
    }

    @Override // p.bz50
    public int g() {
        return this.a.getMeasuredWidth() / 2;
    }

    public final View getView() {
        return this.a;
    }

    @Override // p.bz50
    public int j() {
        return this.a.getHeight() / 2;
    }

    @Override // p.bz50
    public boolean p() {
        return false;
    }

    public final void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
