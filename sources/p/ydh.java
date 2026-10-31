package p;

import app.rive.core.CommandQueue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class ydh {
    public static int[] _values() {
        return l1d.H(5);
    }

    public static int a(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 8) {
            return 4;
        }
        if (i != 5) {
            return i != 6 ? 0 : 3;
        }
        return 2;
    }

    public static final boolean b(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static /* synthetic */ int c(int i) {
        switch (i) {
            case 1:
                return 2131962418;
            case 2:
                return 2131962414;
            case 3:
                return 2131962407;
            case 4:
                return 2131962408;
            case 5:
                return 2131962416;
            case 6:
                return 2131962417;
            case 7:
                return 2131962419;
            case 8:
                return 2131962411;
            case 9:
                return 2131957566;
            case 10:
                return 2131962410;
            case 11:
                return 2131962412;
            case 12:
                return 2131962409;
            case 13:
                return 2131962420;
            default:
                throw null;
        }
    }

    public static int d(w4i1 w4i1Var, int i, int i2) {
        return (w4i1Var.hashCode() + i) * i2;
    }

    public static long e(ohd ohdVar, CommandQueue commandQueue) {
        ohdVar.t();
        return CommandQueue.access$getNextRequestID$p(commandQueue).getAndIncrement();
    }

    public static FlowableTake f(Flowable flowable, Flowable flowable2) {
        flowable.getClass();
        return new FlowableTake(flowable2);
    }

    public static String g(float f, int i, x340 x340Var, x340 x340Var2, nim0 nim0Var) {
        op71.g(x340Var, u291.h(nim0Var, f));
        return cwl1.o0(x340Var2, i);
    }

    public static ArrayList h(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        return arrayList;
    }

    public static cwh0 i(float f, float f2, float f3, float f4) {
        cwh0 cwh0Var = new cwh0();
        cwh0Var.l(f, f2);
        cwh0Var.j(f3, f4);
        return cwh0Var;
    }

    public static void j(long j, ConcurrentHashMap concurrentHashMap) {
        concurrentHashMap.remove(new Long(j));
    }

    public static void k(cwh0 cwh0Var, float f, float f2, float f3, float f4) {
        cwh0Var.j(f, f2);
        cwh0Var.j(f3, f4);
        cwh0Var.e();
    }

    public static void l(nim0 nim0Var, float f, b0k b0kVar, x340 x340Var, boolean z) {
        op71.g(b0kVar, u291.h(nim0Var, f));
        x340Var.r(z);
    }

    public static void m(err0 err0Var, int i) {
        err0Var.t(err0Var.s() + i);
    }

    public static /* synthetic */ boolean n(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(csk cskVar, Object obj, csk cskVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = csk.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(cskVar, obj, cskVar2)) {
            if (atomicReferenceFieldUpdater.get(cskVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "OTHER";
            case 2:
                return "NEW";
            case 3:
                return "GOOD";
            case 4:
                return "FAIR";
            case 5:
                return "POOR";
            case 6:
                return "USED";
            case 7:
                return "REFURBISHED";
            case 8:
                return "EXCELLENT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "IMAGE";
        }
        if (i == 2) {
            return "LOOPING_VIDEO";
        }
        if (i == 3) {
            return "ENTITY_COMPONENT";
        }
        if (i != 4) {
            return i != 5 ? "null" : "BODY_NOT_SET";
        }
        return "EXTERNAL_LINK";
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("CONNECTING")) {
            return 1;
        }
        if (str.equals("INCOMPATIBLE")) {
            return 2;
        }
        if (str.equals("UNAVAILABLE")) {
            return 3;
        }
        if (str.equals("LOGGED_IN")) {
            return 4;
        }
        if (str.equals("NOT_LOGGED_IN")) {
            return 5;
        }
        if (str.equals("PREMIUM_REQUIRED")) {
            return 6;
        }
        if (str.equals("NOT_INSTALLED")) {
            return 7;
        }
        if (str.equals("UNSUPPORTED_URI")) {
            return 8;
        }
        if (str.equals("SLEEPING")) {
            return 9;
        }
        if (str.equals("NOT_AUTHORIZED")) {
            return 10;
        }
        if (str.equals("AD_PLAYING")) {
            return 11;
        }
        if (str.equals("NARRATION")) {
            return 12;
        }
        if (str.equals("TIMED_OUT_WAKEUP")) {
            return 13;
        }
        if (str.equals("WAKING_UP")) {
            return 14;
        }
        if (str.equals("NOT_LOADED")) {
            return 15;
        }
        if (str.equals("WOL")) {
            return 16;
        }
        if (str.equals("BUSY")) {
            return 17;
        }
        if (str.equals("INSTALLATION_AVAILABLE")) {
            return 18;
        }
        if (str.equals("INSTALLING")) {
            return 19;
        }
        if (str.equals("MANAGED_ACCOUNT_ON_DISALLOWED_DEVICE")) {
            return 20;
        }
        if (str.equals("UNSUPPORTED_VERSION")) {
            return 21;
        }
        if (str.equals("UNKNOWN")) {
            return 22;
        }
        hhg1.n("No enum constant com.spotify.connect.connectaggregator.ConnectAggregatorEntityDeviceState.".concat(str));
        return 0;
    }
}
