package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cd51 extends hd51 {
    public final String b;

    public cd51(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cd51) && u890.j(this.b, ((cd51) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
