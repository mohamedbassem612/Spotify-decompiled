package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k3f0 extends l3f0 {
    public static final Parcelable.Creator<k3f0> CREATOR = new rwe0((byte) 29);
    public final String a;
    public final String b;

    public k3f0(String str, String str2) {
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
        if (!(obj instanceof k3f0)) {
            return false;
        }
        k3f0 k3f0Var = (k3f0) obj;
        return u890.j(this.a, k3f0Var.a) && u890.j(this.b, k3f0Var.b);
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
