package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e56 {
    public final String a;

    public e56(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e56) && u890.j(this.a, ((e56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
