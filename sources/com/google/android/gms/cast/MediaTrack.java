package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import p.j541;
import p.jrn1;
import p.o4e;
import p.oha0;
import p.u9;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class MediaTrack extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new jrn1((byte) 12);
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public String i;
    public final JSONObject t;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = list;
        this.t = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.t;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.t;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oha0.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && o4e.c(this.c, mediaTrack.c) && o4e.c(this.d, mediaTrack.d) && o4e.c(this.e, mediaTrack.e) && o4e.c(this.f, mediaTrack.f) && this.g == mediaTrack.g && o4e.c(this.h, mediaTrack.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h, String.valueOf(this.t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.t;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 2, 8);
        parcel.writeLong(this.a);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 5, this.d);
        j541.F(parcel, 6, this.e);
        j541.F(parcel, 7, this.f);
        j541.K(parcel, 8, 4);
        parcel.writeInt(this.g);
        j541.H(parcel, 9, this.h);
        j541.F(parcel, 10, this.i);
        j541.M(iL, parcel);
    }
}
