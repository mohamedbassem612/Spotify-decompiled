package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d6o extends u9 {
    public static final Parcelable.Creator<d6o> CREATOR = new e9n1((byte) 20);
    public final String a;
    public final String b;

    public d6o(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6o)) {
            return false;
        }
        d6o d6oVar = (d6o) obj;
        return k8p1.h(this.a, d6oVar.a) && k8p1.h(this.b, d6oVar.b);
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
