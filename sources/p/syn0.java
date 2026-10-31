package p;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class syn0 {
    public final c9n a;
    public final boolean b;
    public ryn0 c;
    public final bbc d;
    public boolean e;
    public final dt71 f;
    public final ve01 g;

    public syn0(c9n c9nVar, b4n0 b4n0Var) {
        boolean zD = b4n0Var.d();
        this.a = c9nVar;
        this.b = zD;
        this.c = new oyn0(b7x.a);
        this.d = mno1.a(Integer.MAX_VALUE, 0, 6);
        dt71 dt71VarE = mgo1.e(1, 0, 0, 6);
        this.f = dt71VarE;
        this.g = d5p1.g(dt71VarE);
    }

    public static void d() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || u890.j(Looper.myLooper(), mainLooper)) {
            return;
        }
        eg.m("NavigationTransactionCoordinator must be called on the main thread");
    }

    public final son0 a(bzn0 bzn0Var) {
        d();
        return !this.b ? new son0(UUID.randomUUID()) : b(bzn0Var, false);
    }

    public final son0 b(bzn0 bzn0Var, boolean z) {
        pyn0 pyn0Var;
        UUID uuidRandomUUID = UUID.randomUUID();
        son0 son0Var = new son0(uuidRandomUUID);
        xab1 xab1VarT = fn31.T(this.a, (o8n) null, 2, new m3n0((Object) this, (Object) son0Var, (lnm) null, (byte) 12), 1);
        nyn0 nyn0Var = new nyn0(son0Var, false, z, xab1VarT);
        ryn0 ryn0Var = this.c;
        if (ryn0Var instanceof oyn0) {
            pyn0Var = new pyn0(uuidRandomUUID, bzn0Var, Collections.singletonList(nyn0Var), ((oyn0) ryn0Var).a);
        } else if (ryn0Var instanceof pyn0) {
            pyn0 pyn0Var2 = (pyn0) ryn0Var;
            pyn0Var = pyn0.a(pyn0Var2, o7h.O0(nyn0Var, pyn0Var2.c), null, 11);
        } else {
            if (!(ryn0Var instanceof qyn0)) {
                eg.o();
                return null;
            }
            pyn0Var = new pyn0(uuidRandomUUID, bzn0Var, Collections.singletonList(nyn0Var), ((qyn0) ryn0Var).c);
        }
        this.c = pyn0Var;
        if (ryn0Var instanceof qyn0) {
            i((qyn0) ryn0Var);
        }
        xab1VarT.start();
        return son0Var;
    }

    public final son0 c(wyn0 wyn0Var) {
        d();
        return !this.b ? new son0(UUID.randomUUID()) : b(wyn0Var, true);
    }

    public final void e(son0 son0Var) {
        Object next;
        UUID uuid = son0Var.a;
        d();
        if (this.b) {
            ryn0 ryn0Var = this.c;
            pyn0 pyn0Var = ryn0Var instanceof pyn0 ? (pyn0) ryn0Var : null;
            if (pyn0Var == null) {
                return;
            }
            List<nyn0> list = pyn0Var.c;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((nyn0) next).a.a.equals(uuid));
            nyn0 nyn0Var = (nyn0) next;
            if (nyn0Var == null) {
                return;
            }
            nyn0Var.d.d((CancellationException) null);
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (nyn0 nyn0Var2 : list) {
                if (nyn0Var2.a.a.equals(uuid)) {
                    nyn0Var2 = new nyn0(nyn0Var2.a, true, false, nyn0Var2.d);
                }
                arrayList.add(nyn0Var2);
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!((nyn0) it2.next()).b) {
                        this.c = pyn0.a(pyn0Var, arrayList, null, 11);
                        return;
                    }
                }
            }
            UUID uuid2 = pyn0Var.a;
            bzn0 bzn0Var = pyn0Var.b;
            Map map = pyn0Var.d;
            xab1 xab1VarJ = j(uuid2, 100L);
            xab1 xab1VarJ2 = j(uuid2, 2000L);
            this.c = new qyn0(uuid2, bzn0Var, map, xab1VarJ, xab1VarJ2);
            xab1VarJ.start();
            xab1VarJ2.start();
        }
    }

    public final ve01 f() {
        return this.g;
    }

    public final void g(son0 son0Var) {
        d();
        if (this.b) {
            ryn0 ryn0Var = this.c;
            Object obj = null;
            pyn0 pyn0Var = ryn0Var instanceof pyn0 ? (pyn0) ryn0Var : null;
            if (pyn0Var != null) {
                for (Object obj2 : pyn0Var.c) {
                    nyn0 nyn0Var = (nyn0) obj2;
                    if (nyn0Var.a.a.equals(son0Var.a) && nyn0Var.c && !nyn0Var.b) {
                        obj = obj2;
                        break;
                    }
                }
                nyn0 nyn0Var2 = (nyn0) obj;
                if (nyn0Var2 == null) {
                    return;
                }
                e(nyn0Var2.a);
            }
        }
    }

    public final void h(Map map) {
        d();
        if (this.b) {
            ryn0 ryn0Var = this.c;
            if (ryn0Var instanceof oyn0) {
                UUID uuidRandomUUID = UUID.randomUUID();
                xab1 xab1VarJ = j(uuidRandomUUID, 100L);
                xab1 xab1VarJ2 = j(uuidRandomUUID, 2000L);
                this.c = new qyn0(uuidRandomUUID, vyn0.a, map, xab1VarJ, xab1VarJ2);
                xab1VarJ.start();
                xab1VarJ2.start();
                return;
            }
            if (ryn0Var instanceof pyn0) {
                this.c = pyn0.a((pyn0) ryn0Var, null, map, 7);
                return;
            }
            if (!(ryn0Var instanceof qyn0)) {
                eg.o();
                return;
            }
            qyn0 qyn0Var = (qyn0) ryn0Var;
            qyn0Var.d.d((CancellationException) null);
            UUID uuid = qyn0Var.a;
            xab1 xab1VarJ3 = j(uuid, 100L);
            this.c = new qyn0(uuid, qyn0Var.b, map, xab1VarJ3, qyn0Var.e);
            xab1VarJ3.start();
        }
    }

    public final void i(qyn0 qyn0Var) {
        lnm lnmVar = null;
        qyn0Var.d.d((CancellationException) null);
        qyn0Var.e.d((CancellationException) null);
        if (this.d.l(new lyn0(qyn0Var.a, qyn0Var.b, qyn0Var.c)) instanceof pge) {
            eg.m("Check failed.");
        } else {
            if (this.e) {
                return;
            }
            this.e = true;
            fn31.T(this.a, (o8n) null, 4, new ian0(this, lnmVar, (byte) 1), 1);
        }
    }

    public final xab1 j(UUID uuid, long j) {
        return fn31.T(this.a, (o8n) null, 2, new i890(j, this, uuid, null), 1);
    }
}
