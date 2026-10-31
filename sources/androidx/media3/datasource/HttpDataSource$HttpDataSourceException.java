package androidx.media3.datasource;

import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p.eth;
import p.n3r;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final n3r b;
    public final byte c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpDataSource$HttpDataSourceException(IOException iOException, n3r n3rVar, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.b = n3rVar;
        this.c = i2;
    }

    public static HttpDataSource$HttpDataSourceException a(IOException iOException, n3r n3rVar, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = CollectionItemdata$ItemData.BAN_INTENT_ITEM_DATA_FIELD_NUMBER;
        } else {
            i2 = (message == null || !eth.W(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new HttpDataSource.CleartextNotPermittedException(iOException, n3rVar) : new HttpDataSource$HttpDataSourceException(iOException, n3rVar, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(String str, n3r n3rVar, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.b = n3rVar;
        this.c = (byte) 1;
    }

    public HttpDataSource$HttpDataSourceException(n3r n3rVar, int i) {
        super(i == 2000 ? 2001 : i);
        this.b = n3rVar;
        this.c = (byte) 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, n3r n3rVar, int i) {
        super(i == 2000 ? 2001 : i, iOException, str);
        this.b = n3rVar;
        this.c = (byte) 1;
    }
}
