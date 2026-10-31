package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vwv0 implements pf51, Parcelable {
    public static final Parcelable.Creator<vwv0> CREATOR = new g0v0((byte) 19);
    public final String a;
    public final String b;
    public final String c;

    public vwv0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwv0)) {
            return false;
        }
        vwv0 vwv0Var = (vwv0) obj;
        return u890.j(this.a, vwv0Var.a) && u890.j(this.b, vwv0Var.b) && u890.j(this.c, vwv0Var.c);
    }

    public final String getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
