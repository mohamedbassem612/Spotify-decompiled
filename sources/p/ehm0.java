package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ehm0 implements Parcelable {
    public static final Parcelable.Creator<ehm0> CREATOR = new w9k0((byte) 27);
    public final String a;
    public final List b;
    public final int c;

    public ehm0(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    public static ehm0 a(ehm0 ehm0Var, String str, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = ehm0Var.a;
        }
        if ((i2 & 2) != 0) {
            list = ehm0Var.b;
        }
        if ((i2 & 4) != 0) {
            i = ehm0Var.c;
        }
        return new ehm0(str, list, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehm0)) {
            return false;
        }
        ehm0 ehm0Var = (ehm0) obj;
        return u890.j(this.a, ehm0Var.a) && u890.j(this.b, ehm0Var.b) && this.c == ehm0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((ow01) itM.next()).writeToParcel(parcel, i);
        }
        int i2 = this.c;
        if (i2 == 1) {
            str = "Error";
        } else if (i2 == 2) {
            str = "Loaded";
        } else if (i2 == 3) {
            str = "Loading";
        } else {
            if (i2 != 4) {
                throw null;
            }
            str = "PendingLoad";
        }
        parcel.writeString(str);
    }

    public /* synthetic */ ehm0() {
        this("", z6x.a, 4);
    }
}
