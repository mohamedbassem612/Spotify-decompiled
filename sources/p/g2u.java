package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class g2u {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("DiagnosticsWrkr");
    }

    public static final void a(gwl1 gwl1Var, gxl1 gxl1Var, zdd1 zdd1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vwl1 vwl1Var = (vwl1) it.next();
            uvl1 uvl1VarZ = yoi1.z(vwl1Var);
            String str = vwl1Var.a;
            xdd1 xdd1VarA = zdd1Var.a(uvl1VarZ);
            Integer numValueOf = xdd1VarA != null ? Integer.valueOf(xdd1VarA.c) : null;
            String strY0 = o7h.y0((List) qyo1.x(gwl1Var.a, true, false, new jfa(str, (byte) 17)), ",", (String) null, (String) null, (iu30) null, 62);
            String strY1 = o7h.y0(gxl1Var.a(str), ",", (String) null, (String) null, (iu30) null, 62);
            StringBuilder sbT = l1d.t("\n", str, "\t ");
            sbT.append(vwl1Var.c);
            sbT.append("\t ");
            sbT.append(numValueOf);
            sbT.append("\t ");
            sbT.append(vwl1Var.b.name());
            sbT.append("\t ");
            sbT.append(strY0);
            sbT.append("\t ");
            sbT.append(strY1);
            sbT.append('\t');
        }
    }
}
