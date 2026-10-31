package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wl80 implements Parcelable {
    public static final Parcelable.Creator<wl80> CREATOR = new mj70((byte) 29);
    public final int a;
    public final int b;
    public final vl80 c;
    public final vl80 d;
    public final int e;

    public wl80(int i, int i2, vl80 vl80Var, vl80 vl80Var2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = vl80Var;
        this.d = vl80Var2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl80)) {
            return false;
        }
        wl80 wl80Var = (wl80) obj;
        return this.a == wl80Var.a && this.b == wl80Var.b && u890.j(this.c, wl80Var.c) && u890.j(this.d, wl80Var.d) && this.e == wl80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
    }
}
