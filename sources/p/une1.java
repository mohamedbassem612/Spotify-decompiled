package p;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class une1 {
    public final int a;
    public final Map b;
    public final Set c;

    /* JADX WARN: Illegal instructions before constructor call */
    public une1(dn90 dn90Var, Set set) {
        Map mapSingletonMap;
        int i = dn90Var.b;
        if (dn90Var instanceof bsi1) {
            String strY0 = o7h.y0(((bsi1) dn90Var).e, ", ", (String) null, (String) null, (iu30) null, 62);
            mapSingletonMap = Collections.singletonMap("duplicated_points", ihc1.y0(strY0) ? "-" : strY0);
        } else if (dn90Var instanceof esi1) {
            esi1 esi1Var = (esi1) dn90Var;
            String strY1 = o7h.y0(esi1Var.e, ", ", (String) null, (String) null, (iu30) null, 62);
            mmr0 mmr0Var = new mmr0("not_started_point_identifiers", ihc1.y0(strY1) ? "-" : strY1);
            String strY2 = o7h.y0(esi1Var.f, ", ", (String) null, (String) null, (iu30) null, 62);
            mapSingletonMap = sqg0.J(new mmr0[]{mmr0Var, new mmr0("not_finished_point_identifiers", ihc1.y0(strY2) ? "-" : strY2)});
        } else if (dn90Var instanceof fsi1) {
            String strY3 = o7h.y0(((fsi1) dn90Var).e, ", ", (String) null, (String) null, (iu30) null, 62);
            mapSingletonMap = Collections.singletonMap("point_identifiers_ended_before_start", ihc1.y0(strY3) ? "-" : strY3);
        } else if (dn90Var instanceof dsi1) {
            String strY4 = o7h.y0(((dsi1) dn90Var).e, ", ", (String) null, (String) null, (iu30) null, 62);
            mapSingletonMap = Collections.singletonMap("invalid_point_identifiers", ihc1.y0(strY4) ? "-" : strY4);
        } else {
            if (!(dn90Var instanceof csi1)) {
                eg.o();
                throw null;
            }
            String strY5 = o7h.y0(sqg0.S(((csi1) dn90Var).e), ",", (String) null, (String) null, (iu30) null, 62);
            mapSingletonMap = Collections.singletonMap("invalid_dimensions", ihc1.y0(strY5) ? "-" : strY5);
        }
        this(i, mapSingletonMap, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof une1)) {
            return false;
        }
        une1 une1Var = (une1) obj;
        return this.a == une1Var.a && u890.j(this.b, une1Var.b) && u890.j(this.c, une1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.e(l1d.C(this.a) * 31, 31, this.b);
    }

    public une1(int i, Map map, Set set) {
        this.a = i;
        this.b = map;
        this.c = set;
    }
}
