package p;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import com.comscore.streaming.ContentMediaFormat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s320 extends jaa {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    @Override // p.o2r
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.h) {
                    this.h = false;
                    i();
                }
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.h) {
                this.h = false;
                i();
            }
            throw th;
        }
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    public final int read(byte[] bArr, int i, int i2) throws DataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = zoi1.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                c(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSource$FileDataSourceException(e, 2000);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws DataSourceException {
        Uri uri = n3rVar.a;
        long j = n3rVar.f;
        this.f = uri;
        l(n3rVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = n3rVar.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new FileDataSource$FileDataSourceException(2008, null, null);
                }
                this.h = true;
                m(n3rVar);
                return this.g;
            } catch (IOException e) {
                throw new FileDataSource$FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSource$FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbN = gvg.n("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbN.append(fragment);
            throw new FileDataSource$FileDataSourceException(ContentMediaFormat.PARTIAL_CONTENT_GENERIC, e2, sbN.toString());
        } catch (SecurityException e3) {
            throw new FileDataSource$FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSource$FileDataSourceException(e4, 2000);
        }
    }
}
