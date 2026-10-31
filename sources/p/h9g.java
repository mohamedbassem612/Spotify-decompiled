package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h9g implements Parcelable {
    public static final Parcelable.Creator<h9g> CREATOR = new i8g((byte) 15);
    public final String a;
    public final String b;
    public final String c;
    public final d5g d;
    public final d5g e;
    public final sce f;
    public final y8g g;

    public h9g(String str, String str2, String str3, d5g d5gVar, d5g d5gVar2, sce sceVar, y8g y8gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d5gVar;
        this.e = d5gVar2;
        this.f = sceVar;
        this.g = y8gVar;
    }

    public static h9g a(h9g h9gVar, d5g d5gVar, d5g d5gVar2) {
        String str = h9gVar.a;
        String str2 = h9gVar.b;
        String str3 = h9gVar.c;
        sce sceVar = h9gVar.f;
        y8g y8gVar = h9gVar.g;
        h9gVar.getClass();
        return new h9g(str, str2, str3, d5gVar, d5gVar2, sceVar, y8gVar);
    }

    public final lra b() {
        d5g d5gVarG = g();
        if (d5gVarG != null) {
            return d5gVarG.g;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9g)) {
            return false;
        }
        h9g h9gVar = (h9g) obj;
        return u890.j(this.a, h9gVar.a) && u890.j(this.b, h9gVar.b) && u890.j(this.c, h9gVar.c) && u890.j(this.d, h9gVar.d) && u890.j(this.e, h9gVar.e) && u890.j(this.f, h9gVar.f) && u890.j(this.g, h9gVar.g);
    }

    public final d5g g() {
        d5g d5gVar = this.d;
        if (!d5gVar.a) {
            d5gVar = null;
        }
        if (d5gVar != null) {
            return d5gVar;
        }
        d5g d5gVar2 = this.e;
        if (d5gVar2.a) {
            return d5gVar2;
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31;
        sce sceVar = this.f;
        int iHashCode2 = (iHashCode + (sceVar == null ? 0 : sceVar.hashCode())) * 31;
        y8g y8gVar = this.g;
        return iHashCode2 + (y8gVar != null ? y8gVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        this.e.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f, i);
        y8g y8gVar = this.g;
        if (y8gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            y8gVar.writeToParcel(parcel, i);
        }
    }
}
