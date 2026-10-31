package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class os91 implements qs91 {
    public final String a;

    public os91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof os91) && u890.j(this.a, ((os91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
