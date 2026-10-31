package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bo21 implements fo21 {
    public final String a;

    public bo21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo21) && u890.j(this.a, ((bo21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
