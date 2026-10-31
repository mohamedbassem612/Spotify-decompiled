package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hj91 implements ki91 {
    public final pp91 a;
    public final ynb0 b;
    public final ynb0 c;
    public final Scheduler d;
    public final Scheduler e;
    public final AtomicInteger f = new AtomicInteger(0);
    public final Object g = new Object();
    public final qzq h = new qzq();

    public hj91(pp91 pp91Var, ynb0 ynb0Var, ynb0 ynb0Var2, Scheduler scheduler, Scheduler scheduler2) {
        this.a = pp91Var;
        this.b = ynb0Var;
        this.c = ynb0Var2;
        this.d = scheduler;
        this.e = scheduler2;
    }

    public static rp91 f(if81 if81Var) {
        int iOrdinal = if81Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return rp91.b;
            }
            if (iOrdinal == 2) {
                return rp91.c;
            }
            if (iOrdinal != 3) {
                eg.o();
                return null;
            }
        }
        return rp91.a;
    }

    public final Completable b(String str, ui91 ui91Var) {
        cj91 cj91VarC = c(str);
        return cj91VarC.a().takeUntil((Predicate) new ua91(new AtomicBoolean(true), cj91VarC, ui91Var, new l811(), (byte) 3)).ignoreElements();
    }

    public final cj91 c(String str) {
        cj91 cj91Var;
        synchronized (this.g) {
            try {
                qzq qzqVar = this.h;
                Object obj = qzqVar.get(str);
                if (obj == null) {
                    r961 r961Var = new r961();
                    cj91 cj91Var2 = new cj91(r961Var, Observable.defer(new gj91(new AtomicReference(new ij91(str, new ody0())), this, str, r961Var)).serialize().replay(1).f());
                    qzqVar.put(str, cj91Var2);
                    obj = cj91Var2;
                }
                cj91Var = (cj91) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cj91Var;
    }

    public final Observable d(String str) {
        if (str.length() != 0) {
            Observable observableDistinctUntilChanged = c(str).a().filter(wdx0.Z).map(new nfb(this, (byte) 25)).distinctUntilChanged();
            observableDistinctUntilChanged.getClass();
            return observableDistinctUntilChanged;
        }
        Logger.k("Observing shuffle state for empty context uri!", new Object[0]);
        Observable observableEmpty = Observable.empty();
        observableEmpty.getClass();
        return observableEmpty;
    }

    public final Completable e(String str, rp91 rp91Var, tv80 tv80Var) {
        if81 if81Var;
        int andIncrement = this.f.getAndIncrement();
        int iOrdinal = rp91Var.ordinal();
        if (iOrdinal == 0) {
            if81Var = if81.a;
        } else if (iOrdinal == 1) {
            if81Var = if81.b;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            if81Var = if81.c;
        }
        return b(str, new si91(andIncrement, if81Var, tv80Var));
    }

    public final Completable g(String str, tv80 tv80Var) {
        return b(str, new ti91(this.f.getAndIncrement(), tv80Var));
    }
}
