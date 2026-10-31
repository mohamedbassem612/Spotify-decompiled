package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q001 implements Parcelable {
    public static final Parcelable.Creator<q001> CREATOR = new erz0((byte) 14);
    public final List a;
    public final int b;
    public final String c;
    public final String d;

    public q001(int i, String str, String str2, List list) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q001)) {
            return false;
        }
        q001 q001Var = (q001) obj;
        return this.a.equals(q001Var.a) && this.b == q001Var.b && u890.j(this.c, q001Var.c) && u890.j(this.d, q001Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((fxz0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
