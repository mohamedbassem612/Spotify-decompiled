package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.wrapped.v1.proto.RiveAnimation;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Flowable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rzu extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzu(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[RETURN] */
    private final Object e(Object obj) {
        bg61 bg61Var;
        kx5 kx5Var = (kx5) this.e;
        int i = kx5Var.a;
        Context context = (Context) this.d;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            bg61Var = (bg61) this.c;
            String strK = u2o1.k(i);
            this.c = bg61Var;
            this.b = (byte) 1;
            obj = bg61Var.a(context, strK, this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            if (b == 3) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bg61Var = (bg61) this.c;
        hm5.M(obj);
        if (!((Boolean) obj).booleanValue()) {
            cy5 cy5Var = new cy5((ws40) this.f, kx5Var, (Bundle) null, 248);
            this.c = null;
            this.b = (byte) 2;
            if (bg61Var.b(context, cy5Var, this) == d9nVar) {
                return d9nVar;
            }
            return rih1Var;
        }
        cy5 cy5Var2 = (cy5) bg61Var.a.get(u2o1.k(i));
        this.c = null;
        this.b = (byte) 3;
        Object objG = cy5Var2.g(wx5.a, this);
        if (objG != d9nVar) {
            objG = rih1Var;
        }
        if (objG == d9nVar) {
            return d9nVar;
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[RETURN] */
    private final Object g(Object obj) {
        bg61 bg61Var;
        bg61 bg61Var2;
        Object objH;
        kx5 kx5Var = (kx5) this.e;
        GlanceRemoteViewsService glanceRemoteViewsService = ((it40) this.d).a;
        byte b = this.b;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            bg61 bg61Var3 = (bg61) this.c;
            String strK = u2o1.k(kx5Var.a);
            this.c = bg61Var3;
            this.b = (byte) 1;
            Object objA = bg61Var3.a(glanceRemoteViewsService, strK, this);
            if (objA != d9nVar) {
                bg61Var = bg61Var3;
                obj = objA;
            }
            return d9nVar;
        }
        if (b == 1) {
            bg61Var = (bg61) this.c;
            hm5.M(obj);
        } else {
            if (b != 2) {
                if (b == 3) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bg61Var2 = (bg61) this.c;
            hm5.M(obj);
        }
        cy5 cy5Var = (cy5) bg61Var2.a.get(u2o1.k(kx5Var.a));
        this.c = null;
        this.b = (byte) 3;
        objH = cy5Var.h(this);
        if (objH != d9nVar) {
            return d9nVar;
        }
        return objH;
        if (((Boolean) obj).booleanValue()) {
            return null;
        }
        cy5 cy5Var2 = new cy5((ws40) this.f, kx5Var, (Bundle) null, 252);
        this.c = bg61Var;
        this.b = (byte) 2;
        if (bg61Var.b(glanceRemoteViewsService, cy5Var2, this) != d9nVar) {
            bg61Var2 = bg61Var;
            cy5 cy5Var3 = (cy5) bg61Var2.a.get(u2o1.k(kx5Var.a));
            this.c = null;
            this.b = (byte) 3;
            objH = cy5Var3.h(this);
            if (objH != d9nVar) {
                return objH;
            }
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[Catch: all -> 0x0043, CancellationException -> 0x0155, PHI: r12
      0x006e: PHI (r12v10 java.lang.Object) = (r12v9 java.lang.Object), (r12v0 java.lang.Object) binds: [B:28:0x006a, B:19:0x003f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0155, all -> 0x0043, blocks: (B:19:0x003f, B:30:0x006e, B:27:0x005c), top: B:69:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[PHI: r2 r12
      0x0090: PHI (r2v5 p.goe) = (r2v4 p.goe), (r2v15 p.goe) binds: [B:32:0x008c, B:16:0x002d] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r12v14 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:32:0x008c, B:16:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[LOOP:1: B:43:0x00d5->B:45:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104 A[Catch: all -> 0x0026, CancellationException -> 0x013f, TRY_ENTER, TryCatch #4 {CancellationException -> 0x013f, all -> 0x0026, blocks: (B:10:0x0021, B:54:0x0116, B:51:0x0104), top: B:69:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116 A[Catch: all -> 0x0026, CancellationException -> 0x013f, PHI: r12
      0x0116: PHI (r12v20 java.lang.Object) = (r12v18 java.lang.Object), (r12v0 java.lang.Object) binds: [B:52:0x0113, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {CancellationException -> 0x013f, all -> 0x0026, blocks: (B:10:0x0021, B:54:0x0116, B:51:0x0104), top: B:69:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00a1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final Object h(Object obj) {
        goe goeVar;
        ArrayList arrayList;
        Iterator it;
        gh50 gh50Var;
        jwm jwmVar;
        gh50 gh50Var2;
        zg50 zg50Var = (zg50) this.e;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            try {
                switch (b) {
                    case 0:
                        hm5.M(obj);
                        this.c = vr20Var;
                        this.b = (byte) 1;
                        if (vr20Var.emit(hh50.a, this) != d9nVar) {
                            bfd bfdVar = zg50Var.a;
                            String str = (String) this.f;
                            this.c = vr20Var;
                            this.b = (byte) 2;
                            obj = bfdVar.d(str, this);
                            if (obj == d9nVar) {
                                goeVar = (goe) obj;
                                Flowable flowable = zg50Var.c;
                                vbm[] vbmVarArr = q601.a;
                                kge kgeVar = new kge(flowable);
                                afv afvVar = new afv(2, null, (byte) 18);
                                this.c = vr20Var;
                                this.d = goeVar;
                                this.b = (byte) 4;
                                obj = b5p1.j(kgeVar, afvVar, this);
                                if (obj != d9nVar) {
                                    String str2 = ((th61) obj).a;
                                    List list = goeVar.e;
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj2 : list) {
                                        jwmVar = (jwm) obj2;
                                        if (!u890.j(jwmVar.c, cwm.a) && !u890.j(jwmVar.a.a, str2)) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                    it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((jwm) it.next()).a.a);
                                    }
                                    if (arrayList.isEmpty()) {
                                        gh50Var = new gh50(z6x.a);
                                        this.c = null;
                                        this.d = null;
                                        this.b = (byte) 5;
                                        if (vr20Var.emit(gh50Var, this) == d9nVar) {
                                            return rih1Var;
                                        }
                                    } else {
                                        vcd0 vcd0Var = zg50Var.b;
                                        this.c = vr20Var;
                                        this.d = null;
                                        this.b = (byte) 6;
                                        obj = ((mdd0) vcd0Var).d(arrayList, this);
                                        if (obj == d9nVar) {
                                            gh50Var2 = new gh50((List) obj);
                                            this.c = null;
                                            this.d = null;
                                            this.b = (byte) 8;
                                            if (vr20Var.emit(gh50Var2, this) == d9nVar) {
                                                return rih1Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return d9nVar;
                    case 1:
                        hm5.M(obj);
                        bfd bfdVar2 = zg50Var.a;
                        String str3 = (String) this.f;
                        this.c = vr20Var;
                        this.b = (byte) 2;
                        obj = bfdVar2.d(str3, this);
                        if (obj == d9nVar) {
                            goeVar = (goe) obj;
                            Flowable flowable2 = zg50Var.c;
                            vbm[] vbmVarArr2 = q601.a;
                            kge kgeVar2 = new kge(flowable2);
                            afv afvVar2 = new afv(2, null, (byte) 18);
                            this.c = vr20Var;
                            this.d = goeVar;
                            this.b = (byte) 4;
                            obj = b5p1.j(kgeVar2, afvVar2, this);
                            if (obj != d9nVar) {
                                String str4 = ((th61) obj).a;
                                List list2 = goeVar.e;
                                ArrayList arrayList3 = new ArrayList();
                                while (r2.hasNext()) {
                                    jwmVar = (jwm) obj2;
                                    if (!u890.j(jwmVar.c, cwm.a)) {
                                    }
                                }
                                arrayList = new ArrayList(q7h.U(arrayList3, 10));
                                it = arrayList3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((jwm) it.next()).a.a);
                                }
                                if (arrayList.isEmpty()) {
                                    gh50Var = new gh50(z6x.a);
                                    this.c = null;
                                    this.d = null;
                                    this.b = (byte) 5;
                                    if (vr20Var.emit(gh50Var, this) == d9nVar) {
                                        return rih1Var;
                                    }
                                } else {
                                    vcd0 vcd0Var2 = zg50Var.b;
                                    this.c = vr20Var;
                                    this.d = null;
                                    this.b = (byte) 6;
                                    obj = ((mdd0) vcd0Var2).d(arrayList, this);
                                    if (obj == d9nVar) {
                                        gh50Var2 = new gh50((List) obj);
                                        this.c = null;
                                        this.d = null;
                                        this.b = (byte) 8;
                                        if (vr20Var.emit(gh50Var2, this) == d9nVar) {
                                            return rih1Var;
                                        }
                                    }
                                }
                            }
                        }
                        return d9nVar;
                    case 2:
                        hm5.M(obj);
                        goeVar = (goe) obj;
                        Flowable flowable3 = zg50Var.c;
                        vbm[] vbmVarArr3 = q601.a;
                        kge kgeVar3 = new kge(flowable3);
                        afv afvVar3 = new afv(2, null, (byte) 18);
                        this.c = vr20Var;
                        this.d = goeVar;
                        this.b = (byte) 4;
                        obj = b5p1.j(kgeVar3, afvVar3, this);
                        if (obj != d9nVar) {
                            String str5 = ((th61) obj).a;
                            List list3 = goeVar.e;
                            ArrayList arrayList4 = new ArrayList();
                            while (r2.hasNext()) {
                                jwmVar = (jwm) obj2;
                                if (!u890.j(jwmVar.c, cwm.a)) {
                                }
                            }
                            arrayList = new ArrayList(q7h.U(arrayList4, 10));
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((jwm) it.next()).a.a);
                            }
                            if (arrayList.isEmpty()) {
                                gh50Var = new gh50(z6x.a);
                                this.c = null;
                                this.d = null;
                                this.b = (byte) 5;
                                if (vr20Var.emit(gh50Var, this) == d9nVar) {
                                    return rih1Var;
                                }
                            } else {
                                vcd0 vcd0Var3 = zg50Var.b;
                                this.c = vr20Var;
                                this.d = null;
                                this.b = (byte) 6;
                                obj = ((mdd0) vcd0Var3).d(arrayList, this);
                                if (obj == d9nVar) {
                                    gh50Var2 = new gh50((List) obj);
                                    this.c = null;
                                    this.d = null;
                                    this.b = (byte) 8;
                                    if (vr20Var.emit(gh50Var2, this) == d9nVar) {
                                        return rih1Var;
                                    }
                                }
                            }
                        }
                        return d9nVar;
                    case 3:
                        hm5.M(obj);
                        return rih1Var;
                    case 4:
                        goeVar = (goe) this.d;
                        hm5.M(obj);
                        String str6 = ((th61) obj).a;
                        List list4 = goeVar.e;
                        ArrayList arrayList5 = new ArrayList();
                        while (r2.hasNext()) {
                            jwmVar = (jwm) obj2;
                            if (!u890.j(jwmVar.c, cwm.a)) {
                            }
                        }
                        arrayList = new ArrayList(q7h.U(arrayList5, 10));
                        it = arrayList5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jwm) it.next()).a.a);
                        }
                        if (arrayList.isEmpty()) {
                            gh50Var = new gh50(z6x.a);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 5;
                            if (vr20Var.emit(gh50Var, this) == d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            vcd0 vcd0Var4 = zg50Var.b;
                            this.c = vr20Var;
                            this.d = null;
                            this.b = (byte) 6;
                            obj = ((mdd0) vcd0Var4).d(arrayList, this);
                            if (obj == d9nVar) {
                                gh50Var2 = new gh50((List) obj);
                                this.c = null;
                                this.d = null;
                                this.b = (byte) 8;
                                if (vr20Var.emit(gh50Var2, this) == d9nVar) {
                                    return rih1Var;
                                }
                            }
                        }
                        return d9nVar;
                    case 5:
                        hm5.M(obj);
                        return rih1Var;
                    case 6:
                        hm5.M(obj);
                        gh50Var2 = new gh50((List) obj);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 8;
                        if (vr20Var.emit(gh50Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    case 7:
                        hm5.M(obj);
                        return rih1Var;
                    case 8:
                        hm5.M(obj);
                        return rih1Var;
                    default:
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                fh50 fh50Var = new fh50(th);
                this.c = null;
                this.d = null;
                this.b = (byte) 7;
                if (vr20Var.emit(fh50Var, this) == d9nVar) {
                    return d9nVar;
                }
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            fh50 fh50Var2 = new fh50(th2);
            this.c = null;
            this.d = null;
            this.b = (byte) 3;
            if (vr20Var.emit(fh50Var2, this) == d9nVar) {
                return d9nVar;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object i(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L50
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L43
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.rj50 r7 = (p.rj50) r7
            p.ynb0 r7 = r7.e
            java.lang.Object r7 = r7.get()
            p.qj50 r7 = (p.qj50) r7
            java.lang.Object r1 = r6.f
            p.sj50 r1 = (p.sj50) r1
            r6.c = r4
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.b(r1, r6)
            if (r7 != r5) goto L43
            goto L4f
        L43:
            r6.c = r4
            r6.d = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L50
        L4f:
            return r5
        L50:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.i(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[Catch: all -> 0x0037, CancellationException -> 0x0133, PHI: r12
      0x0062: PHI (r12v8 java.lang.Object) = (r12v7 java.lang.Object), (r12v0 java.lang.Object) binds: [B:22:0x005e, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0133, all -> 0x0037, blocks: (B:13:0x0033, B:24:0x0062, B:21:0x0050), top: B:54:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[PHI: r2 r12
      0x0084: PHI (r2v5 p.goe) = (r2v4 p.goe), (r2v15 p.goe) binds: [B:26:0x0080, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0084: PHI (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:26:0x0080, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[LOOP:1: B:37:0x00c9->B:39:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0095 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private final Object j(Object obj) {
        goe goeVar;
        ArrayList arrayList;
        Iterator it;
        mr20 mr20VarK;
        wem wemVar;
        hk50 hk50Var;
        jwm jwmVar;
        tj50 tj50Var = (tj50) this.e;
        vr20 vr20Var = (vr20) this.c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            switch (b) {
                case 0:
                    hm5.M(obj);
                    this.c = vr20Var;
                    this.b = (byte) 1;
                    if (vr20Var.emit(ik50.a, this) != d9nVar) {
                        bfd bfdVar = tj50Var.a;
                        String str = (String) this.f;
                        this.c = vr20Var;
                        this.b = (byte) 2;
                        obj = bfdVar.d(str, this);
                        if (obj == d9nVar) {
                            goeVar = (goe) obj;
                            Flowable flowable = tj50Var.c;
                            vbm[] vbmVarArr = q601.a;
                            kge kgeVar = new kge(flowable);
                            afv afvVar = new afv(2, null, (byte) 19);
                            this.c = vr20Var;
                            this.d = goeVar;
                            this.b = (byte) 4;
                            obj = b5p1.j(kgeVar, afvVar, this);
                            if (obj != d9nVar) {
                                String str2 = ((th61) obj).a;
                                List list = goeVar.e;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj2 : list) {
                                    jwmVar = (jwm) obj2;
                                    if (!u890.j(jwmVar.c, cwm.a) && !u890.j(jwmVar.a.a, str2)) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                arrayList = new ArrayList(q7h.U(arrayList2, 10));
                                it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(((jwm) it.next()).a.a);
                                }
                                if (arrayList.isEmpty()) {
                                    hk50Var = new hk50(z6x.a);
                                    this.c = null;
                                    this.d = null;
                                    this.b = (byte) 5;
                                    if (vr20Var.emit(hk50Var, this) != d9nVar) {
                                        return rih1Var;
                                    }
                                } else {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    l811 l811Var = new l811();
                                    mr20VarK = ((mdd0) tj50Var.b).k(arrayList);
                                    wemVar = new wem((byte) 25, l811Var, linkedHashMap, vr20Var);
                                    this.c = null;
                                    this.d = null;
                                    this.b = (byte) 6;
                                    if (mr20VarK.collect(wemVar, this) != d9nVar) {
                                        return rih1Var;
                                    }
                                }
                            }
                        }
                    }
                    return d9nVar;
                case 1:
                    hm5.M(obj);
                    bfd bfdVar2 = tj50Var.a;
                    String str3 = (String) this.f;
                    this.c = vr20Var;
                    this.b = (byte) 2;
                    obj = bfdVar2.d(str3, this);
                    if (obj == d9nVar) {
                        goeVar = (goe) obj;
                        Flowable flowable2 = tj50Var.c;
                        vbm[] vbmVarArr2 = q601.a;
                        kge kgeVar2 = new kge(flowable2);
                        afv afvVar2 = new afv(2, null, (byte) 19);
                        this.c = vr20Var;
                        this.d = goeVar;
                        this.b = (byte) 4;
                        obj = b5p1.j(kgeVar2, afvVar2, this);
                        if (obj != d9nVar) {
                            String str4 = ((th61) obj).a;
                            List list2 = goeVar.e;
                            ArrayList arrayList3 = new ArrayList();
                            while (r2.hasNext()) {
                                jwmVar = (jwm) obj2;
                                if (!u890.j(jwmVar.c, cwm.a)) {
                                }
                            }
                            arrayList = new ArrayList(q7h.U(arrayList3, 10));
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((jwm) it.next()).a.a);
                            }
                            if (arrayList.isEmpty()) {
                                hk50Var = new hk50(z6x.a);
                                this.c = null;
                                this.d = null;
                                this.b = (byte) 5;
                                if (vr20Var.emit(hk50Var, this) != d9nVar) {
                                    return rih1Var;
                                }
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                l811 l811Var2 = new l811();
                                mr20VarK = ((mdd0) tj50Var.b).k(arrayList);
                                wemVar = new wem((byte) 25, l811Var2, linkedHashMap2, vr20Var);
                                this.c = null;
                                this.d = null;
                                this.b = (byte) 6;
                                if (mr20VarK.collect(wemVar, this) != d9nVar) {
                                    return rih1Var;
                                }
                            }
                        }
                    }
                    return d9nVar;
                case 2:
                    hm5.M(obj);
                    goeVar = (goe) obj;
                    Flowable flowable3 = tj50Var.c;
                    vbm[] vbmVarArr3 = q601.a;
                    kge kgeVar3 = new kge(flowable3);
                    afv afvVar3 = new afv(2, null, (byte) 19);
                    this.c = vr20Var;
                    this.d = goeVar;
                    this.b = (byte) 4;
                    obj = b5p1.j(kgeVar3, afvVar3, this);
                    if (obj != d9nVar) {
                        String str5 = ((th61) obj).a;
                        List list3 = goeVar.e;
                        ArrayList arrayList4 = new ArrayList();
                        while (r2.hasNext()) {
                            jwmVar = (jwm) obj2;
                            if (!u890.j(jwmVar.c, cwm.a)) {
                            }
                        }
                        arrayList = new ArrayList(q7h.U(arrayList4, 10));
                        it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((jwm) it.next()).a.a);
                        }
                        if (arrayList.isEmpty()) {
                            hk50Var = new hk50(z6x.a);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 5;
                            if (vr20Var.emit(hk50Var, this) != d9nVar) {
                                return rih1Var;
                            }
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            l811 l811Var3 = new l811();
                            mr20VarK = ((mdd0) tj50Var.b).k(arrayList);
                            wemVar = new wem((byte) 25, l811Var3, linkedHashMap3, vr20Var);
                            this.c = null;
                            this.d = null;
                            this.b = (byte) 6;
                            if (mr20VarK.collect(wemVar, this) != d9nVar) {
                                return rih1Var;
                            }
                        }
                    }
                    return d9nVar;
                case 3:
                    hm5.M(obj);
                    return rih1Var;
                case 4:
                    goeVar = (goe) this.d;
                    hm5.M(obj);
                    String str6 = ((th61) obj).a;
                    List list4 = goeVar.e;
                    ArrayList arrayList5 = new ArrayList();
                    while (r2.hasNext()) {
                        jwmVar = (jwm) obj2;
                        if (!u890.j(jwmVar.c, cwm.a)) {
                        }
                    }
                    arrayList = new ArrayList(q7h.U(arrayList5, 10));
                    it = arrayList5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((jwm) it.next()).a.a);
                    }
                    if (arrayList.isEmpty()) {
                        hk50Var = new hk50(z6x.a);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 5;
                        if (vr20Var.emit(hk50Var, this) != d9nVar) {
                            return d9nVar;
                        }
                        return rih1Var;
                    }
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    l811 l811Var4 = new l811();
                    mr20VarK = ((mdd0) tj50Var.b).k(arrayList);
                    wemVar = new wem((byte) 25, l811Var4, linkedHashMap4, vr20Var);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 6;
                    if (mr20VarK.collect(wemVar, this) != d9nVar) {
                        return d9nVar;
                    }
                    return rih1Var;
                case 5:
                    hm5.M(obj);
                    return rih1Var;
                case 6:
                    hm5.M(obj);
                    return rih1Var;
                default:
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gk50 gk50Var = new gk50(th);
            this.c = null;
            this.d = null;
            this.b = (byte) 3;
            if (vr20Var.emit(gk50Var, this) == d9nVar) {
                return d9nVar;
            }
        }
    }

    private final Object m(Object obj) {
        err0 err0Var = (hdn0) this.f;
        int i = ((zs70) this.c).c;
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            err0 err0Var2 = err0Var;
            if (i != err0Var2.s()) {
                err0Var2.t(i);
                iie1 iie1Var = (iie1) this.d;
                this.b = (byte) 1;
                iie1Var.f.t(i);
                xtb0 xtb0Var = iie1Var.a;
                df41 df41Var = xtb0.y;
                Object objK = xtb0Var.k(i, 0, this);
                if (objK != d9nVar) {
                    objK = rih1Var;
                }
                if (objK != d9nVar) {
                }
            }
        }
        if (b != 1) {
            if (b == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        jkr0 jkr0Var = (jkr0) this.e;
        this.b = (byte) 2;
        return jkr0.s(jkr0Var, i, this) == d9nVar ? d9nVar : rih1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (p.fn31.Y(r0, r1, r10) == r9) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.c
            r2 = r0
            p.wmy r2 = (p.wmy) r2
            byte r0 = r10.b
            r7 = 2
            r8 = 1
            r5 = 0
            p.d9n r9 = p.d9n.a
            if (r0 == 0) goto L21
            if (r0 == r8) goto L1d
            if (r0 != r7) goto L16
            p.hm5.M(r11)
            goto L63
        L16:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            r10 = 0
            return r10
        L1d:
            p.hm5.M(r11)     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            goto L40
        L21:
            p.hm5.M(r11)
            p.b3s r11 = p.b3s.c     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            p.piu r1 = new p.piu     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            java.lang.Object r0 = r10.d     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            r3 = r0
            android.net.Uri r3 = (android.net.Uri) r3     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            java.lang.Object r0 = r10.e     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            r4 = r0
            p.sx70 r4 = (p.sx70) r4     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            r6 = 27
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            r10.b = r8     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            java.lang.Object r11 = p.fn31.Y(r11, r1, r10)     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            if (r11 != r9) goto L40
            goto L62
        L40:
            android.net.Uri r11 = (android.net.Uri) r11     // Catch: java.lang.OutOfMemoryError -> L43 java.lang.SecurityException -> L46 java.io.IOException -> L49
            goto L4b
        L43:
            android.net.Uri r11 = android.net.Uri.EMPTY
            goto L4b
        L46:
            android.net.Uri r11 = android.net.Uri.EMPTY
            goto L4b
        L49:
            android.net.Uri r11 = android.net.Uri.EMPTY
        L4b:
            java.lang.Object r0 = r2.f
            p.q8n r0 = (p.q8n) r0
            p.y160 r1 = new p.y160
            java.lang.Object r2 = r10.f
            p.cir0 r2 = (p.cir0) r2
            r3 = 9
            r1.<init>(r11, r2, r5, r3)
            r10.b = r7
            java.lang.Object r10 = p.fn31.Y(r0, r1, r10)
            if (r10 != r9) goto L63
        L62:
            return r9
        L63:
            p.rih1 r10 = p.rih1.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[PHI: r9 r10
      0x0041: PHI (r9v2 p.m811) = (r9v0 p.m811), (r9v1 p.m811), (r9v1 p.m811), (r9v4 p.m811) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007e, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r10v2 p.c9n) = (r10v0 p.c9n), (r10v1 p.c9n), (r10v1 p.c9n), (r10v4 p.c9n) binds: [B:10:0x002f, B:15:0x0063, B:17:0x007e, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x005e A[PHI: r9 r10
      0x005e: PHI (r9v1 p.m811) = (r9v2 p.m811), (r9v3 p.m811) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x005e: PHI (r10v1 p.c9n) = (r10v2 p.c9n), (r10v3 p.c9n) binds: [B:12:0x005b, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0063 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object p(java.lang.Object r13) {
        /*
            r12 = this;
            byte r0 = r12.b
            r1 = 0
            r2 = 1
            r3 = 2
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r12.d
            p.m811 r0 = (p.m811) r0
            java.lang.Object r5 = r12.c
            p.c9n r5 = (p.c9n) r5
            p.hm5.M(r13)
            r9 = r0
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r1
        L21:
            java.lang.Object r0 = r12.d
            p.m811 r0 = (p.m811) r0
            java.lang.Object r5 = r12.c
            p.c9n r5 = (p.c9n) r5
            p.hm5.M(r13)
            r9 = r0
            r10 = r5
            goto L5e
        L2f:
            p.hm5.M(r13)
            java.lang.Object r13 = r12.c
            p.c9n r13 = (p.c9n) r13
            p.m811 r0 = new p.m811
            r0.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.a = r5
            r10 = r13
            r9 = r0
        L41:
            java.lang.Object r13 = r12.e
            r7 = r13
            p.ven0 r7 = (p.ven0) r7
            java.lang.Object r13 = r12.f
            r8 = r13
            p.db80 r8 = (p.db80) r8
            p.k95 r6 = new p.k95
            r11 = 3
            r6.<init>(r7, r8, r9, r10, r11)
            r12.c = r10
            r12.d = r9
            r12.b = r2
            java.lang.Object r13 = p.k5p1.x(r6, r12)
            if (r13 != r4) goto L5e
            goto L80
        L5e:
            float r13 = r9.a
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L41
            p.g030 r13 = new p.g030
            r0 = 7
            r13.<init>(r10, r0)
            p.m441 r13 = p.rwq.q(r13)
            p.o37 r0 = new p.o37
            r0.<init>(r3, r1, r2)
            r12.c = r10
            r12.d = r9
            r12.b = r3
            java.lang.Object r13 = p.b5p1.j(r13, r0, r12)
            if (r13 != r4) goto L41
        L80:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:26:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r12 == r9) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f
            p.ou80 r0 = (p.ou80) r0
            java.lang.Object r1 = r12.d
            p.p410 r1 = (p.p410) r1
            java.lang.Object r2 = r1.d
            p.st60 r2 = (p.st60) r2
            java.lang.Object r3 = r1.g
            p.g0l r3 = (p.g0l) r3
            byte r4 = r12.b
            p.rih1 r5 = p.rih1.a
            r6 = 1
            r7 = 0
            r8 = 2
            p.d9n r9 = p.d9n.a
            if (r4 == 0) goto L33
            if (r4 == r6) goto L2f
            if (r4 != r8) goto L29
            java.lang.Object r12 = r12.c
            p.p410 r12 = (p.p410) r12
            android.app.Activity r12 = (android.app.Activity) r12
            p.hm5.M(r13)
            goto L73
        L29:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r7
        L2f:
            p.hm5.M(r13)
            goto L5a
        L33:
            p.hm5.M(r13)
            r12.c = r1
            r12.b = r6
            p.ohd r13 = new p.ohd
            p.lnm r4 = p.aym.t(r12)
            r13.<init>(r6, r4)
            r13.t()
            java.lang.Object r4 = r1.e
            p.p4s r4 = (p.p4s) r4
            p.u4a0 r10 = new p.u4a0
            r11 = 0
            r10.<init>(r13, r11)
            r4.a(r0, r10)
            java.lang.Object r13 = r13.r()
            if (r13 != r9) goto L5a
            goto L72
        L5a:
            android.app.Activity r13 = (android.app.Activity) r13
            if (r13 == 0) goto L73
            java.lang.Object r13 = r1.f
            p.j5a1 r13 = (p.j5a1) r13
            r12.c = r7
            r12.b = r8
            p.xc71 r13 = r13.b
            java.lang.Object r12 = r13.a(r12)
            if (r12 != r9) goto L6f
            goto L70
        L6f:
            r12 = r5
        L70:
            if (r12 != r9) goto L73
        L72:
            return r9
        L73:
            p.spq0 r12 = p.hqq0.I(r3)
            boolean r13 = r12.c()
            if (r13 == 0) goto Lad
            java.lang.Object r13 = r12.b()
            p.l0l r13 = (p.l0l) r13
            boolean r1 = p.hqq0.c0(r13)
            if (r1 == 0) goto L8b
            r8 = r6
            goto L9f
        L8b:
            p.f0u r13 = p.hqq0.T(r13)
            int r13 = r13.ordinal()
            r1 = 4
            if (r13 == r1) goto L9f
            r1 = 10
            if (r13 == r1) goto L9f
            r1 = 11
            if (r13 == r1) goto L9f
            r8 = 3
        L9f:
            java.lang.Object r12 = r12.b()
            p.l0l r12 = (p.l0l) r12
            java.lang.String r12 = r12.j()
            r2.I(r8, r12, r0, r6)
            goto Lc0
        Lad:
            p.inr r3 = (p.inr) r3
            p.nnr r12 = r3.k()
            if (r12 == 0) goto Lc0
            boolean r13 = p.hqq0.c0(r12)
            if (r13 == 0) goto Lc0
            java.lang.String r12 = r12.a
            r2.I(r6, r12, r0, r6)
        Lc0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r0.a(r22) == r11) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object s(java.lang.Object r23) {
        /*
            r22 = this;
            r5 = r22
            java.lang.Object r0 = r5.f
            r6 = r0
            p.qxc0 r6 = (p.qxc0) r6
            java.lang.Object r0 = r5.c
            r7 = r0
            p.dxy r7 = (p.dxy) r7
            java.lang.Object r0 = r7.f
            r8 = r0
            p.iyc0 r8 = (p.iyc0) r8
            byte r0 = r5.b
            r9 = 3
            r10 = 2
            r1 = 1
            p.d9n r11 = p.d9n.a
            if (r0 == 0) goto L38
            if (r0 == r1) goto L32
            if (r0 == r10) goto L2c
            if (r0 != r9) goto L25
            p.hm5.M(r23)
            goto Lb0
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L2c:
            p.hm5.M(r23)
            r0 = r23
            goto L6d
        L32:
            p.hm5.M(r23)
            r0 = r23
            goto L57
        L38:
            p.hm5.M(r23)
            java.lang.Object r0 = r5.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r5.e
            java.lang.String r2 = (java.lang.String) r2
            r5.b = r1
            r1 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = r0
            r0 = r8
            p.xyc0 r0 = (p.xyc0) r0
            r3 = 0
            java.lang.Object r0 = r0.q(r1, r2, r3, r4, r5)
            if (r0 != r11) goto L57
            goto Laf
        L57:
            p.py21 r0 = (p.py21) r0
            r0.d()
            java.lang.Object r0 = r5.d
            java.lang.String r0 = (java.lang.String) r0
            r5.b = r10
            p.xyc0 r8 = (p.xyc0) r8
            p.ddd1 r1 = p.ddd1.c1
            java.lang.Object r0 = r8.u(r0, r1, r5)
            if (r0 != r11) goto L6d
            goto Laf
        L6d:
            p.py21 r0 = (p.py21) r0
            r0.d()
            java.lang.Object r0 = r7.d
            p.dg30 r0 = (p.dg30) r0
            java.lang.String r1 = r6.a
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 2131960141(0x7f13214d, float:1.9556942E38)
            java.lang.String r14 = r0.getString(r2, r1)
            java.lang.Object r0 = r7.g
            p.kt91 r0 = (p.kt91) r0
            p.er91 r12 = new p.er91
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.k(r12)
            p.wls0 r0 = r6.i
            p.wls0 r1 = p.wls0.c
            if (r0 != r1) goto Lb0
            java.lang.Object r0 = r7.b
            p.f1n0 r0 = (p.f1n0) r0
            r5.b = r9
            java.lang.Object r0 = r0.a(r5)
            if (r0 != r11) goto Lb0
        Laf:
            return r11
        Lb0:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[Catch: Exception -> 0x0028, CancellationException -> 0x007b, TryCatch #1 {CancellationException -> 0x007b, blocks: (B:10:0x0024, B:18:0x0047, B:20:0x004e, B:33:0x0075, B:23:0x0058, B:24:0x005c, B:26:0x0062, B:28:0x006c, B:31:0x0071, B:32:0x0074, B:14:0x002d), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: Exception -> 0x0028, CancellationException -> 0x007b, TryCatch #1 {CancellationException -> 0x007b, blocks: (B:10:0x0024, B:18:0x0047, B:20:0x004e, B:33:0x0075, B:23:0x0058, B:24:0x005c, B:26:0x0062, B:28:0x006c, B:31:0x0071, B:32:0x0074, B:14:0x002d), top: B:47:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x005c A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r0.emit(r8, r7) == r5) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object t(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r7.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            p.hm5.M(r8)
            goto L8d
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L1c:
            java.lang.Object r0 = r7.e
            p.vr20 r0 = (p.vr20) r0
            java.lang.Object r1 = r7.d
            p.vr20 r1 = (p.vr20) r1
            p.hm5.M(r8)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            goto L47
        L28:
            r0 = r1
            goto L7d
        L2a:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.f     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            p.res r8 = (p.res) r8     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            java.lang.Object r8 = r8.e     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            p.vcd0 r8 = (p.vcd0) r8     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            r7.c = r4     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            r7.d = r0     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            r7.e = r0     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            r7.b = r3     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            p.mdd0 r8 = (p.mdd0) r8     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            java.io.Serializable r8 = r8.b(r7)     // Catch: java.util.concurrent.CancellationException -> L7b java.lang.Exception -> L7d
            if (r8 != r5) goto L46
            goto L8c
        L46:
            r1 = r0
        L47:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            boolean r3 = r8 instanceof java.util.Collection     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            r6 = 0
            if (r3 == 0) goto L58
            r3 = r8
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            if (r3 == 0) goto L58
            goto L75
        L58:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
        L5c:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            if (r3 == 0) goto L75
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            p.sn7 r3 = (p.sn7) r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            boolean r3 = r3.b     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            if (r3 != 0) goto L5c
            int r6 = r6 + 1
            if (r6 < 0) goto L71
            goto L5c
        L71:
            p.p7h.S()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            throw r4     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
        L75:
            java.lang.Integer r8 = new java.lang.Integer     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            r8.<init>(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L7b
            goto L7e
        L7b:
            r7 = move-exception
            goto L90
        L7d:
            r8 = r4
        L7e:
            r7.c = r4
            r7.d = r4
            r7.e = r4
            r7.b = r2
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r5) goto L8d
        L8c:
            return r5
        L8d:
            p.rih1 r7 = p.rih1.a
            return r7
        L90:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        if (r2.emit(r10, r9) == r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r2.emit(r10, r9) == r8) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object u(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r9.d
            p.mdd0 r1 = (p.mdd0) r1
            java.lang.Object r2 = r9.c
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r9.b
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r3 == 0) goto L32
            if (r3 == r6) goto L2e
            if (r3 == r5) goto L27
            if (r3 != r4) goto L21
            p.hm5.M(r10)
            goto Lba
        L21:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L27:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            goto Lba
        L2c:
            r10 = move-exception
            goto L99
        L2e:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            goto L5b
        L32:
            p.hm5.M(r10)
            java.util.List r10 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r3 = r9.f     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.util.ArrayList r10 = p.mdd0.a(r3, r10)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            p.doi1 r3 = com.spotify.listeningactivity.v1.UsersSubscriptionRequest.p()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r3.n(r10)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            com.google.protobuf.h r10 = r3.build()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            com.spotify.listeningactivity.v1.UsersSubscriptionRequest r10 = (com.spotify.listeningactivity.v1.UsersSubscriptionRequest) r10     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            p.bed0 r1 = r1.b     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r9.c = r2     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r9.b = r6     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r10 = r1.i(r10, r9)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            if (r10 != r8) goto L5b
            goto Lb9
        L5b:
            com.spotify.listeningactivity.v1.UsersActivityResponse r10 = (com.spotify.listeningactivity.v1.UsersActivityResponse) r10     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            p.h290 r10 = r10.n()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.util.ArrayList r10 = p.mdd0.p(r10)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
        L69:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            if (r1 == 0) goto L7f
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r3 = r1
            p.ucd0 r3 = (p.ucd0) r3     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.lang.String r3 = r3.a     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            boolean r3 = p.u890.j(r3, r0)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            if (r3 == 0) goto L69
            goto L80
        L7f:
            r1 = r7
        L80:
            p.ucd0 r1 = (p.ucd0) r1     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            if (r1 != 0) goto L89
            p.ucd0 r1 = new p.ucd0     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r1.<init>(r0, r7)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
        L89:
            p.e331 r10 = new p.e331     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r10.<init>(r1)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r9.c = r2     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            r9.b = r5     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            java.lang.Object r9 = r2.emit(r10, r9)     // Catch: java.lang.Exception -> L2c java.util.concurrent.CancellationException -> Lbd
            if (r9 != r8) goto Lba
            goto Lb9
        L99:
            java.lang.String r0 = "BUZZ: ListeningActivityDataLoader.subscribe failure with exception: "
            java.lang.String r0 = p.ktd.i(r0, r10)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.spotify.base.java.logging.Logger.d(r0, r1)
            p.m231 r0 = new p.m231
            r0.<init>(r10)
            p.e331 r10 = new p.e331
            r10.<init>(r0)
            r9.c = r7
            r9.b = r4
            java.lang.Object r9 = r2.emit(r10, r9)
            if (r9 != r8) goto Lba
        Lb9:
            return r8
        Lba:
            p.rih1 r9 = p.rih1.a
            return r9
        Lbd:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.u(java.lang.Object):java.lang.Object");
    }

    private final Object v(Object obj) {
        Object obj2;
        se8 se8Var = (se8) this.f;
        SceneTemplate.ListeningAgeContent.Card1 card1 = (SceneTemplate.ListeningAgeContent.Card1) this.e;
        ni31 ni31Var = (ni31) this.d;
        byte b = this.b;
        Serializable serializable = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = this.c;
                hm5.M(obj);
            }
            return new mmr0(obj2, obj);
        }
        hm5.M(obj);
        RiveAnimation riveAnimationO = card1.o();
        ti31 ti31Var = se8Var.d;
        kj31 kj31Var = se8Var.e;
        this.d = ni31Var;
        this.b = (byte) 1;
        obj = mym.m(riveAnimationO, ti31Var, kj31Var, ni31Var, this);
        if (obj != serializable) {
        }
        return serializable;
        RiveAnimation riveAnimationO2 = card1.o();
        cxc cxcVar = se8Var.f;
        this.d = null;
        this.c = obj;
        this.b = (byte) 2;
        Serializable serializableN = mym.n(riveAnimationO2, cxcVar, ni31Var, this);
        if (serializableN != serializable) {
            Object obj3 = obj;
            obj = serializableN;
            obj2 = obj3;
            return new mmr0(obj2, obj);
        }
        return serializable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r0.emit(r7, r6) == r5) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object w(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.c
            p.vr20 r0 = (p.vr20) r0
            byte r1 = r6.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            p.hm5.M(r7)
            goto L4a
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.d
            p.vr20 r0 = (p.vr20) r0
            p.hm5.M(r7)
            goto L3d
        L23:
            p.hm5.M(r7)
            java.lang.Object r7 = r6.e
            p.vjd0 r7 = (p.vjd0) r7
            p.cfd r7 = r7.c
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            r6.c = r4
            r6.d = r0
            r6.b = r3
            java.lang.Object r7 = r7.w(r1, r6)
            if (r7 != r5) goto L3d
            goto L49
        L3d:
            r6.c = r4
            r6.d = r4
            r6.b = r2
            java.lang.Object r6 = r0.emit(r7, r6)
            if (r6 != r5) goto L4a
        L49:
            return r5
        L4a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.w(java.lang.Object):java.lang.Object");
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                rzu rzuVar = new rzu((hti0) this.d, (szu) this.e, (rzq) obj2, lnmVar, (byte) 0);
                rzuVar.c = obj;
                return rzuVar;
            case 1:
                rzu rzuVar2 = new rzu((m5v) obj2, lnmVar, (byte) 1);
                rzuVar2.c = obj;
                return rzuVar2;
            case 2:
                return new rzu((c380) this.c, (List) this.d, (xtb0) this.e, (ven0) obj2, lnmVar, (byte) 2);
            case 3:
                rzu rzuVar3 = new rzu((qj0) this.e, (okv) obj2, lnmVar, (byte) 3);
                rzuVar3.c = obj;
                return rzuVar3;
            case 4:
                return new rzu((htv) this.c, (bw91) this.d, (iu30) this.e, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                rzu rzuVar4 = new rzu((k9w) this.e, (mmw) obj2, lnmVar, (byte) 5);
                rzuVar4.c = obj;
                return rzuVar4;
            case 6:
                rzu rzuVar5 = new rzu((List) this.e, (ji0) obj2, lnmVar, (byte) 6);
                rzuVar5.d = obj;
                return rzuVar5;
            case 7:
                rzu rzuVar6 = new rzu((r0x) this.e, (qrd1) obj2, lnmVar, (byte) 7);
                rzuVar6.c = obj;
                return rzuVar6;
            case 8:
                rzu rzuVar7 = new rzu((vgr) this.e, (qrd1) obj2, lnmVar, (byte) 8);
                rzuVar7.c = obj;
                return rzuVar7;
            case 9:
                rzu rzuVar8 = new rzu((pbq) this.e, (String) obj2, lnmVar, (byte) 9);
                rzuVar8.c = obj;
                return rzuVar8;
            case 10:
                rzu rzuVar9 = new rzu((q6z) this.e, (i1z) obj2, lnmVar, (byte) 10);
                rzuVar9.c = obj;
                return rzuVar9;
            case 11:
                return new rzu((Uri) this.c, (ua10) this.d, (tv80) this.e, (String) obj2, lnmVar, (byte) 11);
            case 12:
                return new rzu((xu30) this.d, (g2z) this.e, (String) obj2, lnmVar, (byte) 12);
            case 13:
                rzu rzuVar10 = new rzu((kjm) this.d, (bo30) this.e, (wn30) obj2, lnmVar, (byte) 13);
                rzuVar10.c = obj;
                return rzuVar10;
            case 14:
                rzu rzuVar11 = new rzu((iu30) this.e, (iu30) obj2, lnmVar, (byte) 14);
                rzuVar11.c = obj;
                return rzuVar11;
            case 15:
                rzu rzuVar12 = new rzu((Context) this.d, (kx5) this.e, (ws40) obj2, lnmVar, (byte) 15);
                rzuVar12.c = obj;
                return rzuVar12;
            case 16:
                rzu rzuVar13 = new rzu((it40) this.d, (kx5) this.e, (ws40) obj2, lnmVar, (byte) 16);
                rzuVar13.c = obj;
                return rzuVar13;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                rzu rzuVar14 = new rzu((zg50) this.e, (String) obj2, lnmVar, (byte) 17);
                rzuVar14.c = obj;
                return rzuVar14;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                rzu rzuVar15 = new rzu((rj50) this.e, (sj50) obj2, lnmVar, (byte) 18);
                rzuVar15.c = obj;
                return rzuVar15;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                rzu rzuVar16 = new rzu((tj50) this.e, (String) obj2, lnmVar, (byte) 19);
                rzuVar16.c = obj;
                return rzuVar16;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new rzu((zs70) this.c, (iie1) this.d, (jkr0) this.e, (hdn0) obj2, lnmVar, (byte) 20);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new rzu((wmy) this.c, (Uri) this.d, (sx70) this.e, (cir0) obj2, lnmVar, (byte) 21);
            case 22:
                rzu rzuVar17 = new rzu((ven0) this.e, (db80) obj2, lnmVar, (byte) 22);
                rzuVar17.c = obj;
                return rzuVar17;
            case 23:
                return new rzu((p410) this.d, (String) this.e, (ou80) obj2, lnmVar, (byte) 23);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new rzu((dxy) this.c, (String) this.d, (String) this.e, (qxc0) obj2, lnmVar, (byte) 24);
            case 25:
                rzu rzuVar18 = new rzu((res) obj2, lnmVar, (byte) 25);
                rzuVar18.c = obj;
                return rzuVar18;
            case 26:
                rzu rzuVar19 = new rzu((mdd0) this.d, (String) this.e, (String) obj2, lnmVar, (byte) 26);
                rzuVar19.c = obj;
                return rzuVar19;
            case 27:
                rzu rzuVar20 = new rzu((SceneTemplate.ListeningAgeContent.Card1) this.e, (se8) obj2, lnmVar, (byte) 27);
                rzuVar20.d = obj;
                return rzuVar20;
            case 28:
                rzu rzuVar21 = new rzu((vjd0) this.e, (String) obj2, lnmVar, (byte) 28);
                rzuVar21.c = obj;
                return rzuVar21;
            default:
                rzu rzuVar22 = new rzu((et90) this.e, (fmd0) obj2, lnmVar, (byte) 29);
                rzuVar22.c = obj;
                return rzuVar22;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 15:
                return create((bg61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((bg61) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9nVar;
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((ni31) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:384:0x07b5 A[PHI: r0 r3
      0x07b5: PHI (r0v23 p.p811) = (r0v15 p.p811), (r0v30 p.p811) binds: [B:383:0x07b2, B:407:0x0837] A[DONT_GENERATE, DONT_INLINE]
      0x07b5: PHI (r3v13 p.c9n) = (r3v9 p.c9n), (r3v15 p.c9n) binds: [B:383:0x07b2, B:407:0x0837] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:390:0x07e4 A[PHI: r4
      0x07e4: PHI (r4v11 p.c9n) = (r4v5 p.c9n), (r4v5 p.c9n), (r4v5 p.c9n), (r4v9 p.c9n), (r4v14 p.c9n) binds: [B:416:0x0853, B:418:0x085f, B:412:0x084c, B:423:0x0871, B:389:0x07e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:392:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:394:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:397:0x0803  */
    /* JADX WARN: Code duplicated, block: B:402:0x0813  */
    /* JADX WARN: Code duplicated, block: B:405:0x0824  */
    /* JADX WARN: Code duplicated, block: B:415:0x0851 A[Catch: CancellationException -> 0x084f, TryCatch #0 {CancellationException -> 0x084f, blocks: (B:409:0x083a, B:411:0x0840, B:415:0x0851, B:417:0x0855), top: B:444:0x083a }] */
    /* JADX WARN: Code duplicated, block: B:417:0x0855 A[Catch: CancellationException -> 0x084f, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x084f, blocks: (B:409:0x083a, B:411:0x0840, B:415:0x0851, B:417:0x0855), top: B:444:0x083a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:412:0x084c -> B:390:0x07e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:416:0x0853 -> B:390:0x07e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:418:0x085f -> B:390:0x07e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:421:0x086d -> B:389:0x07e3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:423:0x0871 -> B:390:0x07e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0130 -> B:63:0x00f9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rzu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzu(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzu(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rzu(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
    }
}
