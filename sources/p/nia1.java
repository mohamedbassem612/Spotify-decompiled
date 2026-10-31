package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nia1 implements Parcelable {
    public static final Parcelable.Creator<nia1> CREATOR = new yx81((byte) 28);
    public final String a;
    public final boolean b;
    public final nia1 c;

    public /* synthetic */ nia1(String str, nia1 nia1Var, int i) {
        this(str, (i & 2) == 0, (i & 4) != 0 ? null : nia1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nia1)) {
            return false;
        }
        nia1 nia1Var = (nia1) obj;
        return u890.j(this.a, nia1Var.a) && this.b == nia1Var.b && u890.j(this.c, nia1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        nia1 nia1Var = this.c;
        return iG + (nia1Var == null ? 0 : nia1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        nia1 nia1Var = this.c;
        if (nia1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nia1Var.writeToParcel(parcel, i);
        }
    }

    public nia1(String str, boolean z, nia1 nia1Var) {
        this.a = str;
        this.b = z;
        this.c = nia1Var;
    }
}
