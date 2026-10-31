package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uam implements wam {
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final Uri g;

    public uam(String str, int i, String str2, long j, String str3, String str4, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = uri;
    }

    @Override // p.wam
    public final String a() {
        return this.e;
    }

    @Override // p.wam
    public final Uri b() {
        return this.g;
    }

    @Override // p.wam
    public final String c() {
        return this.f;
    }

    @Override // p.wam
    public final long d() {
        return this.d;
    }

    @Override // p.wam
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uam)) {
            return false;
        }
        uam uamVar = (uam) obj;
        if (!u890.j(this.a, uamVar.a) || this.b != uamVar.b || !u890.j(this.c, uamVar.c)) {
            return false;
        }
        long j = uamVar.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e.equals(uamVar.e) && this.f.equals(uamVar.f) && this.g.equals(uamVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        int i = u7h.l;
        return this.g.hashCode() + cy30.d(cy30.d(cy30.f(iD, this.d, 31), 31, this.e), 31, this.f);
    }
}
