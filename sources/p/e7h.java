package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e7h {
    public final String a;
    public final boolean b;

    public e7h(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7h)) {
            return false;
        }
        e7h e7hVar = (e7h) obj;
        return this.a.equals(e7hVar.a) && this.b == e7hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
