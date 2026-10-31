package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qic1 implements tic1 {
    public static final Parcelable.Creator<qic1> CREATOR = new y7c1((byte) 18);
    public final int a;
    public final int b;
    public final int c;

    public qic1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qic1)) {
            return false;
        }
        qic1 qic1Var = (qic1) obj;
        return this.a == qic1Var.a && this.b == qic1Var.b && this.c == qic1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ab80.k(this.b, l1d.C(this.a) * 31, 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        int i2 = this.a;
        if (i2 == 1) {
            str = "Loading";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Empty";
        }
        parcel.writeString(str);
        int i3 = this.b;
        if (i3 == 1) {
            str2 = "Popular";
        } else {
            if (i3 != 2) {
                throw null;
            }
            str2 = "Collaboration";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.c);
    }
}
