package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ui71 extends wi71 {
    public static final Parcelable.Creator<ui71> CREATOR = new ff71(11);
    public final List a;
    public final hl71 b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final ti71 g;
    public final te71 h;

    public ui71(List list, hl71 hl71Var, String str, String str2, String str3, boolean z, ti71 ti71Var, te71 te71Var) {
        this.a = list;
        this.b = hl71Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = ti71Var;
        this.h = te71Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui71)) {
            return false;
        }
        ui71 ui71Var = (ui71) obj;
        return this.a.equals(ui71Var.a) && u890.j(this.b, ui71Var.b) && u890.j(this.c, ui71Var.c) && u890.j(this.d, ui71Var.d) && u890.j(this.e, ui71Var.e) && this.f == ui71Var.f && this.g == ui71Var.g && u890.j(this.h, ui71Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + xcg1.g(cy30.d(cy30.d(cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            parcel.writeParcelable((Parcelable) itM.next(), i);
        }
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(new w871(this.e), i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeString(this.g.name());
        parcel.writeParcelable(this.h, i);
    }
}
