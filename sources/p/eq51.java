package p;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class eq51 implements l3v {
    public final ArrayList X;
    public volatile boolean Y;
    public final long a;
    public final long b;
    public final n3r c;
    public final uzr0 d;
    public final ArrayList e;
    public final wpc f;
    public final zv81 g;
    public final pqc h;
    public final Executor i;
    public final long t;

    public eq51(yoh0 yoh0Var, uzr0 uzr0Var, wpc wpcVar, Executor executor, long j, long j2, long j3) {
        soh0 soh0Var = yoh0Var.b;
        soh0Var.getClass();
        this.c = b(soh0Var.a);
        this.d = uzr0Var;
        this.e = new ArrayList(soh0Var.e);
        this.f = wpcVar;
        this.i = executor;
        this.a = j2;
        this.b = j3;
        zv81 zv81Var = wpcVar.a;
        zv81Var.getClass();
        this.g = zv81Var;
        this.h = wpcVar.c;
        this.X = new ArrayList();
        this.t = zoi1.W(j);
    }

    public static n3r b(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        dm5.s(uri, "The uri must be set.");
        return new n3r(uri, 0L, 1, null, map, 0L, -1L, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    public static void f(List list, pqc pqcVar, long j) {
        HashMap map = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            cq51 cq51Var = (cq51) list.get(i2);
            n3r n3rVar = cq51Var.b;
            String strA = pqcVar.a(n3rVar);
            Integer num = (Integer) map.get(strA);
            cq51 cq51Var2 = num == null ? null : (cq51) list.get(num.intValue());
            if (cq51Var2 != null) {
                long j2 = cq51Var2.a;
                n3r n3rVar2 = cq51Var2.b;
                if (cq51Var.a <= j2 + j) {
                    Uri uri = n3rVar2.a;
                    long j3 = n3rVar2.g;
                    if (!uri.equals(n3rVar.a)) {
                        map.put(strA, Integer.valueOf(i));
                        list.set(i, cq51Var);
                        i++;
                    } else if (j3 != -1 && n3rVar2.f + j3 == n3rVar.f && Objects.equals(n3rVar2.h, n3rVar.h) && n3rVar2.i == n3rVar.i && n3rVar2.c == n3rVar.c && n3rVar2.e.equals(n3rVar.e)) {
                        long j4 = n3rVar.g;
                        n3r n3rVarE = n3rVar2.e(0L, j4 != -1 ? j3 + j4 : -1L);
                        num.getClass();
                        list.set(num.intValue(), new cq51(j2, n3rVarE));
                    } else {
                        map.put(strA, Integer.valueOf(i));
                        list.set(i, cq51Var);
                        i++;
                    }
                } else {
                    map.put(strA, Integer.valueOf(i));
                    list.set(i, cq51Var);
                    i++;
                }
            } else {
                map.put(strA, Integer.valueOf(i));
                list.set(i, cq51Var);
                i++;
            }
        }
        zoi1.d0(i, list.size(), list);
    }

    public final void a(fz31 fz31Var) {
        synchronized (this.X) {
            try {
                if (this.Y) {
                    throw new InterruptedException();
                }
                this.X.add(fz31Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kf20 c(xpc xpcVar, uzr0 uzr0Var, n3r n3rVar, boolean z) throws ExecutionException, InterruptedException, IOException {
        Object obj;
        uzr0Var.getClass();
        if (!z) {
            while (!this.Y) {
                aq51 aq51Var = new aq51(xpcVar, uzr0Var, n3rVar);
                a(aq51Var);
                this.i.execute(aq51Var);
                try {
                    try {
                        Object obj2 = aq51Var.get();
                        aq51Var.a();
                        h(aq51Var);
                        obj = obj2;
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        cause.getClass();
                        if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                            if (cause instanceof IOException) {
                                throw ((IOException) cause);
                            }
                            String str = zoi1.a;
                            throw e;
                        }
                        aq51Var.a();
                        h(aq51Var);
                    }
                } catch (Throwable th) {
                    aq51Var.a();
                    h(aq51Var);
                    throw th;
                }
            }
            throw new InterruptedException();
        }
        aq51 aq51Var2 = new aq51(xpcVar, uzr0Var, n3rVar);
        aq51Var2.run();
        try {
            obj = aq51Var2.get();
        } catch (ExecutionException e2) {
            Throwable cause2 = e2.getCause();
            cause2.getClass();
            if (cause2 instanceof IOException) {
                throw ((IOException) cause2);
            }
            String str2 = zoi1.a;
            throw e2;
        }
        return (kf20) obj;
    }

    @Override // p.l3v
    public final void cancel() {
        synchronized (this.X) {
            try {
                this.Y = true;
                for (int i = 0; i < this.X.size(); i++) {
                    ((fz31) this.X.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.l3v
    public final void d(vxu vxuVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        xpc xpcVarA;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            wpc wpcVar = this.f;
            k2r k2rVar = wpcVar.e;
            xpc xpcVarA2 = wpcVar.a(k2rVar != null ? k2rVar.j() : null, 1);
            kf20 kf20VarC = c(xpcVarA2, this.d, this.c, false);
            if (!this.e.isEmpty()) {
                kf20VarC = (kf20) kf20VarC.a(this.e);
            }
            ArrayList arrayListE = e(xpcVarA2, kf20VarC, false);
            Collections.sort(arrayListE);
            f(arrayListE, this.h, this.t);
            int size = arrayListE.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = arrayListE.size() - 1; size2 >= 0; size2--) {
                n3r n3rVar = ((cq51) arrayListE.get(size2)).b;
                String strA = this.h.a(n3rVar);
                long j3 = n3rVar.g;
                if (j3 == -1) {
                    long jA = hyl.a(this.g.g(strA));
                    if (jA != -1) {
                        j3 = jA - n3rVar.f;
                    }
                }
                long j4 = j3;
                long jE = this.g.e(n3rVar.f, j4, strA);
                j2 += jE;
                if (j4 != -1) {
                    if (j4 == jE) {
                        i++;
                        arrayListE.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            bq51 bq51Var = new bq51(vxuVar, j, size, j2, i);
            arrayDeque.addAll(arrayListE);
            while (!this.Y && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    wpc wpcVar2 = this.f;
                    k2r k2rVar2 = wpcVar2.e;
                    xpcVarA = wpcVar2.a(k2rVar2 != null ? k2rVar2.j() : null, 1);
                    bArr = new byte[131072];
                } else {
                    dq51 dq51Var = (dq51) arrayDeque2.removeFirst();
                    xpcVarA = dq51Var.i;
                    bArr = dq51Var.X;
                }
                dq51 dq51Var2 = new dq51((cq51) arrayDeque.removeFirst(), xpcVarA, bq51Var, bArr);
                a(dq51Var2);
                this.i.execute(dq51Var2);
                for (int size3 = this.X.size() - 1; size3 >= 0; size3--) {
                    dq51 dq51Var3 = (dq51) this.X.get(size3);
                    if (arrayDeque.isEmpty() || dq51Var3.b.e()) {
                        try {
                            dq51Var3.get();
                            g(size3);
                            arrayDeque2.addLast(dq51Var3);
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            cause.getClass();
                            if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                                if (cause instanceof IOException) {
                                    throw ((IOException) cause);
                                }
                                String str = zoi1.a;
                                throw cause;
                            }
                            arrayDeque.addFirst(dq51Var3.h);
                            g(size3);
                            arrayDeque2.addLast(dq51Var3);
                        }
                    }
                }
                dq51Var2.a.b();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.X.size();
                arrayList2 = this.X;
                if (i2 >= size4) {
                    break;
                }
                ((fz31) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((fz31) this.X.get(size5)).a();
                g(size5);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.X.size();
                arrayList = this.X;
                if (i3 >= size6) {
                    break;
                }
                ((fz31) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((fz31) this.X.get(size7)).a();
                g(size7);
            }
            throw th;
        }
    }

    public ArrayList e(xpc xpcVar, kf20 kf20Var, boolean z) {
        List list = ((rpl) ((d5b1) kf20Var).a.get(0)).d;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List<zvw0> list2 = ((xdx0) it.next()).b;
            ArrayList arrayList2 = new ArrayList();
            for (zvw0 zvw0Var : list2) {
                ArrayList arrayList3 = new ArrayList();
                String strW = nhc1.W(zvw0Var.d, "{{profile_id}}", String.valueOf(zvw0Var.a));
                Map map = Collections.EMPTY_MAP;
                Uri uriQ = pno1.q((String) zvw0Var.c.get(0), strW);
                dm5.s(uriQ, "The uri must be set.");
                arrayList3.add(new cq51(0L, new n3r(uriQ, 0L, 1, null, map, 0L, -1L, null, 0, null)));
                int iB = zvw0Var.b();
                for (int i = 0; i < iB; i++) {
                    long j = i;
                    vqz0 vqz0VarE = zvw0Var.e(j);
                    long j2 = j * zvw0Var.g;
                    Map map2 = Collections.EMPTY_MAP;
                    Uri uriQ2 = pno1.q((String) zvw0Var.c.get(0), vqz0VarE.b);
                    long j3 = vqz0VarE.a;
                    dm5.s(uriQ2, "The uri must be set.");
                    arrayList3.add(new cq51(j2, new n3r(uriQ2, 0L, 1, null, map2, 0L, j3, null, 0, null)));
                }
                r7h.W(arrayList3, arrayList2);
            }
            r7h.W(arrayList2, arrayList);
        }
        return arrayList;
    }

    public final void g(int i) {
        synchronized (this.X) {
            this.X.remove(i);
        }
    }

    public final void h(fz31 fz31Var) {
        synchronized (this.X) {
            this.X.remove(fz31Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0043 A[Catch: all -> 0x0031, ExcHandler: InterruptedException -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0031, InterruptedException -> 0x0043, InterruptedException -> 0x0043, Exception -> 0x003b, blocks: (B:3:0x000e, B:4:0x0019, B:6:0x001f, B:13:0x0043), top: B:19:0x000e }] */
    @Override // p.l3v
    public final void remove() {
        zv81 zv81Var = this.g;
        pqc pqcVar = this.h;
        n3r n3rVar = this.c;
        xpc xpcVarA = this.f.a((o2r) null, 1);
        try {
            ArrayList arrayListE = e(xpcVarA, c(xpcVarA, this.d, n3rVar, true), true);
            for (int i = 0; i < arrayListE.size(); i++) {
                zv81Var.k(pqcVar.a(((cq51) arrayListE.get(i)).b));
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception unused2) {
        } finally {
            zv81Var.k(pqcVar.a(n3rVar));
        }
    }
}
