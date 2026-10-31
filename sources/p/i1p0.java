package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.encoremobile.component.textview.EncoreTextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i1p0 implements isw {
    public final rah a;
    public final idd1 b = new idd1(new h1p0(this, (byte) 1));
    public final idd1 c = new idd1(new h1p0(this, (byte) 0));
    public final View d;
    public final /* synthetic */ int e;

    public i1p0(int i, Context context, ViewGroup viewGroup, iu30 iu30Var) {
        this.e = i;
        this.a = new rah(i, new d4e0(this, (byte) 22));
        View viewInflate = LayoutInflater.from(context).inflate(2131625319, viewGroup, false);
        viewInflate.setOnClickListener(new jn90(iu30Var, (byte) 18));
        this.d = viewInflate;
    }

    public final void a(Object obj, ysw yswVar) {
        g1p0 g1p0Var = (g1p0) obj;
        d1p0 d1p0Var = g1p0Var.a;
        Integer num = g1p0Var.b;
        this.a.a(num != null ? num.intValue() : this.e);
        EncoreTextView encoreTextView = (EncoreTextView) this.b.getValue();
        String str = d1p0Var.a;
        Integer num2 = d1p0Var.b;
        encoreTextView.setText(str);
        idd1 idd1Var = this.c;
        ((ImageView) idd1Var.getValue()).setVisibility(num2 != null ? 0 : 8);
        if (num2 != null) {
            ((ImageView) idd1Var.getValue()).setImageResource(num2.intValue());
        }
    }

    public final View getView() {
        return this.d;
    }
}
