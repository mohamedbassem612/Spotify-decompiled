package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zsh0 implements Parcelable {
    public static final Parcelable.Creator<zsh0> CREATOR = new hug0((byte) 27);
    public final int a;
    public final int b;

    public /* synthetic */ zsh0(int i, int i2, int i3) {
        this(10, (i2 & 2) != 0 ? 0 : i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsh0)) {
            return false;
        }
        zsh0 zsh0Var = (zsh0) obj;
        return this.a == zsh0Var.a && this.b == zsh0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public zsh0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
