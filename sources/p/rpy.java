package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rpy implements Parcelable {
    public static final Parcelable.Creator<rpy> CREATOR = new jhy((byte) 9);
    public final String a;
    public final ArrayList b;

    public rpy(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpy)) {
            return false;
        }
        rpy rpyVar = (rpy) obj;
        return u890.j(this.a, rpyVar.a) && this.b.equals(rpyVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itO = xvj1.o(this.b, parcel);
        while (itO.hasNext()) {
            ((arn0) itO.next()).writeToParcel(parcel, i);
        }
    }
}
