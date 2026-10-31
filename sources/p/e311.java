package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e311 implements Parcelable {
    public static final Parcelable.Creator<e311> CREATOR = new e211((byte) 3);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public e311(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e311)) {
            return false;
        }
        e311 e311Var = (e311) obj;
        return u890.j(this.a, e311Var.a) && this.b == e311Var.b && this.c == e311Var.c && u890.j(this.d, e311Var.d) && u890.j(this.e, e311Var.e) && u890.j(this.f, e311Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(xcg1.g(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
