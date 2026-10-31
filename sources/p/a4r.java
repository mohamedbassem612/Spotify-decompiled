package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class a4r extends hab0 implements ev30 {
    public static final a4r b;
    public static final a4r c;
    public static final a4r d;
    public static final a4r e;
    public static final a4r f;
    public final /* synthetic */ byte a;

    static {
        int i = 7;
        b = new a4r(i, (byte) 0);
        c = new a4r(i, (byte) 1);
        d = new a4r(i, (byte) 2);
        e = new a4r(i, (byte) 3);
        f = new a4r(i, (byte) 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4r(int i, byte b2) {
        super(i);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00d6 A[PHI: r8
      0x00d6: PHI (r8v17 p.ewt0) = (r8v15 p.ewt0), (r8v11 p.ewt0), (r8v11 p.ewt0) binds: [B:106:0x011b, B:79:0x00d2, B:80:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00e2  */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        vnb1 vnb1Var;
        vnb1 vnb1Var2;
        byte b2 = this.a;
        c2v c2vVar = c2v.a;
        l131 l131Var = l131.b;
        ewt0 ewt0Var = null;
        boolean z = false;
        switch (b2) {
            case 0:
                qfd qfdVar = (qfd) obj;
                l1z l1zVar = (l1z) obj2;
                String str = (String) obj3;
                String str2 = (String) obj4;
                String str3 = (String) obj5;
                hzy hzyVar = (hzy) obj6;
                w281 w281Var = (w281) obj7;
                o3r o3rVar = e4r.a;
                xkg0 xkg0Var = new xkg0();
                if (str != null) {
                }
                if (str2 != null) {
                }
                if (str3 != null) {
                    xkg0Var.put("streaming-rules", str3);
                }
                if (y7y0.C(xkg0Var.b())) {
                    return k6u.a;
                }
                if (qfdVar == null) {
                    return null;
                }
                boolean z2 = l1zVar != null ? l1zVar.e : false;
                if ((hzyVar != null ? hzyVar.a : 0) == 6) {
                    if ((w281Var != null ? w281Var.a : null) instanceof o281) {
                        z = true;
                    }
                }
                return e4r.b(qfdVar, z2, z);
            case 1:
                return new wnb1((jo70) obj, (xkk1) obj2, (hll) obj3, (hzy) obj4, (iix0) obj5, (h2v) obj6, (zoy0) obj7, (w281) null, 384);
            case 2:
                return new z8e0((a7q0) obj, (hll) obj2, (e2k1) obj3, (zoy0) obj4, (iix0) obj5, (uld) obj6, u890.j((String) obj7, "1"));
            case 3:
                vnb1 vnb1Var3 = (vnb1) obj;
                vnb1 vnb1Var4 = (vnb1) obj2;
                qfd qfdVar2 = (qfd) obj3;
                h2v h2vVar = (h2v) obj4;
                uwz0 uwz0Var = (uwz0) obj5;
                String str4 = (String) obj7;
                boolean z3 = yto.k((String) obj6, false) && qfdVar2 != null && qfdVar2.e.contains(l131Var);
                if (yto.k(str4, false) && vnb1Var4 != null && vnb1Var4.b) {
                    z = true;
                }
                boolean z4 = uwz0Var instanceof swz0;
                if ((vnb1Var3 != null && vnb1Var3.b) || z || z3) {
                    return m6u.a;
                }
                return ((!z4 || h2vVar == null || h2vVar.equals(c2vVar)) && qfdVar2 != null && qfdVar2.b) ? j6u.a : l6u.a;
            default:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                i1r i1rVar3 = (k1r) obj3;
                i1r i1rVar4 = (k1r) obj4;
                i1r i1rVar5 = (k1r) obj5;
                i1r i1rVar6 = (k1r) obj6;
                i1r i1rVar7 = (k1r) obj7;
                i1r i1rVar8 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                boolean zK = yto.k(i1rVar8 != null ? (String) i1rVar8.a : null, false);
                if ((i1rVar instanceof j1r) || (i1rVar2 instanceof j1r) || (i1rVar3 instanceof j1r) || (i1rVar4 instanceof j1r) || ((zK && (i1rVar5 instanceof j1r)) || (i1rVar6 instanceof j1r) || (i1rVar7 instanceof j1r))) {
                    return i131.a;
                }
                i1r i1rVar9 = i1rVar instanceof i1r ? i1rVar : null;
                qfd qfdVar3 = i1rVar9 != null ? (qfd) i1rVar9.a : null;
                i1r i1rVar10 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                boolean z5 = (i1rVar10 == null || (vnb1Var2 = (vnb1) i1rVar10.a) == null || !vnb1Var2.b) ? false : true;
                i1r i1rVar11 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                boolean z6 = (i1rVar11 == null || (vnb1Var = (vnb1) i1rVar11.a) == null || !vnb1Var.b) ? false : true;
                i1r i1rVar12 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                h2v h2vVar2 = i1rVar12 != null ? (h2v) i1rVar12.a : null;
                i1r i1rVar13 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                boolean z7 = (i1rVar13 != null ? (uwz0) i1rVar13.a : null) instanceof swz0;
                i1r i1rVar14 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                boolean zK2 = yto.k(i1rVar14 != null ? (String) i1rVar14.a : null, false);
                ewt0 ewt0Var2 = ewt0.d;
                if (zK && (z5 || z6)) {
                    ewt0Var = ewt0Var2;
                } else {
                    ewt0 ewt0Var3 = ewt0.c;
                    if (qfdVar3 != null) {
                        boolean z8 = qfdVar3.b;
                        ArrayList arrayList = qfdVar3.e;
                        if (z8) {
                            ewt0Var2 = null;
                        } else if (arrayList.contains(l131Var)) {
                            if (!zK2) {
                                ewt0Var2 = ewt0.a;
                            }
                        } else if (arrayList.contains(l131.c) || arrayList.contains(l131.a) || qfdVar3.c == 3) {
                            ewt0Var2 = ewt0.b;
                        } else if (!arrayList.contains(l131.d) && arrayList.contains(l131.e)) {
                            ewt0Var2 = ewt0Var3;
                        } else {
                            ewt0Var2 = null;
                        }
                        if (ewt0Var2 != null) {
                            ewt0Var = ewt0Var2;
                        }
                    }
                    if (z7 && h2vVar2 != null && !h2vVar2.equals(c2vVar)) {
                        ewt0Var = ewt0Var3;
                    }
                }
                return new j131(ewt0Var);
        }
    }
}
