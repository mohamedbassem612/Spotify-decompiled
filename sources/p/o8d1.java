package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o8d1 extends w8d1 {
    public static final Parcelable.Creator<o8d1> CREATOR = new pxc1((byte) 17);
    public final String a;
    public final boolean b;
    public final String c;
    public final List d;

    public o8d1(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = list;
    }

    public final String a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8d1)) {
            return false;
        }
        o8d1 o8d1Var = (o8d1) obj;
        return u890.j(this.a, o8d1Var.a) && this.b == o8d1Var.b && u890.j(this.c, o8d1Var.c) && this.d.equals(o8d1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeInt(z4p1.G(((u7h) itM.next()).a));
        }
    }
}
