package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ksk implements Parcelable {
    public static final Parcelable.Creator<ksk> CREATOR = new v6h((byte) 25);
    public final String a;
    public final boolean b;
    public final le30 c;

    public ksk(String str, boolean z, le30 le30Var) {
        this.a = str;
        this.b = z;
        this.c = le30Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksk)) {
            return false;
        }
        ksk kskVar = (ksk) obj;
        return u890.j(this.a, kskVar.a) && this.b == kskVar.b && this.c == kskVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
    }
}
