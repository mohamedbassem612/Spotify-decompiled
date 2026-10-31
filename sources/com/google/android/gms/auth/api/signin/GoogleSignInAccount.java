package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.j541;
import p.u9;
import p.ynm1;
import p.zod;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Deprecated
public class GoogleSignInAccount extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new ynm1((byte) 24);
    public final String X;
    public final HashSet Y = new HashSet();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long g;
    public final String h;
    public final List i;
    public final String t;

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = j;
        this.h = str6;
        this.i = arrayList;
        this.t = str7;
        this.X = str8;
    }

    public static GoogleSignInAccount j(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        zod.o(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.h.equals(this.h)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.i);
        hashSet.addAll(googleSignInAccount.Y);
        HashSet hashSet2 = new HashSet(this.i);
        hashSet2.addAll(this.Y);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.h.hashCode() + 527;
        HashSet hashSet = new HashSet(this.i);
        hashSet.addAll(this.Y);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.E(parcel, 6, this.e, i);
        j541.F(parcel, 7, this.f);
        j541.K(parcel, 8, 8);
        parcel.writeLong(this.g);
        j541.F(parcel, 9, this.h);
        j541.J(parcel, 10, this.i);
        j541.F(parcel, 11, this.t);
        j541.F(parcel, 12, this.X);
        j541.M(iL, parcel);
    }
}
