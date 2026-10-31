package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tyz implements y600 {
    public final String a;

    public tyz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyz) && u890.j(this.a, ((tyz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
