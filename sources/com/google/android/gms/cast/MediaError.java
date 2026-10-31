package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import org.json.JSONObject;
import p.j541;
import p.jrn1;
import p.o4e;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class MediaError extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new jrn1((byte) 0);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    public String e;
    public final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static MediaError j(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, o4e.a("reason", jSONObject), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.K(parcel, 3, 8);
        parcel.writeLong(this.b);
        j541.B(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.F(parcel, 6, this.e);
        j541.M(iL, parcel);
    }
}
