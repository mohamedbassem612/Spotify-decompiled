package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w8d {
    public final String a;
    public final String b;

    public w8d(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8d)) {
            return false;
        }
        w8d w8dVar = (w8d) obj;
        return u890.j(this.a, w8dVar.a) && u890.j(this.b, w8dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
