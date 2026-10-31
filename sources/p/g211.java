package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g211 implements Parcelable {
    public static final Parcelable.Creator<g211> CREATOR = new e211((byte) 1);
    public final f211 a;
    public final int b;
    public final int c;

    public /* synthetic */ g211() {
        this(new f211("", "", "", "", ""), 2, 3);
    }

    public static g211 a(g211 g211Var, f211 f211Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f211Var = g211Var.a;
        }
        if ((i3 & 2) != 0) {
            i = g211Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = g211Var.c;
        }
        return new g211(f211Var, i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g211)) {
            return false;
        }
        g211 g211Var = (g211) obj;
        return u890.j(this.a, g211Var.a) && this.b == g211Var.b && this.c == g211Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        this.a.writeToParcel(parcel, i);
        int i2 = this.b;
        if (i2 == 1) {
            str = "Follow";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "UnFollow";
        }
        parcel.writeString(str);
        int i3 = this.c;
        if (i3 == 1) {
            str2 = "PLAYING";
        } else if (i3 == 2) {
            str2 = "PAUSED";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "NONE";
        }
        parcel.writeString(str2);
    }

    public g211(f211 f211Var, int i, int i2) {
        this.a = f211Var;
        this.b = i;
        this.c = i2;
    }
}
