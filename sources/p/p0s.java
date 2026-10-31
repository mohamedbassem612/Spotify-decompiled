package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p0s implements qzh {
    public final /* synthetic */ byte a;
    public final View b;
    public final TextView c;
    public final TextView d;

    public p0s(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                View viewInflate = LayoutInflater.from(context).inflate(2131625065, (ViewGroup) null);
                this.b = viewInflate;
                TextView textView = (TextView) viewInflate.findViewById(2131431483);
                this.c = textView;
                TextView textView2 = (TextView) viewInflate.findViewById(2131431482);
                this.d = textView2;
                textView.setSelected(true);
                textView2.setSelected(true);
                textView.setTextAppearance(2132018033);
                textView2.setTextAppearance(2132018032);
                break;
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(2131625065, (ViewGroup) null);
                this.b = viewInflate2;
                TextView textView3 = (TextView) viewInflate2.findViewById(2131431483);
                this.c = textView3;
                TextView textView4 = (TextView) viewInflate2.findViewById(2131431482);
                this.d = textView4;
                textView3.setSelected(true);
                textView4.setSelected(true);
                break;
        }
    }

    public final void f(Object obj) {
        byte b = this.a;
        TextView textView = this.d;
        TextView textView2 = this.c;
        switch (b) {
            case 0:
                ef50 ef50Var = (ef50) obj;
                String str = ef50Var.a;
                if (!str.contentEquals(textView2.getText())) {
                    textView2.setText(str);
                    b8k1.p(textView2, new zdc((byte) 12));
                }
                String strY0 = o7h.y0(ef50Var.b, textView.getContext().getString(2131956467), (String) null, (String) null, (iu30) null, 62);
                if (!strY0.contentEquals(textView.getText())) {
                    textView.setText(strY0);
                    b8k1.p(textView, new zdc((byte) 12));
                }
                break;
            default:
                ef50 ef50Var2 = (ef50) obj;
                String str2 = ef50Var2.a;
                if (!str2.contentEquals(textView2.getText())) {
                    textView2.setText(str2);
                    b8k1.p(textView2, new zdc((byte) 12));
                }
                String strY1 = o7h.y0(ef50Var2.b, textView.getContext().getString(2131956467), (String) null, (String) null, (iu30) null, 62);
                if (!strY1.contentEquals(textView.getText())) {
                    textView.setText(strY1);
                    b8k1.p(textView, new zdc((byte) 12));
                }
                break;
        }
    }

    public final View getView() {
        byte b = this.a;
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        byte b = this.a;
        TextView textView = this.d;
        TextView textView2 = this.c;
        switch (b) {
            case 0:
                textView2.setOnClickListener(new trr(iu30Var, (byte) 29));
                textView.setOnClickListener(new o0s(iu30Var, (byte) 0));
                break;
            default:
                textView2.setOnClickListener(new jn90(iu30Var, (byte) 13));
                textView.setOnClickListener(new jn90(iu30Var, (byte) 14));
                break;
        }
    }
}
