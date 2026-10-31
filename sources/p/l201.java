package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class l201 implements Parcelable {
    public static final Parcelable.Creator<l201> CREATOR = new erz0((byte) 16);
    public final cce0 a;
    public final String b;
    public final String c;
    public final int d;

    public l201(cce0 cce0Var, String str, String str2, int i) {
        this.a = cce0Var;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public static l201 a(l201 l201Var, cce0 cce0Var, String str, String str2, int i, int i2) {
        if ((i2 & 1) != 0) {
            cce0Var = l201Var.a;
        }
        if ((i2 & 2) != 0) {
            str = l201Var.b;
        }
        if ((i2 & 4) != 0) {
            str2 = l201Var.c;
        }
        if ((i2 & 8) != 0) {
            i = l201Var.d;
        }
        return new l201(cce0Var, str, str2, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l201)) {
            return false;
        }
        l201 l201Var = (l201) obj;
        return u890.j(this.a, l201Var.a) && u890.j(this.b, l201Var.b) && u890.j(this.c, l201Var.c) && this.d == l201Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return Integer.hashCode(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
    }

    public l201() {
        this(new qbe0(), null, null, 5);
    }
}
