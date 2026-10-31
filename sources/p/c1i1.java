package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c1i1 implements Parcelable {
    public static final Parcelable.Creator<c1i1> CREATOR = new gwg1((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final azh1 d;
    public final b1i1 e;
    public final b1i1 f;

    public c1i1(String str, String str2, String str3, azh1 azh1Var, b1i1 b1i1Var, b1i1 b1i1Var2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = azh1Var;
        this.e = b1i1Var;
        this.f = b1i1Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1i1)) {
            return false;
        }
        c1i1 c1i1Var = (c1i1) obj;
        return u890.j(this.a, c1i1Var.a) && u890.j(this.b, c1i1Var.b) && u890.j(this.c, c1i1Var.c) && u890.j(this.d, c1i1Var.d) && u890.j(this.e, c1i1Var.e) && u890.j(this.f, c1i1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        azh1 azh1Var = this.d;
        int iHashCode = (this.e.hashCode() + ((iD + (azh1Var == null ? 0 : azh1Var.hashCode())) * 31)) * 31;
        b1i1 b1i1Var = this.f;
        return iHashCode + (b1i1Var != null ? b1i1Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        azh1 azh1Var = this.d;
        if (azh1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            azh1Var.writeToParcel(parcel, i);
        }
        this.e.writeToParcel(parcel, i);
        b1i1 b1i1Var = this.f;
        if (b1i1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            b1i1Var.writeToParcel(parcel, i);
        }
    }
}
