package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mfm1 implements Parcelable {
    public static final Parcelable.Creator<mfm1> CREATOR = new lfm1((byte) 0);
    public final String a;
    public final String b;
    public final Map c;

    public mfm1(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfm1)) {
            return false;
        }
        mfm1 mfm1Var = (mfm1) obj;
        return u890.j(this.a, mfm1Var.a) && u890.j(this.b, mfm1Var.b) && this.c.equals(mfm1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itJ = xcg1.j(parcel, this.c);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
