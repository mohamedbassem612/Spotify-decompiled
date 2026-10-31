package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j3f0 extends l3f0 {
    public static final Parcelable.Creator<j3f0> CREATOR = new rwe0((byte) 28);
    public final String a;
    public final String b;

    public j3f0(String str, String str2) {
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
        if (!(obj instanceof j3f0)) {
            return false;
        }
        j3f0 j3f0Var = (j3f0) obj;
        return u890.j(this.a, j3f0Var.a) && u890.j(this.b, j3f0Var.b);
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
