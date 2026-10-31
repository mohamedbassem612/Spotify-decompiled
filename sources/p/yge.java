package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class yge implements Parcelable {
    public Boolean a;
    public Boolean b;
    public static final xge Companion = new xge();
    public static final Parcelable.Creator<yge> CREATOR = new xud((byte) 29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yge)) {
            return false;
        }
        yge ygeVar = (yge) obj;
        return u890.j(this.a, ygeVar.a) && u890.j(this.b, ygeVar.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.a;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        Boolean bool2 = this.b;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool2);
        }
    }
}
