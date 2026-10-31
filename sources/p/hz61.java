package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hz61 extends fuo1 {
    public final String b;

    public hz61(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz61) && u890.j(this.b, ((hz61) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
