package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class imr0 implements Parcelable {
    public static final Parcelable.Creator<imr0> CREATOR = new elr0((byte) 4);
    public final String a;
    public final String b;
    public final String c;

    public imr0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imr0)) {
            return false;
        }
        imr0 imr0Var = (imr0) obj;
        return u890.j(this.a, imr0Var.a) && u890.j(this.b, imr0Var.b) && u890.j(this.c, imr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
