package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jku0 implements Parcelable {
    public static final Parcelable.Creator<jku0> CREATOR = new brt0((byte) 18);
    public final boolean a;
    public final String b;
    public final wls0 c;
    public final String d;

    public jku0(String str, String str2, wls0 wls0Var, boolean z) {
        this.a = z;
        this.b = str;
        this.c = wls0Var;
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
        if (!(obj instanceof jku0)) {
            return false;
        }
        jku0 jku0Var = (jku0) obj;
        return this.a == jku0Var.a && u890.j(this.b, jku0Var.b) && this.c == jku0Var.c && u890.j(this.d, jku0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
    }
}
