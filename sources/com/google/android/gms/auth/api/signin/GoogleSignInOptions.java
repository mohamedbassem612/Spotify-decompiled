package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.epj1;
import p.j541;
import p.mh5;
import p.r450;
import p.u9;
import p.ynm1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Deprecated
public class GoogleSignInOptions extends u9 implements mh5, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope N0;
    public static final Scope O0;
    public static final epj1 P0;
    public static final GoogleSignInOptions X;
    public static final Scope Y;
    public static final Scope Z;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final ArrayList i;
    public final String t;

    static {
        Scope scope = new Scope(1, "profile");
        Y = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        Z = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        N0 = scope3;
        O0 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(O0)) {
            Scope scope4 = N0;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        X = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(O0)) {
            Scope scope5 = N0;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new ynm1((byte) 29);
        P0 = new epj1((byte) 12);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList(map.values());
        this.t = str3;
    }

    public static HashMap F(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r450 r450Var = (r450) it.next();
                map.put(Integer.valueOf(r450Var.b), r450Var);
            }
        }
        return map;
    }

    public static GoogleSignInOptions j(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public final boolean equals(Object obj) {
        String str = this.g;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.b;
            String str2 = googleSignInOptions.g;
            if (this.i.isEmpty() && googleSignInOptions.i.isEmpty()) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() == new ArrayList(arrayList).size() && arrayList2.containsAll(new ArrayList(arrayList))) {
                    Account account = this.c;
                    Account account2 = googleSignInOptions.c;
                    if (account == null) {
                        if (account2 != null) {
                            return false;
                        }
                    } else if (!account.equals(account2)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    return this.f == googleSignInOptions.f && this.d == googleSignInOptions.d && this.e == googleSignInOptions.e && TextUtils.equals(this.t, googleSignInOptions.t);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        String str2 = this.t;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.J(parcel, 2, new ArrayList(this.b));
        j541.E(parcel, 3, this.c, i);
        j541.K(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j541.K(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j541.K(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        j541.F(parcel, 7, this.g);
        j541.F(parcel, 8, this.h);
        j541.J(parcel, 9, this.i);
        j541.F(parcel, 10, this.t);
        j541.M(iL, parcel);
    }
}
