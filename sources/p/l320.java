package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l320 implements n320 {
    public static final Parcelable.Creator<l320> CREATOR = new u220((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final String f;

    public l320(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l320)) {
            return false;
        }
        l320 l320Var = (l320) obj;
        return u890.j(this.a, l320Var.a) && u890.j(this.b, l320Var.b) && u890.j(this.c, l320Var.c) && u890.j(this.d, l320Var.d) && this.e.equals(l320Var.e) && u890.j(this.f, l320Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iF = p3d1.f(this.e, cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31);
        String str2 = this.f;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itO = xvj1.o(this.e, parcel);
        while (itO.hasNext()) {
            ((k320) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f);
    }
}
