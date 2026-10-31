package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fls0 implements dtb1 {
    public static final Parcelable.Creator<fls0> CREATOR = new bis0((byte) 6);
    public final String a;

    public /* synthetic */ fls0() {
        this("PermissionBanner");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fls0) && u890.j(this.a, ((fls0) obj).a);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public fls0(String str) {
        this.a = str;
    }
}
