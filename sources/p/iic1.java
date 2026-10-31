package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class iic1 implements sic1 {
    public static final Parcelable.Creator<iic1> CREATOR = new y7c1((byte) 11);
    public final String a;
    public final String b;
    public final jic1 c;

    public iic1(String str, String str2, jic1 jic1Var) {
        this.a = str;
        this.b = str2;
        this.c = jic1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iic1)) {
            return false;
        }
        iic1 iic1Var = (iic1) obj;
        return u890.j(this.a, iic1Var.a) && u890.j(this.b, iic1Var.b) && u890.j(this.c, iic1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
    }
}
