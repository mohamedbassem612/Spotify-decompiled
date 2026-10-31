package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zgk0 implements Parcelable {
    public static final Parcelable.Creator<zgk0> CREATOR = new w9k0((byte) 3);
    public final List a;
    public final List b;
    public final List c;
    public final String d;
    public final dub1 e;
    public final boolean f;

    public zgk0(List list, List list2, List list3, String str, dub1 dub1Var, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = str;
        this.e = dub1Var;
        this.f = z;
    }

    public static zgk0 a(zgk0 zgk0Var, ArrayList arrayList, String str, dub1 dub1Var, boolean z, int i) {
        List list = zgk0Var.a;
        List list2 = zgk0Var.b;
        List list3 = arrayList;
        if ((i & 4) != 0) {
            list3 = zgk0Var.c;
        }
        List list4 = list3;
        if ((i & 8) != 0) {
            str = zgk0Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            dub1Var = zgk0Var.e;
        }
        dub1 dub1Var2 = dub1Var;
        if ((i & 32) != 0) {
            z = zgk0Var.f;
        }
        zgk0Var.getClass();
        return new zgk0(list, list2, list4, str2, dub1Var2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgk0)) {
            return false;
        }
        zgk0 zgk0Var = (zgk0) obj;
        return u890.j(this.a, zgk0Var.a) && u890.j(this.b, zgk0Var.b) && u890.j(this.c, zgk0Var.c) && u890.j(this.d, zgk0Var.d) && u890.j(this.e, zgk0Var.e) && this.f == zgk0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + cy30.d(f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((di90) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
