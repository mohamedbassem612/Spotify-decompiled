package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oce1 implements Parcelable {
    public static final Parcelable.Creator<oce1> CREATOR = new pwd1((byte) 9);
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final List e;

    public oce1(long j, long j2, String str, String str2, List list) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oce1)) {
            return false;
        }
        oce1 oce1Var = (oce1) obj;
        return this.a == oce1Var.a && this.b == oce1Var.b && u890.j(this.c, oce1Var.c) && u890.j(this.d, oce1Var.d) && this.e.equals(oce1Var.e);
    }

    public final int hashCode() {
        int iF = cy30.f(Long.hashCode(this.a) * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + cy30.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((h960) itM.next()).writeToParcel(parcel, i);
        }
    }
}
