package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zxy0 {
    public final kly0 a;

    public zxy0(caq caqVar) {
        this.a = caqVar;
    }

    public final Single a() {
        return Single.create(new c1y0(this, (byte) 19)).doOnError(new jld((byte) 17));
    }
}
