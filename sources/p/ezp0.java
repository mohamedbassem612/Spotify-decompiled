package p;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ezp0 extends jaa {
    public boolean X;
    public long Y;
    public long Z;
    public final cxc e;
    public final vx40 f;
    public final vx40 g;
    public n3r h;
    public ry21 i;
    public InputStream t;

    static {
        hph0.a("goog.exo.okhttp");
    }

    public ezp0(cxc cxcVar, vx40 vx40Var) {
        super(true);
        cxcVar.getClass();
        this.e = cxcVar;
        this.g = vx40Var;
        this.f = new vx40((byte) 13);
    }

    @Override // p.o2r
    public final void close() {
        if (this.X) {
            this.X = false;
            i();
            n();
        }
    }

    @Override // p.o2r
    public final Map e() {
        ry21 ry21Var = this.i;
        return ry21Var == null ? Collections.EMPTY_MAP : ry21Var.f.d();
    }

    @Override // p.o2r
    public final Uri getUri() {
        ry21 ry21Var = this.i;
        if (ry21Var == null) {
            return null;
        }
        return Uri.parse(ry21Var.a.a.i);
    }

    public final void n() {
        ry21 ry21Var = this.i;
        if (ry21Var != null) {
            uz21 uz21Var = ry21Var.g;
            uz21Var.getClass();
            uz21Var.close();
            this.i = null;
        }
        this.t = null;
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
                InputStream inputStream = this.t;
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
            long j = this.Y;
            if (j != -1) {
                long j2 = j - this.Z;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.t;
                    String str = zoi1.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.Z += (long) i3;
                        c(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.t;
                String str2 = zoi1.a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 != -1) {
                    this.Z += (long) i3;
                    c(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            n3r n3rVar = this.h;
            String str3 = zoi1.a;
            throw HttpDataSource.HttpDataSourceException.a(e, n3rVar, 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws HttpDataSource.InvalidResponseCodeException, HttpDataSource.HttpDataSourceException {
        l370 l370VarB;
        long j;
        sn21 sn21Var;
        byte[] bArrB;
        n3r n3rVar2 = n3rVar;
        this.h = n3rVar2;
        this.Z = 0L;
        this.Y = 0L;
        l(n3rVar);
        long j2 = n3rVar2.f;
        byte b = n3rVar2.c;
        long j3 = n3rVar2.g;
        String string = n3rVar2.a.toString();
        try {
            k370 k370Var = new k370();
            k370Var.f((l370) null, string);
            l370VarB = k370Var.b();
        } catch (IllegalArgumentException unused) {
            l370VarB = null;
        }
        if (l370VarB == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", n3rVar2, ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
        }
        ne neVar = new ne((byte) 9);
        neVar.a = l370VarB;
        HashMap map = new HashMap();
        map.putAll(this.g.t());
        map.putAll(this.f.t());
        map.putAll(n3rVar2.e);
        for (Map.Entry entry : map.entrySet()) {
            neVar.G((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = m370.a(j2, j3);
        if (strA != null) {
            neVar.d("Range", strA);
        }
        if (!n3rVar2.c(1)) {
            neVar.d("Accept-Encoding", "identity");
        }
        byte[] bArr = n3rVar2.d;
        if (bArr != null) {
            int length = bArr.length;
            j = 0;
            w4n1.a(bArr.length, 0L, length);
            sn21Var = new sn21(length, (r8i0) null, bArr);
        } else {
            j = 0;
            if (b == 2) {
                byte[] bArr2 = zoi1.b;
                int length2 = bArr2.length;
                w4n1.a(bArr2.length, 0L, length2);
                sn21Var = new sn21(length2, (r8i0) null, bArr2);
            } else {
                sn21Var = null;
            }
        }
        neVar.L(n3r.b(b), sn21Var);
        jf01 jf01VarA = this.e.a(new ln21(neVar));
        try {
            try {
                m(n3rVar);
                em61 em61Var = new em61();
                jf01VarA.d(new hvp0(em61Var, (byte) 1));
                try {
                    ry21 ry21Var = (ry21) em61Var.get();
                    this.i = ry21Var;
                    uz21 uz21Var = ry21Var.g;
                    uz21Var.getClass();
                    this.t = uz21Var.a();
                    int i = ry21Var.d;
                    if (ry21Var.Q0) {
                        uz21Var.e();
                        long j4 = (i != 200 || j2 == j) ? j : j2;
                        if (j3 != -1) {
                            this.Y = j3;
                        } else {
                            long jD = uz21Var.d();
                            this.Y = jD != -1 ? jD - j4 : -1L;
                        }
                        this.X = true;
                        try {
                            o(j4, n3rVar);
                            return this.Y;
                        } catch (HttpDataSource.HttpDataSourceException e) {
                            n();
                            throw e;
                        }
                    }
                    if (i == 416 && j2 == m370.c(ry21Var.f.c("Content-Range"))) {
                        this.X = true;
                        return j3 != -1 ? j3 : j;
                    }
                    try {
                        InputStream inputStream = this.t;
                        inputStream.getClass();
                        String str = zoi1.a;
                        bArrB = vgc.b(inputStream);
                    } catch (IOException unused2) {
                        bArrB = zoi1.b;
                    }
                    byte[] bArr3 = bArrB;
                    if (i == 504 && ry21Var.a.a().j) {
                        throw new HttpDataSource.HttpDataSourceException(new NetworkAccessWhileInOfflineModeException(), n3rVar, 2000, 1);
                    }
                    TreeMap treeMapD = ry21Var.f.d();
                    n();
                    throw new HttpDataSource.InvalidResponseCodeException(i, ry21Var.c, i == 416 ? new DataSourceException(2008) : null, treeMapD, n3rVar, bArr3);
                } catch (InterruptedException unused3) {
                    jf01VarA.cancel();
                    throw new InterruptedIOException();
                } catch (ExecutionException e2) {
                    throw new IOException(e2);
                }
            } catch (IOException e3) {
                e = e3;
                throw HttpDataSource.HttpDataSourceException.a(e, n3rVar2, 1);
            }
        } catch (IOException e4) {
            e = e4;
            n3rVar2 = n3rVar;
            throw HttpDataSource.HttpDataSourceException.a(e, n3rVar2, 1);
        }
    }
}
