package p;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class stv0 extends z511 {
    public final List d;
    public final boolean e;
    public final int f;

    public stv0(int i, List list, boolean z) {
        this.d = list;
        this.e = z;
        this.f = i;
    }

    public final int e() {
        return this.d.size();
    }

    public final int g(int i) {
        return !this.e ? 1 : 0;
    }

    public final void n(int i, w611 w611Var) {
        ptv0 ptv0Var = (ptv0) w611Var;
        boolean z = ptv0Var instanceof rtv0;
        List list = this.d;
        if (z) {
            rtv0 rtv0Var = (rtv0) ptv0Var;
            String str = ((ttv0) list.get(i)).a;
            if (str == null) {
                str = "";
            }
            boolean z2 = e() == 1;
            TextView textView = rtv0Var.U0;
            ConstraintLayout constraintLayout = rtv0Var.W0;
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), 0);
            rtv0Var.V0.setVisibility(z2 ? 8 : 0);
            textView.setTextAlignment(z2 ? 4 : 2);
            textView.setText(str);
        }
        if (ptv0Var instanceof qtv0) {
            qtv0 qtv0Var = (qtv0) ptv0Var;
            ttv0 ttv0Var = (ttv0) list.get(i);
            ConstraintLayout constraintLayout2 = qtv0Var.V0;
            constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), 0);
            Map map = mjx.a;
            ImageView imageView = qtv0Var.U0;
            Drawable drawableA = mjx.a(imageView.getResources(), ttv0Var.b, false);
            String str2 = ttv0Var.a;
            imageView.setContentDescription(str2);
            if (drawableA != null) {
                int i2 = qtv0Var.X0.f;
                Resources resources = imageView.getResources();
                ThreadLocal threadLocal = qx21.a;
                drawableA.setTint(resources.getColor(i2, null));
                imageView.setTag(Integer.valueOf(i2));
                imageView.setImageDrawable(drawableA);
            }
            TextView textView2 = qtv0Var.W0;
            textView2.setText(str2);
            String str3 = ttv0Var.c;
            if (str3 == null || str3.length() == 0) {
                return;
            }
            textView2.setTextColor(Color.parseColor(str3));
        }
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        return i == 1 ? new rtv0((ViewGroup) layoutInflaterFrom.inflate(2131625379, viewGroup, false)) : new qtv0(this, (ViewGroup) layoutInflaterFrom.inflate(2131625380, viewGroup, false));
    }
}
