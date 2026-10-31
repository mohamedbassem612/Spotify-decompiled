package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpf {
    public final String a;
    public final String b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public gpf(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpf)) {
            return false;
        }
        gpf gpfVar = (gpf) obj;
        return u890.j(this.a, gpfVar.a) && u890.j(this.b, gpfVar.b) && this.c == gpfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
