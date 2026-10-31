package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class pkd0 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final okd0 Companion = new okd0();
    public static final Parcelable.Creator<pkd0> CREATOR = new lad0((byte) 27);

    public /* synthetic */ pkd0(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, nkd0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof pkd0)) {
            return false;
        }
        pkd0 pkd0Var = (pkd0) obj;
        return u890.j(this.a, pkd0Var.a) && u890.j(this.b, pkd0Var.b) && u890.j(this.c, pkd0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public pkd0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
