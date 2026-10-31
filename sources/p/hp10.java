package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hp10 implements ip10 {
    public static final Parcelable.Creator<hp10> CREATOR = new no10((byte) 8);
    public final String a;
    public final String b;
    public final ep10 c;

    public hp10(String str, String str2, ep10 ep10Var) {
        this.a = str;
        this.b = str2;
        this.c = ep10Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp10)) {
            return false;
        }
        hp10 hp10Var = (hp10) obj;
        return u890.j(this.a, hp10Var.a) && u890.j(this.b, hp10Var.b) && u890.j(this.c, hp10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
