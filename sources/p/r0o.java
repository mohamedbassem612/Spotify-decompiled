package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r0o {
    public final String a;
    public final String b;

    public r0o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0o)) {
            return false;
        }
        r0o r0oVar = (r0o) obj;
        return this.a.equals(r0oVar.a) && this.b.equals(r0oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
