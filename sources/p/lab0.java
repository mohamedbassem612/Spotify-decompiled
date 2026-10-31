package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lab0 {
    public final String a;

    public lab0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lab0) && u890.j(this.a, ((lab0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
