package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class DataSourceException extends IOException {
    public final int a;

    public DataSourceException(int i) {
        this.a = i;
    }

    public DataSourceException(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.a = i;
    }

    public DataSourceException(int i, Exception exc, String str) {
        super(str, exc);
        this.a = i;
    }
}
