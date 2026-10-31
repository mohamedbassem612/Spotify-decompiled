package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xgc0 implements Parcelable {
    public static final Parcelable.Creator<xgc0> CREATOR = new v5c0((byte) 15);
    public final int a;
    public final vgc0 b;
    public final boolean c;

    public xgc0(int i, vgc0 vgc0Var, boolean z) {
        this.a = i;
        this.b = vgc0Var;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xgc0)) {
            return false;
        }
        xgc0 xgc0Var = (xgc0) obj;
        return this.a == xgc0Var.a && u890.j(this.b, xgc0Var.b) && this.c == xgc0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
