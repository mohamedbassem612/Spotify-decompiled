package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mya0 implements Parcelable {
    public static final Parcelable.Creator<mya0> CREATOR = new jca0((byte) 13);
    public final String a;
    public final yig1 b;
    public final String c;
    public final String d;
    public final yxa0 e;
    public final yq00 f;
    public final boolean g;

    public mya0(String str, yig1 yig1Var, String str2, String str3, yxa0 yxa0Var, yq00 yq00Var, boolean z) {
        this.a = str;
        this.b = yig1Var;
        this.c = str2;
        this.d = str3;
        this.e = yxa0Var;
        this.f = yq00Var;
        this.g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mya0)) {
            return false;
        }
        mya0 mya0Var = (mya0) obj;
        return u890.j(this.a, mya0Var.a) && u890.j(this.b, mya0Var.b) && u890.j(this.c, mya0Var.c) && u890.j(this.d, mya0Var.d) && u890.j(this.e, mya0Var.e) && u890.j(this.f, mya0Var.f) && this.g == mya0Var.g;
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
