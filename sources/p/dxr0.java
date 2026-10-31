package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dxr0 implements Parcelable {
    public static final Parcelable.Creator<dxr0> CREATOR = new zsr0((byte) 8);
    public final mwr0 a;
    public final mwr0 b;

    public dxr0(mwr0 mwr0Var, mwr0 mwr0Var2) {
        this.a = mwr0Var;
        this.b = mwr0Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxr0)) {
            return false;
        }
        dxr0 dxr0Var = (dxr0) obj;
        return u890.j(this.a, dxr0Var.a) && u890.j(this.b, dxr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dxr0() {
        lwr0 lwr0Var = lwr0.a;
        this(lwr0Var, lwr0Var);
    }
}
