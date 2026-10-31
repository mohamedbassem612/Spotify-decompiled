package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nim implements Parcelable {
    public static final Parcelable.Creator<nim> CREATOR;
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final boolean g;
    public final boolean h;

    static {
        pld pldVar = vld.Companion;
        CREATOR = new ezl((byte) 13);
    }

    public nim(int i, String str, String str2, String str3, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nim)) {
            return false;
        }
        nim nimVar = (nim) obj;
        return u890.j(this.a, nimVar.a) && this.b == nimVar.b && u890.j(this.c, nimVar.c) && u890.j(this.d, nimVar.d) && u890.j(this.e, nimVar.e) && u890.j(this.f, nimVar.f) && this.g == nimVar.g && this.h == nimVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(f4i1.b(f4i1.b(cy30.d(cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.f);
        while (itM2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM2.next(), i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
