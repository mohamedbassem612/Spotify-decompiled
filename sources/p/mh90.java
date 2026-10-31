package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class mh90 extends bi90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public static final lh90 Companion = new lh90();
    public static final Parcelable.Creator<mh90> CREATOR = new qg90((byte) 7);
    public static final znb0[] g = {null, null, null, null, null, dm5.S(2, lx70.R0)};

    public mh90(int i, String str, String str2, String str3, String str4, List list, boolean z) {
        if (63 != (i & 63)) {
            o6p1.t(i, 63, kh90.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh90)) {
            return false;
        }
        mh90 mh90Var = (mh90) obj;
        return u890.j(this.a, mh90Var.a) && u890.j(this.b, mh90Var.b) && u890.j(this.c, mh90Var.c) && u890.j(this.d, mh90Var.d) && this.e == mh90Var.e && u890.j(this.f, mh90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }

    public mh90(String str, String str2, String str3, String str4, boolean z, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = arrayList;
    }
}
