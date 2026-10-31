package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nic1 implements sic1 {
    public static final Parcelable.Creator<nic1> CREATOR = new y7c1((byte) 15);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final jic1 f;

    public nic1(String str, String str2, String str3, String str4, String str5, jic1 jic1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = jic1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nic1)) {
            return false;
        }
        nic1 nic1Var = (nic1) obj;
        return u890.j(this.a, nic1Var.a) && u890.j(this.b, nic1Var.b) && u890.j(this.c, nic1Var.c) && u890.j(this.d, nic1Var.d) && u890.j(this.e, nic1Var.e) && u890.j(this.f, nic1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        this.f.writeToParcel(parcel, i);
    }
}
