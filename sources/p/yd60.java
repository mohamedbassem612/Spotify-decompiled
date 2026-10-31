package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yd60 {
    public final String a;

    public yd60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yd60) && u890.j(this.a, ((yd60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
