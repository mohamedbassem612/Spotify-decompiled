package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ic1 {
    public final String a;

    public ic1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic1) && u890.j(this.a, ((ic1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
