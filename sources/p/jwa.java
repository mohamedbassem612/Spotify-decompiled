package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jwa implements Parcelable {
    public static final Parcelable.Creator<jwa> CREATOR = new mra((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final yxa0 f;

    public jwa(String str, String str2, String str3, int i, int i2, yxa0 yxa0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = yxa0Var;
    }

    public final yxa0 a() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwa)) {
            return false;
        }
        jwa jwaVar = (jwa) obj;
        return u890.j(this.a, jwaVar.a) && u890.j(this.b, jwaVar.b) && u890.j(this.c, jwaVar.c) && this.d == jwaVar.d && this.e == jwaVar.e && u890.j(this.f, jwaVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
    }
}
