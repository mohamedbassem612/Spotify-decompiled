package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xd implements Parcelable {
    public final String X;
    public final Date a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final String e;
    public final oe f;
    public final Date g;
    public final String h;
    public final String i;
    public final Date t;
    public static final Date Y = new Date(Long.MAX_VALUE);
    public static final Date Z = new Date();
    public static final oe N0 = oe.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<xd> CREATOR = new ad((byte) 3);

    public xd(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, oe oeVar, Date date, Date date2, Date date3, String str4) {
        w0h1.B(str, "accessToken");
        w0h1.B(str2, "applicationId");
        w0h1.B(str3, "userId");
        Date date4 = Y;
        this.a = date == null ? date4 : date;
        this.b = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.c = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.d = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.e = str;
        oeVar = oeVar == null ? N0 : oeVar;
        if (str4 != null && str4.equals("instagram")) {
            int iOrdinal = oeVar.ordinal();
            if (iOrdinal == 1) {
                oeVar = oe.INSTAGRAM_APPLICATION_WEB;
            } else if (iOrdinal == 4) {
                oeVar = oe.INSTAGRAM_WEB_VIEW;
            } else if (iOrdinal == 5) {
                oeVar = oe.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f = oeVar;
        this.g = date2 == null ? Z : date2;
        this.h = str2;
        this.i = str3;
        this.t = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.X = str4 == null ? "facebook" : str4;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.t.getTime());
        String str = this.X;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zJ;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd)) {
            return false;
        }
        xd xdVar = (xd) obj;
        if (u890.j(this.a, xdVar.a) && u890.j(this.b, xdVar.b) && u890.j(this.c, xdVar.c) && u890.j(this.d, xdVar.d) && u890.j(this.e, xdVar.e) && this.f == xdVar.f && u890.j(this.g, xdVar.g) && u890.j(this.h, xdVar.h) && u890.j(this.i, xdVar.i) && u890.j(this.t, xdVar.t)) {
            String str = xdVar.X;
            String str2 = this.X;
            if (str2 == null) {
                zJ = str == null;
            } else {
                zJ = u890.j(str2, str);
            }
            if (zJ) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.t.hashCode() + cy30.d(cy30.d((this.g.hashCode() + ((this.f.hashCode() + cy30.d(gvg.c(gvg.c(gvg.c((this.a.hashCode() + 527) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i)) * 31;
        String str = this.X;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        synchronized (wf10.b) {
        }
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.t.getTime());
        parcel.writeString(this.X);
    }

    public /* synthetic */ xd(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, oe oeVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, oeVar, date, date2, date3, "facebook");
    }

    public xd(Parcel parcel) {
        oe oeVarValueOf;
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.d = Collections.unmodifiableSet(new HashSet(arrayList));
        String string = parcel.readString();
        w0h1.D(string, "token");
        this.e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            oeVarValueOf = oe.valueOf(string2);
        } else {
            oeVarValueOf = N0;
        }
        this.f = oeVarValueOf;
        this.g = new Date(parcel.readLong());
        String string3 = parcel.readString();
        w0h1.D(string3, "applicationId");
        this.h = string3;
        String string4 = parcel.readString();
        w0h1.D(string4, "userId");
        this.i = string4;
        this.t = new Date(parcel.readLong());
        this.X = parcel.readString();
    }
}
