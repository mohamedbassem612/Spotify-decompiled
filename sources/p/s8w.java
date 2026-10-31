package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8w implements Parcelable {
    public static final Parcelable.Creator<s8w> CREATOR = new x7w((byte) 3);
    public final int a;
    public final int b;
    public final String c;
    public final yxa0 d;

    public s8w(int i, int i2, String str, yxa0 yxa0Var) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = yxa0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8w)) {
            return false;
        }
        s8w s8wVar = (s8w) obj;
        return this.a == s8wVar.a && this.b == s8wVar.b && u890.j(this.c, s8wVar.c) && u890.j(this.d, s8wVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
