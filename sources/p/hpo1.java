package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hpo1 extends u9 {
    public static final Parcelable.Creator<hpo1> CREATOR = new hmo1(5);
    public final Uri a;
    public final int b;

    public hpo1(int i, Uri uri) {
        this.a = uri;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hpo1)) {
            return false;
        }
        hpo1 hpo1Var = (hpo1) obj;
        return Objects.equals(this.a, hpo1Var.a) && this.b == hpo1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        dzp0 dzp0Var = new dzp0(getClass().getSimpleName());
        dzp0Var.i("uri", this.a);
        String strValueOf = String.valueOf(this.b);
        ven1 ven1Var = new ven1(false);
        ((zrj1) dzp0Var.d).d = ven1Var;
        dzp0Var.d = ven1Var;
        ven1Var.c = strValueOf;
        ven1Var.b = "filterType";
        return dzp0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 1, this.a, i);
        j541.K(parcel, 2, 4);
        parcel.writeInt(this.b);
        j541.M(iL, parcel);
    }
}
