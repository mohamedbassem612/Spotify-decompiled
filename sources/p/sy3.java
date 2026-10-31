package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class sy3 implements nb10 {
    public static final Parcelable.Creator<sy3> CREATOR = new i93((byte) 17);
    public final aey a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public sy3(aey aeyVar, int i, int i2, int i3, String str) {
        this.a = aeyVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy3)) {
            return false;
        }
        sy3 sy3Var = (sy3) obj;
        return this.a == sy3Var.a && this.b == sy3Var.b && this.c == sy3Var.c && this.d == sy3Var.d && u890.j(this.e, sy3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
