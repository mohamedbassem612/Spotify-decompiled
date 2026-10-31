package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qe7 implements Parcelable {
    public static final Parcelable.Creator<qe7> CREATOR = new f67((byte) 17);
    public final List a;
    public final String b;
    public final tv80 c;

    public qe7(String str, List list, tv80 tv80Var) {
        this.a = list;
        this.b = str;
        this.c = tv80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe7)) {
            return false;
        }
        qe7 qe7Var = (qe7) obj;
        return u890.j(this.a, qe7Var.a) && u890.j(this.b, qe7Var.b) && u890.j(this.c, qe7Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.c;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
