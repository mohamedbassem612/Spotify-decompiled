package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class hq70 implements Parcelable {
    public final String a;
    public final int b;
    public final int c;
    public static final sp70 Companion = new sp70();
    public static final Parcelable.Creator<hq70> CREATOR = new mj70((byte) 1);

    public /* synthetic */ hq70(int i, int i2, int i3, String str) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, jp70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq70)) {
            return false;
        }
        hq70 hq70Var = (hq70) obj;
        return u890.j(this.a, hq70Var.a) && this.b == hq70Var.b && this.c == hq70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public hq70(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }
}
