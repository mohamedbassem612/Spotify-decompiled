package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kud1 implements nud1 {
    public final String a;

    public kud1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kud1) && u890.j(this.a, ((kud1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
