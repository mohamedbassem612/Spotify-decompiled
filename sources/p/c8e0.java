package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class c8e0 {
    public final String a;

    public c8e0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8e0) && this.a.equals(((c8e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
