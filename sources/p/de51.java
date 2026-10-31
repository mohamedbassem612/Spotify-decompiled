package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class de51 extends ie51 {
    public final String b;
    public final String c;
    public static final ce51 Companion = new ce51();
    public static final Parcelable.Creator<de51> CREATOR = new uo41((byte) 29);

    public /* synthetic */ de51(int i, String str, String str2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, be51.a.getDescriptor());
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
        if (!(obj instanceof de51)) {
            return false;
        }
        de51 de51Var = (de51) obj;
        return u890.j(this.b, de51Var.b) && u890.j(this.c, de51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public de51(String str, String str2) {
        this.b = str;
        this.c = str2;
    }
}
