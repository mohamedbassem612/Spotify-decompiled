package p;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m3r {
    public Uri a;
    public long b;
    public byte[] d;
    public long f;
    public String h;
    public int i;
    public Object j;
    public byte c = 1;
    public Map e = Collections.EMPTY_MAP;
    public long g = -1;

    public final n3r a() {
        dm5.s(this.a, "The uri must be set.");
        return new n3r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b() {
        this.i = 1;
    }

    public final void c(byte[] bArr) {
        this.d = bArr;
    }

    public final void d() {
        this.c = (byte) 2;
    }

    public final void e(Map map) {
        this.e = map;
    }

    public final void f(String str) {
        this.a = Uri.parse(str);
    }
}
