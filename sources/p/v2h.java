package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v2h {
    public final boolean a;
    public final String b;

    public v2h(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2h)) {
            return false;
        }
        v2h v2hVar = (v2h) obj;
        return this.a == v2hVar.a && this.b.equals(v2hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
