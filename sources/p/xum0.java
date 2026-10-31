package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xum0 implements Parcelable {
    public static final Parcelable.Creator<xum0> CREATOR = new fgm0((byte) 23);
    public final String a;
    public final String b;

    public xum0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xum0)) {
            return false;
        }
        xum0 xum0Var = (xum0) obj;
        return u890.j(this.a, xum0Var.a) && u890.j(this.b, xum0Var.b);
    }

    public final String getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
