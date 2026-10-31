package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class slv implements u5y {
    @Override // p.u5y
    public final Observable a(Object obj) {
        return Observable.fromCallable(new sra((qlv) obj, (byte) 2));
    }

    @Override // p.u5y
    public final int b() {
        return 1;
    }

    @Override // p.u5y
    public final Class c() {
        return qlv.class;
    }

    @Override // p.u5y
    public final String getUri() {
        return "com.spotify.echo";
    }
}
