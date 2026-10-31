package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class di8 implements Parcelable {
    public static final Parcelable.Creator<di8> CREATOR = new bu7((byte) 19);
    public final String a;
    public final wd b;
    public final of8 c;

    static {
        "".getBytes(nne.a);
    }

    public di8(String str, wd wdVar, of8 of8Var) {
        this.a = str;
        this.b = wdVar;
        this.c = of8Var;
    }

    public static di8 a(di8 di8Var, wd wdVar) {
        String str = di8Var.a;
        of8 of8Var = di8Var.c;
        di8Var.getClass();
        return new di8(str, wdVar, of8Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di8)) {
            return false;
        }
        di8 di8Var = (di8) obj;
        return u890.j(this.a, di8Var.a) && u890.j(this.b, di8Var.b) && u890.j(this.c, di8Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        wd wdVar = this.b;
        return this.c.hashCode() + ((iHashCode + (wdVar == null ? 0 : wdVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        wd wdVar = this.b;
        if (wdVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            wdVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.c, i);
    }
}
