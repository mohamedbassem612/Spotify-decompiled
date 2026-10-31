package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.android.HostApplicationState;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yvn1 extends u9 {
    public static final Parcelable.Creator<yvn1> CREATOR = new jrn1((byte) 17);
    public final int a;
    public final String b;

    public yvn1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvn1)) {
            return false;
        }
        yvn1 yvn1Var = (yvn1) obj;
        return this.a == yvn1Var.a && Objects.equals(this.b, yvn1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strL;
        int i = this.a;
        switch (i) {
            case -9:
                strL = "Migration was cancelled";
                break;
            case -8:
                strL = "Another migration is already in progress";
                break;
            case -7:
                strL = "Connect message malformed";
                break;
            case -6:
                strL = "Migration status mismatch between watch and phone";
                break;
            case -5:
                strL = "Phone switching feature disabled";
                break;
            case -4:
                strL = "Did not receive connect msg";
                break;
            case -3:
                strL = "No bluetooth connection";
                break;
            case -2:
                strL = "Accounts mismatch";
                break;
            case HostApplicationState.UNKNOWN /* -1 */:
                strL = "Unknown failure";
                break;
            case 0:
                strL = "Connected";
                break;
            case 1:
                strL = "Connection handshake in progress";
                break;
            case 2:
                strL = "Connection handshake complete";
                break;
            case 3:
                strL = "Sync with old node suspended";
                break;
            case 4:
                strL = "Control plane transport connected";
                break;
            case 5:
                strL = "Accounts Matched";
                break;
            case 6:
                strL = "Association to watch terminated";
                break;
            default:
                strL = gvg.l(new StringBuilder(String.valueOf(i).length() + 26), "Unrecognized state value: ", i);
                break;
        }
        return gvg.h("ConnectionStateEvent: address: ", this.b, ", state: ", strL);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int iJ = j541.j(parcel);
        j541.z(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.n(iJ, parcel);
    }
}
