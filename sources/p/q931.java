package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q931 implements Parcelable {
    public static final Parcelable.Creator<q931> CREATOR = new s231((byte) 6);
    public final String a;
    public final tv80 b;
    public final boolean c;

    public q931(String str, tv80 tv80Var, boolean z) {
        this.a = str;
        this.b = tv80Var;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q931)) {
            return false;
        }
        q931 q931Var = (q931) obj;
        return u890.j(this.a, q931Var.a) && u890.j(this.b, q931Var.b) && this.c == q931Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        tv80 tv80Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
