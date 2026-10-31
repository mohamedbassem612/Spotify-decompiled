package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bil1 extends u9 {
    public static final Parcelable.Creator<bil1> CREATOR = new e9n1(0);
    public final int a;
    public final Uri b;
    public final int c;
    public final int d;

    /* JADX WARN: Illegal instructions before constructor call */
    public bil1(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        this(1, uri, iOptInt, iOptInt2);
        if (uri == null) {
            hhg1.n("url cannot be null");
            throw null;
        }
        if (iOptInt < 0 || iOptInt2 < 0) {
            hhg1.n("width and height must not be negative");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bil1)) {
            bil1 bil1Var = (bil1) obj;
            if (k8p1.h(this.b, bil1Var.b) && this.c == bil1Var.c && this.d == bil1Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        String string = this.b.toString();
        StringBuilder sbQ = cy30.q(this.c, this.d, "Image ", "x", " ");
        sbQ.append(string);
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.E(parcel, 2, this.b, i);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.c);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d);
        j541.M(iL, parcel);
    }

    public bil1(int i, Uri uri, int i2, int i3) {
        this.a = i;
        this.b = uri;
        this.c = i2;
        this.d = i3;
    }
}
