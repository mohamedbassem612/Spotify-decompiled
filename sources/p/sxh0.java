package p;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sxh0 implements nxh0 {
    public final zih0 a;

    public sxh0(zih0 zih0Var) {
        this.a = zih0Var;
    }

    public final Single a(String str, kxh0 kxh0Var, int i) {
        return d(str).map(new x8a0(kxh0Var, str, (byte) 11));
    }

    public final Maybe b(int i, String str, String str2) {
        return d(str).map(new swg0((byte) 15)).flatMapMaybe(new hfr(str2, (byte) 6));
    }

    public final Single c(int i, String str, String str2) {
        return d(str).map(new swg0((byte) 15));
    }

    public final Single d(String str) {
        for (vih0 vih0Var : this.a.g()) {
            if (vih0Var.l().equals(str)) {
                return Single.just(vih0Var);
            }
        }
        return Single.create(new x8a0(this, str, (byte) 12));
    }
}
