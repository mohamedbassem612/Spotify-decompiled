package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lwj {
    public final String a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;
    public final int h;

    public /* synthetic */ lwj(String str, int i, boolean z) {
        this(str, z, "", 0, "", "", false, (i & 128) != 0 ? 1 : 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwj)) {
            return false;
        }
        lwj lwjVar = (lwj) obj;
        return u890.j(this.a, lwjVar.a) && this.b == lwjVar.b && u890.j(this.c, lwjVar.c) && this.d == lwjVar.d && u890.j(this.e, lwjVar.e) && u890.j(this.f, lwjVar.f) && this.g == lwjVar.g && this.h == lwjVar.h;
    }

    public final int hashCode() {
        return l1d.C(this.h) + xcg1.g(cy30.d(cy30.d(kaa0.f(this.d, cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public lwj(String str, boolean z, String str2, int i, String str3, String str4, boolean z2, int i2) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = z2;
        this.h = i2;
    }
}
