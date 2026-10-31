package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d360 implements knt, Parcelable {
    public static final Parcelable.Creator<d360> CREATOR = new xk50((byte) 12);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final ArrayList h;

    public d360(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = str6;
        this.h = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d360)) {
            return false;
        }
        d360 d360Var = (d360) obj;
        return u890.j(this.a, d360Var.a) && u890.j(this.b, d360Var.b) && u890.j(this.c, d360Var.c) && u890.j(this.d, d360Var.d) && u890.j(this.e, d360Var.e) && this.f == d360Var.f && u890.j(this.g, d360Var.g) && this.h.equals(d360Var.h);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.h.hashCode() + cy30.d(kaa0.f(this.f, (iD + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        Iterator itO = xvj1.o(this.h, parcel);
        while (itO.hasNext()) {
            ((a4g) itO.next()).writeToParcel(parcel, i);
        }
    }
}
