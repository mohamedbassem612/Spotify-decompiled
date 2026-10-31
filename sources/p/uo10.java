package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uo10 implements vo10 {
    public static final Parcelable.Creator<uo10> CREATOR = new no10((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final qo10 d;
    public final mo10 e;
    public final boolean f;

    public uo10(String str, String str2, String str3, qo10 qo10Var, mo10 mo10Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = qo10Var;
        this.e = mo10Var;
        this.f = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo10)) {
            return false;
        }
        uo10 uo10Var = (uo10) obj;
        return u890.j(this.a, uo10Var.a) && u890.j(this.b, uo10Var.b) && u890.j(this.c, uo10Var.c) && u890.j(this.d, uo10Var.d) && u890.j(this.e, uo10Var.e) && this.f == uo10Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
