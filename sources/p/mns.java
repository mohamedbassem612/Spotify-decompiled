package p;

import android.content.Context;
import android.os.Trace;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mns implements qzh {
    public final Context a;
    public final View b;
    public final TextView c;
    public final ImageButton d;
    public final float e;

    public mns(Context context) {
        View viewInflate;
        this.a = context;
        this.e = a8o.y(24.0f, context.getResources());
        Trace.beginSection("ECM:SectionHeading3:inflate");
        try {
            if (((Boolean) ycn0.e.getValue()).booleanValue()) {
                viewInflate = sgc1.C(context);
            } else {
                viewInflate = LayoutInflater.from(context).inflate(2131626111, (ViewGroup) null);
                viewInflate.getClass();
            }
            Trace.endSection();
            this.b = viewInflate;
            viewInflate.setLayoutParams(new qhl(-1, -2));
            TextView textView = (TextView) viewInflate.findViewById(2131430884);
            this.c = textView;
            ImageButton imageButton = (ImageButton) viewInflate.findViewById(2131430883);
            this.d = imageButton;
            b2u.q(imageButton);
            b8k1.p(textView, zxe1.a);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void f(Object obj) {
        g4b1 g4b1Var;
        nh51 nh51Var = (nh51) obj;
        this.c.setText(nh51Var.a);
        int i = nh51Var.b;
        int i2 = i != 2 ? 0 : 8;
        ImageButton imageButton = this.d;
        imageButton.setVisibility(i2);
        if (lns.a[l1d.C(i)] == 1) {
            g4b1Var = new g4b1(this.a, j4b1.p3, this.e);
        } else {
            g4b1Var = null;
        }
        imageButton.setImageDrawable(g4b1Var);
    }

    public final View getView() {
        return this.b;
    }

    public final void n(iu30 iu30Var) {
        this.d.setOnClickListener(new sis(iu30Var, (byte) 12));
    }
}
