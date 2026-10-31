package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yaj0 {
    public final String a;

    public yaj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yaj0) && u890.j(this.a, ((yaj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
