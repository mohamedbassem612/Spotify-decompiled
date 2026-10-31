package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vwc implements Parcelable {
    public static final Parcelable.Creator<vwc> CREATOR = new yyb((byte) 12);
    public final tjm0 a;
    public final tjm0 b;
    public final f7r c;
    public final tjm0 d;
    public final int e;
    public final int f;

    public vwc(tjm0 tjm0Var, tjm0 tjm0Var2, f7r f7rVar, tjm0 tjm0Var3) {
        this.a = tjm0Var;
        this.b = tjm0Var2;
        this.d = tjm0Var3;
        this.c = f7rVar;
        if (tjm0Var3 != null && tjm0Var.a.compareTo(tjm0Var3.a) > 0) {
            hhg1.n("start Month cannot be after current Month");
            throw null;
        }
        if (tjm0Var3 != null && tjm0Var3.compareTo(tjm0Var2) > 0) {
            hhg1.n("current Month cannot be after end Month");
            throw null;
        }
        this.f = tjm0Var.k(tjm0Var2) + 1;
        this.e = (tjm0Var2.c - tjm0Var.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwc)) {
            return false;
        }
        vwc vwcVar = (vwc) obj;
        return this.a.equals(vwcVar.a) && this.b.equals(vwcVar.b) && Objects.equals(this.d, vwcVar.d) && this.c.equals(vwcVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
    }
}
