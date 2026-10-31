package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iz61 extends fuo1 {
    public final String b;

    public iz61(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iz61) && u890.j(this.b, ((iz61) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
