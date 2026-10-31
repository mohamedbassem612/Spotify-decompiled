package p;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n3r {
    public final Uri a;
    public final long b;
    public final byte c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        hph0.a("media3.datasource");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n3r(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        dm5.m(j + j2 >= 0);
        dm5.m(j2 >= 0);
        dm5.m(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
        this.j = obj;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        bhn0.w();
        return null;
    }

    public final m3r a() {
        m3r m3rVar = new m3r();
        m3rVar.a = this.a;
        m3rVar.b = this.b;
        m3rVar.c = this.c;
        m3rVar.d = this.d;
        m3rVar.e = this.e;
        m3rVar.f = this.f;
        m3rVar.g = this.g;
        m3rVar.h = this.h;
        m3rVar.i = this.i;
        m3rVar.j = this.j;
        return m3rVar;
    }

    public final boolean c(int i) {
        return (this.i & i) == i;
    }

    public final n3r d(long j) {
        long j2 = this.g;
        return e(j, j2 != -1 ? j2 - j : -1L);
    }

    public final n3r e(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new n3r(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return gvg.j(sb, this.i, "]");
    }

    public n3r(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, null, 0, null);
    }

    public n3r(Uri uri) {
        this(uri, 0L, -1L);
    }
}
