package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eyk1 implements Parcelable {
    public static final Parcelable.Creator<eyk1> CREATOR = new ylk1(8);
    public final String a;
    public final String b;
    public final List c;
    public final int d;
    public final String e;
    public final String f;

    public eyk1(int i, String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = str3;
        this.f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyk1)) {
            return false;
        }
        eyk1 eyk1Var = (eyk1) obj;
        return u890.j(this.a, eyk1Var.a) && u890.j(this.b, eyk1Var.b) && u890.j(this.c, eyk1Var.c) && this.d == eyk1Var.d && u890.j(this.e, eyk1Var.e) && u890.j(this.f, eyk1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(kaa0.f(this.d, f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeValue(itM.next());
        }
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
