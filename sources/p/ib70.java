package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class ib70 extends kb70 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib70(fe70 fe70Var, byte b) {
        super(fe70Var);
        this.f = b;
    }

    @Override // p.ob70, p.f770
    public /* bridge */ /* synthetic */ void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.f) {
            case 1:
                j((ct31) nx40Var, y570Var, l670Var);
                break;
            case 2:
                j((ct31) nx40Var, y570Var, l670Var);
                break;
            default:
                super.f(nx40Var, y570Var, l670Var, yfuVar);
                break;
        }
    }

    @Override // p.kb70, p.f770
    public nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.f) {
            case 1:
                return l(context, viewGroup);
            case 2:
                return l(context, viewGroup);
            default:
                return super.g(context, viewGroup, l670Var);
        }
    }

    @Override // p.kb70, p.ob70
    public void i(ct31 ct31Var, y570 y570Var) {
        switch (this.f) {
            case 0:
                i((tw31) ct31Var, y570Var);
                break;
            case 1:
                ((tw31) ct31Var).h(hxo1.r(y570Var));
                break;
            default:
                ((tw31) ct31Var).h(hxo1.r(y570Var));
                break;
        }
    }

    @Override // p.kb70
    /* JADX INFO: renamed from: k */
    public void i(tw31 tw31Var, y570 y570Var) {
        switch (this.f) {
            case 0:
                CharSequence charSequenceR = hxo1.r(y570Var);
                CharSequence charSequenceV = hxo1.v(((id70) y570Var.n()).a.d, y570Var.g().b("glue:descriptionAsHtml", false));
                if (!TextUtils.isEmpty(charSequenceR)) {
                    tw31Var.h(charSequenceR);
                } else if (!TextUtils.isEmpty(charSequenceV)) {
                    tw31Var.h(charSequenceV);
                }
                break;
            default:
                super.i(tw31Var, y570Var);
                break;
        }
    }

    @Override // p.kb70
    public /* bridge */ /* synthetic */ ct31 l(Context context, ViewGroup viewGroup) {
        switch (this.f) {
            case 0:
                break;
            case 1:
                break;
        }
        return l(context, viewGroup);
    }

    @Override // p.kb70
    /* JADX INFO: renamed from: m */
    public tw31 l(Context context, ViewGroup viewGroup) {
        switch (this.f) {
            case 0:
                s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625034);
                kw31 kw31Var = new kw31(s7s0VarR);
                kw31Var.a(Integer.MAX_VALUE);
                s7s0VarR.setTag(2131429011, kw31Var);
                return kw31Var;
            case 1:
                s7s0 s7s0VarR2 = t890.r(context, viewGroup, 2131625037);
                vw31 vw31Var = new vw31(s7s0VarR2);
                s7s0VarR2.setTag(2131429011, vw31Var);
                return vw31Var;
            default:
                s7s0 s7s0VarR3 = t890.r(context, viewGroup, 2131625035);
                uw31 uw31Var = new uw31(s7s0VarR3);
                s7s0VarR3.setTag(2131429011, uw31Var);
                return uw31Var;
        }
    }
}
