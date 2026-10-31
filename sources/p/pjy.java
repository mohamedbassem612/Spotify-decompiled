package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pjy {
    public final String a;

    public pjy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pjy) && u890.j(this.a, ((pjy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
