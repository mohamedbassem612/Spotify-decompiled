package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ebn implements Parcelable {
    public static final Parcelable.Creator<ebn> CREATOR = new rtm((byte) 18);
    public final van a;
    public final String b;
    public final List c;

    public ebn(van vanVar, String str, List list) {
        this.a = vanVar;
        this.b = str;
        this.c = list;
    }

    public static ebn a(ebn ebnVar, String str, ArrayList arrayList, int i) {
        van vanVar = ebnVar.a;
        if ((i & 2) != 0) {
            str = ebnVar.b;
        }
        return new ebn(vanVar, str, arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebn)) {
            return false;
        }
        ebn ebnVar = (ebn) obj;
        return u890.j(this.a, ebnVar.a) && u890.j(this.b, ebnVar.b) && u890.j(this.c, ebnVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            ((kbn) itM.next()).writeToParcel(parcel, i);
        }
    }
}
