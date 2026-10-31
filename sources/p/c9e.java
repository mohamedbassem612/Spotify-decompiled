package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c9e {
    public final String a;

    public c9e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9e) && u890.j(this.a, ((c9e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
