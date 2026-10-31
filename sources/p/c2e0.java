package p;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c2e0 {
    public long a;
    public n3r b;
    public long c;
    public Uri d;
    public Map e = gg11.g;
    public long f;
    public long g;

    public c2e0(long j, n3r n3rVar, long j2) {
        this.a = j;
        this.b = n3rVar;
        this.d = n3rVar.a;
        this.c = j2;
    }

    public final d2e0 a() {
        return new d2e0(this);
    }

    public final void b(long j) {
        this.g = j;
    }

    public final void c(Map map) {
        this.e = map;
    }

    public final void d(Uri uri) {
        this.d = uri;
    }
}
