package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class nmo0 extends vmo0 {
    public final String b;
    public final String c;
    public static final mmo0 Companion = new mmo0();
    public static final Parcelable.Creator<nmo0> CREATOR = new b4o0((byte) 15);

    public /* synthetic */ nmo0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, lmo0.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmo0)) {
            return false;
        }
        nmo0 nmo0Var = (nmo0) obj;
        return u890.j(this.b, nmo0Var.b) && u890.j(this.c, nmo0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public nmo0(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
