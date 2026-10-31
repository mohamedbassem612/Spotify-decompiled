package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g2t implements feh1 {
    public final idd1 a;
    public final /* synthetic */ p811 b;

    public g2t(Activity activity, pz11 pz11Var, xav0 xav0Var, p811 p811Var) {
        this.b = p811Var;
        this.a = new idd1(new f2t(activity, pz11Var, xav0Var));
    }

    @Override // p.luk
    public final pdy0 e(ydy0 ydy0Var) {
        Object obj = this.b.a;
        return obj != null ? ((feh1) obj).e(ydy0Var) : ydy0Var.create((aey0) this.a.getValue());
    }
}
