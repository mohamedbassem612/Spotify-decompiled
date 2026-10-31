package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yfk1 implements Parcelable {
    public static final Parcelable.Creator<yfk1> CREATOR = new tfk1((byte) 5);
    public final String a;
    public final kq70 b;
    public final String c;
    public final String d;
    public final String e;

    public yfk1(String str, kq70 kq70Var, String str2, String str3, String str4) {
        this.a = str;
        this.b = kq70Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfk1)) {
            return false;
        }
        yfk1 yfk1Var = (yfk1) obj;
        return u890.j(this.a, yfk1Var.a) && u890.j(this.b, yfk1Var.b) && u890.j(this.c, yfk1Var.c) && u890.j(this.d, yfk1Var.d) && u890.j(this.e, yfk1Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
