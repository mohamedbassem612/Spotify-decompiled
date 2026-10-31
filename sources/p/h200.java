package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h200 implements b600 {
    public final String a;

    public h200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h200) && this.a.equals(((h200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
