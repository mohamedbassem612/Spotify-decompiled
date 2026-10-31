package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r200 implements y600 {
    public final String a;

    public r200(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r200) && u890.j(this.a, ((r200) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
