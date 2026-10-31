package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class khv extends nhv {
    public final String a;

    public khv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khv) && u890.j(this.a, ((khv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
