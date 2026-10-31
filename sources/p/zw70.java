package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class zw70 implements Parcelable {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public static final yw70 Companion = new yw70();
    public static final Parcelable.Creator<zw70> CREATOR = new mj70((byte) 11);

    public /* synthetic */ zw70(String str, int i, int i2, int i3, String str2) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, xw70.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
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
        if (!(obj instanceof zw70)) {
            return false;
        }
        zw70 zw70Var = (zw70) obj;
        return u890.j(this.a, zw70Var.a) && this.b == zw70Var.b && this.c == zw70Var.c && u890.j(this.d, zw70Var.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.c, kaa0.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    public zw70(int i, String str, int i2, String str2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }
}
