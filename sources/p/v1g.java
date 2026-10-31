package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1g implements Parcelable {
    public static final Parcelable.Creator<v1g> CREATOR = new wxf(9);
    public final String a;
    public final String b;
    public final String c;
    public final zzy d;
    public final Boolean e;
    public final pe11 f;
    public final boolean g;
    public final boolean h;

    public v1g(String str, String str2, String str3, zzy zzyVar, Boolean bool, pe11 pe11Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzyVar;
        this.e = bool;
        this.f = pe11Var;
        this.g = z;
        this.h = z2;
    }

    public static v1g a(v1g v1gVar, String str, pe11 pe11Var, boolean z, boolean z2, int i) {
        String str2 = v1gVar.a;
        String str3 = v1gVar.b;
        if ((i & 4) != 0) {
            str = v1gVar.c;
        }
        String str4 = str;
        zzy zzyVar = v1gVar.d;
        Boolean bool = v1gVar.e;
        if ((i & 32) != 0) {
            pe11Var = v1gVar.f;
        }
        pe11 pe11Var2 = pe11Var;
        if ((i & 64) != 0) {
            z = v1gVar.g;
        }
        boolean z3 = z;
        if ((i & 128) != 0) {
            z2 = v1gVar.h;
        }
        return new v1g(str2, str3, str4, zzyVar, bool, pe11Var2, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1g)) {
            return false;
        }
        v1g v1gVar = (v1g) obj;
        return u890.j(this.a, v1gVar.a) && u890.j(this.b, v1gVar.b) && u890.j(this.c, v1gVar.c) && u890.j(this.d, v1gVar.d) && u890.j(this.e, v1gVar.e) && this.f == v1gVar.f && this.g == v1gVar.g && this.h == v1gVar.h;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        Boolean bool = this.e;
        return Boolean.hashCode(this.h) + xcg1.g((this.f.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31, 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Boolean bool = this.e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
