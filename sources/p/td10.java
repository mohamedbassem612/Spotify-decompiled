package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class td10 implements Parcelable {
    public static final Parcelable.Creator<td10> CREATOR = new qn00((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public sd10 d;
    public boolean e;
    public final transient WeakHashMap f = new WeakHashMap(1);

    public td10(String str, String str2, String str3, sd10 sd10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sd10Var;
    }

    public final int a(Context context) {
        sd10 sd10Var = this.d;
        if (sd10Var instanceof qd10) {
            return context.getColor(((qd10) sd10Var).a);
        }
        return sd10Var instanceof rd10 ? ((rd10) sd10Var).a : context.getColor(2131101367);
    }

    public final sd10 b() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td10)) {
            return false;
        }
        td10 td10Var = (td10) obj;
        return u890.j(this.a, td10Var.a) && u890.j(this.b, td10Var.b) && u890.j(this.c, td10Var.c) && u890.j(this.d, td10Var.d);
    }

    public final String g() {
        return this.a;
    }

    public final String getDisplayName() {
        return this.c;
    }

    public final String getUsername() {
        return this.b;
    }

    public final Drawable h(Context context) {
        WeakHashMap weakHashMap = this.f;
        Object hg10Var = weakHashMap.get(context);
        if (hg10Var == null) {
            boolean z = this.e;
            String str = this.c;
            String str2 = this.b;
            if (z) {
                int iA = a(context);
                StringBuilder sbN = gvg.n("Username: ", str2, ", displayName: ", str, ", Color: ");
                sbN.append(iA);
                Logger.d(sbN.toString(), new Object[0]);
                hg10Var = new hg10(iA, context, str2);
            } else {
                hg10Var = new hg10(context, str2, str, this.d != null ? Integer.valueOf(a(context)) : null);
            }
            weakHashMap.put(context, hg10Var);
        }
        return (Drawable) hg10Var;
    }

    public final int hashCode() {
        String str = this.a;
        int iD = cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        sd10 sd10Var = this.d;
        return iHashCode + (sd10Var != null ? sd10Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
    }
}
