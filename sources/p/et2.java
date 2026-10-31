package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class et2 {
    public final hr2 a;
    public final String b;

    public et2(hr2 hr2Var, String str) {
        this.a = hr2Var;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final hr2 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et2)) {
            return false;
        }
        et2 et2Var = (et2) obj;
        return this.a.equals(et2Var.a) && u890.j(this.b, et2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
