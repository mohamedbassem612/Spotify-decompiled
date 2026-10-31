package p;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x5o1 extends cwn1 {
    public final List b;
    public ain1 c;
    public boolean d;
    public final LinkedHashMap e = new LinkedHashMap();

    public x5o1(smc0 smc0Var) {
        this.b = smc0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final gnn1 g(jqd0 jqd0Var, w7o1 w7o1Var) throws NoWhenBranchMatchedException {
        enn1 enn1VarD = gnn1.D();
        enn1VarD.r(true != jqd0Var.F() ? 3 : 5);
        byte[] byteArray = BigInteger.valueOf(w7o1Var.a).toByteArray();
        vhn1 vhn1Var = ain1.b;
        enn1VarD.q(ain1.x(0, byteArray, byteArray.length));
        if (w7o1Var instanceof i6o1) {
            byte[] bArrH = jqd0Var.H(((i6o1) w7o1Var).b.d(), w7o1Var.a);
            enn1VarD.l(ain1.x(0, bArrH, bArrH.length));
        } else {
            if (!(w7o1Var instanceof c6o1)) {
                eg.o();
                return null;
            }
            byte[] bArrH2 = jqd0Var.H(((c6o1) w7o1Var).a().d(), w7o1Var.a);
            enn1VarD.n(ain1.x(0, bArrH2, bArrH2.length));
        }
        return enn1VarD.e();
    }

    @Override // p.cwn1
    public final qwo1 a(yln1 yln1Var) {
        return new qwo1(new zfe(yln1Var, this, (lnm) null, (byte) 15));
    }

    @Override // p.cwn1
    public final qwo1 b(String str, sln1 sln1Var) {
        return new qwo1(new g1y(this, str, sln1Var, null));
    }

    @Override // p.cwn1
    public final Object c(String str) {
        return f(str);
    }

    @Override // p.cwn1
    public final int d() {
        return 34;
    }

    @Override // p.cwn1
    public final int e() {
        return 35;
    }

    public final pmn1 f(String str) {
        LinkedHashMap linkedHashMap;
        List list = (List) this.e.remove(str);
        ain1 ain1Var = this.c;
        if (ain1Var == null) {
            ain1Var = null;
        }
        jqd0 jqd0Var = new jqd0(ain1Var, this.d);
        if (list != null) {
            List<w7o1> list2 = list;
            int iS = zno1.s(q7h.U(list2, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (w7o1 w7o1Var : list2) {
                linkedHashMap.put(Integer.valueOf(w7o1Var.a), w7o1Var);
            }
        } else {
            linkedHashMap = b7x.a;
        }
        hnn1 hnn1VarA = inn1.A();
        hnn1VarA.h(str);
        List list3 = this.b;
        ArrayList<q7o1> arrayList = new ArrayList();
        for (Object obj : list3) {
            if (((q7o1) obj).zzb()) {
                arrayList.add(obj);
            }
        }
        for (q7o1 q7o1Var : arrayList) {
            if (!linkedHashMap.containsKey(Integer.valueOf(q7o1Var.zza()))) {
                int iZza = q7o1Var.zza();
                pnn1 pnn1VarX = qnn1.x();
                pnn1VarX.h(iZza);
                pnn1VarX.i(13);
                pnn1VarX.j(27);
                hnn1VarA.i(g(jqd0Var, new c6o1(iZza, pnn1VarX.e())));
            }
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList(q7h.U(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(g(jqd0Var, (w7o1) it.next()));
        }
        hnn1VarA.j(arrayList2);
        inn1 inn1VarE = hnn1VarA.e();
        kmn1 kmn1VarX = pmn1.x();
        kmn1VarX.h(str);
        dmn1 dmn1VarX = emn1.x();
        dmn1VarX.h(inn1VarE);
        dmn1VarX.i(ain1.x(0, jqd0Var.G(), 12));
        kmn1VarX.i(dmn1VarX);
        return kmn1VarX.e();
    }
}
