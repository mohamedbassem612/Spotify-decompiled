package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z4h implements b5h {
    public final String a;

    public z4h(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4h) && u890.j(this.a, ((z4h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
