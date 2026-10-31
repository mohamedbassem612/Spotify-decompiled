package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class r0f0 implements Parcelable {
    public static final Parcelable.Creator<r0f0> CREATOR = new rwe0((byte) 10);
    public final String a;
    public final String b;
    public final String c;
    public final zzy d;
    public final Integer e;
    public final pe11 f;

    public r0f0(String str, String str2, String str3, zzy zzyVar, Integer num, pe11 pe11Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zzyVar;
        this.e = num;
        this.f = pe11Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0f0)) {
            return false;
        }
        r0f0 r0f0Var = (r0f0) obj;
        return u890.j(this.a, r0f0Var.a) && u890.j(this.b, r0f0Var.b) && u890.j(this.c, r0f0Var.c) && u890.j(this.d, r0f0Var.d) && u890.j(this.e, r0f0Var.e) && this.f == r0f0Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.f.name());
    }
}
