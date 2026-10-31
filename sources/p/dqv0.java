package p;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dqv0 extends z511 {
    public final ArrayList d;
    public final int e;

    public dqv0(int i, ArrayList arrayList) {
        this.d = arrayList;
        this.e = i;
    }

    public final int e() {
        return this.d.size();
    }

    public final void n(int i, w611 w611Var) {
        int i2;
        cqv0 cqv0Var = (cqv0) w611Var;
        fqv0 fqv0Var = (fqv0) this.d.get(i);
        int i3 = this.e;
        if (i3 == 1) {
            i2 = 2131101551;
        } else {
            if (i3 != 2) {
                throw null;
            }
            i2 = 2131104462;
        }
        cqv0Var.V0.setText(fqv0Var.a);
        String str = fqv0Var.b;
        ImageView imageView = cqv0Var.U0;
        Resources resources = imageView.getContext().getResources();
        Map map = mjx.a;
        resources.getClass();
        Drawable drawableA = mjx.a(resources, str, true);
        if (drawableA != null) {
            ThreadLocal threadLocal = qx21.a;
            drawableA.setTint(resources.getColor(i2, null));
            imageView.setTag(Integer.valueOf(i2));
            imageView.setImageDrawable(drawableA);
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        return new cqv0((ViewGroup) eqq.l(viewGroup, 2131625443, viewGroup, false));
    }
}
