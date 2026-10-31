package p;

import com.google.protobuf.Any;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class b1i {
    public final Object a(Any any) {
        try {
            return b().invoke(any);
        } catch (Throwable th) {
            n57.g("Watch Feed parsing error", th);
            return null;
        }
    }

    public iu30 b() {
        return ge7.h;
    }
}
