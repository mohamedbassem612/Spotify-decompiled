package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fbn1 extends u9 {
    public static final Parcelable.Creator<fbn1> CREATOR = new e9n1(26);
    public final String a;

    public fbn1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fbn1) {
            return o4e.c(this.a, ((fbn1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.M(iL, parcel);
    }
}
