package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class set {
    public final String a;

    public set(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof set) && u890.j(this.a, ((set) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
