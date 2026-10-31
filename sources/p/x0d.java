package p;

import android.os.Parcel;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class x0d implements nzc {
    public static /* synthetic */ int A(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("URL")) {
            return 1;
        }
        if (str.equals("SAVE_ENTITY")) {
            return 2;
        }
        if (str.equals("SETTINGS")) {
            return 3;
        }
        if (str.equals("START_PLAYBACK")) {
            return 4;
        }
        if (str.equals("ADD_TO_QUEUE")) {
            return 5;
        }
        if (str.equals("ADD_TO_PLAYLIST")) {
            return 6;
        }
        if (str.equals("DOWNLOAD_ENTITY")) {
            return 7;
        }
        if (str.equals("ADD_TO_YOUR_EPISODES")) {
            return 8;
        }
        hhg1.n("No enum constant com.spotify.notifications.pushnotificationsv2.pushnotificationapi.api.models.ActionType.".concat(str));
        return 0;
    }

    public static int[] _values() {
        return l1d.H(3);
    }

    public static int a(int i) {
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int b(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            return i != 4 ? 0 : 3;
        }
        return 2;
    }

    public static final String c(int i) {
        if (i == 1) {
            return "1";
        }
        if (i == 2) {
            return "0";
        }
        throw null;
    }

    public static int d(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("Unknown")) {
            return 1;
        }
        if (str.equals("Male")) {
            return 2;
        }
        if (str.equals("Female")) {
            return 3;
        }
        if (str.equals("NonBinary")) {
            return 4;
        }
        if (str.equals("Other")) {
            return 5;
        }
        if (str.equals("PreferNotToSay")) {
            return 6;
        }
        hhg1.n("No enum constant com.spotify.login.loginflow.navigation.AccountDetailsV2.Gender.".concat(str));
        return 0;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "restricted";
        }
        if (i == 2) {
            return "unrestricted";
        }
        if (i == 3) {
            return "loggedOut";
        }
        throw null;
    }

    public static int f(int i, int i2, float f) {
        return (Float.hashCode(f) + i) * i2;
    }

    public static int g(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static int h(Class cls, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
        return i + i2;
    }

    public static int i(op80 op80Var, int i, int i2) {
        return (op80Var.hashCode() + i) * i2;
    }

    public static ObservableFromPublisher j(Flowable flowable, Flowable flowable2) {
        flowable.getClass();
        return new ObservableFromPublisher(flowable2);
    }

    public static String k(x340 x340Var, int i, int i2, x340 x340Var2, boolean z) {
        x340Var.i0(i);
        String strO0 = cwl1.o0(x340Var2, i2);
        x340Var.r(z);
        return strO0;
    }

    public static Iterator l(c380 c380Var, Parcel parcel) {
        parcel.writeInt(c380Var.size());
        return c380Var.iterator();
    }

    public static xhl m(x340 x340Var) {
        xhl xhlVar = new xhl();
        x340Var.s0(xhlVar);
        return xhlVar;
    }

    public static nil n(xhl xhlVar, x340 x340Var) {
        nil nilVar = new nil(xhlVar);
        x340Var.s0(nilVar);
        return nilVar;
    }

    public static ufh0 o(wat watVar, x340 x340Var) {
        ufh0 ufh0Var = new ufh0(watVar);
        x340Var.s0(ufh0Var);
        return ufh0Var;
    }

    public static qim0 p(u85 u85Var, int i, qim0 qim0Var) {
        return too1.y(qim0Var, new bgc0(u85Var, i));
    }

    public static void q(int i, x340 x340Var, llj lljVar, x340 x340Var2) {
        nko1.H(Integer.valueOf(i), x340Var, lljVar);
        nko1.F(x340Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(jdc jdcVar) throws Exception {
        boolean zIsTerminated;
        if (jdcVar instanceof AutoCloseable) {
            jdcVar.close();
            return;
        }
        if (!(jdcVar instanceof ExecutorService)) {
            bhn0.q();
            return;
        }
        ExecutorService executorService = (ExecutorService) jdcVar;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void s(nim0 nim0Var, float f, x340 x340Var, boolean z) {
        op71.g(x340Var, u291.h(nim0Var, f));
        x340Var.r(z);
    }

    public static void t(dkm0 dkm0Var) {
        boolean zIsTerminated;
        ExecutorService executorService = dkm0Var.a;
        if (dkm0Var == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        dkm0Var.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    dkm0Var.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "APP";
            case 2:
                return "CAR";
            case 3:
                return "HEADPHONES";
            case 4:
                return "SPEAKER";
            case 5:
                return "WEARABLE";
            case 6:
                return "FACE_WEARABLE";
            case 7:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "PRIMARY";
        }
        if (i == 2) {
            return "SECONDARY";
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "MANAGED";
        }
        if (i == 2) {
            return "UNMANAGED";
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "NORMAL";
        }
        if (i == 2) {
            return "REMINDER_AD";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "CUSTOM";
            case 2:
                return "SHARE";
            case 3:
                return "NAVIGATE";
            case 4:
                return "PLAYLIST";
            case 5:
                return "NAVIGATE_TO_NEXT";
            case 6:
                return "TRACK";
            case 7:
                return "ACTIONONEOF_NOT_SET";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("PRIMARY")) {
            return 1;
        }
        if (str.equals("SECONDARY")) {
            return 2;
        }
        hhg1.n("No enum constant com.spotify.allboarding.allboardingdomain.Action.".concat(str));
        return 0;
    }
}
