package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pn10 implements Parcelable {
    public static final Parcelable.Creator<pn10> CREATOR = new qn00((byte) 25);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final LinkedHashMap e;

    public pn10(String str, String str2, List list, String str3, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn10)) {
            return false;
        }
        pn10 pn10Var = (pn10) obj;
        return u890.j(this.a, pn10Var.a) && u890.j(this.b, pn10Var.b) && u890.j(this.c, pn10Var.c) && u890.j(this.d, pn10Var.d) && this.e.equals(pn10Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = f4i1.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.e.hashCode() + ((iB + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        LinkedHashMap linkedHashMap = this.e;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
