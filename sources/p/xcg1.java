package p;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class xcg1 {
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

    public static /* synthetic */ boolean b(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ byte c(int i) {
        if (i == 1) {
            return (byte) 7;
        }
        if (i == 2) {
            return (byte) 4;
        }
        if (i == 3) {
            return (byte) 3;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "getInfoResponse";
        }
        if (i == 2) {
            return "addUserResponse";
        }
        if (i == 3) {
            return "addUserError";
        }
        if (i == 4) {
            return "transferSuccess";
        }
        if (i == 5) {
            return "transferError";
        }
        throw null;
    }

    public static int e(double d, int i, int i2) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int g(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static /* synthetic */ long h(long j) {
        if (j < 0) {
            return Long.MAX_VALUE < (j ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        long j2 = (Long.MAX_VALUE / j) << 1;
        return j2 + ((long) ((((-1) - (j2 * j)) ^ Long.MIN_VALUE) < (j ^ Long.MIN_VALUE) ? 0 : 1));
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static Iterator j(Parcel parcel, Map map) {
        parcel.writeInt(map.size());
        return map.entrySet().iterator();
    }

    public static qim0 k(uwr uwrVar, qim0 qim0Var) {
        uwrVar.getClass();
        return hno1.f(qim0Var, uwr.a());
    }

    public static /* synthetic */ void l(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                bhn0.q();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "BUILT_IN_SPEAKER";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i == 4) {
            return "WIRED";
        }
        if (i == 5) {
            return "CAR_PROJECTED";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "ALLOWED_ADULT";
            case 2:
                return "ALLOWED_MINOR_WITH_CONSENT";
            case 3:
                return "ALLOWED_ENFORCEMENT_NOT_REQUIRED";
            case 4:
                return "ALLOWED_FAILED_TO_VERIFY";
            case 5:
                return "BLOCKED_UNDERAGE";
            case 6:
                return "BLOCKED_PARENTAL_DENIAL";
            case 7:
                return "BLOCKED_AGE_RANGE_UNKNOWN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String o(int i) {
        if (i == 1) {
            return "NOT_SUPPORTED_BY_DEVICE";
        }
        if (i == 2) {
            return "ACCOUNT_MANAGER";
        }
        if (i == 3) {
            return "MUSIC_VIDEO_DISABLED";
        }
        if (i == 4) {
            return "OTHER_VIDEO_DISABLED";
        }
        throw null;
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "BUILT_IN_SPEAKER";
        }
        if (i == 3) {
            return "BLUETOOTH";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CAR_PROJECTED";
        }
        return "WIRED";
    }

    public static /* synthetic */ String q(int i) {
        if (i == 1) {
            return "INVARIANT";
        }
        if (i != 2) {
            return i != 3 ? "null" : "OUT_VARIANCE";
        }
        return "IN_VARIANCE";
    }

    public static /* synthetic */ int r(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("NOT_SUPPORTED_BY_DEVICE")) {
            return 1;
        }
        if (str.equals("ACCOUNT_MANAGER")) {
            return 2;
        }
        if (str.equals("MUSIC_VIDEO_DISABLED")) {
            return 3;
        }
        if (str.equals("OTHER_VIDEO_DISABLED")) {
            return 4;
        }
        hhg1.n("No enum constant com.spotify.nowplaying.elements.audiovideotransition.VideoDisableReason.".concat(str));
        return 0;
    }
}
