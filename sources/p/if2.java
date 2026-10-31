package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class if2 implements Parcelable {
    public static final Parcelable.Creator<if2> CREATOR = new ue2((byte) 2);
    public final h8b a;
    public final Integer b;
    public final boolean c;

    public if2(h8b h8bVar, Integer num, boolean z) {
        this.a = h8bVar;
        this.b = num;
        this.c = z;
    }

    public final boolean a() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return this.a == if2Var.a && u890.j(this.b, if2Var.b) && this.c == if2Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
