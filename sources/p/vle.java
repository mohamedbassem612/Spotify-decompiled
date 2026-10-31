package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vle implements wle {
    public final String a;
    public final String b;

    public vle(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vle)) {
            return false;
        }
        vle vleVar = (vle) obj;
        return u890.j(this.a, vleVar.a) && u890.j(this.b, vleVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
