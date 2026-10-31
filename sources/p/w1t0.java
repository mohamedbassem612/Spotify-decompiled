package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class w1t0 extends ijl1 {
    public static final /* synthetic */ int Z1 = 0;
    public y1t0 V1;
    public Scheduler W1;
    public String X1;
    public final CompositeDisposable Y1 = new CompositeDisposable();

    public final void I0(View view, Bundle bundle) {
        N0().J().a(n0(), new ydb(this, (byte) 22));
    }

    public final void c1() {
        y1t0 y1t0Var = this.V1;
        this.Y1.b(((g341) y1t0Var.b).b(Uri.parse(this.X1)).observeOn(this.W1).subscribe(new fv5(this, (byte) 9), new jld((byte) 11)));
    }

    public final void f1(String str) {
        dg30 dg30VarF0;
        if (!str.contains("#close") || (dg30VarF0 = f0()) == null) {
            return;
        }
        dg30VarF0.finish();
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        W0();
        ((ijl1) this).R1 = false;
        String string = O0().getString("pairing-url");
        if (TextUtils.isEmpty(string)) {
            this.X1 = "about:blank";
        } else {
            this.X1 = string;
        }
    }

    public final void z0() {
        this.Y1.dispose();
        super.z0();
    }
}
