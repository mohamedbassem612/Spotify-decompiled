package p;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a2r extends jaa {
    public n3r e;
    public byte[] f;
    public int g;
    public int h;

    @Override // p.o2r
    public final void close() {
        if (this.f != null) {
            this.f = null;
            i();
        }
        this.e = null;
    }

    @Override // p.o2r
    public final Uri getUri() {
        n3r n3rVar = this.e;
        if (n3rVar != null) {
            return n3rVar.a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = zoi1.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        c(iMin);
        return iMin;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.DataSourceException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws ParserException, DataSourceException {
        byte[] bArrDecode;
        l(n3rVar);
        this.e = n3rVar;
        Uri uri = n3rVar.a;
        long j = n3rVar.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        dm5.o("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zoi1.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException(h4b1.d(uriNormalizeScheme, "Unexpected URI format: "), (Throwable) null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                bArrDecode = Base64.decode(str2, 0);
                this.f = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new ParserException(l1d.m("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            bArrDecode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = bArrDecode;
        }
        long j2 = n3rVar.f;
        if (j2 > bArrDecode.length) {
            this.f = null;
            throw new DataSourceException(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArrDecode.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        m(n3rVar);
        return j != -1 ? j : this.h;
    }
}
