package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class quh0 extends u9 {
    public static final Parcelable.Creator<quh0> CREATOR = new jrn1(7);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] g;
    public String h;
    public JSONObject i;

    public quh0(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = jArr;
        this.h = str;
        if (str == null) {
            this.i = null;
            return;
        }
        try {
            this.i = new JSONObject(this.h);
        } catch (JSONException unused) {
            this.i = null;
            this.h = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof quh0)) {
            return false;
        }
        quh0 quh0Var = (quh0) obj;
        JSONObject jSONObject = this.i;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = quh0Var.i;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oha0.a(jSONObject, jSONObject2)) && o4e.c(this.a, quh0Var.a) && this.b == quh0Var.b && this.c == quh0Var.c && ((Double.isNaN(this.d) && Double.isNaN(quh0Var.d)) || this.d == quh0Var.d) && this.e == quh0Var.e && this.f == quh0Var.f && Arrays.equals(this.g, quh0Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i)});
    }

    public final boolean j(JSONObject jSONObject) throws JSONException {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.b != (i = jSONObject.getInt("itemId"))) {
            this.b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.c = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.d) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.d) > 1.0E-7d)) {
            this.d = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f) > 1.0E-7d) {
                this.f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.g;
            if (jArr2 == null || jArr2.length != length) {
                z3 = true;
                break;
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (this.g[i3] != jArr[i3]) {
                    z3 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z3) {
            this.g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.i = jSONObject.getJSONObject("customData");
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        j541.E(parcel, 2, this.a, i);
        int i2 = this.b;
        j541.K(parcel, 3, 4);
        parcel.writeInt(i2);
        boolean z = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(z ? 1 : 0);
        double d = this.d;
        j541.K(parcel, 5, 8);
        parcel.writeDouble(d);
        double d2 = this.e;
        j541.K(parcel, 6, 8);
        parcel.writeDouble(d2);
        double d3 = this.f;
        j541.K(parcel, 7, 8);
        parcel.writeDouble(d3);
        j541.D(parcel, 8, this.g);
        j541.F(parcel, 9, this.h);
        j541.M(iL, parcel);
    }

    public quh0(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        j(jSONObject);
    }
}
