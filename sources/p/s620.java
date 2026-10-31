package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s620 implements Parcelable {
    public static final Parcelable.Creator<s620> CREATOR = new u220((byte) 10);
    public final int a;
    public final List b;
    public final List c;

    public s620(int i, List list, List list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s620)) {
            return false;
        }
        s620 s620Var = (s620) obj;
        return this.a == s620Var.a && u890.j(this.b, s620Var.b) && u890.j(this.c, s620Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(l1d.C(this.a) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "SINGLE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "MULTIPLE";
        }
        parcel.writeString(str);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((qa20) itM.next()).writeToParcel(parcel, i);
        }
        Iterator itM2 = kk0.m(parcel, this.c);
        while (itM2.hasNext()) {
            ((uha1) itM2.next()).writeToParcel(parcel, i);
        }
    }
}
