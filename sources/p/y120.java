package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y120 implements b220 {
    public static final Parcelable.Creator<y120> CREATOR = new no10((byte) 20);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public y120(int i, int i2, int i3, int i4, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y120)) {
            return false;
        }
        y120 y120Var = (y120) obj;
        return this.a == y120Var.a && this.b == y120Var.b && this.c == y120Var.c && this.d == y120Var.d && u890.j(this.e, y120Var.e) && u890.j(this.f, y120Var.f);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        String str = this.e;
        return this.f.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
