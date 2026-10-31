package p;

import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dk31 implements ni31 {
    public final zle1 a;
    public final String b;
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public final t45 f;
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;

    public dk31(zle1 zle1Var, String str, String str2, String str3) {
        t45 m231Var;
        this.a = zle1Var;
        this.b = str2;
        try {
            m231Var = ((s45) zle1Var).a(str);
            t45.m(m231Var, str2, 4);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to start Rive performance measurement", new Object[0]);
        }
        this.f = m231Var instanceof m231 ? null : m231Var;
        this.g = str3 != null ? ek31.b(str3) : null;
    }

    @Override // p.ni31
    public final Object a(String str, si31 si31Var, ri31 ri31Var) {
        return h(i("font_loading", str), si31Var, ri31Var);
    }

    @Override // p.ni31
    public final Object b(String str, ob01 ob01Var, elu0 elu0Var) {
        return h(i("image_loading", str), ob01Var, elu0Var);
    }

    @Override // p.ni31
    public final Object c(ob01 ob01Var, pi31 pi31Var) {
        return h("rive_file_loading", ob01Var, pi31Var);
    }

    public final void d(String str) {
        rih1 m231Var;
        try {
            t45 t45Var = this.f;
            if (t45Var != null) {
                t45Var.g(str);
                m231Var = rih1.a;
            } else {
                m231Var = null;
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.e(thA, "Failed to end Rive performance point", new Object[0]);
        }
    }

    public final boolean e() {
        rih1 m231Var;
        synchronized (this.c) {
            if (!this.i && !this.j) {
                this.i = true;
                try {
                    t45 t45Var = this.f;
                    if (t45Var != null) {
                        t45Var.g(this.b);
                        m231Var = rih1.a;
                    } else {
                        m231Var = null;
                    }
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.e(thA, "Failed to end Rive performance preparation point", new Object[0]);
                }
                return true;
            }
            return false;
        }
    }

    public final boolean f(int i, Map map, Map map2, Collection collection) {
        t45 m231Var;
        String str;
        rih1 m231Var2;
        rih1 rih1Var;
        synchronized (this.c) {
            try {
                if (this.j) {
                    return false;
                }
                this.j = true;
                int i2 = (i == 1 && this.h) ? 2 : i;
                t45 t45Var = this.f;
                String str2 = this.g;
                if (str2 == null) {
                    str2 = "unresolved";
                }
                String str3 = str2;
                Iterator it = this.e.iterator();
                while (it.hasNext()) {
                    d((String) it.next());
                }
                this.e.clear();
                if (!this.i) {
                    this.i = true;
                    if (t45Var != null) {
                        try {
                            t45Var.g(this.b);
                            rih1Var = rih1.a;
                        } catch (Throwable th) {
                            m231Var2 = new m231(th);
                        }
                    } else {
                        rih1Var = null;
                    }
                    m231Var2 = rih1Var;
                    Throwable thA = e331.a(m231Var2);
                    if (thA != null) {
                        Logger.e(thA, "Failed to end Rive performance preparation point", new Object[0]);
                    }
                }
                if (t45Var != null) {
                    try {
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            ak31 ak31Var = (ak31) it2.next();
                            t45.c(t45Var, ak31Var.a, ak31Var.b, ak31Var.c, 24);
                        }
                        for (Map.Entry entry : map.entrySet()) {
                            t45Var.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (i2 == 1) {
                            for (Map.Entry entry2 : map2.entrySet()) {
                                t45Var.b((String) entry2.getKey(), (String) entry2.getValue());
                            }
                        }
                        t45Var.a("rive_file_url", str3);
                        if (i2 == 1) {
                            str = "success";
                        } else if (i2 == 2) {
                            str = "failure";
                        } else {
                            if (i2 != 3) {
                                throw null;
                            }
                            str = "cancelled";
                        }
                        t45Var.a("outcome", str);
                        this.a.b(t45Var.e());
                    } catch (Throwable th2) {
                        m231Var = new m231(th2);
                    }
                } else {
                    t45Var = null;
                }
                m231Var = t45Var;
                Throwable thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    Logger.e(thA2, "Failed to finish Rive performance measurement", new Object[0]);
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #3 {, blocks: (B:49:0x008c, B:51:0x0094), top: B:84:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00af A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {, blocks: (B:65:0x00a7, B:67:0x00af), top: B:80:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object g(String str, iu30 iu30Var, onm onmVar) throws Throwable {
        bk31 bk31Var;
        boolean zBooleanValue;
        t45 t45Var;
        Boolean m231Var;
        String str2;
        boolean z;
        if (onmVar instanceof bk31) {
            bk31Var = (bk31) onmVar;
            int i = bk31Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk31Var.e = i - Integer.MIN_VALUE;
            } else {
                bk31Var = new bk31(this, onmVar);
            }
        } else {
            bk31Var = new bk31(this, onmVar);
        }
        Object objInvoke = bk31Var.c;
        d9n d9nVar = d9n.a;
        int i2 = bk31Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = bk31Var.b;
            str2 = bk31Var.a;
            try {
                hm5.M(objInvoke);
                if (z) {
                    synchronized (this.c) {
                        if (this.e.remove(str2)) {
                            d(str2);
                        }
                    }
                }
                return objInvoke;
            } catch (Throwable th) {
                th = th;
                if (z) {
                    synchronized (this.c) {
                        if (this.e.remove(str2)) {
                            d(str2);
                        }
                    }
                }
                throw th;
            }
        }
        hm5.M(objInvoke);
        synchronized (this.c) {
            try {
                zBooleanValue = false;
                if (!this.j && (t45Var = this.f) != null) {
                    try {
                        t45.m(t45Var, str, 2);
                        this.e.add(str);
                        m231Var = Boolean.TRUE;
                    } catch (Throwable th2) {
                        m231Var = new m231(th2);
                    }
                    Throwable thA = e331.a(m231Var);
                    if (thA != null) {
                        Logger.e(thA, "Failed to start Rive performance point", new Object[0]);
                    }
                    Boolean bool = Boolean.FALSE;
                    if (m231Var instanceof m231) {
                        m231Var = bool;
                    }
                    zBooleanValue = m231Var.booleanValue();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            bk31Var.a = str;
            bk31Var.b = zBooleanValue;
            bk31Var.e = 1;
            objInvoke = iu30Var.invoke(bk31Var);
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
            str2 = str;
            z = zBooleanValue;
            if (z) {
                synchronized (this.c) {
                    if (this.e.remove(str2)) {
                        d(str2);
                    }
                }
            }
            return objInvoke;
        } catch (Throwable th4) {
            th = th4;
            str2 = str;
            z = zBooleanValue;
            if (z) {
                synchronized (this.c) {
                    if (this.e.remove(str2)) {
                        d(str2);
                    }
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(String str, iu30 iu30Var, onm onmVar) throws Exception {
        ck31 ck31Var;
        if (onmVar instanceof ck31) {
            ck31Var = (ck31) onmVar;
            int i = ck31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ck31Var.c = i - Integer.MIN_VALUE;
            } else {
                ck31Var = new ck31(this, onmVar);
            }
        } else {
            ck31Var = new ck31(this, onmVar);
        }
        Object obj = ck31Var.a;
        Object obj2 = d9n.a;
        int i2 = ck31Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ck31Var.c = 1;
                Object objG = g(str, iu30Var, ck31Var);
                return objG == obj2 ? obj2 : objG;
            }
            if (i2 == 1) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            synchronized (this.c) {
                if (!this.j) {
                    this.h = true;
                }
                throw e2;
            }
        }
    }

    public final String i(String str, String str2) {
        String str3;
        synchronized (this.c) {
            try {
                str3 = str + "-" + ek31.a(str2);
                Integer num = (Integer) this.d.get(str3);
                int iIntValue = (num != null ? num.intValue() : 0) + 1;
                this.d.put(str3, Integer.valueOf(iIntValue));
                if (iIntValue != 1) {
                    str3 = str3 + "-" + iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }
}
