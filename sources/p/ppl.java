package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ppl implements apl {
    public static final Parcelable.Creator<ppl> CREATOR = new pol((byte) 16);
    public final String a;
    public final List b;
    public final boolean c;

    public ppl(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public static ppl a(ppl pplVar, ArrayList arrayList, int i) {
        String str = pplVar.a;
        List list = arrayList;
        if ((i & 2) != 0) {
            list = pplVar.b;
        }
        return new ppl(str, list, (i & 4) != 0 ? pplVar.c : true);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ppl)) {
            return false;
        }
        ppl pplVar = (ppl) obj;
        return u890.j(this.a, pplVar.a) && u890.j(this.b, pplVar.b) && this.c == pplVar.c;
    }

    public final String getId() {
        return this.a;
    }

    public final List getItems() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((opl) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.c ? 1 : 0);
    }

    public /* synthetic */ ppl(String str, ArrayList arrayList) {
        this(str, arrayList, false);
    }
}
