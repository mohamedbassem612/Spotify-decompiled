package p;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class en31 {
    public llm a;
    public o8n b;
    public Executor c;
    public q7g1 d;
    public vgr e;
    public ec90 f;
    public boolean h;
    public final cce g = new cce(new y52(0, this, en31.class, "onClosed", "onClosed()V", 0, (byte) 21));
    public final ThreadLocal i = new ThreadLocal();
    public final LinkedHashMap j = new LinkedHashMap();
    public boolean k = true;

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            eg.m("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!m() || n()) {
            return;
        }
        o8n o8nVar = (o8n) this.i.get();
        if ((o8nVar != null ? (p7g1) o8nVar.A(p7g1.b) : null) == null) {
            return;
        }
        eg.m("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void c() {
        a();
        a();
        sk30 sk30VarG0 = i().G0();
        if (!sk30VarG0.V0()) {
            yah0.x(new dc90(h(), (lnm) null, (byte) 1));
        }
        if (sk30VarG0.a.isWriteAheadLoggingEnabled()) {
            sk30VarG0.c();
        } else {
            sk30VarG0.a();
        }
    }

    public abstract void d();

    public List e(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((tka0) entry.getKey()).n(), entry.getValue());
        }
        return z6x.a;
    }

    public abstract ec90 f();

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.jgo0 */
    public dyb0 g() throws jgo0 {
        throw new jgo0();
    }

    public final ec90 h() {
        ec90 ec90Var = this.f;
        if (ec90Var != null) {
            return ec90Var;
        }
        u890.C("internalTracker");
        throw null;
    }

    public final h1d1 i() {
        vgr vgrVar = this.e;
        if (vgrVar == null) {
            u890.C("connectionManager");
            throw null;
        }
        h1d1 h1d1VarR = vgrVar.r();
        if (h1d1VarR != null) {
            return h1d1VarR;
        }
        eg.m("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final o8n j() {
        llm llmVar = this.a;
        if (llmVar != null) {
            return llmVar.a;
        }
        u890.C("coroutineScope");
        throw null;
    }

    public Set k() {
        return o7h.p1(new ArrayList(q7h.U(w7x.a, 10)));
    }

    public LinkedHashMap l() {
        int iS = zno1.s(q7h.U(w7x.a, 10));
        if (iS < 16) {
            iS = 16;
        }
        return new LinkedHashMap(iS);
    }

    public final boolean m() {
        vgr vgrVar = this.e;
        if (vgrVar != null) {
            return vgrVar.r() != null;
        }
        u890.C("connectionManager");
        throw null;
    }

    public final boolean n() {
        return q() && i().G0().V0();
    }

    public final void o() {
        i().G0().e();
        if (n()) {
            return;
        }
        ec90 ec90VarH = h();
        ec90VarH.b.c(ec90VarH.e, ec90VarH.f);
    }

    public final void p(y341 y341Var) {
        ec90 ec90VarH = h();
        bvg1 bvg1Var = ec90VarH.b;
        bvg1Var.getClass();
        d441 d441VarG1 = y341Var.g1("PRAGMA query_only");
        try {
            d441VarG1.f1();
            boolean z = d441VarG1.getBoolean();
            o0c.v(d441VarG1, (Throwable) null);
            if (!z) {
                qxy0.s(y341Var, "PRAGMA temp_store = MEMORY");
                qxy0.s(y341Var, "PRAGMA recursive_triggers = 1");
                qxy0.s(y341Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (bvg1Var.d) {
                    qxy0.s(y341Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    qxy0.s(y341Var, nhc1.W("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                pjp0 pjp0Var = bvg1Var.h;
                ReentrantLock reentrantLock = pjp0Var.a;
                reentrantLock.lock();
                try {
                    pjp0Var.d = true;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            synchronized (ec90VarH.h) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                o0c.v(d441VarG1, th2);
                throw th3;
            }
        }
    }

    public final boolean q() {
        vgr vgrVar = this.e;
        if (vgrVar != null) {
            return vgrVar.w();
        }
        u890.C("connectionManager");
        throw null;
    }

    public final Object r(Function0 function0) {
        if (!m()) {
            return qyo1.x(this, false, true, new z94(function0, (byte) 3));
        }
        c();
        try {
            Object objInvoke = function0.invoke();
            s();
            return objInvoke;
        } finally {
            o();
        }
    }

    public final void s() {
        i().G0().h();
    }

    public final Object t(boolean z, vu30 vu30Var, onm onmVar) {
        vgr vgrVar = this.e;
        if (vgrVar != null) {
            return vgrVar.E(z, vu30Var, onmVar);
        }
        u890.C("connectionManager");
        throw null;
    }
}
