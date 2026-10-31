package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class umo0 extends vmo0 {
    public final ybi1 b;
    public final nmo0 c;
    public static final tmo0 Companion = new tmo0();
    public static final Parcelable.Creator<umo0> CREATOR = new b4o0((byte) 18);

    public /* synthetic */ umo0(int i, ybi1 ybi1Var, nmo0 nmo0Var) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, smo0.a.getDescriptor());
            throw null;
        }
        this.b = ybi1Var;
        this.c = nmo0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umo0)) {
            return false;
        }
        umo0 umo0Var = (umo0) obj;
        return u890.j(this.b, umo0Var.b) && u890.j(this.c, umo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
    }

    public umo0(ybi1 ybi1Var, nmo0 nmo0Var) {
        this.b = ybi1Var;
        this.c = nmo0Var;
    }
}
