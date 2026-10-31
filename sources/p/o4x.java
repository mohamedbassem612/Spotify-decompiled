package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o4x extends z511 {
    public final h46 d;
    public final b6 e;
    public final LayoutInflater f;
    public int g;

    public o4x(Context context, h46 h46Var, b6 b6Var) {
        this.d = h46Var;
        this.e = b6Var;
        this.f = LayoutInflater.from(context);
    }

    public final int e() {
        return ((List) this.d.b).size();
    }

    public final void n(final int i, w611 w611Var) {
        View view = w611Var.a;
        boolean z = i == this.g;
        View viewN = b8k1.n(view, 2131428608);
        ImageView imageView = (ImageView) viewN;
        Context context = imageView.getContext();
        h46 h46Var = this.d;
        imageView.setImageDrawable(context.getDrawable(((lj90) ((List) h46Var.b).get(i)).a));
        imageView.setSelected(z);
        imageView.setContentDescription(((lj90) ((List) h46Var.b).get(i)).b.c);
        ImageView imageView2 = (ImageView) viewN;
        view.setOnClickListener(new View.OnClickListener() { // from class: p.n4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                o4x o4xVar = this.a;
                b6 b6Var = o4xVar.e;
                int i2 = i;
                b6Var.invoke(Integer.valueOf(i2));
                int i3 = o4xVar.g;
                if (i2 == i3) {
                    return;
                }
                o4xVar.i(i3);
                o4xVar.i(i2);
                o4xVar.g = i2;
            }
        });
        if (z) {
            imageView2.post(new fss((Object) imageView2, (byte) 15));
        }
        View viewN2 = b8k1.n(view, 2131428609);
        viewN2.setVisibility(z ? 0 : 8);
        viewN2.setSelected(z);
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new l4x(this.f.inflate(2131625070, viewGroup, false));
    }
}
