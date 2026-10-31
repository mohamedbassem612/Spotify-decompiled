package p;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class mb70 extends nb70 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mb70(fe70 fe70Var, boolean z, byte b) {
        super(fe70Var, z);
        this.g = b;
    }

    @Override // p.ob70, p.f770
    public /* bridge */ /* synthetic */ void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.g) {
            case 0:
                j((ct31) nx40Var, y570Var, l670Var);
                break;
            default:
                j((ct31) nx40Var, y570Var, l670Var);
                break;
        }
    }

    @Override // p.nb70, p.f770
    public nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.g) {
            case 0:
                return l(context, viewGroup);
            default:
                return l(context, viewGroup);
        }
    }

    @Override // p.nb70, p.ob70
    public /* bridge */ /* synthetic */ void i(ct31 ct31Var, y570 y570Var) {
        switch (this.g) {
            case 0:
                super.i((sx31) ct31Var, y570Var);
                break;
            default:
                i((sx31) ct31Var, y570Var);
                break;
        }
    }

    @Override // p.nb70
    /* JADX INFO: renamed from: k */
    public void i(sx31 sx31Var, y570 y570Var) {
        switch (this.g) {
            case 1:
                super.i(sx31Var, y570Var);
                ((xx31) sx31Var).e.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(y570Var.g().n(0, "row_number"))));
                break;
            default:
                super.i(sx31Var, y570Var);
                break;
        }
    }

    @Override // p.nb70
    public /* bridge */ /* synthetic */ ct31 l(Context context, ViewGroup viewGroup) {
        switch (this.g) {
            case 0:
                break;
        }
        return l(context, viewGroup);
    }

    @Override // p.nb70
    /* JADX INFO: renamed from: m */
    public sx31 l(Context context, ViewGroup viewGroup) {
        byte b = this.g;
        boolean z = this.f;
        switch (b) {
            case 0:
                s7s0 s7s0VarR = t890.r(context, viewGroup, z ? 2131625040 : 2131625039);
                ux31 ux31Var = new ux31(s7s0VarR);
                s7s0VarR.setTag(2131429011, ux31Var);
                return ux31Var;
            default:
                s7s0 s7s0VarR2 = t890.r(context, viewGroup, z ? 2131625044 : 2131625043);
                xx31 xx31Var = new xx31(s7s0VarR2);
                s7s0VarR2.setTag(2131429011, xx31Var);
                return xx31Var;
        }
    }
}
