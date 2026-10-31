package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qp20 implements Parcelable {
    public static final Parcelable.Creator<qp20> CREATOR = new qe20((byte) 19);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final String g;

    public qp20(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = arrayList;
        this.g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp20)) {
            return false;
        }
        qp20 qp20Var = (qp20) obj;
        return u890.j(this.a, qp20Var.a) && u890.j(this.b, qp20Var.b) && u890.j(this.c, qp20Var.c) && u890.j(this.d, qp20Var.d) && u890.j(this.e, qp20Var.e) && this.f.equals(qp20Var.f) && u890.j(this.g, qp20Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iF = p3d1.f(this.f, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.g;
        return iF + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itO = xvj1.o(this.f, parcel);
        while (itO.hasNext()) {
            ((s7t0) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
    }
}
