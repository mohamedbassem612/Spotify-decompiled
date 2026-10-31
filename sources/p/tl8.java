package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tl8 implements Parcelable {
    public static final Parcelable.Creator<tl8> CREATOR = new bu7((byte) 25);
    public final String a;
    public final String b;
    public final String c;

    public tl8(String str) {
        w0h1.B(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        Charset charset = nne.a;
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("alg");
            boolean z = strOptString.length() > 0 && strOptString.equals("RS256");
            boolean z2 = jSONObject.optString("kid").length() > 0;
            boolean z3 = jSONObject.optString("typ").length() > 0;
            if (z && z2 && z3) {
                JSONObject jSONObject2 = new JSONObject(new String(Base64.decode(str, 0), charset));
                this.a = jSONObject2.getString("alg");
                this.b = jSONObject2.getString("typ");
                this.c = jSONObject2.getString("kid");
                return;
            }
        } catch (JSONException unused) {
        }
        hhg1.n("Invalid Header");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl8)) {
            return false;
        }
        tl8 tl8Var = (tl8) obj;
        return u890.j(this.a, tl8Var.a) && u890.j(this.b, tl8Var.b) && u890.j(this.c, tl8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(cy30.d(527, 31, this.a), 31, this.b);
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.a);
        jSONObject.put("typ", this.b);
        jSONObject.put("kid", this.c);
        return jSONObject.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public tl8(Parcel parcel) {
        String string = parcel.readString();
        w0h1.D(string, "alg");
        this.a = string;
        String string2 = parcel.readString();
        w0h1.D(string2, "typ");
        this.b = string2;
        String string3 = parcel.readString();
        w0h1.D(string3, "kid");
        this.c = string3;
    }
}
