package p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uh8 {
    public final y48 a;

    public uh8(y48 y48Var) {
        this.a = y48Var;
    }

    public final Single a() {
        return this.a.d(Empty.n()).map(qbo1.h);
    }
}
