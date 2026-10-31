package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b3f0 extends l3f0 {
    public static final Parcelable.Creator<b3f0> CREATOR = new rwe0((byte) 20);
    public final p450 a;
    public final String b;
    public final String c;

    public b3f0(p450 p450Var, String str, String str2) {
        this.a = p450Var;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3f0)) {
            return false;
        }
        b3f0 b3f0Var = (b3f0) obj;
        return u890.j(this.a, b3f0Var.a) && u890.j(this.b, b3f0Var.b) && u890.j(this.c, b3f0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
