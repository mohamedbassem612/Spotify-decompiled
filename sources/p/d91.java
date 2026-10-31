package p;

import com.spotify.base.java.logging.Logger;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d91 {
    public final zgz0 a;
    public final qd51 b;
    public final qd51 c;
    public final va40 d;
    public final lzn0 e;
    public final yu3 f;
    public final ix7 g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public d91(zgz0 zgz0Var, qd51 qd51Var, qd51 qd51Var2, va40 va40Var, lzn0 lzn0Var, owo owoVar, qwo qwoVar, h7l0 h7l0Var, g5l0 g5l0Var) {
        this.a = zgz0Var;
        this.b = qd51Var;
        this.c = qd51Var2;
        this.d = va40Var;
        this.e = lzn0Var;
        this.f = owoVar.a(g5l0Var);
        this.g = qwoVar.a(h7l0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, String str2, flr0 flr0Var, onm onmVar) {
        v81 v81Var;
        if (onmVar instanceof v81) {
            v81Var = (v81) onmVar;
            int i = v81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v81Var.c = i - Integer.MIN_VALUE;
            } else {
                v81Var = new v81(this, onmVar);
            }
        } else {
            v81Var = new v81(this, onmVar);
        }
        v81 v81Var2 = v81Var;
        Object objE = v81Var2.a;
        int i2 = v81Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                zgz0 zgz0Var = this.a;
                v81Var2.c = 1;
                objE = ((va40) zgz0Var.b).e(str, str2, new Integer(flr0Var.a), (String) null, v81Var2);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            e951 e951Var = (e951) objE;
            op71.x(v81Var2.getContext());
            return new ta1(e951Var.c, e951Var.a, e951Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            op71.x(v81Var2.getContext());
            String message = e2.getMessage();
            if (message == null) {
                message = "Search failed";
            }
            return new ka1(message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, String str2, flr0 flr0Var, onm onmVar) {
        w81 w81Var;
        m231 m231Var;
        if (onmVar instanceof w81) {
            w81Var = (w81) onmVar;
            int i = w81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                w81Var.c = i - Integer.MIN_VALUE;
            } else {
                w81Var = new w81(this, onmVar);
            }
        } else {
            w81Var = new w81(this, onmVar);
        }
        w81 w81Var2 = w81Var;
        Object objF = w81Var2.a;
        int i2 = w81Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                qd51 qd51Var = this.b;
                w81Var2.c = 1;
                objF = qd51Var.a.f(str, str2, new Integer(flr0Var.a), (String) null, w81Var2);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            cwz0 cwz0Var = (cwz0) objF;
            op71.x(w81Var2.getContext());
            m231Var = new va1(cwz0Var.c, cwz0Var.a, cwz0Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            op71.x(w81Var2.getContext());
            String message = thA.getMessage();
            if (message == null) {
                message = "Search failed";
            }
            m231Var = new ka1(message);
        }
        return m231Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(String str, String str2, String str3, flr0 flr0Var, onm onmVar) {
        x81 x81Var;
        if (onmVar instanceof x81) {
            x81Var = (x81) onmVar;
            int i = x81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x81Var.c = i - Integer.MIN_VALUE;
            } else {
                x81Var = new x81(this, onmVar);
            }
        } else {
            x81Var = new x81(this, onmVar);
        }
        x81 x81Var2 = x81Var;
        Object objE = x81Var2.a;
        int i2 = x81Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objE);
                zgz0 zgz0Var = this.a;
                x81Var2.c = 1;
                objE = ((va40) zgz0Var.b).e(str, str2, new Integer(flr0Var.a), str3, x81Var2);
                d9n d9nVar = d9n.a;
                if (objE == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objE);
            }
            e951 e951Var = (e951) objE;
            op71.x(x81Var2.getContext());
            return new da1(e951Var.a, e951Var.c);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            op71.x(x81Var2.getContext());
            return ca1.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(String str, String str2, String str3, flr0 flr0Var, onm onmVar) {
        y81 y81Var;
        pa1 m231Var;
        if (onmVar instanceof y81) {
            y81Var = (y81) onmVar;
            int i = y81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y81Var.c = i - Integer.MIN_VALUE;
            } else {
                y81Var = new y81(this, onmVar);
            }
        } else {
            y81Var = new y81(this, onmVar);
        }
        y81 y81Var2 = y81Var;
        Object objF = y81Var2.a;
        int i2 = y81Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                qd51 qd51Var = this.b;
                y81Var2.c = 1;
                objF = qd51Var.a.f(str, str2, new Integer(flr0Var.a), str3, y81Var2);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            cwz0 cwz0Var = (cwz0) objF;
            op71.x(y81Var2.getContext());
            m231Var = new pa1(cwz0Var.a, cwz0Var.c);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) == null) {
            return m231Var;
        }
        op71.x(y81Var2.getContext());
        return ca1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, g4a g4aVar, g4a g4aVar2, boolean z, onm onmVar) {
        c91 c91Var;
        Throwable th;
        ia1 m231Var;
        String str3;
        if (onmVar instanceof c91) {
            c91Var = (c91) onmVar;
            int i = c91Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c91Var.g = i - Integer.MIN_VALUE;
            } else {
                c91Var = new c91(this, onmVar);
            }
        } else {
            c91Var = new c91(this, onmVar);
        }
        Object objH = c91Var.e;
        int i2 = c91Var.g;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(objH);
                    va40 va40Var = this.d;
                    c91Var.a = str2;
                    c91Var.b = g4aVar;
                    c91Var.c = g4aVar2;
                    c91Var.d = z;
                    c91Var.g = 1;
                    objH = va40Var.h(str2, str, g4aVar, c91Var);
                    Object obj = d9n.a;
                    if (objH == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = c91Var.d;
                    g4aVar2 = c91Var.c;
                    g4aVar = c91Var.b;
                    str2 = c91Var.a;
                    hm5.M(objH);
                }
                str3 = str2;
                try {
                    m231Var = new ia1(str3, (List) objH, g4aVar, g4aVar2, z);
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str3;
                    m231Var = new m231(th);
                    str3 = str2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            Throwable thA = e331.a(m231Var);
            if (thA == null) {
                return m231Var;
            }
            Logger.e(thA, "Error updating ban status for entity: %s", new Object[]{str3});
            return new ga1(str3);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
