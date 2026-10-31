package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yma0 extends ei90 {
    public static final Parcelable.Creator<yma0> CREATOR = new jca0((byte) 1);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;

    public yma0(String str, ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yma0)) {
            return false;
        }
        yma0 yma0Var = (yma0) obj;
        return this.a == yma0Var.a && this.b == yma0Var.b && u890.j(this.c, yma0Var.c) && this.d.equals(yma0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
    }
}
