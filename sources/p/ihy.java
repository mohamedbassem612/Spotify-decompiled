package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ihy extends mhy {
    public static final Parcelable.Creator<ihy> CREATOR = new utx((byte) 29);
    public final int a;
    public final as3 b;

    public ihy(int i, as3 as3Var) {
        this.a = i;
        this.b = as3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihy)) {
            return false;
        }
        ihy ihyVar = (ihy) obj;
        return this.a == ihyVar.a && this.b == ihyVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b.name());
    }
}
