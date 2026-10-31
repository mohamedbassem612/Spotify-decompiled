package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jgm0 implements Parcelable {
    public static final Parcelable.Creator<jgm0> CREATOR = new fgm0((byte) 5);
    public final String a;
    public final String b;

    public jgm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgm0)) {
            return false;
        }
        jgm0 jgm0Var = (jgm0) obj;
        return u890.j(this.a, jgm0Var.a) && u890.j(this.b, jgm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
