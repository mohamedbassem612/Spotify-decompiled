package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pe7 implements Parcelable {
    public static final Parcelable.Creator<pe7> CREATOR = new f67((byte) 16);
    public final String a;
    public final String b;
    public final String c;
    public final me7 d;
    public final List e;

    public pe7(String str, String str2, String str3, me7 me7Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = me7Var;
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
        if (!(obj instanceof pe7)) {
            return false;
        }
        pe7 pe7Var = (pe7) obj;
        return u890.j(this.a, pe7Var.a) && u890.j(this.b, pe7Var.b) && u890.j(this.c, pe7Var.c) && this.d == pe7Var.d && this.e.equals(pe7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
