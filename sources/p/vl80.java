package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vl80 implements Parcelable {
    public static final Parcelable.Creator<vl80> CREATOR = new mj70((byte) 28);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public vl80(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl80)) {
            return false;
        }
        vl80 vl80Var = (vl80) obj;
        return u890.j(this.a, vl80Var.a) && u890.j(this.b, vl80Var.b) && u890.j(this.c, vl80Var.c) && u890.j(this.d, vl80Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
