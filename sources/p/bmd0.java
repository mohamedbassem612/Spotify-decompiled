package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class bmd0 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final amd0 Companion = new amd0();
    public static final Parcelable.Creator<bmd0> CREATOR = new lad0((byte) 28);

    public /* synthetic */ bmd0(String str, String str2, int i, String str3) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, zld0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
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
        if (!(obj instanceof bmd0)) {
            return false;
        }
        bmd0 bmd0Var = (bmd0) obj;
        return u890.j(this.a, bmd0Var.a) && u890.j(this.b, bmd0Var.b) && u890.j(this.c, bmd0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public bmd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
