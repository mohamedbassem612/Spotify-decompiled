package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class lf51 {
    public static final int a(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        throw null;
    }

    public static final int b(int i) {
        if (i == 1) {
            return 200;
        }
        if (i == 2) {
            return 201;
        }
        if (i == 3) {
            return 202;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "entity-segment-context";
        }
        if (i == 2) {
            return "entity-segment-creator";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "crossword";
        }
        if (i == 2) {
            return "crossword_overview";
        }
        if (i == 3) {
            return "cross_content";
        }
        if (i == 4) {
            return "track_versions";
        }
        throw null;
    }

    public static int e(int i, int i2, tr80 tr80Var) {
        return (tr80Var.hashCode() + i) * i2;
    }

    public static /* synthetic */ Iterator f() {
        try {
            return Arrays.asList(new lzp0()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static cwh0 g(float f, float f2) {
        cwh0 cwh0Var = new cwh0();
        cwh0Var.l(f, f2);
        return cwh0Var;
    }

    public static /* synthetic */ boolean h(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean i(ou51 ou51Var, Object obj, List list) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ou51Var, obj, list)) {
            if (atomicReferenceFieldUpdater.get(ou51Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(ou51 ou51Var, Object obj, ohd ohdVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ou51Var, obj, ohdVar)) {
            if (atomicReferenceFieldUpdater.get(ou51Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(ou51 ou51Var, List list) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ou51Var, list, qu51.a)) {
            if (atomicReferenceFieldUpdater.get(ou51Var) != list) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean l(ou51 ou51Var, List list, ArrayList arrayList) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ou51Var, list, arrayList)) {
            if (atomicReferenceFieldUpdater.get(ou51Var) != list) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(ou51 ou51Var, mhd mhdVar, mu51 mu51Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ou51.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ou51Var, mhdVar, mu51Var)) {
            if (atomicReferenceFieldUpdater.get(ou51Var) != mhdVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(j261 j261Var, hp51 hp51Var, hp51 hp51Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j261.c;
        while (!atomicReferenceFieldUpdater.compareAndSet(j261Var, hp51Var, hp51Var2)) {
            if (atomicReferenceFieldUpdater.get(j261Var) != hp51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ Iterator o() {
        try {
            return Arrays.asList(new xr40()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "FATAL";
        }
        if (i == 2) {
            return "RECOVERABLE";
        }
        throw null;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "VISIBLE";
        }
        if (i == 2) {
            return "SELECTED";
        }
        if (i == 3) {
            return "HIDDEN";
        }
        throw null;
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("VISIBLE")) {
            return 1;
        }
        if (str.equals("SELECTED")) {
            return 2;
        }
        if (str.equals("HIDDEN")) {
            return 3;
        }
        hhg1.n("No enum constant com.spotify.share.models.ShareFormatState.".concat(str));
        return 0;
    }
}
