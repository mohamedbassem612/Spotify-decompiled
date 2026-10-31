package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import java.util.IllegalFormatConversionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hfl1 {
    public final ViewGroup a;
    public final TextView b;
    public final TextView c;
    public final ImageButton d;
    public final TextView e;
    public final LinearLayout f;
    public lfl1 g;

    public hfl1(LayoutInflater layoutInflater) {
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(2131626340, (ViewGroup) null);
        viewGroup.setOnClickListener(new gfl1(this, (byte) 1));
        this.a = viewGroup;
        this.b = (TextView) viewGroup.findViewById(2131431670);
        this.c = (TextView) viewGroup.findViewById(2131431666);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(2131431665);
        Context context = imageButton.getContext();
        g4b1 g4b1Var = new g4b1(context, j4b1.Q7, a8o.y(32.0f, context.getResources()));
        g4b1Var.b(context.getColor(2131104462));
        imageButton.setImageDrawable(g4b1Var);
        imageButton.setOnClickListener(new gfl1(this, (byte) 0));
        this.d = imageButton;
        this.e = (TextView) viewGroup.findViewById(2131431667);
        this.f = (LinearLayout) viewGroup.findViewById(2131431671);
    }

    public final void a(jfl1 jfl1Var) {
        TextView textView = this.b;
        String strI = null;
        textView.setText((CharSequence) null);
        TextView textView2 = this.c;
        textView2.setVisibility(0);
        textView.setVisibility(8);
        LinearLayout linearLayout = this.f;
        linearLayout.setVisibility(8);
        int i = jfl1Var.b;
        TextView textView3 = this.e;
        textView3.setBackgroundResource(i);
        String str = jfl1Var.e;
        if (str != null) {
            textView2.setText(str);
        } else {
            String str2 = jfl1Var.d;
            if (str2 != null) {
                try {
                    strI = nho1.I(this.a.getContext(), Integer.parseInt(str2));
                } catch (IllegalFormatConversionException unused) {
                    Logger.d("Bad distance: %s", new Object[]{str2});
                }
            }
            textView2.setText(strI);
            textView2.setVisibility(strI != null ? 0 : 8);
            linearLayout.setVisibility(strI != null ? 0 : 8);
        }
        this.d.setImageResource(jfl1Var.c);
        textView3.setText(jfl1Var.f);
    }

    public final ViewGroup b() {
        return this.a;
    }
}
