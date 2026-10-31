package p;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.session.legacy.PlaybackStateCompat;
import app.p000rive.semantics.SemanticState;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n1s extends jaa {
    public long N0;
    public boolean X;
    public int Y;
    public long Z;
    public final String e;
    public final vx40 f;
    public final vx40 g;
    public n3r h;
    public HttpURLConnection i;
    public InputStream t;

    public n1s(String str, vx40 vx40Var) {
        super(true);
        this.e = str;
        this.f = vx40Var;
        this.g = new vx40((byte) 13);
    }

    @Override // p.o2r
    public final void close() {
        try {
            InputStream inputStream = this.t;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    n3r n3rVar = this.h;
                    String str = zoi1.a;
                    throw new HttpDataSource.HttpDataSourceException(e, n3rVar, 2000, 3);
                }
            }
            this.t = null;
            n();
            if (this.X) {
                this.X = false;
                i();
            }
            this.i = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th) {
            this.t = null;
            n();
            if (this.X) {
                this.X = false;
                i();
            }
            this.i = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    @Override // p.o2r
    public final Map e() {
        HttpURLConnection httpURLConnection = this.i;
        return httpURLConnection == null ? gg11.g : new m1s(httpURLConnection.getHeaderFields());
    }

    @Override // p.o2r
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        n3r n3rVar = this.h;
        if (n3rVar != null) {
            return n3rVar.a;
        }
        return null;
    }

    public final void n() {
        HttpURLConnection httpURLConnection = this.i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                oon1.w("Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection o(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(8000);
        httpURLConnection.setReadTimeout(8000);
        HashMap map2 = new HashMap();
        map2.putAll(this.f.t());
        map2.putAll(this.g.t());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = m370.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.e;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(n3r.b(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    public final void p(long j, n3r n3rVar) throws HttpDataSource.HttpDataSourceException, IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[SemanticState.Obscured];
        while (j > 0) {
            int iMin = (int) Math.min(j, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            InputStream inputStream = this.t;
            String str = zoi1.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), n3rVar, 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource.HttpDataSourceException(n3rVar, 2008);
            }
            j -= (long) i;
            c(i);
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
                    InputStream inputStream = this.t;
                    String str = zoi1.a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 != -1) {
                        this.N0 += (long) i3;
                        c(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.t;
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
            n3r n3rVar = this.h;
            String str3 = zoi1.a;
            throw HttpDataSource.HttpDataSourceException.a(e, n3rVar, 2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$HttpDataSourceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException */
    @Override // p.o2r
    public final long t(n3r n3rVar) throws HttpDataSource.InvalidResponseCodeException, HttpDataSource.HttpDataSourceException {
        byte[] bArrB;
        this.h = n3rVar;
        long j = 0;
        this.N0 = 0L;
        this.Z = 0L;
        l(n3rVar);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            HttpURLConnection httpURLConnectionO = o(new URL(n3rVar.a.toString()), n3rVar.c, n3rVar.d, n3rVar.f, n3rVar.g, n3rVar.c(1), true, n3rVar.e);
            long j2 = n3rVar.g;
            long j3 = n3rVar.f;
            this.i = httpURLConnectionO;
            this.Y = httpURLConnectionO.getResponseCode();
            String responseMessage = httpURLConnectionO.getResponseMessage();
            int i = this.Y;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionO.getHeaderFields();
                if (this.Y == 416 && j3 == m370.c(httpURLConnectionO.getHeaderField("Content-Range"))) {
                    this.X = true;
                    m(n3rVar);
                    if (j2 != -1) {
                        return j2;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionO.getErrorStream();
                try {
                    bArrB = errorStream != null ? vgc.b(errorStream) : zoi1.b;
                } catch (IOException unused) {
                    bArrB = zoi1.b;
                }
                n();
                throw new HttpDataSource.InvalidResponseCodeException(this.Y, responseMessage, this.Y == 416 ? new DataSourceException(2008) : null, headerFields, n3rVar, bArrB);
            }
            httpURLConnectionO.getContentType();
            if (this.Y == 200 && j3 != 0) {
                j = j3;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionO.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j2 != -1) {
                this.Z = j2;
            } else {
                long jB = m370.b(httpURLConnectionO.getHeaderField("Content-Length"), httpURLConnectionO.getHeaderField("Content-Range"));
                this.Z = jB != -1 ? jB - j : -1L;
            }
            try {
                this.t = httpURLConnectionO.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.t = new GZIPInputStream(this.t);
                }
                this.X = true;
                m(n3rVar);
                try {
                    p(j, n3rVar);
                    return this.Z;
                } catch (IOException e) {
                    n();
                    if (e instanceof HttpDataSource.HttpDataSourceException) {
                        throw e;
                    }
                    throw new HttpDataSource.HttpDataSourceException(e, n3rVar, 2000, 1);
                }
            } catch (IOException e2) {
                n();
                throw new HttpDataSource.HttpDataSourceException(e2, n3rVar, 2000, 1);
            }
        } catch (IOException e3) {
            n();
            throw HttpDataSource.HttpDataSourceException.a(e3, n3rVar, 1);
        }
    }
}
