package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zeh implements afh {
    public final String a;
    public final int b;
    public final int c;

    public zeh(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeh)) {
            return false;
        }
        zeh zehVar = (zeh) obj;
        return this.a.equals(zehVar.a) && this.b == zehVar.b && this.c == zehVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
