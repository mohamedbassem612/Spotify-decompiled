package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e2o1 {
    public final String a;

    public e2o1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e2o1) {
            return this.a.equals(((e2o1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return l1d.n(this.a, "}", new StringBuilder("AddonExceptionMetadata{packageName="));
    }
}
