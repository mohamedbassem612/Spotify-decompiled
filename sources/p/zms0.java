package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zms0 implements Parcelable {
    public static final Parcelable.Creator<zms0> CREATOR = new bis0((byte) 8);
    public final String a;
    public final cns0 b;

    public zms0(String str, cns0 cns0Var) {
        this.a = str;
        this.b = cns0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zms0)) {
            return false;
        }
        zms0 zms0Var = (zms0) obj;
        return u890.j(this.a, zms0Var.a) && this.b == zms0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.name());
    }
}
