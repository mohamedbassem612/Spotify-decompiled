package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class um80 implements an80 {
    public final String a;

    public um80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um80) && this.a.equals(((um80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
