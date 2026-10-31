package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xlu0 implements nb10 {
    public static final Parcelable.Creator<xlu0> CREATOR = new brt0((byte) 19);
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final int g;
    public final boolean h;

    public xlu0(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = z3;
        this.g = i;
        this.h = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlu0)) {
            return false;
        }
        xlu0 xlu0Var = (xlu0) obj;
        return u890.j(this.a, xlu0Var.a) && u890.j(this.b, xlu0Var.b) && this.c == xlu0Var.c && this.d == xlu0Var.d && u890.j(this.e, xlu0Var.e) && this.f == xlu0Var.f && this.g == xlu0Var.g && this.h == xlu0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ab80.k(this.g, xcg1.g(cy30.d(xcg1.g(xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        int i2 = this.g;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = SearchEndpointResponseKt.RESULT_SUCCESS;
        } else if (i2 == 3) {
            str = "QUEUED";
        } else if (i2 == 4) {
            str = "PROCESSING";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = SearchEndpointResponseKt.RESULT_ERROR;
        }
        parcel.writeString(str);
        parcel.writeInt(this.h ? 1 : 0);
    }
}
