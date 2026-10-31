package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uu10 implements rv10 {
    public final String a;

    public uu10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uu10) && this.a.equals(((uu10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
