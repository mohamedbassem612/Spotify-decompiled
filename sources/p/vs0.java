package p;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vs0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs0(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fb, code lost:
    
        if (r1.emit(r2, r20) == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0113, code lost:
    
        if (r1.emit(r3, r20) == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0115, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    private final Object g(Object obj) throws AbortFlowException {
        Intent intent = (Intent) this.d;
        ru9 ru9Var = (ru9) this.c;
        byte b = this.b;
        Parcelable mofVar = null;
        mofVar = null;
        List listD1 = null;
        mofVar = null;
        mofVar = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            mr20 mr20VarB = ((kbd) ((kly0) ru9Var.b).get()).b();
            this.b = (byte) 1;
            obj = b5p1.i(mr20VarB, this);
            if (obj != d9nVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        hrn0 hrn0Var = crn0.a;
        if (!zBooleanValue) {
            return hrn0Var;
        }
        String str = ((th61) this.e).a;
        Set set = s4b1.f;
        String dataString = intent.getDataString();
        if (dataString == null) {
            dataString = "";
        }
        s4b1 s4b1VarX = uic.x(dataString);
        String dataString2 = intent.getDataString();
        String strY0 = ihc1.Y0(dataString2 != null ? dataString2 : "", '?');
        int iOrdinal = s4b1VarX.c.ordinal();
        if (iOrdinal == 141) {
            String stringExtra = intent.getStringExtra("chat_id");
            if (stringExtra != null || (stringExtra = pcf.b(s4b1VarX)) != null) {
                mofVar = new mof(intent.getIntExtra("number_of_contributors", 0), strY0, stringExtra);
            }
        } else if (iOrdinal == 154) {
            t7q0 t7q0Var = (t7q0) ila0.s(intent, "OnPlatformShareData", t7q0.class);
            if (t7q0Var == null) {
                n57.s("Error extracting parameters: shareData is null");
            } else {
                mofVar = new oof(strY0, t7q0Var);
            }
        } else if (iOrdinal == 156) {
            t7q0 t7q0Var2 = (t7q0) ila0.s(intent, "OnPlatformShareData", t7q0.class);
            if (t7q0Var2 == null) {
                n57.s("Error extracting parameters: shareData is null");
            } else {
                ArrayList arrayListC = Build.VERSION.SDK_INT >= 34 ? yh5.c(intent, "preSelectedUsers", w4i1.class) : intent.getParcelableArrayListExtra("preSelectedUsers");
                if (arrayListC != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : arrayListC) {
                        if (!u890.j(((w4i1) obj2).a, str)) {
                            arrayList.add(obj2);
                        }
                    }
                    listD1 = o7h.d1(arrayList, 9);
                }
                mofVar = new nof(strY0, t7q0Var2, listD1);
            }
        }
        if (mofVar != null) {
            hrn0Var = new hrn0(kof.class, mofVar, new b6w0(false));
        }
        fta ftaVar = (fta) ru9Var.d;
        this.b = (byte) 2;
        Object objU = ftaVar.u(intent, hrn0Var, this);
        return objU == d9nVar ? d9nVar : objU;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    private final Object h(Object obj) {
        Object next;
        tcd0 tcd0Var;
        tcd0 tcd0Var2;
        xsf1 xsf1Var;
        asf asfVar = (asf) this.d;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            mdd0 mdd0Var = asfVar.e;
            List listSingletonList = Collections.singletonList((String) this.e);
            this.b = (byte) 1;
            obj = mdd0Var.f(listSingletonList, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tcd0Var2 = (tcd0) this.c;
            hm5.M(obj);
        }
        xsf1Var = (xsf1) ((zlj0) obj).a();
        if (xsf1Var != null) {
            return new ahd0(tcd0Var2.d, xsf1Var.a, xsf1Var.b, tcd0Var2.a, tcd0Var2.b, tcd0Var2.c);
        }
        return bhd0.a;
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ucd0) next).b == null);
        ucd0 ucd0Var = (ucd0) next;
        if (ucd0Var != null && (tcd0Var = ucd0Var.b) != null) {
            tcd0 tcd0Var3 = tcd0Var.a.length() > 0 ? tcd0Var : null;
            if (tcd0Var3 != null) {
                btf1 btf1Var = asfVar.g;
                String str = tcd0Var3.a;
                this.c = tcd0Var3;
                this.b = (byte) 2;
                obj = btf1Var.a(str, "listening-activity-toolbar", this, false);
                if (obj != d9nVar) {
                    tcd0Var2 = tcd0Var3;
                    xsf1Var = (xsf1) ((zlj0) obj).a();
                    if (xsf1Var != null) {
                        return new ahd0(tcd0Var2.d, xsf1Var.a, xsf1Var.b, tcd0Var2.a, tcd0Var2.b, tcd0Var2.c);
                    }
                }
                return d9nVar;
            }
        }
        return bhd0.a;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ea A[RETURN] */
    private final Object i(Object obj) {
        asf asfVar = (asf) this.e;
        nsw0 nsw0Var = (nsw0) this.d;
        byte b = this.b;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        trf trfVar = (wrf) this.c;
        boolean z = trfVar instanceof trf;
        d9n d9nVar = d9n.a;
        if (z) {
            trf trfVar2 = trfVar;
            if (trfVar2.c) {
                String str = trfVar2.a.a;
                this.d = null;
                this.b = (byte) 1;
                Object objCollect = hu20.c(new m441(new yrf(asfVar, lnmVar, (byte) 0)), new vs0(asfVar, str, lnmVar, (byte) 23)).collect(new zrf(nsw0Var, (byte) 0), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            }
        }
        if (trfVar instanceof urf) {
            urf urfVar = (urf) trfVar;
            if (urfVar.e) {
                List list = urfVar.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (u890.j(((jwm) obj2).c, cwm.a)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w4i1 w4i1Var = ((jwm) it.next()).a;
                    arrayList2.add(new mmr0(w4i1Var.a, w4i1Var.b));
                }
                this.d = null;
                this.b = (byte) 2;
                Object objCollect2 = hu20.c(new m441(new yrf(asfVar, lnmVar, b2)), new hsc(arrayList2, asfVar, (lnm) null, (byte) 25)).collect(new zrf(nsw0Var, (byte) 1), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r0.j(r16) == r13) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object j(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.j(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8 A[Catch: Exception -> 0x00d3, CancellationException -> 0x00e3, TryCatch #2 {CancellationException -> 0x00e3, Exception -> 0x00d3, blocks: (B:9:0x0022, B:55:0x00c2, B:56:0x00c5, B:13:0x002d, B:51:0x00b1, B:14:0x0032, B:45:0x009e, B:15:0x0037, B:32:0x006e, B:16:0x003b, B:39:0x008a, B:19:0x0042, B:27:0x0059, B:28:0x005e, B:29:0x005f, B:36:0x007b, B:42:0x0095, B:46:0x00a2, B:48:0x00a8, B:52:0x00b5), top: B:63:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5 A[Catch: Exception -> 0x00d3, CancellationException -> 0x00e3, TryCatch #2 {CancellationException -> 0x00e3, Exception -> 0x00d3, blocks: (B:9:0x0022, B:55:0x00c2, B:56:0x00c5, B:13:0x002d, B:51:0x00b1, B:14:0x0032, B:45:0x009e, B:15:0x0037, B:32:0x006e, B:16:0x003b, B:39:0x008a, B:19:0x0042, B:27:0x0059, B:28:0x005e, B:29:0x005f, B:36:0x007b, B:42:0x0095, B:46:0x00a2, B:48:0x00a8, B:52:0x00b5), top: B:63:0x0016 }] */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
    
        if (r12 == r3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m(java.lang.Object r12) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0.emit(r7, r6) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r0.emit(r7, r6) == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.dt71 r0 = (p.dt71) r0
            java.lang.Object r1 = r6.d
            p.i8g1 r1 = (p.i8g1) r1
            byte r2 = r6.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            p.hm5.M(r7)
            goto L62
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r3
        L1d:
            p.hm5.M(r7)
            goto L3f
        L21:
            p.hm5.M(r7)
            boolean r7 = r1 instanceof p.g8g1
            p.d9n r2 = p.d9n.a
            if (r7 == 0) goto L4a
            p.qog r7 = new p.qog
            r3 = r1
            p.g8g1 r3 = (p.g8g1) r3
            int r3 = r3.a
            r7.<init>(r3)
            r6.d = r1
            r6.b = r5
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r2) goto L3f
            goto L61
        L3f:
            java.lang.Object r6 = r6.e
            p.n811 r6 = (p.n811) r6
            p.g8g1 r1 = (p.g8g1) r1
            int r7 = r1.a
            r6.a = r7
            goto L62
        L4a:
            boolean r7 = r1 instanceof p.h8g1
            if (r7 == 0) goto L62
            p.sog r7 = new p.sog
            p.h8g1 r1 = (p.h8g1) r1
            java.lang.String r1 = r1.a
            r7.<init>(r1)
            r6.d = r3
            r6.b = r4
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r2) goto L62
        L61:
            return r2
        L62:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r0.emit(r8, r7) == r5) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.d
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r8)
            goto L56
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1b:
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            goto L40
        L1f:
            r8 = move-exception
            goto L45
        L21:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.c     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            p.gmh r8 = (p.gmh) r8     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            java.lang.Object r1 = r7.e     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            r7.d = r0     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            r7.b = r3     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            p.o3r r3 = p.gmh.c     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            p.og5 r3 = new p.og5     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            r6 = 8
            r3.<init>(r8, r1, r4, r6)     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            java.lang.Object r8 = p.smo1.s(r3, r7)     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            if (r8 != r5) goto L40
            goto L55
        L40:
            p.o5e0 r8 = (p.o5e0) r8     // Catch: java.lang.Exception -> L1f java.util.concurrent.CancellationException -> L43
            goto L4b
        L43:
            r7 = move-exception
            goto L59
        L45:
            p.m5e0 r1 = new p.m5e0
            r1.<init>(r8)
            r8 = r1
        L4b:
            r7.d = r4
            r7.b = r2
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r5) goto L56
        L55:
            return r5
        L56:
            p.rih1 r7 = p.rih1.a
            return r7
        L59:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.p(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vs0 vs0Var = new vs0(obj2, lnmVar, (byte) 0);
                vs0Var.d = obj;
                return vs0Var;
            case 1:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 1);
            case 2:
                return new vs0((g23) this.d, (tv80) obj2, lnmVar, (byte) 2);
            case 3:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 3);
            case 4:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 4);
            case 5:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 5);
            case 6:
                vs0 vs0Var2 = new vs0(this.c, obj2, false, lnmVar, (byte) 6);
                vs0Var2.d = obj;
                return vs0Var2;
            case 7:
                return new vs0((ni7) this.d, (hi7) obj2, lnmVar, (byte) 7);
            case 8:
                vs0 vs0Var3 = new vs0(obj2, lnmVar, (byte) 8);
                vs0Var3.d = obj;
                return vs0Var3;
            case 9:
                vs0 vs0Var4 = new vs0(this.c, obj2, false, lnmVar, (byte) 9);
                vs0Var4.d = obj;
                return vs0Var4;
            case 10:
                vs0 vs0Var5 = new vs0(this.c, obj2, false, lnmVar, (byte) 10);
                vs0Var5.d = obj;
                return vs0Var5;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new vs0((wen0) this.d, (w5f1) obj2, lnmVar, (byte) 11);
            case grn1.d /* 12 */:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 12);
            case 13:
                vs0 vs0Var6 = new vs0(this.c, obj2, false, lnmVar, (byte) 13);
                vs0Var6.d = obj;
                return vs0Var6;
            case 14:
                vs0 vs0Var7 = new vs0(this.c, obj2, false, lnmVar, (byte) 14);
                vs0Var7.d = obj;
                return vs0Var7;
            case 15:
                vs0 vs0Var8 = new vs0(this.c, obj2, false, lnmVar, (byte) 15);
                vs0Var8.d = obj;
                return vs0Var8;
            case 16:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 16);
            case 17:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 17);
            case 18:
                vs0 vs0Var9 = new vs0(obj2, lnmVar, (byte) 18);
                vs0Var9.d = obj;
                return vs0Var9;
            case 19:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 19);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new vs0((y1c1) this.d, (kp5) obj2, lnmVar, (byte) 20);
            case 21:
                vs0 vs0Var10 = new vs0(this.c, lnmVar, (ynb0) obj2);
                vs0Var10.d = obj;
                return vs0Var10;
            case 22:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 22);
            case 23:
                return new vs0((asf) this.d, (String) obj2, lnmVar, (byte) 23);
            case 24:
                vs0 vs0Var11 = new vs0(this.c, obj2, false, lnmVar, (byte) 24);
                vs0Var11.d = obj;
                return vs0Var11;
            case 25:
                vs0 vs0Var12 = new vs0(obj2, lnmVar, (byte) 25);
                vs0Var12.d = obj;
                return vs0Var12;
            case 26:
                return new vs0(this.c, this.d, obj2, lnmVar, (byte) 26);
            case 27:
                vs0 vs0Var13 = new vs0(this.c, obj2, false, lnmVar, (byte) 27);
                vs0Var13.d = obj;
                return vs0Var13;
            case 28:
                vs0 vs0Var14 = new vs0(this.c, obj2, false, lnmVar, (byte) 28);
                vs0Var14.d = obj;
                return vs0Var14;
            default:
                vs0 vs0Var15 = new vs0(this.c, obj2, false, lnmVar, (byte) 29);
                vs0Var15.d = obj;
                return vs0Var15;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((tv80) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case grn1.d /* 12 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((ta0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 21:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((rih1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((i8g1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:554:0x060e */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:370:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:372:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:374:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:376:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:379:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:398:0x073a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0743  */
    /* JADX WARN: Code duplicated, block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0690, code lost:
    
        if (r1 == r10) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x07a0, code lost:
    
        if (r12.d(r2, r0, r18) == r10) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x07fc, code lost:
    
        if (p.b5p1.j(r0, r1, r18) == r10) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x0900, code lost:
    
        if (p.fc11.i(r1, r18) == r10) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x09da, code lost:
    
        if (r1 == r10) goto L544;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vs0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs0(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs0(Object obj, Object obj2, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(Object obj, lnm lnmVar, ynb0 ynb0Var) {
        super(2, lnmVar);
        this.a = (byte) 21;
        this.c = obj;
        this.e = ynb0Var;
    }
}
