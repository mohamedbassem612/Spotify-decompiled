package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y8e implements knt, Parcelable {
    public static final Parcelable.Creator<y8e> CREATOR = new xud((byte) 16);
    public final String a;
    public final String b;
    public final List c;
    public final int d;

    public y8e(int i, String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8e)) {
            return false;
        }
        y8e y8eVar = (y8e) obj;
        return u890.j(this.a, y8eVar.a) && u890.j(this.b, y8eVar.b) && this.c.equals(y8eVar.c) && this.d == y8eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((x8e) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d);
    }
}
