package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xcw {
    public final String a;
    public final tqw b;

    public xcw(String str, tqw tqwVar) {
        this.a = str;
        this.b = tqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcw)) {
            return false;
        }
        xcw xcwVar = (xcw) obj;
        return this.a.equals(xcwVar.a) && u890.j(this.b, xcwVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tqw tqwVar = this.b;
        return iHashCode + (tqwVar == null ? 0 : tqwVar.hashCode());
    }
}
