package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yd8 extends ae8 {
    public final String a;

    public yd8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd8) && this.a.equals(((yd8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
