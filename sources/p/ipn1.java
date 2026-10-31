package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ipn1 extends u9 {
    public static final Parcelable.Creator<ipn1> CREATOR = new jrn1((byte) 10);
    public final String a;
    public final boolean b;

    public ipn1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipn1)) {
            return false;
        }
        ipn1 ipn1Var = (ipn1) obj;
        return this.a.equals(ipn1Var.a) && this.b == ipn1Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j541.M(iL, parcel);
    }
}
