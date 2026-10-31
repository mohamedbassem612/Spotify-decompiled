package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class znp0 implements Parcelable {
    public static final Parcelable.Creator<znp0> CREATOR = new ump0((byte) 5);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public znp0(String str, String str2, String str3, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
        this.f = z2;
        this.g = xa4.o(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znp0)) {
            return false;
        }
        znp0 znp0Var = (znp0) obj;
        return u890.j(this.a, znp0Var.a) && u890.j(this.b, znp0Var.b) && u890.j(this.c, znp0Var.c) && u890.j(this.d, znp0Var.d) && this.e == znp0Var.e && this.f == znp0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + xcg1.g(f4i1.b((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
