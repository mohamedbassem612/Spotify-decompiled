package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u100 implements b600 {
    public final String a;

    public u100(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u100) && this.a.equals(((u100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
