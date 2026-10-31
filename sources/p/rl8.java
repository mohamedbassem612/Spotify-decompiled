package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rl8 implements Parcelable {
    public static final Parcelable.Creator<rl8> CREATOR = new bu7((byte) 23);
    public final String a;
    public final String b;
    public final tl8 c;
    public final sl8 d;
    public final String e;

    public rl8(String str, String str2) {
        w0h1.B(str, "token");
        w0h1.B(str2, "expectedNonce");
        boolean zY = false;
        List listQ0 = ihc1.Q0(str, new String[]{"."}, 0, 6);
        if (listQ0.size() != 3) {
            hhg1.n("Invalid IdToken string");
            throw null;
        }
        String str3 = (String) listQ0.get(0);
        String str4 = (String) listQ0.get(1);
        String str5 = (String) listQ0.get(2);
        this.a = str;
        this.b = str2;
        tl8 tl8Var = new tl8(str3);
        this.c = tl8Var;
        this.d = new sl8(str4, str2);
        try {
            String strR = c8o.r(tl8Var.c);
            if (strR != null) {
                zY = c8o.y(c8o.q(strR), str3 + '.' + str4, str5);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        if (zY) {
            this.e = str5;
        } else {
            hhg1.n("Invalid Signature");
            throw null;
        }
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.a);
        jSONObject.put("expected_nonce", this.b);
        tl8 tl8Var = this.c;
        tl8Var.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", tl8Var.a);
        jSONObject2.put("typ", tl8Var.b);
        jSONObject2.put("kid", tl8Var.c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.d.a());
        jSONObject.put("signature", this.e);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl8)) {
            return false;
        }
        rl8 rl8Var = (rl8) obj;
        return u890.j(this.a, rl8Var.a) && u890.j(this.b, rl8Var.b) && u890.j(this.c, rl8Var.c) && u890.j(this.d, rl8Var.d) && u890.j(this.e, rl8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + cy30.d(cy30.d(527, 31, this.a), 31, this.b)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
    }

    public rl8(Parcel parcel) {
        String string = parcel.readString();
        w0h1.D(string, "token");
        this.a = string;
        String string2 = parcel.readString();
        w0h1.D(string2, "expectedNonce");
        this.b = string2;
        Parcelable parcelable = parcel.readParcelable(tl8.class.getClassLoader());
        if (parcelable != null) {
            this.c = (tl8) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(sl8.class.getClassLoader());
            if (parcelable2 != null) {
                this.d = (sl8) parcelable2;
                String string3 = parcel.readString();
                w0h1.D(string3, "signature");
                this.e = string3;
                return;
            }
            eg.m("Required value was null.");
            throw null;
        }
        eg.m("Required value was null.");
        throw null;
    }
}
