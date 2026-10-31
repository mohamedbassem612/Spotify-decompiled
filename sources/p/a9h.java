package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9h implements Parcelable {
    public static final Parcelable.Creator<a9h> CREATOR = new v6h((byte) 1);
    public final fef0 a;
    public final bff0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a9h(ArrayList arrayList, int i, List list, String str, boolean z, bef0 bef0Var, eef0 eef0Var, int i2, bff0 bff0Var, int i3) {
        int i4 = i3 & 1;
        List list2 = z6x.a;
        this(i4 != 0 ? list2 : arrayList, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? list2 : list, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? new bef0("", "", "") : bef0Var, (i3 & 64) != 0 ? new eef0(false) : eef0Var, (i3 & 128) != 0 ? 1 : i2, list2, (i3 & 512) != 0 ? new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true) : bff0Var);
    }

    public static a9h a(a9h a9hVar, fef0 fef0Var, bff0 bff0Var, int i) {
        if ((i & 1) != 0) {
            fef0Var = a9hVar.a;
        }
        if ((i & 2) != 0) {
            bff0Var = a9hVar.b;
        }
        a9hVar.getClass();
        return new a9h(fef0Var, bff0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9h)) {
            return false;
        }
        a9h a9hVar = (a9h) obj;
        return u890.j(this.a, a9hVar.a) && u890.j(this.b, a9hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }

    public a9h(fef0 fef0Var, bff0 bff0Var) {
        this.a = fef0Var;
        this.b = bff0Var;
    }

    public a9h(List list, int i, List list2, String str, boolean z, bef0 bef0Var, eef0 eef0Var, int i2, List list3, bff0 bff0Var) {
        this(new fef0(list, i, list2, str, z, bef0Var, eef0Var, i2, list3), bff0Var);
    }
}
