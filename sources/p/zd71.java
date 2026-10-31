package p;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zd71 {
    public final Context a;
    public final String b;
    public final jq71 c;
    public final jq71 d;
    public final List e;

    public /* synthetic */ zd71(Context context, String str, jq71 jq71Var, jq71 jq71Var2, List list, int i) {
        this(context, str, jq71Var, (i & 8) != 0 ? null : jq71Var2, (i & 16) != 0 ? z6x.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd71)) {
            return false;
        }
        zd71 zd71Var = (zd71) obj;
        return u890.j(this.a, zd71Var.a) && u890.j(this.b, zd71Var.b) && u890.j(this.c, zd71Var.c) && u890.j(this.d, zd71Var.d) && u890.j(this.e, zd71Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        jq71 jq71Var = this.c;
        int iHashCode = (iD + (jq71Var == null ? 0 : jq71Var.hashCode())) * 31;
        jq71 jq71Var2 = this.d;
        return this.e.hashCode() + ((iHashCode + (jq71Var2 != null ? jq71Var2.hashCode() : 0)) * 31);
    }

    public zd71(Context context, String str, jq71 jq71Var, jq71 jq71Var2, List list) {
        this.a = context;
        this.b = str;
        this.c = jq71Var;
        this.d = jq71Var2;
        this.e = list;
    }
}
