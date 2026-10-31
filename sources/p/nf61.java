package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nf61 {
    public final PublishSubject a;

    public nf61(PublishSubject publishSubject) {
        this.a = publishSubject;
    }

    public static /* synthetic */ Observable b(nf61 nf61Var, Single single, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        return nf61Var.a(single, null, str, null, null);
    }

    public final Observable a(Single single, Boolean bool, String str, String str2, Single single2) {
        Single map;
        if (single2 == null || (map = single2.flatMap(new zgz0(single, (byte) 24))) == null) {
            map = single.map(p5x0.X);
        }
        return map.map(new r961(str, str2, bool, (byte) 1)).flatMapObservable(new m7y0(this, (byte) 27));
    }
}
