package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d74 implements w310 {
    public final /* synthetic */ byte a;
    public final dn3 b;
    public final o241 c;
    public final uw0 d;

    public /* synthetic */ d74(dn3 dn3Var, o241 o241Var, uw0 uw0Var, byte b) {
        this.a = b;
        this.b = dn3Var;
        this.c = o241Var;
        this.d = uw0Var;
    }

    public final Single b(r9c r9cVar) {
        byte b = this.a;
        uw0 uw0Var = this.d;
        p241 p241Var = this.c;
        switch (b) {
            case 0:
                return Single.zip(p241Var.a.firstOrError(), uw0Var.n(9).b(r9cVar), new a42(this, (byte) 15));
            default:
                return Single.zip(p241Var.a.firstOrError(), uw0Var.n(9).b(r9cVar), uw0Var.n(11).b(r9cVar), new bv40(this, (byte) 13));
        }
    }
}
