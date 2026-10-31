package p;

import com.spotify.campfire.datasource.impl.proto.AckType;
import com.spotify.campfire.datasource.impl.proto.ActivityRequest;
import com.spotify.campfire.datasource.impl.proto.AddActivity;
import com.spotify.campfire.datasource.impl.proto.AddHierarchyActivity;
import com.spotify.campfire.datasource.impl.proto.BulkMessageRequest;
import com.spotify.campfire.datasource.impl.proto.DeleteInviteRequest;
import com.spotify.campfire.datasource.impl.proto.HierarchyUserParticipationStatus;
import com.spotify.campfire.datasource.impl.proto.MessageRequest;
import com.spotify.campfire.datasource.impl.proto.NodeRequest;
import com.spotify.campfire.datasource.impl.proto.ReceiptType;
import com.spotify.campfire.datasource.impl.proto.SetReceiptPreferenceRequest;
import com.spotify.campfire.service.impl.ChatsUpdatingException;
import io.reactivex.rxjava3.core.Observable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bfd implements f961 {
    public final llm N0;
    public final ayh O0;
    public final AtomicBoolean P0;
    public final AtomicBoolean Q0;
    public final dt71 R0;
    public final ve01 S0;
    public kdd T0;
    public final dt71 U0;
    public final dt71 V0;
    public final nzc1 X;
    public final kbd Y;
    public final q8n Z;
    public final aod a;
    public final nad b;
    public final add c;
    public final m3c d;
    public final hod0 e;
    public final xid f;
    public final p2o0 g;
    public final Observable h;
    public final cab i;
    public final cuw t;

    public bfd(aod aodVar, nad nadVar, add addVar, m3c m3cVar, hod0 hod0Var, xid xidVar, p2o0 p2o0Var, Observable observable, cab cabVar, cuw cuwVar, nzc1 nzc1Var, kbd kbdVar, q8n q8nVar, q8n q8nVar2) {
        bfd bfdVar;
        this.a = aodVar;
        this.b = nadVar;
        this.c = addVar;
        this.d = m3cVar;
        this.e = hod0Var;
        this.f = xidVar;
        this.g = p2o0Var;
        this.h = observable;
        this.i = cabVar;
        this.t = cuwVar;
        this.X = nzc1Var;
        this.Y = kbdVar;
        this.Z = q8nVar2;
        llm llmVarK = i3a.k(q8nVar);
        this.N0 = llmVarK;
        ayh ayhVarA = sap1.a();
        this.O0 = ayhVarA;
        long jF = addVar.a.f();
        if (jF == 0) {
            ayhVarA.m0(rih1.a);
            bfdVar = this;
        } else {
            bfdVar = this;
            fn31.T(llmVarK, (o8n) null, 0, new kv2(jF, bfdVar, (lnm) null, (byte) 3), 3);
        }
        fn31.T(llmVarK, (o8n) null, 0, new hsc(bfdVar, (lnm) null, (byte) 6), 3);
        bfdVar.P0 = new AtomicBoolean(false);
        bfdVar.Q0 = new AtomicBoolean(false);
        dt71 dt71VarE = mgo1.e(0, 0, 0, 7);
        bfdVar.R0 = dt71VarE;
        bfdVar.S0 = d5p1.g(dt71VarE);
        bfdVar.T0 = jdd.a;
        bfdVar.U0 = mgo1.e(0, 1, 2, 1);
        bfdVar.V0 = mgo1.e(0, 1, 2, 1);
    }

    public static List L(kdd kddVar) {
        if (u890.j(kddVar, jdd.a) || u890.j(kddVar, idd.a) || u890.j(kddVar, gdd.a)) {
            return z6x.a;
        }
        if (kddVar instanceof hdd) {
            return ((hdd) kddVar).a;
        }
        eg.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object b(bfd bfdVar, String str, onm onmVar) {
        q8d q8dVar;
        if (onmVar instanceof q8d) {
            q8dVar = (q8d) onmVar;
            int i = q8dVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q8dVar.c = i - Integer.MIN_VALUE;
            } else {
                q8dVar = new q8d(bfdVar, onmVar);
            }
        } else {
            q8dVar = new q8d(bfdVar, onmVar);
        }
        Object objG = q8dVar.a;
        int i2 = q8dVar.c;
        if (i2 == 0) {
            hm5.M(objG);
            List listSingletonList = Collections.singletonList(str);
            q8dVar.c = 1;
            objG = bfdVar.b.g(listSingletonList, q8dVar);
            Object obj = d9n.a;
            if (objG == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        return o7h.s0((List) objG);
    }

    public static final boolean r(boolean z, List list, goe goeVar) {
        if (z && !u890.j(goeVar.b, atf.a)) {
            return false;
        }
        List list2 = goeVar.e;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((jwm) it.next()).a.a);
        }
        return arrayList.containsAll(list) && list.containsAll(arrayList);
    }

    public final mr20 A() {
        return rqt0.u(new ped(new ht20(this.V0, new vs0(this, (lnm) null, (byte) 18)), this, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r5.Q0.getAndSet(false) == false) goto L23;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003f -> B:20:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object B(p.onm r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p.sed
            if (r0 == 0) goto L13
            r0 = r6
            p.sed r0 = (p.sed) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.sed r0 = new p.sed
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L27
            p.hm5.M(r6)     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            goto L42
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r2
        L2d:
            p.hm5.M(r6)
        L30:
            r0.c = r4     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            p.q8n r6 = r5.Z     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            p.kv1 r1 = new p.kv1     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            r1.<init>(r5, r3, r2)     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            java.lang.Object r6 = p.fn31.Y(r6, r1, r0)     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            p.d9n r1 = p.d9n.a
            if (r6 != r1) goto L42
            return r1
        L42:
            p.kdd r6 = (p.kdd) r6     // Catch: com.spotify.campfire.service.impl.ChatsUpdatingException -> L4c
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.Q0
            boolean r6 = r6.getAndSet(r3)
            if (r6 != 0) goto L30
        L4c:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.B(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r3.emit(r8, r0) == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C(java.lang.String r9, p.onm r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.ted
            if (r0 == 0) goto L13
            r0 = r10
            p.ted r0 = (p.ted) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.ted r0 = new p.ted
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            p.dt71 r3 = r8.U0
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L44
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L38
            if (r1 == r4) goto L32
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L32:
            java.lang.Throwable r8 = r0.b
            p.hm5.M(r10)
            goto L77
        L38:
            p.hm5.M(r10)
            goto L62
        L3c:
            java.lang.String r9 = r0.a
            p.hm5.M(r10)     // Catch: java.lang.Throwable -> L42
            goto L52
        L42:
            r8 = move-exception
            goto L65
        L44:
            p.hm5.M(r10)
            r0.a = r9     // Catch: java.lang.Throwable -> L42
            r0.e = r6     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.B(r0)     // Catch: java.lang.Throwable -> L42
            if (r8 != r7) goto L52
            goto L76
        L52:
            p.mdd r8 = new p.mdd
            r8.<init>(r9)
            r0.a = r2
            r0.e = r5
            java.lang.Object r8 = r3.emit(r8, r0)
            if (r8 != r7) goto L62
            goto L76
        L62:
            p.rih1 r8 = p.rih1.a
            return r8
        L65:
            p.mdd r10 = new p.mdd
            r10.<init>(r9)
            r0.a = r2
            r0.b = r8
            r0.e = r4
            java.lang.Object r9 = r3.emit(r10, r0)
            if (r9 != r7) goto L77
        L76:
            return r7
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.C(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r3.emit(r2, r0) == r7) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(p.onm r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof p.ued
            if (r0 == 0) goto L13
            r0 = r9
            p.ued r0 = (p.ued) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.ued r0 = new p.ued
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            p.ldd r2 = p.ldd.a
            p.dt71 r3 = r8.U0
            r4 = 3
            r5 = 2
            r6 = 1
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L44
            if (r1 == r6) goto L3e
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L34
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L34:
            java.lang.Throwable r8 = r0.a
            p.hm5.M(r9)
            goto L67
        L3a:
            p.hm5.M(r9)
            goto L59
        L3e:
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L42
            goto L50
        L42:
            r8 = move-exception
            goto L5c
        L44:
            p.hm5.M(r9)
            r0.d = r6     // Catch: java.lang.Throwable -> L42
            java.lang.Object r8 = r8.B(r0)     // Catch: java.lang.Throwable -> L42
            if (r8 != r7) goto L50
            goto L66
        L50:
            r0.d = r5
            java.lang.Object r8 = r3.emit(r2, r0)
            if (r8 != r7) goto L59
            goto L66
        L59:
            p.rih1 r8 = p.rih1.a
            return r8
        L5c:
            r0.a = r8
            r0.d = r4
            java.lang.Object r9 = r3.emit(r2, r0)
            if (r9 != r7) goto L67
        L66:
            return r7
        L67:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.D(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object E(String str, String str2, onm onmVar) {
        ved vedVar;
        String str3;
        String str4;
        Object obj;
        String str5;
        if (onmVar instanceof ved) {
            vedVar = (ved) onmVar;
            int i = vedVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                vedVar.f = i - Integer.MIN_VALUE;
            } else {
                vedVar = new ved(this, onmVar);
            }
        } else {
            vedVar = new ved(this, onmVar);
        }
        ved vedVar2 = vedVar;
        Object obj2 = vedVar2.d;
        int i2 = vedVar2.f;
        rih1 rih1Var = rih1.a;
        Object obj3 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            vedVar2.a = str;
            vedVar2.b = str2;
            vedVar2.c = str2;
            vedVar2.f = 1;
            Object objL = fc11.l(this.h, 1, (Object) null, vedVar2);
            if (objL != obj3) {
                str3 = str;
                str4 = str2;
                obj = objL;
                str5 = str4;
            }
            return obj3;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str4 = vedVar2.c;
        str5 = vedVar2.b;
        String str6 = vedVar2.a;
        hm5.M(obj2);
        obj = obj2;
        str3 = str6;
        if (!u890.j(str4, obj)) {
            vedVar2.a = null;
            vedVar2.b = null;
            vedVar2.c = null;
            vedVar2.f = 3;
            if (this.b.z(str3, str5, vedVar2) == obj3) {
                return obj3;
            }
            return rih1Var;
        }
        iu30 w8cVar = new w8c(str3, (byte) 6);
        iu30 wedVar = new wed(this, str3, str5, null, (byte) 0);
        vedVar2.a = null;
        vedVar2.b = null;
        vedVar2.c = null;
        vedVar2.f = 2;
        if (O(true, w8cVar, wedVar, vedVar2) == obj3) {
            return obj3;
        }
        return rih1Var;
    }

    public final Object F(String str, String str2, xc31 xc31Var) {
        Object next;
        cuw cuwVar = this.t;
        z6x z6xVar = (List) cuwVar.a.get(str);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        Iterator it = ((Iterable) z6xVar).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((g8d) next).b, str2));
        g8d g8dVar = (g8d) next;
        if (g8dVar != null) {
            cuwVar.b(g8dVar);
            return G(g8dVar, xc31Var);
        }
        hhg1.n(f4i1.f("Failed contribution request with id ", str2, " not found"));
        return null;
    }

    public final Object G(g8d g8dVar, onm onmVar) {
        return H(Collections.singletonList(g8dVar), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: Exception -> 0x0038, CancellationException -> 0x0287, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0287, blocks: (B:14:0x0033, B:56:0x015f, B:21:0x0049, B:53:0x0148, B:26:0x006b, B:47:0x0109, B:41:0x00db, B:43:0x00e1, B:49:0x0112, B:39:0x00c6), top: B:91:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21, types: [p.onm, p.xed] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r22v0, types: [p.bfd] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p.xed] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18, types: [p.onm, p.xed] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [p.aod] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0106 -> B:47:0x0109). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object H(java.util.List r23, p.onm r24) {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.H(java.util.List, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(String str, onm onmVar) {
        yed yedVar;
        if (onmVar instanceof yed) {
            yedVar = (yed) onmVar;
            int i = yedVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yedVar.d = i - Integer.MIN_VALUE;
            } else {
                yedVar = new yed(this, onmVar);
            }
        } else {
            yedVar = new yed(this, onmVar);
        }
        Object obj = yedVar.b;
        int i2 = yedVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            yedVar.a = str;
            yedVar.d = 1;
            AddHierarchyActivity.Builder request = AddHierarchyActivity.newBuilder().setHierarchyId(str).setRequest(ActivityRequest.newBuilder().setAckType(AckType.ACKTYPE_USER_SEEN));
            request.getClass();
            NodeRequest.Builder bulkMessageRequest = NodeRequest.newBuilder().setBulkMessageRequest(BulkMessageRequest.newBuilder().setAddHierarchyActivity(request));
            bulkMessageRequest.getClass();
            Object objD = this.b.D(new NodeRequest.Builder[]{bulkMessageRequest}, false, false, yedVar);
            if (objD != d9nVar) {
                objD = rih1Var;
            }
            if (objD != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = yedVar.a;
        hm5.M(obj);
        yedVar.a = null;
        yedVar.d = 2;
        Object objA = ((gwy0) this.e.b).a("campfire", Collections.singletonList(new jwy0(l1d.m("spotify:chat:", str))), 1);
        if (objA != d9nVar) {
            objA = rih1Var;
        }
        return objA == d9nVar ? d9nVar : rih1Var;
    }

    public final Object J(String str, sl01 sl01Var, a8d1 a8d1Var) {
        ReceiptType receiptType;
        int iOrdinal = sl01Var.ordinal();
        if (iOrdinal == 0) {
            receiptType = ReceiptType.RECEIPT_TYPE_PLAYED;
        } else if (iOrdinal == 1) {
            receiptType = ReceiptType.RECEIPT_TYPE_SAVED;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            receiptType = ReceiptType.RECEIPT_TYPE_SEEN;
        }
        ActivityRequest.Builder receiptType2 = ActivityRequest.newBuilder().setReceiptType(receiptType);
        receiptType2.getClass();
        MessageRequest.Builder addActivity = MessageRequest.newBuilder().setAddActivity(AddActivity.newBuilder().setParentNodePathId(str).setRequest(receiptType2));
        addActivity.getClass();
        NodeRequest.Builder messageRequest = NodeRequest.newBuilder().setMessageRequest(addActivity);
        messageRequest.getClass();
        Object objD = this.b.D(new NodeRequest.Builder[]{messageRequest}, false, false, a8d1Var);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }

    public final Object K(String str, sl01 sl01Var, boolean z, ol01 ol01Var) {
        ReceiptType receiptType;
        int iOrdinal = sl01Var.ordinal();
        if (iOrdinal == 0) {
            receiptType = ReceiptType.RECEIPT_TYPE_PLAYED;
        } else if (iOrdinal == 1) {
            receiptType = ReceiptType.RECEIPT_TYPE_SAVED;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            receiptType = ReceiptType.RECEIPT_TYPE_SEEN;
        }
        Object objF = this.b.a.f(SetReceiptPreferenceRequest.newBuilder().setHierarchyId(str).setReceiptType(receiptType).setDisabled(z).build(), ol01Var);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objF != d9nVar) {
            objF = rih1Var;
        }
        return objF == d9nVar ? objF : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r14 == r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b1, code lost:
    
        if (r14 == r8) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p.bfd] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(p.g8d r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.M(p.g8d, p.onm):java.lang.Object");
    }

    public final Object N(String str, onm onmVar) throws Exception {
        Object objO = O(false, new w8c(str, (byte) 7), new xdd(this, str, null, (byte) 1), onmVar);
        return objO == d9n.a ? objO : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r8.emit(r11, r0) == r7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(boolean r9, p.iu30 r10, p.iu30 r11, p.onm r12) throws java.lang.Exception {
        /*
            r8 = this;
            boolean r0 = r12 instanceof p.afd
            if (r0 == 0) goto L13
            r0 = r12
            p.afd r0 = (p.afd) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.afd r0 = new p.afd
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.e
            int r1 = r0.g
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            p.dt71 r8 = r8.R0
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L5e
            if (r1 == r5) goto L51
            if (r1 == r4) goto L49
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L38
            boolean r8 = r0.a
            java.lang.Exception r9 = r0.d
            p.hm5.M(r12)
            goto Lbd
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r6
        L3e:
            boolean r9 = r0.a
            p.iu30 r10 = r0.b
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L47
            goto Lbf
        L47:
            r11 = move-exception
            goto L9d
        L49:
            boolean r9 = r0.a
            p.iu30 r10 = r0.b
            p.hm5.M(r12)     // Catch: java.lang.Exception -> L47
            goto L88
        L51:
            boolean r9 = r0.a
            p.a8d1 r10 = r0.c
            r11 = r10
            p.iu30 r11 = (p.iu30) r11
            p.iu30 r10 = r0.b
            p.hm5.M(r12)
            goto L79
        L5e:
            p.hm5.M(r12)
            p.t7d r12 = p.t7d.a
            java.lang.Object r12 = r10.invoke(r12)
            r0.b = r10
            r1 = r11
            p.a8d1 r1 = (p.a8d1) r1
            r0.c = r1
            r0.a = r9
            r0.g = r5
            java.lang.Object r12 = r8.emit(r12, r0)
            if (r12 != r7) goto L79
            goto Lba
        L79:
            r0.b = r10     // Catch: java.lang.Exception -> L47
            r0.c = r6     // Catch: java.lang.Exception -> L47
            r0.a = r9     // Catch: java.lang.Exception -> L47
            r0.g = r4     // Catch: java.lang.Exception -> L47
            java.lang.Object r11 = r11.invoke(r0)     // Catch: java.lang.Exception -> L47
            if (r11 != r7) goto L88
            goto Lba
        L88:
            p.t7d r11 = p.t7d.b     // Catch: java.lang.Exception -> L47
            java.lang.Object r11 = r10.invoke(r11)     // Catch: java.lang.Exception -> L47
            r0.b = r10     // Catch: java.lang.Exception -> L47
            r0.c = r6     // Catch: java.lang.Exception -> L47
            r0.a = r9     // Catch: java.lang.Exception -> L47
            r0.g = r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r8 = r8.emit(r11, r0)     // Catch: java.lang.Exception -> L47
            if (r8 != r7) goto Lbf
            goto Lba
        L9d:
            p.o8n r12 = r0.getContext()
            p.op71.x(r12)
            p.t7d r12 = p.t7d.c
            java.lang.Object r10 = r10.invoke(r12)
            r0.b = r6
            r0.c = r6
            r0.d = r11
            r0.a = r9
            r0.g = r2
            java.lang.Object r8 = r8.emit(r10, r0)
            if (r8 != r7) goto Lbb
        Lba:
            return r7
        Lbb:
            r8 = r9
            r9 = r11
        Lbd:
            if (r8 != 0) goto Lc2
        Lbf:
            p.rih1 r8 = p.rih1.a
            return r8
        Lc2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.O(boolean, p.iu30, p.iu30, p.onm):java.lang.Object");
    }

    public final goe a(goe goeVar) {
        String str;
        tom tomVarA;
        String str2;
        if (!this.c.q() || !sqe.w(goeVar)) {
            return goeVar;
        }
        List<tom> list = goeVar.f;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (tom tomVarA2 : list) {
            upl uplVar = tomVarA2.f;
            w4i1 w4i1Var = tomVarA2.c;
            xo2 xo2Var = tomVarA2.Y;
            lpl lplVar = uplVar instanceof lpl ? (lpl) uplVar : null;
            int i = 1;
            if (lplVar != null) {
                String str3 = tomVarA2.a;
                String str4 = goeVar.a;
                if (xo2Var == null || (str2 = xo2Var.c) == null) {
                    str2 = w4i1Var.a;
                }
                lzc1 lzc1VarA = this.X.a(str4, str3, str2, lplVar.a, lplVar.f);
                if (lzc1VarA instanceof jzc1) {
                    jzc1 jzc1Var = (jzc1) lzc1VarA;
                    if (jzc1Var instanceof hzc1) {
                        i = 2;
                    } else if (jzc1Var instanceof izc1) {
                        i = 3;
                    } else if (!(jzc1Var instanceof gzc1)) {
                        eg.o();
                        return null;
                    }
                    tomVarA2 = tom.a(tomVarA2, (w4i1) null, (upl) null, (rom) null, (List) null, (List) null, new jom(i), false, 3583);
                } else {
                    continue;
                }
            } else {
                vol volVar = uplVar instanceof vol ? (vol) uplVar : null;
                if (volVar != null) {
                    String str5 = tomVarA2.a;
                    String str6 = goeVar.a;
                    if (xo2Var == null || (str = xo2Var.c) == null) {
                        str = w4i1Var.a;
                    }
                    lzc1 lzc1VarA2 = this.X.a(str6, str5, str, volVar.a, volVar.b);
                    if (lzc1VarA2 instanceof kzc1) {
                        tomVarA = tom.a(tomVarA2, (w4i1) null, new vol(((kzc1) lzc1VarA2).a, null), (rom) null, (List) null, (List) null, (nom) null, false, 4063);
                    } else if (lzc1VarA2 instanceof hzc1) {
                        tomVarA = tom.a(tomVarA2, (w4i1) null, new vol("", null), (rom) null, (List) null, (List) null, new jom(2), false, 3551);
                    } else if (lzc1VarA2 instanceof izc1) {
                        tomVarA = tom.a(tomVarA2, (w4i1) null, new vol("", null), (rom) null, (List) null, (List) null, new jom(3), false, 3551);
                    } else {
                        if (!(lzc1VarA2 instanceof gzc1)) {
                            eg.o();
                            return null;
                        }
                        tomVarA = tom.a(tomVarA2, (w4i1) null, new vol("", null), (rom) null, (List) null, (List) null, new jom(1), false, 3551);
                    }
                    tomVarA2 = tomVarA;
                } else {
                    continue;
                }
            }
            arrayList.add(tomVarA2);
        }
        return goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, arrayList, 0, 4063);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        odd oddVar;
        if (onmVar instanceof odd) {
            oddVar = (odd) onmVar;
            int i = oddVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oddVar.c = i - Integer.MIN_VALUE;
            } else {
                oddVar = new odd(this, onmVar);
            }
        } else {
            oddVar = new odd(this, onmVar);
        }
        Object objI = oddVar.a;
        int i2 = oddVar.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            oddVar.c = 1;
            objI = this.b.i(str, oddVar);
            if (objI != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return objI;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objI);
        oddVar.c = 2;
        Object objE = this.a.e((goe) objI, true, oddVar);
        return objE == d9nVar ? d9nVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, onm onmVar) {
        pdd pddVar;
        Object next;
        aod aodVar;
        if (onmVar instanceof pdd) {
            pddVar = (pdd) onmVar;
            int i = pddVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pddVar.d = i - Integer.MIN_VALUE;
            } else {
                pddVar = new pdd(this, onmVar);
            }
        } else {
            pddVar = new pdd(this, onmVar);
        }
        Object obj = pddVar.b;
        int i2 = pddVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            Iterator it = L(this.T0).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((goe) next).a, str));
            goe goeVar = (goe) next;
            if (goeVar != null) {
                return goeVar;
            }
            aod aodVar2 = this.a;
            pddVar.a = aodVar2;
            pddVar.d = 1;
            Object objH = this.b.h(1, str, pddVar);
            if (objH != d9nVar) {
                obj = objH;
                aodVar = aodVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aodVar = pddVar.a;
        hm5.M(obj);
        pddVar.a = null;
        pddVar.d = 2;
        Object objE = aodVar.e((goe) obj, true, pddVar);
        return objE == d9nVar ? d9nVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0177, code lost:
    
        if (r2 == r14) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(p.p8d r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.e(p.p8d, p.onm):java.lang.Object");
    }

    public final Object f(String str, String str2, List list, onm onmVar, boolean z) {
        ctf btfVar = z ? new btf(str2, z6x.a) : atf.a;
        zks0 zks0Var = new zks0(2, xks0.b, str, yks0.b);
        List listSingletonList = Collections.singletonList(new jwm(8, new w4i1(str, str, 12, (String) null)));
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (String str3 : list2) {
            arrayList.add(new jwm(14, new w4i1(str3, str3, 12, (String) null)));
        }
        return this.a.e(new goe("", btfVar, zks0Var, (gxz0) null, o7h.N0(arrayList, listSingletonList), (List) null, (jlh1) null, 0L, false, (f8j0) null, 4072), true, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r9 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p.rdd
            if (r0 == 0) goto L13
            r0 = r9
            p.rdd r0 = (p.rdd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.rdd r0 = new p.rdd
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 2
            r3 = 0
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L59
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L31:
            p.aod r8 = r0.a
            p.hm5.M(r9)
            goto L4c
        L37:
            p.hm5.M(r9)
            p.aod r9 = r7.a
            r0.a = r9
            r0.d = r4
            p.nad r1 = r7.b
            java.lang.Object r8 = r1.m(r8, r0, r4)
            if (r8 != r5) goto L49
            goto L58
        L49:
            r6 = r9
            r9 = r8
            r8 = r6
        L4c:
            p.goe r9 = (p.goe) r9
            r0.a = r3
            r0.d = r2
            java.lang.Object r9 = r8.e(r9, r4, r0)
            if (r9 != r5) goto L59
        L58:
            return r5
        L59:
            r8 = r9
            p.goe r8 = (p.goe) r8
            p.kdd r0 = r7.T0
            boolean r1 = r0 instanceof p.hdd
            if (r1 == 0) goto L9d
            java.util.List r1 = java.util.Collections.singletonList(r8)
            java.util.Collection r1 = (java.util.Collection) r1
            p.hdd r0 = (p.hdd) r0
            java.util.List r0 = r0.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L77:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L92
            java.lang.Object r3 = r0.next()
            r4 = r3
            p.goe r4 = (p.goe) r4
            java.lang.String r4 = r4.a
            java.lang.String r5 = r8.a
            boolean r4 = p.u890.j(r4, r5)
            if (r4 != 0) goto L77
            r2.add(r3)
            goto L77
        L92:
            java.util.ArrayList r8 = p.o7h.N0(r2, r1)
            p.hdd r0 = new p.hdd
            r0.<init>(r8)
            r7.T0 = r0
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.g(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(List list, onm onmVar) {
        sdd sddVar;
        aod aodVar;
        if (onmVar instanceof sdd) {
            sddVar = (sdd) onmVar;
            int i = sddVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sddVar.d = i - Integer.MIN_VALUE;
            } else {
                sddVar = new sdd(this, onmVar);
            }
        } else {
            sddVar = new sdd(this, onmVar);
        }
        Object obj = sddVar.b;
        int i2 = sddVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            aod aodVar2 = this.a;
            sddVar.a = aodVar2;
            sddVar.d = 1;
            Object objN = this.b.n(list, sddVar);
            if (objN != d9nVar) {
                obj = objN;
                aodVar = aodVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aodVar = sddVar.a;
        hm5.M(obj);
        sddVar.a = null;
        sddVar.d = 2;
        Object objE = aodVar.e((goe) obj, true, sddVar);
        return objE == d9nVar ? d9nVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(ArrayList arrayList, onm onmVar) throws Exception {
        tdd tddVar;
        if (onmVar instanceof tdd) {
            tddVar = (tdd) onmVar;
            int i = tddVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tddVar.c = i - Integer.MIN_VALUE;
            } else {
                tddVar = new tdd(this, onmVar);
            }
        } else {
            tddVar = new tdd(this, onmVar);
        }
        Object objD = tddVar.a;
        int i2 = tddVar.c;
        m3c m3cVar = this.d;
        try {
            if (i2 == 0) {
                hm5.M(objD);
                t45 t45Var = (t45) m3cVar.e;
                if (t45Var != null) {
                    t45.m(t45Var, "extended_metadata_request", 4);
                }
                m3cVar.c = true;
                aod aodVar = this.a;
                tddVar.c = 1;
                objD = aodVar.d(arrayList, tddVar);
                Object obj = d9n.a;
                if (objD == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objD);
            }
            t45 t45Var2 = (t45) m3cVar.e;
            if (t45Var2 != null) {
                t45Var2.g("extended_metadata_request");
            }
            return (List) objD;
        } catch (Exception e) {
            op71.x(tddVar.getContext());
            t45 t45Var3 = (t45) m3cVar.e;
            if (t45Var3 != null) {
                t45Var3.g("extended_metadata_request");
            }
            m3cVar.f(3);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(String str, onm onmVar) throws Exception {
        wdd wddVar;
        goe goeVar;
        m7d m7dVar;
        if (onmVar instanceof wdd) {
            wddVar = (wdd) onmVar;
            int i = wddVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wddVar.e = i - Integer.MIN_VALUE;
            } else {
                wddVar = new wdd(this, onmVar);
            }
        } else {
            wddVar = new wdd(this, onmVar);
        }
        Object objF = wddVar.c;
        int i2 = wddVar.e;
        dt71 dt71Var = this.R0;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                m7d m7dVar2 = new m7d(str, t7d.a);
                wddVar.a = str;
                wddVar.e = 1;
                if (dt71Var.emit(m7dVar2, wddVar) != d9nVar) {
                }
                return d9nVar;
            }
            if (i2 == 1) {
                str = wddVar.a;
                hm5.M(objF);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        goe goeVar2 = (goe) wddVar.b;
                        String str2 = wddVar.a;
                        hm5.M(objF);
                        return goeVar2;
                    }
                    if (i2 != 4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Exception exc = (Exception) wddVar.b;
                    hm5.M(objF);
                    throw exc;
                }
                str = wddVar.a;
                hm5.M(objF);
            }
            goeVar = (goe) objF;
            m7dVar = new m7d(str, t7d.b);
            wddVar.a = str;
            wddVar.b = goeVar;
            wddVar.e = 3;
            if (dt71Var.emit(m7dVar, wddVar) != d9nVar) {
                return d9nVar;
            }
            return goeVar;
            nad nadVar = this.b;
            wddVar.a = str;
            wddVar.e = 2;
            objF = nadVar.F(str, HierarchyUserParticipationStatus.HIERARCHY_USER_PARTICIPATION_STATUS_DELETED, wddVar);
            if (objF != d9nVar) {
                goeVar = (goe) objF;
                m7dVar = new m7d(str, t7d.b);
                wddVar.a = str;
                wddVar.b = goeVar;
                wddVar.e = 3;
                if (dt71Var.emit(m7dVar, wddVar) != d9nVar) {
                    return goeVar;
                }
            }
        } catch (Exception e) {
            op71.x(wddVar.getContext());
            m7d m7dVar3 = new m7d(str, t7d.c);
            wddVar.a = null;
            wddVar.b = e;
            wddVar.e = 4;
            if (dt71Var.emit(m7dVar3, wddVar) != d9nVar) {
                throw e;
            }
        }
        return d9nVar;
    }

    public final Object k(String str, a8d1 a8d1Var) throws Exception {
        Object objO = O(true, new w8c(str, (byte) 4), new xdd(this, str, null, (byte) 0), a8d1Var);
        return objO == d9n.a ? objO : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
    public final Object l(tom tomVar, boolean z, kv1 kv1Var) {
        Object objQ;
        Object obj;
        List listM;
        String str = tomVar.b;
        String str2 = tomVar.a;
        cuw cuwVar = this.t;
        List list = (List) cuwVar.a.get(str);
        d9n d9nVar = d9n.a;
        if (list == null) {
            objQ = this.b.q(str2, kv1Var, z);
            if (objQ == d9nVar) {
                return objQ;
            }
        } else {
            Iterator it = list.iterator();
            loop0: while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                f8d f8dVar = ((g8d) next).c;
                if (f8dVar instanceof e8d) {
                    listM = Collections.singletonList(((e8d) f8dVar).a.a);
                } else if (f8dVar instanceof a8d) {
                    listM = Collections.singletonList(((a8d) f8dVar).a.a);
                } else if (f8dVar instanceof c8d) {
                    c8d c8dVar = (c8d) f8dVar;
                    listM = p7h.M(new String[]{c8dVar.a.a, c8dVar.b.a});
                } else if (f8dVar instanceof d8d) {
                    listM = Collections.singletonList(((d8d) f8dVar).a.a);
                } else {
                    if (!(f8dVar instanceof b8d)) {
                        eg.o();
                        return null;
                    }
                    b8d b8dVar = (b8d) f8dVar;
                    listM = p7h.M(new String[]{b8dVar.a.a, b8dVar.b.a});
                }
                List list2 = listM;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (u890.j((String) it2.next(), str2)) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
            g8d g8dVar = (g8d) obj;
            if (g8dVar == null) {
                objQ = this.b.q(str2, kv1Var, z);
                if (objQ == d9nVar) {
                    return objQ;
                }
            } else {
                cuwVar.b(g8dVar);
                Object objEmit = this.R0.emit(new o7d(tomVar.b, str2), kv1Var);
                if (objEmit == d9nVar) {
                    return objEmit;
                }
            }
        }
        return rih1.a;
    }

    public final Object m(String str, String str2, ote oteVar) {
        Object objT = this.b.a.t(DeleteInviteRequest.newBuilder().setUri(str).setPermissionToken(str2).build(), oteVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objT != d9nVar) {
            objT = rih1Var;
        }
        return objT == d9nVar ? objT : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(int i, String str, onm onmVar) {
        ydd yddVar;
        goe m231Var;
        if (onmVar instanceof ydd) {
            yddVar = (ydd) onmVar;
            int i2 = yddVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yddVar.c = i2 - Integer.MIN_VALUE;
            } else {
                yddVar = new ydd(this, onmVar);
            }
        } else {
            yddVar = new ydd(this, onmVar);
        }
        Object objH = yddVar.a;
        int i3 = yddVar.c;
        try {
            if (i3 == 0) {
                hm5.M(objH);
                nad nadVar = this.b;
                yddVar.c = 1;
                objH = nadVar.h(i, str, yddVar);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i3 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            m231Var = (goe) objH;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            op71.x(yddVar.getContext());
        }
        return m231Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.campfire.service.impl.ChatsUpdatingException */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[Catch: all -> 0x0036, CancellationException -> 0x0039, TryCatch #1 {CancellationException -> 0x0039, blocks: (B:14:0x0031, B:49:0x00ad, B:50:0x00b5, B:52:0x00bb, B:53:0x00c5, B:54:0x00ce, B:56:0x00d4, B:57:0x00ee, B:59:0x00f4, B:60:0x0100, B:62:0x0106, B:64:0x0137, B:65:0x013b, B:23:0x0044, B:35:0x0073, B:36:0x0080, B:38:0x0086, B:40:0x0092, B:44:0x009d, B:45:0x00a1, B:24:0x0048, B:31:0x0063, B:28:0x0055), top: B:84:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb A[Catch: all -> 0x0036, CancellationException -> 0x0039, LOOP:0: B:50:0x00b5->B:52:0x00bb, LOOP_END, TryCatch #1 {CancellationException -> 0x0039, blocks: (B:14:0x0031, B:49:0x00ad, B:50:0x00b5, B:52:0x00bb, B:53:0x00c5, B:54:0x00ce, B:56:0x00d4, B:57:0x00ee, B:59:0x00f4, B:60:0x0100, B:62:0x0106, B:64:0x0137, B:65:0x013b, B:23:0x0044, B:35:0x0073, B:36:0x0080, B:38:0x0086, B:40:0x0092, B:44:0x009d, B:45:0x00a1, B:24:0x0048, B:31:0x0063, B:28:0x0055), top: B:84:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4 A[Catch: all -> 0x0036, CancellationException -> 0x0039, TryCatch #1 {CancellationException -> 0x0039, blocks: (B:14:0x0031, B:49:0x00ad, B:50:0x00b5, B:52:0x00bb, B:53:0x00c5, B:54:0x00ce, B:56:0x00d4, B:57:0x00ee, B:59:0x00f4, B:60:0x0100, B:62:0x0106, B:64:0x0137, B:65:0x013b, B:23:0x0044, B:35:0x0073, B:36:0x0080, B:38:0x0086, B:40:0x0092, B:44:0x009d, B:45:0x00a1, B:24:0x0048, B:31:0x0063, B:28:0x0055), top: B:84:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4 A[Catch: all -> 0x0036, CancellationException -> 0x0039, LOOP:2: B:57:0x00ee->B:59:0x00f4, LOOP_END, TryCatch #1 {CancellationException -> 0x0039, blocks: (B:14:0x0031, B:49:0x00ad, B:50:0x00b5, B:52:0x00bb, B:53:0x00c5, B:54:0x00ce, B:56:0x00d4, B:57:0x00ee, B:59:0x00f4, B:60:0x0100, B:62:0x0106, B:64:0x0137, B:65:0x013b, B:23:0x0044, B:35:0x0073, B:36:0x0080, B:38:0x0086, B:40:0x0092, B:44:0x009d, B:45:0x00a1, B:24:0x0048, B:31:0x0063, B:28:0x0055), top: B:84:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0106 A[Catch: all -> 0x0036, CancellationException -> 0x0039, TryCatch #1 {CancellationException -> 0x0039, blocks: (B:14:0x0031, B:49:0x00ad, B:50:0x00b5, B:52:0x00bb, B:53:0x00c5, B:54:0x00ce, B:56:0x00d4, B:57:0x00ee, B:59:0x00f4, B:60:0x0100, B:62:0x0106, B:64:0x0137, B:65:0x013b, B:23:0x0044, B:35:0x0073, B:36:0x0080, B:38:0x0086, B:40:0x0092, B:44:0x009d, B:45:0x00a1, B:24:0x0048, B:31:0x0063, B:28:0x0055), top: B:84:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:88:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0106, please report this as an issue */
    public final Serializable o(onm onmVar) throws ChatsUpdatingException {
        zdd zddVar;
        t45 t45Var;
        t45 t45Var2;
        String str;
        ArrayList arrayList;
        String str2;
        Iterator it;
        ArrayList arrayList2;
        goe goeVar;
        ArrayList arrayList3;
        Iterator it2;
        boolean zContains;
        if (onmVar instanceof zdd) {
            zddVar = (zdd) onmVar;
            int i = zddVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zddVar.d = i - Integer.MIN_VALUE;
            } else {
                zddVar = new zdd(this, onmVar);
            }
        } else {
            zddVar = new zdd(this, onmVar);
        }
        Object objL = zddVar.b;
        int i2 = zddVar.d;
        m3c m3cVar = this.d;
        AtomicBoolean atomicBoolean = this.P0;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objL);
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        this.Q0.set(true);
                        throw new ChatsUpdatingException();
                    }
                    m3cVar.e();
                    Observable observable = this.h;
                    zddVar.d = 1;
                    objL = fc11.l(observable, 1, (Object) null, zddVar);
                    if (objL == d9nVar) {
                    }
                    return d9nVar;
                }
                if (i2 == 1) {
                    hm5.M(objL);
                } else {
                    if (i2 == 2) {
                        str = zddVar.a;
                        hm5.M(objL);
                        arrayList = new ArrayList();
                        for (goe goeVar2 : (List) objL) {
                            if ((goeVar2.b instanceof atf) && goeVar2.e.size() < 2) {
                                goeVar2 = null;
                            }
                            if (goeVar2 != null) {
                                arrayList.add(goeVar2);
                            }
                        }
                        zddVar.a = str;
                        zddVar.d = 3;
                        objL = i(arrayList, zddVar);
                        if (objL != d9nVar) {
                            str2 = str;
                        }
                        return d9nVar;
                    }
                    if (i2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = zddVar.a;
                    hm5.M(objL);
                }
                List list = (List) objL;
                it = list.iterator();
                while (it.hasNext()) {
                    y((goe) it.next());
                }
                arrayList2 = new ArrayList();
                for (Object obj : list) {
                    goeVar = (goe) obj;
                    ArrayList arrayListK = goeVar.k();
                    arrayList3 = new ArrayList(q7h.U(arrayListK, 10));
                    it2 = arrayListK.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((w4i1) it2.next()).a);
                    }
                    zContains = arrayList3.contains(str2);
                    if (!zContains) {
                        n57.s("Chat does not contain current user: " + wwo1.z(goeVar.k().size(), str2) + " (type=" + goeVar.b + ")");
                    }
                    if (zContains) {
                        arrayList2.add(obj);
                    }
                }
                m3cVar.f(1);
                atomicBoolean.set(false);
                return arrayList2;
                String str3 = (String) objL;
                zddVar.a = str3;
                zddVar.d = 2;
                Object objP = p(zddVar);
                if (objP != d9nVar) {
                    str = str3;
                    objL = objP;
                    arrayList = new ArrayList();
                    while (r15.hasNext()) {
                        if (goeVar2.b instanceof atf) {
                            goeVar2 = null;
                        }
                        if (goeVar2 != null) {
                            arrayList.add(goeVar2);
                        }
                    }
                    zddVar.a = str;
                    zddVar.d = 3;
                    objL = i(arrayList, zddVar);
                    if (objL != d9nVar) {
                        str2 = str;
                        List list2 = (List) objL;
                        it = list2.iterator();
                        while (it.hasNext()) {
                            y((goe) it.next());
                        }
                        arrayList2 = new ArrayList();
                        while (r15.hasNext()) {
                            goeVar = (goe) obj;
                            ArrayList arrayListK2 = goeVar.k();
                            arrayList3 = new ArrayList(q7h.U(arrayListK2, 10));
                            it2 = arrayListK2.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((w4i1) it2.next()).a);
                            }
                            zContains = arrayList3.contains(str2);
                            if (!zContains) {
                                n57.s("Chat does not contain current user: " + wwo1.z(goeVar.k().size(), str2) + " (type=" + goeVar.b + ")");
                            }
                            if (zContains) {
                                arrayList2.add(obj);
                            }
                        }
                        m3cVar.f(1);
                        atomicBoolean.set(false);
                        return arrayList2;
                    }
                }
                return d9nVar;
            } catch (CancellationException e) {
                if (m3cVar.b && (t45Var2 = (t45) m3cVar.e) != null) {
                    t45Var2.g("latest_nodes_request");
                }
                if (m3cVar.c && (t45Var = (t45) m3cVar.e) != null) {
                    t45Var.g("extended_metadata_request");
                }
                m3cVar.f(2);
                throw e;
            }
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(onm onmVar) throws Exception {
        aed aedVar;
        if (onmVar instanceof aed) {
            aedVar = (aed) onmVar;
            int i = aedVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedVar.c = i - Integer.MIN_VALUE;
            } else {
                aedVar = new aed(this, onmVar);
            }
        } else {
            aedVar = new aed(this, onmVar);
        }
        Object objW = aedVar.a;
        int i2 = aedVar.c;
        m3c m3cVar = this.d;
        try {
            if (i2 == 0) {
                hm5.M(objW);
                t45 t45Var = (t45) m3cVar.e;
                if (t45Var != null) {
                    t45.m(t45Var, "latest_nodes_request", 4);
                }
                m3cVar.b = true;
                nad nadVar = this.b;
                aedVar.c = 1;
                objW = nadVar.w(aedVar);
                d9n d9nVar = d9n.a;
                if (objW == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objW);
            }
            t45 t45Var2 = (t45) m3cVar.e;
            if (t45Var2 != null) {
                t45Var2.g("latest_nodes_request");
            }
            return (List) objW;
        } catch (Exception e) {
            op71.x(aedVar.getContext());
            t45 t45Var3 = (t45) m3cVar.e;
            if (t45Var3 != null) {
                t45Var3.g("latest_nodes_request");
            }
            m3cVar.f(2);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r10 == r5) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.util.List r8, boolean r9, p.onm r10) throws p.gtf {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.bed
            if (r0 == 0) goto L13
            r0 = r10
            p.bed r0 = (p.bed) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.bed r0 = new p.bed
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            java.util.List r7 = r0.a
            java.util.List r7 = (java.util.List) r7
            p.hm5.M(r10)
            return r10
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L35:
            boolean r9 = r0.b
            java.util.List r8 = r0.a
            java.util.List r8 = (java.util.List) r8
            p.hm5.M(r10)
            goto L79
        L3f:
            p.hm5.M(r10)
            p.kdd r10 = r7.T0
            java.util.List r10 = L(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L4e:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r10.next()
            r6 = r1
            p.goe r6 = (p.goe) r6
            boolean r6 = r(r9, r8, r6)
            if (r6 == 0) goto L4e
            goto L63
        L62:
            r1 = r4
        L63:
            p.goe r1 = (p.goe) r1
            if (r1 != 0) goto Lb7
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r0.a = r10
            r0.b = r9
            r0.e = r3
            p.nad r10 = r7.b
            java.lang.Object r10 = r10.w(r0)
            if (r10 != r5) goto L79
            goto Lc5
        L79:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L81:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r10.next()
            r6 = r1
            p.goe r6 = (p.goe) r6
            boolean r6 = r(r9, r8, r6)
            if (r6 == 0) goto L81
            goto L96
        L95:
            r1 = r4
        L96:
            p.goe r1 = (p.goe) r1
            if (r1 == 0) goto L9b
            goto Lb7
        L9b:
            p.gtf r7 = new p.gtf
            r0 = r8
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r4 = 0
            r5 = 62
            java.lang.String r1 = ", "
            r2 = 0
            r3 = 0
            java.lang.String r8 = p.o7h.y0(r0, r1, r2, r3, r4, r5)
            java.lang.String r9 = "Chat with participants "
            java.lang.String r10 = " not found"
            java.lang.String r8 = p.f4i1.f(r9, r8, r10)
            r7.<init>(r8)
            throw r7
        Lb7:
            r0.a = r4
            r0.b = r9
            r0.e = r2
            p.aod r7 = r7.a
            java.lang.Object r7 = r7.e(r1, r3, r0)
            if (r7 != r5) goto Lc6
        Lc5:
            return r5
        Lc6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bfd.q(java.util.List, boolean, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, Integer num, onm onmVar) {
        ced cedVar;
        xid xidVar;
        if (onmVar instanceof ced) {
            cedVar = (ced) onmVar;
            int i = cedVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cedVar.d = i - Integer.MIN_VALUE;
            } else {
                cedVar = new ced(this, onmVar);
            }
        } else {
            cedVar = new ced(this, onmVar);
        }
        Object obj = cedVar.b;
        int i2 = cedVar.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            xid xidVar2 = this.f;
            cedVar.a = xidVar2;
            cedVar.d = 1;
            Object objJ = this.b.j(str, num, cedVar);
            if (objJ != d9nVar) {
                obj = objJ;
                xidVar = xidVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xidVar = cedVar.a;
        hm5.M(obj);
        cedVar.a = null;
        cedVar.d = 2;
        Object objK = xidVar.k((qte) obj, cedVar);
        return objK == d9nVar ? d9nVar : objK;
    }

    public final void shutdown() {
        smo1.p(this.N0, (CancellationException) null);
        this.T0 = jdd.a;
        this.P0.set(false);
        this.Q0.set(false);
        this.t.a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(String str, int i, String str2, List list, cqf cqfVar, onm onmVar) {
        ded dedVar;
        byte b;
        xpf xpfVar;
        if (onmVar instanceof ded) {
            dedVar = (ded) onmVar;
            int i2 = dedVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dedVar.e = i2 - Integer.MIN_VALUE;
            } else {
                dedVar = new ded(this, onmVar);
            }
        } else {
            dedVar = new ded(this, onmVar);
        }
        ded dedVar2 = dedVar;
        Object objS = dedVar2.c;
        int i3 = dedVar2.e;
        d9n d9nVar = d9n.a;
        if (i3 == 0) {
            hm5.M(objS);
            dedVar2.b = i;
            dedVar2.e = 1;
            objS = this.b.s(str, i, str2, list, cqfVar, dedVar2);
            if (objS != d9nVar) {
            }
            b = i;
            return d9nVar;
        }
        if (i3 == 1) {
            byte b2 = dedVar2.b;
            hm5.M(objS);
            b = b2;
        } else {
            if (i3 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xpfVar = dedVar2.a;
            hm5.M(objS);
        }
        return new xpf((List) objS, xpfVar.b);
        b = i;
        xpf xpfVar2 = (xpf) objS;
        List list2 = xpfVar2.a;
        dedVar2.a = xpfVar2;
        dedVar2.b = b;
        dedVar2.e = 2;
        objS = this.f.l(list2, dedVar2);
        if (objS != d9nVar) {
            xpfVar = xpfVar2;
            return new xpf((List) objS, xpfVar.b);
        }
        b = i;
        return d9nVar;
    }

    public final Object u(String str, onm onmVar, boolean z) throws Exception {
        Object objO = O(true, new cl1(z, str, (byte) 5), new eed(this, str, z, (lnm) null), onmVar);
        return objO == d9n.a ? objO : rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(int i, String str, String str2, onm onmVar) {
        fed fedVar;
        byte b;
        if (onmVar instanceof fed) {
            fedVar = (fed) onmVar;
            int i2 = fedVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fedVar.d = i2 - Integer.MIN_VALUE;
            } else {
                fedVar = new fed(this, onmVar);
            }
        } else {
            fedVar = new fed(this, onmVar);
        }
        Object objX = fedVar.b;
        int i3 = fedVar.d;
        Object obj = d9n.a;
        if (i3 == 0) {
            hm5.M(objX);
            fedVar.a = i;
            fedVar.d = 1;
            objX = this.b.x(i, str, str2, fedVar);
            if (objX != obj) {
            }
            b = i;
            return obj;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                hm5.M(objX);
                return objX;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        byte b2 = fedVar.a;
        hm5.M(objX);
        b = b2;
        b = i;
        fedVar.a = b;
        fedVar.d = 2;
        Object objL = this.f.l((List) objX, fedVar);
        if (objL != obj) {
            return objL;
        }
        b = i;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(String str, String str2, onm onmVar, boolean z) {
        ged gedVar;
        nzc1 nzc1Var;
        if (onmVar instanceof ged) {
            gedVar = (ged) onmVar;
            int i = gedVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gedVar.f = i - Integer.MIN_VALUE;
            } else {
                gedVar = new ged(this, onmVar);
            }
        } else {
            gedVar = new ged(this, onmVar);
        }
        Object obj = gedVar.d;
        int i2 = gedVar.f;
        if (i2 == 0) {
            hm5.M(obj);
            if (!this.c.q() || !z) {
                return new b9d(str2, null);
            }
            gedVar.a = str2;
            nzc1 nzc1Var2 = this.X;
            gedVar.b = nzc1Var2;
            gedVar.c = str;
            gedVar.f = 1;
            Object objL = fc11.l(this.h, 1, (Object) null, gedVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
            obj = objL;
            nzc1Var = nzc1Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = gedVar.c;
            nzc1Var = gedVar.b;
            str2 = gedVar.a;
            hm5.M(obj);
        }
        mzc1 mzc1VarB = nzc1Var.b(str, (String) obj, str2);
        return new b9d(mzc1VarB.a, mzc1VarB.b);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, lpl lplVar, boolean z, onm onmVar) {
        hed hedVar;
        String str2;
        nzc1 nzc1Var;
        if (onmVar instanceof hed) {
            hedVar = (hed) onmVar;
            int i = hedVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hedVar.f = i - Integer.MIN_VALUE;
            } else {
                hedVar = new hed(this, onmVar);
            }
        } else {
            hedVar = new hed(this, onmVar);
        }
        Object objL = hedVar.d;
        int i2 = hedVar.f;
        if (i2 == 0) {
            hm5.M(objL);
            if (z) {
                hedVar.a = lplVar;
                nzc1 nzc1Var2 = this.X;
                hedVar.b = nzc1Var2;
                hedVar.c = str;
                hedVar.f = 1;
                objL = fc11.l(this.h, 1, (Object) null, hedVar);
                d9n d9nVar = d9n.a;
                if (objL == d9nVar) {
                    return d9nVar;
                }
                nzc1Var = nzc1Var2;
            } else {
                str2 = null;
            }
            String str3 = lplVar.a;
            String str4 = lplVar.c;
            kpl kplVar = lplVar.d;
            return new d9d(str3, str4, kplVar != null ? nyn1.f0(kplVar) : null, str2, lplVar.g);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = hedVar.c;
        nzc1Var = hedVar.b;
        lplVar = hedVar.a;
        hm5.M(objL);
        str2 = nzc1Var.b(str, (String) objL, lplVar.a).b;
        String str5 = lplVar.a;
        String str6 = lplVar.c;
        kpl kplVar2 = lplVar.d;
        return new d9d(str5, str6, kplVar2 != null ? nyn1.f0(kplVar2) : null, str2, lplVar.g);
    }

    public final goe y(goe goeVar) {
        List listA1;
        List listM;
        List list = (List) this.t.a.get(goeVar.a);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f8d f8dVar = ((g8d) it.next()).c;
                if (f8dVar instanceof e8d) {
                    listM = Collections.singletonList(((e8d) f8dVar).a);
                } else if (f8dVar instanceof a8d) {
                    listM = Collections.singletonList(((a8d) f8dVar).a);
                } else if (f8dVar instanceof c8d) {
                    c8d c8dVar = (c8d) f8dVar;
                    listM = p7h.M(new tom[]{c8dVar.a, c8dVar.b});
                } else if (f8dVar instanceof d8d) {
                    listM = Collections.singletonList(((d8d) f8dVar).a);
                } else {
                    if (!(f8dVar instanceof b8d)) {
                        eg.o();
                        return null;
                    }
                    b8d b8dVar = (b8d) f8dVar;
                    listM = p7h.M(new tom[]{b8dVar.a, b8dVar.b});
                }
                r7h.W(listM, arrayList);
            }
            listA1 = o7h.a1(arrayList, new cvt((byte) 6));
        } else {
            listA1 = z6x.a;
        }
        if (listA1.isEmpty()) {
            return goeVar;
        }
        return goe.a(goeVar, (String) null, (btf) null, (gxz0) null, (ArrayList) null, o7h.a1(o7h.N0(listA1, goeVar.f), new p0d((byte) 1)), 0, 4063);
    }

    public final mr20 z(String str, int i, boolean z) {
        return rqt0.u(new mgb(hu20.e(new ked(new ht20(new mgb(d5p1.g(this.U0), str, (byte) 13), new sd0(2, null, (byte) 17)), this, str, i, (byte) 0), new qd0((lnm) null, this, new AtomicBoolean(z), (byte) 6)), this, (byte) 14));
    }

    public final Object getApi() {
        return this;
    }
}
