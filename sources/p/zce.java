package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zce {
    public final String a;
    public final boolean b;
    public final int c;

    public zce(String str, int i, boolean z) {
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zce)) {
            return false;
        }
        zce zceVar = (zce) obj;
        return this.a.equals(zceVar.a) && this.b == zceVar.b && this.c == zceVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
