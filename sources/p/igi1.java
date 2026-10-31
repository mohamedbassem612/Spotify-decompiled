package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class igi1 implements jgi1 {
    public final String a;

    public igi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igi1) && u890.j(this.a, ((igi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
