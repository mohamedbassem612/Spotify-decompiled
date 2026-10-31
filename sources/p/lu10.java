package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lu10 implements View.OnClickListener {
    public final /* synthetic */ iu30 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ mu10 c;
    public final /* synthetic */ Consumer d;
    public final /* synthetic */ int e;

    public lu10(iu30 iu30Var, iu30 iu30Var2, mu10 mu10Var, Consumer consumer, int i) {
        this.a = iu30Var;
        this.b = iu30Var2;
        this.c = mu10Var;
        this.d = consumer;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        iac0 iac0VarH = x9p1.h(view);
        if (iac0VarH != null) {
            fn31.T(cto1.q(iac0VarH), (o8n) null, 0, new tv1(this.a, this.b, this.c, this.d, this.e, (lnm) null), 3);
        }
    }
}
