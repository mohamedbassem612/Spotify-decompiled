package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vx61 implements wx61 {
    public static final Parcelable.Creator<vx61> CREATOR = new hs61((byte) 9);
    public final tv80 a;
    public final long b;
    public final wls0 c;

    public vx61(tv80 tv80Var, long j, wls0 wls0Var) {
        this.a = tv80Var;
        this.b = j;
        this.c = wls0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx61)) {
            return false;
        }
        vx61 vx61Var = (vx61) obj;
        return u890.j(this.a, vx61Var.a) && jfv.f(this.b, vx61Var.b) && this.c == vx61Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ytw0 ytw0Var = jfv.b;
        return this.c.hashCode() + cy30.f(iHashCode, this.b, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeLong(this.b);
        parcel.writeString(this.c.name());
    }
}
