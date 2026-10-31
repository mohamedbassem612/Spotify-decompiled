package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dpu0 implements Parcelable {
    public static final Parcelable.Creator<dpu0> CREATOR = new brt0((byte) 21);
    public final ugo0 a;
    public final ok51 b;
    public final boolean c;
    public final p860 d;

    public dpu0(ugo0 ugo0Var, ok51 ok51Var, boolean z, p860 p860Var) {
        this.a = ugo0Var;
        this.b = ok51Var;
        this.c = z;
        this.d = p860Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpu0)) {
            return false;
        }
        dpu0 dpu0Var = (dpu0) obj;
        return u890.j(this.a, dpu0Var.a) && u890.j(this.b, dpu0Var.b) && this.c == dpu0Var.c && u890.j(this.d, dpu0Var.d);
    }

    public final int hashCode() {
        ugo0 ugo0Var = this.a;
        int iHashCode = (ugo0Var == null ? 0 : ugo0Var.hashCode()) * 31;
        ok51 ok51Var = this.b;
        int iG = xcg1.g((iHashCode + (ok51Var == null ? 0 : ok51Var.hashCode())) * 31, 31, this.c);
        p860 p860Var = this.d;
        return iG + (p860Var != null ? p860Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeParcelable(this.d, i);
    }
}
