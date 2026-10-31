package p;

import android.net.Uri;
import com.comscore.streaming.State;
import com.spotify.mobius.functions.Consumer;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ywm0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ywm0(q9l1 q9l1Var, Consumer consumer, hdn0 hdn0Var, ven0 ven0Var) {
        this.a = (byte) 14;
        this.e = q9l1Var;
        this.d = consumer;
        this.c = hdn0Var;
        this.b = ven0Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object b(iud iudVar, lnm lnmVar) {
        qz31 qz31Var;
        Uri uri;
        String str;
        jz31 jz31Var;
        wkt wktVar;
        et90 et90Var = (et90) this.d;
        if (lnmVar instanceof qz31) {
            qz31Var = (qz31) lnmVar;
            int i = qz31Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qz31Var.d = i - Integer.MIN_VALUE;
            } else {
                qz31Var = new qz31(this, lnmVar);
            }
        } else {
            qz31Var = new qz31(this, lnmVar);
        }
        qz31 qz31Var2 = qz31Var;
        Object objA = qz31Var2.b;
        int i2 = qz31Var2.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            if (!(iudVar instanceof aud)) {
                if (iudVar instanceof ztd) {
                    wh71 wh71Var = (wh71) et90Var.c;
                    ztd ztdVar = (ztd) iudVar;
                    dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
                    qz31Var2.a = null;
                    qz31Var2.d = 4;
                    if (wh71Var.a(dlw0Var, qz31Var2) == d9nVar) {
                    }
                }
                return rih1Var;
            }
            mz31 mz31Var = (mz31) this.e;
            qz31Var2.a = iudVar;
            qz31Var2.d = 1;
            if (et90Var.m(mz31Var, qz31Var2) != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            iudVar = qz31Var2.a;
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objA);
                    return rih1Var;
                }
                if (i2 == 4) {
                    hm5.M(objA);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iudVar = qz31Var2.a;
            hm5.M(objA);
        }
        uri = ((wwa) o7h.V0((List) objA)).b;
        nz31 nz31Var = (nz31) this.c;
        str = nz31Var.a;
        jz31Var = nz31Var.b;
        wktVar = ((aud) iudVar).a;
        qz31Var2.a = null;
        qz31Var2.d = 3;
        if (et90Var.q(str, jz31Var, wktVar, uri, qz31Var2) != d9nVar) {
            return d9nVar;
        }
        return rih1Var;
        xwa xwaVar = (xwa) this.b;
        vwa[] vwaVarArr = {new vwa()};
        qz31Var2.a = iudVar;
        qz31Var2.d = 2;
        objA = xwaVar.a(vwaVarArr, qz31Var2);
        if (objA != d9nVar) {
            uri = ((wwa) o7h.V0((List) objA)).b;
            nz31 nz31Var2 = (nz31) this.c;
            str = nz31Var2.a;
            jz31Var = nz31Var2.b;
            wktVar = ((aud) iudVar).a;
            qz31Var2.a = null;
            qz31Var2.d = 3;
            if (et90Var.q(str, jz31Var, wktVar, uri, qz31Var2) != d9nVar) {
                return rih1Var;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(int[] r14, p.lnm r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.e
            p.vr20 r1 = (p.vr20) r1
            java.lang.Object r2 = r13.d
            p.p811 r2 = (p.p811) r2
            boolean r3 = r15 instanceof p.vug1
            if (r3 == 0) goto L1f
            r3 = r15
            p.vug1 r3 = (p.vug1) r3
            int r4 = r3.d
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.d = r4
            goto L24
        L1f:
            p.vug1 r3 = new p.vug1
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.b
            int r4 = r3.d
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r5
        L38:
            int[] r14 = r3.a
            p.hm5.M(r15)
            goto L98
        L3e:
            p.hm5.M(r15)
            java.lang.Object r15 = r2.a
            p.d9n r4 = p.d9n.a
            if (r15 != 0) goto L56
            java.util.Set r13 = p.f46.S0(r0)
            r3.a = r14
            r3.d = r7
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.c
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.a
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            p.eg.m(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = p.o7h.p1(r15)
            r3.a = r14
            r3.d = r6
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.a = r14
            p.rih1 r13 = p.rih1.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ywm0.c(int[], p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:165:0x032f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:209:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:211:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0400  */
    /* JADX WARN: Code duplicated, block: B:231:0x044f  */
    /* JADX WARN: Code duplicated, block: B:254:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    public final Object emit(Object obj, lnm lnmVar) {
        mns0 mns0Var;
        vr20 vr20Var;
        nnu0 nnu0Var;
        rvu0 rvu0Var;
        dcv0 dcv0Var;
        Object next;
        gcz gczVar;
        k4z i4zVar;
        gcz gczVar2;
        ah40 ah40Var;
        ah40 ah40Var2;
        iex0 iex0Var;
        int i;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        xu21 xu21Var;
        xm01 xm01Var;
        jy41 jy41Var;
        wz41 qz41Var;
        kqa1 kqa1Var;
        byte b = this.a;
        int i2 = 0;
        z = false;
        boolean z = false;
        int i3 = 0;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.c;
        ocy0Var = null;
        ocy0 ocy0Var = null;
        switch (b) {
            case 0:
                bal1 bal1Var = (bal1) obj;
                ven0 ven0Var = (ven0) obj4;
                if (bal1Var instanceof z9l1) {
                    r091 r091Var = (r091) ven0Var.getValue();
                    if (r091Var == null) {
                        return rih1Var;
                    }
                    r091Var.d();
                    return rih1Var;
                }
                if (!u890.j(bal1Var, aal1.a)) {
                    eg.o();
                    return null;
                }
                r091 r091Var2 = (r091) ven0Var.getValue();
                if (r091Var2 == null) {
                    return rih1Var;
                }
                r091.f(r091Var2, (tv80) ((iu30) ((ven0) obj5).getValue()).invoke(n3p1.q(((gij1) obj2).b)), ((q9l1) obj3).f.b, mky0.a, 4);
                return rih1Var;
            case 1:
                Set setM0 = z561.m0(z561.j0(new sgg1(pzo0.V0, z561.T(pzo0.U0, new sgg1(new xr1((c380) obj3, (byte) 5), new i46((List) obj, (byte) 1)))), 2));
                Set set = (Set) obj2;
                Set setV0 = dm61.v0(set, setM0);
                Set setV1 = dm61.v0(setM0, set);
                ven0 ven0Var2 = (ven0) obj4;
                Iterator it = setV0.iterator();
                while (it.hasNext()) {
                    ((iu30) ven0Var2.getValue()).invoke((s3t0) it.next());
                }
                ven0 ven0Var3 = (ven0) obj5;
                Iterator it2 = setV1.iterator();
                while (it2.hasNext()) {
                    ((iu30) ven0Var3.getValue()).invoke((s3t0) it2.next());
                }
                set.clear();
                set.addAll(setM0);
                return rih1Var;
            case 2:
                if (lnmVar instanceof mns0) {
                    mns0Var = (mns0) lnmVar;
                    int i4 = mns0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mns0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        mns0Var = new mns0(this, lnmVar);
                    }
                } else {
                    mns0Var = new mns0(this, lnmVar);
                }
                Object objR = mns0Var.a;
                int i5 = mns0Var.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        i2 = mns0Var.d;
                        vr20Var = mns0Var.c;
                        hm5.M(objR);
                    } else {
                        if (i5 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(objR);
                    }
                    return rih1Var;
                }
                hm5.M(objR);
                vr20Var = (vr20) obj2;
                mns0Var.c = vr20Var;
                mns0Var.d = 0;
                mns0Var.b = 1;
                objR = zro1.r((qns0) obj3, (String) obj4, (Set) obj5, mns0Var);
                if (objR == d9nVar) {
                    return d9nVar;
                }
                mns0Var.c = null;
                mns0Var.d = i2;
                mns0Var.b = 2;
                if (vr20Var.emit(objR, mns0Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 3:
                if (lnmVar instanceof nnu0) {
                    nnu0Var = (nnu0) lnmVar;
                    int i6 = nnu0Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        nnu0Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        nnu0Var = new nnu0(this, lnmVar);
                    }
                } else {
                    nnu0Var = new nnu0(this, lnmVar);
                }
                Object obj6 = nnu0Var.a;
                int i7 = nnu0Var.b;
                if (i7 == 0) {
                    hm5.M(obj6);
                    vr20 vr20Var2 = (vr20) obj2;
                    i1r i1rVar = (k1r) obj;
                    String str2 = (String) obj3;
                    String str3 = (String) obj4;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    sv21 sv21Var = new sv21(str2, str3, (String) (i1rVar2 != null ? i1rVar2.a : null), (String) obj5);
                    nnu0Var.b = 1;
                    if (vr20Var2.emit(sv21Var, nnu0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i7 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 4:
                if (lnmVar instanceof rvu0) {
                    rvu0Var = (rvu0) lnmVar;
                    int i8 = rvu0Var.b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        rvu0Var.b = i8 - Integer.MIN_VALUE;
                    } else {
                        rvu0Var = new rvu0(this, lnmVar);
                    }
                } else {
                    rvu0Var = new rvu0(this, lnmVar);
                }
                Object obj7 = rvu0Var.a;
                int i9 = rvu0Var.b;
                if (i9 == 0) {
                    hm5.M(obj7);
                    vr20 vr20Var3 = (vr20) obj2;
                    i1r i1rVar3 = (k1r) obj;
                    i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                    qv21 qv21VarE = ((tvu0) obj3).e((zvz0) obj4, (dvu0) obj5, i1rVar4 != null ? (String) i1rVar4.a : null);
                    rvu0Var.b = 1;
                    if (vr20Var3.emit(qv21VarE, rvu0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i9 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj7);
                }
                return rih1Var;
            case 5:
                p811 p811Var = (p811) obj4;
                xmu0 xmu0Var = (xmu0) obj3;
                if (lnmVar instanceof dcv0) {
                    dcv0Var = (dcv0) lnmVar;
                    int i10 = dcv0Var.b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dcv0Var.b = i10 - Integer.MIN_VALUE;
                    } else {
                        dcv0Var = new dcv0(this, lnmVar);
                    }
                } else {
                    dcv0Var = new dcv0(this, lnmVar);
                }
                Object obj8 = dcv0Var.a;
                int i11 = dcv0Var.b;
                if (i11 == 0) {
                    hm5.M(obj8);
                    vr20 vr20Var4 = (vr20) obj2;
                    Object obj9 = ((e331) obj).a;
                    if (!(obj9 instanceof m231)) {
                        hm5.M(obj9);
                        Iterator it3 = ((Iterable) obj9).iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                Instant instant = ((gcz) next).b;
                                do {
                                    Object next2 = it3.next();
                                    Instant instant2 = ((gcz) next2).b;
                                    if (instant.compareTo(instant2) < 0) {
                                        next = next2;
                                        instant = instant2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        gczVar = (gcz) next;
                        dh40 dh40Var = gczVar != null ? gczVar.a.b : null;
                        switch (dh40Var == null ? -1 : ccv0.a[dh40Var.ordinal()]) {
                            case State.UNDEFINED /* -1 */:
                            case 5:
                            case 6:
                                i4zVar = j4z.a;
                                dcv0Var.d = gczVar;
                                dcv0Var.e = 0;
                                dcv0Var.b = 1;
                                if (vr20Var4.emit(i4zVar, dcv0Var) == d9nVar) {
                                    return d9nVar;
                                }
                                gczVar2 = (gcz) p811Var.a;
                                if (gczVar2 != null) {
                                    ah40Var = gczVar2.a;
                                    if (gczVar != null) {
                                        ah40Var2 = gczVar.a;
                                        if (ah40Var.a.equals(ah40Var2.a)) {
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 2;
                                            if (xpn1.H(dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 3;
                                            if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                        }
                                    }
                                }
                                p811Var.a = gczVar;
                                break;
                            case 0:
                            default:
                                eg.o();
                                return null;
                            case 1:
                            case 2:
                                i4zVar = l4z.a;
                                dcv0Var.d = gczVar;
                                dcv0Var.e = 0;
                                dcv0Var.b = 1;
                                if (vr20Var4.emit(i4zVar, dcv0Var) == d9nVar) {
                                    return d9nVar;
                                }
                                gczVar2 = (gcz) p811Var.a;
                                if (gczVar2 != null) {
                                    ah40Var = gczVar2.a;
                                    if (gczVar != null) {
                                        ah40Var2 = gczVar.a;
                                        if (ah40Var.a.equals(ah40Var2.a)) {
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 2;
                                            if (xpn1.H(dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 3;
                                            if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                        }
                                    }
                                }
                                p811Var.a = gczVar;
                                break;
                            case 3:
                                i4zVar = new i4z(gczVar.a.a);
                                dcv0Var.d = gczVar;
                                dcv0Var.e = 0;
                                dcv0Var.b = 1;
                                if (vr20Var4.emit(i4zVar, dcv0Var) == d9nVar) {
                                    return d9nVar;
                                }
                                gczVar2 = (gcz) p811Var.a;
                                if (gczVar2 != null) {
                                    ah40Var = gczVar2.a;
                                    if (gczVar != null) {
                                        ah40Var2 = gczVar.a;
                                        if (ah40Var.a.equals(ah40Var2.a)) {
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 2;
                                            if (xpn1.H(dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 3;
                                            if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                        }
                                    }
                                }
                                p811Var.a = gczVar;
                                break;
                            case 4:
                                i4zVar = k4z.a;
                                dcv0Var.d = gczVar;
                                dcv0Var.e = 0;
                                dcv0Var.b = 1;
                                if (vr20Var4.emit(i4zVar, dcv0Var) == d9nVar) {
                                    return d9nVar;
                                }
                                gczVar2 = (gcz) p811Var.a;
                                if (gczVar2 != null) {
                                    ah40Var = gczVar2.a;
                                    if (gczVar != null) {
                                        ah40Var2 = gczVar.a;
                                        if (ah40Var.a.equals(ah40Var2.a)) {
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 2;
                                            if (xpn1.H(dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                            dcv0Var.d = gczVar;
                                            dcv0Var.e = i3;
                                            dcv0Var.b = 3;
                                            if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                                                return d9nVar;
                                            }
                                        }
                                    }
                                }
                                p811Var.a = gczVar;
                                break;
                        }
                    }
                } else {
                    if (i11 == 1) {
                        i3 = dcv0Var.e;
                        gczVar = dcv0Var.d;
                        hm5.M(obj8);
                        gczVar2 = (gcz) p811Var.a;
                        if (gczVar2 != null) {
                            ah40Var = gczVar2.a;
                            if (gczVar != null) {
                                ah40Var2 = gczVar.a;
                                if (ah40Var.a.equals(ah40Var2.a) && f46.S0(new dh40[]{dh40.b, dh40.c}).contains(ah40Var.b) && ah40Var2.b == dh40.d) {
                                    dcv0Var.d = gczVar;
                                    dcv0Var.e = i3;
                                    dcv0Var.b = 2;
                                    if (xpn1.H(dcv0Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                    dcv0Var.d = gczVar;
                                    dcv0Var.e = i3;
                                    dcv0Var.b = 3;
                                    if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                            }
                        }
                    } else if (i11 == 2) {
                        int i12 = dcv0Var.e;
                        gcz gczVar3 = dcv0Var.d;
                        hm5.M(obj8);
                        i3 = i12;
                        gczVar = gczVar3;
                        dcv0Var.d = gczVar;
                        dcv0Var.e = i3;
                        dcv0Var.b = 3;
                        if (((x060) xmu0Var.c).invoke((String) obj5, dcv0Var) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (i11 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        gczVar = dcv0Var.d;
                        hm5.M(obj8);
                    }
                    p811Var.a = gczVar;
                }
                return rih1Var;
            case 6:
                if (lnmVar instanceof iex0) {
                    iex0Var = (iex0) lnmVar;
                    int i13 = iex0Var.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        iex0Var.b = i13 - Integer.MIN_VALUE;
                    } else {
                        iex0Var = new iex0(this, lnmVar);
                    }
                } else {
                    iex0Var = new iex0(this, lnmVar);
                }
                Object obj10 = iex0Var.a;
                int i14 = iex0Var.b;
                if (i14 == 0) {
                    hm5.M(obj10);
                    vr20 vr20Var5 = (vr20) obj2;
                    mmr0 mmr0Var = (mmr0) obj;
                    vnb1 vnb1Var = (vnb1) mmr0Var.a;
                    qp31 qp31Var = (qp31) mmr0Var.b;
                    yy1 yy1Var = (yy1) obj3;
                    qxc0 qxc0Var = (qxc0) obj4;
                    String str4 = (String) obj5;
                    boolean z2 = vnb1Var.a;
                    if (qp31Var != null) {
                        i = 1;
                        if (qp31Var.a) {
                            z = true;
                        }
                    } else {
                        i = 1;
                    }
                    jhm jhmVarG = yy1Var.g(qxc0Var, str4, z2, z);
                    iex0Var.b = i;
                    if (vr20Var5.emit(jhmVarG, iex0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i14 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj10);
                }
                return rih1Var;
            case 7:
                uv00 uv00Var = (uv00) obj;
                ArrayList arrayList = new ArrayList();
                Iterator it4 = ((List) obj2).iterator();
                while (it4.hasNext()) {
                    xkk1 xkk1Var = uv00Var.a(xkk1.class, (String) it4.next()).b;
                    if (xkk1Var == null || (up70VarA = (mq70Var = xkk1Var.a).a(vp70.c)) == null || (str = up70VarA.a.a) == null) {
                        xu21Var = null;
                    } else {
                        xu21Var = new xu21(str, mq70Var.c == 2);
                    }
                    if (xu21Var != null) {
                        arrayList.add(xu21Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ocy0 ocy0Var2 = (ocy0) obj3;
                    tcy0 tcy0Var = (tcy0) ((ven0) obj4).getValue();
                    ocy0 ocy0Var3 = tcy0Var instanceof ocy0 ? (ocy0) tcy0Var : null;
                    if (ocy0Var3 != null) {
                        if (!u890.j(ocy0Var3.a, ocy0Var2.a) || !o7h.d1(ocy0Var3.c, 4).equals(o7h.d1(ocy0Var2.c, 4))) {
                            ocy0Var3 = null;
                        }
                        if (ocy0Var3 != null) {
                            ocy0Var = new ocy0(ocy0Var3.a, ocy0Var3.b, ocy0Var3.c, arrayList);
                        }
                    }
                    if (ocy0Var != null) {
                        ((iu30) obj5).invoke(ocy0Var);
                    }
                }
                return rih1Var;
            case 8:
                di4 di4Var = (di4) obj5;
                if (lnmVar instanceof xm01) {
                    xm01Var = (xm01) lnmVar;
                    int i15 = xm01Var.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        xm01Var.b = i15 - Integer.MIN_VALUE;
                    } else {
                        xm01Var = new xm01(this, lnmVar);
                    }
                } else {
                    xm01Var = new xm01(this, lnmVar);
                }
                Object obj11 = xm01Var.a;
                int i16 = xm01Var.b;
                if (i16 == 0) {
                    hm5.M(obj11);
                    p4r p4rVar = (p4r) obj;
                    an01 an01VarE = ((cn01) obj3).e(((um01) obj4).b, p4rVar.a, p4rVar.b, p4rVar.c, p4rVar.d, p4rVar.e, p4rVar.f, p4rVar.g, p4rVar.h, p4rVar.i, p4rVar.j, di4Var.Q(), di4Var.R(), p4rVar.k);
                    xm01Var.b = 1;
                    if (((vr20) obj2).emit(an01VarE, xm01Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i16 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj11);
                }
                return rih1Var;
            case 9:
                return b((iud) obj, lnmVar);
            case 10:
                String str5 = (String) obj3;
                if (lnmVar instanceof jy41) {
                    jy41Var = (jy41) lnmVar;
                    int i17 = jy41Var.b;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        jy41Var.b = i17 - Integer.MIN_VALUE;
                    } else {
                        jy41Var = new jy41(this, lnmVar);
                    }
                } else {
                    jy41Var = new jy41(this, lnmVar);
                }
                Object obj12 = jy41Var.a;
                int i18 = jy41Var.b;
                if (i18 == 0) {
                    hm5.M(obj12);
                    vr20 vr20Var6 = (vr20) obj2;
                    Object obj13 = ((e331) obj).a;
                    List list = (List) (obj13 instanceof m231 ? null : obj13);
                    if (list == null) {
                        qz41Var = new qz41(str5);
                    } else if (((yx41) obj4).b || !((k84) ((l7m0) obj5).b).o()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            r7h.W(((fpd) it5.next()).getItems(), arrayList2);
                        }
                        qz41Var = new vz41(str5, arrayList2);
                    } else {
                        qz41Var = new wz41(str5, list);
                    }
                    jy41Var.b = 1;
                    if (vr20Var6.emit(qz41Var, jy41Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i18 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj12);
                }
                return rih1Var;
            case 11:
                String str6 = (String) obj;
                err0 err0Var = (hdn0) obj4;
                List list2 = (List) obj2;
                Iterator it6 = list2.iterator();
                int i19 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i19 = -1;
                    } else if (!u890.j(((c220) it6.next()).a, str6)) {
                        i19++;
                    }
                }
                if (i19 >= 0) {
                    float f = rr51.b;
                    err0 err0Var2 = err0Var;
                    if (i19 != err0Var2.s()) {
                        dqy dqyVar = (dqy) ((Map) obj3).get(((c220) list2.get(err0Var2.s())).a);
                        if (dqyVar != null) {
                            dqy dqyVar2 = dqyVar.e() ? dqyVar : null;
                            if (dqyVar2 != null) {
                                az20.a((az20) obj5);
                                dqyVar2.b(false);
                            }
                        }
                        err0Var2.t(i19);
                    }
                }
                return rih1Var;
            case 12:
                if (lnmVar instanceof kqa1) {
                    kqa1Var = (kqa1) lnmVar;
                    int i20 = kqa1Var.b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        kqa1Var.b = i20 - Integer.MIN_VALUE;
                    } else {
                        kqa1Var = new kqa1(this, lnmVar);
                    }
                } else {
                    kqa1Var = new kqa1(this, lnmVar);
                }
                Object obj14 = kqa1Var.a;
                int i21 = kqa1Var.b;
                if (i21 == 0) {
                    hm5.M(obj14);
                    jhm jhmVarH = ((jl1) obj3).h(((hti0) obj4).a, (qxc0) obj5, (bva1) obj);
                    kqa1Var.b = 1;
                    if (((vr20) obj2).emit(jhmVarH, kqa1Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i21 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj14);
                }
                return rih1Var;
            case 13:
                return c((int[]) obj, lnmVar);
            default:
                int iIntValue = ((Number) obj).intValue();
                err0 err0Var3 = (hdn0) obj5;
                if (iIntValue >= 0) {
                    err0 err0Var4 = err0Var3;
                    if (iIntValue != err0Var4.s()) {
                        ((Function0) ((ven0) obj4).getValue()).invoke();
                        err0Var4.t(iIntValue);
                    }
                    l0t l0tVar = ((q9l1) obj3).f;
                    l0tVar.b = Long.valueOf(l0tVar.a.b());
                    ((Consumer) obj2).accept(new aau(iIntValue));
                }
                return rih1Var;
        }
    }

    public ywm0(List list, ocy0 ocy0Var, iu30 iu30Var, ven0 ven0Var) {
        this.a = (byte) 7;
        this.d = list;
        this.e = ocy0Var;
        this.c = iu30Var;
        this.b = ven0Var;
    }

    public /* synthetic */ ywm0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }
}
