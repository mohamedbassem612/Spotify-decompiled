package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d8j0 implements f8j0 {
    public static final Parcelable.Creator<d8j0> CREATOR = new rqi0((byte) 23);
    public final int a;

    public d8j0(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8j0) && this.a == ((d8j0) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.a) {
            case 1:
                str = "Unspecified";
                break;
            case 2:
                str = "CurrentUserBlockingOtherUser";
                break;
            case 3:
                str = "OtherUserOptedOut";
                break;
            case 4:
                str = "AwaitingAcceptance";
                break;
            case 5:
                str = "AcceptanceRequired";
                break;
            case 6:
                str = "NotFriends";
                break;
            case 7:
                str = "HierarchyInactive";
                break;
            case 8:
                str = "StartRequired";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }
}
