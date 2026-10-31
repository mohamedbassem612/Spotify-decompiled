package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bw20 implements ov20 {
    public final ezc a;

    public bw20(Observable observable) {
        this.a = yoi1.g(observable);
    }

    public final mr20 a(String str, boolean z) {
        return rqt0.u(new xv20(this.a, str, z));
    }

    public final mr20 b(String str) {
        return rqt0.u(new xs4(this.a, str, (byte) 5));
    }

    public final mr20 c(String str, String str2) {
        return rqt0.u(new x010(this.a, str, str2, (byte) 2));
    }
}
