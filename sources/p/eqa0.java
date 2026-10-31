package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eqa0 implements t6y {
    public static final Map c = sqg0.J(new mmr0[]{new mmr0(msg.a, k7y.b), new mmr0(msg.b, i7y.b)});
    public final kly0 a;
    public final w6y b;

    public eqa0(caq caqVar, w6y w6yVar) {
        this.a = caqVar;
        this.b = w6yVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1 A[PHI: r5 r12 r13
      0x00b1: PHI (r5v3 int) = (r5v1 int), (r5v4 int) binds: [B:32:0x0082, B:40:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r12v3 byte) = (r12v1 byte), (r12v4 byte) binds: [B:32:0x0082, B:40:0x00b0] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r13v6 p.av40) = (r13v4 p.av40), (r13v7 p.av40) binds: [B:32:0x0082, B:40:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public final Object a(msg msgVar, int i, s6y s6yVar, lnm lnmVar) {
        cqa0 cqa0Var;
        j7y j7yVar;
        av40 av40Var;
        byte b;
        Object objH;
        int i2;
        ?? r12;
        if (lnmVar instanceof cqa0) {
            cqa0Var = (cqa0) lnmVar;
            int i3 = cqa0Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cqa0Var.g = i3 - Integer.MIN_VALUE;
            } else {
                cqa0Var = new cqa0(this, lnmVar);
            }
        } else {
            cqa0Var = new cqa0(this, lnmVar);
        }
        Object obj = cqa0Var.e;
        int i4 = cqa0Var.g;
        Object obj2 = rih1.a;
        int i5 = 1;
        Object obj3 = d9n.a;
        if (i4 != 0) {
            if (i4 == 1) {
                byte b2 = cqa0Var.c;
                j7yVar = cqa0Var.b;
                av40Var = cqa0Var.a;
                hm5.M(obj);
                r12 = b2;
            } else {
                if (i4 != 2) {
                    if (i4 == 3) {
                        hm5.M(obj);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = cqa0Var.d;
                byte b3 = cqa0Var.c;
                av40Var = cqa0Var.a;
                hm5.M(obj);
                b = b3;
            }
            i5 = i2;
            b = i;
            b = r12;
            av40Var.getClass();
            cqa0Var.a = null;
            cqa0Var.b = null;
            cqa0Var.c = b;
            cqa0Var.d = i5;
            cqa0Var.g = 3;
            if (b(av40Var, cqa0Var) == obj3) {
                return obj3;
            }
            return obj2;
        }
        hm5.M(obj);
        av40 av40Var2 = (av40) this.a.get();
        j7yVar = (j7y) c.get(msgVar);
        if (j7yVar == null) {
            hhg1.n("Unsupported cluster type");
            return null;
        }
        if (s6yVar == s6y.b) {
            cqa0Var.a = av40Var2;
            cqa0Var.b = j7yVar;
            cqa0Var.c = i;
            cqa0Var.g = 1;
            Object objB = av40Var2.b(j7yVar, cqa0Var);
            if (objB != obj3) {
                obj = objB;
                av40Var = av40Var2;
                r12 = i;
            }
        } else {
            av40Var = av40Var2;
            if (i5 != 0) {
                b = i;
                Integer num = new Integer(b);
                cqa0Var.a = av40Var;
                cqa0Var.b = null;
                cqa0Var.c = b;
                cqa0Var.d = i5;
                cqa0Var.g = 2;
                av40Var.getClass();
                j7yVar.getClass();
                objH = jm5.h(av40Var.a(), new piu(j7yVar, num, (lnm) null, (byte) 22), cqa0Var);
                if (objH != obj3) {
                    b = r12;
                    objH = obj2;
                }
                if (objH != obj3) {
                    i2 = i5;
                    b = b;
                    i5 = i2;
                    b = i;
                    b = r12;
                    av40Var.getClass();
                    cqa0Var.a = null;
                    cqa0Var.b = null;
                    cqa0Var.c = b;
                    cqa0Var.d = i5;
                    cqa0Var.g = 3;
                    if (b(av40Var, cqa0Var) == obj3) {
                        return obj2;
                    }
                }
            } else {
                b = i;
                b = r12;
                av40Var.getClass();
                cqa0Var.a = null;
                cqa0Var.b = null;
                cqa0Var.c = b;
                cqa0Var.d = i5;
                cqa0Var.g = 3;
                if (b(av40Var, cqa0Var) == obj3) {
                    return obj2;
                }
            }
        }
        return obj3;
        b = r12;
        if (((Number) obj).intValue() == 0) {
            i5 = 0;
        }
        if (i5 != 0) {
            b = i;
            Integer num2 = new Integer(b);
            cqa0Var.a = av40Var;
            cqa0Var.b = null;
            cqa0Var.c = b;
            cqa0Var.d = i5;
            cqa0Var.g = 2;
            av40Var.getClass();
            j7yVar.getClass();
            objH = jm5.h(av40Var.a(), new piu(j7yVar, num2, (lnm) null, (byte) 22), cqa0Var);
            if (objH != obj3) {
                b = r12;
                objH = obj2;
            }
            if (objH != obj3) {
                i2 = i5;
                b = b;
                i5 = i2;
                b = i;
                b = r12;
                av40Var.getClass();
                cqa0Var.a = null;
                cqa0Var.b = null;
                cqa0Var.c = b;
                cqa0Var.d = i5;
                cqa0Var.g = 3;
                if (b(av40Var, cqa0Var) == obj3) {
                    return obj2;
                }
            }
        } else {
            b = i;
            b = r12;
            av40Var.getClass();
            cqa0Var.a = null;
            cqa0Var.b = null;
            cqa0Var.c = b;
            cqa0Var.d = i5;
            cqa0Var.g = 3;
            if (b(av40Var, cqa0Var) == obj3) {
                return obj2;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0098 -> B:27:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p.av40 r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eqa0.b(p.av40, p.onm):java.lang.Object");
    }
}
