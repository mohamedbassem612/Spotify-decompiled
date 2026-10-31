package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hww0 implements Parcelable {
    public static final Parcelable.Creator<hww0> CREATOR = new wvw0((byte) 0);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public final Uri g;

    public hww0(JSONObject jSONObject) {
        this.a = jSONObject.optString("id", null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.d = jSONObject.optString("last_name", null);
        this.e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("first_name", this.b);
            jSONObject.put("middle_name", this.c);
            jSONObject.put("last_name", this.d);
            jSONObject.put("name", this.e);
            Uri uri = this.f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hww0)) {
            return false;
        }
        String str5 = this.a;
        return ((str5 == null && ((hww0) obj).a == null) || u890.j(str5, ((hww0) obj).a)) && (((str = this.b) == null && ((hww0) obj).b == null) || u890.j(str, ((hww0) obj).b)) && ((((str2 = this.c) == null && ((hww0) obj).c == null) || u890.j(str2, ((hww0) obj).c)) && ((((str3 = this.d) == null && ((hww0) obj).d == null) || u890.j(str3, ((hww0) obj).d)) && ((((str4 = this.e) == null && ((hww0) obj).e == null) || u890.j(str4, ((hww0) obj).e)) && ((((uri = this.f) == null && ((hww0) obj).f == null) || u890.j(uri, ((hww0) obj).f)) && (((uri2 = this.g) == null && ((hww0) obj).g == null) || u890.j(uri2, ((hww0) obj).g))))));
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.g;
        if (uri2 != null) {
            return uri2.hashCode() + (iHashCode * 31);
        }
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Uri uri = this.f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public hww0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        w0h1.D(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = uri;
        this.g = uri2;
    }

    public hww0(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        String string = parcel.readString();
        this.f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.g = string2 != null ? Uri.parse(string2) : null;
    }
}
