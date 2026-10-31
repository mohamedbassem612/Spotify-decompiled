package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class ywe1 extends mxe1 {
    public final String b;
    public final long c;
    public final int d;
    public static final xwe1 Companion = new xwe1();
    public static final Parcelable.Creator<ywe1> CREATOR = new lse1(9);

    public /* synthetic */ ywe1(int i, long j, String str, int i2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, wwe1.a.getDescriptor());
            throw null;
        }
        this.b = str;
        this.c = (i & 2) == 0 ? 0L : j;
        if ((i & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywe1)) {
            return false;
        }
        ywe1 ywe1Var = (ywe1) obj;
        return u890.j(this.b, ywe1Var.b) && this.c == ywe1Var.c && this.d == ywe1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + cy30.f(this.b.hashCode() * 31, this.c, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeInt(this.d);
    }

    public ywe1(long j, int i, String str) {
        this.b = str;
        this.c = j;
        this.d = i;
    }
}
