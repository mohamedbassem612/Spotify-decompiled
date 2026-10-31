package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9g1 implements l9g1 {
    public final String a;

    public k9g1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k9g1) && u890.j(this.a, ((k9g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
