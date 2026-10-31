package p;

import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pne1 {
    public final UUID a;
    public final String b;
    public final Map c;
    public final Map d;
    public final Set e;
    public final String f;
    public final UUID g;
    public final une1 h;

    public pne1(UUID uuid, String str, Map map, Map map2, Set set, String str2, UUID uuid2, une1 une1Var) {
        this.a = uuid;
        this.b = str;
        this.c = map;
        this.d = map2;
        this.e = set;
        this.f = str2;
        this.g = uuid2;
        this.h = une1Var;
    }

    public static pne1 a(pne1 pne1Var, Set set, UUID uuid, int i) {
        UUID uuid2 = pne1Var.a;
        String str = pne1Var.b;
        Map map = pne1Var.c;
        Map map2 = pne1Var.d;
        if ((i & 16) != 0) {
            set = pne1Var.e;
        }
        Set set2 = set;
        String str2 = pne1Var.f;
        if ((i & 64) != 0) {
            uuid = pne1Var.g;
        }
        return new pne1(uuid2, str, map, map2, set2, str2, uuid, pne1Var.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pne1)) {
            return false;
        }
        pne1 pne1Var = (pne1) obj;
        return u890.j(this.a, pne1Var.a) && u890.j(this.b, pne1Var.b) && u890.j(this.c, pne1Var.c) && u890.j(this.d, pne1Var.d) && this.e.equals(pne1Var.e) && u890.j(this.f, pne1Var.f) && u890.j(this.g, pne1Var.g) && u890.j(this.h, pne1Var.h);
    }

    public final int hashCode() {
        int iC = gvg.c(cy30.e(cy30.e(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        UUID uuid = this.g;
        int iHashCode2 = (iHashCode + (uuid == null ? 0 : uuid.hashCode())) * 961;
        une1 une1Var = this.h;
        return iHashCode2 + (une1Var != null ? une1Var.hashCode() : 0);
    }
}
