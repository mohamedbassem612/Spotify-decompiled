package p;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.Button;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h770 extends i770 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h770(byte b) {
        super(tw40.class, (byte) 0);
        this.d = b;
        switch (b) {
            case 1:
                super(vw40.class, (byte) 0);
                break;
            default:
                break;
        }
    }

    @Override // p.i770, p.f770
    public final void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.d) {
            case 0:
                uw40 uw40Var = (uw40) ((tw40) nx40Var);
                uw40Var.setTitle(((id70) y570Var.n()).a.a);
                uw40Var.setSubtitle(((id70) y570Var.n()).a.b);
                String strB = y570Var.g().B("buttonTitle");
                Button button = uw40Var.d;
                button.setText(strB);
                two1.r(l670Var, button, y570Var);
                break;
            default:
                sw40 sw40Var = (sw40) nx40Var;
                sw40Var.setTitle(((id70) y570Var.n()).a.a);
                sw40Var.setSubtitle(((id70) y570Var.n()).a.b);
                break;
        }
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.d) {
            case 0:
                return xw40.a(context, viewGroup);
            default:
                return xw40.b(context, viewGroup);
        }
    }
}
