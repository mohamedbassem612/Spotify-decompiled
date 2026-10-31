package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oym1 {
    public final String a;

    public oym1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oym1) && u890.j(this.a, ((oym1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
