package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ykb {
    public final String a;
    public final String b;

    public ykb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykb)) {
            return false;
        }
        ykb ykbVar = (ykb) obj;
        return this.a.equals(ykbVar.a) && this.b.equals(ykbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
