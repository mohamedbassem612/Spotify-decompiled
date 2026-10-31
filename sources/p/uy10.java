package p;

import android.content.Context;
import android.net.NetworkRequest;
import com.spotify.inappuserfeedback.issuereporter.FeedbackSubmissionException;
import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uy10 {
    public static final xgn0 e = ygn0.a();
    public final e4b1 a;
    public final ey10 b;
    public final y0u c;
    public final ew6 d;

    public uy10(Context context, dma1 dma1Var, yqg yqgVar, mr20 mr20Var) {
        e4b1 e4b1Var = new e4b1(context);
        ey10 ey10Var = new ey10(dma1Var);
        y0u y0uVar = new y0u(0, yqgVar, yqg.class, "currentTimeMillis", "currentTimeMillis()J", 0, (byte) 23);
        ew6 ew6Var = new ew6(mr20Var, (lnm) null, (byte) 3);
        this.a = e4b1Var;
        this.b = ey10Var;
        this.c = y0uVar;
        this.d = ew6Var;
    }

    public static diq0 d(ewq ewqVar) {
        gjl gjlVar = new gjl(new e8o0((NetworkRequest) null), 2, false, false, true, false, -1L, -1L, o7h.p1(new LinkedHashSet()));
        ciq0 ciq0VarI = new ciq0(FeedbackUploadWorker.class).i(ewqVar);
        if (ewqVar.a("use_jira")) {
            ((qwl1) ciq0VarI).c.o = 604800000L;
        }
        return ciq0VarI.f(gjlVar).b();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e5 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:64:0x019c, B:69:0x01a5, B:70:0x01b3, B:49:0x010d, B:51:0x0111, B:53:0x0117, B:55:0x011d, B:56:0x015e, B:58:0x0164, B:59:0x0172, B:60:0x017e, B:71:0x01b4, B:72:0x01bb, B:73:0x01bc, B:74:0x01c3, B:43:0x00d9, B:45:0x00e5, B:75:0x01c4, B:76:0x01cb), top: B:79:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:64:0x019c, B:69:0x01a5, B:70:0x01b3, B:49:0x010d, B:51:0x0111, B:53:0x0117, B:55:0x011d, B:56:0x015e, B:58:0x0164, B:59:0x0172, B:60:0x017e, B:71:0x01b4, B:72:0x01bb, B:73:0x01bc, B:74:0x01c3, B:43:0x00d9, B:45:0x00e5, B:75:0x01c4, B:76:0x01cb), top: B:79:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0117 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:64:0x019c, B:69:0x01a5, B:70:0x01b3, B:49:0x010d, B:51:0x0111, B:53:0x0117, B:55:0x011d, B:56:0x015e, B:58:0x0164, B:59:0x0172, B:60:0x017e, B:71:0x01b4, B:72:0x01bb, B:73:0x01bc, B:74:0x01c3, B:43:0x00d9, B:45:0x00e5, B:75:0x01c4, B:76:0x01cb), top: B:79:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:64:0x019c, B:69:0x01a5, B:70:0x01b3, B:49:0x010d, B:51:0x0111, B:53:0x0117, B:55:0x011d, B:56:0x015e, B:58:0x0164, B:59:0x0172, B:60:0x017e, B:71:0x01b4, B:72:0x01bb, B:73:0x01bc, B:74:0x01c3, B:43:0x00d9, B:45:0x00e5, B:75:0x01c4, B:76:0x01cb), top: B:79:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c4 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:64:0x019c, B:69:0x01a5, B:70:0x01b3, B:49:0x010d, B:51:0x0111, B:53:0x0117, B:55:0x011d, B:56:0x015e, B:58:0x0164, B:59:0x0172, B:60:0x017e, B:71:0x01b4, B:72:0x01bb, B:73:0x01bc, B:74:0x01c3, B:43:0x00d9, B:45:0x00e5, B:75:0x01c4, B:76:0x01cb), top: B:79:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, p.uy10] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final Object a(ewq ewqVar, List list, String str, onm onmVar) throws Throwable {
        py10 py10Var;
        List list2;
        ewq ewqVar2;
        vgn0 vgn0Var;
        String str2;
        int i;
        List list3;
        ewq ewqVar3;
        int i2;
        ?? r4;
        Object objO;
        int i3;
        int i4;
        ?? r5;
        String str3;
        diq0 diq0Var;
        String str4;
        ?? r6;
        if (onmVar instanceof py10) {
            py10Var = (py10) onmVar;
            int i5 = py10Var.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                py10Var.t = i5 - Integer.MIN_VALUE;
            } else {
                py10Var = new py10(this, onmVar);
            }
        } else {
            py10Var = new py10(this, onmVar);
        }
        Object obj = py10Var.h;
        int i6 = py10Var.t;
        ?? r7 = 0;
        int i7 = 0;
        ?? r8 = 1;
        ey10 ey10Var = this.b;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i6 == 0) {
                    hm5.M(obj);
                    py10Var.a = ewqVar;
                    py10Var.b = list;
                    py10Var.c = str;
                    vgn0 vgn0Var2 = e;
                    py10Var.d = vgn0Var2;
                    py10Var.f = 0;
                    py10Var.t = 1;
                    if (vgn0Var2.a(py10Var) != d9nVar) {
                        list2 = list;
                        ewqVar2 = ewqVar;
                        vgn0Var = vgn0Var2;
                        str2 = str;
                        i = 0;
                    }
                    return d9nVar;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        i7 = py10Var.g;
                        i = py10Var.f;
                        vgn0 vgn0Var3 = py10Var.d;
                        String str5 = py10Var.c;
                        List list4 = py10Var.b;
                        ewqVar3 = py10Var.a;
                        hm5.M(obj);
                        str2 = str5;
                        list3 = list4;
                        r8 = vgn0Var3;
                        i2 = i7;
                        r4 = r8;
                        if (ey10Var.c().size() < 20) {
                            throw new FeedbackSubmissionException("Bug report queue is full (max 20 reports). Please wait for connectivity.", null);
                        }
                        ett ettVar = new ett((Object) this, (lnm) null, (byte) 29);
                        py10Var.a = ewqVar3;
                        py10Var.b = list3;
                        py10Var.c = str2;
                        py10Var.d = r4;
                        py10Var.f = i;
                        py10Var.g = i2;
                        py10Var.t = 3;
                        objO = rc2.O(5000L, ettVar, py10Var);
                        if (objO == d9nVar) {
                            int i8 = i;
                            i3 = i2;
                            obj = objO;
                            i4 = i8;
                            r5 = r4;
                            str3 = (String) obj;
                            if (str3 == null) {
                                throw new FeedbackSubmissionException("Could not confirm the signed-in account. Please try again.", null);
                            }
                            if (!ihc1.y0(str2)) {
                            }
                            throw new FeedbackSubmissionException("Account changed before the report was saved.", null);
                        }
                        return d9nVar;
                    }
                    if (i6 != 3) {
                        if (i6 != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        diq0Var = py10Var.e;
                        vgn0 vgn0Var4 = py10Var.d;
                        str4 = py10Var.c;
                        List list5 = py10Var.b;
                        try {
                            hm5.M(obj);
                            r6 = vgn0Var4;
                            UUID uuid = ((rwl1) diq0Var).a;
                            r6.c((Object) null);
                            return uuid;
                        } catch (Exception e2) {
                            e = e2;
                            ey10Var.i(((rwl1) diq0Var).a);
                            ey10Var.d(str4, Collections.singleton(((rwl1) diq0Var).a));
                            throw e;
                        }
                    }
                    i3 = py10Var.g;
                    int i9 = py10Var.f;
                    vgn0 vgn0Var5 = py10Var.d;
                    String str6 = py10Var.c;
                    list3 = py10Var.b;
                    ewq ewqVar4 = py10Var.a;
                    try {
                        hm5.M(obj);
                        i4 = i9;
                        r5 = vgn0Var5;
                        ewqVar3 = ewqVar4;
                        str2 = str6;
                        str3 = (String) obj;
                        if (str3 == null) {
                            throw new FeedbackSubmissionException("Could not confirm the signed-in account. Please try again.", null);
                        }
                        if (!ihc1.y0(str2) || !str3.equals(str2)) {
                            throw new FeedbackSubmissionException("Account changed before the report was saved.", null);
                        }
                        long jLongValue = ((Number) this.c.invoke()).longValue();
                        cwq cwqVar = new cwq();
                        LinkedHashMap linkedHashMap = cwqVar.a;
                        cwqVar.d(ewqVar3.a);
                        linkedHashMap.put("report_account", str2);
                        linkedHashMap.put("enqueued_at_millis", Long.valueOf(jLongValue));
                        diq0 diq0VarD = d(cwqVar.a());
                        UUID uuid2 = ((rwl1) diq0VarD).a;
                        List list6 = list3;
                        ArrayList arrayList = new ArrayList(q7h.U(list6, 10));
                        Iterator it = list6.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((File) it.next()).getAbsolutePath());
                        }
                        ey10Var.a(new dy10(uuid2, jLongValue, o7h.p1(arrayList)));
                        try {
                            ey10Var.h(str2, uuid2);
                            e4b1 e4b1Var = this.a;
                            py10Var.a = null;
                            py10Var.b = null;
                            py10Var.c = str2;
                            py10Var.d = r5;
                            py10Var.e = diq0VarD;
                            py10Var.f = i4;
                            py10Var.g = i3;
                            py10Var.t = 4;
                            if (e4b1Var.d(diq0VarD, py10Var) != d9nVar) {
                                diq0Var = diq0VarD;
                                r6 = r5;
                                UUID uuid3 = ((rwl1) diq0Var).a;
                                r6.c((Object) null);
                                return uuid3;
                            }
                            return d9nVar;
                        } catch (Exception e3) {
                            e = e3;
                            diq0Var = diq0VarD;
                            str4 = str2;
                            ey10Var.i(((rwl1) diq0Var).a);
                            ey10Var.d(str4, Collections.singleton(((rwl1) diq0Var).a));
                            throw e;
                        }
                    } catch (Throwable th) {
                        th = th;
                        r7 = vgn0Var5;
                        r7.c((Object) null);
                        throw th;
                    }
                }
                i = py10Var.f;
                vgn0 vgn0Var6 = py10Var.d;
                str2 = py10Var.c;
                list2 = py10Var.b;
                ewqVar2 = py10Var.a;
                hm5.M(obj);
                vgn0Var = vgn0Var6;
                py10Var.a = ewqVar2;
                py10Var.b = list2;
                py10Var.c = str2;
                py10Var.d = vgn0Var;
                py10Var.f = i;
                py10Var.g = 0;
                py10Var.t = 2;
                if (f(py10Var) != d9nVar) {
                    list3 = list2;
                    ewqVar3 = ewqVar2;
                    r8 = vgn0Var;
                    i2 = i7;
                    r4 = r8;
                    if (ey10Var.c().size() < 20) {
                        throw new FeedbackSubmissionException("Bug report queue is full (max 20 reports). Please wait for connectivity.", null);
                    }
                    ett ettVar2 = new ett((Object) this, (lnm) null, (byte) 29);
                    py10Var.a = ewqVar3;
                    py10Var.b = list3;
                    py10Var.c = str2;
                    py10Var.d = r4;
                    py10Var.f = i;
                    py10Var.g = i2;
                    py10Var.t = 3;
                    objO = rc2.O(5000L, ettVar2, py10Var);
                    if (objO == d9nVar) {
                        int i10 = i;
                        i3 = i2;
                        obj = objO;
                        i4 = i10;
                        r5 = r4;
                        str3 = (String) obj;
                        if (str3 == null) {
                            throw new FeedbackSubmissionException("Could not confirm the signed-in account. Please try again.", null);
                        }
                        if (!ihc1.y0(str2)) {
                        }
                        throw new FeedbackSubmissionException("Account changed before the report was saved.", null);
                    }
                }
                return d9nVar;
            } catch (Throwable th2) {
                th = th2;
                r7 = r8;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ewq ewqVar, onm onmVar) {
        qy10 qy10Var;
        diq0 diq0Var;
        if (onmVar instanceof qy10) {
            qy10Var = (qy10) onmVar;
            int i = qy10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qy10Var.d = i - Integer.MIN_VALUE;
            } else {
                qy10Var = new qy10(this, onmVar);
            }
        } else {
            qy10Var = new qy10(this, onmVar);
        }
        Object obj = qy10Var.b;
        int i2 = qy10Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            diq0 diq0VarD = d(ewqVar);
            qy10Var.a = diq0VarD;
            qy10Var.d = 1;
            Object objD = this.a.d(diq0VarD, qy10Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
            diq0Var = diq0VarD;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            diq0Var = qy10Var.a;
            hm5.M(obj);
        }
        return ((rwl1) diq0Var).a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        ry10 ry10Var;
        if (onmVar instanceof ry10) {
            ry10Var = (ry10) onmVar;
            int i = ry10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ry10Var.d = i - Integer.MIN_VALUE;
            } else {
                ry10Var = new ry10(this, onmVar);
            }
        } else {
            ry10Var = new ry10(this, onmVar);
        }
        Object objInvoke = ry10Var.b;
        int i2 = ry10Var.d;
        if (i2 == 0) {
            hm5.M(objInvoke);
            if (!ihc1.y0(str)) {
                ry10Var.a = str;
                ry10Var.d = 1;
                objInvoke = this.d.invoke(ry10Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = ry10Var.a;
        hm5.M(objInvoke);
        boolean z = u890.j(objInvoke, str);
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        sy10 sy10Var;
        if (onmVar instanceof sy10) {
            sy10Var = (sy10) onmVar;
            int i = sy10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                sy10Var.c = i - Integer.MIN_VALUE;
            } else {
                sy10Var = new sy10(this, onmVar);
            }
        } else {
            sy10Var = new sy10(this, onmVar);
        }
        Object objO = sy10Var.a;
        int i2 = sy10Var.c;
        if (i2 == 0) {
            hm5.M(objO);
            eqb eqbVar = new eqb(this, str, (lnm) null);
            sy10Var.c = 1;
            objO = rc2.O(5000L, eqbVar, sy10Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        List list = (List) objO;
        return list == null ? z6x.a : list;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c0 -> B:36:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cf -> B:17:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(p.onm r18) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uy10.f(p.onm):java.lang.Object");
    }

    public final void g(UUID uuid) {
        dy10 dy10VarI = this.b.i(uuid);
        if (dy10VarI != null) {
            Iterator it = dy10VarI.c.iterator();
            while (it.hasNext()) {
                new File((String) it.next()).delete();
            }
        }
    }
}
