package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class civ0 {
    public final String a;
    public final String b;

    public civ0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof civ0)) {
            return false;
        }
        civ0 civ0Var = (civ0) obj;
        return this.a.equals(civ0Var.a) && this.b.equals(civ0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
