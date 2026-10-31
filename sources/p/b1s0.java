package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class b1s0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c1s0 b;
    public final /* synthetic */ slc0 c;

    public /* synthetic */ b1s0(c1s0 c1s0Var, slc0 slc0Var, byte b) {
        this.a = b;
        this.b = c1s0Var;
        this.c = slc0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        slc0 slc0Var = this.c;
        c1s0 c1s0Var = this.b;
        switch (b) {
            case 0:
                c1s0Var.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    c1s0Var.a(slc0Var, 6, "");
                } else {
                    bjx bjxVar = c1s0Var.e;
                    ((CompositeDisposable) bjxVar.g).b(fq7.C((xov0) bjxVar.b).subscribe(new po5(bjxVar, slc0Var, (byte) 3)));
                    u0s0 u0s0Var = c1s0Var.c;
                    ix7 ix7Var = c1s0Var.f;
                    ix7Var.getClass();
                    u0s0Var.Y0(new q19((String) ix7Var.b, (String) ix7Var.c, (q0s0) ix7Var.d));
                }
                break;
            default:
                c1s0Var.getClass();
                c1s0Var.a(slc0Var, 7, ((Throwable) obj).getMessage());
                break;
        }
    }
}
