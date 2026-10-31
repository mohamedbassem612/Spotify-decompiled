package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fx5 extends u9 {
    public static final Parcelable.Creator<fx5> CREATOR = new hmo1((byte) 16);
    public final int a;

    public fx5() {
        this.a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && fx5.class == obj.getClass() && this.a == ((fx5) obj).a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.a).hashCode();
    }

    public final String toString() {
        int i = this.a;
        return fd21.h(new StringBuilder(String.valueOf(i).length() + 28), "Icon { componentAlignment=", i, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.M(iL, parcel);
    }

    public fx5(int i) {
        this.a = i;
    }
}
