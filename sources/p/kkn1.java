package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kkn1 extends u9 {
    public static final Parcelable.Creator<kkn1> CREATOR = new e9n1((byte) 22);
    public final fjn1 a;
    public final fjn1 b;

    public kkn1(fjn1 fjn1Var, fjn1 fjn1Var2) {
        this.a = fjn1Var;
        this.b = fjn1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkn1)) {
            return false;
        }
        kkn1 kkn1Var = (kkn1) obj;
        return o4e.c(this.a, kkn1Var.a) && o4e.c(this.b, kkn1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        j541.E(parcel, 3, this.b, i);
        j541.M(iL, parcel);
    }
}
