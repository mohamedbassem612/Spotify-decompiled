package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jv6 implements Parcelable {
    public static final Parcelable.Creator<jv6> CREATOR = new fp5((byte) 19);
    public final String a;
    public final String b;
    public final Integer c;
    public final List d;

    public jv6(String str, String str2, Integer num, List list) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = list;
    }

    public final String d() {
        return cy30.p("spotify:artist:", this.a, ":catalog-filter:", this.b, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv6)) {
            return false;
        }
        jv6 jv6Var = (jv6) obj;
        return u890.j(this.a, jv6Var.a) && u890.j(this.b, jv6Var.b) && u890.j(this.c, jv6Var.c) && u890.j(this.d, jv6Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return this.d.hashCode() + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((cb20) itM.next()).writeToParcel(parcel, i);
        }
    }
}
