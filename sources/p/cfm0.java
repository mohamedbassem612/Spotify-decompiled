package p;

import android.os.Parcel;
import io.reactivex.rxjava3.core.ObservableConverter;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract /* synthetic */ class cfm0 {
    public static final String a(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "integrity_detect";
        }
        if (iC == 1) {
            return "app_event_pred";
        }
        eg.o();
        return null;
    }

    public static final String b(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (iC == 1) {
            return "MTML_APP_EVENT_PRED";
        }
        eg.o();
        return null;
    }

    public static /* synthetic */ boolean c(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean d(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return false;
        }
        if (i == 5) {
            return true;
        }
        throw null;
    }

    public static int f(Parcel parcel, LinkedHashMap linkedHashMap, String str, int i, int i2) {
        linkedHashMap.put(str, parcel.readString());
        return i + i2;
    }

    public static int g(u771 u771Var, int i, int i2) {
        return (u771Var.hashCode() + i) * i2;
    }

    public static ArrayList h(String str, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(str, arrayList);
        return arrayList;
    }

    public static lik1 i(String str, String str2, kik1 kik1Var) {
        return kik1Var.b(str + str2);
    }

    public static /* synthetic */ void j(ObservableConverter observableConverter) {
        throw new ClassCastException();
    }

    public static /* synthetic */ void k(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    public static /* synthetic */ void l(AtomicReference atomicReference, mfn0 mfn0Var) {
        while (!atomicReference.compareAndSet(mfn0Var, null) && atomicReference.get() == mfn0Var) {
        }
    }

    public static /* synthetic */ boolean m(AtomicReference atomicReference, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean p(AtomicReference atomicReference, mfn0 mfn0Var, mfn0 mfn0Var2) {
        while (!atomicReference.compareAndSet(mfn0Var, mfn0Var2)) {
            if (atomicReference.get() != mfn0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "WAITING_FOR_LOCATION_CHANGE";
        }
        if (i == 2) {
            return "WAITING_FOR_COMPLETION";
        }
        throw null;
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "Show";
        }
        if (i == 2) {
            return "Author";
        }
        throw null;
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "FINAL";
        }
        if (i == 2) {
            return "SEALED";
        }
        if (i != 3) {
            return i != 4 ? "null" : "ABSTRACT";
        }
        return "OPEN";
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "FIRST_OR_DEFAULT";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SINGLE";
        }
        return "LAST";
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "FIRST";
        }
        if (i == 2) {
            return "FIRST_OR_DEFAULT";
        }
        if (i == 3) {
            return "LAST";
        }
        if (i != 4) {
            return i != 5 ? "null" : "SINGLE_OR_DEFAULT";
        }
        return "SINGLE";
    }

    public static /* synthetic */ int v(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("WAITING_FOR_LOCATION_CHANGE")) {
            return 1;
        }
        if (str.equals("WAITING_FOR_COMPLETION")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.ubi.navigationlogger.NavigationTransactionState.".concat(str));
        return 0;
    }

    public static /* synthetic */ int w(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("Show")) {
            return 1;
        }
        if (str.equals("Author")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.home.explicitfeedback.contextmenuitems.NotInterestedFollowUp.Kind.".concat(str));
        return 0;
    }
}
