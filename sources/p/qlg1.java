package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qlg1 extends nmn1 {
    public final String b;

    public qlg1(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qlg1) && u890.j(this.b, ((qlg1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
