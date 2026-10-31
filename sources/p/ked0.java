package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ked0 implements ned0 {
    public final String a;

    public ked0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ked0) && u890.j(this.a, ((ked0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
