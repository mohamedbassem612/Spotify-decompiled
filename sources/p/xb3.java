package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xb3 extends k9 {
    public final Observable f(String str) {
        return k9.t0(this).b(new oi("save-for-later", new v1(str, (byte) 27))).filter(fmv.d1).map(new ycc1(str, this, (byte) 26));
    }
}
