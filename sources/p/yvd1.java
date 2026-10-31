package p;

import android.net.Uri;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yvd1 implements o2r {
    public final o2r a;
    public final vpc b;
    public boolean c;
    public long d;

    public yvd1(o2r o2rVar, vpc vpcVar) {
        o2rVar.getClass();
        this.a = o2rVar;
        vpcVar.getClass();
        this.b = vpcVar;
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.a.a(yeg1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.cache.Cache$CacheException */
    @Override // p.o2r
    public final void close() throws Cache.CacheException {
        vpc vpcVar = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (vpcVar.c == null) {
                    return;
                }
                try {
                    vpcVar.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (vpcVar.c != null) {
                    try {
                        vpcVar.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // p.o2r
    public final Map e() {
        return this.a.e();
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.a.getUri();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.cache.Cache$CacheException */
    public final int read(byte[] bArr, int i, int i2) throws Cache.CacheException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            vpc vpcVar = this.b;
            n3r n3rVar = vpcVar.c;
            if (n3rVar != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (vpcVar.g == vpcVar.d) {
                            vpcVar.a();
                            vpcVar.b(n3rVar);
                        }
                        int iMin = (int) Math.min(i3 - i4, vpcVar.d - vpcVar.g);
                        OutputStream outputStream = vpcVar.f;
                        String str = zoi1.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        vpcVar.g += j;
                        vpcVar.h += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) i3);
            }
        }
        return i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.cache.Cache$CacheException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws Cache.CacheException {
        long jT = this.a.t(n3rVar);
        this.d = jT;
        if (jT == 0) {
            return 0L;
        }
        if (n3rVar.g == -1 && jT != -1) {
            n3rVar = n3rVar.e(0L, jT);
        }
        this.c = true;
        vpc vpcVar = this.b;
        vpcVar.getClass();
        n3rVar.h.getClass();
        if (n3rVar.g == -1 && n3rVar.c(2)) {
            vpcVar.c = null;
        } else {
            vpcVar.c = n3rVar;
            vpcVar.d = n3rVar.c(4) ? vpcVar.b : Long.MAX_VALUE;
            vpcVar.h = 0L;
            try {
                vpcVar.b(n3rVar);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.d;
    }
}
