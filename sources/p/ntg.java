package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ntg implements AutoCloseable {
    public boolean X;
    public final vwj1 a;
    public final qka b;
    public final j1 c;
    public stg h;
    public String t;
    public final Object d = new Object();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();
    public Set i = w7x.a;

    public ntg(vwj1 vwj1Var, svj1 svj1Var, qka qkaVar, j1 j1Var) {
        this.a = vwj1Var;
        this.b = qkaVar;
        this.c = j1Var;
        this.h = new stg(svj1Var.c, svj1Var.b);
    }

    public static y1k1 e(stg stgVar) {
        long j = stgVar.a;
        if (1 > j || j >= 2147483648L) {
            return null;
        }
        long j2 = stgVar.b;
        if (1 > j2 || j2 >= 2147483648L) {
            return null;
        }
        return new y1k1((int) j, (int) j2);
    }

    public final void a(String str) {
        y1k1 y1k1VarD = d(str);
        stg stgVar = y1k1VarD != null ? new stg(y1k1VarD.a, y1k1VarD.b) : this.h;
        LinkedHashMap linkedHashMap = this.g;
        if (u890.j(linkedHashMap.get(str), stgVar)) {
            return;
        }
        linkedHashMap.put(str, stgVar);
        this.c.invoke(str, stgVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x00aa A[Catch: all -> 0x0072, TryCatch #0 {, blocks: (B:32:0x006c, B:38:0x0075, B:40:0x007b, B:45:0x0087, B:47:0x0091, B:53:0x00a2, B:55:0x00aa, B:56:0x00b3, B:60:0x00c9, B:64:0x00d1, B:68:0x00d8, B:70:0x00e1, B:49:0x0097), top: B:79:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    public final void c(boolean z) {
        boolean z2;
        Collection collection;
        y1k1 y1k1Var;
        y1k1 y1k1Var2;
        ltg ltgVar;
        stg stgVar;
        String str = this.t;
        if (str == null) {
            this.a.T(this.d);
            return;
        }
        rtg rtgVar = (rtg) this.e.get(str);
        vwj1 vwj1Var = this.a;
        Object obj = this.d;
        y1k1 y1k1Var3 = null;
        ArrayList arrayList = rtgVar != null ? rtgVar.b : null;
        if (arrayList == null) {
            arrayList = z6x.a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stg stgVar2 = ((ltg) it.next()).b;
            y1k1 y1k1VarE = stgVar2 != null ? e(stgVar2) : null;
            if (y1k1VarE != null) {
                arrayList2.add(y1k1VarE);
            }
        }
        List listJ0 = o7h.j0(arrayList2);
        y1k1 y1k1VarD = d(str);
        y1k1 y1k1VarE2 = (rtgVar == null || (ltgVar = rtgVar.c) == null || (stgVar = ltgVar.b) == null) ? null : e(stgVar);
        a7e a7eVar = new a7e(this, str, (byte) 22);
        synchronized (vwj1Var) {
            if (z) {
                boolean z3 = true;
                if (vwj1Var.e == obj) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                collection = (Collection) vwj1Var.a.getValue();
                if (collection == null) {
                }
                vwj1Var.e = obj;
                vwj1Var.f = str;
                vwj1Var.g = a7eVar;
                if (z2) {
                    vwj1Var.c.l(Optional.empty());
                }
                vwj1Var.c.l(Optional.ofNullable(y1k1VarE2));
                vwj1Var.a.m((Object) null, listJ0);
                y1k1Var = vwj1Var.d;
                if (y1k1Var != null) {
                    y1k1Var = null;
                } else {
                    y1k1Var = null;
                }
                bpb1 bpb1Var = vwj1Var.b;
                if (y1k1Var == null) {
                    y1k1Var2 = y1k1VarD;
                } else {
                    y1k1Var2 = y1k1Var;
                }
                bpb1Var.m((Object) null, Optional.ofNullable(y1k1Var2));
                if (y1k1Var != null) {
                    y1k1Var3 = y1k1Var;
                }
                if (y1k1Var3 != null) {
                    a7eVar.invoke(y1k1Var3, uwj1.b);
                    return;
                }
                return;
            }
            if (vwj1Var.e != obj) {
                return;
            }
            boolean z4 = true;
            if (vwj1Var.e == obj || !u890.j(vwj1Var.f, str)) {
                z2 = true;
            } else {
                z2 = false;
            }
            collection = (Collection) vwj1Var.a.getValue();
            if ((collection == null && !collection.isEmpty()) || listJ0.isEmpty()) {
                z4 = false;
            }
            vwj1Var.e = obj;
            vwj1Var.f = str;
            vwj1Var.g = a7eVar;
            if (z2) {
                vwj1Var.c.l(Optional.empty());
            }
            vwj1Var.c.l(Optional.ofNullable(y1k1VarE2));
            vwj1Var.a.m((Object) null, listJ0);
            y1k1Var = vwj1Var.d;
            if (y1k1Var != null || ((!z2 && !z4) || !listJ0.contains(y1k1Var))) {
                y1k1Var = null;
            }
            bpb1 bpb1Var2 = vwj1Var.b;
            if (y1k1Var == null) {
                y1k1Var2 = y1k1VarD;
            } else {
                y1k1Var2 = y1k1Var;
            }
            bpb1Var2.m((Object) null, Optional.ofNullable(y1k1Var2));
            if (y1k1Var != null && !y1k1Var.equals(y1k1VarD)) {
                y1k1Var3 = y1k1Var;
            }
            if (y1k1Var3 != null) {
                a7eVar.invoke(y1k1Var3, uwj1.b);
                return;
            }
            return;
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.X) {
            return;
        }
        this.X = true;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            this.b.invoke(it.next());
        }
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.a.T(this.d);
    }

    public final y1k1 d(String str) {
        y1k1 y1k1Var;
        mtg mtgVar = (mtg) this.f.get(str);
        if (mtgVar == null) {
            return null;
        }
        if (mtgVar.b == uwj1.b) {
            y1k1 y1k1Var2 = mtgVar.a;
            vwj1 vwj1Var = this.a;
            synchronized (vwj1Var) {
                y1k1Var = vwj1Var.d;
            }
            if (!y1k1Var2.equals(y1k1Var)) {
                this.f.remove(str);
                return null;
            }
        }
        return mtgVar.a;
    }
}
