package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zy60 implements Parcelable, ir0 {
    public static final Parcelable.Creator<zy60> CREATOR = new ij60((byte) 11);
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public zy60(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy60)) {
            return false;
        }
        zy60 zy60Var = (zy60) obj;
        return this.a == zy60Var.a && this.b == zy60Var.b && u890.j(this.c, zy60Var.c) && u890.j(this.d, zy60Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
        String str = this.c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
