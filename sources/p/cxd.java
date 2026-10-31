package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cxd extends u9 {
    public static final Parcelable.Creator<cxd> CREATOR = new xud((byte) 2);
    public final int a;

    public cxd(int i) {
        this.a = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxd) && this.a == ((cxd) obj).a;
    }

    public final int hashCode() {
        return l1d.C(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(x0d.v(this.a));
    }
}
