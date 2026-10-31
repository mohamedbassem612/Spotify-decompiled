package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ofd implements Function0 {
    public final /* synthetic */ byte a;
    public final o241 b;

    public /* synthetic */ ofd(o241 o241Var, byte b) {
        this.a = b;
        this.b = o241Var;
    }

    public final Object invoke() {
        byte b = this.a;
        p241 p241Var = this.b;
        switch (b) {
            case 0:
                return p241Var.a.map(ios.N0).distinctUntilChanged();
            case 1:
                return p241Var.a.map(as10.g).distinctUntilChanged();
            case 2:
                return yoi1.g(p241Var.a.map(ta20.g).distinctUntilChanged());
            case 3:
                return rqt0.u(hu20.c(yoi1.g(p241Var.a), new zio0(2, null, (byte) 1)));
            default:
                return p241Var.a.map(zj20.Z0).distinctUntilChanged();
        }
    }
}
