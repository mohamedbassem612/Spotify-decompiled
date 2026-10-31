package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m6r implements Parcelable {
    public static final Parcelable.Creator<m6r> CREATOR = new rco((byte) 23);
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;

    public m6r(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = str3;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6r)) {
            return false;
        }
        m6r m6rVar = (m6r) obj;
        return u890.j(this.a, m6rVar.a) && u890.j(this.b, m6rVar.b) && u890.j(this.c, m6rVar.c) && u890.j(this.d, m6rVar.d) && u890.j(this.e, m6rVar.e) && u890.j(this.f, m6rVar.f) && u890.j(this.g, m6rVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return this.g.hashCode() + cy30.d((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        Integer num2 = this.d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num2);
        }
        Integer num3 = this.e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num3);
        }
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
