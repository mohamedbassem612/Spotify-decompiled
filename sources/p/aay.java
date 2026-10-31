package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class aay implements Parcelable {
    public static final Parcelable.Creator<aay> CREATOR = new utx((byte) 15);
    public final String a;
    public final long b;
    public final String c;
    public final List d;

    public aay(String str, long j, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aay)) {
            return false;
        }
        aay aayVar = (aay) obj;
        return u890.j(this.a, aayVar.a) && this.b == aayVar.b && u890.j(this.c, aayVar.c) && this.d.equals(aayVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.f(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            parcel.writeInt(((Number) itM.next()).intValue());
        }
    }
}
