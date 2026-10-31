package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kpi0 implements Parcelable {
    public static final Parcelable.Creator<kpi0> CREATOR = new cyh0((byte) 29);
    public final String a;
    public final wxn0 b;

    public kpi0(String str, wxn0 wxn0Var) {
        this.a = str;
        this.b = wxn0Var;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpi0)) {
            return false;
        }
        kpi0 kpi0Var = (kpi0) obj;
        return u890.j(this.a, kpi0Var.a) && this.b == kpi0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
