package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bhk0 implements ilq0 {
    public static final Parcelable.Creator<bhk0> CREATOR = new w9k0((byte) 4);
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public bhk0(String str, ArrayList arrayList, List list, ArrayList arrayList2) {
        this.a = str;
        this.b = arrayList;
        this.c = list;
        this.d = arrayList2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhk0)) {
            return false;
        }
        bhk0 bhk0Var = (bhk0) obj;
        return u890.j(this.a, bhk0Var.a) && this.b.equals(bhk0Var.b) && u890.j(this.c, bhk0Var.c) && this.d.equals(bhk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f4i1.b(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final htv p0(htv htvVar) {
        c380 c380Var = htvVar.l;
        int iS = zno1.s(q7h.U(c380Var, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : c380Var) {
            linkedHashMap.put(((ftv) obj).a, obj);
        }
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ftv ftvVar = (ftv) linkedHashMap.get((String) it.next());
            if (ftvVar != null) {
                arrayList.add(ftvVar);
            }
        }
        return htv.a(htvVar, false, false, false, null, null, null, null, null, mqo1.A(arrayList), 2047);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeStringList(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeStringList((List) itM.next());
        }
        parcel.writeStringList(this.d);
    }

    public final ilq0 b1(htv htvVar) {
        return this;
    }
}
