package p;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qy2 extends v6.i {
    public static final aym e;
    public static final bub0 f = new bub0(qy2.class);
    private volatile int remaining;
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        aym py2Var;
        try {
            py2Var = new oy2(AtomicReferenceFieldUpdater.newUpdater(qy2.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(qy2.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            py2Var = new py2();
        }
        e = py2Var;
        if (th != null) {
            f.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public qy2(int i) {
        this.remaining = i;
    }

    public static /* synthetic */ int A(rch rchVar) {
        int i = ((qy2) rchVar).remaining - 1;
        ((qy2) rchVar).remaining = i;
        return i;
    }

    public final void B() {
        this.seenExceptions = null;
    }

    public final Set C() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        rch rchVar = (rch) this;
        setNewSetFromMap.getClass();
        if (!rchVar.isCancelled()) {
            Throwable thA = rchVar.a();
            Objects.requireNonNull(thA);
            while (thA != null && setNewSetFromMap.add(thA)) {
                thA = thA.getCause();
            }
        }
        e.o(rchVar, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }
}
