package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vjt0 implements wjt0 {
    public final String a;

    public vjt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vjt0) && u890.j(this.a, ((vjt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
