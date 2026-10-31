package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rqm0 implements Parcelable {
    public static final Parcelable.Creator<rqm0> CREATOR = new fgm0((byte) 22);
    public final String a;
    public final List b;
    public final String c;

    public rqm0(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqm0)) {
            return false;
        }
        rqm0 rqm0Var = (rqm0) obj;
        return u890.j(this.a, rqm0Var.a) && u890.j(this.b, rqm0Var.b) && u890.j(this.c, rqm0Var.c);
    }

    public final String getPageUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
    }
}
