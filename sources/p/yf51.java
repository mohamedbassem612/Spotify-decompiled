package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yf51 extends ei90 {
    public static final Parcelable.Creator<yf51> CREATOR = new ge51((byte) 1);
    public final String a;
    public final int b;
    public final ArrayList c;
    public final String d;
    public final int e;
    public final String f;
    public final List g;
    public final String h;

    public yf51(String str, int i, ArrayList arrayList, String str2, int i2, String str3, ArrayList arrayList2, String str4) {
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = arrayList2;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf51)) {
            return false;
        }
        yf51 yf51Var = (yf51) obj;
        return u890.j(this.a, yf51Var.a) && this.b == yf51Var.b && this.c.equals(yf51Var.c) && u890.j(this.d, yf51Var.d) && this.e == yf51Var.e && u890.j(this.f, yf51Var.f) && this.g.equals(yf51Var.g) && u890.j(this.h, yf51Var.h);
    }

    public final int hashCode() {
        int iK = ab80.k(this.e, cy30.d(p3d1.f(this.c, ab80.k(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31);
        String str = this.f;
        int iB = f4i1.b((iK + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.a);
        String str2 = "UNKNOWN";
        switch (this.b) {
            case 1:
                str = "VIDEO_CAROUSEL";
                break;
            case 2:
                str = "GENERIC";
                break;
            case 3:
                str = "UNKNOWN";
                break;
            case 4:
                str = "CROSSWORD";
                break;
            case 5:
                str = "INSTANT_MIX";
                break;
            case 6:
                str = "DIVIDER";
                break;
            case 7:
                str = "RELATED_SEARCHES";
                break;
            case 8:
                str = "START_A_CHAT";
                break;
            case 9:
                str = "AGENT";
                break;
            case 10:
                str = "CROSS_CONTENT_RELATED";
                break;
            case 11:
                str = "TRACK_VERSIONS";
                break;
            case 12:
                str = "SEARCH_OVERVIEW_PLACEHOLDER";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
        Iterator itO = xvj1.o(this.c, parcel);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i);
        }
        parcel.writeString(this.d);
        int i2 = this.e;
        if (i2 != 1) {
            if (i2 == 2) {
                str2 = "CAROUSEL";
            } else {
                if (i2 != 3) {
                    throw null;
                }
                str2 = "LIST";
            }
        }
        parcel.writeString(str2);
        parcel.writeString(this.f);
        parcel.writeStringList(this.g);
        parcel.writeString(this.h);
    }
}
