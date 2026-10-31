package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lb70 extends mb70 {
    @Override // p.mb70, p.ob70, p.f770
    public final /* bridge */ /* synthetic */ void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        j((ct31) nx40Var, y570Var, l670Var);
    }

    @Override // p.mb70, p.nb70, p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        return l(context, viewGroup);
    }

    @Override // p.mb70, p.nb70, p.ob70
    /* JADX INFO: renamed from: k */
    public final void i(sx31 sx31Var, y570 y570Var) {
        super.i(sx31Var, y570Var);
        CharSequence charSequenceV = hxo1.v(((id70) y570Var.n()).a.c, y570Var.g().b("glue:accessoryAsHtml", false));
        if (TextUtils.isEmpty(charSequenceV)) {
            return;
        }
        ((wx31) sx31Var).f.setText(charSequenceV);
    }

    @Override // p.mb70, p.nb70
    /* JADX INFO: renamed from: m */
    public final sx31 l(Context context, ViewGroup viewGroup) {
        s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625041);
        wx31 wx31Var = new wx31(s7s0VarR);
        s7s0VarR.setTag(2131429011, wx31Var);
        return wx31Var;
    }
}
