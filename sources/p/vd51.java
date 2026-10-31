package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class vd51 extends ie51 {
    public final String b;
    public final String c;
    public static final ud51 Companion = new ud51();
    public static final Parcelable.Creator<vd51> CREATOR = new uo41((byte) 27);

    public /* synthetic */ vd51(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, td51.a.getDescriptor());
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
        if (!(obj instanceof vd51)) {
            return false;
        }
        vd51 vd51Var = (vd51) obj;
        return u890.j(this.b, vd51Var.b) && u890.j(this.c, vd51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public vd51(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
