package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e8d0 {
    public final String a;

    public e8d0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8d0) && u890.j(this.a, ((e8d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
