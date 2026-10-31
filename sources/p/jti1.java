package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jti1 extends u9 {
    public static final Parcelable.Creator<jti1> CREATOR = new jrn1(26);
    public final String a;
    public final String b;

    public jti1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jti1)) {
            return false;
        }
        jti1 jti1Var = (jti1) obj;
        return o4e.c(this.a, jti1Var.a) && o4e.c(this.b, jti1Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.M(iL, parcel);
    }
}
