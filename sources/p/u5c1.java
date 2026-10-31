package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u5c1 implements w5c1 {
    public final String a;

    public u5c1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5c1) && u890.j(this.a, ((u5c1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
