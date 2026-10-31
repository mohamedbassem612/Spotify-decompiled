package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kse1 implements ose1 {
    public static final Parcelable.Creator<kse1> CREATOR = new pwd1((byte) 29);
    public final boolean a;
    public final boolean b;

    public kse1(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // p.ose1
    public final boolean I() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kse1)) {
            return false;
        }
        kse1 kse1Var = (kse1) obj;
        return this.a == kse1Var.a && this.b == kse1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    @Override // p.ose1
    public final boolean q0() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
