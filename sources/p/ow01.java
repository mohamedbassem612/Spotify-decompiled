package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ow01 implements Parcelable {
    public static final Parcelable.Creator<ow01> CREATOR = new sj01((byte) 25);
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public ow01(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
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
        if (!(obj instanceof ow01)) {
            return false;
        }
        ow01 ow01Var = (ow01) obj;
        return u890.j(this.a, ow01Var.a) && u890.j(this.b, ow01Var.b) && this.c == ow01Var.c && u890.j(this.d, ow01Var.d) && u890.j(this.e, ow01Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
