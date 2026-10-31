package p;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class g5d0 {
    public static final long a(int i) {
        if (i == 1) {
            return 60000L;
        }
        if (i == 2) {
            return 300000L;
        }
        if (i == 3) {
            return 900000L;
        }
        if (i == 4) {
            return 3600000L;
        }
        if (i == 5) {
            return Long.MAX_VALUE;
        }
        throw null;
    }

    public static int b(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("NOT_LOADED")) {
            return 1;
        }
        if (str.equals("LOADING")) {
            return 2;
        }
        if (str.equals("LOADED")) {
            return 3;
        }
        if (str.equals("FAILED")) {
            return 4;
        }
        hhg1.n("No enum constant com.spotify.profile.profilelist.model.LoadingState.".concat(str));
        return 0;
    }

    public static /* synthetic */ boolean c(int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
            case 3:
                return false;
            case 4:
            case 5:
                return true;
            case 6:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancel";
        }
        if (i == 3) {
            return "error";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "network";
        }
        if (i == 2) {
            return "memory_cache";
        }
        if (i == 3) {
            return "http_cache";
        }
        if (i == 4) {
            return "stale_http_cache";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "empty";
        }
        if (i == 3) {
            return "error";
        }
        if (i == 4) {
            return "invalid";
        }
        throw null;
    }

    public static /* synthetic */ void g(yoe0 yoe0Var) {
        if (yoe0Var != null) {
            return;
        }
        bhn0.d();
    }

    public static /* synthetic */ void h(zoe0 zoe0Var, bpe0 bpe0Var, bpe0 bpe0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zoe0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(zoe0Var, bpe0Var, bpe0Var2) && atomicReferenceFieldUpdater.get(zoe0Var) == bpe0Var) {
        }
    }

    public static /* synthetic */ void i(bpe0 bpe0Var, bpe0 bpe0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bpe0.e;
        while (!atomicReferenceFieldUpdater.compareAndSet(bpe0Var, null, bpe0Var2) && atomicReferenceFieldUpdater.get(bpe0Var) == null) {
        }
    }

    public static /* synthetic */ boolean j(Object obj, Object obj2, pdo0 pdo0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, pdo0Var)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(AtomicReference atomicReference) {
        w7e0 w7e0Var;
        do {
            w7e0Var = w7e0.b;
            if (atomicReference.compareAndSet(w7e0Var, w7e0.c)) {
                return true;
            }
        } while (atomicReference.get() == w7e0Var);
        return false;
    }

    public static /* synthetic */ boolean l(iaa0 iaa0Var, Object obj, hc21 hc21Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(iaa0Var, obj, hc21Var)) {
            if (atomicReferenceFieldUpdater.get(iaa0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(yoe0 yoe0Var, yoe0 yoe0Var2, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(yoe0Var, yoe0Var2, obj)) {
            if (atomicReferenceFieldUpdater.get(yoe0Var) != yoe0Var2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(yoe0 yoe0Var, yoe0 yoe0Var2, yoe0 yoe0Var3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(yoe0Var, yoe0Var2, yoe0Var3)) {
            if (atomicReferenceFieldUpdater.get(yoe0Var) != yoe0Var2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(AtomicReference atomicReference) {
        w7e0 w7e0Var;
        do {
            w7e0Var = w7e0.b;
            if (atomicReference.compareAndSet(w7e0Var, w7e0.d)) {
                return true;
            }
        } while (atomicReference.get() == w7e0Var);
        return false;
    }

    public static /* synthetic */ boolean p(yoe0 yoe0Var, yoe0 yoe0Var2, yoe0 yoe0Var3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.a;
        while (!atomicReferenceFieldUpdater.compareAndSet(yoe0Var, yoe0Var2, yoe0Var3)) {
            if (atomicReferenceFieldUpdater.get(yoe0Var) != yoe0Var2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean q(yoe0 yoe0Var, yoe0 yoe0Var2, yoe0 yoe0Var3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yoe0.b;
        while (!atomicReferenceFieldUpdater.compareAndSet(yoe0Var, yoe0Var2, yoe0Var3)) {
            if (atomicReferenceFieldUpdater.get(yoe0Var) != yoe0Var2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "LIBRARY_IMPORT_NOTIFICATION_SUPPRESSED";
            case 2:
                return "JAM_NOTIFICATION_SUPPRESSED";
            case 3:
                return "CHAT_NOTIFICATION_SUPPRESSED";
            case 4:
                return "CMP_QA_NOTIFICATION_SUPPRESSED";
            case 5:
                return "KALLAX_NOTIFICATION_SUPPRESSED";
            case 6:
                return "SALES_NOTIFICATION_FAILURE";
            case 7:
                return "UNRECOGNIZED";
            case 8:
                return "OS_NOTIFICATIONS_DISABLED";
            case 9:
                return "IMAGE_LOAD_FAILURE";
            case 10:
                return "QAX_PARSE_FAILURE";
            case 11:
                return "METADATA_PARSE_FAILURE";
            case 12:
                return "DEFAULT_NO_ERROR";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "NATIVE_WITH_FALLBACK";
            case 2:
                return "NATIVE_ONLY";
            case 3:
                return "KATANA_ONLY";
            case 4:
                return "WEB_ONLY";
            case 5:
                return "DIALOG_ONLY";
            case 6:
                return "DEVICE_AUTH";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "ELIGIBILITY_TIMEOUT";
        }
        if (i == 2) {
            return "CONTENT_RESOLUTION_FAILED";
        }
        if (i != 3) {
            return i != 4 ? "null" : "NETWORK_ERROR";
        }
        return "INTERNAL_ERROR";
    }
}
