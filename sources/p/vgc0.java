package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vgc0 implements Parcelable {
    public static final Parcelable.Creator<vgc0> CREATOR = new v5c0((byte) 12);
    public final String a;
    public final Integer b;
    public final ugc0 c;

    public vgc0(String str, Integer num, ugc0 ugc0Var) {
        this.a = str;
        this.b = num;
        this.c = ugc0Var;
        if (str == null && num == null) {
            hhg1.n("A message is required");
            throw null;
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
        if (!(obj instanceof vgc0)) {
            return false;
        }
        vgc0 vgc0Var = (vgc0) obj;
        return u890.j(this.a, vgc0Var.a) && u890.j(this.b, vgc0Var.b) && u890.j(this.c, vgc0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeParcelable(this.c, i);
    }

    public /* synthetic */ vgc0(Integer num, ugc0 ugc0Var, int i) {
        this((i & 1) != 0 ? null : "Child account", (i & 2) != 0 ? null : num, ugc0Var);
    }
}
