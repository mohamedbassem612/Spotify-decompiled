package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t39 implements Parcelable {
    public static final Parcelable.Creator<t39> CREATOR = new so8((byte) 7);
    public final String a;
    public final ArrayList b;
    public final int c;
    public final boolean d;

    public t39(String str, ArrayList arrayList, int i, boolean z) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t39)) {
            return false;
        }
        t39 t39Var = (t39) obj;
        return u890.j(this.a, t39Var.a) && this.b.equals(t39Var.b) && this.c == t39Var.c && this.d == t39Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, p3d1.f(this.b, this.a.hashCode() * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((gp51) itO.next()).writeToParcel(parcel, i);
        }
        int i2 = this.c;
        if (i2 == 1) {
            str = "NEW";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "RECENT";
        }
        parcel.writeString(str);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
