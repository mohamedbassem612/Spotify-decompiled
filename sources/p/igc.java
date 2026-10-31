package p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class igc extends jaa {
    public final vq6 e;
    public Uri f;
    public byte[] g;
    public int h;
    public int i;
    public boolean t;

    public igc(byte[] bArr) {
        vq6 vq6Var = new vq6(bArr, (byte) 27);
        super(false);
        this.e = vq6Var;
        dm5.m(bArr.length > 0);
    }

    public final void close() {
        if (this.t) {
            this.t = false;
            i();
        }
        this.f = null;
        this.g = null;
    }

    public final Uri getUri() {
        return this.f;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.i;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.g;
        bArr2.getClass();
        System.arraycopy(bArr2, this.h, bArr, i, iMin);
        this.h += iMin;
        this.i -= iMin;
        c(iMin);
        return iMin;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    public final long t(n3r n3rVar) throws DataSourceException {
        l(n3rVar);
        Uri uri = n3rVar.a;
        long j = n3rVar.g;
        this.f = uri;
        byte[] bArr = (byte[]) this.e.b;
        this.g = bArr;
        long j2 = n3rVar.f;
        if (j2 > bArr.length) {
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.h = i;
        int length = bArr.length - i;
        this.i = length;
        if (j != -1) {
            this.i = (int) Math.min(length, j);
        }
        this.t = true;
        m(n3rVar);
        return j != -1 ? j : this.i;
    }
}
