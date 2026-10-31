package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u850 implements Parcelable {
    public static final Parcelable.Creator<u850> CREATOR = new n750((byte) 6);
    public final boolean a;
    public final v850 b;
    public final Integer c;

    public u850(boolean z, v850 v850Var, Integer num) {
        this.a = z;
        this.b = v850Var;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u850)) {
            return false;
        }
        u850 u850Var = (u850) obj;
        return this.a == u850Var.a && this.b == u850Var.b && u890.j(this.c, u850Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b.name());
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
