package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tlb implements nb10 {
    public static final Parcelable.Creator<tlb> CREATOR = new mra((byte) 14);
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public tlb(int i, int i2, int i3, long j, String str) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlb)) {
            return false;
        }
        tlb tlbVar = (tlb) obj;
        return u890.j(this.a, tlbVar.a) && this.b == tlbVar.b && this.c == tlbVar.c && this.d == tlbVar.d && this.e == tlbVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + kaa0.f(this.d, ab80.k(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        String str2 = "UNRECOGNIZED";
        int i2 = this.b;
        if (i2 == 1) {
            str = "NOT_STARTED";
        } else if (i2 == 2) {
            str = "IN_PROGRESS";
        } else if (i2 == 3) {
            str = "FINISHED";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "UNRECOGNIZED";
        }
        parcel.writeString(str);
        int i3 = this.c;
        if (i3 == 1) {
            str2 = "OPEN";
        } else if (i3 == 2) {
            str2 = "LOCKED";
        } else if (i3 == 3) {
            str2 = "CAPPED";
        } else if (i3 != 4) {
            throw null;
        }
        parcel.writeString(str2);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
    }
}
