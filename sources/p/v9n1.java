package p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class v9n1 extends u9 {
    public static final Parcelable.Creator<v9n1> CREATOR = new e9n1((byte) 6);
    public final int a;
    public final IBinder b;
    public final lal c;
    public final boolean d;
    public final boolean e;

    public v9n1(int i, IBinder iBinder, lal lalVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = lalVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9n1)) {
            return false;
        }
        v9n1 v9n1Var = (v9n1) obj;
        if (!this.c.equals(v9n1Var.c)) {
            return false;
        }
        IBinder iBinder = this.b;
        zf70 zf70VarB1 = iBinder == null ? null : ok.b1(iBinder);
        IBinder iBinder2 = v9n1Var.b;
        return k8p1.h(zf70VarB1, iBinder2 != null ? ok.b1(iBinder2) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.y(parcel, 2, this.b);
        j541.E(parcel, 3, this.c, i);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j541.M(iL, parcel);
    }
}
