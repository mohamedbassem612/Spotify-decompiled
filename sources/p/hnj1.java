package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hnj1 {
    public final String a;

    public hnj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnj1) && u890.j(this.a, ((hnj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
