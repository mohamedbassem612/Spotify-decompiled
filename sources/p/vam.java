package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vam implements wam {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final Uri g;

    public vam(String str, String str2, String str3, long j, String str4, String str5, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
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
        if (!(obj instanceof vam)) {
            return false;
        }
        vam vamVar = (vam) obj;
        if (!u890.j(this.a, vamVar.a) || !u890.j(this.b, vamVar.b) || !this.c.equals(vamVar.c)) {
            return false;
        }
        long j = vamVar.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && this.e.equals(vamVar.e) && this.f.equals(vamVar.f) && this.g.equals(vamVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        int i = u7h.l;
        return this.g.hashCode() + cy30.d(cy30.d(cy30.f(iD, this.d, 31), 31, this.e), 31, this.f);
    }
}
