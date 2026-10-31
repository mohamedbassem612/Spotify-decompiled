package androidx.media3.datasource;

import java.util.Map;
import p.f4i1;
import p.n3r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int d;
    public final String e;
    public final Map f;
    public final byte[] g;

    public HttpDataSource$InvalidResponseCodeException(int i, String str, DataSourceException dataSourceException, Map map, n3r n3rVar, byte[] bArr) {
        super(f4i1.c(i, "Response code: "), dataSourceException, n3rVar, 2004);
        this.d = i;
        this.e = str;
        this.f = map;
        this.g = bArr;
    }
}
