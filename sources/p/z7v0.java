package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z7v0 extends b8v0 {
    public final String a;

    public z7v0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7v0) && u890.j(this.a, ((z7v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
