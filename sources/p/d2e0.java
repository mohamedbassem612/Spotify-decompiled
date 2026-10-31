package p;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d2e0 {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final n3r b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public d2e0(c2e0 c2e0Var) {
        this.a = c2e0Var.a;
        this.b = c2e0Var.b;
        this.c = c2e0Var.d;
        this.d = c2e0Var.e;
        this.e = c2e0Var.c;
        this.f = c2e0Var.f;
        this.g = c2e0Var.g;
    }

    public final c2e0 a() {
        c2e0 c2e0Var = new c2e0();
        c2e0Var.a = this.a;
        c2e0Var.b = this.b;
        c2e0Var.d = this.c;
        c2e0Var.e = this.d;
        c2e0Var.c = this.e;
        c2e0Var.f = this.f;
        c2e0Var.g = this.g;
        return c2e0Var;
    }

    public d2e0(long j, n3r n3rVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = j;
        this.b = n3rVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
