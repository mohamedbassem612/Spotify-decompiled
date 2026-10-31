package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jhj0 extends lhj0 {
    public final String a;

    public jhj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhj0) && this.a.equals(((jhj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
