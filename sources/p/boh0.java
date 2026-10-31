package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class boh0 implements Parcelable {
    public static final Parcelable.Creator<boh0> CREATOR;
    public final List a;
    public final aoh0 b;
    public final w4i1 c;
    public final String d;
    public final String e;
    public final boolean f;

    static {
        Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
        CREATOR = new hug0((byte) 20);
    }

    public boh0(List list, aoh0 aoh0Var, w4i1 w4i1Var, String str, String str2, boolean z) {
        this.a = list;
        this.b = aoh0Var;
        this.c = w4i1Var;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public static boh0 a(boh0 boh0Var, aoh0 aoh0Var) {
        return new boh0(boh0Var.a, aoh0Var, boh0Var.c, boh0Var.d, boh0Var.e, boh0Var.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boh0)) {
            return false;
        }
        boh0 boh0Var = (boh0) obj;
        return this.a.equals(boh0Var.a) && u890.j(this.b, boh0Var.b) && u890.j(this.c, boh0Var.c) && u890.j(this.d, boh0Var.d) && u890.j(this.e, boh0Var.e) && this.f == boh0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(ydh.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((vy30) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
