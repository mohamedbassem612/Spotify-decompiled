package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t8t {
    public final String a;
    public final boolean b;

    public t8t(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8t)) {
            return false;
        }
        t8t t8tVar = (t8t) obj;
        return this.a.equals(t8tVar.a) && this.b == t8tVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
