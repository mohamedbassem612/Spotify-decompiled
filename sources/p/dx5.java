package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dx5 extends u9 {
    public static final Parcelable.Creator<dx5> CREATOR = new hmo1((byte) 7);
    public final int a;
    public final int b;

    public dx5() {
        this.a = 0;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dx5.class == obj.getClass()) {
            dx5 dx5Var = (dx5) obj;
            if (this.a == dx5Var.a && this.b == dx5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(i2).length() + 2);
        c13.n(i, i2, "Description { textAlignment=", ", textSize=", sb);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.M(iL, parcel);
    }

    public dx5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
