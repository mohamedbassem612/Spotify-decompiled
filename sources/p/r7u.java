package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r7u {
    public final String a;
    public final String b;

    public r7u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7u)) {
            return false;
        }
        r7u r7uVar = (r7u) obj;
        return this.a.equals(r7uVar.a) && this.b.equals(r7uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
