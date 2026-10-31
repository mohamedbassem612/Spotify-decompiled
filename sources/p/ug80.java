package p;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ug80 {
    public final wp20 a;
    public final ArrayList b;
    public final HashMap c;
    public final ArrayList d;
    public final BitSet e;
    public final BitSet f;
    public HashMap g;
    public yr31 h;
    public boolean i;
    public int j;
    public u9t k;
    public k3c l;

    public ug80(wp20 wp20Var) {
        this.a = wp20Var;
        ArrayList arrayList = new ArrayList((List) wp20Var.a);
        arrayList.add(new j69((byte) 1));
        arrayList.add(new j69((byte) 2));
        arrayList.add(new j69((byte) 3));
        arrayList.add(new j69((byte) 0));
        arrayList.add(new j69((byte) 4));
        this.b = arrayList;
        List list = (List) wp20Var.b;
        HashMap map = new HashMap();
        Object[] objArr = {new sh7('*'), new sh7('_')};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
        }
        b(Collections.unmodifiableList(arrayList2), map);
        b(list, map);
        this.c = map;
        ArrayList arrayList3 = new ArrayList((List) wp20Var.c);
        arrayList3.add(new h5n());
        this.d = arrayList3;
        Set set = (Set) wp20Var.d;
        BitSet bitSet = new BitSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f = bitSet;
        Set setKeySet = this.c.keySet();
        ArrayList arrayList4 = this.b;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((j69) it3.next()).a().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.e = bitSet2;
    }

    public static void a(char c, v9t v9tVar, HashMap map) {
        if (((v9t) map.put(Character.valueOf(c), v9tVar)) == null) {
            return;
        }
        hhg1.n(cy30.l("Delimiter processor conflict with delimiter char '", c, "'"));
    }

    public static void b(Iterable iterable, HashMap map) {
        gab1 gab1Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            v9t v9tVar = (v9t) it.next();
            char cD = v9tVar.d();
            char cB = v9tVar.b();
            if (cD == cB) {
                v9t v9tVar2 = (v9t) map.get(Character.valueOf(cD));
                if (v9tVar2 == null || v9tVar2.d() != v9tVar2.b()) {
                    a(cD, v9tVar, map);
                } else {
                    if (v9tVar2 instanceof gab1) {
                        gab1Var = (gab1) v9tVar2;
                    } else {
                        gab1 gab1Var2 = new gab1(cD);
                        gab1Var2.e(v9tVar2);
                        gab1Var = gab1Var2;
                    }
                    gab1Var.e(v9tVar);
                    map.put(Character.valueOf(cD), gab1Var);
                }
            } else {
                a(cD, v9tVar, map);
                a(cB, v9tVar, map);
            }
        }
    }

    public static xzd1 i(ld50 ld50Var) {
        xzd1 xzd1Var = new xzd1(ld50Var.b());
        xzd1Var.e(ld50Var.c());
        return xzd1Var;
    }

    public final void c(cdo0 cdo0Var) {
        cdo0 cdo0Var2 = cdo0Var.b;
        if (cdo0Var2 == null) {
            return;
        }
        cdo0 cdo0Var3 = cdo0Var.c;
        xzd1 xzd1Var = null;
        xzd1 xzd1Var2 = null;
        int length = 0;
        while (cdo0Var2 != null) {
            if (cdo0Var2 instanceof xzd1) {
                xzd1Var2 = (xzd1) cdo0Var2;
                if (xzd1Var == null) {
                    xzd1Var = xzd1Var2;
                }
                length = xzd1Var2.g.length() + length;
            } else {
                d(xzd1Var, xzd1Var2, length);
                c(cdo0Var2);
                xzd1Var = null;
                xzd1Var2 = null;
                length = 0;
            }
            if (cdo0Var2 == cdo0Var3) {
                break;
            } else {
                cdo0Var2 = cdo0Var2.e;
            }
        }
        d(xzd1Var, xzd1Var2, length);
    }

    public final void d(xzd1 xzd1Var, xzd1 xzd1Var2, int i) {
        g4r g4rVar;
        if (xzd1Var == null || xzd1Var2 == null || xzd1Var == xzd1Var2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(xzd1Var.g);
        if (this.i) {
            g4rVar = new g4r();
            g4rVar.h(xzd1Var.c());
        } else {
            g4rVar = null;
        }
        cdo0 cdo0Var = xzd1Var.e;
        cdo0 cdo0Var2 = xzd1Var2.e;
        while (cdo0Var != cdo0Var2) {
            sb.append(((xzd1) cdo0Var).g);
            if (g4rVar != null) {
                g4rVar.h(cdo0Var.c());
            }
            cdo0 cdo0Var3 = cdo0Var.e;
            cdo0Var.g();
            cdo0Var = cdo0Var3;
        }
        xzd1Var.g = sb.toString();
        if (g4rVar != null) {
            List list = g4rVar.a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            xzd1Var.e(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0291  */
    /* JADX WARN: Code duplicated, block: B:104:0x0294  */
    /* JADX WARN: Code duplicated, block: B:108:0x029d  */
    /* JADX WARN: Code duplicated, block: B:110:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:152:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:155:0x030d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0314  */
    /* JADX WARN: Code duplicated, block: B:178:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:191:0x03da A[PHI: r8
      0x03da: PHI (r8v5 char) = (r8v4 char), (r8v6 char), (r8v7 char) binds: [B:185:0x03d0, B:187:0x03d4, B:190:0x03d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:194:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:196:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:210:0x044c  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:243:0x04db  */
    /* JADX WARN: Code duplicated, block: B:244:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:249:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:252:0x0507  */
    /* JADX WARN: Code duplicated, block: B:253:0x0509  */
    /* JADX WARN: Code duplicated, block: B:256:0x0517  */
    /* JADX WARN: Code duplicated, block: B:257:0x0520  */
    /* JADX WARN: Code duplicated, block: B:259:0x0523 A[LOOP:7: B:239:0x04c4->B:259:0x0523, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x053c A[LOOP:8: B:261:0x053a->B:262:0x053c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0547  */
    /* JADX WARN: Code duplicated, block: B:269:0x054e  */
    /* JADX WARN: Code duplicated, block: B:277:0x057b A[ADDED_TO_REGION, LOOP:9: B:277:0x057b->B:281:0x0584, LOOP_START, PHI: r4
      0x057b: PHI (r4v29 p.k3c) = (r4v28 p.k3c), (r4v30 p.k3c) binds: [B:276:0x0579, B:281:0x0584] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:278:0x057d  */
    /* JADX WARN: Code duplicated, block: B:280:0x0581  */
    /* JADX WARN: Code duplicated, block: B:283:0x0589  */
    /* JADX WARN: Code duplicated, block: B:284:0x058b  */
    /* JADX WARN: Code duplicated, block: B:314:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0529 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x04b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x0584 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x014a  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9 A[LOOP:5: B:46:0x0154->B:56:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0207  */
    /* JADX WARN: Code duplicated, block: B:74:0x020f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0223 A[LOOP:6: B:75:0x0219->B:77:0x0223, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x023f  */
    /* JADX WARN: Code duplicated, block: B:82:0x024f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0266  */
    /* JADX WARN: Code duplicated, block: B:87:0x026b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0279  */
    /* JADX WARN: Code duplicated, block: B:92:0x027c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0285  */
    /* JADX WARN: Code duplicated, block: B:98:0x0288  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ld50 ld50Var, cdo0 cdo0Var) {
        int i;
        int i2;
        vhd vhdVarUnmodifiableList;
        String strB;
        vhd az8Var;
        String str;
        ur00 ur00Var;
        ur00 ur00Var2;
        xzd1 xzd1Var;
        d9z0 d9z0VarL;
        Iterator it;
        yr31 yr31Var;
        String str2;
        String str3;
        i4t i4tVar;
        Object obj;
        lkc0 lkc0Var;
        oi oiVarA;
        cdo0 cdo0Var2;
        boolean z;
        cdo0 cdo0Var3;
        k3c k3cVar;
        d9z0 d9z0Var;
        cdo0 cdo0VarI;
        List list;
        v9t v9tVar;
        vhd vhdVarUnmodifiableList2;
        yr31 yr31Var2;
        int i3;
        int codePoint;
        d9z0 d9z0VarL2;
        ArrayList arrayList;
        boolean zI;
        yr31 yr31Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        boolean z3;
        vhd vhdVar;
        int i13;
        char cCharAt;
        int i14;
        char cCharAt2;
        u9t u9tVar;
        u9t u9tVar2;
        char cCharAt3;
        char cCharAt4;
        d9z0 d9z0VarL3;
        Iterator it2;
        zhq0 zhq0VarA;
        cdo0 cdo0Var4;
        Object k69Var;
        this.h = new yr31(ld50Var.a);
        this.i = !ld50Var.c().isEmpty();
        int i15 = 0;
        this.j = 0;
        vhd vhdVar2 = null;
        this.k = null;
        this.l = null;
        HashMap map = new HashMap();
        Iterator it3 = this.b.iterator();
        while (true) {
            int i16 = 2;
            if (it3.hasNext()) {
                j69 j69Var = (j69) it3.next();
                switch (j69Var.a) {
                    case 0:
                        k69Var = new k69();
                        break;
                    case 1:
                        k69Var = new p0a();
                        break;
                    case 2:
                        k69Var = new r0a();
                        break;
                    case 3:
                        k69Var = new zgy();
                        break;
                    default:
                        k69Var = new d170();
                        break;
                }
                Iterator it4 = j69Var.a().iterator();
                while (it4.hasNext()) {
                    ((List) map.computeIfAbsent((Character) it4.next(), new pt7((byte) 2))).add(k69Var);
                }
            } else {
                this.g = map;
                while (true) {
                    char cK = this.h.k();
                    if (cK != 0) {
                        int codePoint2 = 10;
                        if (cK != '\n') {
                            if (cK == '[') {
                                d9z0 d9z0VarL4 = this.h.l();
                                this.h.h();
                                d9z0 d9z0VarL5 = this.h.l();
                                xzd1 xzd1VarI = i(this.h.d(d9z0VarL4, d9z0VarL5));
                                k3c k3cVar2 = this.l;
                                k3c k3cVar3 = new k3c((xzd1) null, (d9z0) null, xzd1VarI, d9z0VarL4, d9z0VarL5, k3cVar2, this.k);
                                if (k3cVar2 != null) {
                                    k3cVar2.i = true;
                                }
                                this.l = k3cVar3;
                                ArrayList arrayList2 = new ArrayList(1);
                                i = 0;
                                Object obj2 = new Object[]{xzd1VarI}[0];
                                Objects.requireNonNull(obj2);
                                arrayList2.add(obj2);
                                vhdVarUnmodifiableList = Collections.unmodifiableList(arrayList2);
                            } else if (cK != ']') {
                                if (this.f.get(cK)) {
                                    d9z0 d9z0VarL6 = this.h.l();
                                    d9z0 d9z0VarL7 = this.h.l();
                                    this.h.h();
                                    d9z0 d9z0VarL8 = this.h.l();
                                    if (this.h.i('[')) {
                                        d9z0 d9z0VarL9 = this.h.l();
                                        xzd1 xzd1VarI2 = i(this.h.d(d9z0VarL7, d9z0VarL8));
                                        xzd1 xzd1VarI3 = i(this.h.d(d9z0VarL8, d9z0VarL9));
                                        k3c k3cVar4 = this.l;
                                        k3c k3cVar5 = new k3c(xzd1VarI2, d9z0VarL7, xzd1VarI3, d9z0VarL8, d9z0VarL9, k3cVar4, this.k);
                                        if (k3cVar4 != null) {
                                            k3cVar4.i = true;
                                        }
                                        this.l = k3cVar5;
                                        Object[] objArr = {xzd1VarI2, xzd1VarI3};
                                        ArrayList arrayList3 = new ArrayList(i16);
                                        for (int i17 = i15; i17 < i16; i17++) {
                                            Object obj3 = objArr[i17];
                                            Objects.requireNonNull(obj3);
                                            arrayList3.add(obj3);
                                        }
                                        vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList3);
                                    } else {
                                        vhdVarUnmodifiableList2 = vhdVar2;
                                    }
                                    if (vhdVarUnmodifiableList2 == null) {
                                        this.h.n(d9z0VarL6);
                                        if (this.e.get(cK)) {
                                            list = (List) this.g.get(Character.valueOf(cK));
                                            if (list != null) {
                                                d9z0VarL3 = this.h.l();
                                                it2 = list.iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        zhq0VarA = ((wf80) it2.next()).a(this);
                                                        if (zhq0VarA != null) {
                                                            cdo0Var4 = (cdo0) zhq0VarA.b;
                                                            this.h.n((d9z0) zhq0VarA.c);
                                                            if (this.i && cdo0Var4.c().isEmpty()) {
                                                                yr31 yr31Var4 = this.h;
                                                                cdo0Var4.e(yr31Var4.d(d9z0VarL3, yr31Var4.l()).c());
                                                            }
                                                            ArrayList arrayList4 = new ArrayList(1);
                                                            Object obj4 = new Object[]{cdo0Var4}[i15];
                                                            Objects.requireNonNull(obj4);
                                                            arrayList4.add(obj4);
                                                            vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList4);
                                                        } else {
                                                            this.h.n(d9z0VarL3);
                                                        }
                                                    } else {
                                                        v9tVar = (v9t) this.c.get(Character.valueOf(cK));
                                                        if (v9tVar == null) {
                                                            Object[] objArr2 = {f()};
                                                            ArrayList arrayList5 = new ArrayList(1);
                                                            Object obj5 = objArr2[i15];
                                                            Objects.requireNonNull(obj5);
                                                            arrayList5.add(obj5);
                                                            vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList5);
                                                        } else {
                                                            yr31Var2 = this.h;
                                                            i3 = yr31Var2.b;
                                                            if (i3 > 0) {
                                                                int i18 = i3 - 1;
                                                                cCharAt3 = ((ala1) yr31Var2.e).a.charAt(i18);
                                                                if (Character.isLowSurrogate(cCharAt3) && i18 > 0) {
                                                                    cCharAt4 = ((ala1) yr31Var2.e).a.charAt(i3 - 2);
                                                                    codePoint = cCharAt3;
                                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                                    }
                                                                }
                                                            } else if (yr31Var2.a > 0) {
                                                                codePoint = 10;
                                                            } else {
                                                                codePoint = i15;
                                                            }
                                                            codePoint = cCharAt3;
                                                            codePoint = cCharAt3;
                                                            d9z0VarL2 = this.h.l();
                                                            if (this.h.g(cK) < v9tVar.c()) {
                                                                this.h.n(d9z0VarL2);
                                                                vhdVar = vhdVar2;
                                                            } else {
                                                                arrayList = new ArrayList();
                                                                this.h.n(d9z0VarL2);
                                                                while (true) {
                                                                    zI = this.h.i(cK);
                                                                    yr31Var3 = this.h;
                                                                    if (zI) {
                                                                        arrayList.add(i(yr31Var3.d(d9z0VarL2, yr31Var3.l())));
                                                                        d9z0VarL2 = this.h.l();
                                                                    } else {
                                                                        i4 = yr31Var3.b;
                                                                        if (i4 < yr31Var3.c) {
                                                                            cCharAt = ((ala1) yr31Var3.e).a.charAt(i4);
                                                                            if (Character.isHighSurrogate(cCharAt) && (i14 = yr31Var3.b + 1) < yr31Var3.c) {
                                                                                cCharAt2 = ((ala1) yr31Var3.e).a.charAt(i14);
                                                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                                                    codePoint2 = cCharAt;
                                                                                    codePoint2 = cCharAt;
                                                                                    codePoint2 = cCharAt;
                                                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                                }
                                                                            }
                                                                        } else if (yr31Var3.a >= ((ArrayList) yr31Var3.d).size() - 1) {
                                                                            codePoint2 = i15;
                                                                        }
                                                                        if (codePoint != 0 || zno1.q(codePoint)) {
                                                                            i5 = 1;
                                                                        } else {
                                                                            i5 = i15;
                                                                        }
                                                                        if (codePoint != 0 || zno1.r(codePoint)) {
                                                                            i6 = 1;
                                                                        } else {
                                                                            i6 = i15;
                                                                        }
                                                                        if (codePoint2 != 0 || zno1.q(codePoint2)) {
                                                                            i7 = 1;
                                                                        } else {
                                                                            i7 = i15;
                                                                        }
                                                                        if (codePoint2 != 0 || zno1.r(codePoint2)) {
                                                                            i8 = 1;
                                                                        } else {
                                                                            i8 = i15;
                                                                        }
                                                                        if (i8 == 0 || (i7 != 0 && i6 == 0 && i5 == 0)) {
                                                                            i9 = i15;
                                                                        } else {
                                                                            i9 = 1;
                                                                        }
                                                                        if (i6 == 0 || (i5 != 0 && i8 == 0 && i7 == 0)) {
                                                                            i10 = i15;
                                                                        } else {
                                                                            i10 = 1;
                                                                        }
                                                                        if (cK == '_') {
                                                                            if (i9 != 0 || (i10 != 0 && i5 == 0)) {
                                                                                i13 = i15;
                                                                            } else {
                                                                                i13 = 1;
                                                                            }
                                                                            if (i10 != 0 || (i9 != 0 && i7 == 0)) {
                                                                                z3 = i15;
                                                                                z2 = i13;
                                                                            } else {
                                                                                z3 = 1;
                                                                                z2 = i13;
                                                                            }
                                                                        } else {
                                                                            if (i9 == 0 && cK == v9tVar.d()) {
                                                                                i11 = 1;
                                                                            } else {
                                                                                i11 = i15;
                                                                            }
                                                                            if (i10 == 0 && cK == v9tVar.b()) {
                                                                                i12 = 1;
                                                                            } else {
                                                                                i12 = i15;
                                                                            }
                                                                            z2 = i11;
                                                                            z3 = i12;
                                                                        }
                                                                        vhdVar = new vhd(arrayList, z2, z3);
                                                                    }
                                                                }
                                                            }
                                                            if (vhdVar == null) {
                                                                vhdVarUnmodifiableList2 = vhdVar2;
                                                            } else {
                                                                vhd vhdVar3 = (ArrayList) vhdVar.d;
                                                                u9tVar = new u9t(vhdVar3, cK, vhdVar.c, vhdVar.b, this.k);
                                                                this.k = u9tVar;
                                                                u9tVar2 = u9tVar.f;
                                                                if (u9tVar2 != null) {
                                                                    u9tVar2.g = u9tVar;
                                                                }
                                                                vhdVarUnmodifiableList2 = vhdVar3;
                                                            }
                                                            if (vhdVarUnmodifiableList2 == null) {
                                                                Object[] objArr3 = {f()};
                                                                ArrayList arrayList6 = new ArrayList(1);
                                                                Object obj6 = objArr3[i15];
                                                                Objects.requireNonNull(obj6);
                                                                arrayList6.add(obj6);
                                                                vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList6);
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                v9tVar = (v9t) this.c.get(Character.valueOf(cK));
                                                if (v9tVar == null) {
                                                    Object[] objArr4 = {f()};
                                                    ArrayList arrayList7 = new ArrayList(1);
                                                    Object obj7 = objArr4[i15];
                                                    Objects.requireNonNull(obj7);
                                                    arrayList7.add(obj7);
                                                    vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList7);
                                                } else {
                                                    yr31Var2 = this.h;
                                                    i3 = yr31Var2.b;
                                                    if (i3 > 0) {
                                                        int i19 = i3 - 1;
                                                        cCharAt3 = ((ala1) yr31Var2.e).a.charAt(i19);
                                                        if (Character.isLowSurrogate(cCharAt3)) {
                                                            cCharAt4 = ((ala1) yr31Var2.e).a.charAt(i3 - 2);
                                                            codePoint = cCharAt3;
                                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                            }
                                                        }
                                                    } else if (yr31Var2.a > 0) {
                                                        codePoint = 10;
                                                    } else {
                                                        codePoint = i15;
                                                    }
                                                    codePoint = cCharAt3;
                                                    codePoint = cCharAt3;
                                                    d9z0VarL2 = this.h.l();
                                                    if (this.h.g(cK) < v9tVar.c()) {
                                                        this.h.n(d9z0VarL2);
                                                        vhdVar = vhdVar2;
                                                    } else {
                                                        arrayList = new ArrayList();
                                                        this.h.n(d9z0VarL2);
                                                        while (true) {
                                                            zI = this.h.i(cK);
                                                            yr31Var3 = this.h;
                                                            if (zI) {
                                                                arrayList.add(i(yr31Var3.d(d9z0VarL2, yr31Var3.l())));
                                                                d9z0VarL2 = this.h.l();
                                                            } else {
                                                                i4 = yr31Var3.b;
                                                                if (i4 < yr31Var3.c) {
                                                                    cCharAt = ((ala1) yr31Var3.e).a.charAt(i4);
                                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                                        cCharAt2 = ((ala1) yr31Var3.e).a.charAt(i14);
                                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                        }
                                                                    }
                                                                } else if (yr31Var3.a >= ((ArrayList) yr31Var3.d).size() - 1) {
                                                                    codePoint2 = i15;
                                                                }
                                                                if (codePoint != 0) {
                                                                    i5 = 1;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                                if (codePoint != 0) {
                                                                    i6 = 1;
                                                                } else {
                                                                    i6 = 1;
                                                                }
                                                                if (codePoint2 != 0) {
                                                                    i7 = 1;
                                                                } else {
                                                                    i7 = 1;
                                                                }
                                                                if (codePoint2 != 0) {
                                                                    i8 = 1;
                                                                } else {
                                                                    i8 = 1;
                                                                }
                                                                if (i8 == 0) {
                                                                    i9 = i15;
                                                                } else {
                                                                    i9 = i15;
                                                                }
                                                                if (i6 == 0) {
                                                                    i10 = i15;
                                                                } else {
                                                                    i10 = i15;
                                                                }
                                                                if (cK == '_') {
                                                                    if (i9 != 0) {
                                                                        i13 = i15;
                                                                    } else {
                                                                        i13 = i15;
                                                                    }
                                                                    if (i10 != 0) {
                                                                        z3 = i15;
                                                                        z2 = i13;
                                                                    } else {
                                                                        z3 = i15;
                                                                        z2 = i13;
                                                                    }
                                                                } else {
                                                                    if (i9 == 0) {
                                                                        i11 = i15;
                                                                    } else {
                                                                        i11 = i15;
                                                                    }
                                                                    if (i10 == 0) {
                                                                        i12 = i15;
                                                                    } else {
                                                                        i12 = i15;
                                                                    }
                                                                    z2 = i11;
                                                                    z3 = i12;
                                                                }
                                                                vhdVar = new vhd(arrayList, z2, z3);
                                                            }
                                                        }
                                                    }
                                                    if (vhdVar == null) {
                                                        vhdVarUnmodifiableList2 = vhdVar2;
                                                    } else {
                                                        vhd vhdVar4 = (ArrayList) vhdVar.d;
                                                        u9tVar = new u9t(vhdVar4, cK, vhdVar.c, vhdVar.b, this.k);
                                                        this.k = u9tVar;
                                                        u9tVar2 = u9tVar.f;
                                                        if (u9tVar2 != null) {
                                                            u9tVar2.g = u9tVar;
                                                        }
                                                        vhdVarUnmodifiableList2 = vhdVar4;
                                                    }
                                                    if (vhdVarUnmodifiableList2 == null) {
                                                        Object[] objArr5 = {f()};
                                                        ArrayList arrayList8 = new ArrayList(1);
                                                        Object obj8 = objArr5[i15];
                                                        Objects.requireNonNull(obj8);
                                                        arrayList8.add(obj8);
                                                        vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList8);
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = {f()};
                                            ArrayList arrayList9 = new ArrayList(1);
                                            Object obj9 = objArr6[i15];
                                            Objects.requireNonNull(obj9);
                                            arrayList9.add(obj9);
                                            vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList9);
                                        }
                                    }
                                } else if (this.e.get(cK)) {
                                    Object[] objArr7 = {f()};
                                    ArrayList arrayList10 = new ArrayList(1);
                                    Object obj10 = objArr7[i15];
                                    Objects.requireNonNull(obj10);
                                    arrayList10.add(obj10);
                                    vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList10);
                                } else {
                                    list = (List) this.g.get(Character.valueOf(cK));
                                    if (list != null) {
                                        d9z0VarL3 = this.h.l();
                                        it2 = list.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                zhq0VarA = ((wf80) it2.next()).a(this);
                                                if (zhq0VarA != null) {
                                                    cdo0Var4 = (cdo0) zhq0VarA.b;
                                                    this.h.n((d9z0) zhq0VarA.c);
                                                    if (this.i) {
                                                        yr31 yr31Var5 = this.h;
                                                        cdo0Var4.e(yr31Var5.d(d9z0VarL3, yr31Var5.l()).c());
                                                    }
                                                    ArrayList arrayList11 = new ArrayList(1);
                                                    Object obj11 = new Object[]{cdo0Var4}[i15];
                                                    Objects.requireNonNull(obj11);
                                                    arrayList11.add(obj11);
                                                    vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList11);
                                                } else {
                                                    this.h.n(d9z0VarL3);
                                                }
                                            } else {
                                                v9tVar = (v9t) this.c.get(Character.valueOf(cK));
                                                if (v9tVar == null) {
                                                    Object[] objArr8 = {f()};
                                                    ArrayList arrayList12 = new ArrayList(1);
                                                    Object obj12 = objArr8[i15];
                                                    Objects.requireNonNull(obj12);
                                                    arrayList12.add(obj12);
                                                    vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList12);
                                                } else {
                                                    yr31Var2 = this.h;
                                                    i3 = yr31Var2.b;
                                                    if (i3 > 0) {
                                                        int i110 = i3 - 1;
                                                        cCharAt3 = ((ala1) yr31Var2.e).a.charAt(i110);
                                                        if (Character.isLowSurrogate(cCharAt3)) {
                                                            cCharAt4 = ((ala1) yr31Var2.e).a.charAt(i3 - 2);
                                                            codePoint = cCharAt3;
                                                            if (Character.isHighSurrogate(cCharAt4)) {
                                                                codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                            }
                                                        }
                                                    } else if (yr31Var2.a > 0) {
                                                        codePoint = 10;
                                                    } else {
                                                        codePoint = i15;
                                                    }
                                                    codePoint = cCharAt3;
                                                    codePoint = cCharAt3;
                                                    d9z0VarL2 = this.h.l();
                                                    if (this.h.g(cK) < v9tVar.c()) {
                                                        this.h.n(d9z0VarL2);
                                                        vhdVar = vhdVar2;
                                                    } else {
                                                        arrayList = new ArrayList();
                                                        this.h.n(d9z0VarL2);
                                                        while (true) {
                                                            zI = this.h.i(cK);
                                                            yr31Var3 = this.h;
                                                            if (zI) {
                                                                arrayList.add(i(yr31Var3.d(d9z0VarL2, yr31Var3.l())));
                                                                d9z0VarL2 = this.h.l();
                                                            } else {
                                                                i4 = yr31Var3.b;
                                                                if (i4 < yr31Var3.c) {
                                                                    cCharAt = ((ala1) yr31Var3.e).a.charAt(i4);
                                                                    if (Character.isHighSurrogate(cCharAt)) {
                                                                        cCharAt2 = ((ala1) yr31Var3.e).a.charAt(i14);
                                                                        if (Character.isLowSurrogate(cCharAt2)) {
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = cCharAt;
                                                                            codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                        }
                                                                    }
                                                                } else if (yr31Var3.a >= ((ArrayList) yr31Var3.d).size() - 1) {
                                                                    codePoint2 = i15;
                                                                }
                                                                if (codePoint != 0) {
                                                                    i5 = 1;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                                if (codePoint != 0) {
                                                                    i6 = 1;
                                                                } else {
                                                                    i6 = 1;
                                                                }
                                                                if (codePoint2 != 0) {
                                                                    i7 = 1;
                                                                } else {
                                                                    i7 = 1;
                                                                }
                                                                if (codePoint2 != 0) {
                                                                    i8 = 1;
                                                                } else {
                                                                    i8 = 1;
                                                                }
                                                                if (i8 == 0) {
                                                                    i9 = i15;
                                                                } else {
                                                                    i9 = i15;
                                                                }
                                                                if (i6 == 0) {
                                                                    i10 = i15;
                                                                } else {
                                                                    i10 = i15;
                                                                }
                                                                if (cK == '_') {
                                                                    if (i9 != 0) {
                                                                        i13 = i15;
                                                                    } else {
                                                                        i13 = i15;
                                                                    }
                                                                    if (i10 != 0) {
                                                                        z3 = i15;
                                                                        z2 = i13;
                                                                    } else {
                                                                        z3 = i15;
                                                                        z2 = i13;
                                                                    }
                                                                } else {
                                                                    if (i9 == 0) {
                                                                        i11 = i15;
                                                                    } else {
                                                                        i11 = i15;
                                                                    }
                                                                    if (i10 == 0) {
                                                                        i12 = i15;
                                                                    } else {
                                                                        i12 = i15;
                                                                    }
                                                                    z2 = i11;
                                                                    z3 = i12;
                                                                }
                                                                vhdVar = new vhd(arrayList, z2, z3);
                                                            }
                                                        }
                                                    }
                                                    if (vhdVar == null) {
                                                        vhdVarUnmodifiableList2 = vhdVar2;
                                                    } else {
                                                        vhd vhdVar5 = (ArrayList) vhdVar.d;
                                                        u9tVar = new u9t(vhdVar5, cK, vhdVar.c, vhdVar.b, this.k);
                                                        this.k = u9tVar;
                                                        u9tVar2 = u9tVar.f;
                                                        if (u9tVar2 != null) {
                                                            u9tVar2.g = u9tVar;
                                                        }
                                                        vhdVarUnmodifiableList2 = vhdVar5;
                                                    }
                                                    if (vhdVarUnmodifiableList2 == null) {
                                                        Object[] objArr9 = {f()};
                                                        ArrayList arrayList13 = new ArrayList(1);
                                                        Object obj13 = objArr9[i15];
                                                        Objects.requireNonNull(obj13);
                                                        arrayList13.add(obj13);
                                                        vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList13);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        v9tVar = (v9t) this.c.get(Character.valueOf(cK));
                                        if (v9tVar == null) {
                                            Object[] objArr10 = {f()};
                                            ArrayList arrayList14 = new ArrayList(1);
                                            Object obj14 = objArr10[i15];
                                            Objects.requireNonNull(obj14);
                                            arrayList14.add(obj14);
                                            vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList14);
                                        } else {
                                            yr31Var2 = this.h;
                                            i3 = yr31Var2.b;
                                            if (i3 > 0) {
                                                int i111 = i3 - 1;
                                                cCharAt3 = ((ala1) yr31Var2.e).a.charAt(i111);
                                                if (Character.isLowSurrogate(cCharAt3)) {
                                                    cCharAt4 = ((ala1) yr31Var2.e).a.charAt(i3 - 2);
                                                    codePoint = cCharAt3;
                                                    if (Character.isHighSurrogate(cCharAt4)) {
                                                        codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                    }
                                                }
                                            } else if (yr31Var2.a > 0) {
                                                codePoint = 10;
                                            } else {
                                                codePoint = i15;
                                            }
                                            codePoint = cCharAt3;
                                            codePoint = cCharAt3;
                                            d9z0VarL2 = this.h.l();
                                            if (this.h.g(cK) < v9tVar.c()) {
                                                this.h.n(d9z0VarL2);
                                                vhdVar = vhdVar2;
                                            } else {
                                                arrayList = new ArrayList();
                                                this.h.n(d9z0VarL2);
                                                while (true) {
                                                    zI = this.h.i(cK);
                                                    yr31Var3 = this.h;
                                                    if (zI) {
                                                        arrayList.add(i(yr31Var3.d(d9z0VarL2, yr31Var3.l())));
                                                        d9z0VarL2 = this.h.l();
                                                    } else {
                                                        i4 = yr31Var3.b;
                                                        if (i4 < yr31Var3.c) {
                                                            cCharAt = ((ala1) yr31Var3.e).a.charAt(i4);
                                                            if (Character.isHighSurrogate(cCharAt)) {
                                                                cCharAt2 = ((ala1) yr31Var3.e).a.charAt(i14);
                                                                if (Character.isLowSurrogate(cCharAt2)) {
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = cCharAt;
                                                                    codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                                }
                                                            }
                                                        } else if (yr31Var3.a >= ((ArrayList) yr31Var3.d).size() - 1) {
                                                            codePoint2 = i15;
                                                        }
                                                        if (codePoint != 0) {
                                                            i5 = 1;
                                                        } else {
                                                            i5 = 1;
                                                        }
                                                        if (codePoint != 0) {
                                                            i6 = 1;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        if (codePoint2 != 0) {
                                                            i7 = 1;
                                                        } else {
                                                            i7 = 1;
                                                        }
                                                        if (codePoint2 != 0) {
                                                            i8 = 1;
                                                        } else {
                                                            i8 = 1;
                                                        }
                                                        if (i8 == 0) {
                                                            i9 = i15;
                                                        } else {
                                                            i9 = i15;
                                                        }
                                                        if (i6 == 0) {
                                                            i10 = i15;
                                                        } else {
                                                            i10 = i15;
                                                        }
                                                        if (cK == '_') {
                                                            if (i9 != 0) {
                                                                i13 = i15;
                                                            } else {
                                                                i13 = i15;
                                                            }
                                                            if (i10 != 0) {
                                                                z3 = i15;
                                                                z2 = i13;
                                                            } else {
                                                                z3 = i15;
                                                                z2 = i13;
                                                            }
                                                        } else {
                                                            if (i9 == 0) {
                                                                i11 = i15;
                                                            } else {
                                                                i11 = i15;
                                                            }
                                                            if (i10 == 0) {
                                                                i12 = i15;
                                                            } else {
                                                                i12 = i15;
                                                            }
                                                            z2 = i11;
                                                            z3 = i12;
                                                        }
                                                        vhdVar = new vhd(arrayList, z2, z3);
                                                    }
                                                }
                                            }
                                            if (vhdVar == null) {
                                                vhdVarUnmodifiableList2 = vhdVar2;
                                            } else {
                                                vhd vhdVar6 = (ArrayList) vhdVar.d;
                                                u9tVar = new u9t(vhdVar6, cK, vhdVar.c, vhdVar.b, this.k);
                                                this.k = u9tVar;
                                                u9tVar2 = u9tVar.f;
                                                if (u9tVar2 != null) {
                                                    u9tVar2.g = u9tVar;
                                                }
                                                vhdVarUnmodifiableList2 = vhdVar6;
                                            }
                                            if (vhdVarUnmodifiableList2 == null) {
                                                Object[] objArr11 = {f()};
                                                ArrayList arrayList15 = new ArrayList(1);
                                                Object obj15 = objArr11[i15];
                                                Objects.requireNonNull(obj15);
                                                arrayList15.add(obj15);
                                                vhdVarUnmodifiableList2 = Collections.unmodifiableList(arrayList15);
                                            }
                                        }
                                    }
                                }
                                vhd vhdVar7 = vhdVarUnmodifiableList2;
                                i = i15;
                                vhdVarUnmodifiableList = vhdVar7;
                                i2 = i16;
                            } else {
                                d9z0 d9z0VarL10 = this.h.l();
                                this.h.h();
                                d9z0 d9z0VarL11 = this.h.l();
                                k3c k3cVar6 = this.l;
                                if (k3cVar6 == null) {
                                    cdo0VarI = i(this.h.d(d9z0VarL10, d9z0VarL11));
                                } else {
                                    xzd1 xzd1Var2 = k3cVar6.a;
                                    d9z0 d9z0Var2 = k3cVar6.e;
                                    if (k3cVar6.h) {
                                        d9z0 d9z0VarL12 = this.h.l();
                                        yr31 yr31Var6 = this.h;
                                        if (yr31Var6.i('(')) {
                                            yr31Var6.o();
                                            char cK2 = yr31Var6.k();
                                            d9z0 d9z0VarL13 = yr31Var6.l();
                                            String strB2 = jch0.b0(yr31Var6) ? atz.b(cK2 == '<' ? cy30.h(1, 1, yr31Var6.d(d9z0VarL13, yr31Var6.l()).b()) : yr31Var6.d(d9z0VarL13, yr31Var6.l()).b()) : null;
                                            if (strB2 != null) {
                                                if (yr31Var6.o() >= 1) {
                                                    d9z0 d9z0VarL14 = yr31Var6.l();
                                                    if (yr31Var6.e()) {
                                                        char cK3 = yr31Var6.k();
                                                        char c = '\"';
                                                        if (cK3 != '\"') {
                                                            c = '\'';
                                                            if (cK3 == '\'') {
                                                                yr31Var6.h();
                                                                if (!jch0.d0(yr31Var6, c) && yr31Var6.e()) {
                                                                    yr31Var6.h();
                                                                    String strB3 = yr31Var6.d(d9z0VarL14, yr31Var6.l()).b();
                                                                    strB = atz.b(strB3.substring(1, strB3.length() - 1));
                                                                } else {
                                                                    strB = null;
                                                                }
                                                            } else if (cK3 != '(') {
                                                                strB = null;
                                                            } else {
                                                                c = ')';
                                                                yr31Var6.h();
                                                                if (jch0.d0(yr31Var6, c)) {
                                                                    strB = null;
                                                                } else {
                                                                    yr31Var6.h();
                                                                    String strB4 = yr31Var6.d(d9z0VarL14, yr31Var6.l()).b();
                                                                    strB = atz.b(strB4.substring(1, strB4.length() - 1));
                                                                }
                                                            }
                                                        } else {
                                                            yr31Var6.h();
                                                            if (jch0.d0(yr31Var6, c)) {
                                                                strB = null;
                                                            } else {
                                                                yr31Var6.h();
                                                                String strB5 = yr31Var6.d(d9z0VarL14, yr31Var6.l()).b();
                                                                strB = atz.b(strB5.substring(1, strB5.length() - 1));
                                                            }
                                                        }
                                                    } else {
                                                        strB = null;
                                                    }
                                                    yr31Var6.o();
                                                } else {
                                                    strB = null;
                                                }
                                                if (yr31Var6.i(')')) {
                                                    az8Var = new az8(strB2, strB, (byte) 2);
                                                } else {
                                                    az8Var = null;
                                                }
                                            } else {
                                                az8Var = null;
                                            }
                                        } else {
                                            az8Var = vhdVar2;
                                        }
                                        yr31 yr31Var7 = this.h;
                                        if (az8Var != null) {
                                            ur00Var = new ur00(k3cVar6.a, yr31Var7.d(d9z0Var2, d9z0VarL10).b(), (Object) null, az8Var.b, az8Var.c, (byte) 11);
                                        } else {
                                            yr31Var7.n(d9z0VarL12);
                                            yr31 yr31Var8 = this.h;
                                            if (yr31Var8.i('[')) {
                                                d9z0 d9z0VarL15 = yr31Var8.l();
                                                if (jch0.c0(yr31Var8)) {
                                                    d9z0 d9z0VarL16 = yr31Var8.l();
                                                    if (yr31Var8.i(']')) {
                                                        String strB6 = yr31Var8.d(d9z0VarL15, d9z0VarL16).b();
                                                        if (strB6.length() > 999) {
                                                            str = null;
                                                        } else {
                                                            str = strB6;
                                                        }
                                                    } else {
                                                        str = null;
                                                    }
                                                } else {
                                                    str = null;
                                                }
                                            } else {
                                                str = null;
                                            }
                                            if (str == null) {
                                                this.h.n(d9z0VarL12);
                                            }
                                            boolean z4 = str == null || str.isEmpty();
                                            if (k3cVar6.i && z4 && xzd1Var2 == null) {
                                                ur00Var2 = null;
                                            } else {
                                                ur00Var = new ur00(k3cVar6.a, this.h.d(d9z0Var2, d9z0VarL10).b(), str, (Object) null, (Object) null, (byte) 11);
                                            }
                                            xzd1Var = k3cVar6.c;
                                            if (ur00Var2 == null) {
                                                cdo0Var2 = null;
                                            } else {
                                                d9z0VarL = this.h.l();
                                                it = this.d.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        h5n h5nVar = (h5n) it.next();
                                                        yr31Var = this.h;
                                                        h5nVar.getClass();
                                                        str2 = (String) ur00Var2.e;
                                                        if (str2 != null) {
                                                            oiVarA = h5n.a(ur00Var2, yr31Var, str2, (String) ur00Var2.f);
                                                        } else {
                                                            str3 = (String) ur00Var2.d;
                                                            if (str3 != null || str3.isEmpty()) {
                                                                str3 = (String) ur00Var2.c;
                                                            }
                                                            i4tVar = (i4t) ((p321) this.a.e).a.get(lkc0.class);
                                                            if (i4tVar == null) {
                                                                obj = null;
                                                            } else {
                                                                obj = i4tVar.a.get(atz.a(str3));
                                                            }
                                                            lkc0Var = (lkc0) obj;
                                                            if (lkc0Var != null) {
                                                                oiVarA = h5n.a(ur00Var2, yr31Var, lkc0Var.h, lkc0Var.i);
                                                            } else {
                                                                oiVarA = null;
                                                            }
                                                        }
                                                        if (oiVarA == null) {
                                                            this.h.n(d9z0VarL);
                                                        } else {
                                                            cdo0Var2 = (cdo0) oiVarA.c;
                                                            d9z0 d9z0Var3 = (d9z0) oiVarA.d;
                                                            z = oiVarA.b;
                                                            this.h.n(d9z0Var3);
                                                            cdo0Var3 = xzd1Var.e;
                                                            while (cdo0Var3 != null) {
                                                                cdo0 cdo0Var5 = cdo0Var3.e;
                                                                cdo0Var2.b(cdo0Var3);
                                                                cdo0Var3 = cdo0Var5;
                                                            }
                                                            if (this.i) {
                                                                if (z || (d9z0Var = k3cVar6.b) == null) {
                                                                    d9z0Var = k3cVar6.d;
                                                                }
                                                                yr31 yr31Var9 = this.h;
                                                                cdo0Var2.e(yr31Var9.d(d9z0Var, yr31Var9.l()).c());
                                                            }
                                                            g(k3cVar6.g);
                                                            c(cdo0Var2);
                                                            if (z && xzd1Var2 != null) {
                                                                xzd1Var2.g();
                                                            }
                                                            xzd1Var.g();
                                                            k3cVar = this.l.f;
                                                            this.l = k3cVar;
                                                            if (xzd1Var2 == null) {
                                                                while (k3cVar != null) {
                                                                    if (k3cVar.a == null) {
                                                                        k3cVar.h = false;
                                                                    }
                                                                    k3cVar = k3cVar.f;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdo0Var2 = null;
                                                    }
                                                }
                                            }
                                            if (cdo0Var2 != null) {
                                                cdo0VarI = cdo0Var2;
                                            } else {
                                                this.h.n(d9z0VarL11);
                                                this.l = this.l.f;
                                                cdo0VarI = i(this.h.d(d9z0VarL10, d9z0VarL11));
                                            }
                                        }
                                        ur00Var2 = ur00Var;
                                        xzd1Var = k3cVar6.c;
                                        if (ur00Var2 == null) {
                                            cdo0Var2 = null;
                                        } else {
                                            d9z0VarL = this.h.l();
                                            it = this.d.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    h5n h5nVar2 = (h5n) it.next();
                                                    yr31Var = this.h;
                                                    h5nVar2.getClass();
                                                    str2 = (String) ur00Var2.e;
                                                    if (str2 != null) {
                                                        oiVarA = h5n.a(ur00Var2, yr31Var, str2, (String) ur00Var2.f);
                                                    } else {
                                                        str3 = (String) ur00Var2.d;
                                                        if (str3 != null) {
                                                            str3 = (String) ur00Var2.c;
                                                        } else {
                                                            str3 = (String) ur00Var2.c;
                                                        }
                                                        i4tVar = (i4t) ((p321) this.a.e).a.get(lkc0.class);
                                                        if (i4tVar == null) {
                                                            obj = null;
                                                        } else {
                                                            obj = i4tVar.a.get(atz.a(str3));
                                                        }
                                                        lkc0Var = (lkc0) obj;
                                                        if (lkc0Var != null) {
                                                            oiVarA = h5n.a(ur00Var2, yr31Var, lkc0Var.h, lkc0Var.i);
                                                        } else {
                                                            oiVarA = null;
                                                        }
                                                    }
                                                    if (oiVarA == null) {
                                                        this.h.n(d9z0VarL);
                                                    } else {
                                                        cdo0Var2 = (cdo0) oiVarA.c;
                                                        d9z0 d9z0Var4 = (d9z0) oiVarA.d;
                                                        z = oiVarA.b;
                                                        this.h.n(d9z0Var4);
                                                        cdo0Var3 = xzd1Var.e;
                                                        while (cdo0Var3 != null) {
                                                            cdo0 cdo0Var6 = cdo0Var3.e;
                                                            cdo0Var2.b(cdo0Var3);
                                                            cdo0Var3 = cdo0Var6;
                                                        }
                                                        if (this.i) {
                                                            if (z) {
                                                                d9z0Var = k3cVar6.d;
                                                            } else {
                                                                d9z0Var = k3cVar6.d;
                                                            }
                                                            yr31 yr31Var10 = this.h;
                                                            cdo0Var2.e(yr31Var10.d(d9z0Var, yr31Var10.l()).c());
                                                        }
                                                        g(k3cVar6.g);
                                                        c(cdo0Var2);
                                                        if (z) {
                                                            xzd1Var2.g();
                                                        }
                                                        xzd1Var.g();
                                                        k3cVar = this.l.f;
                                                        this.l = k3cVar;
                                                        if (xzd1Var2 == null) {
                                                            while (k3cVar != null) {
                                                                if (k3cVar.a == null) {
                                                                    k3cVar.h = false;
                                                                }
                                                                k3cVar = k3cVar.f;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    cdo0Var2 = null;
                                                }
                                            }
                                        }
                                        if (cdo0Var2 != null) {
                                            cdo0VarI = cdo0Var2;
                                        } else {
                                            this.h.n(d9z0VarL11);
                                            this.l = this.l.f;
                                            cdo0VarI = i(this.h.d(d9z0VarL10, d9z0VarL11));
                                        }
                                    } else {
                                        this.l = k3cVar6.f;
                                        cdo0VarI = i(this.h.d(d9z0VarL10, d9z0VarL11));
                                    }
                                }
                                ArrayList arrayList16 = new ArrayList(1);
                                Object obj16 = new Object[]{cdo0VarI}[0];
                                Objects.requireNonNull(obj16);
                                arrayList16.add(obj16);
                                vhdVarUnmodifiableList = Collections.unmodifiableList(arrayList16);
                                i = 0;
                            }
                            i2 = 2;
                        } else {
                            i = i15;
                            this.h.h();
                            i2 = 2;
                            int i20 = this.j >= 2 ? 1 : i;
                            this.j = i;
                            Object bt50Var = i20 != 0 ? new bt50() : new j6a1();
                            ArrayList arrayList17 = new ArrayList(1);
                            Object obj17 = new Object[]{bt50Var}[i];
                            Objects.requireNonNull(obj17);
                            arrayList17.add(obj17);
                            vhdVarUnmodifiableList = Collections.unmodifiableList(arrayList17);
                        }
                    } else {
                        i = i15;
                        i2 = i16;
                        vhdVarUnmodifiableList = null;
                    }
                    if (vhdVarUnmodifiableList == null) {
                        g(null);
                        c(cdo0Var);
                        return;
                    }
                    vhdVar2 = null;
                    Iterator it5 = vhdVarUnmodifiableList.iterator();
                    while (it5.hasNext()) {
                        cdo0Var.b((cdo0) it5.next());
                    }
                    i15 = i;
                    i16 = i2;
                }
            }
        }
    }

    public final xzd1 f() {
        char cK;
        d9z0 d9z0VarL = this.h.l();
        this.h.h();
        while (true) {
            cK = this.h.k();
            if (cK == 0 || this.e.get(cK)) {
                break;
            }
            this.h.h();
        }
        yr31 yr31Var = this.h;
        ld50 ld50VarD = yr31Var.d(d9z0VarL, yr31Var.l());
        String strB = ld50VarD.b();
        if (cK == '\n') {
            int length = strB.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strB.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i = length + 1;
            this.j = strB.length() - i;
            strB = strB.substring(0, i);
        } else if (cK == 0) {
            strB = strB.substring(0, zno1.x(strB.length() - 1, 0, strB) + 1);
        }
        xzd1 xzd1Var = new xzd1(strB);
        xzd1Var.e(ld50VarD.c());
        return xzd1Var;
    }

    public final void g(u9t u9tVar) {
        boolean z;
        HashMap map = new HashMap();
        u9t u9tVar2 = this.k;
        while (u9tVar2 != null) {
            u9t u9tVar3 = u9tVar2.f;
            if (u9tVar3 == u9tVar) {
                break;
            } else {
                u9tVar2 = u9tVar3;
            }
        }
        while (u9tVar2 != null) {
            ArrayList arrayList = u9tVar2.a;
            char c = u9tVar2.b;
            v9t v9tVar = (v9t) this.c.get(Character.valueOf(c));
            if (!u9tVar2.e || v9tVar == null) {
                u9tVar2 = u9tVar2.g;
            } else {
                char cD = v9tVar.d();
                u9t u9tVar4 = u9tVar2.f;
                int iA = 0;
                boolean z2 = false;
                while (true) {
                    if (u9tVar4 == null || u9tVar4 == u9tVar || u9tVar4 == map.get(Character.valueOf(c))) {
                        z = false;
                        break;
                    }
                    if (u9tVar4.d && u9tVar4.b == cD) {
                        iA = v9tVar.a(u9tVar4, u9tVar2);
                        if (iA > 0) {
                            z = true;
                            z2 = true;
                            break;
                        }
                        z2 = true;
                    }
                    u9tVar4 = u9tVar4.f;
                }
                if (z) {
                    for (int i = 0; i < iA; i++) {
                        ArrayList arrayList2 = u9tVar4.a;
                        ((xzd1) arrayList2.remove(arrayList2.size() - 1)).g();
                    }
                    for (int i2 = 0; i2 < iA; i2++) {
                        ((xzd1) arrayList.remove(0)).g();
                    }
                    u9t u9tVar5 = u9tVar2.f;
                    while (u9tVar5 != null && u9tVar5 != u9tVar4) {
                        u9t u9tVar6 = u9tVar5.f;
                        h(u9tVar5);
                        u9tVar5 = u9tVar6;
                    }
                    if (u9tVar4.a.size() == 0) {
                        h(u9tVar4);
                    }
                    if (arrayList.size() == 0) {
                        u9t u9tVar7 = u9tVar2.g;
                        h(u9tVar2);
                        u9tVar2 = u9tVar7;
                    }
                } else {
                    if (!z2) {
                        map.put(Character.valueOf(c), u9tVar2.f);
                        if (!u9tVar2.d) {
                            h(u9tVar2);
                        }
                    }
                    u9tVar2 = u9tVar2.g;
                }
            }
        }
        while (true) {
            u9t u9tVar8 = this.k;
            if (u9tVar8 == null || u9tVar8 == u9tVar) {
                return;
            } else {
                h(u9tVar8);
            }
        }
    }

    public final void h(u9t u9tVar) {
        u9t u9tVar2 = u9tVar.f;
        if (u9tVar2 != null) {
            u9tVar2.g = u9tVar.g;
        }
        u9t u9tVar3 = u9tVar.g;
        if (u9tVar3 == null) {
            this.k = u9tVar2;
        } else {
            u9tVar3.f = u9tVar2;
        }
    }
}
