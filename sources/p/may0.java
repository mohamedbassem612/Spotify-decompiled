package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class may0 implements oay0 {
    public static final Parcelable.Creator<may0> CREATOR = new zzx0((byte) 8);
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public may0(String str, List list, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof may0)) {
            return false;
        }
        may0 may0Var = (may0) obj;
        return u890.j(this.a, may0Var.a) && u890.j(this.b, may0Var.b) && u890.j(this.c, may0Var.c) && u890.j(this.d, may0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
