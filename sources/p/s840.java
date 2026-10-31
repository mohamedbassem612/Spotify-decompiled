package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s840 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s840(lc20 lc20Var, byte b) {
        super(1);
        this.a = b;
        this.b = lc20Var;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x0322 A[PHI: r16
      0x0322: PHI (r16v5 boolean) = (r16v6 boolean), (r16v7 boolean) binds: [B:251:0x0320, B:248:0x031b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:255:0x0328  */
    /* JADX WARN: Code duplicated, block: B:327:0x0438  */
    public final Object invoke(Object obj) {
        boolean zJ;
        String str;
        boolean z;
        boolean z2;
        boolean zD;
        int i;
        h840 h840Var;
        h840 k840Var;
        mq70 mq70Var;
        up70 up70VarA;
        io70 io70Var;
        byte b = this.a;
        lc20 lc20Var = this.b;
        switch (b) {
            case 0:
                String strA = u840.a((j1q0) obj);
                if (strA != null) {
                    kmj1 kmj1Var = (kmj1) lc20Var.c;
                    if (kmj1Var == null || !kmj1Var.a.a()) {
                        strA = null;
                    } else {
                        Set set = s4b1.f;
                        v5b1 v5b1Var = uic.x(strA).d;
                        if (!u890.j(v5b1Var != null ? v5b1Var.getType() : null, nyu0.e)) {
                            strA = null;
                        }
                    }
                    if (strA != null) {
                        return new rxc0(strA);
                    }
                }
                return null;
            case 1:
                List list = (List) obj;
                i1r i1rVar = (k1r) list.get(0);
                i1r i1rVar2 = (k1r) list.get(1);
                i1r i1rVar3 = (k1r) list.get(2);
                Object obj2 = list.get(3);
                jo70 jo70Var = obj2 instanceof jo70 ? (jo70) obj2 : null;
                i1r i1rVar4 = (k1r) list.get(4);
                i1r i1rVar5 = (k1r) list.get(5);
                i1r i1rVar6 = (k1r) list.get(6);
                i1r i1rVar7 = (k1r) list.get(7);
                i1r i1rVar8 = (k1r) list.get(8);
                i1r i1rVar9 = (k1r) list.get(9);
                i1r i1rVar10 = (k1r) list.get(10);
                i1r i1rVar11 = (k1r) list.get(11);
                i1r i1rVar12 = (k1r) list.get(12);
                i1r i1rVar13 = (k1r) list.get(13);
                i1r i1rVar14 = (k1r) list.get(14);
                i1r i1rVar15 = (k1r) list.get(15);
                k1r[] k1rVarArr = {i1rVar, i1rVar2, i1rVar3, i1rVar4, i1rVar5, i1rVar6, i1rVar7, i1rVar9, i1rVar10, i1rVar11, i1rVar12, i1rVar13, i1rVar14, i1rVar15};
                Set set2 = u840.a;
                for (int i2 = 0; i2 < 14; i2++) {
                    if (k1rVarArr[i2] instanceof j1r) {
                        return p840.a;
                    }
                }
                i1r i1rVar16 = i1rVar instanceof i1r ? i1rVar : null;
                Object obj3 = i1rVar16 != null ? i1rVar16.a : null;
                if (!(obj3 instanceof l1z)) {
                    obj3 = null;
                }
                l1z l1zVar = (l1z) obj3;
                i1r i1rVar17 = i1rVar2 instanceof i1r ? i1rVar2 : null;
                Object obj4 = i1rVar17 != null ? i1rVar17.a : null;
                if (!(obj4 instanceof jo70)) {
                    obj4 = null;
                }
                jo70 jo70Var2 = (jo70) obj4;
                i1r i1rVar18 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                Object obj5 = i1rVar18 != null ? i1rVar18.a : null;
                if (!(obj5 instanceof hzy)) {
                    obj5 = null;
                }
                hzy hzyVar = (hzy) obj5;
                boolean z3 = (hzyVar != null ? hzyVar.a : 0) == 6;
                String str2 = (jo70Var == null || (io70Var = jo70Var.e) == null) ? null : io70Var.b;
                if (!z3) {
                    str2 = null;
                }
                i1r i1rVar19 = i1rVar4 instanceof i1r ? i1rVar4 : null;
                Object obj6 = i1rVar19 != null ? i1rVar19.a : null;
                if (!(obj6 instanceof xkk1)) {
                    obj6 = null;
                }
                xkk1 xkk1Var = (xkk1) obj6;
                i1r i1rVar20 = i1rVar5 instanceof i1r ? i1rVar5 : null;
                Object obj7 = i1rVar20 != null ? i1rVar20.a : null;
                if (!(obj7 instanceof String)) {
                    obj7 = null;
                }
                String str3 = (String) obj7;
                i1r i1rVar21 = i1rVar6 instanceof i1r ? i1rVar6 : null;
                Object obj8 = i1rVar21 != null ? i1rVar21.a : null;
                if (!(obj8 instanceof z1g1)) {
                    obj8 = null;
                }
                z1g1 z1g1Var = (z1g1) obj8;
                i1r i1rVar22 = i1rVar7 instanceof i1r ? i1rVar7 : null;
                Object obj9 = i1rVar22 != null ? i1rVar22.a : null;
                if (!(obj9 instanceof gh3)) {
                    obj9 = null;
                }
                gh3 gh3Var = (gh3) obj9;
                i1r i1rVar23 = i1rVar8 instanceof i1r ? i1rVar8 : null;
                Object obj10 = i1rVar23 != null ? i1rVar23.a : null;
                if (!(obj10 instanceof bql)) {
                    obj10 = null;
                }
                bql bqlVar = (bql) obj10;
                i1r i1rVar24 = i1rVar9 instanceof i1r ? i1rVar9 : null;
                Object obj11 = i1rVar24 != null ? i1rVar24.a : null;
                if (!(obj11 instanceof w281)) {
                    obj11 = null;
                }
                w281 w281Var = (w281) obj11;
                if (w281Var == null) {
                    i1r i1rVar25 = i1rVar11 instanceof i1r ? i1rVar11 : null;
                    Object obj12 = i1rVar25 != null ? i1rVar25.a : null;
                    if (!(obj12 instanceof w281)) {
                        obj12 = null;
                    }
                    w281Var = (w281) obj12;
                    if (!z3) {
                        w281Var = null;
                    }
                }
                i1r i1rVar26 = i1rVar10 instanceof i1r ? i1rVar10 : null;
                Object obj13 = i1rVar26 != null ? i1rVar26.a : null;
                if (!(obj13 instanceof sdy)) {
                    obj13 = null;
                }
                sdy sdyVar = (sdy) obj13;
                if (sdyVar == null) {
                    i1r i1rVar27 = i1rVar12 instanceof i1r ? i1rVar12 : null;
                    Object obj14 = i1rVar27 != null ? i1rVar27.a : null;
                    if (!(obj14 instanceof sdy)) {
                        obj14 = null;
                    }
                    sdyVar = (sdy) obj14;
                    if (!z3) {
                        sdyVar = null;
                    }
                }
                i1r i1rVar28 = i1rVar13 instanceof i1r ? i1rVar13 : null;
                Object obj15 = i1rVar28 != null ? i1rVar28.a : null;
                if (!(obj15 instanceof Boolean)) {
                    obj15 = null;
                }
                Boolean bool = (Boolean) obj15;
                kmj1 kmj1Var2 = (kmj1) lc20Var.c;
                if (kmj1Var2 != null) {
                    i1r i1rVar29 = i1rVar14 instanceof i1r ? i1rVar14 : null;
                    Object obj16 = i1rVar29 != null ? i1rVar29.a : null;
                    if (!(obj16 instanceof Boolean)) {
                        obj16 = null;
                    }
                    Boolean bool2 = (Boolean) obj16;
                    i1r i1rVar30 = i1rVar15 instanceof i1r ? i1rVar15 : null;
                    Object obj17 = i1rVar30 != null ? i1rVar30.a : null;
                    if (!(obj17 instanceof qxc0)) {
                        obj17 = null;
                    }
                    zJ = t2p1.p(kmj1Var2.c(bool2, (qxc0) obj17));
                } else {
                    i1r i1rVar31 = i1rVar14 instanceof i1r ? i1rVar14 : null;
                    Object obj18 = i1rVar31 != null ? i1rVar31.a : null;
                    if (!(obj18 instanceof Boolean)) {
                        obj18 = null;
                    }
                    zJ = u890.j((Boolean) obj18, Boolean.TRUE);
                }
                String str4 = jo70Var2 != null ? jo70Var2.a : null;
                String str5 = "";
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null || (str = up70VarA.a.a) == null) {
                    str = "";
                }
                boolean zJ2 = u890.j(str3, "free");
                lql lqlVar = iql.a;
                lql lqlVar2 = bqlVar != null ? bqlVar.a : lqlVar;
                kql kqlVar = kql.a;
                if (lqlVar2.equals(kqlVar) || lqlVar2.equals(hql.a)) {
                    z = true;
                } else {
                    if (!lqlVar2.equals(lqlVar) && !lqlVar2.equals(jql.a)) {
                        eg.o();
                        return null;
                    }
                    z = false;
                }
                if (z1g1Var != null) {
                    zD = poz0.D(z1g1Var);
                    z2 = zJ;
                } else {
                    if (gh3Var != null) {
                        z2 = zJ;
                        if (gh3Var.h) {
                            zD = true;
                        }
                    } else {
                        z2 = zJ;
                    }
                    if (z) {
                        zD = true;
                    } else {
                        zD = false;
                    }
                }
                if (w281Var == null) {
                    k840Var = null;
                } else {
                    boolean z4 = w281Var.l;
                    if (sdyVar == null || (i = sdyVar.a) == 0) {
                        i = 1;
                    }
                    if (i == 2 && u890.j(bool, Boolean.TRUE)) {
                        k840Var = new g840(str2, z4);
                    } else {
                        o281 o281Var = w281Var.a;
                        if (w281Var.c || o281Var == null) {
                            k840Var = null;
                        } else {
                            if (o281Var instanceof o281) {
                                h840Var = new j840(o281Var.c, str2, z4);
                            } else if (o281Var instanceof n281) {
                                n281 n281Var = (n281) o281Var;
                                k840Var = new i840(n281Var.c, n281Var.d, n281Var.e, n281Var.f, n281Var.g, n281Var.h, n281Var.i, str.length() == 0 ? null : str, str2, w281Var.l);
                            } else if ((o281Var instanceof k281) && ((k281) o281Var).f != null) {
                                k840Var = new k840(str2, z4);
                            } else if (o281Var instanceof m281) {
                                m281 m281Var = (m281) o281Var;
                                h840Var = new h840(m281Var.d, m281Var.c, str2, z4);
                            } else {
                                k840Var = null;
                            }
                            k840Var = h840Var;
                        }
                    }
                }
                if (k840Var != null) {
                    return k840Var;
                }
                if (l1zVar != null && l1zVar.e) {
                    return new e840(str4);
                }
                if (!zJ2 || !zD) {
                    return z2 ? n840.a : q840.a;
                }
                if (gh3Var != null) {
                    str5 = gh3Var.a;
                } else if (z1g1Var != null) {
                    Set set3 = s4b1.f;
                    String strZ = uic.B(z1g1Var.a).z();
                    if (strZ != null) {
                        str5 = strZ;
                    }
                }
                return lqlVar2.equals(kqlVar) ? new m840(str5, str) : new f840(str5, str);
            default:
                String strC = ((j1q0) obj).c();
                if (((abm) lc20Var.b).a() && u840.d.contains(rrn1.x(strC))) {
                    return strC;
                }
                return null;
        }
    }
}
