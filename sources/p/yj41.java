package p;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yj41 {
    public final Bitmap a;
    public final String b;
    public final gqb c;

    public yj41(Bitmap bitmap, String str, gqb gqbVar) {
        this.a = bitmap;
        this.b = str;
        this.c = gqbVar;
    }

    public final ksl a() {
        String str = this.b;
        return (str == null || ihc1.y0(str)) ? isl.a : new jsl(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj41)) {
            return false;
        }
        yj41 yj41Var = (yj41) obj;
        return u890.j(this.a, yj41Var.a) && u890.j(this.b, yj41Var.b) && u890.j(this.c, yj41Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gqb gqbVar = this.c;
        return iHashCode2 + (gqbVar != null ? gqbVar.hashCode() : 0);
    }
}
