package p;

import android.R;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class bh51 implements nx40 {
    public final View a;
    public final TextView b;
    public CharSequence c;
    public final g4b1 d;
    public boolean e;

    public bh51(View view, boolean z) {
        this.a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.b = textView;
        if (z) {
            textView.setGravity(8388611);
        }
        g4b1 g4b1Var = new g4b1(textView.getContext(), j4b1.O1, textView.getTextSize() / 2.0f);
        this.d = g4b1Var;
        int iY = a8o.y(6.0f, textView.getResources());
        pyp0 pyp0Var = g4b1Var.m;
        pyp0Var.y(iY, 0);
        g4b1Var.n = pyp0Var;
        g4b1Var.invalidateSelf();
        g4b1Var.setBounds(0, 0, g4b1Var.n.l(), g4b1Var.n.j());
        TextView[] textViewArr = {textView};
        r6p1.y(textViewArr);
        r6p1.x(textViewArr);
        r6p1.w(view);
        if (textView.isDuplicateParentStateEnabled()) {
            ph5.l(view);
        } else {
            ph5.l(textView);
        }
    }

    public final void a() {
        SpannableString spannableString;
        CharSequence charSequence = this.c;
        int i = charSequence != null ? 0 : 8;
        TextView textView = this.b;
        textView.setVisibility(i);
        if (!this.e || charSequence == null) {
            textView.setText(this.c);
            return;
        }
        g4b1 g4b1Var = this.d;
        String strA = g4b1Var.a();
        int iY = a8o.y(6.0f, textView.getResources());
        boolean zS = bno1.s(this.a.getContext());
        pyp0 pyp0Var = g4b1Var.m;
        if (zS) {
            pyp0Var.y(0, iY);
            g4b1Var.n = pyp0Var;
            g4b1Var.invalidateSelf();
            spannableString = new SpannableString(f4i1.e(strA, String.valueOf(charSequence)));
            spannableString.setSpan(new i4b1(g4b1Var, 4, 0), 0, 1, 18);
        } else {
            pyp0Var.y(iY, 0);
            g4b1Var.n = pyp0Var;
            g4b1Var.invalidateSelf();
            spannableString = new SpannableString(l1d.m(String.valueOf(charSequence), strA));
            spannableString.setSpan(new i4b1(g4b1Var, 4, 0), charSequence.length(), charSequence.length() + 1, 18);
        }
        textView.setText(spannableString);
    }

    public final View getView() {
        return this.a;
    }
}
