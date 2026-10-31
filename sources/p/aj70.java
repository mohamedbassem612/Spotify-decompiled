package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aj70 extends hj70 {
    public static final Parcelable.Creator<aj70> CREATOR = new ai70((byte) 23);
    public final List c;
    public final int d;
    public final String e;

    public aj70(int i, String str, ArrayList arrayList) {
        super(8, 2);
        this.c = arrayList;
        this.d = i;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj70)) {
            return false;
        }
        aj70 aj70Var = (aj70) obj;
        return this.c.equals(aj70Var.c) && this.d == aj70Var.d && u890.j(this.e, aj70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, this.c.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
