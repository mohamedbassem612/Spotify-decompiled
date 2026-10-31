package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pu6 implements Parcelable {
    public static final Parcelable.Creator<pu6> CREATOR = new fp5((byte) 17);
    public final String a;
    public final String b;
    public final List c;

    public pu6(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final String d() {
        return cy30.p("spotify:artist:", this.a, ":catalog-category:", this.b, "");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu6)) {
            return false;
        }
        pu6 pu6Var = (pu6) obj;
        return u890.j(this.a, pu6Var.a) && u890.j(this.b, pu6Var.b) && this.c.equals(pu6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((b9e) itM.next()).writeToParcel(parcel, i);
        }
    }
}
