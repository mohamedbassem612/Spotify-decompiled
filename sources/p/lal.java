package p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.android.HostApplicationState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lal extends u9 {
    public final int a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public final Integer e;
    public static final lal f = new lal(0, null, null);
    public static final Parcelable.Creator<lal> CREATOR = new e9n1((byte) 14);

    public lal(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String F(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case HostApplicationState.UNKNOWN /* -1 */:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return fd21.h(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lal)) {
            return false;
        }
        lal lalVar = (lal) obj;
        return this.b == lalVar.b && k8p1.h(this.c, lalVar.c) && k8p1.h(this.d, lalVar.d) && k8p1.h(this.e, lalVar.e);
    }

    public final int hashCode() {
        return k8p1.j(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final boolean j() {
        return this.b == 0;
    }

    public final String toString() {
        drj0 drj0VarR = k8p1.r(this);
        drj0VarR.d(F(this.b), "statusCode");
        drj0VarR.d(this.c, "resolution");
        drj0VarR.d(this.d, "message");
        drj0VarR.d(this.e, "clientMethodKey");
        return drj0VarR.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.z(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i);
        j541.F(parcel, 4, this.d);
        j541.B(parcel, 5, this.e);
        j541.n(iJ, parcel);
    }

    public lal(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
