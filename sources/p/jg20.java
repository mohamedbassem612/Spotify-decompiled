package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jg20 implements dtb1 {
    public static final Parcelable.Creator<jg20> CREATOR = new qe20((byte) 8);
    public final String a;

    public /* synthetic */ jg20() {
        this("FindFriendsEntry");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg20) && u890.j(this.a, ((jg20) obj).a);
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

    public jg20(String str) {
        this.a = str;
    }
}
