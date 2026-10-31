package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class azl extends kzl {
    public static final Parcelable.Creator<azl> CREATOR = new pol((byte) 26);
    public final xl81 a;
    public final boolean b;
    public final String c;
    public final List d;
    public final List e;
    public final String f;

    public azl(xl81 xl81Var, boolean z, String str, ArrayList arrayList, List list, String str2) {
        this.a = xl81Var;
        this.b = z;
        this.c = str;
        this.d = arrayList;
        this.e = list;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azl)) {
            return false;
        }
        azl azlVar = (azl) obj;
        return u890.j(this.a, azlVar.a) && this.b == azlVar.b && u890.j(this.c, azlVar.c) && this.d.equals(azlVar.d) && u890.j(this.e, azlVar.e) && u890.j(this.f, azlVar.f);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + f4i1.b(f4i1.b((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
        parcel.writeStringList(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.f);
    }
}
