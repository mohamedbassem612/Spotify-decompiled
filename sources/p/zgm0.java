package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zgm0 implements Parcelable {
    public static final Parcelable.Creator<zgm0> CREATOR = new w9k0((byte) 24);
    public final String a;
    public final boolean b;

    public zgm0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgm0)) {
            return false;
        }
        zgm0 zgm0Var = (zgm0) obj;
        return u890.j(this.a, zgm0Var.a) && this.b == zgm0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
