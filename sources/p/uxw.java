package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class uxw {
    public static final txw Companion = new txw();
    public final String a;
    public final xxw b;

    public /* synthetic */ uxw(int i, String str, xxw xxwVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = xxwVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxw)) {
            return false;
        }
        uxw uxwVar = (uxw) obj;
        return u890.j(this.a, uxwVar.a) && u890.j(this.b, uxwVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xxw xxwVar = this.b;
        return iHashCode + (xxwVar != null ? xxwVar.hashCode() : 0);
    }
}
