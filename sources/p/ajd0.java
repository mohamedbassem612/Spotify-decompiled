package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class ajd0 implements Parcelable {
    public final wid0 a;
    public final bmd0 b;
    public final pkd0 c;
    public final yip0 d;
    public static final zid0 Companion = new zid0();
    public static final Parcelable.Creator<ajd0> CREATOR = new lad0((byte) 26);

    public /* synthetic */ ajd0(int i, wid0 wid0Var, bmd0 bmd0Var, pkd0 pkd0Var, yip0 yip0Var) {
        if (15 != (i & 15)) {
            o6p1.t(i, 15, yid0.a.getDescriptor());
            throw null;
        }
        this.a = wid0Var;
        this.b = bmd0Var;
        this.c = pkd0Var;
        this.d = yip0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajd0)) {
            return false;
        }
        ajd0 ajd0Var = (ajd0) obj;
        return u890.j(this.a, ajd0Var.a) && u890.j(this.b, ajd0Var.b) && u890.j(this.c, ajd0Var.c) && u890.j(this.d, ajd0Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        this.d.writeToParcel(parcel, i);
    }

    public ajd0(wid0 wid0Var, bmd0 bmd0Var, pkd0 pkd0Var, yip0 yip0Var) {
        this.a = wid0Var;
        this.b = bmd0Var;
        this.c = pkd0Var;
        this.d = yip0Var;
    }
}
