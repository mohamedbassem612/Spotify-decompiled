package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o4z0 implements Parcelable {
    public static final Parcelable.Creator<o4z0> CREATOR = new j1z0((byte) 10);
    public final int a;
    public final List b;
    public final String c;
    public final boolean d;

    public o4z0(int i, String str, List list, boolean z) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = z;
    }

    public static o4z0 a(o4z0 o4z0Var, ArrayList arrayList, String str, boolean z, int i) {
        int i2 = o4z0Var.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = o4z0Var.b;
        }
        if ((i & 4) != 0) {
            str = o4z0Var.c;
        }
        if ((i & 8) != 0) {
            z = o4z0Var.d;
        }
        o4z0Var.getClass();
        return new o4z0(i2, str, list, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4z0)) {
            return false;
        }
        o4z0 o4z0Var = (o4z0) obj;
        return this.a == o4z0Var.a && this.b.equals(o4z0Var.b) && u890.j(this.c, o4z0Var.c) && this.d == o4z0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
