package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u111 extends x111 {
    public final String a;

    public u111(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u111) && u890.j(this.a, ((u111) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
