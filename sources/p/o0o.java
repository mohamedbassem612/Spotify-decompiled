package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class o0o implements ez00 {
    public final String a;
    public final String b;

    public o0o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0o)) {
            return false;
        }
        o0o o0oVar = (o0o) obj;
        return this.a.equals(o0oVar.a) && this.b.equals(o0oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
