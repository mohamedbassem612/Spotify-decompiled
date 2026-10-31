package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i540 implements k540 {
    public final String a;

    public i540(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i540) && this.a.equals(((i540) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
