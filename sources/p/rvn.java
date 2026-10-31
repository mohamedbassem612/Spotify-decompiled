package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rvn implements awn {
    public final String a;
    public final String b;

    public rvn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvn)) {
            return false;
        }
        rvn rvnVar = (rvn) obj;
        return u890.j(this.a, rvnVar.a) && u890.j(this.b, rvnVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
    }
}
