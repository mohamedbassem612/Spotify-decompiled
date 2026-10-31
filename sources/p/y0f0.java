package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y0f0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<y0f0> CREATOR = new rwe0((byte) 11);
    public final String a;
    public final zzy b;
    public final Boolean c;

    public y0f0(Boolean bool, String str, zzy zzyVar) {
        this.a = str;
        this.b = zzyVar;
        this.c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0f0)) {
            return false;
        }
        y0f0 y0f0Var = (y0f0) obj;
        return u890.j(this.a, y0f0Var.a) && u890.j(this.b, y0f0Var.b) && u890.j(this.c, y0f0Var.c);
    }

    public final lik1 getViewUri() {
        return cfm0.i("spotify:internal:parental-control:login-different-device:", this.a, nik1.p0);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Boolean bool = this.c;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        Boolean bool = this.c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
    }
}
