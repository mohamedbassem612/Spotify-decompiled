package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lbo1 extends u9 {
    public static final Parcelable.Creator<lbo1> CREATOR = new sao1((byte) 12);
    public final List a;

    public lbo1(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lbo1) {
            return Objects.equals(this.a, ((lbo1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        dzp0 dzp0Var = new dzp0(getClass().getSimpleName());
        dzp0Var.i("dataItemFilters", this.a);
        return dzp0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.J(parcel, 1, this.a);
        j541.M(iL, parcel);
    }
}
