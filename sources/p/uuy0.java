package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uuy0 implements Parcelable {
    public static final Parcelable.Creator<uuy0> CREATOR = new zzx0((byte) 28);
    public final String a;
    public final int b;
    public final List c;
    public final String d;

    public uuy0(int i, String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
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
        if (!(obj instanceof uuy0)) {
            return false;
        }
        uuy0 uuy0Var = (uuy0) obj;
        return u890.j(this.a, uuy0Var.a) && this.b == uuy0Var.b && this.c.equals(uuy0Var.c) && u890.j(this.d, uuy0Var.d);
    }

    public final int hashCode() {
        int iB = f4i1.b(ab80.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        int i2 = this.b;
        if (i2 == 1) {
            str = "PENDING";
        } else if (i2 == 2) {
            str = "PURCHASED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "UNSPECIFIED_STATE";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
    }
}
