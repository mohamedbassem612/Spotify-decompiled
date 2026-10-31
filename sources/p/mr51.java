package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mr51 implements Parcelable {
    public static final Parcelable.Creator<mr51> CREATOR = new ge51((byte) 15);
    public final List a;
    public final String b;
    public final Integer c;

    public mr51(Integer num, String str, List list) {
        this.a = list;
        this.b = str;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr51)) {
            return false;
        }
        mr51 mr51Var = (mr51) obj;
        return this.a.equals(mr51Var.a) && u890.j(this.b, mr51Var.b) && u890.j(this.c, mr51Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iD + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((c220) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }
}
