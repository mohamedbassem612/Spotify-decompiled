package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bbx {
    public final String a;

    public bbx(String str) {
        if (str != null) {
            this.a = str;
        } else {
            bhn0.i("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbx)) {
            return false;
        }
        return this.a.equals(((bbx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l1d.n(this.a, "\"}", new StringBuilder("Encoding{name=\""));
    }
}
