package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qnj0 extends snj0 {
    public final String b;

    public qnj0(String str) {
        super(false);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qnj0) && u890.j(this.b, ((qnj0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
