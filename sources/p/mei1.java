package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mei1 implements jei1 {
    public final rzq a;
    public final String b;
    public final oum c;
    public final o3r d = w3p1.o(new l4r(hvm.a, 1, kei1.d, new j4r(kei1.b), kei1.e), kei1.c);
    public final o3r e = w3p1.o(new l4r(jd0.k, 1, kei1.f, new j4r(osh1.d1), kei1.g), osh1.e1);

    public mei1(rzq rzqVar, String str, oum oumVar) {
        this.a = rzqVar;
        this.b = str;
        this.c = oumVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:38:0x0104  */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153 A[LOOP:2: B:52:0x014d->B:54:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x0176  */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(String str, String str2, String str3, String str4, onm onmVar) {
        lei1 lei1Var;
        String str5;
        List list;
        String str6;
        String str7;
        i1r i1rVar;
        kpm kpmVar;
        String str8;
        String strZ;
        String str9;
        Iterator it;
        Object next;
        ArrayList<som> arrayList;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        String str10 = str;
        String str11 = str2;
        if (onmVar instanceof lei1) {
            lei1Var = (lei1) onmVar;
            int i = lei1Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lei1Var.g = i - Integer.MIN_VALUE;
            } else {
                lei1Var = new lei1(this, onmVar);
            }
        } else {
            lei1Var = new lei1(this, onmVar);
        }
        Object objJ = lei1Var.e;
        int i2 = lei1Var.g;
        rzq rzqVar = this.a;
        oum oumVar = this.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            if (oumVar.a) {
                ay8 ay8VarF = d3p1.F(rzqVar, this.d, new mqm(new jvm(str10, str11, str3), new lqm(Collections.singletonList(ovm.a), oumVar.a(), null, 4)));
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 18);
                lei1Var.a = str10;
                lei1Var.b = str11;
                str5 = str4;
                lei1Var.c = str5;
                lei1Var.g = 1;
                objJ = b5p1.j(ay8VarF, q1c1Var, lei1Var);
                if (objJ != d9nVar) {
                }
                return d9nVar;
            }
            return null;
        }
        if (i2 == 1) {
            String str12 = lei1Var.c;
            str11 = lei1Var.b;
            String str13 = lei1Var.a;
            hm5.M(objJ);
            str5 = str12;
            str10 = str13;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = lei1Var.d;
            str7 = lei1Var.c;
            str6 = lei1Var.b;
            hm5.M(objJ);
        }
        i1rVar = (k1r) objJ;
        if (i1rVar instanceof i1r) {
            kpmVar = ((nqm) i1rVar.a).a;
        } else {
            kpmVar = null;
        }
        Set set = s4b1.f;
        str8 = this.b;
        strZ = uic.C(str8, (String) null).z();
        if (strZ == null) {
            strZ = l1d.m("spotify:user:", Uri.encode(str8));
        }
        str9 = strZ;
        List list2 = list;
        it = list2.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fho1.y(((som) next).d, str9));
        som somVar = (som) next;
        String str14 = somVar != null ? somVar.a : null;
        arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!fho1.y(((som) obj).d, str9)) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (som somVar2 : arrayList) {
            arrayList2.add(new nm21(somVar2.a, somVar2.d));
        }
        if (str7 == null && fho1.y(str7, str9)) {
            z = true;
        } else {
            z = false;
        }
        if (oumVar.g) {
            Set set2 = s4b1.f;
            if (uic.g(str6, blc0.ti)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        return new who0(str9, str14, arrayList2, z, kpmVar, false, z2);
        i1r i1rVar2 = (k1r) objJ;
        if (i1rVar2 instanceof i1r) {
            List list3 = (List) i1rVar2.a;
            ay8 ay8VarF2 = d3p1.F(rzqVar, this.e, new mld(str10));
            q1c1 q1c1Var2 = new q1c1(2, (lnm) null, (byte) 17);
            lei1Var.a = null;
            lei1Var.b = str11;
            lei1Var.c = str5;
            lei1Var.d = list3;
            lei1Var.g = 2;
            Object objJ2 = b5p1.j(ay8VarF2, q1c1Var2, lei1Var);
            if (objJ2 != d9nVar) {
                objJ = objJ2;
                list = list3;
                str6 = str11;
                str7 = str5;
                i1rVar = (k1r) objJ;
                if (i1rVar instanceof i1r) {
                    kpmVar = ((nqm) i1rVar.a).a;
                } else {
                    kpmVar = null;
                }
                Set set3 = s4b1.f;
                str8 = this.b;
                strZ = uic.C(str8, (String) null).z();
                if (strZ == null) {
                    strZ = l1d.m("spotify:user:", Uri.encode(str8));
                }
                str9 = strZ;
                List list4 = list;
                it = list4.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fho1.y(((som) next).d, str9));
                som somVar3 = (som) next;
                String str15 = somVar3 != null ? somVar3.a : null;
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (!fho1.y(((som) obj).d, str9)) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                while (r0.hasNext()) {
                    arrayList2.add(new nm21(somVar2.a, somVar2.d));
                }
                if (str7 == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (oumVar.g) {
                    Set set4 = s4b1.f;
                    if (uic.g(str6, blc0.ti)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = true;
                }
                return new who0(str9, str15, arrayList2, z, kpmVar, false, z2);
            }
            return d9nVar;
        }
        return null;
    }
}
