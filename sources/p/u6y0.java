package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u6y0 implements f961 {
    public final ConcurrentHashMap N0;
    public final llm Y;
    public final LinkedHashMap Z;
    public final xrc0 a;
    public final iyc0 b;
    public final g0l c;
    public final zor d;
    public final kt91 e;
    public final q8n f;
    public final u6y0 g = this;
    public final u6y0 h = this;
    public final u6y0 i = this;
    public final u6y0 t = this;
    public final u6y0 X = this;

    public u6y0(xrc0 xrc0Var, iyc0 iyc0Var, g0l g0lVar, zor zorVar, kt91 kt91Var, q8n q8nVar, q8n q8nVar2) {
        this.a = xrc0Var;
        this.b = iyc0Var;
        this.c = g0lVar;
        this.d = zorVar;
        this.e = kt91Var;
        this.f = q8nVar2;
        j0d1 j0d1VarB = guo1.B();
        p8n p8nVar = q8n.b;
        this.Y = smo1.e(flo1.l(j0d1VarB, q8nVar.M(1)));
        this.Z = new LinkedHashMap();
        this.N0 = new ConcurrentHashMap();
    }

    public static m6y0 g(e1l e1lVar, boolean z) {
        nnr nnrVar = (nnr) e1lVar.d.h();
        if (nnrVar != null) {
            String str = nnrVar.d;
            if (ihc1.y0(str)) {
                str = null;
            }
            if (str != null) {
                return z ? new i6y0(str) : new l6y0(str);
            }
        }
        return k6y0.a;
    }

    public static m6y0 h(e1l e1lVar, boolean z) {
        String strD;
        l0l l0lVar = (l0l) e1lVar.c.h();
        String str = null;
        if (l0lVar != null && (strD = l0lVar.d()) != null && !ihc1.y0(strD)) {
            str = strD;
        }
        if (l0lVar != null) {
            return (!z || str == null) ? g(e1lVar, false) : new j6y0(str);
        }
        return !z ? g(e1lVar, false) : g(e1lVar, true);
    }

    public static void l(u6y0 u6y0Var, String str, int i, UUID uuid, int i2) {
        if ((i2 & 4) != 0) {
            uuid = UUID.randomUUID();
        }
        UUID uuid2 = uuid;
        boolean z = (i2 & 8) != 0;
        u6y0Var.j(str);
        u6y0Var.q(str, new h6y0(uuid2, new v6y0(str, i, false, false), false, z, null, null, null));
        xab1 xab1VarT = fn31.T(u6y0Var.Y, (o8n) null, 0, new ha5(u6y0Var, str, uuid2, (lnm) null), 3);
        LinkedHashMap linkedHashMap = u6y0Var.Z;
        h6y0 h6y0Var = (h6y0) linkedHashMap.get(str);
        if (u890.j(h6y0Var != null ? h6y0Var.a : null, uuid2)) {
            linkedHashMap.put(str, h6y0.a(h6y0Var, null, false, null, xab1VarT, null, 95));
        } else {
            xab1VarT.d((CancellationException) null);
        }
    }

    public static /* synthetic */ Object n(u6y0 u6y0Var, String str, boolean z, tv80 tv80Var, boolean z2, onm onmVar, int i) {
        if ((i & 4) != 0) {
            tv80Var = null;
        }
        return u6y0Var.m(str, z, tv80Var, (i & 8) != 0 ? false : z2, (i & 16) != 0, onmVar);
    }

    public final g6y0 a(String str) {
        g6y0 g6y0Var = new g6y0(str, UUID.randomUUID());
        fn31.T(this.Y, (o8n) null, 0, new i3y0(this, str, g6y0Var, (lnm) null, (byte) 1), 3);
        return g6y0Var;
    }

    public final void b(g6y0 g6y0Var) {
        fn31.T(this.Y, (o8n) null, 0, new cqu0(this, g6y0Var, (lnm) null, (byte) 26), 3);
    }

    public final Object c(String str, onm onmVar) {
        LinkedHashMap linkedHashMap = this.Z;
        h6y0 h6y0Var = (h6y0) linkedHashMap.get(str);
        rih1 rih1Var = rih1.a;
        if (h6y0Var != null) {
            boolean z = h6y0Var.d;
            o6y0 o6y0Var = h6y0Var.g;
            if (o6y0Var != null) {
                if (!u890.j(h6y0Var.a, o6y0Var.a)) {
                    e(str, true);
                    return rih1Var;
                }
                v6y0 v6y0Var = h6y0Var.b;
                if (!v6y0Var.d) {
                    if (!v6y0Var.c && z) {
                        e(str, true);
                        return rih1Var;
                    }
                    if (o6y0Var.b) {
                        e(str, false);
                        return rih1Var;
                    }
                    linkedHashMap.put(str, h6y0.a(h6y0Var, null, false, null, null, o6y0.a(o6y0Var, null, 5), 63));
                    Object objN = n(this, str, false, null, !z, onmVar, 4);
                    if (objN == d9n.a) {
                        return objN;
                    }
                }
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object d(String str, onm onmVar) throws Throwable {
        p6y0 p6y0Var;
        String str2;
        py21 py21Var;
        String str3;
        ayh ayhVarA;
        Throwable th;
        ayh ayhVar;
        String str4;
        String str5;
        if (onmVar instanceof p6y0) {
            p6y0Var = (p6y0) onmVar;
            int i = p6y0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6y0Var.e = i - Integer.MIN_VALUE;
            } else {
                p6y0Var = new p6y0(this, onmVar);
            }
        } else {
            p6y0Var = new p6y0(this, onmVar);
        }
        p6y0 p6y0Var2 = p6y0Var;
        Object objJ = p6y0Var2.c;
        int i2 = p6y0Var2.e;
        llm llmVar = this.Y;
        d9n d9nVar = d9n.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objJ);
                    if (o(str).getValue() == null) {
                        rsc0 rsc0Var = this.a;
                        rxc0 rxc0Var = new rxc0(str);
                        p6y0Var2.a = str;
                        p6y0Var2.e = 1;
                        objJ = rsc0Var.j(rxc0Var, p6y0Var2);
                        if (objJ != d9nVar) {
                            str3 = str;
                        }
                    } else {
                        str2 = str;
                        py21Var = null;
                        ayhVarA = sap1.a();
                        fn31.T(llmVar, (o8n) null, 0, new elu0((byte) 9, this, py21Var, ayhVarA, str2, (lnm) null), 3);
                        p6y0Var2.a = str2;
                        p6y0Var2.b = ayhVarA;
                        p6y0Var2.e = 2;
                        objJ = ayhVarA.Q(p6y0Var2);
                        if (objJ != d9nVar) {
                            ayhVar = ayhVarA;
                            str5 = str2;
                            Boolean bool = (Boolean) objJ;
                            bool.getClass();
                            if (!ayhVar.v()) {
                                ayhVar.d((CancellationException) null);
                            }
                            fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str5, ayhVar, (lnm) null, (byte) 2), 3);
                            return bool;
                        }
                    }
                    return d9nVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ayhVar = p6y0Var2.b;
                    str5 = p6y0Var2.a;
                    try {
                        hm5.M(objJ);
                        try {
                            Boolean bool2 = (Boolean) objJ;
                            bool2.getClass();
                            if (!ayhVar.v()) {
                                ayhVar.d((CancellationException) null);
                            }
                            fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str5, ayhVar, (lnm) null, (byte) 2), 3);
                            return bool2;
                        } catch (Throwable th2) {
                            str4 = str5;
                            th = th2;
                            if (!ayhVar.v()) {
                                ayhVar.d((CancellationException) r12);
                            }
                            fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str4, ayhVar, (lnm) null, (byte) 2), 3);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        str4 = str5;
                        if (!ayhVar.v()) {
                            ayhVar.d((CancellationException) r12);
                        }
                        fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str4, ayhVar, (lnm) null, (byte) 2), 3);
                        throw th;
                    }
                }
                str3 = p6y0Var2.a;
                hm5.M(objJ);
                p6y0Var2.a = str2;
                p6y0Var2.b = ayhVarA;
                p6y0Var2.e = 2;
                objJ = ayhVarA.Q(p6y0Var2);
                if (objJ != d9nVar) {
                    ayhVar = ayhVarA;
                    str5 = str2;
                    Boolean bool3 = (Boolean) objJ;
                    bool3.getClass();
                    if (!ayhVar.v()) {
                        ayhVar.d((CancellationException) null);
                    }
                    fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str5, ayhVar, (lnm) null, (byte) 2), 3);
                    return bool3;
                }
                return d9nVar;
            } catch (Throwable th4) {
                th = th4;
                ayhVar = ayhVarA;
                str4 = str2;
                if (!ayhVar.v()) {
                    ayhVar.d((CancellationException) r12);
                }
                fn31.T(llmVar, (o8n) null, 0, new i3y0(this, str4, ayhVar, (lnm) null, (byte) 2), 3);
                throw th;
            }
            str2 = str3;
            py21Var = (py21) objJ;
            ayhVarA = sap1.a();
            fn31.T(llmVar, (o8n) null, 0, new elu0((byte) 9, this, py21Var, ayhVarA, str2, (lnm) null), 3);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public final void e(String str, boolean z) {
        o6y0 o6y0Var;
        LinkedHashMap linkedHashMap = this.Z;
        h6y0 h6y0Var = (h6y0) linkedHashMap.get(str);
        if (h6y0Var == null || (o6y0Var = h6y0Var.g) == null) {
            return;
        }
        linkedHashMap.put(str, h6y0.a(h6y0Var, null, false, null, null, null, 63));
        Iterator it = o6y0Var.c.iterator();
        while (it.hasNext()) {
            ((zxh) it.next()).m0(Boolean.valueOf(z));
        }
    }

    public final boolean f(String str, UUID uuid, UUID uuid2) {
        h6y0 h6y0Var = (h6y0) this.Z.get(str);
        return h6y0Var != null && u890.j(h6y0Var.a, uuid) && u890.j(h6y0Var.e, uuid2);
    }

    public final Object getApi() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(m6y0 m6y0Var, onm onmVar) {
        q6y0 q6y0Var;
        if (onmVar instanceof q6y0) {
            q6y0Var = (q6y0) onmVar;
            int i = q6y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6y0Var.c = i - Integer.MIN_VALUE;
            } else {
                q6y0Var = new q6y0(this, onmVar);
            }
        } else {
            q6y0Var = new q6y0(this, onmVar);
        }
        Object obj = q6y0Var.a;
        int i2 = q6y0Var.c;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            if (m6y0Var instanceof i6y0) {
                zor zorVar = this.d;
                q6y0Var.c = 1;
                Object objJ = zorVar.j(l7l.a, q6y0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public final void j(String str) {
        o6y0 o6y0Var;
        faa0 faa0Var;
        h6y0 h6y0Var = (h6y0) this.Z.remove(str);
        if (h6y0Var != null && (faa0Var = h6y0Var.f) != null) {
            faa0Var.d((CancellationException) null);
        }
        o(str).l((Object) null);
        if (h6y0Var == null || (o6y0Var = h6y0Var.g) == null) {
            return;
        }
        Iterator it = o6y0Var.c.iterator();
        while (it.hasNext()) {
            ((zxh) it.next()).m0(Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0078  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(onm onmVar) {
        r6y0 r6y0Var;
        m6y0 m231Var;
        if (onmVar instanceof r6y0) {
            r6y0Var = (r6y0) onmVar;
            int i = r6y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6y0Var.c = i - Integer.MIN_VALUE;
            } else {
                r6y0Var = new r6y0(this, onmVar);
            }
        } else {
            r6y0Var = new r6y0(this, onmVar);
        }
        Object objJ = r6y0Var.a;
        int i2 = r6y0Var.c;
        inr inrVar = this.c;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objJ);
                    inr inrVar2 = inrVar;
                    Single singleF = rqt0.F(inrVar2.i, new n1o(inrVar2, (lnm) null, (byte) 11));
                    r6y0Var.c = 1;
                    objJ = fc11.j(singleF, r6y0Var);
                    d9n d9nVar = d9n.a;
                    if (objJ == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objJ);
                }
                return h(inrVar.g(), ((Boolean) objJ).booleanValue());
            } catch (Throwable th) {
                m231Var = new m231(th);
                if (m231Var instanceof m231) {
                    m231Var = k6y0.a;
                }
                return m231Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            m231Var = g(inrVar.g(), false);
            if (m231Var instanceof m231) {
                m231Var = k6y0.a;
            }
            return m231Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object m(String str, boolean z, tv80 tv80Var, boolean z2, boolean z3, onm onmVar) {
        s6y0 s6y0Var;
        h6y0 h6y0Var;
        UUID uuid;
        n6y0 n6y0Var;
        UUID uuid2;
        boolean z4;
        String str2;
        boolean z5;
        tv80 tv80Var2;
        UUID uuid3;
        m6y0 m6y0Var;
        String str3 = str;
        boolean z6 = z;
        boolean z7 = z2;
        if (onmVar instanceof s6y0) {
            s6y0Var = (s6y0) onmVar;
            int i = s6y0Var.X;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6y0Var.X = i - Integer.MIN_VALUE;
            } else {
                s6y0Var = new s6y0(this, onmVar);
            }
        } else {
            s6y0Var = new s6y0(this, onmVar);
        }
        s6y0 s6y0Var2 = s6y0Var;
        Object obj = s6y0Var2.i;
        int i2 = s6y0Var2.X;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            h6y0Var = (h6y0) this.Z.get(str3);
            if (h6y0Var != null) {
                v6y0 v6y0Var = h6y0Var.b;
                if (h6y0Var.e == null && (z7 || v6y0Var.c != z6)) {
                    UUID uuidRandomUUID = UUID.randomUUID();
                    uuid = uuidRandomUUID;
                    q(str3, h6y0.a(h6y0Var, v6y0.a(v6y0Var, z6, true, 3), false, uuidRandomUUID, null, null, 109));
                    if (z6) {
                        s6y0Var2.a = str3;
                        s6y0Var2.b = tv80Var;
                        s6y0Var2.c = h6y0Var;
                        s6y0Var2.d = uuid;
                        s6y0Var2.f = z6;
                        s6y0Var2.g = z7;
                        s6y0Var2.h = z3;
                        s6y0Var2.X = 1;
                        Object objK = k(s6y0Var2);
                        if (objK != obj2) {
                            str2 = str3;
                            z5 = z3;
                            tv80Var2 = tv80Var;
                            obj = objK;
                        }
                    } else {
                        n6y0Var = new n6y0(null, null, false);
                        uuid2 = uuid;
                        z4 = z3;
                        UUID uuid4 = h6y0Var.a;
                        uuid2.getClass();
                        s6y0Var2.a = null;
                        s6y0Var2.b = null;
                        s6y0Var2.c = null;
                        s6y0Var2.d = null;
                        s6y0Var2.e = null;
                        s6y0Var2.f = z6;
                        s6y0Var2.g = z7;
                        s6y0Var2.h = z4;
                        s6y0Var2.X = 3;
                        if (p(str3, uuid4, uuid2, n6y0Var, z4, s6y0Var2) == obj2) {
                        }
                    }
                }
            }
        }
        if (i2 == 1) {
            z5 = s6y0Var2.h;
            boolean z8 = s6y0Var2.g;
            boolean z9 = s6y0Var2.f;
            uuid = s6y0Var2.d;
            h6y0Var = s6y0Var2.c;
            tv80Var2 = s6y0Var2.b;
            str2 = s6y0Var2.a;
            hm5.M(obj);
            z7 = z8;
            z6 = z9;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                return rih1Var;
            }
            z5 = s6y0Var2.h;
            boolean z10 = s6y0Var2.g;
            boolean z11 = s6y0Var2.f;
            m6y0Var = s6y0Var2.e;
            uuid3 = s6y0Var2.d;
            h6y0Var = s6y0Var2.c;
            tv80Var2 = s6y0Var2.b;
            str2 = s6y0Var2.a;
            hm5.M(obj);
            z7 = z10;
            z6 = z11;
        }
        n6y0Var = new n6y0(m6y0Var.a(), tv80Var2, true);
        z4 = z5;
        uuid2 = uuid3;
        str3 = str2;
        UUID uuid5 = h6y0Var.a;
        uuid2.getClass();
        s6y0Var2.a = null;
        s6y0Var2.b = null;
        s6y0Var2.c = null;
        s6y0Var2.d = null;
        s6y0Var2.e = null;
        s6y0Var2.f = z6;
        s6y0Var2.g = z7;
        s6y0Var2.h = z4;
        s6y0Var2.X = 3;
        return p(str3, uuid5, uuid2, n6y0Var, z4, s6y0Var2) == obj2 ? obj2 : rih1Var;
        m6y0 m6y0Var2 = (m6y0) obj;
        UUID uuid6 = h6y0Var.a;
        uuid.getClass();
        if (f(str2, uuid6, uuid)) {
            s6y0Var2.a = str2;
            s6y0Var2.b = tv80Var2;
            s6y0Var2.c = h6y0Var;
            s6y0Var2.d = uuid;
            s6y0Var2.e = m6y0Var2;
            s6y0Var2.f = z6;
            s6y0Var2.g = z7;
            s6y0Var2.h = z5;
            s6y0Var2.X = 2;
            if (i(m6y0Var2, s6y0Var2) != obj2) {
                uuid3 = uuid;
                m6y0Var = m6y0Var2;
                n6y0Var = new n6y0(m6y0Var.a(), tv80Var2, true);
                z4 = z5;
                uuid2 = uuid3;
                str3 = str2;
                UUID uuid7 = h6y0Var.a;
                uuid2.getClass();
                s6y0Var2.a = null;
                s6y0Var2.b = null;
                s6y0Var2.c = null;
                s6y0Var2.d = null;
                s6y0Var2.e = null;
                s6y0Var2.f = z6;
                s6y0Var2.g = z7;
                s6y0Var2.h = z4;
                s6y0Var2.X = 3;
                if (p(str3, uuid7, uuid2, n6y0Var, z4, s6y0Var2) == obj2) {
                }
            }
        }
    }

    public final wen0 o(String str) {
        return (wen0) this.N0.computeIfAbsent(str, azt.g);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object p(String str, UUID uuid, UUID uuid2, n6y0 n6y0Var, boolean z, onm onmVar) {
        t6y0 t6y0Var;
        UUID uuid3;
        UUID uuid4;
        n6y0 n6y0Var2;
        boolean z2;
        UUID uuid5;
        UUID uuid6;
        String str2;
        boolean z3;
        boolean z4;
        h6y0 h6y0Var;
        Object objC;
        h6y0 h6y0Var2;
        v6y0 v6y0Var;
        String str3 = str;
        if (onmVar instanceof t6y0) {
            t6y0Var = (t6y0) onmVar;
            int i = t6y0Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                t6y0Var.h = i - Integer.MIN_VALUE;
            } else {
                t6y0Var = new t6y0(this, onmVar);
            }
        } else {
            t6y0Var = new t6y0(this, onmVar);
        }
        Object objA = t6y0Var.f;
        int i2 = t6y0Var.h;
        Object obj = d9n.a;
        Object obj2 = rih1.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objA);
                    if (f(str, uuid, uuid2)) {
                        try {
                            iyc0 iyc0Var = this.b;
                            ayc0 ayc0Var = new ayc0("PLAY_ON_READY", (phc) null, n6y0Var.a(), true, (String) null, 18);
                            t6y0Var.a = str3;
                            uuid3 = uuid;
                            try {
                                t6y0Var.b = uuid3;
                                uuid4 = uuid2;
                                try {
                                    t6y0Var.c = uuid4;
                                    n6y0Var2 = n6y0Var;
                                    try {
                                        t6y0Var.d = n6y0Var2;
                                        z2 = z;
                                        try {
                                            t6y0Var.e = z2;
                                            t6y0Var.h = 1;
                                            objA = iyc0.a(iyc0Var, str3, ayc0Var, t6y0Var);
                                            if (objA != obj) {
                                                uuid5 = uuid3;
                                                uuid6 = uuid4;
                                                str2 = str3;
                                            }
                                        } catch (Exception unused) {
                                            uuid5 = uuid3;
                                            uuid6 = uuid4;
                                            str2 = str3;
                                            z3 = false;
                                        }
                                    } catch (Exception unused2) {
                                        z2 = z;
                                        uuid5 = uuid3;
                                        uuid6 = uuid4;
                                        str2 = str3;
                                        z3 = false;
                                        z4 = n6y0Var2.a;
                                        t6y0Var.a = null;
                                        t6y0Var.b = null;
                                        t6y0Var.c = null;
                                        t6y0Var.d = null;
                                        t6y0Var.e = z2;
                                        t6y0Var.h = 2;
                                        h6y0Var = (h6y0) this.Z.get(str2);
                                        if (h6y0Var == null) {
                                            objC = obj2;
                                        } else {
                                            if (u890.j(h6y0Var.a, uuid5)) {
                                                h6y0Var2 = null;
                                            } else {
                                                h6y0Var2 = null;
                                            }
                                            if (h6y0Var2 == null) {
                                                objC = obj2;
                                            } else {
                                                v6y0Var = h6y0Var2.b;
                                                if (z3) {
                                                    q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, false, false, 7), z4, null, null, null, 97));
                                                    if (z2) {
                                                        fn31.T(this.Y, this.f, 0, new c3u0(this, z4, (lnm) null, (byte) 21), 2);
                                                    }
                                                } else {
                                                    q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, h6y0Var2.c, false, 3), false, null, null, null, 109));
                                                }
                                                objC = c(str2, t6y0Var);
                                                if (objC != obj) {
                                                    objC = obj2;
                                                }
                                            }
                                        }
                                        if (objC == obj) {
                                            return obj;
                                        }
                                        return obj2;
                                    }
                                } catch (Exception unused3) {
                                    n6y0Var2 = n6y0Var;
                                    z2 = z;
                                    uuid5 = uuid3;
                                    uuid6 = uuid4;
                                    str2 = str3;
                                    z3 = false;
                                    z4 = n6y0Var2.a;
                                    t6y0Var.a = null;
                                    t6y0Var.b = null;
                                    t6y0Var.c = null;
                                    t6y0Var.d = null;
                                    t6y0Var.e = z2;
                                    t6y0Var.h = 2;
                                    h6y0Var = (h6y0) this.Z.get(str2);
                                    if (h6y0Var == null) {
                                        objC = obj2;
                                    } else {
                                        if (u890.j(h6y0Var.a, uuid5)) {
                                            h6y0Var2 = null;
                                        } else {
                                            h6y0Var2 = null;
                                        }
                                        if (h6y0Var2 == null) {
                                            objC = obj2;
                                        } else {
                                            v6y0Var = h6y0Var2.b;
                                            if (z3) {
                                                q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, false, false, 7), z4, null, null, null, 97));
                                                if (z2) {
                                                    fn31.T(this.Y, this.f, 0, new c3u0(this, z4, (lnm) null, (byte) 21), 2);
                                                }
                                            } else {
                                                q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, h6y0Var2.c, false, 3), false, null, null, null, 109));
                                            }
                                            objC = c(str2, t6y0Var);
                                            if (objC != obj) {
                                                objC = obj2;
                                            }
                                        }
                                    }
                                    if (objC == obj) {
                                        return obj;
                                    }
                                    return obj2;
                                }
                            } catch (Exception unused4) {
                                uuid4 = uuid2;
                                n6y0Var2 = n6y0Var;
                                z2 = z;
                                uuid5 = uuid3;
                                uuid6 = uuid4;
                                str2 = str3;
                                z3 = false;
                                z4 = n6y0Var2.a;
                                t6y0Var.a = null;
                                t6y0Var.b = null;
                                t6y0Var.c = null;
                                t6y0Var.d = null;
                                t6y0Var.e = z2;
                                t6y0Var.h = 2;
                                h6y0Var = (h6y0) this.Z.get(str2);
                                if (h6y0Var == null) {
                                    objC = obj2;
                                } else {
                                    if (u890.j(h6y0Var.a, uuid5)) {
                                        h6y0Var2 = null;
                                    } else {
                                        h6y0Var2 = null;
                                    }
                                    if (h6y0Var2 == null) {
                                        objC = obj2;
                                    } else {
                                        v6y0Var = h6y0Var2.b;
                                        if (z3) {
                                            q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, false, false, 7), z4, null, null, null, 97));
                                            if (z2) {
                                                fn31.T(this.Y, this.f, 0, new c3u0(this, z4, (lnm) null, (byte) 21), 2);
                                            }
                                        } else {
                                            q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, h6y0Var2.c, false, 3), false, null, null, null, 109));
                                        }
                                        objC = c(str2, t6y0Var);
                                        if (objC != obj) {
                                            objC = obj2;
                                        }
                                    }
                                }
                                if (objC == obj) {
                                    return obj;
                                }
                                return obj2;
                            }
                        } catch (Exception unused5) {
                            uuid3 = uuid;
                        }
                        return obj;
                    }
                    return obj2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        hm5.M(objA);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = t6y0Var.e;
                n6y0 n6y0Var3 = t6y0Var.d;
                uuid6 = t6y0Var.c;
                uuid5 = t6y0Var.b;
                str2 = t6y0Var.a;
                try {
                    hm5.M(objA);
                    z2 = z5;
                    n6y0Var2 = n6y0Var3;
                } catch (Exception unused6) {
                    z2 = z5;
                    n6y0Var2 = n6y0Var3;
                    uuid3 = uuid5;
                    str3 = str2;
                    uuid4 = uuid6;
                    uuid5 = uuid3;
                    uuid6 = uuid4;
                    str2 = str3;
                    z3 = false;
                    z4 = n6y0Var2.a;
                    t6y0Var.a = null;
                    t6y0Var.b = null;
                    t6y0Var.c = null;
                    t6y0Var.d = null;
                    t6y0Var.e = z2;
                    t6y0Var.h = 2;
                    h6y0Var = (h6y0) this.Z.get(str2);
                    if (h6y0Var == null) {
                        objC = obj2;
                    } else {
                        if (u890.j(h6y0Var.a, uuid5)) {
                            h6y0Var2 = null;
                        } else {
                            h6y0Var2 = null;
                        }
                        if (h6y0Var2 == null) {
                            objC = obj2;
                        } else {
                            v6y0Var = h6y0Var2.b;
                            if (z3) {
                                q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, false, false, 7), z4, null, null, null, 97));
                                if (z2) {
                                    fn31.T(this.Y, this.f, 0, new c3u0(this, z4, (lnm) null, (byte) 21), 2);
                                }
                            } else {
                                q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, h6y0Var2.c, false, 3), false, null, null, null, 109));
                            }
                            objC = c(str2, t6y0Var);
                            if (objC != obj) {
                                objC = obj2;
                            }
                        }
                    }
                    if (objC == obj) {
                        return obj;
                    }
                    return obj2;
                }
                z3 = objA instanceof oy21;
            } catch (Exception unused7) {
                uuid3 = uuid5;
                str3 = str2;
                uuid4 = uuid6;
                uuid5 = uuid3;
                uuid6 = uuid4;
                str2 = str3;
                z3 = false;
            }
            z4 = n6y0Var2.a;
            t6y0Var.a = null;
            t6y0Var.b = null;
            t6y0Var.c = null;
            t6y0Var.d = null;
            t6y0Var.e = z2;
            t6y0Var.h = 2;
            h6y0Var = (h6y0) this.Z.get(str2);
            if (h6y0Var == null) {
                objC = obj2;
            } else {
                if (u890.j(h6y0Var.a, uuid5) || !u890.j(h6y0Var.e, uuid6)) {
                    h6y0Var2 = null;
                } else {
                    h6y0Var2 = h6y0Var;
                }
                if (h6y0Var2 == null) {
                    objC = obj2;
                } else {
                    v6y0Var = h6y0Var2.b;
                    if (z3) {
                        q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, false, false, 7), z4, null, null, null, 97));
                        if (z2) {
                            fn31.T(this.Y, this.f, 0, new c3u0(this, z4, (lnm) null, (byte) 21), 2);
                        }
                    } else {
                        q(str2, h6y0.a(h6y0Var2, v6y0.a(v6y0Var, h6y0Var2.c, false, 3), false, null, null, null, 109));
                    }
                    objC = c(str2, t6y0Var);
                    if (objC != obj) {
                        objC = obj2;
                    }
                }
            }
            if (objC == obj) {
                return obj;
            }
            return obj2;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final void q(String str, h6y0 h6y0Var) {
        this.Z.put(str, h6y0Var);
        o(str).m((Object) null, h6y0Var.b);
    }

    public final void shutdown() {
        smo1.p(this.Y, (CancellationException) null);
    }
}
