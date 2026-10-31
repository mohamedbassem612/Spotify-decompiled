package p;

import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class kh {
    public static final String a(vnr0 vnr0Var) {
        z6x z6xVar;
        kor0 kor0Var = vnr0Var.c;
        if (kor0Var instanceof jor0) {
            z6xVar = z6x.a;
        } else {
            if (!(kor0Var instanceof ior0)) {
                eg.o();
                return null;
            }
            z6xVar = ((ior0) kor0Var).a;
        }
        String strW = vnr0Var.a;
        int i = 1;
        while (true) {
            if (!ihc1.h0(strW, "$" + i, false) || z6xVar.size() < i) {
                break;
            }
            strW = nhc1.W(strW, f4i1.c(i, "$"), ((mor0) z6xVar.get(i - 1)).a);
            i++;
        }
        return strW;
    }

    public static final String b(d761 d761Var) {
        String strU;
        ArrayList arrayList;
        Paragraph paragraphB = d761Var.b();
        int iU = paragraphB.u();
        int i = iU == 0 ? -1 : gh.a[l1d.C(iU)];
        int i2 = 1;
        if (i != 1) {
            arrayList = z6x.a;
            if (i == 2) {
                strU = paragraphB.r().s().u();
            } else if (i != 3) {
                strU = paragraphB.s().u();
                h290 h290VarT = paragraphB.t();
                arrayList = new ArrayList(q7h.U(h290VarT, 10));
                Iterator it = h290VarT.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Paragraph.TextStyle) it.next()).u());
                }
            } else {
                strU = paragraphB.p().s().u();
            }
        } else {
            strU = paragraphB.q().t().u();
            h290 h290VarU = paragraphB.q().u();
            arrayList = new ArrayList(q7h.U(h290VarU, 10));
            Iterator it2 = h290VarU.iterator();
            while (it2.hasNext()) {
                arrayList.add(((Paragraph.TextStyle) it2.next()).u());
            }
        }
        while (true) {
            if (!ihc1.h0(strU, "$" + i2, false) || arrayList.size() < i2) {
                break;
            }
            strU = nhc1.W(strU, f4i1.c(i2, "$"), (String) arrayList.get(i2 - 1));
            i2++;
        }
        return strU;
    }
}
