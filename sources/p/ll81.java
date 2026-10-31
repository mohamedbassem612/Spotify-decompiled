package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ll81 implements Parcelable {
    public static final Parcelable.Creator<ll81> CREATOR = new ro71((byte) 13);
    public final String a;
    public final int b;
    public final byte[] c;

    public ll81(int i, String str, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll81)) {
            return false;
        }
        ll81 ll81Var = (ll81) obj;
        return u890.j(this.a, ll81Var.a) && this.b == ll81Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "Ready";
        } else if (i2 == 2) {
            str = "Pending";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Unknown";
        }
        parcel.writeString(str);
        parcel.writeByteArray(this.c);
    }

    public /* synthetic */ ll81(String str) {
        this(1, str, null);
    }
}
