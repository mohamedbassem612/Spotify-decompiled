package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nmk implements omk {
    public final String a;
    public final String b;

    public nmk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmk)) {
            return false;
        }
        nmk nmkVar = (nmk) obj;
        return u890.j(this.a, nmkVar.a) && this.b.equals(nmkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
