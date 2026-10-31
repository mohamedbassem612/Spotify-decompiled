package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q9e implements knt, Parcelable {
    public static final Parcelable.Creator<q9e> CREATOR = new xud((byte) 19);
    public final String a;
    public final List b;
    public final int c;

    public q9e(String str, List list, int i) {
        this.a = str;
        this.b = list;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9e)) {
            return false;
        }
        q9e q9eVar = (q9e) obj;
        return u890.j(this.a, q9eVar.a) && this.b.equals(q9eVar.b) && this.c == q9eVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((p9e) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c);
    }
}
