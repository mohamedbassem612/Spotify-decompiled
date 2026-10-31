package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class ib6 implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final eb6 Companion = new eb6();
    public static final Parcelable.Creator<ib6> CREATOR = new fp5((byte) 3);

    public /* synthetic */ ib6(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, cb6.a.getDescriptor());
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
        if (!(obj instanceof ib6)) {
            return false;
        }
        ib6 ib6Var = (ib6) obj;
        return u890.j(this.a, ib6Var.a) && u890.j(this.b, ib6Var.b) && u890.j(this.c, ib6Var.c);
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

    public ib6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
