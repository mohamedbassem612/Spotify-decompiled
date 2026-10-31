package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c53 extends f53 {
    public final String a;

    public c53(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c53) && this.a.equals(((c53) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
