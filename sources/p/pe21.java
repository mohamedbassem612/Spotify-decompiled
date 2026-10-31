package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pe21 {
    public final tz01 a;
    public final c9n b;
    public final ven0 c;
    public final ven0 d;
    public final ven0 e;
    public final float f;
    public final l5 g;
    public final st41 h;
    public final flb0 j;
    public final vu30 k;
    public final int i = 1;
    public final xgn0 l = ygn0.a();
    public final hrr0 m = v8r.q((Object) null);
    public final mdt n = yv91.a(new he21(this, (byte) 0));
    public final hrr0 o = v8r.q(new Offset(0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hrr0 f11p = v8r.q(new qr80(0));
    public final hrr0 q = v8r.q((Object) null);
    public final hrr0 r = v8r.q((Object) null);
    public long s = 0;
    public final HashSet t = new HashSet();
    public final hrr0 u = v8r.q((Object) null);
    public final o95 v = new o95(new Offset(0), rno1.f, (Object) null, 12);
    public final m441 w = rwq.q(new he21(this, (byte) 1));

    public pe21(tz01 tz01Var, c9n c9nVar, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, float f, l5 l5Var, st41 st41Var, flb0 flb0Var, vu30 vu30Var) {
        this.a = tz01Var;
        this.b = c9nVar;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = f;
        this.g = l5Var;
        this.h = st41Var;
        this.j = flb0Var;
        this.k = vu30Var;
    }

    public static oe21 a(pe21 pe21Var, n511 n511Var, ArrayList arrayList, nt41 nt41Var, zw11 zw11Var, int i) {
        if ((i & 4) != 0) {
            nt41Var = nt41.b;
        }
        if ((i & 8) != 0) {
            zw11Var = ma21.O0;
        }
        pe21Var.getClass();
        v721 v721Var = new v721(pe21Var, n511Var, zw11Var, (byte) 9);
        int iOrdinal = nt41Var.ordinal();
        Object obj = null;
        if (iOrdinal == 0) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                Object objPrevious = listIterator.previous();
                if (((Boolean) v721Var.invoke(objPrevious)).booleanValue()) {
                    obj = objPrevious;
                    break;
                }
            }
            return (oe21) obj;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        for (Object obj2 : arrayList) {
            if (((Boolean) v721Var.invoke(obj2)).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        return (oe21) obj;
    }

    public final oe21 b() {
        Object value = this.m.getValue();
        Object obj = null;
        if (value == null) {
            return null;
        }
        for (Object obj2 : this.a.d().f()) {
            if (((oe21) obj2).a.l.equals(value)) {
                obj = obj2;
                break;
            }
        }
        return (oe21) obj;
    }

    public final long c() {
        long jA;
        oe21 oe21VarB = b();
        if (oe21VarB == null) {
            return 0L;
        }
        int i = oe21VarB.a.a;
        hrr0 hrr0Var = this.q;
        Integer num = (Integer) hrr0Var.getValue();
        hrr0 hrr0Var2 = this.r;
        if (num == null || i != num.intValue() || ((Integer) hrr0Var.getValue()) == null) {
            hrr0Var.setValue((Object) null);
            hrr0Var2.setValue((Object) null);
            jA = oe21VarB.a();
        } else {
            qr80 qr80Var = (qr80) hrr0Var2.getValue();
            jA = qr80Var != null ? qr80Var.a : oe21VarB.a();
        }
        long j = ((Offset) this.o.getValue()).a;
        long j2 = ((qr80) this.f11p.getValue()).a;
        long jH = h(Offset.f((((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j2 >> 32))) << 32), (((long) Float.floatToRawIntBits((int) (jA & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jA >> 32))) << 32)));
        i(jH);
        return Offset.g(j, jH);
    }

    public final qqq0 d() {
        return ((ptb0) this.a.d().b).q;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0231  */
    /* JADX WARN: Code duplicated, block: B:103:0x0235  */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:110:0x0256  */
    /* JADX WARN: Code duplicated, block: B:112:0x0259  */
    /* JADX WARN: Code duplicated, block: B:115:0x0267  */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0281  */
    /* JADX WARN: Code duplicated, block: B:126:0x028b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02af  */
    /* JADX WARN: Code duplicated, block: B:139:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:143:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:159:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x022e  */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b6, code lost:
    
        if (r1.a > r12.a) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c3, code lost:
    
        if (r1.a < r12.a) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c5, code lost:
    
        r0 = p.fn31.T(r23.b, (p.o8n) null, 0, new p.je21(r23, r14, r3, null, (byte) 0), 3);
        r10.c((java.lang.Object) null);
        r6.a = null;
        r6.d = 2;
        r1 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02ea, code lost:
    
        if (r0.j(r6) != r1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ed, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02ee, code lost:
    
        r10.c((java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02f1, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r1.a == r2.a.a) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r1.a == ((p.err0) ((p.xtb0) r3.b).e.b).s()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        r10.c((java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.nt41 r24, p.onm r25) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pe21.e(p.nt41, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154 A[Catch: all -> 0x01a5, PHI: r1 r2 r3 r6 r9
      0x0154: PHI (r1v7 p.vgn0) = (r1v4 p.vgn0), (r1v17 p.vgn0) binds: [B:59:0x0150, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r2v7 int) = (r2v4 int), (r2v12 int) binds: [B:59:0x0150, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r3v11 int) = (r3v8 int), (r3v13 int) binds: [B:59:0x0150, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r6v22 p.oe21) = (r6v19 p.oe21), (r6v36 p.oe21) binds: [B:59:0x0150, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r9v5 p.oe21) = (r9v2 p.oe21), (r9v11 p.oe21) binds: [B:59:0x0150, B:23:0x0064] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01a5, blocks: (B:71:0x01d7, B:61:0x0154, B:63:0x015e, B:67:0x01b3, B:66:0x01a8, B:58:0x0126, B:41:0x00b8, B:46:0x00cc, B:48:0x00dc, B:53:0x00f5), top: B:78:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015e A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:71:0x01d7, B:61:0x0154, B:63:0x015e, B:67:0x01b3, B:66:0x01a8, B:58:0x0126, B:41:0x00b8, B:46:0x00cc, B:48:0x00dc, B:53:0x00f5), top: B:78:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8 A[Catch: all -> 0x01a5, TryCatch #0 {all -> 0x01a5, blocks: (B:71:0x01d7, B:61:0x0154, B:63:0x015e, B:67:0x01b3, B:66:0x01a8, B:58:0x0126, B:41:0x00b8, B:46:0x00cc, B:48:0x00dc, B:53:0x00f5), top: B:78:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final Object f(oe21 oe21Var, oe21 oe21Var2, onm onmVar) throws Throwable {
        ke21 ke21Var;
        oe21 oe21Var3;
        vgn0 vgn0Var;
        int i;
        oe21 oe21Var4;
        oe21 oe21Var5;
        vgn0 vgn0Var2;
        int i2;
        oe21 oe21Var6;
        int i3;
        int i4;
        oe21 oe21Var7;
        zu30 zu30Var;
        c9n c9nVar;
        qtb0 qtb0Var;
        qtb0 qtb0Var2;
        qr80 qr80Var;
        ic01 ic01Var;
        ke21 ke21Var2;
        Object obj;
        Object obj2;
        Throwable th;
        oe21 oe21Var8 = oe21Var2;
        xtb0 xtb0Var = (xtb0) this.a.b;
        if (onmVar instanceof ke21) {
            ke21Var = (ke21) onmVar;
            int i5 = ke21Var.h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ke21Var.h = i5 - Integer.MIN_VALUE;
            } else {
                ke21Var = new ke21(this, onmVar);
            }
        } else {
            ke21Var = new ke21(this, onmVar);
        }
        Object obj3 = ke21Var.f;
        int i6 = ke21Var.h;
        hrr0 hrr0Var = this.r;
        hrr0 hrr0Var2 = this.q;
        int i7 = 0;
        d9n d9nVar = rih1.a;
        d9n d9nVar2 = d9n.a;
        try {
            try {
                if (i6 == 0) {
                    hm5.M(obj3);
                    if (oe21Var.a.a != oe21Var8.a.a) {
                        vgn0 vgn0Var3 = this.l;
                        ke21Var.a = oe21Var;
                        ke21Var.b = oe21Var8;
                        ke21Var.c = vgn0Var3;
                        ke21Var.d = 0;
                        ke21Var.h = 1;
                        if (vgn0Var3.a(ke21Var) != d9nVar2) {
                            oe21Var3 = oe21Var;
                            vgn0Var = vgn0Var3;
                            i = 0;
                        }
                        return d9nVar2;
                    }
                    return d9nVar;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        i7 = ke21Var.e;
                        i2 = ke21Var.d;
                        vgn0Var2 = ke21Var.c;
                        oe21Var4 = ke21Var.b;
                        oe21Var5 = ke21Var.a;
                        try {
                            hm5.M(obj3);
                            vgn0 vgn0Var4 = vgn0Var2;
                            i3 = i2;
                            vgn0Var = vgn0Var4;
                            i4 = i7;
                            oe21Var7 = oe21Var5;
                            oe21Var6 = oe21Var4;
                            hrr0Var2.setValue(new Integer(oe21Var7.a.a));
                            zu30Var = (zu30) this.d.getValue();
                            c9nVar = this.b;
                            qtb0Var = oe21Var7.a;
                            qtb0Var2 = oe21Var6.a;
                            ke21Var.a = oe21Var7;
                            ke21Var.b = oe21Var6;
                            ke21Var.c = vgn0Var;
                            ke21Var.d = i3;
                            ke21Var.e = i4;
                            ke21Var.h = 3;
                            if (zu30Var.J(c9nVar, qtb0Var, qtb0Var2, ke21Var) != d9nVar2) {
                                if (oe21Var6.a.a > oe21Var7.a.a) {
                                    long jA = oe21Var6.a();
                                    long jB = oe21Var6.b();
                                    long j = (((long) (((int) (jA & 4294967295L)) + ((int) (jB & 4294967295L)))) & 4294967295L) | (((long) (((int) (jA >> 32)) + ((int) (jB >> 32)))) << 32);
                                    long jB2 = oe21Var7.b();
                                    qr80Var = new qr80((((long) (((int) (j >> 32)) - ((int) (jB2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (jB2 & 4294967295L)))) & 4294967295L));
                                } else {
                                    qr80Var = new qr80(oe21Var6.a());
                                }
                                hrr0Var.setValue(qr80Var);
                                ic01Var = new ic01(this, (lnm) null, (byte) 12);
                                ke21Var2 = ke21Var;
                                ke21Var2.a = null;
                                ke21Var2.b = null;
                                ke21Var2.c = vgn0Var;
                                ke21Var2.d = i3;
                                ke21Var2.e = i4;
                                ke21Var2.h = 4;
                                if (rc2.M(1000L, ic01Var, ke21Var2) != d9nVar2) {
                                    obj = null;
                                }
                            }
                            return d9nVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            obj2 = null;
                            vgn0Var = vgn0Var2;
                        }
                    } else if (i6 == 3) {
                        int i8 = ke21Var.e;
                        i3 = ke21Var.d;
                        vgn0 vgn0Var5 = ke21Var.c;
                        oe21Var6 = ke21Var.b;
                        oe21Var7 = ke21Var.a;
                        try {
                            hm5.M(obj3);
                            i4 = i8;
                            vgn0Var = vgn0Var5;
                            if (oe21Var6.a.a > oe21Var7.a.a) {
                                long jA2 = oe21Var6.a();
                                long jB3 = oe21Var6.b();
                                long j2 = (((long) (((int) (jA2 & 4294967295L)) + ((int) (jB3 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jA2 >> 32)) + ((int) (jB3 >> 32)))) << 32);
                                long jB4 = oe21Var7.b();
                                qr80Var = new qr80((((long) (((int) (j2 >> 32)) - ((int) (jB4 >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (jB4 & 4294967295L)))) & 4294967295L));
                            } else {
                                qr80Var = new qr80(oe21Var6.a());
                            }
                            hrr0Var.setValue(qr80Var);
                            ic01Var = new ic01(this, (lnm) null, (byte) 12);
                            ke21Var2 = ke21Var;
                            ke21Var2.a = null;
                            ke21Var2.b = null;
                            ke21Var2.c = vgn0Var;
                            ke21Var2.d = i3;
                            ke21Var2.e = i4;
                            ke21Var2.h = 4;
                            if (rc2.M(1000L, ic01Var, ke21Var2) != d9nVar2) {
                                obj = null;
                            }
                            return d9nVar2;
                        } catch (Throwable th3) {
                            th = th3;
                            obj2 = null;
                            vgn0Var = vgn0Var5;
                        }
                    } else {
                        if (i6 != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vgn0Var = ke21Var.c;
                        try {
                            hm5.M(obj3);
                            obj = null;
                        } catch (Throwable th4) {
                            th = th4;
                            obj2 = null;
                        }
                    }
                    vgn0Var.c(obj2);
                    throw th;
                }
                int i9 = ke21Var.d;
                vgn0 vgn0Var6 = ke21Var.c;
                oe21 oe21Var9 = ke21Var.b;
                oe21Var3 = ke21Var.a;
                hm5.M(obj3);
                i = i9;
                vgn0Var = vgn0Var6;
                oe21Var8 = oe21Var9;
                hrr0Var2.setValue(obj);
                hrr0Var.setValue(obj);
                vgn0Var.c(obj);
                return d9nVar;
                if (!((Boolean) this.n.getValue()).booleanValue()) {
                    vgn0Var.c((Object) null);
                    return d9nVar;
                }
                if (oe21Var3.a.a == ((err0) xtb0Var.e.b).s() || oe21Var8.a.a == ((err0) xtb0Var.e.b).s()) {
                    int iS = ((err0) xtb0Var.e.b).s();
                    int iS2 = ((err0) xtb0Var.e.c).s();
                    ke21Var.a = oe21Var3;
                    ke21Var.b = oe21Var8;
                    ke21Var.c = vgn0Var;
                    ke21Var.d = i;
                    ke21Var.e = 0;
                    ke21Var.h = 2;
                    xtb0Var.j(iS, iS2);
                    if (d9nVar != d9nVar2) {
                        oe21Var4 = oe21Var8;
                        oe21Var5 = oe21Var3;
                        vgn0Var2 = vgn0Var;
                        i2 = i;
                        vgn0 vgn0Var7 = vgn0Var2;
                        i3 = i2;
                        vgn0Var = vgn0Var7;
                        i4 = i7;
                        oe21Var7 = oe21Var5;
                        oe21Var6 = oe21Var4;
                        hrr0Var2.setValue(new Integer(oe21Var7.a.a));
                        zu30Var = (zu30) this.d.getValue();
                        c9nVar = this.b;
                        qtb0Var = oe21Var7.a;
                        qtb0Var2 = oe21Var6.a;
                        ke21Var.a = oe21Var7;
                        ke21Var.b = oe21Var6;
                        ke21Var.c = vgn0Var;
                        ke21Var.d = i3;
                        ke21Var.e = i4;
                        ke21Var.h = 3;
                        if (zu30Var.J(c9nVar, qtb0Var, qtb0Var2, ke21Var) != d9nVar2) {
                            if (oe21Var6.a.a > oe21Var7.a.a) {
                                long jA3 = oe21Var6.a();
                                long jB5 = oe21Var6.b();
                                long j3 = (((long) (((int) (jA3 & 4294967295L)) + ((int) (jB5 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jA3 >> 32)) + ((int) (jB5 >> 32)))) << 32);
                                long jB6 = oe21Var7.b();
                                qr80Var = new qr80((((long) (((int) (j3 >> 32)) - ((int) (jB6 >> 32)))) << 32) | (((long) (((int) (j3 & 4294967295L)) - ((int) (jB6 & 4294967295L)))) & 4294967295L));
                            } else {
                                qr80Var = new qr80(oe21Var6.a());
                            }
                            hrr0Var.setValue(qr80Var);
                            ic01Var = new ic01(this, (lnm) null, (byte) 12);
                            ke21Var2 = ke21Var;
                            ke21Var2.a = null;
                            ke21Var2.b = null;
                            ke21Var2.c = vgn0Var;
                            ke21Var2.d = i3;
                            ke21Var2.e = i4;
                            ke21Var2.h = 4;
                            if (rc2.M(1000L, ic01Var, ke21Var2) != d9nVar2) {
                                obj = null;
                                hrr0Var2.setValue(obj);
                                hrr0Var.setValue(obj);
                                vgn0Var.c(obj);
                                return d9nVar;
                            }
                        }
                    }
                } else {
                    oe21Var6 = oe21Var8;
                    i3 = i;
                    i4 = 0;
                    oe21Var7 = oe21Var3;
                    hrr0Var2.setValue(new Integer(oe21Var7.a.a));
                    zu30Var = (zu30) this.d.getValue();
                    c9nVar = this.b;
                    qtb0Var = oe21Var7.a;
                    qtb0Var2 = oe21Var6.a;
                    ke21Var.a = oe21Var7;
                    ke21Var.b = oe21Var6;
                    ke21Var.c = vgn0Var;
                    ke21Var.d = i3;
                    ke21Var.e = i4;
                    ke21Var.h = 3;
                    if (zu30Var.J(c9nVar, qtb0Var, qtb0Var2, ke21Var) != d9nVar2) {
                        if (oe21Var6.a.a > oe21Var7.a.a) {
                            long jA4 = oe21Var6.a();
                            long jB7 = oe21Var6.b();
                            long j4 = (((long) (((int) (jA4 & 4294967295L)) + ((int) (jB7 & 4294967295L)))) & 4294967295L) | (((long) (((int) (jA4 >> 32)) + ((int) (jB7 >> 32)))) << 32);
                            long jB8 = oe21Var7.b();
                            qr80Var = new qr80((((long) (((int) (j4 >> 32)) - ((int) (jB8 >> 32)))) << 32) | (((long) (((int) (j4 & 4294967295L)) - ((int) (jB8 & 4294967295L)))) & 4294967295L));
                        } else {
                            qr80Var = new qr80(oe21Var6.a());
                        }
                        hrr0Var.setValue(qr80Var);
                        ic01Var = new ic01(this, (lnm) null, (byte) 12);
                        ke21Var2 = ke21Var;
                        ke21Var2.a = null;
                        ke21Var2.b = null;
                        ke21Var2.c = vgn0Var;
                        ke21Var2.d = i3;
                        ke21Var2.e = i4;
                        ke21Var2.h = 4;
                        if (rc2.M(1000L, ic01Var, ke21Var2) != d9nVar2) {
                            obj = null;
                            hrr0Var2.setValue(obj);
                            hrr0Var.setValue(obj);
                            vgn0Var.c(obj);
                            return d9nVar;
                        }
                    }
                }
                return d9nVar2;
            } catch (Throwable th5) {
                th = th5;
                obj2 = null;
            }
        } catch (CancellationException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(Object obj, long j, onm onmVar) {
        me21 me21Var;
        Object next;
        oe21 oe21Var;
        long j2;
        if (onmVar instanceof me21) {
            me21Var = (me21) onmVar;
            int i = me21Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                me21Var.f = i - Integer.MIN_VALUE;
            } else {
                me21Var = new me21(this, onmVar);
            }
        } else {
            me21Var = new me21(this, onmVar);
        }
        Object obj2 = me21Var.d;
        int i2 = me21Var.f;
        if (i2 == 0) {
            hm5.M(obj2);
            tz01 tz01Var = this.a;
            Iterator it = tz01Var.d().f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((oe21) next).a.l.equals(obj));
            oe21Var = (oe21) next;
            if (oe21Var != null) {
                long jA = oe21Var.a();
                int iOrdinal = d().ordinal();
                if (iOrdinal == 0) {
                    j2 = jA & 4294967295L;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    j2 = jA >> 32;
                }
                int i3 = (int) j2;
                if (i3 < 0) {
                    n8b1 n8b1VarL0 = irn1.l0(0.0f, 0.0f, (Object) null, 7);
                    me21Var.a = obj;
                    me21Var.b = oe21Var;
                    me21Var.c = j;
                    me21Var.f = 1;
                    Object objL = kqn1.l((xtb0) tz01Var.b, i3, n8b1VarL0, me21Var);
                    d9n d9nVar = d9n.a;
                    if (objL == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = me21Var.c;
        oe21 oe21Var2 = me21Var.b;
        Object obj3 = me21Var.a;
        hm5.M(obj2);
        oe21Var = oe21Var2;
        obj = obj3;
        this.m.setValue(obj);
        this.f11p.setValue(new qr80(oe21Var.a()));
        this.s = j;
        ((iu30) this.c.getValue()).invoke(obj);
        return rih1.a;
    }

    public final long h(long j) {
        boolean z = ((ptb0) this.a.d().b).p;
        if (z) {
            j = yto1.x(j, d());
        } else if (z) {
            eg.o();
            return 0L;
        }
        int iOrdinal = d().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                eg.o();
                return 0L;
            }
            int iOrdinal2 = this.j.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    return yto1.x(j, qqq0.b);
                }
                eg.o();
                return 0L;
            }
        }
        return j;
    }

    public final long i(long j) {
        int iOrdinal = this.j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return j;
        }
        eg.o();
        return 0L;
    }
}
