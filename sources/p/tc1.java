package p;

import android.content.Context;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tc1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public int b;
    public byte c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.h = obj5;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: Exception -> 0x0043, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[Catch: Exception -> 0x0043, TRY_LEAVE, TryCatch #2 {Exception -> 0x0043, blocks: (B:15:0x003f, B:23:0x0089, B:25:0x009b, B:28:0x00a1, B:30:0x00a5, B:34:0x00ad, B:44:0x00c4, B:46:0x00cf, B:49:0x00ee, B:36:0x00b2, B:39:0x00b9, B:41:0x00be), top: B:63:0x003f }] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        if (r4.emit(r14, r13) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
    
        if (r2.emit(r14, r13) == r6) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object e(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r12 == r6) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object g(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.g(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (p.cyo1.u(r7, r0, r2, r6) == r3) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object h(java.lang.Object r7) {
        /*
            r6 = this;
            byte r0 = r6.c
            r1 = 2
            r2 = 1
            p.d9n r3 = p.d9n.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            p.hm5.M(r7)
            goto L5a
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L17:
            p.hm5.M(r7)
            goto L2d
        L1b:
            p.hm5.M(r7)
            int r7 = r6.b
            if (r7 <= 0) goto L5a
            r6.c = r2
            r4 = 200(0xc8, double:9.9E-322)
            java.lang.Object r7 = p.hap1.i(r4, r6)
            if (r7 != r3) goto L2d
            goto L59
        L2d:
            java.lang.Object r7 = r6.d
            p.lz20 r7 = (p.lz20) r7
            p.lz20.b(r7)
            java.lang.Object r7 = r6.e
            p.k6a1 r7 = (p.k6a1) r7
            if (r7 == 0) goto L3f
            p.b6t r7 = (p.b6t) r7
            r7.b()
        L3f:
            java.lang.Object r7 = r6.f
            p.tob1 r7 = (p.tob1) r7
            java.lang.Object r7 = r7.getValue()
            p.elb0 r7 = (p.elb0) r7
            java.lang.Object r0 = r6.g
            p.j5c r0 = (p.j5c) r0
            java.lang.Object r2 = r6.h
            p.icr0 r2 = (p.icr0) r2
            r6.c = r1
            java.lang.Object r6 = p.cyo1.u(r7, r0, r2, r6)
            if (r6 != r3) goto L5a
        L59:
            return r3
        L5a:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.h(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2 A[LOOP:0: B:51:0x00dc->B:53:0x00e2, LOOP_END] */
    private final Object i(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        s2t s2tVarQ;
        ArrayList arrayList4;
        Iterator it;
        int i = this.b;
        w5b0 w5b0Var = (w5b0) this.g;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        byte b2 = 1;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (b == 0) {
                    hm5.M(obj);
                    this.d = c9nVar;
                    this.c = (byte) 1;
                    o3r o3rVar = w5b0.h;
                    obj = w5b0Var.d(i, this);
                    if (obj != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b != 1) {
                    if (b == 2) {
                        s2tVarQ = (s2t) this.f;
                        arrayList4 = (ArrayList) this.e;
                        try {
                            hm5.M(obj);
                            this.d = null;
                            this.e = arrayList4;
                            this.f = null;
                            this.c = (byte) 3;
                            if (s2tVarQ.E(this) != d9nVar) {
                                arrayList3 = arrayList4;
                                ((zxh) this.h).m0(rih1.a);
                                this.d = null;
                                this.e = arrayList3;
                                this.f = null;
                                this.c = (byte) 4;
                                hap1.f(this);
                                return d9nVar;
                            }
                            return d9nVar;
                        } catch (Throwable th) {
                            th = th;
                            arrayList2 = arrayList4;
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((c0r) it.next()).dispose();
                            }
                            throw th;
                        }
                    }
                    if (b != 3) {
                        if (b != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        arrayList2 = (ArrayList) this.e;
                        try {
                            hm5.M(obj);
                            throw new KotlinNothingValueException();
                        } catch (Throwable th2) {
                            th = th2;
                            it = arrayList2.iterator();
                            while (it.hasNext()) {
                                ((c0r) it.next()).dispose();
                            }
                            throw th;
                        }
                    }
                    arrayList3 = (ArrayList) this.e;
                    try {
                        hm5.M(obj);
                        ((zxh) this.h).m0(rih1.a);
                        this.d = null;
                        this.e = arrayList3;
                        this.f = null;
                        this.c = (byte) 4;
                        hap1.f(this);
                        return d9nVar;
                    } catch (Throwable th3) {
                        th = th3;
                        arrayList2 = arrayList3;
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((c0r) it.next()).dispose();
                        }
                        throw th;
                    }
                }
                hm5.M(obj);
                ((zxh) this.h).m0(rih1.a);
                this.d = null;
                this.e = arrayList3;
                this.f = null;
                this.c = (byte) 4;
                hap1.f(this);
                return d9nVar;
            } catch (Throwable th4) {
                th = th4;
                arrayList2 = arrayList3;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((c0r) it.next()).dispose();
                }
                throw th;
            }
            if (!list.isEmpty()) {
                w5b0Var.a.f(new dt90(list, arrayList, w5b0Var, b2));
                s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new ss90(arrayList, lnmVar, (byte) 7), 3);
                s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new cy9(w5b0Var, i, (lnm) null, (byte) 8), 3);
                this.d = null;
                this.e = arrayList;
                this.f = s2tVarQ;
                this.c = (byte) 2;
                if (s2tVarQ2.Q(this) != d9nVar) {
                    arrayList4 = arrayList;
                    this.d = null;
                    this.e = arrayList4;
                    this.f = null;
                    this.c = (byte) 3;
                    if (s2tVarQ.E(this) != d9nVar) {
                        arrayList3 = arrayList4;
                    }
                }
                return d9nVar;
            }
            arrayList3 = arrayList;
        } catch (Throwable th5) {
            th = th5;
            arrayList2 = arrayList;
            it = arrayList2.iterator();
            while (it.hasNext()) {
                ((c0r) it.next()).dispose();
            }
            throw th;
        }
        list = (List) obj;
        arrayList = new ArrayList(list.size());
    }

    private final Object j(Object obj) throws Throwable {
        lnf0 lnf0Var;
        vgn0 vgn0Var;
        ang1 ang1Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                lnf0Var = (lnf0) this.g;
                vgn0Var = lnf0Var.l;
                ang1 ang1Var2 = (ang1) this.h;
                this.d = vgn0Var;
                this.e = lnf0Var;
                this.f = ang1Var2;
                this.b = 0;
                this.c = (byte) 1;
                if (vgn0Var.a(this) != d9nVar) {
                    ang1Var = ang1Var2;
                    i = 0;
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = (vgn0) this.d;
                try {
                    hm5.M(obj);
                    a9h a9hVar = (a9h) obj;
                    vgn0Var2.c((Object) null);
                    return a9hVar;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            i = this.b;
            ang1Var = (ang1) this.f;
            lnf0Var = (lnf0) this.e;
            vgn0 vgn0Var3 = (vgn0) this.d;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            Single singleC = lnf0Var.c(ang1Var.a, ang1Var.c);
            this.d = vgn0Var;
            this.e = null;
            this.f = null;
            this.b = i;
            this.c = (byte) 2;
            Object objJ = fc11.j(singleC, this);
            if (objJ != d9nVar) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objJ;
                vgn0Var2 = vgn0Var4;
                a9h a9hVar2 = (a9h) obj;
                vgn0Var2.c((Object) null);
                return a9hVar2;
            }
            return d9nVar;
        } catch (Throwable th3) {
            vgn0 vgn0Var5 = vgn0Var;
            th = th3;
            vgn0Var2 = vgn0Var5;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    private final Object m(Object obj) throws Throwable {
        vgn0 vgn0Var;
        String str;
        d3o0 d3o0Var;
        int i;
        Throwable th;
        vgn0 vgn0Var2;
        d3o0 d3o0Var2;
        dma1 dma1Var;
        byte b = this.c;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                vgn0Var = d3o0.j;
                d3o0 d3o0Var3 = (d3o0) this.g;
                str = (String) this.h;
                this.e = vgn0Var;
                this.f = d3o0Var3;
                this.d = str;
                this.b = 0;
                this.c = (byte) 1;
                if (vgn0Var.a(this) != d9nVar) {
                    d3o0Var = d3o0Var3;
                    i = 0;
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dma1Var = (dma1) this.d;
                d3o0Var2 = (d3o0) this.f;
                vgn0Var2 = (vgn0) this.e;
                try {
                    hm5.M(obj);
                    dma1 dma1Var2 = d3o0Var2.i;
                    nbc nbcVar = bma1.b;
                    bma1 bma1VarK = nbcVar.k("key_nearby_devices_permissions_count_app_scope");
                    int iL = dma1Var2.l(bma1VarK, 0);
                    hma1 hma1VarEdit = dma1Var2.edit();
                    hma1VarEdit.b(bma1VarK, iL + 1);
                    hma1VarEdit.g();
                    bma1 bma1VarN = nbcVar.n("key_tap_bt_permissions_count");
                    int iL2 = dma1Var.l(bma1VarN, 0);
                    hma1 hma1VarEdit2 = dma1Var.edit();
                    hma1VarEdit2.b(bma1VarN, iL2 + 1);
                    hma1VarEdit2.g();
                    bpb1 bpb1Var = d3o0.k;
                    bpb1Var.m((Object) null, new Long(((Number) bpb1Var.getValue()).longValue() + 1));
                    vgn0Var2.c((Object) null);
                    return rih1.a;
                } catch (Throwable th2) {
                    th = th2;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            i = this.b;
            str = (String) this.d;
            d3o0Var = (d3o0) this.f;
            vgn0 vgn0Var3 = (vgn0) this.e;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            ut71 ut71Var = d3o0Var.a;
            Context context = d3o0Var.h;
            str.getClass();
            dma1 dma1VarB = ut71Var.b(context, str);
            boolean zA = ((h84) d3o0Var.f.get()).a();
            this.e = vgn0Var;
            this.f = d3o0Var;
            this.d = dma1VarB;
            this.b = i;
            this.c = (byte) 2;
            if (d3o0Var.c(str, this, zA) != d9nVar) {
                vgn0Var2 = vgn0Var;
                d3o0Var2 = d3o0Var;
                dma1Var = dma1VarB;
                dma1 dma1Var3 = d3o0Var2.i;
                nbc nbcVar2 = bma1.b;
                bma1 bma1VarK2 = nbcVar2.k("key_nearby_devices_permissions_count_app_scope");
                int iL3 = dma1Var3.l(bma1VarK2, 0);
                hma1 hma1VarEdit3 = dma1Var3.edit();
                hma1VarEdit3.b(bma1VarK2, iL3 + 1);
                hma1VarEdit3.g();
                bma1 bma1VarN2 = nbcVar2.n("key_tap_bt_permissions_count");
                int iL4 = dma1Var.l(bma1VarN2, 0);
                hma1 hma1VarEdit4 = dma1Var.edit();
                hma1VarEdit4.b(bma1VarN2, iL4 + 1);
                hma1VarEdit4.g();
                bpb1 bpb1Var2 = d3o0.k;
                bpb1Var2.m((Object) null, new Long(((Number) bpb1Var2.getValue()).longValue() + 1));
                vgn0Var2.c((Object) null);
                return rih1.a;
            }
            return d9nVar;
        } catch (Throwable th3) {
            vgn0 vgn0Var4 = vgn0Var;
            th = th3;
            vgn0Var2 = vgn0Var4;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }

    private final Object o(Object obj) {
        s2t s2tVar;
        int i;
        String str;
        String str2 = (String) this.h;
        guz0 guz0Var = (guz0) this.g;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        byte b2 = 1;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                s2tVar = (s2t) this.e;
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.b;
                str = (String) this.f;
                hm5.M(obj);
            }
            return new ytz0(str, i, ((Boolean) obj).booleanValue());
        }
        hm5.M(obj);
        s2t s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new fuz0(guz0Var, str2, lnmVar, (byte) 0), 3);
        s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new fuz0(guz0Var, str2, lnmVar, b2), 3);
        this.d = null;
        this.e = s2tVarQ;
        this.c = (byte) 1;
        Object objQ = s2tVarQ2.Q(this);
        if (objQ != d9nVar) {
            s2tVar = s2tVarQ;
            obj = objQ;
        }
        return d9nVar;
        mmr0 mmr0Var = (mmr0) obj;
        String str3 = (String) mmr0Var.a;
        int iIntValue = ((Number) mmr0Var.b).intValue();
        this.d = null;
        this.e = null;
        this.f = str3;
        this.b = iIntValue;
        this.c = (byte) 2;
        Object objE = s2tVar.E(this);
        if (objE != d9nVar) {
            i = iIntValue;
            obj = objE;
            str = str3;
            return new ytz0(str, i, ((Boolean) obj).booleanValue());
        }
        return d9nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r2.emit(r3, r16) == r15) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r2.emit(r1, r16) == r15) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object p(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = r0.e
            p.su01 r1 = (p.su01) r1
            java.lang.Object r2 = r0.f
            r4 = r2
            p.l0x0 r4 = (p.l0x0) r4
            java.lang.Object r2 = r0.d
            p.vr20 r2 = (p.vr20) r2
            byte r3 = r0.c
            java.lang.String r10 = "network_fetch_reactions"
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            p.d9n r15 = p.d9n.a
            if (r3 == 0) goto L32
            if (r3 == r13) goto L2c
            if (r3 == r12) goto L28
            if (r3 != r11) goto L22
            goto L28
        L22:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r14
        L28:
            p.hm5.M(r17)
            goto L88
        L2c:
            p.hm5.M(r17)
            r3 = r17
            goto L57
        L32:
            p.hm5.M(r17)
            r1.h(r10)
            p.fe6 r3 = new p.fe6
            java.lang.Object r5 = r0.g
            java.util.Set r5 = (java.util.Set) r5
            int r6 = r0.b
            java.lang.Object r7 = r0.h
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            r8 = 0
            r9 = 11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.d = r2
            r0.c = r13
            r5 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r3 = p.rc2.O(r5, r3, r0)
            if (r3 != r15) goto L57
            goto L87
        L57:
            p.ebr r3 = (p.ebr) r3
            r1.f(r10)
            if (r3 == 0) goto L69
            r0.d = r14
            r0.c = r12
            java.lang.Object r0 = r2.emit(r3, r0)
            if (r0 != r15) goto L88
            goto L87
        L69:
            java.lang.String r1 = "Reactions decoration timed out"
            r4.y(r1)
            p.bbr r1 = new p.bbr
            java.lang.Object r3 = r4.d
            p.xr01 r3 = (p.xr01) r3
            java.util.Map r3 = r3.e
            if (r3 != 0) goto L7a
            p.b7x r3 = p.b7x.a
        L7a:
            r1.<init>(r3)
            r0.d = r14
            r0.c = r11
            java.lang.Object r0 = r2.emit(r1, r0)
            if (r0 != r15) goto L88
        L87:
            return r15
        L88:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8 A[LOOP:0: B:28:0x00b1->B:33:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0113, code lost:
    
        if (r4.f(r5, r2, r17) == r13) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0071 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0015, B:22:0x006d, B:24:0x0071), top: B:31:0x0015 }] */
    private final Object s(Object obj) throws Throwable {
        in71 in71Var;
        k261 k261Var;
        int i;
        String str;
        k261 k261Var2;
        in71 in71Var2;
        List list;
        byte b = this.c;
        ArrayList arrayListH = null;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                in71Var = (in71) this.g;
                k261Var = in71Var.f;
                String str2 = (String) this.h;
                this.d = k261Var;
                this.e = in71Var;
                this.f = str2;
                i = 0;
                this.b = 0;
                this.c = (byte) 1;
                if (k261Var.b(this) != d9nVar) {
                    str = str2;
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                in71Var2 = (in71) this.e;
                k261Var2 = (k261) this.d;
                try {
                    hm5.M(obj);
                    list = (List) obj;
                    if (list != null) {
                        in71Var2.getClass();
                        arrayListH = in71.h(list);
                    }
                    k261Var2.e();
                    return arrayListH;
                } catch (Throwable th) {
                    th = th;
                    k261Var2.e();
                    throw th;
                }
            }
            int i2 = this.b;
            str = (String) this.f;
            in71 in71Var3 = (in71) this.e;
            k261 k261Var3 = (k261) this.d;
            hm5.M(obj);
            i = i2;
            k261Var = k261Var3;
            in71Var = in71Var3;
            this.d = k261Var;
            this.e = in71Var;
            this.f = null;
            this.b = i;
            this.c = (byte) 2;
            Object objC = in71Var.c(str, this);
            if (objC != d9nVar) {
                in71 in71Var4 = in71Var;
                obj = objC;
                k261Var2 = k261Var;
                in71Var2 = in71Var4;
                list = (List) obj;
                if (list != null) {
                    in71Var2.getClass();
                    arrayListH = in71.h(list);
                }
                k261Var2.e();
                return arrayListH;
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            k261Var2 = k261Var;
            k261Var2.e();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    private final Object t(Object obj) {
        s2t s2tVarQ;
        mfd mfdVar;
        int i;
        ry91 ry91Var;
        int iOrdinal;
        xy91 xy91Var = (xy91) this.h;
        qy91 qy91Var = (qy91) this.g;
        c9n c9nVar = (c9n) this.d;
        byte b = this.c;
        byte b2 = 2;
        byte b3 = 0;
        String str = null;
        d9n d9nVar = d9n.a;
        if (b == 0) {
            hm5.M(obj);
            s2t s2tVarQ2 = fn31.q(c9nVar, (o8n) null, 0, new uy91(qy91Var, xy91Var, null), 3);
            s2tVarQ = fn31.q(c9nVar, (o8n) null, 0, new uy91(xy91Var, qy91Var, str, b2), 3);
            this.d = null;
            this.e = s2tVarQ;
            this.c = (byte) 1;
            obj = s2tVarQ2.Q(this);
            if (obj != d9nVar) {
            }
            return d9nVar;
        }
        if (b == 1) {
            s2tVarQ = (s2t) this.e;
            hm5.M(obj);
        } else {
            if (b != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.b;
            mfdVar = (mfd) this.f;
            hm5.M(obj);
        }
        ry91Var = (ry91) obj;
        if ((ry91Var != ry91.c || i != 0) && (iOrdinal = ry91Var.ordinal()) != 0) {
            if (iOrdinal == 1) {
                od90 od90Var = xy91Var.c;
                wy91 wy91Var = new wy91(xy91Var, qy91Var, b3);
                od90Var.getClass();
                return od90.a(wy91Var, false);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return xy91Var.e.a(qy91Var.e, qy91Var.h);
                }
                if (iOrdinal == 4) {
                    return xy91Var.d.a(qy91Var.e, qy91Var.h, gr81.N0, false);
                }
                eg.o();
                return null;
            }
            if (qy91Var.b && qy91Var.c) {
                String str2 = qy91Var.d;
                str = mfdVar != null ? mfdVar.c : null;
                int i2 = xy91.j;
                return xy91Var.b.a(str2, str, gr81.Z, true);
            }
        }
        return null;
        mfd mfdVar2 = (mfd) obj;
        int i3 = (mfdVar2 == null || !mfdVar2.b) ? 0 : 1;
        this.d = null;
        this.e = null;
        this.f = mfdVar2;
        this.b = i3;
        this.c = (byte) 2;
        Object objE = s2tVarQ.E(this);
        if (objE != d9nVar) {
            obj = objE;
            mfdVar = mfdVar2;
            i = i3;
            ry91Var = (ry91) obj;
            if (ry91Var != ry91.c) {
                if (iOrdinal == 1) {
                    od90 od90Var2 = xy91Var.c;
                    wy91 wy91Var2 = new wy91(xy91Var, qy91Var, b3);
                    od90Var2.getClass();
                    return od90.a(wy91Var2, false);
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return xy91Var.e.a(qy91Var.e, qy91Var.h);
                    }
                    if (iOrdinal == 4) {
                        return xy91Var.d.a(qy91Var.e, qy91Var.h, gr81.N0, false);
                    }
                    eg.o();
                    return null;
                }
                if (qy91Var.b) {
                    String str3 = qy91Var.d;
                    if (mfdVar != null) {
                    }
                    int i4 = xy91.j;
                    return xy91Var.b.a(str3, str, gr81.Z, true);
                }
            } else {
                if (iOrdinal == 1) {
                    od90 od90Var3 = xy91Var.c;
                    wy91 wy91Var3 = new wy91(xy91Var, qy91Var, b3);
                    od90Var3.getClass();
                    return od90.a(wy91Var3, false);
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        return xy91Var.e.a(qy91Var.e, qy91Var.h);
                    }
                    if (iOrdinal == 4) {
                        return xy91Var.d.a(qy91Var.e, qy91Var.h, gr81.N0, false);
                    }
                    eg.o();
                    return null;
                }
                if (qy91Var.b) {
                    String str4 = qy91Var.d;
                    if (mfdVar != null) {
                    }
                    int i5 = xy91.j;
                    return xy91Var.b.a(str4, str, gr81.Z, true);
                }
            }
            return null;
        }
        return d9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                tc1 tc1Var = new tc1(this.e, lnmVar, this.f, (byte) 0);
                tc1Var.d = obj;
                return tc1Var;
            case 1:
                return new tc1((q881) this.f, (hec) this.g, (iu30) this.h, lnmVar);
            case 2:
                tc1 tc1Var2 = new tc1(this.e, lnmVar, this.f, (byte) 2);
                tc1Var2.d = obj;
                return tc1Var2;
            case 3:
                tc1 tc1Var3 = new tc1(this.e, lnmVar, this.f, (byte) 3);
                tc1Var3.d = obj;
                return tc1Var3;
            case 4:
                tc1 tc1Var4 = new tc1(this.e, lnmVar, this.f, (byte) 4);
                tc1Var4.d = obj;
                return tc1Var4;
            case 5:
                tc1 tc1Var5 = new tc1(this.e, lnmVar, this.f, (byte) 5);
                tc1Var5.d = obj;
                return tc1Var5;
            case 6:
                tc1 tc1Var6 = new tc1(this.e, lnmVar, this.f, (byte) 6);
                tc1Var6.d = obj;
                return tc1Var6;
            case 7:
                tc1 tc1Var7 = new tc1(this.e, lnmVar, this.f, (byte) 7);
                tc1Var7.d = obj;
                return tc1Var7;
            case 8:
                tc1 tc1Var8 = new tc1(this.e, lnmVar, this.f, (byte) 8);
                tc1Var8.d = obj;
                return tc1Var8;
            case 9:
                tc1 tc1Var9 = new tc1(this.e, lnmVar, this.f, (byte) 9);
                tc1Var9.d = obj;
                return tc1Var9;
            case 10:
                tc1 tc1Var10 = new tc1(this.e, lnmVar, this.f, (byte) 10);
                tc1Var10.d = obj;
                return tc1Var10;
            case 11:
                tc1 tc1Var11 = new tc1(this.e, lnmVar, this.f, (byte) 11);
                tc1Var11.d = obj;
                return tc1Var11;
            case 12:
                tc1 tc1Var12 = new tc1(this.e, lnmVar, this.f, (byte) 12);
                tc1Var12.d = obj;
                return tc1Var12;
            case 13:
                tc1 tc1Var13 = new tc1(this.e, lnmVar, this.f, (byte) 13);
                tc1Var13.d = obj;
                return tc1Var13;
            case 14:
                tc1 tc1Var14 = new tc1(this.e, lnmVar, this.f, (byte) 14);
                tc1Var14.d = obj;
                return tc1Var14;
            case 15:
                return new tc1(this.g, this.h, lnmVar, (byte) 15);
            case 16:
                return new tc1(this.g, this.h, lnmVar, (byte) 16);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                tc1 tc1Var15 = new tc1(this.e, lnmVar, this.f, (byte) 17);
                tc1Var15.d = obj;
                return tc1Var15;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                tc1 tc1Var16 = new tc1(this.g, this.h, lnmVar, (byte) 18);
                tc1Var16.d = obj;
                return tc1Var16;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new tc1(this.b, (lz20) this.d, (k6a1) this.e, (tob1) this.f, (j5c) this.g, (icr0) this.h, lnmVar, (byte) 19);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                tc1 tc1Var17 = new tc1((w5b0) this.g, this.b, (zxh) this.h, lnmVar);
                tc1Var17.d = obj;
                return tc1Var17;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new tc1(this.g, this.h, lnmVar, (byte) 21);
            case 22:
                return new tc1(this.g, this.h, lnmVar, (byte) 22);
            case 23:
                tc1 tc1Var18 = new tc1(this.g, this.h, lnmVar, (byte) 23);
                tc1Var18.d = obj;
                return tc1Var18;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                tc1 tc1Var19 = new tc1((su01) this.e, (l0x0) this.f, (Set) this.g, this.b, (LinkedHashMap) this.h, lnmVar);
                tc1Var19.d = obj;
                return tc1Var19;
            case 25:
                return new tc1(this.b, (btd) this.d, (iu30) this.e, (xtb0) this.f, (wat) this.g, (ven0) this.h, lnmVar, (byte) 25);
            case 26:
                return new tc1(this.g, this.h, lnmVar, (byte) 26);
            case 27:
                tc1 tc1Var20 = new tc1(this.g, this.h, lnmVar, (byte) 27);
                tc1Var20.d = obj;
                return tc1Var20;
            default:
                return new tc1(this.b, (nue1) this.d, (yy31) this.e, (ejk1) this.f, (xtb0) this.g, (ven0) this.h, lnmVar, (byte) 28);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x027d  */
    /* JADX WARN: Code duplicated, block: B:438:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:? A[LOOP:0: B:111:0x0277->B:440:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0332, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x034a, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03ca, code lost:
    
        if (p.too1.o(r3, r2, r1, r5) == r9) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0469, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0488, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x051f, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0537, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x05d6, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x05ee, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0671, code lost:
    
        if (p.too1.o(r3, r2, r1, r5) == r9) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x06f1, code lost:
    
        if (p.too1.o(r3, r2, r1, r5) == r9) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0771, code lost:
    
        if (p.too1.o(r3, r2, r1, r5) == r9) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x07ed, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0872, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x088a, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0927, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x093f, code lost:
    
        if (r1.emit(r3, r5) == r9) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if (r0.f(r6, r1, r5) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x09c2, code lost:
    
        if (p.too1.o(r3, r2, r1, r5) == r9) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0a3f, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0aa2, code lost:
    
        if (r11 == r9) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r0.k(r6, r1, r5) == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0b50, code lost:
    
        if (r1.emit(r4, r5) == r9) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0baf, code lost:
    
        if (r1.emit(p.lc1.a, r5) == r9) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ab, code lost:
    
        if (r10 == r9) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cd, code lost:
    
        if (r10 == r9) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.vc1] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01ab -> B:85:0x01ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 3058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tc1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc1(Object obj, lnm lnmVar, Object obj2, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.f = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(w5b0 w5b0Var, int i, zxh zxhVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.g = w5b0Var;
        this.b = i;
        this.h = zxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(su01 su01Var, l0x0 l0x0Var, Set set, int i, LinkedHashMap linkedHashMap, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.e = su01Var;
        this.f = l0x0Var;
        this.g = set;
        this.b = i;
        this.h = linkedHashMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(q881 q881Var, hec hecVar, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.f = q881Var;
        this.g = hecVar;
        this.h = iu30Var;
    }
}
