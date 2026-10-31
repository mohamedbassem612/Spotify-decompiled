package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kpm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public kpm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpm)) {
            return false;
        }
        kpm kpmVar = (kpm) obj;
        return this.a == kpmVar.a && this.b == kpmVar.b && this.c == kpmVar.c && this.d == kpmVar.d && this.e == kpmVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
