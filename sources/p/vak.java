package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vak implements abk {
    public final String a;
    public final String b;

    public vak(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vak)) {
            return false;
        }
        vak vakVar = (vak) obj;
        return this.a.equals(vakVar.a) && this.b.equals(vakVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
