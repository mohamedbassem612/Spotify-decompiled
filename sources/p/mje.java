package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mje {
    public static final long a;
    public static final long b;
    public static final long c;
    public static final o3r d;

    static {
        ytw0 ytw0Var = jfv.b;
        ngv ngvVar = ngv.e;
        a = fdg1.k0(5, ngvVar);
        b = fdg1.k0(2, ngvVar);
        c = fdg1.k0(1, ngvVar);
        d = w3p1.o(new l4r(pwc0.d, 2, jzd.b1, new j4r(jzd.Z0), jzd.c1), jzd.a1);
    }

    public static Object a(mje mjeVar, d0r d0rVar, String str, ahe aheVar, onm onmVar) {
        mjeVar.getClass();
        Object objP = rc2.P(a, new zie(d0rVar, str, aheVar, null, (byte) 0), onmVar);
        return objP == d9n.a ? objP : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0070  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:21:0x006a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable b(p.d0r r9, java.lang.String r10, java.util.List r11, p.onm r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p.aje
            if (r0 == 0) goto L13
            r0 = r12
            p.aje r0 = (p.aje) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.aje r0 = new p.aje
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r8 = r0.e
            int r12 = r0.g
            r1 = 1
            if (r12 == 0) goto L36
            if (r12 != r1) goto L2f
            p.ahe r9 = r0.d
            java.util.Iterator r10 = r0.c
            java.lang.String r11 = r0.b
            p.d0r r12 = r0.a
            p.hm5.M(r8)
            r4 = r11
            r3 = r12
            goto L6a
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L36:
            p.hm5.M(r8)
            java.util.Iterator r8 = r11.iterator()
            r3 = r9
            r4 = r10
            r10 = r8
        L40:
            boolean r8 = r10.hasNext()
            r6 = 0
            if (r8 == 0) goto L79
            java.lang.Object r8 = r10.next()
            r5 = r8
            p.ahe r5 = (p.ahe) r5
            p.zie r2 = new p.zie
            r7 = 1
            r2.<init>(r3, r4, r5, r6, r7)
            r0.a = r3
            r0.b = r4
            r0.c = r10
            r0.d = r5
            r0.g = r1
            long r8 = p.mje.c
            java.lang.Object r8 = p.rc2.P(r8, r2, r0)
            p.d9n r9 = p.d9n.a
            if (r8 != r9) goto L69
            return r9
        L69:
            r9 = r5
        L6a:
            p.cob1 r8 = (p.cob1) r8
            p.cob1 r11 = p.cob1.a
            if (r8 != 0) goto L71
            r8 = r11
        L71:
            if (r8 == r11) goto L40
            p.mmr0 r10 = new p.mmr0
            r10.<init>(r9, r8)
            return r10
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mje.b(p.d0r, java.lang.String, java.util.List, p.onm):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:32:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0152  */
    /* JADX WARN: Code duplicated, block: B:47:0x0179  */
    /* JADX WARN: Code duplicated, block: B:50:0x0184  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d6 A[PHI: r3 r7 r8 r9 r11 r13
      0x01d6: PHI (r3v13 int) = (r3v10 int), (r3v15 int) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r7v20 p.ahe) = (r7v17 p.ahe), (r7v22 p.ahe) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r8v10 p.d0r) = (r8v8 p.d0r), (r8v14 p.d0r) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r9v13 int) = (r9v11 int), (r9v15 int) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r11v12 java.lang.String) = (r11v10 java.lang.String), (r11v14 java.lang.String) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]
      0x01d6: PHI (r13v14 p.d0r) = (r13v12 p.d0r), (r13v15 p.d0r) binds: [B:59:0x01d3, B:15:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:68:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(d0r d0rVar, kdy0 kdy0Var, pie pieVar, cke ckeVar, ahe aheVar, String str, onm onmVar) {
        dje djeVar;
        d0r d0rVar2;
        ahe aheVar2;
        pie pieVar2;
        kdy0 kdy0Var2;
        String str2;
        cke ckeVar2;
        Object obj;
        cob1 cob1Var;
        cob1 cob1Var2;
        int i;
        int i2;
        String str3;
        String str4;
        kdy0 kdy0Var3;
        cke ckeVar3;
        d0r d0rVar3;
        ahe aheVar3;
        pie pieVar3;
        int i3;
        int i4;
        Object objA;
        kdy0 kdy0Var4;
        List list;
        Object objG;
        String str5;
        int i5;
        ahe aheVar4;
        List list2;
        d0r d0rVar4;
        kdy0 kdy0Var5;
        String str6;
        boolean z;
        d0r d0rVar5;
        int i6;
        int i7;
        String str7;
        if (onmVar instanceof dje) {
            djeVar = (dje) onmVar;
            int i8 = djeVar.Y;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                djeVar.Y = i8 - Integer.MIN_VALUE;
            } else {
                djeVar = new dje(this, onmVar);
            }
        } else {
            djeVar = new dje(this, onmVar);
        }
        Object obj2 = djeVar.t;
        int i9 = djeVar.Y;
        rih1 rih1Var = rih1.a;
        qz qzVar = qz.a;
        hjx0 hjx0Var = hjx0.a;
        Object obj3 = d9n.a;
        switch (i9) {
            case 0:
                hm5.M(obj2);
                d0rVar2 = d0rVar;
                aheVar2 = aheVar;
                zie zieVar = new zie(d0rVar2, str, aheVar2, null, (byte) 2);
                djeVar.a = d0rVar2;
                djeVar.b = kdy0Var;
                pieVar2 = pieVar;
                djeVar.c = pieVar2;
                djeVar.d = ckeVar;
                djeVar.e = aheVar2;
                djeVar.f = str;
                djeVar.Y = 1;
                Object objP = rc2.P(c, zieVar, djeVar);
                if (objP != obj3) {
                    kdy0Var2 = kdy0Var;
                    str2 = str;
                    ckeVar2 = ckeVar;
                    obj = objP;
                    cob1Var = (cob1) obj;
                    cob1Var2 = cob1.a;
                    if (cob1Var == null) {
                        cob1Var = cob1Var2;
                    }
                    if (cob1Var != cob1Var2) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if (cob1Var == cob1.b) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    str3 = aheVar2.a;
                    djeVar.a = d0rVar2;
                    djeVar.b = kdy0Var2;
                    djeVar.c = pieVar2;
                    djeVar.d = ckeVar2;
                    djeVar.e = aheVar2;
                    djeVar.f = str2;
                    djeVar.h = i;
                    djeVar.i = i2;
                    djeVar.Y = 2;
                    d0rVar2.getClass();
                    if (d0r.d(d0rVar2, hjx0Var, str3, qzVar, djeVar) != obj3) {
                        cke ckeVar4 = ckeVar2;
                        str4 = str2;
                        kdy0Var3 = kdy0Var2;
                        ckeVar3 = ckeVar4;
                        d0rVar3 = d0rVar2;
                        aheVar3 = aheVar2;
                        pieVar3 = pieVar2;
                        i3 = i2;
                        i4 = i;
                        if (i4 != 0) {
                            djeVar.a = d0rVar3;
                            djeVar.b = kdy0Var3;
                            djeVar.c = null;
                            djeVar.d = ckeVar3;
                            djeVar.e = aheVar3;
                            djeVar.f = str4;
                            djeVar.h = i4;
                            djeVar.i = i3;
                            djeVar.Y = 3;
                            objA = pieVar3.a(djeVar);
                            if (objA != obj3) {
                                kdy0Var4 = kdy0Var3;
                                obj2 = objA;
                                list = (List) obj2;
                                String str8 = aheVar3.a;
                                djeVar.a = d0rVar3;
                                djeVar.b = kdy0Var4;
                                djeVar.c = null;
                                djeVar.d = null;
                                djeVar.e = aheVar3;
                                djeVar.f = str4;
                                djeVar.g = list;
                                djeVar.h = i4;
                                djeVar.i = i3;
                                djeVar.Y = 4;
                                objG = g(ckeVar3, str8, list, djeVar);
                                if (objG != obj3) {
                                    str5 = str4;
                                    i5 = i4;
                                    aheVar4 = aheVar3;
                                    list2 = list;
                                    obj2 = objG;
                                    d0rVar4 = d0rVar3;
                                    kdy0Var5 = kdy0Var4;
                                    str6 = (String) obj2;
                                    if (str6 == null) {
                                        djeVar.a = d0rVar4;
                                        djeVar.b = null;
                                        djeVar.c = null;
                                        djeVar.d = null;
                                        djeVar.e = aheVar4;
                                        djeVar.f = null;
                                        djeVar.g = null;
                                        djeVar.h = i5;
                                        djeVar.i = i3;
                                        djeVar.Y = 5;
                                        if (kdy0Var5.p(djeVar) != obj3) {
                                            i6 = i3;
                                            i7 = i5;
                                            d0rVar5 = null;
                                            str7 = aheVar4.a;
                                            djeVar.a = d0rVar5;
                                            djeVar.b = d0rVar5;
                                            djeVar.c = d0rVar5;
                                            djeVar.d = d0rVar5;
                                            djeVar.e = d0rVar5;
                                            djeVar.f = d0rVar5;
                                            djeVar.g = d0rVar5;
                                            djeVar.h = i7;
                                            djeVar.i = i6;
                                            djeVar.Y = 8;
                                            d0rVar4.getClass();
                                            if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                            }
                                        }
                                    } else {
                                        if (i3 != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        djeVar.a = d0rVar4;
                                        d0rVar5 = null;
                                        djeVar.b = null;
                                        djeVar.c = null;
                                        djeVar.d = null;
                                        djeVar.e = aheVar4;
                                        djeVar.f = str5;
                                        djeVar.g = null;
                                        djeVar.h = i5;
                                        djeVar.i = i3;
                                        djeVar.Y = 6;
                                        if (kdy0Var5.m(str5, str6, list2, djeVar, z) != obj3) {
                                            djeVar.a = d0rVar4;
                                            djeVar.b = d0rVar5;
                                            djeVar.c = d0rVar5;
                                            djeVar.d = d0rVar5;
                                            djeVar.e = aheVar4;
                                            djeVar.f = d0rVar5;
                                            djeVar.g = d0rVar5;
                                            djeVar.h = i5;
                                            djeVar.i = i3;
                                            djeVar.Y = 7;
                                            if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                                                i6 = i3;
                                                i7 = i5;
                                                str7 = aheVar4.a;
                                                djeVar.a = d0rVar5;
                                                djeVar.b = d0rVar5;
                                                djeVar.c = d0rVar5;
                                                djeVar.d = d0rVar5;
                                                djeVar.e = d0rVar5;
                                                djeVar.f = d0rVar5;
                                                djeVar.g = d0rVar5;
                                                djeVar.h = i7;
                                                djeVar.i = i6;
                                                djeVar.Y = 8;
                                                d0rVar4.getClass();
                                                if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return rih1Var;
                    }
                }
                return obj3;
            case 1:
                String str9 = djeVar.f;
                ahe aheVar5 = djeVar.e;
                ckeVar2 = djeVar.d;
                pie pieVar4 = djeVar.c;
                kdy0Var2 = djeVar.b;
                d0r d0rVar6 = djeVar.a;
                hm5.M(obj2);
                obj = obj2;
                str2 = str9;
                pieVar2 = pieVar4;
                d0rVar2 = d0rVar6;
                aheVar2 = aheVar5;
                cob1Var = (cob1) obj;
                cob1Var2 = cob1.a;
                if (cob1Var == null) {
                    cob1Var = cob1Var2;
                }
                if (cob1Var != cob1Var2) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (cob1Var == cob1.b) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                str3 = aheVar2.a;
                djeVar.a = d0rVar2;
                djeVar.b = kdy0Var2;
                djeVar.c = pieVar2;
                djeVar.d = ckeVar2;
                djeVar.e = aheVar2;
                djeVar.f = str2;
                djeVar.h = i;
                djeVar.i = i2;
                djeVar.Y = 2;
                d0rVar2.getClass();
                if (d0r.d(d0rVar2, hjx0Var, str3, qzVar, djeVar) != obj3) {
                    cke ckeVar5 = ckeVar2;
                    str4 = str2;
                    kdy0Var3 = kdy0Var2;
                    ckeVar3 = ckeVar5;
                    d0rVar3 = d0rVar2;
                    aheVar3 = aheVar2;
                    pieVar3 = pieVar2;
                    i3 = i2;
                    i4 = i;
                    if (i4 != 0) {
                        djeVar.a = d0rVar3;
                        djeVar.b = kdy0Var3;
                        djeVar.c = null;
                        djeVar.d = ckeVar3;
                        djeVar.e = aheVar3;
                        djeVar.f = str4;
                        djeVar.h = i4;
                        djeVar.i = i3;
                        djeVar.Y = 3;
                        objA = pieVar3.a(djeVar);
                        if (objA != obj3) {
                            kdy0Var4 = kdy0Var3;
                            obj2 = objA;
                            list = (List) obj2;
                            String str10 = aheVar3.a;
                            djeVar.a = d0rVar3;
                            djeVar.b = kdy0Var4;
                            djeVar.c = null;
                            djeVar.d = null;
                            djeVar.e = aheVar3;
                            djeVar.f = str4;
                            djeVar.g = list;
                            djeVar.h = i4;
                            djeVar.i = i3;
                            djeVar.Y = 4;
                            objG = g(ckeVar3, str10, list, djeVar);
                            if (objG != obj3) {
                                str5 = str4;
                                i5 = i4;
                                aheVar4 = aheVar3;
                                list2 = list;
                                obj2 = objG;
                                d0rVar4 = d0rVar3;
                                kdy0Var5 = kdy0Var4;
                                str6 = (String) obj2;
                                if (str6 == null) {
                                    djeVar.a = d0rVar4;
                                    djeVar.b = null;
                                    djeVar.c = null;
                                    djeVar.d = null;
                                    djeVar.e = aheVar4;
                                    djeVar.f = null;
                                    djeVar.g = null;
                                    djeVar.h = i5;
                                    djeVar.i = i3;
                                    djeVar.Y = 5;
                                    if (kdy0Var5.p(djeVar) != obj3) {
                                        i6 = i3;
                                        i7 = i5;
                                        d0rVar5 = null;
                                        str7 = aheVar4.a;
                                        djeVar.a = d0rVar5;
                                        djeVar.b = d0rVar5;
                                        djeVar.c = d0rVar5;
                                        djeVar.d = d0rVar5;
                                        djeVar.e = d0rVar5;
                                        djeVar.f = d0rVar5;
                                        djeVar.g = d0rVar5;
                                        djeVar.h = i7;
                                        djeVar.i = i6;
                                        djeVar.Y = 8;
                                        d0rVar4.getClass();
                                        if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                        }
                                    }
                                } else {
                                    if (i3 != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    djeVar.a = d0rVar4;
                                    d0rVar5 = null;
                                    djeVar.b = null;
                                    djeVar.c = null;
                                    djeVar.d = null;
                                    djeVar.e = aheVar4;
                                    djeVar.f = str5;
                                    djeVar.g = null;
                                    djeVar.h = i5;
                                    djeVar.i = i3;
                                    djeVar.Y = 6;
                                    if (kdy0Var5.m(str5, str6, list2, djeVar, z) != obj3) {
                                        djeVar.a = d0rVar4;
                                        djeVar.b = d0rVar5;
                                        djeVar.c = d0rVar5;
                                        djeVar.d = d0rVar5;
                                        djeVar.e = aheVar4;
                                        djeVar.f = d0rVar5;
                                        djeVar.g = d0rVar5;
                                        djeVar.h = i5;
                                        djeVar.i = i3;
                                        djeVar.Y = 7;
                                        if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                                            i6 = i3;
                                            i7 = i5;
                                            str7 = aheVar4.a;
                                            djeVar.a = d0rVar5;
                                            djeVar.b = d0rVar5;
                                            djeVar.c = d0rVar5;
                                            djeVar.d = d0rVar5;
                                            djeVar.e = d0rVar5;
                                            djeVar.f = d0rVar5;
                                            djeVar.g = d0rVar5;
                                            djeVar.h = i7;
                                            djeVar.i = i6;
                                            djeVar.Y = 8;
                                            d0rVar4.getClass();
                                            if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return rih1Var;
                }
                return obj3;
            case 2:
                i3 = djeVar.i;
                i4 = djeVar.h;
                str4 = djeVar.f;
                aheVar3 = djeVar.e;
                ckeVar3 = djeVar.d;
                pieVar3 = djeVar.c;
                kdy0 kdy0Var6 = djeVar.b;
                d0r d0rVar7 = djeVar.a;
                hm5.M(obj2);
                kdy0Var3 = kdy0Var6;
                d0rVar3 = d0rVar7;
                if (i4 != 0) {
                    djeVar.a = d0rVar3;
                    djeVar.b = kdy0Var3;
                    djeVar.c = null;
                    djeVar.d = ckeVar3;
                    djeVar.e = aheVar3;
                    djeVar.f = str4;
                    djeVar.h = i4;
                    djeVar.i = i3;
                    djeVar.Y = 3;
                    objA = pieVar3.a(djeVar);
                    if (objA != obj3) {
                        kdy0Var4 = kdy0Var3;
                        obj2 = objA;
                        list = (List) obj2;
                        String str11 = aheVar3.a;
                        djeVar.a = d0rVar3;
                        djeVar.b = kdy0Var4;
                        djeVar.c = null;
                        djeVar.d = null;
                        djeVar.e = aheVar3;
                        djeVar.f = str4;
                        djeVar.g = list;
                        djeVar.h = i4;
                        djeVar.i = i3;
                        djeVar.Y = 4;
                        objG = g(ckeVar3, str11, list, djeVar);
                        if (objG != obj3) {
                            str5 = str4;
                            i5 = i4;
                            aheVar4 = aheVar3;
                            list2 = list;
                            obj2 = objG;
                            d0rVar4 = d0rVar3;
                            kdy0Var5 = kdy0Var4;
                            str6 = (String) obj2;
                            if (str6 == null) {
                                djeVar.a = d0rVar4;
                                djeVar.b = null;
                                djeVar.c = null;
                                djeVar.d = null;
                                djeVar.e = aheVar4;
                                djeVar.f = null;
                                djeVar.g = null;
                                djeVar.h = i5;
                                djeVar.i = i3;
                                djeVar.Y = 5;
                                if (kdy0Var5.p(djeVar) != obj3) {
                                    i6 = i3;
                                    i7 = i5;
                                    d0rVar5 = null;
                                    str7 = aheVar4.a;
                                    djeVar.a = d0rVar5;
                                    djeVar.b = d0rVar5;
                                    djeVar.c = d0rVar5;
                                    djeVar.d = d0rVar5;
                                    djeVar.e = d0rVar5;
                                    djeVar.f = d0rVar5;
                                    djeVar.g = d0rVar5;
                                    djeVar.h = i7;
                                    djeVar.i = i6;
                                    djeVar.Y = 8;
                                    d0rVar4.getClass();
                                    if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                    }
                                }
                            } else {
                                if (i3 != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                djeVar.a = d0rVar4;
                                d0rVar5 = null;
                                djeVar.b = null;
                                djeVar.c = null;
                                djeVar.d = null;
                                djeVar.e = aheVar4;
                                djeVar.f = str5;
                                djeVar.g = null;
                                djeVar.h = i5;
                                djeVar.i = i3;
                                djeVar.Y = 6;
                                if (kdy0Var5.m(str5, str6, list2, djeVar, z) != obj3) {
                                    djeVar.a = d0rVar4;
                                    djeVar.b = d0rVar5;
                                    djeVar.c = d0rVar5;
                                    djeVar.d = d0rVar5;
                                    djeVar.e = aheVar4;
                                    djeVar.f = d0rVar5;
                                    djeVar.g = d0rVar5;
                                    djeVar.h = i5;
                                    djeVar.i = i3;
                                    djeVar.Y = 7;
                                    if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                                        i6 = i3;
                                        i7 = i5;
                                        str7 = aheVar4.a;
                                        djeVar.a = d0rVar5;
                                        djeVar.b = d0rVar5;
                                        djeVar.c = d0rVar5;
                                        djeVar.d = d0rVar5;
                                        djeVar.e = d0rVar5;
                                        djeVar.f = d0rVar5;
                                        djeVar.g = d0rVar5;
                                        djeVar.h = i7;
                                        djeVar.i = i6;
                                        djeVar.Y = 8;
                                        d0rVar4.getClass();
                                        if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return obj3;
                }
                return rih1Var;
            case 3:
                i3 = djeVar.i;
                i4 = djeVar.h;
                str4 = djeVar.f;
                aheVar3 = djeVar.e;
                ckeVar3 = djeVar.d;
                kdy0Var4 = djeVar.b;
                d0rVar3 = djeVar.a;
                hm5.M(obj2);
                list = (List) obj2;
                String str12 = aheVar3.a;
                djeVar.a = d0rVar3;
                djeVar.b = kdy0Var4;
                djeVar.c = null;
                djeVar.d = null;
                djeVar.e = aheVar3;
                djeVar.f = str4;
                djeVar.g = list;
                djeVar.h = i4;
                djeVar.i = i3;
                djeVar.Y = 4;
                objG = g(ckeVar3, str12, list, djeVar);
                if (objG != obj3) {
                    str5 = str4;
                    i5 = i4;
                    aheVar4 = aheVar3;
                    list2 = list;
                    obj2 = objG;
                    d0rVar4 = d0rVar3;
                    kdy0Var5 = kdy0Var4;
                    str6 = (String) obj2;
                    if (str6 == null) {
                        djeVar.a = d0rVar4;
                        djeVar.b = null;
                        djeVar.c = null;
                        djeVar.d = null;
                        djeVar.e = aheVar4;
                        djeVar.f = null;
                        djeVar.g = null;
                        djeVar.h = i5;
                        djeVar.i = i3;
                        djeVar.Y = 5;
                        if (kdy0Var5.p(djeVar) != obj3) {
                            i6 = i3;
                            i7 = i5;
                            d0rVar5 = null;
                            str7 = aheVar4.a;
                            djeVar.a = d0rVar5;
                            djeVar.b = d0rVar5;
                            djeVar.c = d0rVar5;
                            djeVar.d = d0rVar5;
                            djeVar.e = d0rVar5;
                            djeVar.f = d0rVar5;
                            djeVar.g = d0rVar5;
                            djeVar.h = i7;
                            djeVar.i = i6;
                            djeVar.Y = 8;
                            d0rVar4.getClass();
                            if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                return rih1Var;
                            }
                        }
                    } else {
                        if (i3 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        djeVar.a = d0rVar4;
                        d0rVar5 = null;
                        djeVar.b = null;
                        djeVar.c = null;
                        djeVar.d = null;
                        djeVar.e = aheVar4;
                        djeVar.f = str5;
                        djeVar.g = null;
                        djeVar.h = i5;
                        djeVar.i = i3;
                        djeVar.Y = 6;
                        if (kdy0Var5.m(str5, str6, list2, djeVar, z) != obj3) {
                            djeVar.a = d0rVar4;
                            djeVar.b = d0rVar5;
                            djeVar.c = d0rVar5;
                            djeVar.d = d0rVar5;
                            djeVar.e = aheVar4;
                            djeVar.f = d0rVar5;
                            djeVar.g = d0rVar5;
                            djeVar.h = i5;
                            djeVar.i = i3;
                            djeVar.Y = 7;
                            if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                                i6 = i3;
                                i7 = i5;
                                str7 = aheVar4.a;
                                djeVar.a = d0rVar5;
                                djeVar.b = d0rVar5;
                                djeVar.c = d0rVar5;
                                djeVar.d = d0rVar5;
                                djeVar.e = d0rVar5;
                                djeVar.f = d0rVar5;
                                djeVar.g = d0rVar5;
                                djeVar.h = i7;
                                djeVar.i = i6;
                                djeVar.Y = 8;
                                d0rVar4.getClass();
                                if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                    return rih1Var;
                                }
                            }
                        }
                    }
                }
                return obj3;
            case 4:
                i3 = djeVar.i;
                i5 = djeVar.h;
                list2 = djeVar.g;
                str5 = djeVar.f;
                ahe aheVar6 = djeVar.e;
                kdy0Var5 = djeVar.b;
                d0r d0rVar8 = djeVar.a;
                hm5.M(obj2);
                d0rVar4 = d0rVar8;
                aheVar4 = aheVar6;
                str6 = (String) obj2;
                if (str6 == null) {
                    djeVar.a = d0rVar4;
                    djeVar.b = null;
                    djeVar.c = null;
                    djeVar.d = null;
                    djeVar.e = aheVar4;
                    djeVar.f = null;
                    djeVar.g = null;
                    djeVar.h = i5;
                    djeVar.i = i3;
                    djeVar.Y = 5;
                    if (kdy0Var5.p(djeVar) != obj3) {
                        i6 = i3;
                        i7 = i5;
                        d0rVar5 = null;
                        str7 = aheVar4.a;
                        djeVar.a = d0rVar5;
                        djeVar.b = d0rVar5;
                        djeVar.c = d0rVar5;
                        djeVar.d = d0rVar5;
                        djeVar.e = d0rVar5;
                        djeVar.f = d0rVar5;
                        djeVar.g = d0rVar5;
                        djeVar.h = i7;
                        djeVar.i = i6;
                        djeVar.Y = 8;
                        d0rVar4.getClass();
                        if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (i3 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    djeVar.a = d0rVar4;
                    d0rVar5 = null;
                    djeVar.b = null;
                    djeVar.c = null;
                    djeVar.d = null;
                    djeVar.e = aheVar4;
                    djeVar.f = str5;
                    djeVar.g = null;
                    djeVar.h = i5;
                    djeVar.i = i3;
                    djeVar.Y = 6;
                    if (kdy0Var5.m(str5, str6, list2, djeVar, z) != obj3) {
                        djeVar.a = d0rVar4;
                        djeVar.b = d0rVar5;
                        djeVar.c = d0rVar5;
                        djeVar.d = d0rVar5;
                        djeVar.e = aheVar4;
                        djeVar.f = d0rVar5;
                        djeVar.g = d0rVar5;
                        djeVar.h = i5;
                        djeVar.i = i3;
                        djeVar.Y = 7;
                        if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                            i6 = i3;
                            i7 = i5;
                            str7 = aheVar4.a;
                            djeVar.a = d0rVar5;
                            djeVar.b = d0rVar5;
                            djeVar.c = d0rVar5;
                            djeVar.d = d0rVar5;
                            djeVar.e = d0rVar5;
                            djeVar.f = d0rVar5;
                            djeVar.g = d0rVar5;
                            djeVar.h = i7;
                            djeVar.i = i6;
                            djeVar.Y = 8;
                            d0rVar4.getClass();
                            if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return obj3;
            case 5:
            case 7:
                i6 = djeVar.i;
                i7 = djeVar.h;
                List list3 = djeVar.g;
                aheVar4 = djeVar.e;
                d0rVar4 = djeVar.a;
                hm5.M(obj2);
                d0rVar5 = null;
                str7 = aheVar4.a;
                djeVar.a = d0rVar5;
                djeVar.b = d0rVar5;
                djeVar.c = d0rVar5;
                djeVar.d = d0rVar5;
                djeVar.e = d0rVar5;
                djeVar.f = d0rVar5;
                djeVar.g = d0rVar5;
                djeVar.h = i7;
                djeVar.i = i6;
                djeVar.Y = 8;
                d0rVar4.getClass();
                if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                    return obj3;
                }
                return rih1Var;
            case 6:
                i3 = djeVar.i;
                int i10 = djeVar.h;
                List list4 = djeVar.g;
                String str13 = djeVar.f;
                ahe aheVar7 = djeVar.e;
                d0r d0rVar9 = djeVar.a;
                hm5.M(obj2);
                i5 = i10;
                aheVar4 = aheVar7;
                str5 = str13;
                d0rVar4 = d0rVar9;
                d0rVar5 = null;
                djeVar.a = d0rVar4;
                djeVar.b = d0rVar5;
                djeVar.c = d0rVar5;
                djeVar.d = d0rVar5;
                djeVar.e = aheVar4;
                djeVar.f = d0rVar5;
                djeVar.g = d0rVar5;
                djeVar.h = i5;
                djeVar.i = i3;
                djeVar.Y = 7;
                if (a(this, d0rVar4, str5, aheVar4, djeVar) != obj3) {
                    i6 = i3;
                    i7 = i5;
                    str7 = aheVar4.a;
                    djeVar.a = d0rVar5;
                    djeVar.b = d0rVar5;
                    djeVar.c = d0rVar5;
                    djeVar.d = d0rVar5;
                    djeVar.e = d0rVar5;
                    djeVar.f = d0rVar5;
                    djeVar.g = d0rVar5;
                    djeVar.h = i7;
                    djeVar.i = i6;
                    djeVar.Y = 8;
                    d0rVar4.getClass();
                    if (d0r.d(d0rVar4, hjx0Var, str7, qzVar, djeVar) != obj3) {
                        return rih1Var;
                    }
                }
                return obj3;
            case 8:
                List list5 = djeVar.g;
                hm5.M(obj2);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x013d  */
    /* JADX WARN: Code duplicated, block: B:38:0x014a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0150  */
    /* JADX WARN: Code duplicated, block: B:41:0x0152  */
    /* JADX WARN: Code duplicated, block: B:45:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:55:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x021f  */
    /* JADX WARN: Code duplicated, block: B:69:0x024b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object d(d0r d0rVar, kdy0 kdy0Var, pie pieVar, cke ckeVar, String str, List list, vu30 vu30Var, onm onmVar) {
        gje gjeVar;
        d0r d0rVar2;
        pie pieVar2;
        cke ckeVar2;
        kdy0 kdy0Var2;
        String str2;
        List list2;
        Serializable serializableB;
        List list3;
        cke ckeVar3;
        pie pieVar3;
        d0r d0rVar3;
        String str3;
        mmr0 mmr0Var;
        int i;
        Object objA;
        mmr0 mmr0Var2;
        String str4;
        cke ckeVar4;
        int i2;
        kdy0 kdy0Var3;
        List list4;
        Object objG;
        List list5;
        kdy0 kdy0Var4;
        d0r d0rVar4;
        String str5;
        boolean z;
        String str6;
        String str7;
        d0r d0rVar5;
        int i3;
        mmr0 mmr0Var3;
        String str8;
        ahe aheVar;
        if (onmVar instanceof gje) {
            gjeVar = (gje) onmVar;
            int i4 = gjeVar.Y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                gjeVar.Y = i4 - Integer.MIN_VALUE;
            } else {
                gjeVar = new gje(this, onmVar);
            }
        } else {
            gjeVar = new gje(this, onmVar);
        }
        Object obj = gjeVar.t;
        int i5 = gjeVar.Y;
        rih1 rih1Var = rih1.a;
        Serializable serializable = d9n.a;
        switch (i5) {
            case 0:
                hm5.M(obj);
                if (!list.isEmpty()) {
                    List list6 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list6, 10));
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ahe) it.next()).a);
                    }
                    d0rVar2 = d0rVar;
                    gjeVar.a = d0rVar2;
                    gjeVar.b = kdy0Var;
                    pieVar2 = pieVar;
                    gjeVar.c = pieVar2;
                    ckeVar2 = ckeVar;
                    gjeVar.d = ckeVar2;
                    gjeVar.e = str;
                    gjeVar.f = list;
                    gjeVar.Y = 1;
                    if (vu30Var.invoke(arrayList, gjeVar) != serializable) {
                        kdy0Var2 = kdy0Var;
                        str2 = str;
                        list2 = list;
                        gjeVar.a = d0rVar2;
                        gjeVar.b = kdy0Var2;
                        gjeVar.c = pieVar2;
                        gjeVar.d = ckeVar2;
                        gjeVar.e = str2;
                        gjeVar.f = list2;
                        gjeVar.Y = 2;
                        serializableB = b(d0rVar2, str2, list2, gjeVar);
                        if (serializableB != serializable) {
                            pie pieVar4 = pieVar2;
                            list3 = list2;
                            ckeVar3 = ckeVar2;
                            pieVar3 = pieVar4;
                            d0rVar3 = d0rVar2;
                            str3 = str2;
                            obj = serializableB;
                            mmr0Var = (mmr0) obj;
                            if (mmr0Var != null) {
                                if (mmr0Var.b == cob1.b) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                gjeVar.a = d0rVar3;
                                gjeVar.b = kdy0Var2;
                                gjeVar.c = null;
                                gjeVar.d = ckeVar3;
                                gjeVar.e = str3;
                                gjeVar.f = list3;
                                gjeVar.g = mmr0Var;
                                gjeVar.i = i;
                                gjeVar.Y = 3;
                                objA = pieVar3.a(gjeVar);
                                if (objA != serializable) {
                                    String str9 = str3;
                                    mmr0Var2 = mmr0Var;
                                    obj = objA;
                                    str4 = str9;
                                    kdy0 kdy0Var5 = kdy0Var2;
                                    ckeVar4 = ckeVar3;
                                    i2 = i;
                                    kdy0Var3 = kdy0Var5;
                                    list4 = (List) obj;
                                    String str10 = ((ahe) o7h.A0(list3)).a;
                                    gjeVar.a = d0rVar3;
                                    gjeVar.b = kdy0Var3;
                                    gjeVar.c = null;
                                    gjeVar.d = null;
                                    gjeVar.e = str4;
                                    gjeVar.f = null;
                                    gjeVar.g = mmr0Var2;
                                    gjeVar.h = list4;
                                    gjeVar.i = i2;
                                    gjeVar.Y = 4;
                                    objG = g(ckeVar4, str10, list4, gjeVar);
                                    if (objG != serializable) {
                                        list5 = list4;
                                        obj = objG;
                                        kdy0Var4 = kdy0Var3;
                                        d0rVar4 = d0rVar3;
                                        str5 = (String) obj;
                                        if (str5 == null) {
                                            gjeVar.a = d0rVar4;
                                            gjeVar.b = null;
                                            gjeVar.c = null;
                                            gjeVar.d = null;
                                            gjeVar.e = null;
                                            gjeVar.f = null;
                                            gjeVar.g = mmr0Var2;
                                            gjeVar.h = null;
                                            gjeVar.i = i2;
                                            gjeVar.Y = 5;
                                            if (kdy0Var4.p(gjeVar) != serializable) {
                                                i3 = i2;
                                                mmr0Var3 = mmr0Var2;
                                                d0rVar5 = d0rVar4;
                                                str8 = ((ahe) mmr0Var3.a).a;
                                                gjeVar.a = null;
                                                gjeVar.b = null;
                                                gjeVar.c = null;
                                                gjeVar.d = null;
                                                gjeVar.e = null;
                                                gjeVar.f = null;
                                                gjeVar.g = null;
                                                gjeVar.h = null;
                                                gjeVar.i = i3;
                                                gjeVar.Y = 8;
                                                d0rVar5.getClass();
                                                if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                                }
                                            }
                                        } else {
                                            z = i2 != 0;
                                            gjeVar.a = d0rVar4;
                                            gjeVar.b = null;
                                            gjeVar.c = null;
                                            gjeVar.d = null;
                                            gjeVar.e = str4;
                                            gjeVar.f = null;
                                            gjeVar.g = mmr0Var2;
                                            gjeVar.h = null;
                                            gjeVar.i = i2;
                                            gjeVar.Y = 6;
                                            str6 = str4;
                                            str7 = str6;
                                            if (kdy0Var4.m(str6, str5, list5, gjeVar, z) != serializable) {
                                                d0rVar5 = d0rVar4;
                                                aheVar = (ahe) mmr0Var2.a;
                                                gjeVar.a = d0rVar5;
                                                gjeVar.b = null;
                                                gjeVar.c = null;
                                                gjeVar.d = null;
                                                gjeVar.e = null;
                                                gjeVar.f = null;
                                                gjeVar.g = mmr0Var2;
                                                gjeVar.h = null;
                                                gjeVar.i = i2;
                                                gjeVar.Y = 7;
                                                if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                                                    i3 = i2;
                                                    mmr0Var3 = mmr0Var2;
                                                    str8 = ((ahe) mmr0Var3.a).a;
                                                    gjeVar.a = null;
                                                    gjeVar.b = null;
                                                    gjeVar.c = null;
                                                    gjeVar.d = null;
                                                    gjeVar.e = null;
                                                    gjeVar.f = null;
                                                    gjeVar.g = null;
                                                    gjeVar.h = null;
                                                    gjeVar.i = i3;
                                                    gjeVar.Y = 8;
                                                    d0rVar5.getClass();
                                                    if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return serializable;
                }
                return rih1Var;
            case 1:
                list2 = gjeVar.f;
                String str11 = gjeVar.e;
                cke ckeVar5 = gjeVar.d;
                pie pieVar5 = gjeVar.c;
                kdy0Var2 = gjeVar.b;
                d0r d0rVar6 = gjeVar.a;
                hm5.M(obj);
                ckeVar2 = ckeVar5;
                pieVar2 = pieVar5;
                str2 = str11;
                d0rVar2 = d0rVar6;
                gjeVar.a = d0rVar2;
                gjeVar.b = kdy0Var2;
                gjeVar.c = pieVar2;
                gjeVar.d = ckeVar2;
                gjeVar.e = str2;
                gjeVar.f = list2;
                gjeVar.Y = 2;
                serializableB = b(d0rVar2, str2, list2, gjeVar);
                if (serializableB != serializable) {
                    pie pieVar6 = pieVar2;
                    list3 = list2;
                    ckeVar3 = ckeVar2;
                    pieVar3 = pieVar6;
                    d0rVar3 = d0rVar2;
                    str3 = str2;
                    obj = serializableB;
                    mmr0Var = (mmr0) obj;
                    if (mmr0Var != null) {
                        if (mmr0Var.b == cob1.b) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        gjeVar.a = d0rVar3;
                        gjeVar.b = kdy0Var2;
                        gjeVar.c = null;
                        gjeVar.d = ckeVar3;
                        gjeVar.e = str3;
                        gjeVar.f = list3;
                        gjeVar.g = mmr0Var;
                        gjeVar.i = i;
                        gjeVar.Y = 3;
                        objA = pieVar3.a(gjeVar);
                        if (objA != serializable) {
                            String str12 = str3;
                            mmr0Var2 = mmr0Var;
                            obj = objA;
                            str4 = str12;
                            kdy0 kdy0Var6 = kdy0Var2;
                            ckeVar4 = ckeVar3;
                            i2 = i;
                            kdy0Var3 = kdy0Var6;
                            list4 = (List) obj;
                            String str13 = ((ahe) o7h.A0(list3)).a;
                            gjeVar.a = d0rVar3;
                            gjeVar.b = kdy0Var3;
                            gjeVar.c = null;
                            gjeVar.d = null;
                            gjeVar.e = str4;
                            gjeVar.f = null;
                            gjeVar.g = mmr0Var2;
                            gjeVar.h = list4;
                            gjeVar.i = i2;
                            gjeVar.Y = 4;
                            objG = g(ckeVar4, str13, list4, gjeVar);
                            if (objG != serializable) {
                                list5 = list4;
                                obj = objG;
                                kdy0Var4 = kdy0Var3;
                                d0rVar4 = d0rVar3;
                                str5 = (String) obj;
                                if (str5 == null) {
                                    gjeVar.a = d0rVar4;
                                    gjeVar.b = null;
                                    gjeVar.c = null;
                                    gjeVar.d = null;
                                    gjeVar.e = null;
                                    gjeVar.f = null;
                                    gjeVar.g = mmr0Var2;
                                    gjeVar.h = null;
                                    gjeVar.i = i2;
                                    gjeVar.Y = 5;
                                    if (kdy0Var4.p(gjeVar) != serializable) {
                                        i3 = i2;
                                        mmr0Var3 = mmr0Var2;
                                        d0rVar5 = d0rVar4;
                                        str8 = ((ahe) mmr0Var3.a).a;
                                        gjeVar.a = null;
                                        gjeVar.b = null;
                                        gjeVar.c = null;
                                        gjeVar.d = null;
                                        gjeVar.e = null;
                                        gjeVar.f = null;
                                        gjeVar.g = null;
                                        gjeVar.h = null;
                                        gjeVar.i = i3;
                                        gjeVar.Y = 8;
                                        d0rVar5.getClass();
                                        if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                        }
                                    }
                                } else {
                                    if (i2 != 0) {
                                    }
                                    gjeVar.a = d0rVar4;
                                    gjeVar.b = null;
                                    gjeVar.c = null;
                                    gjeVar.d = null;
                                    gjeVar.e = str4;
                                    gjeVar.f = null;
                                    gjeVar.g = mmr0Var2;
                                    gjeVar.h = null;
                                    gjeVar.i = i2;
                                    gjeVar.Y = 6;
                                    str6 = str4;
                                    str7 = str6;
                                    if (kdy0Var4.m(str6, str5, list5, gjeVar, z) != serializable) {
                                        d0rVar5 = d0rVar4;
                                        aheVar = (ahe) mmr0Var2.a;
                                        gjeVar.a = d0rVar5;
                                        gjeVar.b = null;
                                        gjeVar.c = null;
                                        gjeVar.d = null;
                                        gjeVar.e = null;
                                        gjeVar.f = null;
                                        gjeVar.g = mmr0Var2;
                                        gjeVar.h = null;
                                        gjeVar.i = i2;
                                        gjeVar.Y = 7;
                                        if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                                            i3 = i2;
                                            mmr0Var3 = mmr0Var2;
                                            str8 = ((ahe) mmr0Var3.a).a;
                                            gjeVar.a = null;
                                            gjeVar.b = null;
                                            gjeVar.c = null;
                                            gjeVar.d = null;
                                            gjeVar.e = null;
                                            gjeVar.f = null;
                                            gjeVar.g = null;
                                            gjeVar.h = null;
                                            gjeVar.i = i3;
                                            gjeVar.Y = 8;
                                            d0rVar5.getClass();
                                            if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return rih1Var;
                }
                return serializable;
            case 2:
                List list7 = gjeVar.f;
                str3 = gjeVar.e;
                cke ckeVar6 = gjeVar.d;
                pieVar3 = gjeVar.c;
                kdy0Var2 = gjeVar.b;
                d0r d0rVar7 = gjeVar.a;
                hm5.M(obj);
                list3 = list7;
                ckeVar3 = ckeVar6;
                d0rVar3 = d0rVar7;
                mmr0Var = (mmr0) obj;
                if (mmr0Var != null) {
                    if (mmr0Var.b == cob1.b) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    gjeVar.a = d0rVar3;
                    gjeVar.b = kdy0Var2;
                    gjeVar.c = null;
                    gjeVar.d = ckeVar3;
                    gjeVar.e = str3;
                    gjeVar.f = list3;
                    gjeVar.g = mmr0Var;
                    gjeVar.i = i;
                    gjeVar.Y = 3;
                    objA = pieVar3.a(gjeVar);
                    if (objA != serializable) {
                        String str14 = str3;
                        mmr0Var2 = mmr0Var;
                        obj = objA;
                        str4 = str14;
                        kdy0 kdy0Var7 = kdy0Var2;
                        ckeVar4 = ckeVar3;
                        i2 = i;
                        kdy0Var3 = kdy0Var7;
                        list4 = (List) obj;
                        String str15 = ((ahe) o7h.A0(list3)).a;
                        gjeVar.a = d0rVar3;
                        gjeVar.b = kdy0Var3;
                        gjeVar.c = null;
                        gjeVar.d = null;
                        gjeVar.e = str4;
                        gjeVar.f = null;
                        gjeVar.g = mmr0Var2;
                        gjeVar.h = list4;
                        gjeVar.i = i2;
                        gjeVar.Y = 4;
                        objG = g(ckeVar4, str15, list4, gjeVar);
                        if (objG != serializable) {
                            list5 = list4;
                            obj = objG;
                            kdy0Var4 = kdy0Var3;
                            d0rVar4 = d0rVar3;
                            str5 = (String) obj;
                            if (str5 == null) {
                                gjeVar.a = d0rVar4;
                                gjeVar.b = null;
                                gjeVar.c = null;
                                gjeVar.d = null;
                                gjeVar.e = null;
                                gjeVar.f = null;
                                gjeVar.g = mmr0Var2;
                                gjeVar.h = null;
                                gjeVar.i = i2;
                                gjeVar.Y = 5;
                                if (kdy0Var4.p(gjeVar) != serializable) {
                                    i3 = i2;
                                    mmr0Var3 = mmr0Var2;
                                    d0rVar5 = d0rVar4;
                                    str8 = ((ahe) mmr0Var3.a).a;
                                    gjeVar.a = null;
                                    gjeVar.b = null;
                                    gjeVar.c = null;
                                    gjeVar.d = null;
                                    gjeVar.e = null;
                                    gjeVar.f = null;
                                    gjeVar.g = null;
                                    gjeVar.h = null;
                                    gjeVar.i = i3;
                                    gjeVar.Y = 8;
                                    d0rVar5.getClass();
                                    if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                    }
                                }
                            } else {
                                if (i2 != 0) {
                                }
                                gjeVar.a = d0rVar4;
                                gjeVar.b = null;
                                gjeVar.c = null;
                                gjeVar.d = null;
                                gjeVar.e = str4;
                                gjeVar.f = null;
                                gjeVar.g = mmr0Var2;
                                gjeVar.h = null;
                                gjeVar.i = i2;
                                gjeVar.Y = 6;
                                str6 = str4;
                                str7 = str6;
                                if (kdy0Var4.m(str6, str5, list5, gjeVar, z) != serializable) {
                                    d0rVar5 = d0rVar4;
                                    aheVar = (ahe) mmr0Var2.a;
                                    gjeVar.a = d0rVar5;
                                    gjeVar.b = null;
                                    gjeVar.c = null;
                                    gjeVar.d = null;
                                    gjeVar.e = null;
                                    gjeVar.f = null;
                                    gjeVar.g = mmr0Var2;
                                    gjeVar.h = null;
                                    gjeVar.i = i2;
                                    gjeVar.Y = 7;
                                    if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                                        i3 = i2;
                                        mmr0Var3 = mmr0Var2;
                                        str8 = ((ahe) mmr0Var3.a).a;
                                        gjeVar.a = null;
                                        gjeVar.b = null;
                                        gjeVar.c = null;
                                        gjeVar.d = null;
                                        gjeVar.e = null;
                                        gjeVar.f = null;
                                        gjeVar.g = null;
                                        gjeVar.h = null;
                                        gjeVar.i = i3;
                                        gjeVar.Y = 8;
                                        d0rVar5.getClass();
                                        if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return serializable;
                }
                return rih1Var;
            case 3:
                i2 = gjeVar.i;
                mmr0Var2 = gjeVar.g;
                list3 = gjeVar.f;
                str4 = gjeVar.e;
                ckeVar4 = gjeVar.d;
                kdy0Var3 = gjeVar.b;
                d0rVar3 = gjeVar.a;
                hm5.M(obj);
                list4 = (List) obj;
                String str16 = ((ahe) o7h.A0(list3)).a;
                gjeVar.a = d0rVar3;
                gjeVar.b = kdy0Var3;
                gjeVar.c = null;
                gjeVar.d = null;
                gjeVar.e = str4;
                gjeVar.f = null;
                gjeVar.g = mmr0Var2;
                gjeVar.h = list4;
                gjeVar.i = i2;
                gjeVar.Y = 4;
                objG = g(ckeVar4, str16, list4, gjeVar);
                if (objG != serializable) {
                    list5 = list4;
                    obj = objG;
                    kdy0Var4 = kdy0Var3;
                    d0rVar4 = d0rVar3;
                    str5 = (String) obj;
                    if (str5 == null) {
                        gjeVar.a = d0rVar4;
                        gjeVar.b = null;
                        gjeVar.c = null;
                        gjeVar.d = null;
                        gjeVar.e = null;
                        gjeVar.f = null;
                        gjeVar.g = mmr0Var2;
                        gjeVar.h = null;
                        gjeVar.i = i2;
                        gjeVar.Y = 5;
                        if (kdy0Var4.p(gjeVar) != serializable) {
                            i3 = i2;
                            mmr0Var3 = mmr0Var2;
                            d0rVar5 = d0rVar4;
                            str8 = ((ahe) mmr0Var3.a).a;
                            gjeVar.a = null;
                            gjeVar.b = null;
                            gjeVar.c = null;
                            gjeVar.d = null;
                            gjeVar.e = null;
                            gjeVar.f = null;
                            gjeVar.g = null;
                            gjeVar.h = null;
                            gjeVar.i = i3;
                            gjeVar.Y = 8;
                            d0rVar5.getClass();
                            if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                return rih1Var;
                            }
                        }
                    } else {
                        if (i2 != 0) {
                        }
                        gjeVar.a = d0rVar4;
                        gjeVar.b = null;
                        gjeVar.c = null;
                        gjeVar.d = null;
                        gjeVar.e = str4;
                        gjeVar.f = null;
                        gjeVar.g = mmr0Var2;
                        gjeVar.h = null;
                        gjeVar.i = i2;
                        gjeVar.Y = 6;
                        str6 = str4;
                        str7 = str6;
                        if (kdy0Var4.m(str6, str5, list5, gjeVar, z) != serializable) {
                            d0rVar5 = d0rVar4;
                            aheVar = (ahe) mmr0Var2.a;
                            gjeVar.a = d0rVar5;
                            gjeVar.b = null;
                            gjeVar.c = null;
                            gjeVar.d = null;
                            gjeVar.e = null;
                            gjeVar.f = null;
                            gjeVar.g = mmr0Var2;
                            gjeVar.h = null;
                            gjeVar.i = i2;
                            gjeVar.Y = 7;
                            if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                                i3 = i2;
                                mmr0Var3 = mmr0Var2;
                                str8 = ((ahe) mmr0Var3.a).a;
                                gjeVar.a = null;
                                gjeVar.b = null;
                                gjeVar.c = null;
                                gjeVar.d = null;
                                gjeVar.e = null;
                                gjeVar.f = null;
                                gjeVar.g = null;
                                gjeVar.h = null;
                                gjeVar.i = i3;
                                gjeVar.Y = 8;
                                d0rVar5.getClass();
                                if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                    return rih1Var;
                                }
                            }
                        }
                    }
                }
                return serializable;
            case 4:
                i2 = gjeVar.i;
                List list8 = gjeVar.h;
                mmr0 mmr0Var4 = gjeVar.g;
                List list9 = gjeVar.f;
                str4 = gjeVar.e;
                kdy0Var4 = gjeVar.b;
                d0rVar4 = gjeVar.a;
                hm5.M(obj);
                list5 = list8;
                mmr0Var2 = mmr0Var4;
                str5 = (String) obj;
                if (str5 == null) {
                    gjeVar.a = d0rVar4;
                    gjeVar.b = null;
                    gjeVar.c = null;
                    gjeVar.d = null;
                    gjeVar.e = null;
                    gjeVar.f = null;
                    gjeVar.g = mmr0Var2;
                    gjeVar.h = null;
                    gjeVar.i = i2;
                    gjeVar.Y = 5;
                    if (kdy0Var4.p(gjeVar) != serializable) {
                        i3 = i2;
                        mmr0Var3 = mmr0Var2;
                        d0rVar5 = d0rVar4;
                        str8 = ((ahe) mmr0Var3.a).a;
                        gjeVar.a = null;
                        gjeVar.b = null;
                        gjeVar.c = null;
                        gjeVar.d = null;
                        gjeVar.e = null;
                        gjeVar.f = null;
                        gjeVar.g = null;
                        gjeVar.h = null;
                        gjeVar.i = i3;
                        gjeVar.Y = 8;
                        d0rVar5.getClass();
                        if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (i2 != 0) {
                    }
                    gjeVar.a = d0rVar4;
                    gjeVar.b = null;
                    gjeVar.c = null;
                    gjeVar.d = null;
                    gjeVar.e = str4;
                    gjeVar.f = null;
                    gjeVar.g = mmr0Var2;
                    gjeVar.h = null;
                    gjeVar.i = i2;
                    gjeVar.Y = 6;
                    str6 = str4;
                    str7 = str6;
                    if (kdy0Var4.m(str6, str5, list5, gjeVar, z) != serializable) {
                        d0rVar5 = d0rVar4;
                        aheVar = (ahe) mmr0Var2.a;
                        gjeVar.a = d0rVar5;
                        gjeVar.b = null;
                        gjeVar.c = null;
                        gjeVar.d = null;
                        gjeVar.e = null;
                        gjeVar.f = null;
                        gjeVar.g = mmr0Var2;
                        gjeVar.h = null;
                        gjeVar.i = i2;
                        gjeVar.Y = 7;
                        if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                            i3 = i2;
                            mmr0Var3 = mmr0Var2;
                            str8 = ((ahe) mmr0Var3.a).a;
                            gjeVar.a = null;
                            gjeVar.b = null;
                            gjeVar.c = null;
                            gjeVar.d = null;
                            gjeVar.e = null;
                            gjeVar.f = null;
                            gjeVar.g = null;
                            gjeVar.h = null;
                            gjeVar.i = i3;
                            gjeVar.Y = 8;
                            d0rVar5.getClass();
                            if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                                return rih1Var;
                            }
                        }
                    }
                }
                return serializable;
            case 5:
            case 7:
                i3 = gjeVar.i;
                List list10 = gjeVar.h;
                mmr0Var3 = gjeVar.g;
                List list11 = gjeVar.f;
                d0rVar5 = gjeVar.a;
                hm5.M(obj);
                str8 = ((ahe) mmr0Var3.a).a;
                gjeVar.a = null;
                gjeVar.b = null;
                gjeVar.c = null;
                gjeVar.d = null;
                gjeVar.e = null;
                gjeVar.f = null;
                gjeVar.g = null;
                gjeVar.h = null;
                gjeVar.i = i3;
                gjeVar.Y = 8;
                d0rVar5.getClass();
                if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                    return serializable;
                }
                return rih1Var;
            case 6:
                i2 = gjeVar.i;
                List list12 = gjeVar.h;
                mmr0 mmr0Var5 = gjeVar.g;
                List list13 = gjeVar.f;
                str7 = gjeVar.e;
                d0r d0rVar8 = gjeVar.a;
                hm5.M(obj);
                mmr0Var2 = mmr0Var5;
                d0rVar5 = d0rVar8;
                aheVar = (ahe) mmr0Var2.a;
                gjeVar.a = d0rVar5;
                gjeVar.b = null;
                gjeVar.c = null;
                gjeVar.d = null;
                gjeVar.e = null;
                gjeVar.f = null;
                gjeVar.g = mmr0Var2;
                gjeVar.h = null;
                gjeVar.i = i2;
                gjeVar.Y = 7;
                if (a(this, d0rVar5, str7, aheVar, gjeVar) != serializable) {
                    i3 = i2;
                    mmr0Var3 = mmr0Var2;
                    str8 = ((ahe) mmr0Var3.a).a;
                    gjeVar.a = null;
                    gjeVar.b = null;
                    gjeVar.c = null;
                    gjeVar.d = null;
                    gjeVar.e = null;
                    gjeVar.f = null;
                    gjeVar.g = null;
                    gjeVar.h = null;
                    gjeVar.i = i3;
                    gjeVar.Y = 8;
                    d0rVar5.getClass();
                    if (d0r.d(d0rVar5, hjx0.a, str8, qz.a, gjeVar) != serializable) {
                        return rih1Var;
                    }
                }
                return serializable;
            case 8:
                List list14 = gjeVar.h;
                List list15 = gjeVar.f;
                hm5.M(obj);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(d0r d0rVar, kdy0 kdy0Var, ahe aheVar, String str, onm onmVar) {
        hje hjeVar;
        d9n d9nVar;
        d0r d0rVar2;
        ahe aheVar2;
        kdy0 kdy0Var2;
        Object objP;
        kdy0 kdy0Var3;
        int i;
        ahe aheVar3;
        d0r d0rVar3;
        if (onmVar instanceof hje) {
            hjeVar = (hje) onmVar;
            int i2 = hjeVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hjeVar.g = i2 - Integer.MIN_VALUE;
            } else {
                hjeVar = new hje(this, onmVar);
            }
        } else {
            hjeVar = new hje(this, onmVar);
        }
        Object obj = hjeVar.e;
        int i3 = hjeVar.g;
        rih1 rih1Var = rih1.a;
        rz rzVar = rz.a;
        hjx0 hjx0Var = hjx0.a;
        d9n d9nVar2 = d9n.a;
        if (i3 == 0) {
            hm5.M(obj);
            d9nVar = d9nVar2;
            d0rVar2 = d0rVar;
            aheVar2 = aheVar;
            zie zieVar = new zie(d0rVar2, str, aheVar2, null, (byte) 3);
            hjeVar.a = d0rVar2;
            kdy0Var2 = kdy0Var;
            hjeVar.b = kdy0Var2;
            hjeVar.c = aheVar2;
            hjeVar.g = 1;
            objP = rc2.P(c, zieVar, hjeVar);
            if (objP != d9nVar) {
            }
        }
        if (i3 == 1) {
            ahe aheVar4 = hjeVar.c;
            kdy0 kdy0Var4 = hjeVar.b;
            d0r d0rVar4 = hjeVar.a;
            hm5.M(obj);
            objP = obj;
            aheVar2 = aheVar4;
            d9nVar = d9nVar2;
            kdy0Var2 = kdy0Var4;
            d0rVar2 = d0rVar4;
        } else {
            if (i3 == 2) {
                i = hjeVar.d;
                ahe aheVar5 = hjeVar.c;
                kdy0Var3 = hjeVar.b;
                d0rVar2 = hjeVar.a;
                hm5.M(obj);
                aheVar3 = aheVar5;
                d9nVar = d9nVar2;
                d0rVar3 = d0rVar2;
                if (i != 0) {
                    hjeVar.a = d0rVar3;
                    hjeVar.b = null;
                    hjeVar.c = aheVar3;
                    hjeVar.d = i;
                    hjeVar.g = 3;
                    if (kdy0Var3.p(hjeVar) != d9nVar) {
                    }
                }
            }
            if (i3 != 3) {
                if (i3 == 4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = hjeVar.d;
            aheVar3 = hjeVar.c;
            d0rVar3 = hjeVar.a;
            hm5.M(obj);
            d9nVar = d9nVar2;
        }
        String str2 = aheVar3.a;
        hjeVar.a = null;
        hjeVar.b = null;
        hjeVar.c = null;
        hjeVar.d = i;
        hjeVar.g = 4;
        d0rVar3.getClass();
        return d0r.d(d0rVar3, hjx0Var, str2, rzVar, hjeVar) == d9nVar ? d9nVar : rih1Var;
        cob1 cob1Var = (cob1) objP;
        cob1 cob1Var2 = cob1.a;
        if (cob1Var == null) {
            cob1Var = cob1Var2;
        }
        int i4 = cob1Var == cob1Var2 ? 0 : 1;
        String str3 = aheVar2.a;
        hjeVar.a = d0rVar2;
        hjeVar.b = kdy0Var2;
        hjeVar.c = aheVar2;
        hjeVar.d = i4;
        hjeVar.g = 2;
        d0rVar2.getClass();
        if (d0r.d(d0rVar2, hjx0Var, str3, rzVar, hjeVar) != d9nVar) {
            int i5 = i4;
            kdy0Var3 = kdy0Var2;
            i = i5;
            aheVar3 = aheVar2;
            d0rVar3 = d0rVar2;
            if (i != 0) {
                hjeVar.a = d0rVar3;
                hjeVar.b = null;
                hjeVar.c = aheVar3;
                hjeVar.d = i;
                hjeVar.g = 3;
                if (kdy0Var3.p(hjeVar) != d9nVar) {
                    String str4 = aheVar3.a;
                    hjeVar.a = null;
                    hjeVar.b = null;
                    hjeVar.c = null;
                    hjeVar.d = i;
                    hjeVar.g = 4;
                    d0rVar3.getClass();
                    if (d0r.d(d0rVar3, hjx0Var, str4, rzVar, hjeVar) == d9nVar) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(d0r d0rVar, kdy0 kdy0Var, String str, List list, onm onmVar) {
        kje kjeVar;
        kdy0 kdy0Var2;
        d0r d0rVar2;
        List list2;
        kdy0 kdy0Var3;
        mmr0 mmr0Var;
        mmr0 mmr0Var2;
        String str2 = str;
        if (onmVar instanceof kje) {
            kjeVar = (kje) onmVar;
            int i = kjeVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                kjeVar.h = i - Integer.MIN_VALUE;
            } else {
                kjeVar = new kje(this, onmVar);
            }
        } else {
            kjeVar = new kje(this, onmVar);
        }
        Object objB = kjeVar.f;
        int i2 = kjeVar.h;
        hjx0 hjx0Var = hjx0.a;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            if (!list.isEmpty()) {
                List list3 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ahe) it.next()).a);
                }
                tz tzVar = new tz(arrayList);
                kjeVar.a = d0rVar;
                kdy0Var2 = kdy0Var;
                kjeVar.b = kdy0Var2;
                kjeVar.c = str2;
                kjeVar.d = list;
                kjeVar.h = 1;
                d0rVar.getClass();
                if (d0r.d(d0rVar, hjx0Var, str2, tzVar, kjeVar) != obj) {
                    d0rVar2 = d0rVar;
                    list2 = list;
                }
            }
        }
        if (i2 == 1) {
            List list4 = kjeVar.d;
            str2 = kjeVar.c;
            kdy0Var2 = kjeVar.b;
            d0r d0rVar3 = kjeVar.a;
            hm5.M(objB);
            list2 = list4;
            d0rVar2 = d0rVar3;
        } else {
            if (i2 == 2) {
                List list5 = kjeVar.d;
                kdy0Var3 = kjeVar.b;
                d0rVar2 = kjeVar.a;
                hm5.M(objB);
                mmr0Var = (mmr0) objB;
                if (mmr0Var != null) {
                    kjeVar.a = d0rVar2;
                    kjeVar.b = null;
                    kjeVar.c = null;
                    kjeVar.d = null;
                    kjeVar.e = mmr0Var;
                    kjeVar.h = 3;
                    if (kdy0Var3.p(kjeVar) != obj) {
                        mmr0Var2 = mmr0Var;
                    }
                }
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list6 = kjeVar.d;
                hm5.M(objB);
                return rih1Var;
            }
            mmr0Var2 = kjeVar.e;
            List list7 = kjeVar.d;
            d0rVar2 = kjeVar.a;
            hm5.M(objB);
        }
        String str3 = ((ahe) mmr0Var2.a).a;
        kjeVar.a = null;
        kjeVar.b = null;
        kjeVar.c = null;
        kjeVar.d = null;
        kjeVar.e = null;
        kjeVar.h = 4;
        d0rVar2.getClass();
        return d0r.d(d0rVar2, hjx0Var, str3, rz.a, kjeVar) == obj ? obj : rih1Var;
        kjeVar.a = d0rVar2;
        kjeVar.b = kdy0Var2;
        kjeVar.c = null;
        kjeVar.d = null;
        kjeVar.h = 2;
        objB = b(d0rVar2, str2, list2, kjeVar);
        if (objB != obj) {
            kdy0Var3 = kdy0Var2;
            mmr0Var = (mmr0) objB;
            if (mmr0Var != null) {
                kjeVar.a = d0rVar2;
                kjeVar.b = null;
                kjeVar.c = null;
                kjeVar.d = null;
                kjeVar.e = mmr0Var;
                kjeVar.h = 3;
                if (kdy0Var3.p(kjeVar) != obj) {
                    mmr0Var2 = mmr0Var;
                    String str4 = ((ahe) mmr0Var2.a).a;
                    kjeVar.a = null;
                    kjeVar.b = null;
                    kjeVar.c = null;
                    kjeVar.d = null;
                    kjeVar.e = null;
                    kjeVar.h = 4;
                    d0rVar2.getClass();
                    if (d0r.d(d0rVar2, hjx0Var, str4, rz.a, kjeVar) == obj) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007c -> B:27:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(p.cke r7, java.lang.String r8, java.util.List r9, p.onm r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof p.lje
            if (r0 == 0) goto L13
            r0 = r10
            p.lje r0 = (p.lje) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.lje r0 = new p.lje
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r6 = r0.e
            int r10 = r0.g
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L34
            if (r10 != r1) goto L2e
            int r7 = r0.d
            java.lang.String r8 = r0.c
            java.util.Iterator r9 = r0.b
            p.cke r10 = r0.a
            p.hm5.M(r6)
            goto L80
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L34:
            p.hm5.M(r6)
            int r6 = r9.indexOf(r8)
            if (r6 >= 0) goto L3e
            goto L8c
        L3e:
            int r8 = r6 + 1
            int r10 = r9.size()
            java.util.List r8 = r9.subList(r8, r10)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L4f
            goto L8c
        L4f:
            java.util.Iterator r8 = r8.iterator()
            r9 = r8
        L54:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r9.next()
            java.lang.String r8 = (java.lang.String) r8
            p.hsc r10 = new p.hsc
            r3 = 10
            r10.<init>(r7, r8, r2, r3)
            r0.a = r7
            r0.b = r9
            r0.c = r8
            r0.d = r6
            r0.g = r1
            long r3 = p.mje.b
            java.lang.Object r10 = p.rc2.P(r3, r10, r0)
            p.d9n r3 = p.d9n.a
            if (r10 != r3) goto L7c
            return r3
        L7c:
            r5 = r7
            r7 = r6
            r6 = r10
            r10 = r5
        L80:
            p.iix0 r6 = (p.iix0) r6
            boolean r6 = p.smo1.v(r6)
            if (r6 != 0) goto L89
            return r8
        L89:
            r6 = r7
            r7 = r10
            goto L54
        L8c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mje.g(p.cke, java.lang.String, java.util.List, p.onm):java.lang.Object");
    }
}
