package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fx7 extends oto1 {
    public final String b;

    public fx7(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx7) && this.b.equals(((fx7) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
