package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qwf0 implements Consumer {
    public final /* synthetic */ hxf0 a;

    public qwf0(hxf0 hxf0Var) {
        this.a = hxf0Var;
    }

    public final void accept(Object obj) {
        twf0 twf0Var = this.a.a;
        if (twf0Var.O1 != null) {
            bvw.a(twf0Var.P0());
        } else {
            u890.C("emailClientLauncher");
            throw null;
        }
    }
}
