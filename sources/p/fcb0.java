package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fcb0 implements Parcelable {
    public static final Parcelable.Creator<fcb0> CREATOR = new jca0((byte) 21);
    public final List a;
    public final String b;
    public final int c;

    public fcb0(List list, String str, int i) {
        this.a = list;
        this.b = str;
        this.c = i;
        if (list.isEmpty()) {
            hhg1.n("languages must not be empty");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcb0)) {
            return false;
        }
        fcb0 fcb0Var = (fcb0) obj;
        return this.a.equals(fcb0Var.a) && u890.j(this.b, fcb0Var.b) && this.c == fcb0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((nbb0) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b);
        int i2 = this.c;
        if (i2 == 1) {
            str = "TYPED";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LEGACY_CALLBACK";
        }
        parcel.writeString(str);
    }
}
