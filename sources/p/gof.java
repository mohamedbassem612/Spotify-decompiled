package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gof extends jof {
    public final String a;
    public final int b;

    public gof(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gof)) {
            return false;
        }
        gof gofVar = (gof) obj;
        return u890.j(this.a, gofVar.a) && this.b == gofVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
