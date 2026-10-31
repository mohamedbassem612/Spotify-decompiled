package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sp implements Connectable, sek1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;
    public Object h;

    public sp(ajq0 ajq0Var, pp ppVar, fp fpVar, AccountSelectionActivity accountSelectionActivity) {
        this.a = (byte) 0;
        this.b = ajq0Var;
        this.c = ppVar;
        this.d = fpVar;
        this.e = accountSelectionActivity;
        this.g = r4u.c(new r4u[]{r4u.d(new mo(io.b, (byte) 0), r4u.a(new ymm0(this, (byte) 1))), r4u.d(new mo(jo.b, (byte) 0), r4u.a(new w4b1(this, (byte) 3))), r4u.d(new mo(ko.b, (byte) 0), r4u.a(new e4b1(this, (byte) 1))), r4u.d(new mo(lo.b, (byte) 0), r4u.a(new t4d1(this, (byte) 1)))});
        this.h = v8r.q(Boolean.FALSE);
        b8k1.q((EncoreTextView) ajq0Var.b, true);
        ((ComposeView) ajq0Var.e).setContent(new j2i(128463570, new qp(this, (byte) 1), true));
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                this.f = consumer;
                return new rp(this, (byte) 0);
            default:
                ((qzh) this.d).n(new w9f(this, consumer, (byte) 19));
                return new rp(this, (byte) 14);
        }
    }

    public View getView() {
        return (View) this.g;
    }

    public sp(Context context, cce cceVar, pfx pfxVar) {
        this.a = (byte) 1;
        this.b = context;
        this.c = cceVar;
        imr imrVarA = pfxVar.a((l0i) null);
        this.d = imrVarA;
        this.g = (BehaviorRetainingAppBarLayout) imrVarA.a.b;
    }
}
