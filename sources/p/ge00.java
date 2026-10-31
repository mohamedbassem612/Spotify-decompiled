package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ge00 implements ke00 {
    public final String a;

    public ge00(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge00) && u890.j(this.a, ((ge00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
