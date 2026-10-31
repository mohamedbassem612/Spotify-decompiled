package androidx.media3.datasource;

import java.io.IOException;
import p.n3r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class HttpDataSource$CleartextNotPermittedException extends HttpDataSource.HttpDataSourceException {
    public HttpDataSource$CleartextNotPermittedException(IOException iOException, n3r n3rVar) {
        super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, n3rVar, 2007);
    }
}
