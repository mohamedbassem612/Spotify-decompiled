package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ouh0 extends u9 {
    public static final Parcelable.Creator<ouh0> CREATOR = new jrn1((byte) 5);
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouh0)) {
            return false;
        }
        ouh0 ouh0Var = (ouh0) obj;
        return this.a == ouh0Var.a && TextUtils.equals(this.b, ouh0Var.b) && k8p1.h(this.c, ouh0Var.c) && k8p1.h(this.d, ouh0Var.d) && this.e == ouh0Var.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, Double.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        int i2 = this.a;
        j541.K(parcel, 2, 4);
        parcel.writeInt(i2);
        j541.F(parcel, 3, this.b);
        List list = this.c;
        j541.J(parcel, 4, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.d;
        j541.J(parcel, 5, list2 != null ? Collections.unmodifiableList(list2) : null);
        double d = this.e;
        j541.K(parcel, 6, 8);
        parcel.writeDouble(d);
        j541.M(iL, parcel);
    }
}
