package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pb00 {
    public final Object a;
    public final Object b;
    public final Object c;
    public volatile Object d;

    public pb00(t2j0 t2j0Var, yqg yqgVar, zwz0 zwz0Var, llm llmVar, vi11 vi11Var) {
        this.a = t2j0Var;
        this.b = vi11Var;
        this.c = new zhq0(yqgVar);
        l4p1.u(llmVar, new lt20(new fu20(zwz0Var.d(), new nnu(this, (lnm) null, (byte) 27), (byte) 1), new ob00(3, (lnm) null, (byte) 0), (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x0235  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0, types: [p.l24] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.p811] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [p.p811] */
    /* JADX WARN: Type inference failed for: r4v15, types: [p.p811] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public Object a(qkg qkgVar, boolean z, String str, l24 l24Var, onm onmVar) {
        rlb0 rlb0Var;
        qkg qkgVar2;
        t45 t45Var;
        fq60 m231Var;
        UUID id;
        t45 t45Var2;
        UUID uuid;
        fq60 fq60Var;
        wo60 wo60Var;
        int i;
        if (onmVar instanceof rlb0) {
            rlb0Var = (rlb0) onmVar;
            int i2 = rlb0Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rlb0Var.g = i2 - Integer.MIN_VALUE;
            } else {
                rlb0Var = new rlb0(this, onmVar);
            }
        } else {
            rlb0Var = new rlb0(this, onmVar);
        }
        Object objInvoke = rlb0Var.e;
        d9n d9nVar = d9n.a;
        ?? r4 = rlb0Var.g;
        try {
            if (r4 == 0) {
                hm5.M(objInvoke);
                try {
                    t45 t45VarA = ((zle1) this.a).a("load_home_layout");
                    qkgVar2 = qkgVar;
                    try {
                        t45VarA.a("feed", qkgVar2.b);
                        t45VarA.a("is_refresh", String.valueOf(z));
                        t45.m(t45VarA, "load_layout", 4);
                        t45Var = t45VarA;
                    } catch (Exception unused) {
                        t45Var = null;
                    }
                } catch (Exception unused2) {
                    qkgVar2 = qkgVar;
                }
                try {
                    m231Var = ((tp60) this.b).d(kq60.S0);
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                fq60 fq60Var2 = m231Var;
                p811 p811Var = new p811();
                String str2 = z ? "user_initiated" : "system_initiated";
                wo60 wo60Var2 = (wo60) this.c;
                String str3 = str == null ? "unknown" : str;
                String lowerCase = qkgVar2.name().toLowerCase(Locale.ROOT);
                synchronized (wo60Var2) {
                    uo60 uo60Var = wo60Var2.c;
                    if (uo60Var != null) {
                        wo60Var2.e(uo60Var.a, 2, 2);
                    }
                    wo60Var2.c(2, true);
                    hhp0 hhp0Var = hhp0.a;
                    kj41 kj41VarU = hhp0Var.u("page.home.load_slots");
                    id = kj41VarU.getId();
                    kj41VarU.c(sqg0.J(new mmr0[]{new mmr0("load_id", id.toString()), new mmr0("start_session_id", str3), new mmr0("page_identifier", wo60Var2.b), new mmr0("feed", lowerCase), new mmr0("part_of_cold_startup", String.valueOf(!(wo60Var2.a.l != null))), new mmr0("skip_cache", String.valueOf(z)), new mmr0("reload_kind", str2), new mmr0("loading_mode", "slot_based")}));
                    nif1 nif1VarL = ihp0.l(hhp0Var, "page.home.load_slots", id, 4);
                    nif1VarL.setAttribute("load_id", id.toString());
                    nif1VarL.setAttribute("start_session_id", str3);
                    nif1 nif1VarL2 = ihp0.l(hhp0Var, "page.home.load_layout", id, 4);
                    nif1VarL2.setAttribute("load_id", id.toString());
                    wo60Var2.c = new uo60(id, str3, kj41VarU, nif1VarL, nif1VarL2, nif1VarL2.c((Long) null, "request"));
                }
                this.d = new qlb0(id, null);
                try {
                    rlb0Var.a = t45Var;
                    rlb0Var.b = fq60Var2;
                    rlb0Var.c = p811Var;
                    rlb0Var.d = id;
                    rlb0Var.g = 1;
                    objInvoke = l24Var.invoke(rlb0Var);
                    if (objInvoke == d9nVar) {
                        return d9nVar;
                    }
                    t45Var2 = t45Var;
                    uuid = id;
                    fq60Var = fq60Var2;
                    r4 = p811Var;
                } catch (CancellationException e) {
                    e = e;
                    t45Var2 = t45Var;
                    uuid = id;
                    fq60Var = fq60Var2;
                    r4 = p811Var;
                    wo60Var = (wo60) this.c;
                    synchronized (wo60Var) {
                        wo60Var.e(uuid, 2, 4);
                    }
                    b(t45Var2, "cancelled", null);
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    t45Var2 = t45Var;
                    uuid = id;
                    ((wo60) this.c).g(uuid);
                    b(t45Var2, "failed", null);
                    throw th;
                }
            } else {
                if (r4 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uuid = rlb0Var.d;
                r4 = rlb0Var.c;
                fq60Var = rlb0Var.b;
                t45Var2 = rlb0Var.a;
                try {
                    hm5.M(objInvoke);
                    r4 = r4;
                } catch (CancellationException e2) {
                    e = e2;
                    wo60Var = (wo60) this.c;
                    synchronized (wo60Var) {
                        wo60Var.e(uuid, 2, 4);
                        b(t45Var2, "cancelled", null);
                        throw e;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ((wo60) this.c).g(uuid);
                    b(t45Var2, "failed", null);
                    throw th;
                }
            }
            pe91 pe91Var = (pe91) objInvoke;
            int iOrdinal = pe91Var.b.ordinal();
            if (iOrdinal != 0) {
                i = iOrdinal != 1 ? 0 : 1;
            } else {
                i = 2;
            }
            ((p811) r4).a = i != 0 ? new xp60(i) : null;
            wo60 wo60Var3 = (wo60) this.c;
            ArrayList arrayList = pe91Var.a;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ef91) it.next()).name().toLowerCase(Locale.ROOT));
            }
            String strName = pe91Var.b.name();
            Locale locale = Locale.ROOT;
            this.d = new qlb0(uuid, wo60Var3.h(uuid, arrayList2, strName.toLowerCase(locale)));
            b(t45Var2, "succeeded", pe91Var.b.name().toLowerCase(locale));
            try {
                ((tp60) this.b).b(fq60Var, (cq60) ((p811) r4).a);
            } catch (Throwable unused3) {
            }
            return pe91Var;
        } catch (Throwable th4) {
            try {
                ((tp60) this.b).b(fq60Var, (cq60) ((p811) r4).a);
            } catch (Throwable unused4) {
            }
            throw th4;
        }
    }

    public void b(t45 t45Var, String str, String str2) {
        if (t45Var == null) {
            return;
        }
        try {
            t45Var.g("load_layout");
            t45Var.a("outcome", str);
            if (str2 != null) {
                t45Var.a("load_source", str2);
            }
            ((zle1) this.a).b(t45Var.e());
        } catch (Exception unused) {
        }
    }

    public pb00(zle1 zle1Var, tp60 tp60Var, wo60 wo60Var) {
        this.a = zle1Var;
        this.b = tp60Var;
        this.c = wo60Var;
    }
}
