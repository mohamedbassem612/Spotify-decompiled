package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w9i1 extends xbk1 {
    public Set A1;
    public boolean B1;
    public boolean C1;
    public xab1 D1;
    public final xab1 E1;
    public final c490 N0;
    public final String O0;
    public final fe41 P0;
    public final rv3 Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final bpb1 V0;
    public final xe01 W0;
    public final eaa0 X;
    public c490 X0;
    public final px10 Y;
    public final String Y0;
    public final boolean Z;
    public final String Z0;
    public final bpb1 a1;
    public final vgr b;
    public final xe01 b1;
    public final kt91 c;
    public final bpb1 c1;
    public final q8n d;
    public final xe01 d1;
    public final q8n e;
    public final bpb1 e1;
    public final l9i1 f;
    public final xe01 f1;
    public final uy10 g;
    public final bpb1 g1;
    public final fyh1 h;
    public final xe01 h1;
    public final st60 i;
    public final bpb1 i1;
    public final xe01 j1;
    public final bpb1 k1;
    public final xe01 l1;
    public final bpb1 m1;
    public final xe01 n1;
    public final bpb1 o1;
    public final xe01 p1;
    public final bpb1 q1;
    public final xe01 r1;
    public final y7e1 s1;
    public final a390 t;
    public final y7e1 t1;
    public final y7e1 u1;
    public String v1;
    public boolean w1;
    public final Object x1;
    public final File y1;
    public boolean z1;

    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    public w9i1(vgr vgrVar, kt91 kt91Var, q8n q8nVar, q8n q8nVar2, l9i1 l9i1Var, uy10 uy10Var, fyh1 fyh1Var, st60 st60Var, a390 a390Var, String str, eaa0 eaa0Var, px10 px10Var, boolean z, c490 c490Var, String str2, fe41 fe41Var, boolean z2, rv3 rv3Var, boolean z3) {
        String string;
        String string2;
        byte b;
        String str3;
        String string3;
        vi11 vi11Var = fe41Var.b;
        this.b = vgrVar;
        this.c = kt91Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        this.f = l9i1Var;
        this.g = uy10Var;
        this.h = fyh1Var;
        this.i = st60Var;
        this.t = a390Var;
        this.X = eaa0Var;
        this.Y = px10Var;
        this.Z = z;
        this.N0 = c490Var;
        this.O0 = str2;
        this.P0 = fe41Var;
        this.Q0 = rv3Var;
        boolean z4 = true;
        this.R0 = px10Var == px10.c;
        boolean z5 = px10Var == px10.b && (z || z2);
        this.S0 = z5;
        this.T0 = z;
        if (!z && z5) {
            z4 = false;
        }
        this.U0 = z4;
        bpb1 bpb1VarB = gio1.b(!z3 ? Boolean.FALSE : (z || !z5) ? Boolean.TRUE : null);
        this.V0 = bpb1VarB;
        this.W0 = d5p1.h(bpb1VarB);
        this.X0 = c490Var;
        Object objS = vi11Var.s("saved_internal_issue_draft");
        Bundle bundle = (Bundle) (z5 ? objS : null);
        this.Y0 = eaa0Var != null ? eaa0Var.d : null;
        this.Z0 = eaa0Var != null ? eaa0Var.e : null;
        bpb1 bpb1VarB2 = gio1.b(bbe0.a);
        this.a1 = bpb1VarB2;
        this.b1 = d5p1.h(bpb1VarB2);
        String str4 = "";
        z6x z6xVar = z6x.a;
        bpb1 bpb1VarB3 = gio1.b(new e9i1(null, "User did not provide any comment", "", z6xVar));
        this.c1 = bpb1VarB3;
        this.d1 = d5p1.h(bpb1VarB3);
        bpb1 bpb1VarB4 = gio1.b((Object) null);
        this.e1 = bpb1VarB4;
        this.f1 = d5p1.h(bpb1VarB4);
        bpb1 bpb1VarB5 = gio1.b(Float.valueOf(1.0f));
        this.g1 = bpb1VarB5;
        this.h1 = d5p1.h(bpb1VarB5);
        Boolean bool = Boolean.TRUE;
        bpb1 bpb1VarB6 = gio1.b(bool);
        this.i1 = bpb1VarB6;
        this.j1 = d5p1.h(bpb1VarB6);
        bpb1 bpb1VarB7 = gio1.b(bool);
        this.k1 = bpb1VarB7;
        this.l1 = d5p1.h(bpb1VarB7);
        bpb1 bpb1VarB8 = gio1.b(z6xVar);
        this.m1 = bpb1VarB8;
        this.n1 = d5p1.h(bpb1VarB8);
        bpb1 bpb1VarB9 = gio1.b(Boolean.FALSE);
        this.o1 = bpb1VarB9;
        this.p1 = d5p1.h(bpb1VarB9);
        bpb1 bpb1VarB10 = gio1.b(0);
        this.q1 = bpb1VarB10;
        this.r1 = d5p1.h(bpb1VarB10);
        if (z5) {
            string = bundle != null ? bundle.getString("description") : null;
            string = string == null ? "" : string;
        }
        y7e1 y7e1Var = new y7e1(string, 2);
        this.s1 = y7e1Var;
        if (z5) {
            string2 = bundle != null ? bundle.getString("title") : null;
            string2 = string2 == null ? "" : string2;
        }
        this.t1 = new y7e1(string2, 2);
        if (z5) {
            if (bundle == null || (string3 = bundle.getString("reporter")) == null) {
                String strE = a390Var.a.e(a390.b, (String) null);
                if (strE != null) {
                    str4 = strE;
                }
            } else {
                str4 = string3;
            }
        }
        this.u1 = new y7e1(str4, 2);
        this.v1 = "No topic selected";
        this.x1 = new Object();
        File file = str != null ? new File(str) : null;
        this.y1 = file;
        this.A1 = file != null ? Collections.singleton(file) : w7x.a;
        if ((!z5 || z) && file != null) {
            gsg gsgVarA = ack1.a(this);
            k6g1 k6g1Var = new k6g1(this, file, (lnm) null, (byte) 18);
            b = 0;
            fn31.T(gsgVarA, (o8n) null, 0, k6g1Var, 3);
        } else {
            b = 0;
        }
        this.E1 = fn31.T(ack1.a(this), (o8n) null, b, new r9i1(this, null, b), 3);
        wh41 wh41Var = l9i1Var.a;
        faa0 faa0Var = l9i1Var.j;
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        l9i1Var.j = null;
        l9i1Var.l = null;
        wh41Var.l();
        wh41Var.n();
        if ((!z5 || bundle == null) && eaa0Var != null && (str3 = eaa0Var.f) != null) {
            h4e1 h4e1VarH = y7e1Var.h();
            try {
                h4e1VarH.append(str3);
                y7e1Var.a(h4e1VarH);
                y7e1Var.c();
            } catch (Throwable th) {
                y7e1Var.c();
                throw th;
            }
        }
        if (z5) {
            ((LinkedHashMap) vi11Var.c).put("saved_internal_issue_draft", new uk(this, (byte) 21));
        }
    }

    public static void T(smc0 smc0Var, ArrayList arrayList, boolean z) {
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (y520.F((File) obj).equals("txt")) {
                    arrayList2.add(obj);
                }
            }
            smc0Var.addAll(arrayList2);
        }
    }

    public static int d0(by10 by10Var) {
        int i = by10Var == null ? -1 : o9i1.a[by10Var.ordinal()];
        if (i == -1) {
            return 2131963555;
        }
        if (i == 1) {
            return 2131963568;
        }
        if (i == 2) {
            return 2131963566;
        }
        if (i == 3) {
            return 2131963565;
        }
        if (i == 4) {
            return 2131963569;
        }
        if (i == 5) {
            return 2131963567;
        }
        eg.o();
        return 0;
    }

    public final void S() {
        z6x z6xVarE0;
        synchronized (this.x1) {
            try {
                this.w1 = true;
                z6xVarE0 = this.B1 ? z6x.a : e0();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.h(o6x.a, new jyh0(this, z6xVarE0, (byte) 28));
    }

    public final void U(smc0 smc0Var) {
        synchronized (this.x1) {
            try {
                File file = this.y1;
                if (file != null) {
                    if (this.z1 || !file.exists()) {
                        file = null;
                    }
                    if (file != null) {
                        smc0Var.add(file);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object V(UUID uuid, u9i1 u9i1Var) {
        return this.g.a.a(uuid, 10000L, u9i1Var);
    }

    public final void W(Function0 function0) {
        List listE0;
        synchronized (this.x1) {
            if (this.w1 || this.C1) {
                listE0 = null;
            } else {
                this.w1 = true;
                listE0 = e0();
            }
        }
        if (listE0 == null) {
            return;
        }
        fe41 fe41Var = this.P0;
        if (this.S0) {
            ((LinkedHashMap) fe41Var.b.c).remove("saved_internal_issue_draft");
            fe41Var.b.N("saved_internal_issue_draft");
            ee41 ee41Var = (ee41) fe41Var.a.remove("saved_internal_issue_draft");
            if (ee41Var != null) {
                ee41Var.n();
            }
        }
        this.h.getClass();
        fyh1.d(listE0);
        this.f.a();
        function0.invoke();
    }

    public final void X(List list) {
        ArrayList arrayList;
        Set setP1 = o7h.p1(list);
        synchronized (this.x1) {
            try {
                Set set = this.A1;
                arrayList = new ArrayList();
                for (Object obj : set) {
                    File file = (File) obj;
                    if (y520.F(file).equals("txt") && !setP1.contains(file)) {
                        arrayList.add(obj);
                    }
                }
                this.A1 = dm61.v0(this.A1, o7h.p1(arrayList));
            } catch (Throwable th) {
                throw th;
            }
        }
        this.h.getClass();
        fyh1.d(arrayList);
    }

    public final void Y() {
        File file;
        synchronized (this.x1) {
            try {
                this.z1 = true;
                this.e1.l((Object) null);
                File file2 = this.y1;
                if (file2 != null) {
                    this.A1 = dm61.u0(file2, this.A1);
                }
                file = this.y1;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (file != null) {
            fyh1 fyh1Var = this.h;
            List listSingletonList = Collections.singletonList(file);
            fyh1Var.getClass();
            fyh1.d(listSingletonList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b8 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:50:0x00b2, B:52:0x00b8, B:55:0x00cb, B:57:0x00cf, B:58:0x00d4), top: B:72:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:50:0x00b2, B:52:0x00b8, B:55:0x00cb, B:57:0x00cf, B:58:0x00d4), top: B:72:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4 A[Catch: all -> 0x00c9, TRY_LEAVE, TryCatch #2 {all -> 0x00c9, blocks: (B:50:0x00b2, B:52:0x00b8, B:55:0x00cb, B:57:0x00cf, B:58:0x00d4), top: B:72:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(List list, iu30 iu30Var, onm onmVar) throws Throwable {
        p9i1 p9i1Var;
        List list2;
        l811 l811Var;
        Throwable th;
        List listE0;
        List listE1;
        if (onmVar instanceof p9i1) {
            p9i1Var = (p9i1) onmVar;
            int i = p9i1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9i1Var.e = i - Integer.MIN_VALUE;
            } else {
                p9i1Var = new p9i1(this, onmVar);
            }
        } else {
            p9i1Var = new p9i1(this, onmVar);
        }
        Object obj = p9i1Var.c;
        d9n d9nVar = d9n.a;
        int i2 = p9i1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            synchronized (this.x1) {
                if (this.w1) {
                    throw new IllegalStateException("Issue report was closed before it could be enqueued");
                }
                this.A1 = dm61.y0(this.A1, list);
                this.B1 = true;
            }
            l811 l811Var2 = new l811();
            try {
                geo0 geo0Var = geo0.b;
                w73 w73Var = new w73(iu30Var, (lnm) null, (byte) 20);
                p9i1Var.a = list;
                p9i1Var.b = l811Var2;
                p9i1Var.e = 1;
                Object objY = fn31.Y(geo0Var, w73Var, p9i1Var);
                if (objY == d9nVar) {
                    return d9nVar;
                }
                list2 = list;
                l811Var = l811Var2;
                obj = objY;
            } catch (Throwable th2) {
                list2 = list;
                l811Var = l811Var2;
                th = th2;
                synchronized (this.x1) {
                    this.B1 = false;
                    if (l811Var.a) {
                        this.A1 = dm61.v0(this.A1, o7h.p1(list2));
                    }
                    if (this.w1) {
                        listE0 = e0();
                    } else {
                        listE0 = z6x.a;
                    }
                }
                this.h.getClass();
                fyh1.d(listE0);
                throw th;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l811Var = p9i1Var.b;
            list2 = p9i1Var.a;
            try {
                hm5.M(obj);
            } catch (Throwable th3) {
                th = th3;
                synchronized (this.x1) {
                    try {
                        this.B1 = false;
                        if (l811Var.a) {
                            this.A1 = dm61.v0(this.A1, o7h.p1(list2));
                        }
                        if (this.w1) {
                            listE0 = e0();
                        } else {
                            listE0 = z6x.a;
                        }
                        this.h.getClass();
                        fyh1.d(listE0);
                        throw th;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
        l811Var.a = true;
        synchronized (this.x1) {
            try {
                this.B1 = false;
                if (l811Var.a) {
                    this.A1 = dm61.v0(this.A1, o7h.p1(list2));
                }
                listE1 = this.w1 ? e0() : z6x.a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.h.getClass();
        fyh1.d(listE1);
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:95:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    public final Object a0(onm onmVar) {
        s9i1 s9i1Var;
        Object m231Var;
        ?? r1;
        gy10 gy10Var;
        Object next;
        int i;
        Object obj;
        Object next2;
        Object next3;
        Throwable thA;
        String str;
        String str2;
        if (onmVar instanceof s9i1) {
            s9i1Var = (s9i1) onmVar;
            int i2 = s9i1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9i1Var.e = i2 - Integer.MIN_VALUE;
            } else {
                s9i1Var = new s9i1(this, onmVar);
            }
        } else {
            s9i1Var = new s9i1(this, onmVar);
        }
        s9i1 s9i1Var2 = s9i1Var;
        Object objY = s9i1Var2.c;
        ?? r2 = s9i1Var2.e;
        d9n d9nVar = d9n.a;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    String str3 = s9i1Var2.a;
                    hm5.M(objY);
                    r2 = str3;
                } else {
                    if (r2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = s9i1Var2.b;
                    hm5.M(objY);
                }
                m231Var = obj;
                thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, "Could not retrieve queued bug report delivery status", new Object[0]);
                }
                return rih1.a;
            }
            hm5.M(objY);
            if ((this.S0 || (this.R0 && this.X != null)) && (str = this.O0) != null) {
                str2 = !ihc1.y0(str) ? str : null;
                if (str2 != null) {
                    q8n q8nVar = this.d;
                    k6g1 k6g1Var = new k6g1(this, str2, (lnm) null, (byte) 19);
                    s9i1Var2.a = str2;
                    s9i1Var2.b = null;
                    s9i1Var2.e = 1;
                    objY = fn31.Y(q8nVar, k6g1Var, s9i1Var2);
                    if (objY == d9nVar) {
                        r2 = str2;
                    }
                    return d9nVar;
                }
            }
            return rih1.a;
            r2 = str2;
            m231Var = (List) objY;
            r1 = r2;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
            r1 = r2;
        }
        ?? r10 = r1;
        if (!(m231Var instanceof m231)) {
            List list = (List) m231Var;
            List list2 = list;
            Iterator it = list2.iterator();
            do {
                boolean zHasNext = it.hasNext();
                gy10Var = gy10.a;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((qx10) next).b, gy10Var));
            qx10 qx10Var = (qx10) next;
            if (qx10Var == null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((qx10) next2).b != null);
                qx10Var = (qx10) next2;
                if (qx10Var == null) {
                    Iterator it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!(((qx10) next3).b instanceof fy10));
                    qx10Var = (qx10) next3;
                    if (qx10Var != null || (qx10Var = (qx10) o7h.s0(list)) != null) {
                    }
                    return rih1.a;
                }
            }
            qx10 qx10Var2 = qx10Var;
            iy10 iy10Var = qx10Var2.b;
            if (u890.j(iy10Var, gy10Var)) {
                i = 2131956754;
            } else if (iy10Var == null) {
                i = 2131956745;
            } else if (iy10Var instanceof fy10) {
                i = 2131956744;
            } else {
                if (!iy10Var.equals(hy10.a)) {
                    eg.o();
                    return null;
                }
                i = 2131956753;
            }
            m7s m7sVar = new m7s((Object) this, i, (Object) qx10Var2, (Object) r10, (lnm) null, (byte) 5);
            s9i1Var2.a = null;
            s9i1Var2.b = m231Var;
            s9i1Var2.e = 2;
            if (fn31.Y(this.e, m7sVar, s9i1Var2) != d9nVar) {
                obj = m231Var;
                m231Var = obj;
            }
            return d9nVar;
        }
        thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Could not retrieve queued bug report delivery status", new Object[0]);
        }
        return rih1.a;
    }

    public final void b0(File file) {
        boolean z;
        synchronized (this.x1) {
            if (this.w1) {
                z = true;
            } else {
                this.A1 = dm61.x0(file, this.A1);
                z = false;
            }
        }
        if (z) {
            fyh1 fyh1Var = this.h;
            List listSingletonList = Collections.singletonList(file);
            fyh1Var.getClass();
            fyh1.d(listSingletonList);
        }
    }

    public final void c0(String str, Function0 function0) {
        boolean z;
        if (u890.j(this.V0.getValue(), Boolean.FALSE)) {
            return;
        }
        String string = this.t1.d().d.toString();
        String strA = this.S0 ? qm21.a(this.u1.d().d.toString()) : null;
        if (this.S0 && (ihc1.y0(string) || ihc1.y0(str) || strA == null)) {
            return;
        }
        synchronized (this.x1) {
            if (this.w1 || this.C1) {
                z = false;
            } else {
                this.C1 = true;
                z = true;
            }
        }
        if (z) {
            bpb1 bpb1Var = this.a1;
            sbe0 sbe0Var = sbe0.a;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, sbe0Var);
            fn31.T(ack1.a(this), (o8n) null, 0, new v9i1(this, this.U0 && (this.S0 || ((Boolean) this.j1.a.getValue()).booleanValue()), strA, string, str, this.S0 ? ((Boolean) this.l1.a.getValue()).booleanValue() : ((Boolean) this.j1.a.getValue()).booleanValue(), function0, (lnm) null), 3);
        }
    }

    public final List e0() {
        List listL1 = o7h.l1(this.A1);
        this.A1 = w7x.a;
        bpb1 bpb1Var = this.m1;
        bpb1Var.getClass();
        bpb1Var.m((Object) null, z6x.a);
        this.e1.l((Object) null);
        return listL1;
    }
}
