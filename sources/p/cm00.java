package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cm00 extends u9 {
    public static final Parcelable.Creator<cm00> CREATOR = new e9n1((byte) 25);
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cm00) {
            cm00 cm00Var = (cm00) obj;
            if (k8p1.h(this.a, cm00Var.a) && k8p1.h(this.b, cm00Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.M(iL, parcel);
    }
}
