package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rat extends sat {
    public final String a;
    public final String b;

    public rat(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rat)) {
            return false;
        }
        rat ratVar = (rat) obj;
        return this.a.equals(ratVar.a) && this.b.equals(ratVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
