package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vd90 implements Parcelable {
    public static final Parcelable.Creator<vd90> CREATOR = new xl80((byte) 19);
    public static final vd90 b = new vd90(new sd90(null));
    public final ud90 a;

    public vd90(ud90 ud90Var) {
        this.a = ud90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd90) && u890.j(this.a, ((vd90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
