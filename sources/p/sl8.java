package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sl8 implements Parcelable {
    public static final Parcelable.Creator<sl8> CREATOR = new bu7((byte) 24);
    public final Set N0;
    public final String O0;
    public final Map P0;
    public final Map Q0;
    public final Map R0;
    public final String S0;
    public final String T0;
    public final String X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String t;

    public sl8(String str, String str2) {
        Set setUnmodifiableSet;
        w0h1.B(str, "encodedClaims");
        JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 8), nne.a));
        if (jSONObject.optString("jti").length() != 0) {
            try {
                String strOptString = jSONObject.optString("iss");
                if (strOptString.length() != 0 && (u890.j(new URL(strOptString).getHost(), "facebook.com") || u890.j(new URL(strOptString).getHost(), "www.facebook.com"))) {
                    String strOptString2 = jSONObject.optString("aud");
                    if (strOptString2.length() != 0 && strOptString2.equals(wf10.b())) {
                        if (!new Date().after(new Date(jSONObject.optLong("exp") * 1000))) {
                            if (!new Date().after(new Date((jSONObject.optLong("iat") * 1000) + 600000)) && jSONObject.optString("sub").length() != 0) {
                                String strOptString3 = jSONObject.optString("nonce");
                                if (strOptString3.length() != 0 && strOptString3.equals(str2)) {
                                    this.a = jSONObject.getString("jti");
                                    this.b = jSONObject.getString("iss");
                                    this.c = jSONObject.getString("aud");
                                    this.d = jSONObject.getString("nonce");
                                    this.e = jSONObject.getLong("exp");
                                    this.f = jSONObject.getLong("iat");
                                    this.g = jSONObject.getString("sub");
                                    this.h = jyo1.h("name", jSONObject);
                                    this.i = jyo1.h("given_name", jSONObject);
                                    this.t = jyo1.h("middle_name", jSONObject);
                                    this.X = jyo1.h("family_name", jSONObject);
                                    this.Y = jyo1.h("email", jSONObject);
                                    this.Z = jyo1.h("picture", jSONObject);
                                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
                                    if (jSONArrayOptJSONArray == null) {
                                        setUnmodifiableSet = null;
                                    } else {
                                        HashSet hashSet = new HashSet();
                                        int length = jSONArrayOptJSONArray.length();
                                        for (int i = 0; i < length; i++) {
                                            hashSet.add(jSONArrayOptJSONArray.getString(i));
                                        }
                                        setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
                                    }
                                    this.N0 = setUnmodifiableSet;
                                    this.O0 = jyo1.h("user_birthday", jSONObject);
                                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
                                    this.P0 = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(fpi1.g(jSONObjectOptJSONObject));
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
                                    this.Q0 = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(fpi1.h(jSONObjectOptJSONObject2));
                                    JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
                                    this.R0 = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(fpi1.h(jSONObjectOptJSONObject3)) : null;
                                    this.S0 = jyo1.h("user_gender", jSONObject);
                                    this.T0 = jyo1.h("user_link", jSONObject);
                                    return;
                                }
                            }
                        }
                    }
                }
            } catch (MalformedURLException unused) {
            }
        }
        hhg1.n("Invalid claims");
        throw null;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.a);
        jSONObject.put("iss", this.b);
        jSONObject.put("aud", this.c);
        jSONObject.put("nonce", this.d);
        jSONObject.put("exp", this.e);
        jSONObject.put("iat", this.f);
        String str = this.g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.t;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.X;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.Y;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.Z;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.N0;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.O0;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.P0;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.Q0;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.R0;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.S0;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.T0;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
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
        if (!(obj instanceof sl8)) {
            return false;
        }
        sl8 sl8Var = (sl8) obj;
        return u890.j(this.a, sl8Var.a) && u890.j(this.b, sl8Var.b) && u890.j(this.c, sl8Var.c) && u890.j(this.d, sl8Var.d) && this.e == sl8Var.e && this.f == sl8Var.f && u890.j(this.g, sl8Var.g) && u890.j(this.h, sl8Var.h) && u890.j(this.i, sl8Var.i) && u890.j(this.t, sl8Var.t) && u890.j(this.X, sl8Var.X) && u890.j(this.Y, sl8Var.Y) && u890.j(this.Z, sl8Var.Z) && u890.j(this.N0, sl8Var.N0) && u890.j(this.O0, sl8Var.O0) && u890.j(this.P0, sl8Var.P0) && u890.j(this.Q0, sl8Var.Q0) && u890.j(this.R0, sl8Var.R0) && u890.j(this.S0, sl8Var.S0) && u890.j(this.T0, sl8Var.T0);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.f(cy30.f(cy30.d(cy30.d(cy30.d(cy30.d(527, 31, this.a), 31, this.b), 31, this.c), 31, this.d), this.e, 31), this.f, 31), 31, this.g);
        String str = this.h;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.t;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.X;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.Y;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.Z;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.N0;
        int iHashCode7 = (iHashCode6 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.O0;
        int iHashCode8 = (iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.P0;
        int iHashCode9 = (iHashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.Q0;
        int iHashCode10 = (iHashCode9 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.R0;
        int iHashCode11 = (iHashCode10 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.S0;
        int iHashCode12 = (iHashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.T0;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        return a().toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.t);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeString(this.Z);
        Set set = this.N0;
        if (set == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(set));
        }
        parcel.writeString(this.O0);
        parcel.writeMap(this.P0);
        parcel.writeMap(this.Q0);
        parcel.writeMap(this.R0);
        parcel.writeString(this.S0);
        parcel.writeString(this.T0);
    }

    public sl8(Parcel parcel) {
        String string = parcel.readString();
        w0h1.D(string, "jti");
        this.a = string;
        String string2 = parcel.readString();
        w0h1.D(string2, "iss");
        this.b = string2;
        String string3 = parcel.readString();
        w0h1.D(string3, "aud");
        this.c = string3;
        String string4 = parcel.readString();
        w0h1.D(string4, "nonce");
        this.d = string4;
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        String string5 = parcel.readString();
        w0h1.D(string5, "sub");
        this.g = string5;
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.t = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.N0 = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.O0 = parcel.readString();
        HashMap hashMap = parcel.readHashMap(hr80.class.getClassLoader());
        hashMap = hashMap == null ? null : hashMap;
        this.P0 = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        HashMap hashMap2 = parcel.readHashMap(sgc1.class.getClassLoader());
        hashMap2 = hashMap2 == null ? null : hashMap2;
        this.Q0 = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(sgc1.class.getClassLoader());
        hashMap3 = hashMap3 == null ? null : hashMap3;
        this.R0 = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.S0 = parcel.readString();
        this.T0 = parcel.readString();
    }
}
