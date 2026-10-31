package p;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public class nb70 extends ob70 {
    public final boolean f;

    public nb70(fe70 fe70Var, boolean z) {
        super(fe70Var, sx31.class);
        this.f = z;
    }

    @Override // p.f770
    public nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        return l(context, viewGroup);
    }

    @Override // p.ob70
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void i(sx31 sx31Var, y570 y570Var) {
        sx31Var.setTitle(hxo1.r(y570Var));
        CharSequence charSequenceQ = hxo1.q(y570Var);
        if (TextUtils.isEmpty(charSequenceQ)) {
            sx31Var.setSubtitle(null);
            return;
        }
        if (y570Var.g().F("glue:subtitleStyle", "").equals("metadata")) {
            sx31Var.m(charSequenceQ);
        } else {
            sx31Var.setSubtitle(charSequenceQ);
        }
        TextView subtitleView = sx31Var.getSubtitleView();
        String strB = y570Var.g().B("label");
        r4p1.h(subtitleView.getContext(), subtitleView, strB != null ? strB : "");
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public sx31 l(Context context, ViewGroup viewGroup) {
        s7s0 s7s0VarR = t890.r(context, viewGroup, this.f ? 2131625042 : 2131625038);
        vx31 vx31Var = new vx31(s7s0VarR);
        s7s0VarR.setTag(2131429011, vx31Var);
        return vx31Var;
    }
}
