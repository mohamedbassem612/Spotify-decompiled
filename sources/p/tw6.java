package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tw6 implements Parcelable {
    public static final Parcelable.Creator<tw6> CREATOR = new fp5((byte) 22);
    public final String a;
    public final String b;
    public final String c;
    public final rha1 d;
    public final List e;

    public tw6(String str, String str2, String str3, rha1 rha1Var, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rha1Var;
        this.e = list;
    }

    public final String d() {
        return cy30.p("spotify:artist:", this.a, ":catalog-sort:", this.b, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw6)) {
            return false;
        }
        tw6 tw6Var = (tw6) obj;
        return u890.j(this.a, tw6Var.a) && u890.j(this.b, tw6Var.b) && u890.j(this.c, tw6Var.c) && this.d == tw6Var.d && u890.j(this.e, tw6Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        rha1 rha1Var = this.d;
        return this.e.hashCode() + ((iHashCode + (rha1Var != null ? rha1Var.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        rha1 rha1Var = this.d;
        if (rha1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rha1Var.name());
        }
        Iterator itM = kk0.m(parcel, this.e);
        while (itM.hasNext()) {
            ((cia1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
