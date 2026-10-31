package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c490 implements Parcelable {
    public static final Parcelable.Creator<c490> CREATOR = new xl80((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final pn10 f;

    public c490(String str, String str2, String str3, String str4, Map map, pn10 pn10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = pn10Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final String a(boolean z) {
        StringBuilder sb = new StringBuilder("----\n*Auto-Captured Context:*\n");
        String str = "Unavailable";
        String str2 = this.a;
        if (str2 == null) {
            str2 = "Unavailable";
        } else {
            if (ihc1.y0(str2)) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "Unavailable";
            }
        }
        sb.append("Current Page: ".concat(str2));
        sb.append('\n');
        if (z) {
            String str3 = this.b;
            if (str3 == null) {
                str3 = "Unavailable";
            } else {
                if (ihc1.y0(str3)) {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "Unavailable";
                }
            }
            sb.append("Page URI: ".concat(str3));
            sb.append('\n');
        }
        if (z) {
            String str4 = this.c;
            if (str4 == null) {
                str4 = "Nothing playing";
            } else {
                if (ihc1.y0(str4)) {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "Nothing playing";
                }
            }
            sb.append("Playing URI: ".concat(str4));
            sb.append('\n');
        }
        String str5 = this.d;
        if (str5 != null) {
            String str6 = ihc1.y0(str5) ? null : str5;
            if (str6 != null) {
                str = str6;
            }
        }
        sb.append("Player Release: ".concat(str));
        sb.append('\n');
        Map map = this.e;
        for (String str7 : o7h.Z0(map.keySet())) {
            sb.append(str7 + ": " + map.get(str7));
            sb.append('\n');
        }
        return ihc1.e1(sb.toString()).toString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c490)) {
            return false;
        }
        c490 c490Var = (c490) obj;
        return u890.j(this.a, c490Var.a) && u890.j(this.b, c490Var.b) && u890.j(this.c, c490Var.c) && u890.j(this.d, c490Var.d) && u890.j(this.e, c490Var.e) && u890.j(this.f, c490Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iE = cy30.e((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.e);
        pn10 pn10Var = this.f;
        return iE + (pn10Var != null ? pn10Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        Iterator itJ = xcg1.j(parcel, this.e);
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        pn10 pn10Var = this.f;
        if (pn10Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pn10Var.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ c490() {
        this(null, null, null, null, b7x.a, null);
    }
}
