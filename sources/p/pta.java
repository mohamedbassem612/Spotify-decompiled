package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pta {
    public final Activity a;
    public final vsw0 b;
    public final String c;

    public pta(Activity activity, vsw0 vsw0Var, String str) {
        this.a = activity;
        this.b = vsw0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pta)) {
            return false;
        }
        pta ptaVar = (pta) obj;
        return this.a.equals(ptaVar.a) && u890.j(this.b, ptaVar.b) && u890.j(this.c, ptaVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
