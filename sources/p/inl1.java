package p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol.WheelControlElementContainer;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class inl1 extends z511 {
    public final LinkedHashMap X;
    public final byte d;
    public final short e;
    public final int f;
    public final Integer g;
    public final iu30 h;
    public int i = -1;
    public final int t;

    /* JADX WARN: Multi-variable type inference failed */
    public inl1(Resources resources, int i, int i2, int i3, Integer num, int i4, iu30 iu30Var) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = num;
        this.h = iu30Var;
        this.t = resources.getDimensionPixelSize(i4);
        t0z t0zVar = gnl1.g;
        int iS = zno1.s(q7h.U(t0zVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            linkedHashMap.put(next, Integer.valueOf(resources.getDimensionPixelSize(((gnl1) next).a)));
        }
        this.X = linkedHashMap;
    }

    public final int e() {
        return ((this.e - this.d) / this.f) + 1;
    }

    public final void n(int i, w611 w611Var) {
        Integer num;
        zrj1 zrj1Var = ((hnl1) w611Var).U0;
        int i2 = (this.f * i) + this.d;
        int i3 = i2 % 50;
        gnl1 gnl1Var = gnl1.c;
        if (i3 != 0 && (num = this.g) != null) {
            gnl1Var = i2 % num.intValue() == 0 ? gnl1.d : gnl1.e;
        }
        ((TextView) zrj1Var.d).setText(i3 == 0 ? (CharSequence) this.h.invoke(Integer.valueOf(i2)) : null);
        View view = (View) zrj1Var.c;
        int iIntValue = ((Number) sqg0.G(gnl1Var, this.X)).intValue();
        if (view.getLayoutParams().height != iIntValue) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = iIntValue;
                view.setLayoutParams(layoutParams);
            }
        }
        view.setAlpha(gnl1Var.b);
        view.setBackgroundColor(i == this.i ? xfo1.r(view, 2130968788) : xfo1.r(view, 2130968787));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        WheelControlElementContainer wheelControlElementContainerL = eqq.l(viewGroup, 2131626343, viewGroup, false);
        int i2 = 2131431695;
        View viewT = m5n1.t(wheelControlElementContainerL, 2131431695);
        if (viewT != null) {
            i2 = 2131431696;
            if (((FrameLayout) m5n1.t(wheelControlElementContainerL, 2131431696)) != null) {
                i2 = 2131431697;
                TextView textView = (TextView) m5n1.t(wheelControlElementContainerL, 2131431697);
                if (textView != null) {
                    WheelControlElementContainer wheelControlElementContainer = wheelControlElementContainerL;
                    zrj1 zrj1Var = new zrj1(wheelControlElementContainer, viewT, textView, (byte) 14);
                    wheelControlElementContainer.setMinimumWidth(this.t);
                    return new hnl1(zrj1Var);
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(wheelControlElementContainerL.getResources().getResourceName(i2)));
        return null;
    }
}
