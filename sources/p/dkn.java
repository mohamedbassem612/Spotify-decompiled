package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dkn implements Parcelable {
    public static final Parcelable.Creator<dkn> CREATOR = new rtm((byte) 24);
    public final String a;
    public final String b;
    public final List c;
    public final xk41 d;
    public final List e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dkn(String str, String str2, List list, xk41 xk41Var, int i) {
        int i2 = i & 4;
        List list2 = z6x.a;
        this(str, str2, i2 != 0 ? list2 : list, (i & 8) != 0 ? null : xk41Var, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkn)) {
            return false;
        }
        dkn dknVar = (dkn) obj;
        return u890.j(this.a, dknVar.a) && u890.j(this.b, dknVar.b) && u890.j(this.c, dknVar.c) && u890.j(this.d, dknVar.d) && u890.j(this.e, dknVar.e);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xk41 xk41Var = this.d;
        return this.e.hashCode() + ((iB + (xk41Var == null ? 0 : xk41Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        xk41 xk41Var = this.d;
        if (xk41Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xk41Var.writeToParcel(parcel, i);
        }
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((zub1) itM.next()).writeToParcel(parcel, i);
        }
    }

    public dkn(String str, String str2, List list, xk41 xk41Var, List list2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = xk41Var;
        this.e = list2;
    }
}
