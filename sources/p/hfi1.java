package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hfi1 implements jfi1 {
    public static final Parcelable.Creator<hfi1> CREATOR = new xbi1((byte) 4);
    public final String a;
    public final String b;
    public final String c;

    public hfi1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfi1)) {
            return false;
        }
        hfi1 hfi1Var = (hfi1) obj;
        return u890.j(this.a, hfi1Var.a) && u890.j(this.b, hfi1Var.b) && u890.j(this.c, hfi1Var.c);
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
