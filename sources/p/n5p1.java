package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n5p1 extends u9 {
    public static final Parcelable.Creator<n5p1> CREATOR = new hmo1((byte) 23);
    public final boolean a;
    public final List b;

    public n5p1(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n5p1.class == obj.getClass()) {
            n5p1 n5p1Var = (n5p1) obj;
            if (this.a == n5p1Var.a && Objects.equals(this.b, n5p1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(z).length() + 59 + strValueOf.length() + 1);
        sb.append("AppWearDetailsParcelable{isWatchface=");
        sb.append(z);
        sb.append(", watchfaceCategories=");
        sb.append(strValueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j541.H(parcel, 2, this.b);
        j541.M(iL, parcel);
    }
}
