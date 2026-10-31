package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class wnn0 {
    public final mzn0 a;
    public final int b;
    public final String c;
    public final Map d;
    public final LinkedHashMap e;
    public final ArrayList f;
    public final LinkedHashMap g;

    public wnn0(mzn0 mzn0Var, tka0 tka0Var, Map map) {
        String str;
        int iN = tka0Var != null ? up30.n(wmo1.t(tka0Var)) : -1;
        if (tka0Var != null) {
            nma0 nma0VarT = wmo1.t(tka0Var);
            ps31 ps31Var = new ps31(nma0VarT, (byte) 1);
            if (nma0VarT instanceof tcv0) {
                ps31Var.invoke();
                throw null;
            }
            kdy0 kdy0Var = new kdy0(nma0VarT);
            lw11 lw11Var = new lw11(kdy0Var, (byte) 19);
            int iD = nma0VarT.getDescriptor().d();
            for (int i = 0; i < iD; i++) {
                String strE = nma0VarT.getDescriptor().e(i);
                apn0 apn0VarL = up30.l(nma0VarT.getDescriptor().g(i), map);
                if (apn0VarL == null) {
                    hhg1.n(up30.y(strE, nma0VarT.getDescriptor().g(i).h(), nma0VarT.getDescriptor().h(), map.toString()));
                    throw null;
                }
                lw11Var.invoke(Integer.valueOf(i), strE, apn0VarL);
            }
            str = ((String) kdy0Var.d) + ((String) kdy0Var.e) + ((String) kdy0Var.b);
        } else {
            str = null;
        }
        this(mzn0Var, iN, str);
        if (tka0Var != null) {
            nma0 nma0VarT2 = wmo1.t(tka0Var);
            ps31 ps31Var2 = new ps31(nma0VarT2, (byte) 0);
            if (nma0VarT2 instanceof tcv0) {
                ps31Var2.invoke();
                throw null;
            }
            int iD2 = nma0VarT2.getDescriptor().d();
            ArrayList<nkn0> arrayList = new ArrayList(iD2);
            for (int i2 = 0; i2 < iD2; i2++) {
                String strE2 = nma0VarT2.getDescriptor().e(i2);
                cnn0 cnn0Var = new cnn0();
                h661 h661VarG = nma0VarT2.getDescriptor().g(i2);
                boolean zB = h661VarG.b();
                apn0 apn0VarL2 = up30.l(h661VarG, map);
                if (apn0VarL2 == null) {
                    hhg1.n(up30.y(strE2, h661VarG.h(), nma0VarT2.getDescriptor().h(), map.toString()));
                    throw null;
                }
                cnn0Var.a = apn0VarL2;
                cnn0Var.b = zB;
                if (nma0VarT2.getDescriptor().i(i2)) {
                    cnn0Var.e = true;
                }
                arrayList.add(new nkn0(strE2, cnn0Var.a()));
            }
            for (nkn0 nkn0Var : arrayList) {
                this.e.put(nkn0Var.a, nkn0Var.b);
            }
        }
        this.d = map;
    }

    public vnn0 a() {
        vnn0 vnn0VarB = b();
        vnn0VarB.d = null;
        for (Map.Entry entry : this.e.entrySet()) {
            vnn0VarB.g.put((String) entry.getKey(), (dnn0) entry.getValue());
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            vnn0VarB.b((snn0) it.next());
        }
        for (Map.Entry entry2 : this.g.entrySet()) {
            vnn0VarB.l(((Number) entry2.getKey()).intValue(), (bnn0) entry2.getValue());
        }
        String str = this.c;
        if (str != null) {
            vnn0VarB.m(str);
        }
        int i = this.b;
        if (i != -1) {
            vnn0VarB.h = i;
            vnn0VarB.c = null;
        }
        return vnn0VarB;
    }

    public vnn0 b() {
        return this.a.a();
    }

    public wnn0(mzn0 mzn0Var, int i, String str) {
        this.a = mzn0Var;
        this.b = i;
        this.c = str;
        this.e = new LinkedHashMap();
        this.f = new ArrayList();
        this.g = new LinkedHashMap();
    }
}
