package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bsm1 implements esm1 {
    public static final Parcelable.Creator<bsm1> CREATOR = new ynm1((byte) 2);
    public final List a;
    public final String b;

    public bsm1(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsm1)) {
            return false;
        }
        bsm1 bsm1Var = (bsm1) obj;
        return u890.j(this.a, bsm1Var.a) && u890.j(this.b, bsm1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeString(this.b);
    }
}
