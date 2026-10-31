package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vf1 implements Parcelable {
    public static final Parcelable.Creator<vf1> CREATOR = new d41((byte) 15);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public vf1(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
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
        if (!(obj instanceof vf1)) {
            return false;
        }
        vf1 vf1Var = (vf1) obj;
        return u890.j(this.a, vf1Var.a) && u890.j(this.b, vf1Var.b) && u890.j(this.c, vf1Var.c) && this.d == vf1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
