package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rkf {
    public final String a;
    public final String b;

    public rkf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkf)) {
            return false;
        }
        rkf rkfVar = (rkf) obj;
        return this.a.equals(rkfVar.a) && this.b.equals(rkfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
