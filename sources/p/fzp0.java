package p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fzp0 extends jaa {
    public long N0;
    public InputStream X;
    public boolean Y;
    public long Z;
    public final cxc e;
    public final vx40 f;
    public final String g;
    public final vx40 h;
    public n3r i;
    public ry21 t;

    static {
        hph0.a("media3.datasource.okhttp");
    }

    public fzp0(cxc cxcVar, String str, vx40 vx40Var) {
        super(true);
        cxcVar.getClass();
        this.e = cxcVar;
        this.g = str;
        this.h = vx40Var;
        this.f = new vx40((byte) 13);
    }

    @Override // p.o2r
    public final void close() {
        if (this.Y) {
            this.Y = false;
            i();
            n();
        }
        this.t = null;
        this.i = null;
    }

    @Override // p.o2r
    public final Map e() {
        ry21 ry21Var = this.t;
        return ry21Var == null ? Collections.EMPTY_MAP : ry21Var.f.d();
    }

    @Override // p.o2r
    public final Uri getUri() {
        ry21 ry21Var = this.t;
        if (ry21Var != null) {
            return Uri.parse(ry21Var.a.a.i);
        }
        n3r n3rVar = this.i;
        if (n3rVar != null) {
            return n3rVar.a;
        }
        return null;
    }

    public final void n() {
        ry21 ry21Var = this.t;
        if (ry21Var != null) {
            uz21 uz21Var = ry21Var.g;
            uz21Var.getClass();
            uz21Var.close();
        }
        this.X = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    public final void o(long j, n3r n3rVar) throws HttpDataSource.HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[SemanticState.Obscured];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                InputStream inputStream = this.X;
                String str = zoi1.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource.HttpDataSourceException(n3rVar, 2008);
                }
                j -= (long) i;
                c(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource.HttpDataSourceException)) {
                    throw new HttpDataSource.HttpDataSourceException(n3rVar, 2000);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    public final int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.Z;
            if (j != -1) {
                long j2 = j - this.N0;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.X;
                    String str = zoi1.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.N0 += (long) i3;
                        c(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.X;
                String str2 = zoi1.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.N0 += (long) i3;
                    c(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            n3r n3rVar = this.i;
            String str3 = zoi1.a;
            throw HttpDataSource.HttpDataSourceException.a(e, n3rVar, 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws HttpDataSource.InvalidResponseCodeException, HttpDataSource.HttpDataSourceException {
        l370 l370VarB;
        byte[] bArrB;
        this.i = n3rVar;
        long j = 0;
        this.N0 = 0L;
        this.Z = 0L;
        l(n3rVar);
        long j2 = n3rVar.f;
        byte b = n3rVar.c;
        long j3 = n3rVar.g;
        String string = n3rVar.a.toString();
        try {
            k370 k370Var = new k370();
            k370Var.f((l370) null, string);
            l370VarB = k370Var.b();
        } catch (IllegalArgumentException unused) {
            l370VarB = null;
        }
        if (l370VarB == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", n3rVar, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
        }
        ne neVar = new ne((byte) 9);
        neVar.a = l370VarB;
        HashMap map = new HashMap();
        map.putAll(this.h.t());
        map.putAll(this.f.t());
        map.putAll(n3rVar.e);
        for (Map.Entry entry : map.entrySet()) {
            neVar.G((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = m370.a(j2, j3);
        if (strA != null) {
            neVar.d("Range", strA);
        }
        String str = this.g;
        if (str != null) {
            neVar.d("User-Agent", str);
        }
        if (!n3rVar.c(1)) {
            neVar.d("Accept-Encoding", "identity");
        }
        byte[] bArr = n3rVar.d;
        neVar.L(n3r.b(b), bArr != null ? zov0.d(7, (r8i0) null, bArr) : b == 2 ? zov0.d(7, (r8i0) null, zoi1.b) : null);
        jf01 jf01VarA = this.e.a(new ln21(neVar));
        try {
            em61 em61Var = new em61();
            jf01VarA.d(new uip0(em61Var, (byte) 4));
            try {
                ry21 ry21Var = (ry21) em61Var.get();
                this.t = ry21Var;
                uz21 uz21Var = ry21Var.g;
                uz21Var.getClass();
                this.X = uz21Var.a();
                int i = ry21Var.d;
                if (!ry21Var.Q0) {
                    if (i == 416 && j2 == m370.c(ry21Var.f.c("Content-Range"))) {
                        this.Y = true;
                        m(n3rVar);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.X;
                        inputStream.getClass();
                        bArrB = vgc.b(inputStream);
                    } catch (IOException unused2) {
                        bArrB = zoi1.b;
                    }
                    byte[] bArr2 = bArrB;
                    TreeMap treeMapD = ry21Var.f.d();
                    n();
                    throw new HttpDataSource.InvalidResponseCodeException(i, ry21Var.c, i == 416 ? new DataSourceException(2008) : null, treeMapD, n3rVar, bArr2);
                }
                uz21Var.e();
                if (i == 200 && j2 != 0) {
                    j = j2;
                }
                if (j3 != -1) {
                    this.Z = j3;
                } else {
                    String strC = ry21Var.f.c("Content-Length");
                    if (strC == null) {
                        strC = null;
                    }
                    DataSourceException dataSourceExceptionC = ry21Var.f.c("Content-Range");
                    long jB = m370.b(strC, dataSourceExceptionC != null ? dataSourceExceptionC : null);
                    this.Z = jB != -1 ? jB - j : -1L;
                }
                this.Y = true;
                m(n3rVar);
                try {
                    o(j, n3rVar);
                    return this.Z;
                } catch (HttpDataSource.HttpDataSourceException e) {
                    n();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                jf01VarA.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw HttpDataSource.HttpDataSourceException.a(e3, n3rVar, 1);
        }
    }
}
