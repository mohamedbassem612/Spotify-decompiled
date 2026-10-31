package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yl80 implements dtb1 {
    public static final Parcelable.Creator<yl80> CREATOR = new xl80((byte) 0);
    public final zl80 a;
    public final ul80 b;
    public final wl80 c;
    public final String d;

    public yl80(zl80 zl80Var, ul80 ul80Var, wl80 wl80Var, String str) {
        this.a = zl80Var;
        this.b = ul80Var;
        this.c = wl80Var;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl80)) {
            return false;
        }
        yl80 yl80Var = (yl80) obj;
        return this.a == yl80Var.a && u890.j(this.b, yl80Var.b) && u890.j(this.c, yl80Var.c) && u890.j(this.d, yl80Var.d);
    }

    @Override // p.dtb1
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
    }
}
