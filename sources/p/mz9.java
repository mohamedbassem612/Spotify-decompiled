package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mz9 implements Parcelable {
    public static final Parcelable.Creator<mz9> CREATOR = new ux9((byte) 3);
    public final ox9 a;
    public final wx9 b;

    public mz9(ox9 ox9Var, wx9 wx9Var) {
        this.a = ox9Var;
        this.b = wx9Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz9)) {
            return false;
        }
        mz9 mz9Var = (mz9) obj;
        return u890.j(this.a, mz9Var.a) && u890.j(this.b, mz9Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wx9 wx9Var = this.b;
        return iHashCode + (wx9Var == null ? 0 : wx9Var.a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        wx9 wx9Var = this.b;
        if (wx9Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wx9Var.writeToParcel(parcel, i);
        }
    }
}
