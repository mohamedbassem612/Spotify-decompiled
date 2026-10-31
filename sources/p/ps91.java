package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ps91 implements qs91 {
    public final String a;

    public ps91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ps91) && u890.j(this.a, ((ps91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
