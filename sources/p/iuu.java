package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iuu extends hab0 implements gv30 {
    public final /* synthetic */ luu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iuu(luu luuVar) {
        super(9);
        this.a = luuVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    public final Object b1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        boolean z;
        fuu fuuVar;
        List list;
        f2v f2vVar = (h2v) obj;
        hll hllVar = (hll) obj2;
        l1z l1zVar = (l1z) obj3;
        jo70 jo70Var = (jo70) obj4;
        prl prlVar = (prl) obj5;
        i1r i1rVar = (k1r) obj6;
        i1r i1rVar2 = (k1r) obj7;
        i1r i1rVar3 = (k1r) obj8;
        i1r i1rVar4 = (k1r) obj9;
        if (f2vVar == null) {
            f2vVar = f2v.a;
        }
        boolean z2 = false;
        if (hllVar == null || (list = hllVar.d) == null || !list.contains(fll.c)) {
            z = false;
        } else {
            i1r i1rVar5 = i1rVar2 instanceof i1r ? i1rVar2 : null;
            if (i1rVar5 == null || ((Number) i1rVar5.a).intValue() != 1) {
                z = true;
            } else {
                z = false;
            }
        }
        boolean z3 = l1zVar != null ? l1zVar.e : false;
        String str = jo70Var != null ? jo70Var.a : null;
        if (this.a.g) {
            nrl nrlVar = prlVar != null ? prlVar.b : mrl.a;
            if (nrlVar instanceof lrl) {
                orl orlVar = ((lrl) nrlVar).a;
                if (orlVar != null && !(i1rVar instanceof j1r)) {
                    if (i1rVar instanceof i1r) {
                        if (!u890.j(i1rVar.a, orlVar.b)) {
                        }
                    } else if (!(i1rVar instanceof h1r)) {
                        eg.o();
                        return null;
                    }
                    z2 = true;
                }
            } else if (!(nrlVar instanceof irl) && !(nrlVar instanceof jrl) && !(nrlVar instanceof krl) && !(nrlVar instanceof mrl)) {
                eg.o();
                return null;
            }
        }
        fuu fuuVar2 = fuu.b;
        fuu fuuVar3 = fuu.a;
        if ((i1rVar3 instanceof h1r) || (i1rVar4 instanceof h1r)) {
            fuuVar = fuuVar3;
        } else {
            if ((i1rVar3 instanceof i1r) && (i1rVar4 instanceof i1r)) {
                Object obj10 = i1rVar4.a;
                if (((gbl) obj10).b && obj10 != gbl.Z && !((Boolean) i1rVar3.a).booleanValue()) {
                    fuuVar = fuuVar3;
                }
            }
            fuuVar = fuuVar2;
        }
        return new cuu(f2vVar, z, z3, str, z2, fuuVar);
    }
}
