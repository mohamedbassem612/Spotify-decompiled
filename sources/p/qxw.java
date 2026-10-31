package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qxw implements Parcelable {
    public static final Parcelable.Creator<qxw> CREATOR = new x7w((byte) 6);
    public final String a;
    public final List b;
    public final boolean c;

    public qxw(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxw)) {
            return false;
        }
        qxw qxwVar = (qxw) obj;
        return u890.j(this.a, qxwVar.a) && this.b.equals(qxwVar.b) && this.c == qxwVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + f4i1.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            parcel.writeString(((rxw) itM.next()).name());
        }
        parcel.writeInt(this.c ? 1 : 0);
    }
}
