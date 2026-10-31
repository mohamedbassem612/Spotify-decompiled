package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tl6 implements Parcelable {
    public static final Parcelable.Creator<tl6> CREATOR = new fp5((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public tl6(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl6)) {
            return false;
        }
        tl6 tl6Var = (tl6) obj;
        return u890.j(this.a, tl6Var.a) && u890.j(this.b, tl6Var.b) && u890.j(this.c, tl6Var.c) && u890.j(this.d, tl6Var.d) && u890.j(this.e, tl6Var.e) && this.f == tl6Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
