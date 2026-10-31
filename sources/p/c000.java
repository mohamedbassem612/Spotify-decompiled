package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c000 implements p600 {
    public final String a;

    public c000(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c000) && u890.j(this.a, ((c000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
