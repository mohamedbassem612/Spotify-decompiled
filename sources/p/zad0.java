package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zad0 implements Parcelable {
    public static final Parcelable.Creator<zad0> CREATOR = new lad0(5);
    public final String a;
    public final gad0 b;

    public zad0(String str, gad0 gad0Var) {
        this.a = str;
        this.b = gad0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad0)) {
            return false;
        }
        zad0 zad0Var = (zad0) obj;
        return u890.j(this.a, zad0Var.a) && u890.j(this.b, zad0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gad0 gad0Var = this.b;
        return iHashCode + (gad0Var == null ? 0 : gad0Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        gad0 gad0Var = this.b;
        if (gad0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gad0Var.writeToParcel(parcel, i);
        }
    }
}
