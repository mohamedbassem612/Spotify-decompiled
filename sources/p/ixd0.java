package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ixd0 implements rxd0 {
    public final String a;

    public ixd0(String str, int i) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ixd0) && u890.j(this.a, ((ixd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
