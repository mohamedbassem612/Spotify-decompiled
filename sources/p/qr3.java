package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qr3 implements sr3 {
    public static final Parcelable.Creator<qr3> CREATOR = new i93((byte) 9);
    public final String a;
    public final String b;
    public final String c;

    public qr3(String str, String str2, String str3) {
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
        if (!(obj instanceof qr3)) {
            return false;
        }
        qr3 qr3Var = (qr3) obj;
        return u890.j(this.a, qr3Var.a) && u890.j(this.b, qr3Var.b) && u890.j(this.c, qr3Var.c);
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
