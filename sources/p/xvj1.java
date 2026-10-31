package p;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract /* synthetic */ class xvj1 {
    public static int[] _values() {
        return l1d.H(21);
    }

    public static int a(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final String b(int i) {
        return g(i);
    }

    public static final String c(int i) {
        String str;
        if (i == 1) {
            str = "STARTUP";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "REQUESTED";
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static /* synthetic */ short d(int i) {
        switch (i) {
            case 1:
                return (short) 0;
            case 2:
                return (short) 480;
            case 3:
                return (short) 576;
            case 4:
                return (short) 720;
            case 5:
                return (short) 1080;
            case 6:
                return (short) 2160;
            default:
                throw null;
        }
    }

    public static /* synthetic */ byte e(int i) {
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        if (i == 5) {
            return (byte) 4;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "screenshot-detection";
        }
        if (i == 2) {
            return "share-button";
        }
        throw null;
    }

    public static /* synthetic */ String g(int i) {
        if (i == 1) {
            return "com.whatsapp";
        }
        if (i == 2) {
            return "com.whatsapp.w4b";
        }
        throw null;
    }

    public static /* synthetic */ short h(int i) {
        switch (i) {
            case 1:
                return (short) 0;
            case 2:
            case 3:
                return (short) 720;
            case 4:
                return (short) 1280;
            case 5:
                return (short) 1920;
            case 6:
                return (short) 3840;
            default:
                throw null;
        }
    }

    public static int i(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) + i4;
    }

    public static int j(s4b1 s4b1Var, int i, int i2) {
        return (s4b1Var.hashCode() + i) * i2;
    }

    public static String k(String str, pkd1 pkd1Var, String str2, pkd1 pkd1Var2) {
        return str + pkd1Var + str2 + pkd1Var2;
    }

    public static UnsupportedOperationException l(Parcel parcel) {
        zsn1.d(parcel);
        return new UnsupportedOperationException();
    }

    public static ArrayList m() {
        new ArrayList();
        return new ArrayList();
    }

    public static HashMap n(Class cls, ken1 ken1Var) {
        HashMap map = new HashMap();
        map.put(cls, ken1Var);
        return map;
    }

    public static Iterator o(ArrayList arrayList, Parcel parcel) {
        parcel.writeInt(arrayList.size());
        return arrayList.iterator();
    }

    public static LinkedHashSet p(LinkedHashMap linkedHashMap, String str, mkd1 mkd1Var) {
        linkedHashMap.put(str, mkd1Var);
        return new LinkedHashSet();
    }

    public static void q(ge30 ge30Var, gtf1 gtf1Var) {
        gtf1Var.a(new ie30(ge30Var));
    }

    public static /* synthetic */ boolean r(Object obj, zrd1 zrd1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nwl1.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, zrd1Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != zrd1Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean s(AtomicReference atomicReference, n9n1 n9n1Var) {
        while (!atomicReference.compareAndSet(null, n9n1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean t(AtomicReference atomicReference, xrn1 xrn1Var) {
        while (!atomicReference.compareAndSet(null, xrn1Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean u(AtomicReferenceArray atomicReferenceArray, int i, zrd1 zrd1Var) {
        while (!atomicReferenceArray.compareAndSet(i, zrd1Var, null)) {
            if (atomicReferenceArray.get(i) != zrd1Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(Object obj, zrd1 zrd1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = nwl1.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, zrd1Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != zrd1Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "SUCCESS";
        }
        if (i == 2) {
            return "FAIL";
        }
        if (i == 3) {
            return "ABORTED";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "RUNNING";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "End";
        }
        return "Start";
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("URL")) {
            return 1;
        }
        if (str.equals("MANIFEST_ID")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.extendedmetadata.extensions.watchfeedentityexplorer.WatchFeedEntityExplorer.VideoFileType.".concat(str));
        return 0;
    }
}
