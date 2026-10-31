package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kfm0 implements ffm0 {
    public static final Parcelable.Creator<kfm0> CREATOR = new w9k0((byte) 18);
    public final p061 a;
    public final int b;

    public kfm0(p061 p061Var, int i) {
        this.a = p061Var;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final p061 e1() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfm0)) {
            return false;
        }
        kfm0 kfm0Var = (kfm0) obj;
        return u890.j(this.a, kfm0Var.a) && this.b == kfm0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
    }
}
