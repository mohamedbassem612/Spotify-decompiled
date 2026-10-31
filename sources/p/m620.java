package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m620 implements Parcelable {
    public static final Parcelable.Creator<m620> CREATOR = new u220(9);
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Set e;

    public m620(String str, String str2, String str3, boolean z, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = set;
    }

    public static m620 a(m620 m620Var, boolean z, Set set, int i) {
        String str = m620Var.a;
        String str2 = m620Var.b;
        String str3 = m620Var.c;
        if ((i & 8) != 0) {
            z = m620Var.d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            set = m620Var.e;
        }
        return new m620(str, str2, str3, z2, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m620)) {
            return false;
        }
        m620 m620Var = (m620) obj;
        return u890.j(this.a, m620Var.a) && u890.j(this.b, m620Var.b) && u890.j(this.c, m620Var.c) && this.d == m620Var.d && u890.j(this.e, m620Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        Iterator itH = k4s0.h(this.e, parcel);
        while (itH.hasNext()) {
            ((m620) itH.next()).writeToParcel(parcel, i);
        }
    }
}
