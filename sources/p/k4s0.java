package p;

import android.os.Parcel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class k4s0 {
    public static int[] _values() {
        return l1d.H(5);
    }

    public static final String a(int i) {
        switch (i) {
            case 1:
                return "ubi_interaction";
            case 2:
                return "autoplay";
            case 3:
                return "state_restore";
            case 4:
                return "widget";
            case 5:
                return "voice_assistant";
            case 6:
                return "connect";
            case 7:
                return "deep_link";
            case 8:
                return "notification";
            default:
                throw null;
        }
    }

    public static final boolean b(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return false;
        }
        if (iC == 1) {
            return true;
        }
        eg.o();
        return false;
    }

    public static final int c(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "home";
        }
        if (i == 2) {
            return "recently_played";
        }
        if (i == 3) {
            return "browse";
        }
        if (i == 4) {
            return "library";
        }
        if (i == 5) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        switch (i) {
            case 1:
                return "failed_to_resolve";
            case 2:
                return "invalid_link";
            case 3:
                return "missing_share_id";
            case 4:
                return "feature_not_available";
            case 5:
                return "wrapped_redirect_disallowed";
            case 6:
                return "timeout";
            case 7:
                return "link_expired";
            case 8:
                return "failed_after_age_assurance_flow";
            case 9:
                return "opted_out";
            case 10:
                return "restricted_from_messaging";
            case 11:
                return "should_assure_age";
            case 12:
                return "too_young";
            case 13:
                return "unreleased_market";
            case 14:
                return "unknown_error";
            case 15:
                return "members_limit_exceeded";
            case 16:
                return "should_not_redirect_off_platform_share";
            case 17:
                return "success";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "stuck";
        }
        if (i == 2) {
            return "slow";
        }
        if (i == 3) {
            return "stuck_timeout";
        }
        if (i == 4) {
            return "slow_timeout";
        }
        if (i == 5) {
            return "recovered";
        }
        throw null;
    }

    public static int g(Parcel parcel, LinkedHashSet linkedHashSet, int i, int i2) {
        linkedHashSet.add(parcel.readString());
        return i + i2;
    }

    public static Iterator h(Set set, Parcel parcel) {
        parcel.writeInt(set.size());
        return set.iterator();
    }

    public static void i(int i, j2i j2iVar, x340 x340Var, boolean z, boolean z2) {
        j2iVar.invoke(x340Var, Integer.valueOf(i));
        x340Var.r(z);
        x340Var.r(z2);
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "VIDEO_ON_CONNECT";
        }
        if (i == 2) {
            return "AGE_ASSURANCE_REQUIRED";
        }
        if (i == 3) {
            return "OTHER";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "ATTEMPT_MIGRATION";
        }
        if (i == 2) {
            return "NOT_GENERATED";
        }
        if (i == 3) {
            return "UNREGISTERED";
        }
        if (i != 4) {
            return i != 5 ? "null" : "REGISTER_ERROR";
        }
        return "REGISTERED";
    }
}
