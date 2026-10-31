package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c6i0 extends a8d1 implements vu30 {
    public boolean N0;
    public boolean O0;
    public byte P0;
    public /* synthetic */ Object Q0;
    public final /* synthetic */ n6i0 R0;
    public long X;
    public long Y;
    public long Z;
    public String a;
    public l2t b;
    public y5i0 c;
    public String d;
    public wzd1 e;
    public o6i0 f;
    public sm51 g;
    public int h;
    public long i;
    public long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6i0(n6i0 n6i0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.R0 = n6i0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        c6i0 c6i0Var = new c6i0(this.R0, lnmVar);
        c6i0Var.Q0 = obj;
        return c6i0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0478  */
    /* JADX WARN: Code duplicated, block: B:154:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:161:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:164:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:167:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:170:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:173:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:176:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:178:0x0508  */
    /* JADX WARN: Code duplicated, block: B:179:0x050b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x050e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0546  */
    /* JADX WARN: Code duplicated, block: B:186:0x0549 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:187:0x054b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0568 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x056a  */
    /* JADX WARN: Code duplicated, block: B:190:0x056f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0572  */
    /* JADX WARN: Code duplicated, block: B:196:0x0580  */
    /* JADX WARN: Code duplicated, block: B:198:0x0590  */
    /* JADX WARN: Code duplicated, block: B:199:0x0594  */
    /* JADX WARN: Code duplicated, block: B:201:0x0597  */
    /* JADX WARN: Code duplicated, block: B:202:0x059a  */
    /* JADX WARN: Code duplicated, block: B:205:0x05a3 A[LOOP:1: B:194:0x057a->B:205:0x05a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:209:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:212:0x05f0 A[PHI: r2 r4 r6 r11 r16 r19 r21 r24 r26 r30
      0x05f0: PHI (r2v24 p.n6i0) = (r2v23 p.n6i0), (r2v23 p.n6i0), (r2v28 p.n6i0) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r4v12 long) = (r4v11 long), (r4v11 long), (r4v16 long) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r6v30 long) = (r6v29 long), (r6v29 long), (r6v33 long) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r11v18 p.d9n) = (r11v17 p.d9n), (r11v17 p.d9n), (r11v20 p.d9n) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r16v2 boolean) = (r16v1 boolean), (r16v1 boolean), (r16v5 boolean) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r19v13 long) = (r19v12 long), (r19v12 long), (r19v16 long) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r21v6 p.wzd1) = (r21v5 p.wzd1), (r21v5 p.wzd1), (r21v9 p.wzd1) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r24v6 int) = (r24v5 int), (r24v5 int), (r24v8 int) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r26v4 boolean) = (r26v3 boolean), (r26v3 boolean), (r26v6 boolean) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]
      0x05f0: PHI (r30v1 long) = (r30v0 long), (r30v0 long), (r30v3 long) binds: [B:216:0x0619, B:219:0x0627, B:210:0x05ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:213:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:215:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:218:0x061c  */
    /* JADX WARN: Code duplicated, block: B:221:0x062b  */
    /* JADX WARN: Code duplicated, block: B:222:0x062e  */
    /* JADX WARN: Code duplicated, block: B:225:0x0671  */
    /* JADX WARN: Code duplicated, block: B:226:0x0679  */
    /* JADX WARN: Code duplicated, block: B:231:0x068e  */
    /* JADX WARN: Code duplicated, block: B:232:0x0690  */
    /* JADX WARN: Code duplicated, block: B:236:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:239:0x0708  */
    /* JADX WARN: Code duplicated, block: B:240:0x070b  */
    /* JADX WARN: Code duplicated, block: B:243:0x0711  */
    /* JADX WARN: Code duplicated, block: B:245:0x04e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:? A[LOOP:0: B:165:0x04d3->B:247:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x05a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x059d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x01be  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x0219  */
    /* JADX WARN: Code duplicated, block: B:43:0x021c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0221  */
    /* JADX WARN: Code duplicated, block: B:48:0x0246  */
    /* JADX WARN: Code duplicated, block: B:51:0x0267  */
    /* JADX WARN: Code duplicated, block: B:53:0x026b  */
    /* JADX WARN: Code duplicated, block: B:54:0x026f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0273  */
    /* JADX WARN: Code duplicated, block: B:61:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0303  */
    /* JADX WARN: Code duplicated, block: B:84:0x0307  */
    /* JADX WARN: Code duplicated, block: B:87:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0331  */
    public final Object invokeSuspend(Object obj) throws Exception {
        long j;
        String str;
        Object objM;
        l2t l2tVar;
        int i;
        String str2;
        y5i0 y5i0Var;
        long jU;
        xkk1 xkk1Var;
        String str3;
        String str4;
        n6i0 n6i0Var;
        mmr0 mmr0Var;
        d9n d9nVar;
        long j2;
        Object objS;
        y5i0 y5i0Var2;
        String str5;
        String str6;
        mq70 mq70Var;
        up70 up70VarA;
        wzd1 wzd1Var;
        long jU2;
        mmr0 l;
        long jLongValue;
        Object objE;
        d9n d9nVar2;
        wzd1 wzd1Var2;
        String str7;
        y5i0 y5i0Var3;
        int i2;
        String str8;
        long j3;
        mmr0 mmr0Var2;
        mmr0 mmr0Var3;
        nw01 nw01Var;
        n6i0 n6i0Var2;
        d9n d9nVar3;
        u3i0 u3i0Var;
        long j4;
        boolean z;
        long j5;
        int i3;
        y5i0 y5i0Var4;
        long j6;
        long j7;
        Object mmr0Var4;
        int i4;
        y5i0 y5i0Var5;
        long j8;
        xve1 xve1VarM;
        long j9;
        Object objPrevious;
        Object obj2;
        String str9;
        mmr0 mmr0Var5;
        String str10;
        wzd1 wzd1Var3;
        int i5;
        long j10;
        long j11;
        mmr0 mmr0Var6;
        long j12;
        mmr0 mmr0Var7;
        xve1 xve1Var;
        long jLongValue2;
        long jLongValue3;
        d9n d9nVar4;
        d7u0 d7u0Var;
        nrl nrlVar;
        boolean z2;
        boolean z3;
        o6i0 o6i0Var;
        d7u0 d7u0Var2;
        o6i0 o6i0Var2;
        long j13;
        n6i0 n6i0Var3;
        boolean z4;
        q8n q8nVar;
        int iOrdinal;
        rih1 rih1Var;
        long j14;
        boolean z5;
        n6i0 n6i0Var4;
        boolean z6;
        wzd1 wzd1Var4;
        int i6;
        d9n d9nVar5;
        long j15;
        long j16;
        long j17;
        String strP;
        Object objY;
        n6i0 n6i0Var5;
        long j18;
        boolean z7;
        y5i0 y5i0Var6;
        wzd1 wzd1Var5;
        int i7;
        long j19;
        d9n d9nVar6;
        long j20;
        long j21;
        long j22;
        ArrayList arrayList;
        Iterator it;
        long j23;
        String str11;
        b58 b58Var;
        Iterator it2;
        b58 b58Var2;
        String str12;
        ArrayList arrayList2;
        Iterator it3;
        long j24;
        boolean z8;
        String strP2;
        n6i0 n6i0Var6;
        Object objA;
        d9n d9nVar7;
        boolean z9;
        n6i0 n6i0Var7;
        long j25;
        long j26;
        boolean z10;
        String str13;
        o6i0 o6i0Var3;
        wzd1 wzd1Var6;
        int i8;
        long j27;
        long j28;
        long j29;
        sm51 sm51Var;
        long j30;
        long j31;
        boolean z11;
        Object objO;
        d9n d9nVar8;
        long j32;
        o6i0 o6i0Var4;
        long j33;
        long j34;
        long j35;
        wzd1 wzd1Var7;
        String str14;
        sm51 sm51Var2;
        int i9;
        boolean z12;
        long j36;
        boolean z13;
        n6i0 n6i0Var8 = this.R0;
        u3i0 u3i0Var2 = n6i0Var8.e;
        c9n c9nVar = (c9n) this.Q0;
        byte b = this.P0;
        o6i0 o6i0Var5 = o6i0.a;
        ngv ngvVar = ngv.d;
        d9n d9nVar9 = d9n.a;
        switch (b) {
            case 0:
                j = 0;
                hm5.M(obj);
                str = u3i0Var2.a;
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str).c;
                int i10 = blc0Var == blc0.Pg ? 1 : 0;
                l2t l2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new m2a0(n6i0Var8, blc0Var, (lnm) null, (byte) 25), 3);
                this.Q0 = null;
                this.a = str;
                this.b = l2tVarQ;
                this.h = i10;
                this.P0 = (byte) 1;
                objM = n6i0Var8.m(str, this);
                if (objM == d9nVar9) {
                    return d9nVar9;
                }
                l2tVar = l2tVarQ;
                i = i10;
                str2 = str;
                y5i0Var = (y5i0) objM;
                jU = jfv.u(y5i0Var.d.a, ngvVar);
                if (jU > j) {
                    eg.m(l1d.m("Invalid total duration for entity: ", str2));
                    return null;
                }
                xkk1Var = y5i0Var.b;
                if (xkk1Var != null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) {
                    str3 = null;
                } else {
                    str3 = up70VarA.a.a;
                }
                this.Q0 = null;
                this.a = str2;
                this.b = l2tVar;
                this.c = y5i0Var;
                this.d = str3;
                this.h = i;
                this.i = jU;
                this.P0 = (byte) 2;
                str4 = str3;
                n6i0Var = n6i0Var8;
                mmr0Var = null;
                d9nVar = d9nVar9;
                j2 = jU;
                objS = smo1.s(new gkb0(y5i0Var, n6i0Var, j2, str2, (lnm) null), this);
                if (objS == d9nVar) {
                    return d9nVar;
                }
                y5i0Var2 = y5i0Var;
                str5 = str2;
                str6 = str4;
                wzd1Var = (wzd1) objS;
                d9n d9nVar10 = d9nVar;
                jU2 = jfv.u(y5i0Var2.e.b, ngvVar);
                l2t l2tVar2 = l2tVar;
                l = new Long(jfv.u(y5i0Var2.e.c, ngvVar));
                if (l.longValue() <= j) {
                    l = mmr0Var;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = j2;
                }
                this.Q0 = mmr0Var;
                this.a = str5;
                this.b = mmr0Var;
                this.c = y5i0Var2;
                this.d = str6;
                this.e = wzd1Var;
                this.h = i;
                this.i = j2;
                this.t = jU2;
                this.X = jLongValue;
                this.P0 = (byte) 3;
                objE = l2tVar2.E(this);
                d9nVar2 = d9nVar10;
                if (objE != d9nVar2) {
                    wzd1Var2 = wzd1Var;
                    str7 = str5;
                    y5i0Var3 = y5i0Var2;
                    i2 = i;
                    str8 = str6;
                    j3 = jU2;
                    mmr0 mmr0Var8 = (mmr0) objE;
                    mmr0Var2 = mmr0Var;
                    mmr0Var3 = (t3i0) mmr0Var8.a;
                    nw01Var = (nw01) mmr0Var8.b;
                    n6i0Var2 = n6i0Var;
                    d9nVar3 = d9nVar2;
                    if (u3i0Var2.b instanceof o3i0) {
                        if (mmr0Var3 instanceof r3i0) {
                            mmr0Var7 = (r3i0) mmr0Var3;
                        } else {
                            mmr0Var7 = mmr0Var2;
                        }
                        if (mmr0Var7 != null || (xve1Var = mmr0Var7.b) == null) {
                            eg.m("Edit trim must contain an end timestamp");
                            return mmr0Var2;
                        }
                        u3i0Var = u3i0Var2;
                        mmr0 mmr0Var9 = new mmr0(new Long(lm5.v(((r3i0) mmr0Var3).a)), new Long(lm5.v(xve1Var)));
                        wzd1Var3 = wzd1Var2;
                        d9nVar2 = d9nVar3;
                        long j37 = jLongValue;
                        i5 = i2;
                        str10 = str7;
                        y5i0Var5 = y5i0Var3;
                        j10 = j2;
                        j11 = j3;
                        j12 = j37;
                        mmr0Var6 = mmr0Var9;
                    } else {
                        u3i0Var = u3i0Var2;
                        if (nw01Var != null) {
                            str9 = nw01Var.a;
                            j4 = jLongValue;
                            long j38 = nw01Var.b;
                            if (str9.equals(str7) || j38 < j) {
                                mmr0Var5 = mmr0Var2;
                            } else {
                                long j39 = nw01Var.c;
                                if (j39 <= j38 || j38 >= j2) {
                                    mmr0Var5 = mmr0Var2;
                                } else {
                                    long jMin = Math.min(j39, j2);
                                    long j40 = jMin - j38;
                                    if (j3 > j40 || j40 > j4) {
                                        mmr0Var5 = mmr0Var2;
                                    } else {
                                        mmr0Var5 = new mmr0(Long.valueOf(j38), Long.valueOf(jMin));
                                    }
                                }
                            }
                            if (mmr0Var5 != null) {
                                y5i0Var5 = y5i0Var3;
                                str10 = str7;
                                wzd1Var3 = wzd1Var2;
                                d9nVar2 = d9nVar3;
                                mmr0 mmr0Var10 = mmr0Var5;
                                i5 = i2;
                                j10 = j2;
                                j11 = j3;
                                mmr0Var6 = mmr0Var10;
                                j12 = j4;
                            }
                        } else {
                            j4 = jLongValue;
                        }
                        if (i2 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.Q0 = mmr0Var2;
                        this.a = str7;
                        this.b = mmr0Var2;
                        this.c = y5i0Var3;
                        this.d = str8;
                        this.e = wzd1Var2;
                        this.h = i2;
                        this.i = j2;
                        this.t = j3;
                        j5 = j4;
                        this.X = j5;
                        this.P0 = (byte) 4;
                        i3 = i2;
                        y5i0Var4 = y5i0Var3;
                        j6 = mmr0Var3.m().a;
                        if (wzd1Var2 == null && z) {
                            int iR = zpn1.r(mmr0Var3);
                            r3i0 r3i0Var = mmr0Var3 instanceof r3i0 ? (r3i0) mmr0Var3 : null;
                            if (r3i0Var == null || (xve1VarM = r3i0Var.b) == null) {
                                xve1VarM = mmr0Var3.m();
                            }
                            j7 = j3;
                            long j41 = ((tve1) xve1VarM).a;
                            ArrayList arrayList3 = wzd1Var2.c;
                            if (arrayList3.isEmpty()) {
                                mmr0Var4 = (iR == 1 || j6 == j41) ? new mmr0(Long.valueOf(j6), Long.valueOf(j2)) : new mmr0(Long.valueOf(j6), Long.valueOf(j41));
                            } else {
                                ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        objPrevious = listIterator.previous();
                                        j9 = j41;
                                        if (((oce1) objPrevious).a > j6) {
                                            j41 = j9;
                                        }
                                    } else {
                                        j9 = j41;
                                        objPrevious = null;
                                    }
                                }
                                oce1 oce1Var = (oce1) objPrevious;
                                if (oce1Var == null) {
                                    oce1Var = (oce1) o7h.q0(arrayList3);
                                }
                                oce1 oce1Var2 = oce1Var;
                                if (iR == 1) {
                                    mmr0Var4 = new mmr0(Long.valueOf(oce1Var2.a), Long.valueOf(j2));
                                } else if (j6 == j9) {
                                    Long lValueOf = Long.valueOf(oce1Var2.a);
                                    long j42 = oce1Var2.b;
                                    long j43 = oce1Var2.a;
                                    if (j7 > j && j42 - j43 < j7) {
                                        int iIndexOf = arrayList3.indexOf(oce1Var2) + 1;
                                        while (iIndexOf < arrayList3.size() && j42 - j43 < j7) {
                                            long j44 = j43;
                                            long j45 = ((oce1) arrayList3.get(iIndexOf)).b;
                                            iIndexOf++;
                                            j42 = j45;
                                            j43 = j44;
                                        }
                                    }
                                    mmr0Var4 = new mmr0(lValueOf, Long.valueOf(j42));
                                } else {
                                    ListIterator listIterator2 = arrayList3.listIterator(arrayList3.size());
                                    while (true) {
                                        if (listIterator2.hasPrevious()) {
                                            Object objPrevious2 = listIterator2.previous();
                                            ListIterator listIterator3 = listIterator2;
                                            obj2 = objPrevious2;
                                            if (((oce1) objPrevious2).a >= j9) {
                                                listIterator2 = listIterator3;
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    oce1 oce1Var3 = (oce1) obj2;
                                    Long lValueOf2 = Long.valueOf(oce1Var2.a);
                                    if (oce1Var3 != null) {
                                        oce1Var2 = oce1Var3;
                                    }
                                    mmr0Var4 = new mmr0(lValueOf2, Long.valueOf(oce1Var2.b));
                                }
                            }
                        } else {
                            j7 = j3;
                            mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                        }
                        d9nVar2 = d9nVar3;
                        if (mmr0Var4 != d9nVar2) {
                            i4 = i3;
                            y5i0Var5 = y5i0Var4;
                            j8 = j7;
                            wzd1Var3 = wzd1Var2;
                            long j46 = j5;
                            i5 = i4;
                            str10 = str7;
                            mmr0Var6 = (mmr0) mmr0Var4;
                            j10 = j2;
                            j11 = j8;
                            j12 = j46;
                        }
                    }
                    jLongValue2 = ((Number) mmr0Var6.a).longValue();
                    jLongValue3 = ((Number) mmr0Var6.b).longValue();
                    prl prlVar = y5i0Var5.c;
                    d9nVar4 = d9nVar2;
                    d7u0Var = y5i0Var5.a;
                    nrlVar = prlVar.d;
                    if (!nrlVar.equals(jrl.a) || nrlVar.equals(mrl.a) || nrlVar.equals(krl.a)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (d7u0Var != null) {
                        arrayList2 = d7u0Var.a;
                        if (arrayList2.isEmpty()) {
                            z3 = false;
                        } else {
                            it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = false;
                                } else if (((my7) it3.next()).a instanceof c58) {
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    o6i0Var = u3i0Var.d;
                    o6i0 o6i0Var6 = o6i0.b;
                    if (z2) {
                        Set set2 = s4b1.f;
                        d7u0Var2 = d7u0Var;
                        if (uic.x(str10).c != blc0.ti) {
                            o6i0Var2 = o6i0Var5;
                        } else if (o6i0Var != null) {
                            o6i0Var2 = o6i0Var;
                        }
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = y5i0Var5;
                        this.d = str8;
                        this.e = wzd1Var3;
                        this.f = o6i0Var2;
                        this.h = i5;
                        this.i = j10;
                        this.t = j11;
                        this.X = j12;
                        j13 = j10;
                        this.Y = jLongValue2;
                        this.Z = jLongValue3;
                        this.N0 = z2;
                        this.O0 = z3;
                        this.P0 = (byte) 5;
                        n6i0Var3 = n6i0Var2;
                        z4 = z3;
                        q8nVar = n6i0Var3.i;
                        iOrdinal = o6i0Var2.ordinal();
                        rih1Var = rih1.a;
                        if (iOrdinal != 0) {
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            z6 = true;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                            strP = n6i0.p(y5i0Var5);
                            if (strP != null || (objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, strP, j16, j17, null, (byte) 0), this)) != d9nVar5) {
                                objY = rih1Var;
                            }
                        } else {
                            if (iOrdinal == 1) {
                                eg.o();
                                return null;
                            }
                            if (z4) {
                                z6 = true;
                                j14 = j12;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                            } else {
                                if (d7u0Var2 != null) {
                                    arrayList = d7u0Var2.a;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null) {
                                    arrayList = z6x.a;
                                }
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        b58Var = ((my7) it.next()).a;
                                        it2 = it;
                                        if (b58Var instanceof b58) {
                                            b58Var2 = b58Var;
                                        } else {
                                            b58Var2 = null;
                                        }
                                        if (b58Var2 != null) {
                                            str12 = b58Var2.a;
                                        } else {
                                            str12 = null;
                                        }
                                        if (str12 != null) {
                                            long j47 = j12;
                                            str11 = str12;
                                            j23 = j47;
                                        } else {
                                            it = it2;
                                        }
                                    } else {
                                        j23 = j12;
                                        str11 = null;
                                    }
                                }
                                if (str11 == null) {
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j14 = j23;
                                    z5 = z2;
                                    n6i0Var4 = n6i0Var3;
                                    objY = rih1Var;
                                    j17 = jLongValue3;
                                    z6 = true;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    wzd1Var4 = wzd1Var3;
                                } else {
                                    j14 = j23;
                                    n6i0Var4 = n6i0Var3;
                                    z5 = z2;
                                    z6 = true;
                                    wzd1Var4 = wzd1Var3;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j17 = jLongValue3;
                                    objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                    if (objY != d9nVar5) {
                                        objY = rih1Var;
                                    }
                                }
                            }
                        }
                        if (objY == d9nVar5) {
                            return d9nVar5;
                        }
                        n6i0Var5 = n6i0Var4;
                        j18 = j16;
                        z7 = z4;
                        y5i0Var6 = y5i0Var5;
                        wzd1Var5 = wzd1Var4;
                        i7 = i6;
                        j19 = j14;
                        d9nVar6 = d9nVar5;
                        j20 = j15;
                        j21 = j17;
                        j22 = j13;
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var5;
                        this.f = o6i0Var2;
                        this.h = i7;
                        this.i = j22;
                        this.t = j20;
                        this.X = j19;
                        this.Y = j18;
                        j24 = j18;
                        this.Z = j21;
                        z8 = z5;
                        this.N0 = z8;
                        this.O0 = z7;
                        this.P0 = (byte) 6;
                        if (o6i0Var2 == o6i0Var5 || (strP2 = n6i0.p(y5i0Var6)) == null) {
                            n6i0Var6 = n6i0Var5;
                            objA = null;
                        } else {
                            n6i0Var6 = n6i0Var5;
                            objA = n6i0Var6.t.a(strP2, this);
                        }
                        if (objA == d9nVar6) {
                            return d9nVar6;
                        }
                        obj = objA;
                        d9nVar7 = d9nVar6;
                        z9 = z8;
                        n6i0Var7 = n6i0Var6;
                        j25 = j22;
                        j26 = j21;
                        z10 = z7;
                        str13 = str10;
                        o6i0Var3 = o6i0Var2;
                        wzd1Var6 = wzd1Var5;
                        i8 = i7;
                        j27 = j20;
                        j28 = j19;
                        j29 = j24;
                        sm51Var = (sm51) obj;
                        j30 = j26;
                        this.Q0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var6;
                        this.f = o6i0Var3;
                        this.g = sm51Var;
                        this.h = i8;
                        this.i = j25;
                        this.t = j27;
                        this.X = j28;
                        this.Y = j29;
                        this.Z = j30;
                        j31 = j25;
                        this.N0 = z9;
                        z11 = z10;
                        this.O0 = z11;
                        this.P0 = (byte) 7;
                        objO = n6i0Var7.o(str13, this);
                        d9nVar8 = d9nVar7;
                        if (objO == d9nVar8) {
                            return d9nVar8;
                        }
                        j32 = j27;
                        o6i0Var4 = o6i0Var3;
                        j33 = j30;
                        j34 = j29;
                        j35 = j28;
                        wzd1Var7 = wzd1Var6;
                        str14 = str8;
                        sm51Var2 = sm51Var;
                        i9 = i8;
                        z12 = z11;
                        j36 = j31;
                        zge1 zge1Var = (zge1) objO;
                        if (i9 != 0) {
                            z13 = z6;
                        } else {
                            z13 = false;
                        }
                        return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var, o6i0Var4, z12, str14, z13, j32, j35);
                    }
                    d7u0Var2 = d7u0Var;
                    o6i0Var2 = o6i0Var6;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = y5i0Var5;
                    this.d = str8;
                    this.e = wzd1Var3;
                    this.f = o6i0Var2;
                    this.h = i5;
                    this.i = j10;
                    this.t = j11;
                    this.X = j12;
                    j13 = j10;
                    this.Y = jLongValue2;
                    this.Z = jLongValue3;
                    this.N0 = z2;
                    this.O0 = z3;
                    this.P0 = (byte) 5;
                    n6i0Var3 = n6i0Var2;
                    z4 = z3;
                    q8nVar = n6i0Var3.i;
                    iOrdinal = o6i0Var2.ordinal();
                    rih1Var = rih1.a;
                    if (iOrdinal != 0) {
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        z6 = true;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                        strP = n6i0.p(y5i0Var5);
                        if (strP != null) {
                            objY = rih1Var;
                        } else {
                            objY = rih1Var;
                        }
                    } else {
                        if (iOrdinal == 1) {
                            eg.o();
                            return null;
                        }
                        if (z4) {
                            z6 = true;
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                        } else {
                            if (d7u0Var2 != null) {
                                arrayList = d7u0Var2.a;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = z6x.a;
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    b58Var = ((my7) it.next()).a;
                                    it2 = it;
                                    if (b58Var instanceof b58) {
                                        b58Var2 = b58Var;
                                    } else {
                                        b58Var2 = null;
                                    }
                                    if (b58Var2 != null) {
                                        str12 = b58Var2.a;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        long j48 = j12;
                                        str11 = str12;
                                        j23 = j48;
                                    } else {
                                        it = it2;
                                    }
                                } else {
                                    j23 = j12;
                                    str11 = null;
                                }
                            }
                            if (str11 == null) {
                                j15 = j11;
                                j16 = jLongValue2;
                                j14 = j23;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                j17 = jLongValue3;
                                z6 = true;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                wzd1Var4 = wzd1Var3;
                            } else {
                                j14 = j23;
                                n6i0Var4 = n6i0Var3;
                                z5 = z2;
                                z6 = true;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                                objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                if (objY != d9nVar5) {
                                    objY = rih1Var;
                                }
                            }
                        }
                    }
                    if (objY == d9nVar5) {
                        return d9nVar5;
                    }
                    n6i0Var5 = n6i0Var4;
                    j18 = j16;
                    z7 = z4;
                    y5i0Var6 = y5i0Var5;
                    wzd1Var5 = wzd1Var4;
                    i7 = i6;
                    j19 = j14;
                    d9nVar6 = d9nVar5;
                    j20 = j15;
                    j21 = j17;
                    j22 = j13;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var5;
                    this.f = o6i0Var2;
                    this.h = i7;
                    this.i = j22;
                    this.t = j20;
                    this.X = j19;
                    this.Y = j18;
                    j24 = j18;
                    this.Z = j21;
                    z8 = z5;
                    this.N0 = z8;
                    this.O0 = z7;
                    this.P0 = (byte) 6;
                    if (o6i0Var2 == o6i0Var5) {
                        n6i0Var6 = n6i0Var5;
                        objA = null;
                    } else {
                        n6i0Var6 = n6i0Var5;
                        objA = n6i0Var6.t.a(strP2, this);
                    }
                    if (objA == d9nVar6) {
                        return d9nVar6;
                    }
                    obj = objA;
                    d9nVar7 = d9nVar6;
                    z9 = z8;
                    n6i0Var7 = n6i0Var6;
                    j25 = j22;
                    j26 = j21;
                    z10 = z7;
                    str13 = str10;
                    o6i0Var3 = o6i0Var2;
                    wzd1Var6 = wzd1Var5;
                    i8 = i7;
                    j27 = j20;
                    j28 = j19;
                    j29 = j24;
                    sm51Var = (sm51) obj;
                    j30 = j26;
                    this.Q0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var6;
                    this.f = o6i0Var3;
                    this.g = sm51Var;
                    this.h = i8;
                    this.i = j25;
                    this.t = j27;
                    this.X = j28;
                    this.Y = j29;
                    this.Z = j30;
                    j31 = j25;
                    this.N0 = z9;
                    z11 = z10;
                    this.O0 = z11;
                    this.P0 = (byte) 7;
                    objO = n6i0Var7.o(str13, this);
                    d9nVar8 = d9nVar7;
                    if (objO == d9nVar8) {
                        return d9nVar8;
                    }
                    j32 = j27;
                    o6i0Var4 = o6i0Var3;
                    j33 = j30;
                    j34 = j29;
                    j35 = j28;
                    wzd1Var7 = wzd1Var6;
                    str14 = str8;
                    sm51Var2 = sm51Var;
                    i9 = i8;
                    z12 = z11;
                    j36 = j31;
                    zge1 zge1Var2 = (zge1) objO;
                    if (i9 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var2, o6i0Var4, z12, str14, z13, j32, j35);
                }
                return d9nVar2;
            case 1:
                j = 0;
                int i11 = this.h;
                l2t l2tVar3 = this.b;
                str = this.a;
                hm5.M(obj);
                i = i11;
                l2tVar = l2tVar3;
                objM = obj;
                str2 = str;
                y5i0Var = (y5i0) objM;
                jU = jfv.u(y5i0Var.d.a, ngvVar);
                if (jU > j) {
                    eg.m(l1d.m("Invalid total duration for entity: ", str2));
                    return null;
                }
                xkk1Var = y5i0Var.b;
                if (xkk1Var != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                this.Q0 = null;
                this.a = str2;
                this.b = l2tVar;
                this.c = y5i0Var;
                this.d = str3;
                this.h = i;
                this.i = jU;
                this.P0 = (byte) 2;
                str4 = str3;
                n6i0Var = n6i0Var8;
                mmr0Var = null;
                d9nVar = d9nVar9;
                j2 = jU;
                objS = smo1.s(new gkb0(y5i0Var, n6i0Var, j2, str2, (lnm) null), this);
                if (objS == d9nVar) {
                    return d9nVar;
                }
                y5i0Var2 = y5i0Var;
                str5 = str2;
                str6 = str4;
                wzd1Var = (wzd1) objS;
                d9n d9nVar11 = d9nVar;
                jU2 = jfv.u(y5i0Var2.e.b, ngvVar);
                l2t l2tVar4 = l2tVar;
                l = new Long(jfv.u(y5i0Var2.e.c, ngvVar));
                if (l.longValue() <= j) {
                    l = mmr0Var;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = j2;
                }
                this.Q0 = mmr0Var;
                this.a = str5;
                this.b = mmr0Var;
                this.c = y5i0Var2;
                this.d = str6;
                this.e = wzd1Var;
                this.h = i;
                this.i = j2;
                this.t = jU2;
                this.X = jLongValue;
                this.P0 = (byte) 3;
                objE = l2tVar4.E(this);
                d9nVar2 = d9nVar11;
                if (objE != d9nVar2) {
                    wzd1Var2 = wzd1Var;
                    str7 = str5;
                    y5i0Var3 = y5i0Var2;
                    i2 = i;
                    str8 = str6;
                    j3 = jU2;
                    mmr0 mmr0Var11 = (mmr0) objE;
                    mmr0Var2 = mmr0Var;
                    mmr0Var3 = (t3i0) mmr0Var11.a;
                    nw01Var = (nw01) mmr0Var11.b;
                    n6i0Var2 = n6i0Var;
                    d9nVar3 = d9nVar2;
                    if (u3i0Var2.b instanceof o3i0) {
                        if (mmr0Var3 instanceof r3i0) {
                            mmr0Var7 = (r3i0) mmr0Var3;
                        } else {
                            mmr0Var7 = mmr0Var2;
                        }
                        if (mmr0Var7 != null) {
                            break;
                        }
                        eg.m("Edit trim must contain an end timestamp");
                        return mmr0Var2;
                    }
                    u3i0Var = u3i0Var2;
                    if (nw01Var != null) {
                        str9 = nw01Var.a;
                        j4 = jLongValue;
                        long j310 = nw01Var.b;
                        if (str9.equals(str7)) {
                            mmr0Var5 = mmr0Var2;
                        } else {
                            mmr0Var5 = mmr0Var2;
                        }
                        if (mmr0Var5 != null) {
                            y5i0Var5 = y5i0Var3;
                            str10 = str7;
                            wzd1Var3 = wzd1Var2;
                            d9nVar2 = d9nVar3;
                            mmr0 mmr0Var12 = mmr0Var5;
                            i5 = i2;
                            j10 = j2;
                            j11 = j3;
                            mmr0Var6 = mmr0Var12;
                            j12 = j4;
                        }
                    } else {
                        j4 = jLongValue;
                    }
                    if (i2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.Q0 = mmr0Var2;
                    this.a = str7;
                    this.b = mmr0Var2;
                    this.c = y5i0Var3;
                    this.d = str8;
                    this.e = wzd1Var2;
                    this.h = i2;
                    this.i = j2;
                    this.t = j3;
                    j5 = j4;
                    this.X = j5;
                    this.P0 = (byte) 4;
                    i3 = i2;
                    y5i0Var4 = y5i0Var3;
                    j6 = mmr0Var3.m().a;
                    if (wzd1Var2 == null) {
                        j7 = j3;
                        mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                    } else {
                        j7 = j3;
                        mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                    }
                    d9nVar2 = d9nVar3;
                    if (mmr0Var4 != d9nVar2) {
                        i4 = i3;
                        y5i0Var5 = y5i0Var4;
                        j8 = j7;
                        wzd1Var3 = wzd1Var2;
                        long j49 = j5;
                        i5 = i4;
                        str10 = str7;
                        mmr0Var6 = (mmr0) mmr0Var4;
                        j10 = j2;
                        j11 = j8;
                        j12 = j49;
                    }
                    jLongValue2 = ((Number) mmr0Var6.a).longValue();
                    jLongValue3 = ((Number) mmr0Var6.b).longValue();
                    prl prlVar2 = y5i0Var5.c;
                    d9nVar4 = d9nVar2;
                    d7u0Var = y5i0Var5.a;
                    nrlVar = prlVar2.d;
                    if (nrlVar.equals(jrl.a)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (d7u0Var != null) {
                        arrayList2 = d7u0Var.a;
                        if (arrayList2.isEmpty()) {
                            z3 = false;
                        } else {
                            it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = false;
                                } else if (((my7) it3.next()).a instanceof c58) {
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    o6i0Var = u3i0Var.d;
                    o6i0 o6i0Var7 = o6i0.b;
                    if (z2) {
                        Set set3 = s4b1.f;
                        d7u0Var2 = d7u0Var;
                        if (uic.x(str10).c != blc0.ti) {
                            o6i0Var2 = o6i0Var5;
                        } else if (o6i0Var != null) {
                            o6i0Var2 = o6i0Var;
                        }
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = y5i0Var5;
                        this.d = str8;
                        this.e = wzd1Var3;
                        this.f = o6i0Var2;
                        this.h = i5;
                        this.i = j10;
                        this.t = j11;
                        this.X = j12;
                        j13 = j10;
                        this.Y = jLongValue2;
                        this.Z = jLongValue3;
                        this.N0 = z2;
                        this.O0 = z3;
                        this.P0 = (byte) 5;
                        n6i0Var3 = n6i0Var2;
                        z4 = z3;
                        q8nVar = n6i0Var3.i;
                        iOrdinal = o6i0Var2.ordinal();
                        rih1Var = rih1.a;
                        if (iOrdinal != 0) {
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            z6 = true;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                            strP = n6i0.p(y5i0Var5);
                            if (strP != null) {
                                objY = rih1Var;
                            } else {
                                objY = rih1Var;
                            }
                        } else {
                            if (iOrdinal == 1) {
                                eg.o();
                                return null;
                            }
                            if (z4) {
                                z6 = true;
                                j14 = j12;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                            } else {
                                if (d7u0Var2 != null) {
                                    arrayList = d7u0Var2.a;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null) {
                                    arrayList = z6x.a;
                                }
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        b58Var = ((my7) it.next()).a;
                                        it2 = it;
                                        if (b58Var instanceof b58) {
                                            b58Var2 = b58Var;
                                        } else {
                                            b58Var2 = null;
                                        }
                                        if (b58Var2 != null) {
                                            str12 = b58Var2.a;
                                        } else {
                                            str12 = null;
                                        }
                                        if (str12 != null) {
                                            long j410 = j12;
                                            str11 = str12;
                                            j23 = j410;
                                        } else {
                                            it = it2;
                                        }
                                    } else {
                                        j23 = j12;
                                        str11 = null;
                                    }
                                }
                                if (str11 == null) {
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j14 = j23;
                                    z5 = z2;
                                    n6i0Var4 = n6i0Var3;
                                    objY = rih1Var;
                                    j17 = jLongValue3;
                                    z6 = true;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    wzd1Var4 = wzd1Var3;
                                } else {
                                    j14 = j23;
                                    n6i0Var4 = n6i0Var3;
                                    z5 = z2;
                                    z6 = true;
                                    wzd1Var4 = wzd1Var3;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j17 = jLongValue3;
                                    objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                    if (objY != d9nVar5) {
                                        objY = rih1Var;
                                    }
                                }
                            }
                        }
                        if (objY == d9nVar5) {
                            return d9nVar5;
                        }
                        n6i0Var5 = n6i0Var4;
                        j18 = j16;
                        z7 = z4;
                        y5i0Var6 = y5i0Var5;
                        wzd1Var5 = wzd1Var4;
                        i7 = i6;
                        j19 = j14;
                        d9nVar6 = d9nVar5;
                        j20 = j15;
                        j21 = j17;
                        j22 = j13;
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var5;
                        this.f = o6i0Var2;
                        this.h = i7;
                        this.i = j22;
                        this.t = j20;
                        this.X = j19;
                        this.Y = j18;
                        j24 = j18;
                        this.Z = j21;
                        z8 = z5;
                        this.N0 = z8;
                        this.O0 = z7;
                        this.P0 = (byte) 6;
                        if (o6i0Var2 == o6i0Var5) {
                            n6i0Var6 = n6i0Var5;
                            objA = null;
                        } else {
                            n6i0Var6 = n6i0Var5;
                            objA = n6i0Var6.t.a(strP2, this);
                        }
                        if (objA == d9nVar6) {
                            return d9nVar6;
                        }
                        obj = objA;
                        d9nVar7 = d9nVar6;
                        z9 = z8;
                        n6i0Var7 = n6i0Var6;
                        j25 = j22;
                        j26 = j21;
                        z10 = z7;
                        str13 = str10;
                        o6i0Var3 = o6i0Var2;
                        wzd1Var6 = wzd1Var5;
                        i8 = i7;
                        j27 = j20;
                        j28 = j19;
                        j29 = j24;
                        sm51Var = (sm51) obj;
                        j30 = j26;
                        this.Q0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var6;
                        this.f = o6i0Var3;
                        this.g = sm51Var;
                        this.h = i8;
                        this.i = j25;
                        this.t = j27;
                        this.X = j28;
                        this.Y = j29;
                        this.Z = j30;
                        j31 = j25;
                        this.N0 = z9;
                        z11 = z10;
                        this.O0 = z11;
                        this.P0 = (byte) 7;
                        objO = n6i0Var7.o(str13, this);
                        d9nVar8 = d9nVar7;
                        if (objO == d9nVar8) {
                            return d9nVar8;
                        }
                        j32 = j27;
                        o6i0Var4 = o6i0Var3;
                        j33 = j30;
                        j34 = j29;
                        j35 = j28;
                        wzd1Var7 = wzd1Var6;
                        str14 = str8;
                        sm51Var2 = sm51Var;
                        i9 = i8;
                        z12 = z11;
                        j36 = j31;
                        zge1 zge1Var3 = (zge1) objO;
                        if (i9 != 0) {
                            z13 = z6;
                        } else {
                            z13 = false;
                        }
                        return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var3, o6i0Var4, z12, str14, z13, j32, j35);
                    }
                    d7u0Var2 = d7u0Var;
                    o6i0Var2 = o6i0Var7;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = y5i0Var5;
                    this.d = str8;
                    this.e = wzd1Var3;
                    this.f = o6i0Var2;
                    this.h = i5;
                    this.i = j10;
                    this.t = j11;
                    this.X = j12;
                    j13 = j10;
                    this.Y = jLongValue2;
                    this.Z = jLongValue3;
                    this.N0 = z2;
                    this.O0 = z3;
                    this.P0 = (byte) 5;
                    n6i0Var3 = n6i0Var2;
                    z4 = z3;
                    q8nVar = n6i0Var3.i;
                    iOrdinal = o6i0Var2.ordinal();
                    rih1Var = rih1.a;
                    if (iOrdinal != 0) {
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        z6 = true;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                        strP = n6i0.p(y5i0Var5);
                        if (strP != null) {
                            objY = rih1Var;
                        } else {
                            objY = rih1Var;
                        }
                    } else {
                        if (iOrdinal == 1) {
                            eg.o();
                            return null;
                        }
                        if (z4) {
                            z6 = true;
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                        } else {
                            if (d7u0Var2 != null) {
                                arrayList = d7u0Var2.a;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = z6x.a;
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    b58Var = ((my7) it.next()).a;
                                    it2 = it;
                                    if (b58Var instanceof b58) {
                                        b58Var2 = b58Var;
                                    } else {
                                        b58Var2 = null;
                                    }
                                    if (b58Var2 != null) {
                                        str12 = b58Var2.a;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        long j411 = j12;
                                        str11 = str12;
                                        j23 = j411;
                                    } else {
                                        it = it2;
                                    }
                                } else {
                                    j23 = j12;
                                    str11 = null;
                                }
                            }
                            if (str11 == null) {
                                j15 = j11;
                                j16 = jLongValue2;
                                j14 = j23;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                j17 = jLongValue3;
                                z6 = true;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                wzd1Var4 = wzd1Var3;
                            } else {
                                j14 = j23;
                                n6i0Var4 = n6i0Var3;
                                z5 = z2;
                                z6 = true;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                                objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                if (objY != d9nVar5) {
                                    objY = rih1Var;
                                }
                            }
                        }
                    }
                    if (objY == d9nVar5) {
                        return d9nVar5;
                    }
                    n6i0Var5 = n6i0Var4;
                    j18 = j16;
                    z7 = z4;
                    y5i0Var6 = y5i0Var5;
                    wzd1Var5 = wzd1Var4;
                    i7 = i6;
                    j19 = j14;
                    d9nVar6 = d9nVar5;
                    j20 = j15;
                    j21 = j17;
                    j22 = j13;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var5;
                    this.f = o6i0Var2;
                    this.h = i7;
                    this.i = j22;
                    this.t = j20;
                    this.X = j19;
                    this.Y = j18;
                    j24 = j18;
                    this.Z = j21;
                    z8 = z5;
                    this.N0 = z8;
                    this.O0 = z7;
                    this.P0 = (byte) 6;
                    if (o6i0Var2 == o6i0Var5) {
                        n6i0Var6 = n6i0Var5;
                        objA = null;
                    } else {
                        n6i0Var6 = n6i0Var5;
                        objA = n6i0Var6.t.a(strP2, this);
                    }
                    if (objA == d9nVar6) {
                        return d9nVar6;
                    }
                    obj = objA;
                    d9nVar7 = d9nVar6;
                    z9 = z8;
                    n6i0Var7 = n6i0Var6;
                    j25 = j22;
                    j26 = j21;
                    z10 = z7;
                    str13 = str10;
                    o6i0Var3 = o6i0Var2;
                    wzd1Var6 = wzd1Var5;
                    i8 = i7;
                    j27 = j20;
                    j28 = j19;
                    j29 = j24;
                    sm51Var = (sm51) obj;
                    j30 = j26;
                    this.Q0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var6;
                    this.f = o6i0Var3;
                    this.g = sm51Var;
                    this.h = i8;
                    this.i = j25;
                    this.t = j27;
                    this.X = j28;
                    this.Y = j29;
                    this.Z = j30;
                    j31 = j25;
                    this.N0 = z9;
                    z11 = z10;
                    this.O0 = z11;
                    this.P0 = (byte) 7;
                    objO = n6i0Var7.o(str13, this);
                    d9nVar8 = d9nVar7;
                    if (objO == d9nVar8) {
                        return d9nVar8;
                    }
                    j32 = j27;
                    o6i0Var4 = o6i0Var3;
                    j33 = j30;
                    j34 = j29;
                    j35 = j28;
                    wzd1Var7 = wzd1Var6;
                    str14 = str8;
                    sm51Var2 = sm51Var;
                    i9 = i8;
                    z12 = z11;
                    j36 = j31;
                    zge1 zge1Var4 = (zge1) objO;
                    if (i9 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var4, o6i0Var4, z12, str14, z13, j32, j35);
                }
                return d9nVar2;
            case 2:
                j = 0;
                long j50 = this.i;
                int i12 = this.h;
                str6 = this.d;
                y5i0Var2 = this.c;
                l2t l2tVar5 = this.b;
                String str15 = this.a;
                hm5.M(obj);
                d9nVar = d9nVar9;
                l2tVar = l2tVar5;
                mmr0Var = null;
                j2 = j50;
                n6i0Var = n6i0Var8;
                str5 = str15;
                i = i12;
                objS = obj;
                wzd1Var = (wzd1) objS;
                d9n d9nVar12 = d9nVar;
                jU2 = jfv.u(y5i0Var2.e.b, ngvVar);
                l2t l2tVar6 = l2tVar;
                l = new Long(jfv.u(y5i0Var2.e.c, ngvVar));
                if (l.longValue() <= j) {
                    l = mmr0Var;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = j2;
                }
                this.Q0 = mmr0Var;
                this.a = str5;
                this.b = mmr0Var;
                this.c = y5i0Var2;
                this.d = str6;
                this.e = wzd1Var;
                this.h = i;
                this.i = j2;
                this.t = jU2;
                this.X = jLongValue;
                this.P0 = (byte) 3;
                objE = l2tVar6.E(this);
                d9nVar2 = d9nVar12;
                if (objE != d9nVar2) {
                    wzd1Var2 = wzd1Var;
                    str7 = str5;
                    y5i0Var3 = y5i0Var2;
                    i2 = i;
                    str8 = str6;
                    j3 = jU2;
                    mmr0 mmr0Var13 = (mmr0) objE;
                    mmr0Var2 = mmr0Var;
                    mmr0Var3 = (t3i0) mmr0Var13.a;
                    nw01Var = (nw01) mmr0Var13.b;
                    n6i0Var2 = n6i0Var;
                    d9nVar3 = d9nVar2;
                    if (u3i0Var2.b instanceof o3i0) {
                        if (mmr0Var3 instanceof r3i0) {
                            mmr0Var7 = (r3i0) mmr0Var3;
                        } else {
                            mmr0Var7 = mmr0Var2;
                        }
                        if (mmr0Var7 != null) {
                            break;
                        }
                        eg.m("Edit trim must contain an end timestamp");
                        return mmr0Var2;
                    }
                    u3i0Var = u3i0Var2;
                    if (nw01Var != null) {
                        str9 = nw01Var.a;
                        j4 = jLongValue;
                        long j311 = nw01Var.b;
                        if (str9.equals(str7)) {
                            mmr0Var5 = mmr0Var2;
                        } else {
                            mmr0Var5 = mmr0Var2;
                        }
                        if (mmr0Var5 != null) {
                            y5i0Var5 = y5i0Var3;
                            str10 = str7;
                            wzd1Var3 = wzd1Var2;
                            d9nVar2 = d9nVar3;
                            mmr0 mmr0Var14 = mmr0Var5;
                            i5 = i2;
                            j10 = j2;
                            j11 = j3;
                            mmr0Var6 = mmr0Var14;
                            j12 = j4;
                        }
                    } else {
                        j4 = jLongValue;
                    }
                    if (i2 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.Q0 = mmr0Var2;
                    this.a = str7;
                    this.b = mmr0Var2;
                    this.c = y5i0Var3;
                    this.d = str8;
                    this.e = wzd1Var2;
                    this.h = i2;
                    this.i = j2;
                    this.t = j3;
                    j5 = j4;
                    this.X = j5;
                    this.P0 = (byte) 4;
                    i3 = i2;
                    y5i0Var4 = y5i0Var3;
                    j6 = mmr0Var3.m().a;
                    if (wzd1Var2 == null) {
                        j7 = j3;
                        mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                    } else {
                        j7 = j3;
                        mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                    }
                    d9nVar2 = d9nVar3;
                    if (mmr0Var4 != d9nVar2) {
                        i4 = i3;
                        y5i0Var5 = y5i0Var4;
                        j8 = j7;
                        wzd1Var3 = wzd1Var2;
                        long j412 = j5;
                        i5 = i4;
                        str10 = str7;
                        mmr0Var6 = (mmr0) mmr0Var4;
                        j10 = j2;
                        j11 = j8;
                        j12 = j412;
                    }
                    jLongValue2 = ((Number) mmr0Var6.a).longValue();
                    jLongValue3 = ((Number) mmr0Var6.b).longValue();
                    prl prlVar3 = y5i0Var5.c;
                    d9nVar4 = d9nVar2;
                    d7u0Var = y5i0Var5.a;
                    nrlVar = prlVar3.d;
                    if (nrlVar.equals(jrl.a)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (d7u0Var != null) {
                        arrayList2 = d7u0Var.a;
                        if (arrayList2.isEmpty()) {
                            z3 = false;
                        } else {
                            it3 = arrayList2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z3 = false;
                                } else if (((my7) it3.next()).a instanceof c58) {
                                    z3 = true;
                                }
                            }
                        }
                    } else {
                        z3 = false;
                    }
                    o6i0Var = u3i0Var.d;
                    o6i0 o6i0Var8 = o6i0.b;
                    if (z2) {
                        Set set4 = s4b1.f;
                        d7u0Var2 = d7u0Var;
                        if (uic.x(str10).c != blc0.ti) {
                            o6i0Var2 = o6i0Var5;
                        } else if (o6i0Var != null) {
                            o6i0Var2 = o6i0Var;
                        }
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = y5i0Var5;
                        this.d = str8;
                        this.e = wzd1Var3;
                        this.f = o6i0Var2;
                        this.h = i5;
                        this.i = j10;
                        this.t = j11;
                        this.X = j12;
                        j13 = j10;
                        this.Y = jLongValue2;
                        this.Z = jLongValue3;
                        this.N0 = z2;
                        this.O0 = z3;
                        this.P0 = (byte) 5;
                        n6i0Var3 = n6i0Var2;
                        z4 = z3;
                        q8nVar = n6i0Var3.i;
                        iOrdinal = o6i0Var2.ordinal();
                        rih1Var = rih1.a;
                        if (iOrdinal != 0) {
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            z6 = true;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                            strP = n6i0.p(y5i0Var5);
                            if (strP != null) {
                                objY = rih1Var;
                            } else {
                                objY = rih1Var;
                            }
                        } else {
                            if (iOrdinal == 1) {
                                eg.o();
                                return null;
                            }
                            if (z4) {
                                z6 = true;
                                j14 = j12;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                            } else {
                                if (d7u0Var2 != null) {
                                    arrayList = d7u0Var2.a;
                                } else {
                                    arrayList = null;
                                }
                                if (arrayList == null) {
                                    arrayList = z6x.a;
                                }
                                it = arrayList.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        b58Var = ((my7) it.next()).a;
                                        it2 = it;
                                        if (b58Var instanceof b58) {
                                            b58Var2 = b58Var;
                                        } else {
                                            b58Var2 = null;
                                        }
                                        if (b58Var2 != null) {
                                            str12 = b58Var2.a;
                                        } else {
                                            str12 = null;
                                        }
                                        if (str12 != null) {
                                            long j413 = j12;
                                            str11 = str12;
                                            j23 = j413;
                                        } else {
                                            it = it2;
                                        }
                                    } else {
                                        j23 = j12;
                                        str11 = null;
                                    }
                                }
                                if (str11 == null) {
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j14 = j23;
                                    z5 = z2;
                                    n6i0Var4 = n6i0Var3;
                                    objY = rih1Var;
                                    j17 = jLongValue3;
                                    z6 = true;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    wzd1Var4 = wzd1Var3;
                                } else {
                                    j14 = j23;
                                    n6i0Var4 = n6i0Var3;
                                    z5 = z2;
                                    z6 = true;
                                    wzd1Var4 = wzd1Var3;
                                    i6 = i5;
                                    d9nVar5 = d9nVar4;
                                    j15 = j11;
                                    j16 = jLongValue2;
                                    j17 = jLongValue3;
                                    objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                    if (objY != d9nVar5) {
                                        objY = rih1Var;
                                    }
                                }
                            }
                        }
                        if (objY == d9nVar5) {
                            return d9nVar5;
                        }
                        n6i0Var5 = n6i0Var4;
                        j18 = j16;
                        z7 = z4;
                        y5i0Var6 = y5i0Var5;
                        wzd1Var5 = wzd1Var4;
                        i7 = i6;
                        j19 = j14;
                        d9nVar6 = d9nVar5;
                        j20 = j15;
                        j21 = j17;
                        j22 = j13;
                        this.Q0 = null;
                        this.a = str10;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var5;
                        this.f = o6i0Var2;
                        this.h = i7;
                        this.i = j22;
                        this.t = j20;
                        this.X = j19;
                        this.Y = j18;
                        j24 = j18;
                        this.Z = j21;
                        z8 = z5;
                        this.N0 = z8;
                        this.O0 = z7;
                        this.P0 = (byte) 6;
                        if (o6i0Var2 == o6i0Var5) {
                            n6i0Var6 = n6i0Var5;
                            objA = null;
                        } else {
                            n6i0Var6 = n6i0Var5;
                            objA = n6i0Var6.t.a(strP2, this);
                        }
                        if (objA == d9nVar6) {
                            return d9nVar6;
                        }
                        obj = objA;
                        d9nVar7 = d9nVar6;
                        z9 = z8;
                        n6i0Var7 = n6i0Var6;
                        j25 = j22;
                        j26 = j21;
                        z10 = z7;
                        str13 = str10;
                        o6i0Var3 = o6i0Var2;
                        wzd1Var6 = wzd1Var5;
                        i8 = i7;
                        j27 = j20;
                        j28 = j19;
                        j29 = j24;
                        sm51Var = (sm51) obj;
                        j30 = j26;
                        this.Q0 = null;
                        this.a = null;
                        this.b = null;
                        this.c = null;
                        this.d = str8;
                        this.e = wzd1Var6;
                        this.f = o6i0Var3;
                        this.g = sm51Var;
                        this.h = i8;
                        this.i = j25;
                        this.t = j27;
                        this.X = j28;
                        this.Y = j29;
                        this.Z = j30;
                        j31 = j25;
                        this.N0 = z9;
                        z11 = z10;
                        this.O0 = z11;
                        this.P0 = (byte) 7;
                        objO = n6i0Var7.o(str13, this);
                        d9nVar8 = d9nVar7;
                        if (objO == d9nVar8) {
                            return d9nVar8;
                        }
                        j32 = j27;
                        o6i0Var4 = o6i0Var3;
                        j33 = j30;
                        j34 = j29;
                        j35 = j28;
                        wzd1Var7 = wzd1Var6;
                        str14 = str8;
                        sm51Var2 = sm51Var;
                        i9 = i8;
                        z12 = z11;
                        j36 = j31;
                        zge1 zge1Var5 = (zge1) objO;
                        if (i9 != 0) {
                            z13 = z6;
                        } else {
                            z13 = false;
                        }
                        return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var5, o6i0Var4, z12, str14, z13, j32, j35);
                    }
                    d7u0Var2 = d7u0Var;
                    o6i0Var2 = o6i0Var8;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = y5i0Var5;
                    this.d = str8;
                    this.e = wzd1Var3;
                    this.f = o6i0Var2;
                    this.h = i5;
                    this.i = j10;
                    this.t = j11;
                    this.X = j12;
                    j13 = j10;
                    this.Y = jLongValue2;
                    this.Z = jLongValue3;
                    this.N0 = z2;
                    this.O0 = z3;
                    this.P0 = (byte) 5;
                    n6i0Var3 = n6i0Var2;
                    z4 = z3;
                    q8nVar = n6i0Var3.i;
                    iOrdinal = o6i0Var2.ordinal();
                    rih1Var = rih1.a;
                    if (iOrdinal != 0) {
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        z6 = true;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                        strP = n6i0.p(y5i0Var5);
                        if (strP != null) {
                            objY = rih1Var;
                        } else {
                            objY = rih1Var;
                        }
                    } else {
                        if (iOrdinal == 1) {
                            eg.o();
                            return null;
                        }
                        if (z4) {
                            z6 = true;
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                        } else {
                            if (d7u0Var2 != null) {
                                arrayList = d7u0Var2.a;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = z6x.a;
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    b58Var = ((my7) it.next()).a;
                                    it2 = it;
                                    if (b58Var instanceof b58) {
                                        b58Var2 = b58Var;
                                    } else {
                                        b58Var2 = null;
                                    }
                                    if (b58Var2 != null) {
                                        str12 = b58Var2.a;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        long j414 = j12;
                                        str11 = str12;
                                        j23 = j414;
                                    } else {
                                        it = it2;
                                    }
                                } else {
                                    j23 = j12;
                                    str11 = null;
                                }
                            }
                            if (str11 == null) {
                                j15 = j11;
                                j16 = jLongValue2;
                                j14 = j23;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                j17 = jLongValue3;
                                z6 = true;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                wzd1Var4 = wzd1Var3;
                            } else {
                                j14 = j23;
                                n6i0Var4 = n6i0Var3;
                                z5 = z2;
                                z6 = true;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                                objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                if (objY != d9nVar5) {
                                    objY = rih1Var;
                                }
                            }
                        }
                    }
                    if (objY == d9nVar5) {
                        return d9nVar5;
                    }
                    n6i0Var5 = n6i0Var4;
                    j18 = j16;
                    z7 = z4;
                    y5i0Var6 = y5i0Var5;
                    wzd1Var5 = wzd1Var4;
                    i7 = i6;
                    j19 = j14;
                    d9nVar6 = d9nVar5;
                    j20 = j15;
                    j21 = j17;
                    j22 = j13;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var5;
                    this.f = o6i0Var2;
                    this.h = i7;
                    this.i = j22;
                    this.t = j20;
                    this.X = j19;
                    this.Y = j18;
                    j24 = j18;
                    this.Z = j21;
                    z8 = z5;
                    this.N0 = z8;
                    this.O0 = z7;
                    this.P0 = (byte) 6;
                    if (o6i0Var2 == o6i0Var5) {
                        n6i0Var6 = n6i0Var5;
                        objA = null;
                    } else {
                        n6i0Var6 = n6i0Var5;
                        objA = n6i0Var6.t.a(strP2, this);
                    }
                    if (objA == d9nVar6) {
                        return d9nVar6;
                    }
                    obj = objA;
                    d9nVar7 = d9nVar6;
                    z9 = z8;
                    n6i0Var7 = n6i0Var6;
                    j25 = j22;
                    j26 = j21;
                    z10 = z7;
                    str13 = str10;
                    o6i0Var3 = o6i0Var2;
                    wzd1Var6 = wzd1Var5;
                    i8 = i7;
                    j27 = j20;
                    j28 = j19;
                    j29 = j24;
                    sm51Var = (sm51) obj;
                    j30 = j26;
                    this.Q0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var6;
                    this.f = o6i0Var3;
                    this.g = sm51Var;
                    this.h = i8;
                    this.i = j25;
                    this.t = j27;
                    this.X = j28;
                    this.Y = j29;
                    this.Z = j30;
                    j31 = j25;
                    this.N0 = z9;
                    z11 = z10;
                    this.O0 = z11;
                    this.P0 = (byte) 7;
                    objO = n6i0Var7.o(str13, this);
                    d9nVar8 = d9nVar7;
                    if (objO == d9nVar8) {
                        return d9nVar8;
                    }
                    j32 = j27;
                    o6i0Var4 = o6i0Var3;
                    j33 = j30;
                    j34 = j29;
                    j35 = j28;
                    wzd1Var7 = wzd1Var6;
                    str14 = str8;
                    sm51Var2 = sm51Var;
                    i9 = i8;
                    z12 = z11;
                    j36 = j31;
                    zge1 zge1Var6 = (zge1) objO;
                    if (i9 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var6, o6i0Var4, z12, str14, z13, j32, j35);
                }
                return d9nVar2;
            case 3:
                long j51 = this.X;
                j3 = this.t;
                long j52 = this.i;
                i2 = this.h;
                wzd1Var2 = this.e;
                String str16 = this.d;
                j = 0;
                y5i0 y5i0Var7 = this.c;
                String str17 = this.a;
                hm5.M(obj);
                str7 = str17;
                str8 = str16;
                objE = obj;
                d9nVar2 = d9nVar9;
                mmr0Var = null;
                n6i0Var = n6i0Var8;
                y5i0Var3 = y5i0Var7;
                j2 = j52;
                jLongValue = j51;
                mmr0 mmr0Var15 = (mmr0) objE;
                mmr0Var2 = mmr0Var;
                mmr0Var3 = (t3i0) mmr0Var15.a;
                nw01Var = (nw01) mmr0Var15.b;
                n6i0Var2 = n6i0Var;
                d9nVar3 = d9nVar2;
                if (u3i0Var2.b instanceof o3i0) {
                    if (mmr0Var3 instanceof r3i0) {
                        mmr0Var7 = (r3i0) mmr0Var3;
                    } else {
                        mmr0Var7 = mmr0Var2;
                    }
                    if (mmr0Var7 != null) {
                        break;
                    }
                    eg.m("Edit trim must contain an end timestamp");
                    return mmr0Var2;
                }
                u3i0Var = u3i0Var2;
                if (nw01Var != null) {
                    str9 = nw01Var.a;
                    j4 = jLongValue;
                    long j312 = nw01Var.b;
                    if (str9.equals(str7)) {
                        mmr0Var5 = mmr0Var2;
                    } else {
                        mmr0Var5 = mmr0Var2;
                    }
                    if (mmr0Var5 != null) {
                        y5i0Var5 = y5i0Var3;
                        str10 = str7;
                        wzd1Var3 = wzd1Var2;
                        d9nVar2 = d9nVar3;
                        mmr0 mmr0Var16 = mmr0Var5;
                        i5 = i2;
                        j10 = j2;
                        j11 = j3;
                        mmr0Var6 = mmr0Var16;
                        j12 = j4;
                    }
                } else {
                    j4 = jLongValue;
                }
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.Q0 = mmr0Var2;
                this.a = str7;
                this.b = mmr0Var2;
                this.c = y5i0Var3;
                this.d = str8;
                this.e = wzd1Var2;
                this.h = i2;
                this.i = j2;
                this.t = j3;
                j5 = j4;
                this.X = j5;
                this.P0 = (byte) 4;
                i3 = i2;
                y5i0Var4 = y5i0Var3;
                j6 = mmr0Var3.m().a;
                if (wzd1Var2 == null) {
                    j7 = j3;
                    mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                } else {
                    j7 = j3;
                    mmr0Var4 = new mmr0(new Long(j6), new Long(Math.min(j6 + 10000, j2)));
                }
                d9nVar2 = d9nVar3;
                if (mmr0Var4 != d9nVar2) {
                    i4 = i3;
                    y5i0Var5 = y5i0Var4;
                    j8 = j7;
                    wzd1Var3 = wzd1Var2;
                    long j415 = j5;
                    i5 = i4;
                    str10 = str7;
                    mmr0Var6 = (mmr0) mmr0Var4;
                    j10 = j2;
                    j11 = j8;
                    j12 = j415;
                }
                return d9nVar2;
                jLongValue2 = ((Number) mmr0Var6.a).longValue();
                jLongValue3 = ((Number) mmr0Var6.b).longValue();
                prl prlVar4 = y5i0Var5.c;
                d9nVar4 = d9nVar2;
                d7u0Var = y5i0Var5.a;
                nrlVar = prlVar4.d;
                if (nrlVar.equals(jrl.a)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (d7u0Var != null) {
                    arrayList2 = d7u0Var.a;
                    if (arrayList2.isEmpty()) {
                        z3 = false;
                    } else {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z3 = false;
                            } else if (((my7) it3.next()).a instanceof c58) {
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                o6i0Var = u3i0Var.d;
                o6i0 o6i0Var9 = o6i0.b;
                if (z2) {
                    Set set5 = s4b1.f;
                    d7u0Var2 = d7u0Var;
                    if (uic.x(str10).c != blc0.ti) {
                        o6i0Var2 = o6i0Var5;
                    } else if (o6i0Var != null) {
                        o6i0Var2 = o6i0Var;
                    }
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = y5i0Var5;
                    this.d = str8;
                    this.e = wzd1Var3;
                    this.f = o6i0Var2;
                    this.h = i5;
                    this.i = j10;
                    this.t = j11;
                    this.X = j12;
                    j13 = j10;
                    this.Y = jLongValue2;
                    this.Z = jLongValue3;
                    this.N0 = z2;
                    this.O0 = z3;
                    this.P0 = (byte) 5;
                    n6i0Var3 = n6i0Var2;
                    z4 = z3;
                    q8nVar = n6i0Var3.i;
                    iOrdinal = o6i0Var2.ordinal();
                    rih1Var = rih1.a;
                    if (iOrdinal != 0) {
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        z6 = true;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                        strP = n6i0.p(y5i0Var5);
                        if (strP != null) {
                            objY = rih1Var;
                        } else {
                            objY = rih1Var;
                        }
                    } else {
                        if (iOrdinal == 1) {
                            eg.o();
                            return null;
                        }
                        if (z4) {
                            z6 = true;
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                        } else {
                            if (d7u0Var2 != null) {
                                arrayList = d7u0Var2.a;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = z6x.a;
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    b58Var = ((my7) it.next()).a;
                                    it2 = it;
                                    if (b58Var instanceof b58) {
                                        b58Var2 = b58Var;
                                    } else {
                                        b58Var2 = null;
                                    }
                                    if (b58Var2 != null) {
                                        str12 = b58Var2.a;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        long j416 = j12;
                                        str11 = str12;
                                        j23 = j416;
                                    } else {
                                        it = it2;
                                    }
                                } else {
                                    j23 = j12;
                                    str11 = null;
                                }
                            }
                            if (str11 == null) {
                                j15 = j11;
                                j16 = jLongValue2;
                                j14 = j23;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                j17 = jLongValue3;
                                z6 = true;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                wzd1Var4 = wzd1Var3;
                            } else {
                                j14 = j23;
                                n6i0Var4 = n6i0Var3;
                                z5 = z2;
                                z6 = true;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                                objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                if (objY != d9nVar5) {
                                    objY = rih1Var;
                                }
                            }
                        }
                    }
                    if (objY == d9nVar5) {
                        return d9nVar5;
                    }
                    n6i0Var5 = n6i0Var4;
                    j18 = j16;
                    z7 = z4;
                    y5i0Var6 = y5i0Var5;
                    wzd1Var5 = wzd1Var4;
                    i7 = i6;
                    j19 = j14;
                    d9nVar6 = d9nVar5;
                    j20 = j15;
                    j21 = j17;
                    j22 = j13;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var5;
                    this.f = o6i0Var2;
                    this.h = i7;
                    this.i = j22;
                    this.t = j20;
                    this.X = j19;
                    this.Y = j18;
                    j24 = j18;
                    this.Z = j21;
                    z8 = z5;
                    this.N0 = z8;
                    this.O0 = z7;
                    this.P0 = (byte) 6;
                    if (o6i0Var2 == o6i0Var5) {
                        n6i0Var6 = n6i0Var5;
                        objA = null;
                    } else {
                        n6i0Var6 = n6i0Var5;
                        objA = n6i0Var6.t.a(strP2, this);
                    }
                    if (objA == d9nVar6) {
                        return d9nVar6;
                    }
                    obj = objA;
                    d9nVar7 = d9nVar6;
                    z9 = z8;
                    n6i0Var7 = n6i0Var6;
                    j25 = j22;
                    j26 = j21;
                    z10 = z7;
                    str13 = str10;
                    o6i0Var3 = o6i0Var2;
                    wzd1Var6 = wzd1Var5;
                    i8 = i7;
                    j27 = j20;
                    j28 = j19;
                    j29 = j24;
                    sm51Var = (sm51) obj;
                    j30 = j26;
                    this.Q0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var6;
                    this.f = o6i0Var3;
                    this.g = sm51Var;
                    this.h = i8;
                    this.i = j25;
                    this.t = j27;
                    this.X = j28;
                    this.Y = j29;
                    this.Z = j30;
                    j31 = j25;
                    this.N0 = z9;
                    z11 = z10;
                    this.O0 = z11;
                    this.P0 = (byte) 7;
                    objO = n6i0Var7.o(str13, this);
                    d9nVar8 = d9nVar7;
                    if (objO == d9nVar8) {
                        return d9nVar8;
                    }
                    j32 = j27;
                    o6i0Var4 = o6i0Var3;
                    j33 = j30;
                    j34 = j29;
                    j35 = j28;
                    wzd1Var7 = wzd1Var6;
                    str14 = str8;
                    sm51Var2 = sm51Var;
                    i9 = i8;
                    z12 = z11;
                    j36 = j31;
                    zge1 zge1Var7 = (zge1) objO;
                    if (i9 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var7, o6i0Var4, z12, str14, z13, j32, j35);
                }
                d7u0Var2 = d7u0Var;
                o6i0Var2 = o6i0Var9;
                this.Q0 = null;
                this.a = str10;
                this.b = null;
                this.c = y5i0Var5;
                this.d = str8;
                this.e = wzd1Var3;
                this.f = o6i0Var2;
                this.h = i5;
                this.i = j10;
                this.t = j11;
                this.X = j12;
                j13 = j10;
                this.Y = jLongValue2;
                this.Z = jLongValue3;
                this.N0 = z2;
                this.O0 = z3;
                this.P0 = (byte) 5;
                n6i0Var3 = n6i0Var2;
                z4 = z3;
                q8nVar = n6i0Var3.i;
                iOrdinal = o6i0Var2.ordinal();
                rih1Var = rih1.a;
                if (iOrdinal != 0) {
                    j14 = j12;
                    z5 = z2;
                    n6i0Var4 = n6i0Var3;
                    z6 = true;
                    wzd1Var4 = wzd1Var3;
                    i6 = i5;
                    d9nVar5 = d9nVar4;
                    j15 = j11;
                    j16 = jLongValue2;
                    j17 = jLongValue3;
                    strP = n6i0.p(y5i0Var5);
                    if (strP != null) {
                        objY = rih1Var;
                    } else {
                        objY = rih1Var;
                    }
                } else {
                    if (iOrdinal == 1) {
                        eg.o();
                        return null;
                    }
                    if (z4) {
                        z6 = true;
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        objY = rih1Var;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                    } else {
                        if (d7u0Var2 != null) {
                            arrayList = d7u0Var2.a;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            arrayList = z6x.a;
                        }
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b58Var = ((my7) it.next()).a;
                                it2 = it;
                                if (b58Var instanceof b58) {
                                    b58Var2 = b58Var;
                                } else {
                                    b58Var2 = null;
                                }
                                if (b58Var2 != null) {
                                    str12 = b58Var2.a;
                                } else {
                                    str12 = null;
                                }
                                if (str12 != null) {
                                    long j417 = j12;
                                    str11 = str12;
                                    j23 = j417;
                                } else {
                                    it = it2;
                                }
                            } else {
                                j23 = j12;
                                str11 = null;
                            }
                        }
                        if (str11 == null) {
                            j15 = j11;
                            j16 = jLongValue2;
                            j14 = j23;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            j17 = jLongValue3;
                            z6 = true;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            wzd1Var4 = wzd1Var3;
                        } else {
                            j14 = j23;
                            n6i0Var4 = n6i0Var3;
                            z5 = z2;
                            z6 = true;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                            objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                            if (objY != d9nVar5) {
                                objY = rih1Var;
                            }
                        }
                    }
                }
                if (objY == d9nVar5) {
                    return d9nVar5;
                }
                n6i0Var5 = n6i0Var4;
                j18 = j16;
                z7 = z4;
                y5i0Var6 = y5i0Var5;
                wzd1Var5 = wzd1Var4;
                i7 = i6;
                j19 = j14;
                d9nVar6 = d9nVar5;
                j20 = j15;
                j21 = j17;
                j22 = j13;
                this.Q0 = null;
                this.a = str10;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var5;
                this.f = o6i0Var2;
                this.h = i7;
                this.i = j22;
                this.t = j20;
                this.X = j19;
                this.Y = j18;
                j24 = j18;
                this.Z = j21;
                z8 = z5;
                this.N0 = z8;
                this.O0 = z7;
                this.P0 = (byte) 6;
                if (o6i0Var2 == o6i0Var5) {
                    n6i0Var6 = n6i0Var5;
                    objA = null;
                } else {
                    n6i0Var6 = n6i0Var5;
                    objA = n6i0Var6.t.a(strP2, this);
                }
                if (objA == d9nVar6) {
                    return d9nVar6;
                }
                obj = objA;
                d9nVar7 = d9nVar6;
                z9 = z8;
                n6i0Var7 = n6i0Var6;
                j25 = j22;
                j26 = j21;
                z10 = z7;
                str13 = str10;
                o6i0Var3 = o6i0Var2;
                wzd1Var6 = wzd1Var5;
                i8 = i7;
                j27 = j20;
                j28 = j19;
                j29 = j24;
                sm51Var = (sm51) obj;
                j30 = j26;
                this.Q0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var6;
                this.f = o6i0Var3;
                this.g = sm51Var;
                this.h = i8;
                this.i = j25;
                this.t = j27;
                this.X = j28;
                this.Y = j29;
                this.Z = j30;
                j31 = j25;
                this.N0 = z9;
                z11 = z10;
                this.O0 = z11;
                this.P0 = (byte) 7;
                objO = n6i0Var7.o(str13, this);
                d9nVar8 = d9nVar7;
                if (objO == d9nVar8) {
                    return d9nVar8;
                }
                j32 = j27;
                o6i0Var4 = o6i0Var3;
                j33 = j30;
                j34 = j29;
                j35 = j28;
                wzd1Var7 = wzd1Var6;
                str14 = str8;
                sm51Var2 = sm51Var;
                i9 = i8;
                z12 = z11;
                j36 = j31;
                zge1 zge1Var8 = (zge1) objO;
                if (i9 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var8, o6i0Var4, z12, str14, z13, j32, j35);
            case 4:
                long j53 = this.X;
                j8 = this.t;
                long j54 = this.i;
                i4 = this.h;
                wzd1Var2 = this.e;
                str8 = this.d;
                y5i0Var5 = this.c;
                String str18 = this.a;
                hm5.M(obj);
                n6i0Var2 = n6i0Var8;
                u3i0Var = u3i0Var2;
                str7 = str18;
                d9nVar2 = d9nVar9;
                mmr0Var4 = obj;
                o6i0Var5 = o6i0Var5;
                j2 = j54;
                j5 = j53;
                wzd1Var3 = wzd1Var2;
                long j418 = j5;
                i5 = i4;
                str10 = str7;
                mmr0Var6 = (mmr0) mmr0Var4;
                j10 = j2;
                j11 = j8;
                j12 = j418;
                jLongValue2 = ((Number) mmr0Var6.a).longValue();
                jLongValue3 = ((Number) mmr0Var6.b).longValue();
                prl prlVar5 = y5i0Var5.c;
                d9nVar4 = d9nVar2;
                d7u0Var = y5i0Var5.a;
                nrlVar = prlVar5.d;
                if (nrlVar.equals(jrl.a)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (d7u0Var != null) {
                    arrayList2 = d7u0Var.a;
                    if (arrayList2.isEmpty()) {
                        z3 = false;
                    } else {
                        it3 = arrayList2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z3 = false;
                            } else if (((my7) it3.next()).a instanceof c58) {
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                o6i0Var = u3i0Var.d;
                o6i0 o6i0Var10 = o6i0.b;
                if (z2) {
                    Set set6 = s4b1.f;
                    d7u0Var2 = d7u0Var;
                    if (uic.x(str10).c != blc0.ti) {
                        o6i0Var2 = o6i0Var5;
                    } else if (o6i0Var != null) {
                        o6i0Var2 = o6i0Var;
                    }
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = y5i0Var5;
                    this.d = str8;
                    this.e = wzd1Var3;
                    this.f = o6i0Var2;
                    this.h = i5;
                    this.i = j10;
                    this.t = j11;
                    this.X = j12;
                    j13 = j10;
                    this.Y = jLongValue2;
                    this.Z = jLongValue3;
                    this.N0 = z2;
                    this.O0 = z3;
                    this.P0 = (byte) 5;
                    n6i0Var3 = n6i0Var2;
                    z4 = z3;
                    q8nVar = n6i0Var3.i;
                    iOrdinal = o6i0Var2.ordinal();
                    rih1Var = rih1.a;
                    if (iOrdinal != 0) {
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        z6 = true;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                        strP = n6i0.p(y5i0Var5);
                        if (strP != null) {
                            objY = rih1Var;
                        } else {
                            objY = rih1Var;
                        }
                    } else {
                        if (iOrdinal == 1) {
                            eg.o();
                            return null;
                        }
                        if (z4) {
                            z6 = true;
                            j14 = j12;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                        } else {
                            if (d7u0Var2 != null) {
                                arrayList = d7u0Var2.a;
                            } else {
                                arrayList = null;
                            }
                            if (arrayList == null) {
                                arrayList = z6x.a;
                            }
                            it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    b58Var = ((my7) it.next()).a;
                                    it2 = it;
                                    if (b58Var instanceof b58) {
                                        b58Var2 = b58Var;
                                    } else {
                                        b58Var2 = null;
                                    }
                                    if (b58Var2 != null) {
                                        str12 = b58Var2.a;
                                    } else {
                                        str12 = null;
                                    }
                                    if (str12 != null) {
                                        long j419 = j12;
                                        str11 = str12;
                                        j23 = j419;
                                    } else {
                                        it = it2;
                                    }
                                } else {
                                    j23 = j12;
                                    str11 = null;
                                }
                            }
                            if (str11 == null) {
                                j15 = j11;
                                j16 = jLongValue2;
                                j14 = j23;
                                z5 = z2;
                                n6i0Var4 = n6i0Var3;
                                objY = rih1Var;
                                j17 = jLongValue3;
                                z6 = true;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                wzd1Var4 = wzd1Var3;
                            } else {
                                j14 = j23;
                                n6i0Var4 = n6i0Var3;
                                z5 = z2;
                                z6 = true;
                                wzd1Var4 = wzd1Var3;
                                i6 = i5;
                                d9nVar5 = d9nVar4;
                                j15 = j11;
                                j16 = jLongValue2;
                                j17 = jLongValue3;
                                objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                                if (objY != d9nVar5) {
                                    objY = rih1Var;
                                }
                            }
                        }
                    }
                    if (objY == d9nVar5) {
                        return d9nVar5;
                    }
                    n6i0Var5 = n6i0Var4;
                    j18 = j16;
                    z7 = z4;
                    y5i0Var6 = y5i0Var5;
                    wzd1Var5 = wzd1Var4;
                    i7 = i6;
                    j19 = j14;
                    d9nVar6 = d9nVar5;
                    j20 = j15;
                    j21 = j17;
                    j22 = j13;
                    this.Q0 = null;
                    this.a = str10;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var5;
                    this.f = o6i0Var2;
                    this.h = i7;
                    this.i = j22;
                    this.t = j20;
                    this.X = j19;
                    this.Y = j18;
                    j24 = j18;
                    this.Z = j21;
                    z8 = z5;
                    this.N0 = z8;
                    this.O0 = z7;
                    this.P0 = (byte) 6;
                    if (o6i0Var2 == o6i0Var5) {
                        n6i0Var6 = n6i0Var5;
                        objA = null;
                    } else {
                        n6i0Var6 = n6i0Var5;
                        objA = n6i0Var6.t.a(strP2, this);
                    }
                    if (objA == d9nVar6) {
                        return d9nVar6;
                    }
                    obj = objA;
                    d9nVar7 = d9nVar6;
                    z9 = z8;
                    n6i0Var7 = n6i0Var6;
                    j25 = j22;
                    j26 = j21;
                    z10 = z7;
                    str13 = str10;
                    o6i0Var3 = o6i0Var2;
                    wzd1Var6 = wzd1Var5;
                    i8 = i7;
                    j27 = j20;
                    j28 = j19;
                    j29 = j24;
                    sm51Var = (sm51) obj;
                    j30 = j26;
                    this.Q0 = null;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = str8;
                    this.e = wzd1Var6;
                    this.f = o6i0Var3;
                    this.g = sm51Var;
                    this.h = i8;
                    this.i = j25;
                    this.t = j27;
                    this.X = j28;
                    this.Y = j29;
                    this.Z = j30;
                    j31 = j25;
                    this.N0 = z9;
                    z11 = z10;
                    this.O0 = z11;
                    this.P0 = (byte) 7;
                    objO = n6i0Var7.o(str13, this);
                    d9nVar8 = d9nVar7;
                    if (objO == d9nVar8) {
                        return d9nVar8;
                    }
                    j32 = j27;
                    o6i0Var4 = o6i0Var3;
                    j33 = j30;
                    j34 = j29;
                    j35 = j28;
                    wzd1Var7 = wzd1Var6;
                    str14 = str8;
                    sm51Var2 = sm51Var;
                    i9 = i8;
                    z12 = z11;
                    j36 = j31;
                    zge1 zge1Var9 = (zge1) objO;
                    if (i9 != 0) {
                        z13 = z6;
                    } else {
                        z13 = false;
                    }
                    return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var9, o6i0Var4, z12, str14, z13, j32, j35);
                }
                d7u0Var2 = d7u0Var;
                o6i0Var2 = o6i0Var10;
                this.Q0 = null;
                this.a = str10;
                this.b = null;
                this.c = y5i0Var5;
                this.d = str8;
                this.e = wzd1Var3;
                this.f = o6i0Var2;
                this.h = i5;
                this.i = j10;
                this.t = j11;
                this.X = j12;
                j13 = j10;
                this.Y = jLongValue2;
                this.Z = jLongValue3;
                this.N0 = z2;
                this.O0 = z3;
                this.P0 = (byte) 5;
                n6i0Var3 = n6i0Var2;
                z4 = z3;
                q8nVar = n6i0Var3.i;
                iOrdinal = o6i0Var2.ordinal();
                rih1Var = rih1.a;
                if (iOrdinal != 0) {
                    j14 = j12;
                    z5 = z2;
                    n6i0Var4 = n6i0Var3;
                    z6 = true;
                    wzd1Var4 = wzd1Var3;
                    i6 = i5;
                    d9nVar5 = d9nVar4;
                    j15 = j11;
                    j16 = jLongValue2;
                    j17 = jLongValue3;
                    strP = n6i0.p(y5i0Var5);
                    if (strP != null) {
                        objY = rih1Var;
                    } else {
                        objY = rih1Var;
                    }
                } else {
                    if (iOrdinal == 1) {
                        eg.o();
                        return null;
                    }
                    if (z4) {
                        z6 = true;
                        j14 = j12;
                        z5 = z2;
                        n6i0Var4 = n6i0Var3;
                        objY = rih1Var;
                        wzd1Var4 = wzd1Var3;
                        i6 = i5;
                        d9nVar5 = d9nVar4;
                        j15 = j11;
                        j16 = jLongValue2;
                        j17 = jLongValue3;
                    } else {
                        if (d7u0Var2 != null) {
                            arrayList = d7u0Var2.a;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            arrayList = z6x.a;
                        }
                        it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b58Var = ((my7) it.next()).a;
                                it2 = it;
                                if (b58Var instanceof b58) {
                                    b58Var2 = b58Var;
                                } else {
                                    b58Var2 = null;
                                }
                                if (b58Var2 != null) {
                                    str12 = b58Var2.a;
                                } else {
                                    str12 = null;
                                }
                                if (str12 != null) {
                                    long j4110 = j12;
                                    str11 = str12;
                                    j23 = j4110;
                                } else {
                                    it = it2;
                                }
                            } else {
                                j23 = j12;
                                str11 = null;
                            }
                        }
                        if (str11 == null) {
                            j15 = j11;
                            j16 = jLongValue2;
                            j14 = j23;
                            z5 = z2;
                            n6i0Var4 = n6i0Var3;
                            objY = rih1Var;
                            j17 = jLongValue3;
                            z6 = true;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            wzd1Var4 = wzd1Var3;
                        } else {
                            j14 = j23;
                            n6i0Var4 = n6i0Var3;
                            z5 = z2;
                            z6 = true;
                            wzd1Var4 = wzd1Var3;
                            i6 = i5;
                            d9nVar5 = d9nVar4;
                            j15 = j11;
                            j16 = jLongValue2;
                            j17 = jLongValue3;
                            objY = fn31.Y(q8nVar, new b6i0(n6i0Var4, str11, j16, j17, null, (byte) 1), this);
                            if (objY != d9nVar5) {
                                objY = rih1Var;
                            }
                        }
                    }
                }
                if (objY == d9nVar5) {
                    return d9nVar5;
                }
                n6i0Var5 = n6i0Var4;
                j18 = j16;
                z7 = z4;
                y5i0Var6 = y5i0Var5;
                wzd1Var5 = wzd1Var4;
                i7 = i6;
                j19 = j14;
                d9nVar6 = d9nVar5;
                j20 = j15;
                j21 = j17;
                j22 = j13;
                this.Q0 = null;
                this.a = str10;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var5;
                this.f = o6i0Var2;
                this.h = i7;
                this.i = j22;
                this.t = j20;
                this.X = j19;
                this.Y = j18;
                j24 = j18;
                this.Z = j21;
                z8 = z5;
                this.N0 = z8;
                this.O0 = z7;
                this.P0 = (byte) 6;
                if (o6i0Var2 == o6i0Var5) {
                    n6i0Var6 = n6i0Var5;
                    objA = null;
                } else {
                    n6i0Var6 = n6i0Var5;
                    objA = n6i0Var6.t.a(strP2, this);
                }
                if (objA == d9nVar6) {
                    return d9nVar6;
                }
                obj = objA;
                d9nVar7 = d9nVar6;
                z9 = z8;
                n6i0Var7 = n6i0Var6;
                j25 = j22;
                j26 = j21;
                z10 = z7;
                str13 = str10;
                o6i0Var3 = o6i0Var2;
                wzd1Var6 = wzd1Var5;
                i8 = i7;
                j27 = j20;
                j28 = j19;
                j29 = j24;
                sm51Var = (sm51) obj;
                j30 = j26;
                this.Q0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var6;
                this.f = o6i0Var3;
                this.g = sm51Var;
                this.h = i8;
                this.i = j25;
                this.t = j27;
                this.X = j28;
                this.Y = j29;
                this.Z = j30;
                j31 = j25;
                this.N0 = z9;
                z11 = z10;
                this.O0 = z11;
                this.P0 = (byte) 7;
                objO = n6i0Var7.o(str13, this);
                d9nVar8 = d9nVar7;
                if (objO == d9nVar8) {
                    return d9nVar8;
                }
                j32 = j27;
                o6i0Var4 = o6i0Var3;
                j33 = j30;
                j34 = j29;
                j35 = j28;
                wzd1Var7 = wzd1Var6;
                str14 = str8;
                sm51Var2 = sm51Var;
                i9 = i8;
                z12 = z11;
                j36 = j31;
                zge1 zge1Var10 = (zge1) objO;
                if (i9 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var10, o6i0Var4, z12, str14, z13, j32, j35);
            case 5:
                boolean z14 = this.O0;
                boolean z15 = this.N0;
                long j55 = this.Z;
                long j56 = this.Y;
                long j57 = this.X;
                long j58 = this.t;
                long j59 = this.i;
                int i13 = this.h;
                o6i0 o6i0Var11 = this.f;
                wzd1 wzd1Var8 = this.e;
                String str19 = this.d;
                y5i0 y5i0Var8 = this.c;
                String str20 = this.a;
                hm5.M(obj);
                o6i0Var5 = o6i0Var5;
                z5 = z15;
                o6i0Var2 = o6i0Var11;
                z6 = true;
                d9nVar6 = d9nVar9;
                z7 = z14;
                str10 = str20;
                j20 = j58;
                str8 = str19;
                y5i0Var6 = y5i0Var8;
                n6i0Var5 = n6i0Var8;
                j18 = j56;
                j19 = j57;
                i7 = i13;
                j21 = j55;
                wzd1Var5 = wzd1Var8;
                j22 = j59;
                this.Q0 = null;
                this.a = str10;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var5;
                this.f = o6i0Var2;
                this.h = i7;
                this.i = j22;
                this.t = j20;
                this.X = j19;
                this.Y = j18;
                j24 = j18;
                this.Z = j21;
                z8 = z5;
                this.N0 = z8;
                this.O0 = z7;
                this.P0 = (byte) 6;
                if (o6i0Var2 == o6i0Var5) {
                    n6i0Var6 = n6i0Var5;
                    objA = null;
                } else {
                    n6i0Var6 = n6i0Var5;
                    objA = n6i0Var6.t.a(strP2, this);
                }
                if (objA == d9nVar6) {
                    return d9nVar6;
                }
                obj = objA;
                d9nVar7 = d9nVar6;
                z9 = z8;
                n6i0Var7 = n6i0Var6;
                j25 = j22;
                j26 = j21;
                z10 = z7;
                str13 = str10;
                o6i0Var3 = o6i0Var2;
                wzd1Var6 = wzd1Var5;
                i8 = i7;
                j27 = j20;
                j28 = j19;
                j29 = j24;
                sm51Var = (sm51) obj;
                j30 = j26;
                this.Q0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var6;
                this.f = o6i0Var3;
                this.g = sm51Var;
                this.h = i8;
                this.i = j25;
                this.t = j27;
                this.X = j28;
                this.Y = j29;
                this.Z = j30;
                j31 = j25;
                this.N0 = z9;
                z11 = z10;
                this.O0 = z11;
                this.P0 = (byte) 7;
                objO = n6i0Var7.o(str13, this);
                d9nVar8 = d9nVar7;
                if (objO == d9nVar8) {
                    return d9nVar8;
                }
                j32 = j27;
                o6i0Var4 = o6i0Var3;
                j33 = j30;
                j34 = j29;
                j35 = j28;
                wzd1Var7 = wzd1Var6;
                str14 = str8;
                sm51Var2 = sm51Var;
                i9 = i8;
                z12 = z11;
                j36 = j31;
                zge1 zge1Var11 = (zge1) objO;
                if (i9 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var11, o6i0Var4, z12, str14, z13, j32, j35);
            case 6:
                boolean z16 = this.O0;
                boolean z17 = this.N0;
                j26 = this.Z;
                j29 = this.Y;
                j28 = this.X;
                long j60 = this.t;
                long j61 = this.i;
                int i14 = this.h;
                o6i0 o6i0Var12 = this.f;
                wzd1 wzd1Var9 = this.e;
                String str21 = this.d;
                String str22 = this.a;
                hm5.M(obj);
                n6i0Var7 = n6i0Var8;
                z6 = true;
                str13 = str22;
                j25 = j61;
                i8 = i14;
                z9 = z17;
                j27 = j60;
                wzd1Var6 = wzd1Var9;
                str8 = str21;
                d9nVar7 = d9nVar9;
                o6i0Var3 = o6i0Var12;
                z10 = z16;
                sm51Var = (sm51) obj;
                j30 = j26;
                this.Q0 = null;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = str8;
                this.e = wzd1Var6;
                this.f = o6i0Var3;
                this.g = sm51Var;
                this.h = i8;
                this.i = j25;
                this.t = j27;
                this.X = j28;
                this.Y = j29;
                this.Z = j30;
                j31 = j25;
                this.N0 = z9;
                z11 = z10;
                this.O0 = z11;
                this.P0 = (byte) 7;
                objO = n6i0Var7.o(str13, this);
                d9nVar8 = d9nVar7;
                if (objO == d9nVar8) {
                    return d9nVar8;
                }
                j32 = j27;
                o6i0Var4 = o6i0Var3;
                j33 = j30;
                j34 = j29;
                j35 = j28;
                wzd1Var7 = wzd1Var6;
                str14 = str8;
                sm51Var2 = sm51Var;
                i9 = i8;
                z12 = z11;
                j36 = j31;
                zge1 zge1Var12 = (zge1) objO;
                if (i9 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var12, o6i0Var4, z12, str14, z13, j32, j35);
            case 7:
                boolean z18 = this.O0;
                long j62 = this.Z;
                long j63 = this.Y;
                long j64 = this.X;
                long j65 = this.t;
                long j66 = this.i;
                i9 = this.h;
                sm51 sm51Var3 = this.g;
                o6i0 o6i0Var13 = this.f;
                wzd1 wzd1Var10 = this.e;
                String str23 = this.d;
                hm5.M(obj);
                str14 = str23;
                z12 = z18;
                j33 = j62;
                j34 = j63;
                j35 = j64;
                j32 = j65;
                j36 = j66;
                sm51Var2 = sm51Var3;
                wzd1Var7 = wzd1Var10;
                o6i0Var4 = o6i0Var13;
                z6 = true;
                objO = obj;
                zge1 zge1Var13 = (zge1) objO;
                if (i9 != 0) {
                    z13 = z6;
                } else {
                    z13 = false;
                }
                return new x5i0(wzd1Var7, j36, j34, j33, sm51Var2, zge1Var13, o6i0Var4, z12, str14, z13, j32, j35);
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
