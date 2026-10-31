package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class r8l1 implements Parcelable {
    public final List a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final String i;
    public final List t;
    public static final q8l1 Companion = new q8l1();
    public static final Parcelable.Creator<r8l1> CREATOR = new ylk1((byte) 13);
    public static final znb0[] X = {dm5.S(2, w3l1.e), null, null, null, null, null, null, null, null, dm5.S(2, w3l1.f)};

    public /* synthetic */ r8l1(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, List list2) {
        if (118 != (i & 118)) {
            o6p1.t(i, 118, p8l1.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        this.b = str;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        this.e = str4;
        this.f = str5;
        this.g = str6;
        if ((i & 128) == 0) {
            this.h = Boolean.FALSE;
        } else {
            this.h = bool;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str7;
        }
        if ((i & 512) == 0) {
            this.t = null;
        } else {
            this.t = list2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8l1)) {
            return false;
        }
        r8l1 r8l1Var = (r8l1) obj;
        return u890.j(this.a, r8l1Var.a) && u890.j(this.b, r8l1Var.b) && u890.j(this.c, r8l1Var.c) && u890.j(this.d, r8l1Var.d) && u890.j(this.e, r8l1Var.e) && u890.j(this.f, r8l1Var.f) && u890.j(this.g, r8l1Var.g) && u890.j(this.h, r8l1Var.h) && u890.j(this.i, r8l1Var.i) && u890.j(this.t, r8l1Var.t);
    }

    public final int hashCode() {
        List list = this.a;
        int iD = cy30.d(cy30.d((list == null ? 0 : list.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iD2 = cy30.d(cy30.d(cy30.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Boolean bool = this.h;
        int iD3 = cy30.d((iD2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.i);
        List list2 = this.t;
        return iD3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((s360) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        Boolean bool = this.h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            i3a.m(parcel, 1, bool);
        }
        parcel.writeString(this.i);
        List list2 = this.t;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ((ib6) it2.next()).writeToParcel(parcel, i);
        }
    }

    public r8l1(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
        this.i = str7;
        this.t = arrayList2;
    }
}
