package p;

import com.spotify.kodiak.table.table.DataSourceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w1k implements dmh1 {
    public final List a;
    public final v1k b;
    public final zhq0 c;
    public final vla1 d;

    public w1k(List list) {
        this.a = list;
        this.c = new zhq0((byte) 14);
        HashMap map = new HashMap(list.size());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            dmh1 dmh1Var = (dmh1) it.next();
            wla1 wla1VarE = dmh1Var.e();
            if (wla1VarE instanceof wla1) {
                map.putIfAbsent(wla1VarE.a(), Integer.valueOf(i));
            } else if (wla1VarE instanceof xla1) {
                arrayList.add(oqn1.n(((xla1) wla1VarE).a(), Integer.valueOf(i)));
            } else {
                if (!(wla1VarE instanceof vla1)) {
                    eg.o();
                    throw null;
                }
                arrayList2.add(oqn1.n(dmh1Var, Integer.valueOf(i)));
            }
            i = i2;
        }
        this.b = new v1k(map, arrayList, arrayList2, (byte) 0);
        this.d = new vla1(new mwh(this, (byte) 11));
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        v1k v1kVar;
        int iC = ses0Var.c();
        zhq0 zhq0Var = this.c;
        ues0 ues0VarB = zhq0Var.b(iC);
        try {
            int[] iArrA = ues0VarB.a();
            f46.c0(ses0Var.c(), iArrA);
            int iC2 = ses0Var.c();
            int i = 0;
            int i2 = 0;
            while (true) {
                v1kVar = this.b;
                if (i >= iC2) {
                    break;
                }
                if (ses0Var.g(i)) {
                    jh5 jh5VarH = ses0Var.h(i);
                    jh5VarH.getClass();
                    Integer numG = v1kVar.G(jh5VarH);
                    if (numG == null) {
                        i2++;
                    } else {
                        iArrA[i] = numG.intValue();
                    }
                }
                i++;
            }
            if (i2 > 0) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int iC3 = ses0Var.c();
                for (int i3 = 0; i3 < iC3; i3++) {
                    if (ses0Var.g(i3)) {
                        jh5 jh5VarH2 = ses0Var.h(i3);
                        jh5VarH2.getClass();
                        if (v1kVar.G(jh5VarH2) == null) {
                            linkedHashSet.add(jh5VarH2);
                        }
                    }
                }
                throw new DataSourceException.UnsupportedKeys(linkedHashSet);
            }
            int i4 = 0;
            while (true) {
                if (i4 < ses0Var.c() && iArrA[i4] == -1) {
                    i4++;
                } else {
                    if (i4 == ses0Var.c()) {
                        zhq0Var.r(ues0VarB);
                        return;
                    }
                    int i5 = iArrA[i4];
                    long jK = ses0Var.k();
                    try {
                        int iC4 = ses0Var.c();
                        for (int i6 = 0; i6 < iC4; i6++) {
                            if (ses0Var.g(i6)) {
                                ses0Var.h(i6).getClass();
                                if (iArrA[i6] != i5) {
                                    ses0Var.d(i6);
                                }
                            }
                        }
                        ((dmh1) this.a.get(i5)).b(ses0Var);
                        ses0Var.i(jK);
                        int iC5 = ses0Var.c();
                        for (int i7 = i4; i7 < iC5; i7++) {
                            if (iArrA[i7] == i5) {
                                iArrA[i7] = -1;
                            }
                        }
                    } catch (Throwable th) {
                        ses0Var.i(jK);
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            zhq0Var.r(ues0VarB);
            throw th2;
        }
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        List<dmh1> list = this.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (dmh1 dmh1Var : list) {
            arrayList.add(oqn1.n(dmh1Var, dmh1Var.c(iu30Var)));
        }
        return new u1k(arrayList, this.b);
    }

    @Override // p.dmh1
    public final yla1 e() {
        return this.d;
    }

    public w1k(l2r... l2rVarArr) {
        List listM = p7h.M(Arrays.copyOf(l2rVarArr, l2rVarArr.length));
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((l2r) it.next()).a());
        }
        this(arrayList);
    }
}
