package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mpl implements apl {
    public static final Parcelable.Creator<mpl> CREATOR = new pol((byte) 14);
    public final String a;
    public final boolean b;

    public mpl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpl)) {
            return false;
        }
        mpl mplVar = (mpl) obj;
        return u890.j(this.a, mplVar.a) && this.b == mplVar.b;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }

    public /* synthetic */ mpl(String str) {
        this(str, false);
    }
}
