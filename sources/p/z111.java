package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z111 extends d211 {
    public final String a;

    public z111(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z111) && u890.j(this.a, ((z111) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
