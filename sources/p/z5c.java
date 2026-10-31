package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class z5c {
    public static int[] _values() {
        return l1d.H(4);
    }

    public static int a(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static final String b(int i) {
        if (i == 1) {
            return "no_cache";
        }
        if (i == 2) {
            return "disk_cache";
        }
        if (i == 3) {
            return "memory_cache";
        }
        throw null;
    }

    public static final int c(int i) {
        int i2;
        wf10 wf10Var = wf10.a;
        w0h1.H();
        int i3 = wf10.k;
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 5;
                break;
            case 7:
                i2 = 6;
                break;
            case 8:
                i2 = 7;
                break;
            case 9:
                i2 = 8;
                break;
            case 10:
                i2 = 9;
                break;
            case 11:
                i2 = 10;
                break;
            case 12:
                i2 = 11;
                break;
            case 13:
                i2 = 12;
                break;
            case 14:
                i2 = 13;
                break;
            case 15:
                i2 = 14;
                break;
            case 16:
                i2 = 15;
                break;
            case 17:
                i2 = 16;
                break;
            default:
                throw null;
        }
        return i2 + i3;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "BROADCAST_STATUS_UNKNOWN";
        }
        if (i == 2) {
            return "BROADCAST_UNAVAILABLE";
        }
        if (i == 3) {
            return "BROADCAST_ON";
        }
        if (i == 4) {
            return "BROADCAST_OFF";
        }
        throw null;
    }

    public static float e(x340 x340Var, int i, int i2, x340 x340Var2, boolean z) {
        x340Var.i0(i);
        float fM = dsa0.m(x340Var2, i2);
        x340Var.r(z);
        return fM;
    }

    public static void f(int i, x340 x340Var, int i2, llj lljVar) {
        x340Var.s0(Integer.valueOf(i));
        x340Var.b(Integer.valueOf(i2), lljVar);
    }

    public static /* synthetic */ boolean g(bbc bbcVar, Object obj, jm jmVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.i;
        while (!atomicReferenceFieldUpdater.compareAndSet(bbcVar, obj, jmVar)) {
            if (atomicReferenceFieldUpdater.get(bbcVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean h(bbc bbcVar, hp51 hp51Var, rge rgeVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(bbcVar, hp51Var, rgeVar)) {
            if (atomicReferenceFieldUpdater.get(bbcVar) != hp51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean i(bbc bbcVar, hp51 hp51Var, hp51 hp51Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.g;
        while (!atomicReferenceFieldUpdater.compareAndSet(bbcVar, hp51Var, hp51Var2)) {
            if (atomicReferenceFieldUpdater.get(bbcVar) != hp51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(ohd ohdVar, Object obj, lyh lyhVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ohd.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ohdVar, obj, lyhVar)) {
            if (atomicReferenceFieldUpdater.get(ohdVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean k(ohd ohdVar, ra0 ra0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ohd.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ohdVar, ra0Var, obj)) {
            if (atomicReferenceFieldUpdater.get(ohdVar) != ra0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean l(ohd ohdVar, lyh lyhVar, lyh lyhVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ohd.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ohdVar, lyhVar, lyhVar2)) {
            if (atomicReferenceFieldUpdater.get(ohdVar) != lyhVar) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(ohd ohdVar, ago0 ago0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ohd.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(ohdVar, ago0Var, obj)) {
            if (atomicReferenceFieldUpdater.get(ohdVar) != ago0Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean n(bbc bbcVar, hp51 hp51Var, hp51 hp51Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.f;
        while (!atomicReferenceFieldUpdater.compareAndSet(bbcVar, hp51Var, hp51Var2)) {
            if (atomicReferenceFieldUpdater.get(bbcVar) != hp51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean o(bbc bbcVar, hp51 hp51Var, hp51 hp51Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.h;
        while (!atomicReferenceFieldUpdater.compareAndSet(bbcVar, hp51Var, hp51Var2)) {
            if (atomicReferenceFieldUpdater.get(bbcVar) != hp51Var) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String p(int i) {
        switch (i) {
            case 1:
                return "INITIAL";
            case 2:
                return "SEEK";
            case 3:
                return "STALL";
            case 4:
                return "STUTTER";
            case 5:
                return "FORCED";
            case 6:
                return "UNKNOWN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String r(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "ERROR_USER_NEEDS_AUTHORIZATION";
        }
        if (i == 2) {
            return "ERROR_NOT_LOGGED_IN";
        }
        if (i == 3) {
            return "ERROR_OFFLINE_MODE_ACTIVE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "ERROR_AUTHORIZATION_RESPONSE";
        }
        return "ERROR_AUTHORIZATION_TIMEOUT";
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "DECLARATION";
        }
        if (i == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }
}
