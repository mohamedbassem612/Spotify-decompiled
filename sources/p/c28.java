package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c28 implements e28 {
    public final String a;

    public c28(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c28) && this.a.equals(((c28) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
