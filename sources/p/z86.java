package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z86 implements Parcelable {
    public static final Parcelable.Creator<z86> CREATOR = new fp5(2);
    public final String a;
    public final String b;
    public final chr0 c;
    public final psk d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;

    public z86(String str, String str2, chr0 chr0Var, psk pskVar, String str3, String str4, String str5, String str6, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = chr0Var;
        this.d = pskVar;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = num;
    }

    public final chr0 a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z86)) {
            return false;
        }
        z86 z86Var = (z86) obj;
        return u890.j(this.a, z86Var.a) && u890.j(this.b, z86Var.b) && this.c == z86Var.c && this.d == z86Var.d && u890.j(this.e, z86Var.e) && u890.j(this.f, z86Var.f) && u890.j(this.g, z86Var.g) && u890.j(this.h, z86Var.h) && u890.j(this.i, z86Var.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((this.d.hashCode() + ((this.c.hashCode() + cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31)) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.i;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        Integer num = this.i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
