package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qr7 extends c871 {
    public static final Parcelable.Creator<qr7> CREATOR = new f67((byte) 27);
    public final jlw0 a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public qr7(jlw0 jlw0Var, int i, int i2, String str, String str2, String str3) {
        this.a = jlw0Var;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr7)) {
            return false;
        }
        qr7 qr7Var = (qr7) obj;
        return u890.j(this.a, qr7Var.a) && this.b == qr7Var.b && this.c == qr7Var.c && u890.j(this.d, qr7Var.d) && u890.j(this.e, qr7Var.e) && u890.j(this.f, qr7Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
