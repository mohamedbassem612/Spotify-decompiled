package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ro41 implements zo41 {
    public static final Parcelable.Creator<ro41> CREATOR = new xw31((byte) 26);
    public static final ro41 O0 = new ro41("", "", z6x.a, null, null, null, null, 0, null, false, null, 16376);
    public final boolean N0;
    public final boolean X;
    public final Integer Y;
    public final p791 Z;
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final SearchConfiguration e;
    public final m20 f;
    public final m20 g;
    public final int h;
    public final List i;
    public final List t;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ro41(String str, String str2, List list, ArrayList arrayList, SearchConfiguration searchConfiguration, m20 m20Var, m20 m20Var2, int i, ArrayList arrayList2, boolean z, p791 p791Var, int i2) {
        int i3 = i2 & 8;
        ArrayList arrayList3 = z6x.a;
        this(str, str2, list, i3 != 0 ? arrayList3 : arrayList, (i2 & 16) != 0 ? null : searchConfiguration, (i2 & 32) != 0 ? null : m20Var, (i2 & 64) != 0 ? null : m20Var2, (i2 & 128) != 0 ? 1 : i, (i2 & 256) != 0 ? arrayList3 : arrayList2, arrayList3, (i2 & 1024) != 0 ? false : z, null, (i2 & 4096) != 0 ? p791.b : p791Var, false);
    }

    public static ro41 a(ro41 ro41Var, ArrayList arrayList, List list, List list2, Integer num, boolean z, int i) {
        String str = ro41Var.a;
        String str2 = ro41Var.b;
        List list3 = (i & 4) != 0 ? ro41Var.c : arrayList;
        List list4 = ro41Var.d;
        List list5 = list3;
        SearchConfiguration searchConfiguration = ro41Var.e;
        m20 m20Var = ro41Var.f;
        m20 m20Var2 = ro41Var.g;
        int i2 = ro41Var.h;
        List list6 = (i & 256) != 0 ? ro41Var.i : list;
        List list7 = (i & 512) != 0 ? ro41Var.t : list2;
        boolean z2 = ro41Var.X;
        Integer num2 = (i & 2048) != 0 ? ro41Var.Y : num;
        p791 p791Var = ro41Var.Z;
        boolean z3 = (i & 8192) != 0 ? ro41Var.N0 : z;
        ro41Var.getClass();
        return new ro41(str, str2, list5, list4, searchConfiguration, m20Var, m20Var2, i2, list6, list7, z2, num2, p791Var, z3);
    }

    @Override // p.zo41
    public final String S() {
        List list = this.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof gxs0) {
                arrayList.add(obj);
            }
        }
        return f4i1.c(arrayList.size(), "ContentPicker, Signals: ");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro41)) {
            return false;
        }
        ro41 ro41Var = (ro41) obj;
        return u890.j(this.a, ro41Var.a) && u890.j(this.b, ro41Var.b) && u890.j(this.c, ro41Var.c) && u890.j(this.d, ro41Var.d) && u890.j(this.e, ro41Var.e) && u890.j(this.f, ro41Var.f) && u890.j(this.g, ro41Var.g) && this.h == ro41Var.h && u890.j(this.i, ro41Var.i) && u890.j(this.t, ro41Var.t) && this.X == ro41Var.X && u890.j(this.Y, ro41Var.Y) && this.Z == ro41Var.Z && this.N0 == ro41Var.N0;
    }

    public final int hashCode() {
        int iB = f4i1.b(f4i1.b(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        SearchConfiguration searchConfiguration = this.e;
        int iHashCode = (iB + (searchConfiguration == null ? 0 : searchConfiguration.hashCode())) * 31;
        m20 m20Var = this.f;
        int iHashCode2 = (iHashCode + (m20Var == null ? 0 : m20Var.a.hashCode())) * 31;
        m20 m20Var2 = this.g;
        int iG = xcg1.g(f4i1.b(f4i1.b(kaa0.f(this.h, (iHashCode2 + (m20Var2 == null ? 0 : m20Var2.a.hashCode())) * 31, 31), 31, this.i), 31, this.t), 31, this.X);
        Integer num = this.Y;
        return Boolean.hashCode(this.N0) + ((this.Z.hashCode() + ((iG + (num != null ? num.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Iterator itM = kk0.m(parcel, this.c);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        Iterator itM2 = kk0.m(parcel, this.d);
        while (itM2.hasNext()) {
            ((qo41) itM2.next()).writeToParcel(parcel, i);
        }
        SearchConfiguration searchConfiguration = this.e;
        if (searchConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchConfiguration.writeToParcel(parcel, i);
        }
        m20 m20Var = this.f;
        if (m20Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m20Var.writeToParcel(parcel, i);
        }
        m20 m20Var2 = this.g;
        if (m20Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            m20Var2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h);
        Iterator itM3 = kk0.m(parcel, this.i);
        while (itM3.hasNext()) {
            ((txs0) itM3.next()).writeToParcel(parcel, i);
        }
        Iterator itM4 = kk0.m(parcel, this.t);
        while (itM4.hasNext()) {
            ((txs0) itM4.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.X ? 1 : 0);
        Integer num = this.Y;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        parcel.writeString(this.Z.name());
        parcel.writeInt(this.N0 ? 1 : 0);
    }

    public ro41(String str, String str2, List list, List list2, SearchConfiguration searchConfiguration, m20 m20Var, m20 m20Var2, int i, List list3, List list4, boolean z, Integer num, p791 p791Var, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = searchConfiguration;
        this.f = m20Var;
        this.g = m20Var2;
        this.h = i;
        this.i = list3;
        this.t = list4;
        this.X = z;
        this.Y = num;
        this.Z = p791Var;
        this.N0 = z2;
    }
}
