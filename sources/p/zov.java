package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zov {
    public final String a;
    public final String b;

    public zov(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zov)) {
            return false;
        }
        zov zovVar = (zov) obj;
        return u890.j(this.a, zovVar.a) && this.b.equals(zovVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
