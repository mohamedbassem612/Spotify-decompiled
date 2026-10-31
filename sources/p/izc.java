package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class izc implements kzc {
    public static final Parcelable.Creator<izc> CREATOR = new yyb((byte) 14);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final LinkedHashMap e;

    public izc(String str, String str2, String str3, int i, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
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
        if (!(obj instanceof izc)) {
            return false;
        }
        izc izcVar = (izc) obj;
        return this.a.equals(izcVar.a) && this.b.equals(izcVar.b) && this.c.equals(izcVar.c) && this.d == izcVar.d && this.e.equals(izcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        LinkedHashMap linkedHashMap = this.e;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
