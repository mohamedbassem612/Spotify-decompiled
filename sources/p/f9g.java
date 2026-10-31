package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f9g implements Parcelable {
    public static final Parcelable.Creator<f9g> CREATOR = new i8g(13);
    public final String a;
    public final String b;
    public final d9g c;
    public final e9g d;
    public final e9g e;

    public /* synthetic */ f9g(String str, String str2, d9g d9gVar, e9g e9gVar, e9g e9gVar2, int i) {
        this(str, str2, d9gVar, (i & 8) != 0 ? null : e9gVar, (i & 16) != 0 ? null : e9gVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9g)) {
            return false;
        }
        f9g f9gVar = (f9g) obj;
        return u890.j(this.a, f9gVar.a) && u890.j(this.b, f9gVar.b) && u890.j(this.c, f9gVar.c) && u890.j(this.d, f9gVar.d) && u890.j(this.e, f9gVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31;
        e9g e9gVar = this.d;
        int iHashCode2 = (iHashCode + (e9gVar == null ? 0 : e9gVar.hashCode())) * 31;
        e9g e9gVar2 = this.e;
        return iHashCode2 + (e9gVar2 != null ? e9gVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        e9g e9gVar = this.d;
        if (e9gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e9gVar.writeToParcel(parcel, i);
        }
        e9g e9gVar2 = this.e;
        if (e9gVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            e9gVar2.writeToParcel(parcel, i);
        }
    }

    public f9g(String str, String str2, d9g d9gVar, e9g e9gVar, e9g e9gVar2) {
        this.a = str;
        this.b = str2;
        this.c = d9gVar;
        this.d = e9gVar;
        this.e = e9gVar2;
    }
}
