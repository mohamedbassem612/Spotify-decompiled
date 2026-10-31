package p;

import com.spotify.libs.sociallistening.events.proto.SocialListeningClientSessionCreated;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xp10 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp10(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b A[PHI: r4 r5
      0x003b: PHI (r4v5 java.util.Iterator) = (r4v3 java.util.Iterator), (r4v6 java.util.Iterator) binds: [B:14:0x0030, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r5v1 p.ak90) = (r5v0 p.ak90), (r5v2 p.ak90) binds: [B:14:0x0030, B:21:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0053 -> B:20:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object b(p.ak90 r5, p.lnm r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p.jl90
            if (r0 == 0) goto L13
            r0 = r6
            p.jl90 r0 = (p.jl90) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.jl90 r0 = new p.jl90
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            java.util.Iterator r4 = r0.b
            p.ak90 r5 = r0.a
            p.hm5.M(r6)
            goto L56
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r4)
            return r2
        L30:
            p.hm5.M(r6)
            java.lang.Object r4 = r4.b
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r4.next()
            p.mk90 r6 = (p.mk90) r6
            r0.a = r5
            r0.b = r4
            r0.e = r3
            java.lang.Enum r6 = r6.t(r5, r0)
            p.d9n r1 = p.d9n.a
            if (r6 != r1) goto L56
            return r1
        L56:
            p.lk90 r6 = (p.lk90) r6
            int r6 = r6.ordinal()
            if (r6 == 0) goto L3b
            if (r6 != r3) goto L61
            goto L65
        L61:
            p.eg.o()
            return r2
        L65:
            p.rih1 r4 = p.rih1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xp10.b(p.ak90, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(lnm lnmVar) {
        au40 au40Var;
        xab1 xab1Var;
        du40 du40Var = (du40) this.b;
        if (lnmVar instanceof au40) {
            au40Var = (au40) lnmVar;
            int i = au40Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                au40Var.c = i - Integer.MIN_VALUE;
            } else {
                au40Var = new au40(this, lnmVar);
            }
        } else {
            au40Var = new au40(this, lnmVar);
        }
        Object objC = au40Var.a;
        int i2 = au40Var.c;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(objC);
            tu40 tu40Var = (tu40) du40Var.c;
            cu40 cu40Var = new cu40(du40Var, (byte) 0);
            cu40 cu40Var2 = new cu40(du40Var, b);
            au40Var.c = 1;
            objC = tu40Var.c(zt40.a, cu40Var, cu40Var2, au40Var);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objC);
        }
        if (((Boolean) objC).booleanValue() && (xab1Var = du40Var.b) != null) {
            xab1Var.d((CancellationException) null);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0418  */
    public final Object emit(Object obj, lnm lnmVar) {
        boolean z;
        int i;
        xab1 xab1Var;
        Object objH1;
        boolean z2 = false;
        int i2 = 1;
        switch (this.a) {
            case 0:
                l2u0 l2u0Var = (l2u0) obj;
                mv2 mv2Var = (mv2) this.b;
                l2u0 l2u0Var2 = (l2u0) mv2Var.g;
                if (l2u0Var2 != null && l2u0Var2.a && (l2u0Var == null || !l2u0Var.a)) {
                    Long l = l2u0Var != null ? new Long(l2u0Var.e) : null;
                    if (l != null && l.longValue() == 0) {
                        l = null;
                    }
                    long jLongValue = l != null ? l.longValue() : ((yqg) mv2Var.a).b();
                    long j = mv2Var.b;
                    l2u0Var2 = (l2u0) mv2Var.g;
                    if (l2u0Var2 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    mv2Var.b = (jLongValue - l2u0Var2.e) + j;
                }
                if (l2u0Var2 == null || !(z = l2u0Var2.a)) {
                    mv2Var.g = l2u0Var;
                } else if (!Boolean.valueOf(z).equals(l2u0Var != null ? Boolean.valueOf(l2u0Var.a) : null)) {
                    mv2Var.g = l2u0Var;
                }
                if (((Long) mv2Var.f) == null && l2u0Var != null && l2u0Var.a) {
                    mv2Var.f = new Long(l2u0Var.e);
                }
                return rih1.a;
            case 1:
                Object objA = ((jnd0) this.b).a(obj, lnmVar);
                return objA == d9n.a ? objA : rih1.a;
            case 2:
                rih1 rih1Var = rih1.a;
                jw20 jw20Var = (jw20) this.b;
                jw20Var.f.onNext(obj);
                if (jw20.g.decrementAndGet(jw20Var) > 0) {
                    op71.x(((q6) jw20Var).d);
                    return rih1Var;
                }
                ohd ohdVar = new ohd(1, aym.t(lnmVar));
                ohdVar.t();
                jw20.h.set(jw20Var, ohdVar);
                Object objR = ohdVar.r();
                return objR == d9n.a ? objR : rih1Var;
            case 3:
                zx20 zx20Var = (zx20) obj;
                sl7 sl7Var = ((qx20) this.b).b;
                int i3 = zx20Var.b;
                String str = zx20Var.a;
                int iC = l1d.C(i3);
                if (iC == 0) {
                    sl7Var.b(new rl7(str));
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    sl7Var.a(new rl7(str));
                }
                return rih1.a;
            case 4:
                Object objEmit = ((rx20) this.b).c.emit((zx20) obj, lnmVar);
                return objEmit == d9n.a ? objEmit : rih1.a;
            case 5:
                Integer num = (Integer) obj;
                wc30 wc30Var = (wc30) this.b;
                if (!u890.j(num, wc30Var.e) && wc30Var.c.getResources().getConfiguration().smallestScreenWidthDp < 600) {
                    wc30Var.b.a.r(num != null ? num.intValue() : -1);
                }
                wc30Var.e = num;
                return rih1.a;
            case 6:
                if (((Boolean) obj).booleanValue()) {
                    is30 is30Var = (is30) this.b;
                    is30Var.d.a(is30Var.b.a);
                }
                return rih1.a;
            case 7:
                hw30 hw30Var = (hw30) this.b;
                boolean z3 = ((vir0) obj) instanceof tir0;
                hw30Var.t = !z3;
                mbm1 mbm1Var = hw30Var.g;
                Object obj2 = hw30Var.h;
                if (!z3 && hw30Var.i) {
                    z2 = true;
                }
                mbm1Var.b(obj2, z2);
                return rih1.a;
            case 8:
                mmr0 mmr0Var = (mmr0) obj;
                Set set = (Set) mmr0Var.a;
                Map map = (Map) mmr0Var.b;
                k740 k740Var = (k740) this.b;
                Set set2 = set;
                int iS = zno1.s(q7h.U(set2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj3 : set2) {
                    s640 s640Var = (s640) obj3;
                    String str2 = s640Var.b;
                    if (str2 == null) {
                        str2 = s640Var.a;
                    }
                    linkedHashMap.put(str2, obj3);
                }
                k740Var.f = linkedHashMap;
                k740Var.g.l(map);
                return rih1.a;
            case 9:
                return c(lnmVar);
            case 10:
                tx40 tx40Var = (tx40) obj;
                p250 p250Var = (p250) this.b;
                tzt tztVar = p250Var.a;
                yqg yqgVar = p250Var.d;
                bpb1 bpb1Var = p250Var.f;
                if (tx40Var instanceof sx40) {
                    sx40 sx40Var = (sx40) tx40Var;
                    tztVar.getClass();
                    String str3 = sx40Var.e;
                    int iC2 = l1d.C(sx40Var.c);
                    if (iC2 == 0) {
                        i = i2;
                    } else if (iC2 != 1) {
                        i2 = 3;
                        if (iC2 != 2) {
                            if (iC2 != 3) {
                                eg.o();
                                return null;
                            }
                            i2 = 4;
                        }
                        i = i2;
                    } else {
                        i = 2;
                    }
                    bpb1Var.m((Object) null, new l250(i, str3, sx40Var.d, yqgVar.b()));
                } else if (tx40Var instanceof qx40) {
                    tztVar.getClass();
                    bpb1Var.m((Object) null, new k250(yqgVar.b()));
                } else {
                    if (!(tx40Var instanceof rx40)) {
                        eg.o();
                        return null;
                    }
                    bpb1Var.m((Object) null, new k250(yqgVar.b()));
                }
                return rih1.a;
            case 11:
                if (!u890.j((ya50) obj, ya50.a)) {
                    eg.o();
                    return null;
                }
                h950 h950Var = (h950) this.b;
                xa50 xa50Var = h950Var.h;
                if (xa50Var != null) {
                    h950Var.b(xa50Var);
                }
                return rih1.a;
            case 12:
                e360 e360Var = (e360) obj;
                cct cctVar = ((rbt) ((wp20) this.b).a).o;
                l160 l160Var = e360Var.b;
                cctVar.e(new Integer(l160Var.a), e360Var.a + l160Var.b);
                return rih1.a;
            case 13:
                ayh ayhVar = ((d160) this.b).d;
                rih1 rih1Var2 = rih1.a;
                ayhVar.m0(rih1Var2);
                return rih1Var2;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ho60 ho60Var = (ho60) this.b;
                mma0[] mma0VarArr = ho60.l;
                ho60Var.k.c(ho60.l[0], ho60Var, bool);
                return rih1.a;
            case 15:
                ((Number) obj).intValue();
                bp60 bp60Var = (bp60) this.b;
                synchronized (bp60Var.c) {
                    if (bp60Var.i || (bp60Var.f == null && ((xab1Var = bp60Var.h) == null || !xab1Var.isActive()))) {
                        z2 = true;
                    }
                }
                if (z2) {
                    ((bp60) this.b).c();
                }
                return rih1.a;
            case 16:
                mmr0 mmr0Var2 = (mmr0) obj;
                xq80 xq80Var = (xq80) mmr0Var2.a;
                qq80 qq80Var = (qq80) mmr0Var2.b;
                m021 m021Var = (m021) ((wr60) this.b).c.c;
                sq80 sq80Var = qq80Var.b;
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) m021Var.c;
                String str4 = xq80Var.a;
                if (!copyOnWriteArraySet.contains(str4)) {
                    copyOnWriteArraySet.add(str4);
                    t2j0 t2j0Var = (t2j0) m021Var.b;
                    v0a1 v0a1VarN = SocialListeningClientSessionCreated.n();
                    v0a1VarN.q(str4);
                    v0a1VarN.s(xq80Var.b);
                    v0a1VarN.r(xq80Var.c);
                    v0a1VarN.n(ab80.h(sq80Var.a));
                    v0a1VarN.t(ab80.i(sq80Var.b));
                    t2j0Var.a(v0a1VarN.build());
                }
                return rih1.a;
            case 17:
                Object obj4 = ((e331) obj).a;
                hx60 hx60Var = (hx60) this.b;
                Throwable thA = e331.a(obj4);
                if (thA == null) {
                    hx60Var.h = (fx60) obj4;
                    hx60Var.i();
                } else {
                    hx60Var.h(thA);
                }
                return rih1.a;
            case 18:
                ((ltp0) ((g9r) this.b).d).a = ((Boolean) obj).booleanValue();
                return rih1.a;
            case 19:
                Object objEmit2 = ((v480) this.b).k.emit((czc) obj, lnmVar);
                return objEmit2 == d9n.a ? objEmit2 : rih1.a;
            case 20:
                qt80 qt80Var = (qt80) obj;
                d9n d9nVar = d9n.a;
                ub5 ub5Var = (ub5) this.b;
                rih1 rih1Var3 = rih1.a;
                if (qt80Var instanceof r9w0) {
                    objH1 = ub5Var.I1(lnmVar);
                    if (objH1 != d9nVar) {
                        return rih1Var3;
                    }
                } else if (qt80Var instanceof s9w0) {
                    objH1 = ub5Var.H1(lnmVar);
                    if (objH1 != d9nVar) {
                        return rih1Var3;
                    }
                } else if (!(qt80Var instanceof q9w0) || (objH1 = ub5Var.H1(lnmVar)) != d9nVar) {
                    return rih1Var3;
                }
                return objH1;
            case 21:
                s9w0 s9w0Var = (qt80) obj;
                mw80 mw80Var = (mw80) this.b;
                LinkedHashSet linkedHashSet = mw80Var.V0;
                if (s9w0Var instanceof r9w0) {
                    linkedHashSet.add(s9w0Var);
                    mw80Var.K1();
                } else if (s9w0Var instanceof s9w0) {
                    linkedHashSet.remove(s9w0Var.a);
                    mw80Var.K1();
                } else if (s9w0Var instanceof q9w0) {
                    linkedHashSet.remove(((q9w0) s9w0Var).a);
                    mw80Var.K1();
                }
                return rih1.a;
            case 22:
                ((ax80) this.b).i.l((Object) null);
                return rih1.a;
            case 23:
                ((gx80) this.b).c();
                return rih1.a;
            case 24:
                return b((ak90) obj, lnmVar);
            case 25:
                ((rx90) this.b).d.l();
                return rih1.a;
            case 26:
                ((xz90) this.b).c();
                return rih1.a;
            case 27:
                ((o2a0) this.b).c();
                return rih1.a;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((Boolean) obj).getClass();
                ((lzn0) ((pzw) this.b).X).e();
                return rih1.a;
            default:
                ((Boolean) obj).getClass();
                ((lzn0) ((dea0) this.b).X).e();
                return rih1.a;
        }
    }
}
