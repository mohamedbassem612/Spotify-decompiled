package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eh5 implements Parcelable {
    public static final Parcelable.Creator<eh5> CREATOR = new i93((byte) 26);
    public final String a;
    public final vkk1 b;
    public final ArrayList c;
    public final String d;
    public final List e;

    public eh5(String str, vkk1 vkk1Var, ArrayList arrayList, String str2, List list) {
        this.a = str;
        this.b = vkk1Var;
        this.c = arrayList;
        this.d = str2;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh5)) {
            return false;
        }
        eh5 eh5Var = (eh5) obj;
        return u890.j(this.a, eh5Var.a) && u890.j(this.b, eh5Var.b) && this.c.equals(eh5Var.c) && u890.j(this.d, eh5Var.d) && this.e.equals(eh5Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vkk1 vkk1Var = this.b;
        return this.e.hashCode() + cy30.d(p3d1.f(this.c, (iHashCode + (vkk1Var == null ? 0 : vkk1Var.hashCode())) * 31, 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            ((eka1) itO.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeStringList(this.e);
    }
}
