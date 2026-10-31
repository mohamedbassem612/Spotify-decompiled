package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public abstract /* synthetic */ class h4b1 {
    public static final String a(int i) {
        if (i == 1) {
            return "fully_cached";
        }
        if (i == 2) {
            return "partially_cached";
        }
        if (i == 3) {
            return "not_cached";
        }
        if (i == 4) {
            return "unknown";
        }
        if (i == 5) {
            return "none";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "view_uri";
        }
        if (i == 2) {
            return "focus";
        }
        if (i == 3) {
            return "screen_lock";
        }
        if (i == 4) {
            return "active_connected_device";
        }
        if (i == 5) {
            return "moving";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "aiplaylistdefault";
        }
        if (i == 3) {
            return "aiplaylistfuncollectible";
        }
        if (i == 4) {
            return "aiplaylistbetterscreenshot";
        }
        if (i == 5) {
            return "mvcdp";
        }
        throw null;
    }

    public static String d(Uri uri, String str) {
        return str + uri;
    }

    public static /* synthetic */ String e(Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) ":");
            }
        }
        return sb.toString();
    }

    public static g3d1 f(ArrayList arrayList, g3d1 g3d1Var) {
        arrayList.add(g3d1Var);
        return new g3d1();
    }

    public static void g(int i, h3d1 h3d1Var, long j, g3d1 g3d1Var) {
        g3d1Var.a(new k29(i, h3d1Var, j));
    }

    public static void h(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(y6b1.f(str2));
        sb.append(str3);
    }

    public static /* synthetic */ boolean i(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, gio1.b)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean j(AtomicReference atomicReference, ohd ohdVar) {
        jm jmVar;
        do {
            jmVar = gio1.a;
            if (atomicReference.compareAndSet(jmVar, ohdVar)) {
                return true;
            }
        } while (atomicReference.get() == jmVar);
        return false;
    }

    public static /* synthetic */ boolean k(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, gio1.a)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "GPB_CHECK";
        }
        if (i == 2) {
            return "FORCE_UNSUPPORTED";
        }
        if (i == 3) {
            return "DISABLE_GPB_FOR_SAMSUNG";
        }
        throw null;
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "USER_STATUS_UNSPECIFIED";
        }
        if (i == 2) {
            return "USER_STATUS_ACTIVE";
        }
        if (i == 3) {
            return "USER_STATUS_DISABLED";
        }
        if (i == 4) {
            return "USER_STATUS_SUGGESTED";
        }
        if (i == 5) {
            return "USER_STATUS_NOT_ACCEPTED";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        switch (i) {
            case 1:
                return "API_NOT_AVAILABLE";
            case 2:
                return "APP_NOT_OWNED";
            case 3:
                return "PERMISSION_DENIED";
            case 4:
                return "NETWORK_ERROR";
            case 5:
                return "PARSE_ERROR";
            case 6:
                return "INTERNAL_ERROR";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "SUCCESS";
            case 2:
                return "API_NOT_AVAILABLE";
            case 3:
                return "NETWORK_ERROR";
            case 4:
                return "STORE_ERROR";
            case 5:
                return "TIMEOUT";
            case 6:
                return "UNKNOWN_ERROR";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int p(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("USER_STATUS_UNSPECIFIED")) {
            return 1;
        }
        if (str.equals("USER_STATUS_ACTIVE")) {
            return 2;
        }
        if (str.equals("USER_STATUS_DISABLED")) {
            return 3;
        }
        if (str.equals("USER_STATUS_SUGGESTED")) {
            return 4;
        }
        if (str.equals("USER_STATUS_NOT_ACCEPTED")) {
            return 5;
        }
        hhg1.n("No enum constant com.spotify.campfire.models.Status.".concat(str));
        return 0;
    }
}
