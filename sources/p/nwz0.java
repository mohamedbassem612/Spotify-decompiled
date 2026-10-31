package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nwz0 extends dq20 {
    public nwz0(qx81 qx81Var, qx81 qx81Var2, int i) {
        super(qx81Var, qx81Var2);
        c8b0.a.b(qx81Var, qx81Var2);
    }

    public static final ArrayList C0(cht chtVar, a8b0 a8b0Var) {
        List<e1h1> listR0 = a8b0Var.r0();
        ArrayList arrayList = new ArrayList(q7h.U(listR0, 10));
        for (e1h1 e1h1Var : listR0) {
            StringBuilder sb = new StringBuilder();
            o7h.x0(Collections.singletonList(e1h1Var), sb, ", ", (String) null, (String) null, new bht(chtVar, (byte) 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String D0(String str, String str2) {
        if (!ihc1.i0(str, '<')) {
            return str;
        }
        return ihc1.Y0(str, '<') + '<' + str2 + '>' + ihc1.V0(str, '>', str);
    }

    @Override // p.dq20
    public final qx81 A0() {
        return this.b;
    }

    @Override // p.dq20
    public final String B0(cht chtVar, cht chtVar2) {
        qx81 qx81Var = this.b;
        String strU = chtVar.U(qx81Var);
        qx81 qx81Var2 = this.c;
        String strU2 = chtVar.U(qx81Var2);
        if (chtVar2.a.n()) {
            return "raw (" + strU + ".." + strU2 + ')';
        }
        if (qx81Var2.r0().isEmpty()) {
            return chtVar.C(strU, strU2, rzn1.s(this));
        }
        ArrayList arrayListC0 = C0(chtVar, qx81Var);
        ArrayList arrayListC1 = C0(chtVar, qx81Var2);
        String strY0 = o7h.y0(arrayListC0, ", ", (String) null, (String) null, zqb0.S0, 30);
        ArrayList arrayListV1 = o7h.v1(arrayListC0, arrayListC1);
        if (!arrayListV1.isEmpty()) {
            Iterator it = arrayListV1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strU2 = D0(strU2, strY0);
                    break;
                }
                mmr0 mmr0Var = (mmr0) it.next();
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                if (!u890.j(str, ihc1.H0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strU2 = D0(strU2, strY0);
            break;
        }
        String strD0 = D0(strU, strY0);
        return strD0.equals(strU2) ? strD0 : chtVar.C(strD0, strU2, rzn1.s(this));
    }

    @Override // p.dq20, p.a8b0
    public final zpi0 E() {
        jfg jfgVarS = t0().s();
        beg begVar = jfgVarS instanceof beg ? (beg) jfgVarS : null;
        if (begVar != null) {
            return begVar.y(new iwz0());
        }
        bhn0.B(t0().s(), "Incorrect classifier: ");
        return null;
    }

    @Override // p.a8b0
    /* JADX INFO: renamed from: v0 */
    public final a8b0 y0(g8b0 g8b0Var) {
        return new nwz0(this.b, this.c);
    }

    @Override // p.gmh1
    public final gmh1 x0(boolean z) {
        return new nwz0(this.b.x0(z), this.c.x0(z), 0);
    }

    @Override // p.gmh1
    public final gmh1 y0(g8b0 g8b0Var) {
        return new nwz0(this.b, this.c);
    }

    @Override // p.gmh1
    public final gmh1 z0(e0h1 e0h1Var) {
        return new nwz0(this.b.z0(e0h1Var), this.c.z0(e0h1Var), 0);
    }
}
