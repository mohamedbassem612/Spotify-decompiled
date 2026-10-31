package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mnv0 {
    public final String a;

    public mnv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mnv0)) {
            return false;
        }
        return u890.j(this.a, ((mnv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
