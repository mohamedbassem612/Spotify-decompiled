package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zx81 implements by81 {
    public static final Parcelable.Creator<zx81> CREATOR = new yx81((byte) 0);
    public final xlk1 a;

    public zx81(xlk1 xlk1Var) {
        this.a = xlk1Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zx81) && this.a == ((zx81) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
