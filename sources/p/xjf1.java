package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xjf1 implements Parcelable {
    public static final Parcelable.Creator<xjf1> CREATOR = new r8f1((byte) 7);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public xjf1(String str, String str2, String str3, String str4, String str5, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
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
        if (!(obj instanceof xjf1)) {
            return false;
        }
        xjf1 xjf1Var = (xjf1) obj;
        return u890.j(this.a, xjf1Var.a) && u890.j(this.b, xjf1Var.b) && u890.j(this.c, xjf1Var.c) && u890.j(this.d, xjf1Var.d) && u890.j(this.e, xjf1Var.e) && this.f.equals(xjf1Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator itM = kk0.m(parcel, this.f);
        while (itM.hasNext()) {
            ((rjf1) itM.next()).writeToParcel(parcel, i);
        }
    }
}
