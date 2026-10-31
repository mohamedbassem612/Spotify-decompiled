package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cmt implements Parcelable {
    public static final Parcelable.Creator<cmt> CREATOR = new qms((byte) 20);
    public final List a;
    public final int b;

    public cmt(List list, int i) {
        this.a = list;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmt)) {
            return false;
        }
        cmt cmtVar = (cmt) obj;
        return u890.j(this.a, cmtVar.a) && this.b == cmtVar.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        int i2 = this.b;
        if (i2 == 1) {
            str = "PLATFORM";
        } else if (i2 == 2) {
            str = "KEEP";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "SMART";
        }
        parcel.writeString(str);
    }
}
