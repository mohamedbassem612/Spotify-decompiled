package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wru {
    public final String a;

    public wru(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wru) && u890.j(this.a, ((wru) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + kaa0.f(0, this.a.hashCode() * 31, 31);
    }
}
