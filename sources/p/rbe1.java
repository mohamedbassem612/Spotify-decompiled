package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rbe1 implements sbe1 {
    public final String a;

    public rbe1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rbe1) && u890.j(this.a, ((rbe1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
