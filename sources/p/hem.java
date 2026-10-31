package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hem {
    public final kjm a;
    public final List b;
    public final zm81 c;
    public final yim d;

    public hem(kjm kjmVar, List list, zm81 zm81Var, yim yimVar) {
        this.a = kjmVar;
        this.b = list;
        this.c = zm81Var;
        this.d = yimVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hem)) {
            return false;
        }
        hem hemVar = (hem) obj;
        return u890.j(this.a, hemVar.a) && u890.j(this.b, hemVar.b) && u890.j(this.c, hemVar.c) && u890.j(this.d, hemVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        zm81 zm81Var = this.c;
        int iHashCode3 = (iHashCode2 + (zm81Var == null ? 0 : zm81Var.hashCode())) * 31;
        yim yimVar = this.d;
        return iHashCode3 + (yimVar != null ? yimVar.hashCode() : 0);
    }

    public /* synthetic */ hem(kjm kjmVar) {
        this(kjmVar, null, null, null);
    }
}
