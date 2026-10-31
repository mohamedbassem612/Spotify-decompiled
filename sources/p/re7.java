package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class re7 implements Parcelable {
    public static final Parcelable.Creator<re7> CREATOR = new f67((byte) 18);
    public final String a;
    public final me7 b;
    public final List c;

    public re7(String str, me7 me7Var, List list) {
        this.a = str;
        this.b = me7Var;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re7)) {
            return false;
        }
        re7 re7Var = (re7) obj;
        return u890.j(this.a, re7Var.a) && this.b == re7Var.b && this.c.equals(re7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
    }
}
