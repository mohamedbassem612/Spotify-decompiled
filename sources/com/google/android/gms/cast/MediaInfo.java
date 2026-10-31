package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.ejo1;
import p.hhg1;
import p.j541;
import p.jrn1;
import p.jti1;
import p.mi0;
import p.ni0;
import p.o4e;
import p.oha0;
import p.see1;
import p.sho1;
import p.sqh0;
import p.u9;
import p.yho1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class MediaInfo extends u9 implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;
    public final String N0;
    public final String O0;
    public final String P0;
    public final String Q0;
    public final JSONObject R0;
    public final String X;
    public final jti1 Y;
    public final long Z;
    public final String a;
    public final int b;
    public final String c;
    public final sqh0 d;
    public final long e;
    public final List f;
    public final see1 g;
    public String h;
    public List i;
    public List t;

    static {
        Pattern pattern = o4e.a;
        CREATOR = new jrn1((byte) 1);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        byte b;
        jti1 jti1Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        List listQ;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        int i7 = 2;
        int i8 = 1;
        int i9 = 0;
        if ("NONE".equals(strOptString)) {
            this.b = 0;
            b = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.b = 1;
            b = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.b = 2;
            b = 2;
        } else {
            this.b = -1;
            b = -1;
        }
        this.c = o4e.a("contentType", jSONObject);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            sqh0 sqh0Var = new sqh0(jSONObject2.getInt("metadataType"));
            this.d = sqh0Var;
            sqh0Var.F(jSONObject2);
        }
        this.e = -1L;
        if (b != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.e = (long) (dOptDouble * 1000.0d);
            }
        }
        int i10 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i11 = 0;
            while (i11 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                long j = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                int i12 = "TEXT".equals(strOptString2) ? i8 : "AUDIO".equals(strOptString2) ? i7 : "VIDEO".equals(strOptString2) ? 3 : i9;
                String strA = o4e.a("trackContentId", jSONObject3);
                String strA2 = o4e.a("trackContentType", jSONObject3);
                String strA3 = o4e.a("name", jSONObject3);
                String strA4 = o4e.a("language", jSONObject3);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    i6 = "SUBTITLES".equals(string) ? i8 : "CAPTIONS".equals(string) ? i7 : "DESCRIPTIONS".equals(string) ? 3 : "CHAPTERS".equals(string) ? i10 : "METADATA".equals(string) ? 5 : -1;
                } else {
                    i6 = i9;
                }
                if (jSONObject3.has("roles")) {
                    sho1 sho1Var = yho1.g;
                    Object[] objArrCopyOf = new Object[i10];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i13 = i9;
                    int i14 = i13;
                    while (i13 < jSONArray2.length()) {
                        String strOptString3 = jSONArray2.optString(i13);
                        strOptString3.getClass();
                        int length = objArrCopyOf.length;
                        int i15 = i14 + 1;
                        int iW = ejo1.w(length, i15);
                        if (iW > length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iW);
                        }
                        objArrCopyOf[i14] = strOptString3;
                        i13++;
                        i14 = i15;
                    }
                    listQ = yho1.q(i14, objArrCopyOf);
                } else {
                    listQ = null;
                }
                arrayList.add(new MediaTrack(j, i12, strA, strA2, strA3, strA4, i6, listQ, jSONObject3.optJSONObject("customData")));
                i11++;
                i10 = 4;
                i7 = 2;
                i8 = 1;
                i9 = 0;
            }
            this.f = new ArrayList(arrayList);
        } else {
            this.f = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            see1 see1Var = new see1(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            see1Var.a = (float) jSONObject4.optDouble("fontScale", 1.0d);
            see1Var.b = see1.j(jSONObject4.optString("foregroundColor"));
            see1Var.c = see1.j(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    see1Var.d = 0;
                } else {
                    if ("OUTLINE".equals(string2)) {
                        i5 = 1;
                    } else if ("DROP_SHADOW".equals(string2)) {
                        i5 = 2;
                    } else if ("RAISED".equals(string2)) {
                        i5 = 3;
                    } else if ("DEPRESSED".equals(string2)) {
                        see1Var.d = 4;
                    }
                    see1Var.d = i5;
                }
            }
            see1Var.e = see1.j(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    see1Var.f = 0;
                } else if ("NORMAL".equals(string3)) {
                    see1Var.f = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i = 2;
                    see1Var.f = 2;
                }
                i = 2;
            } else {
                i = 2;
            }
            see1Var.g = see1.j(jSONObject4.optString("windowColor"));
            if (see1Var.f == i) {
                see1Var.h = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            see1Var.i = o4e.a("fontFamily", jSONObject4);
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    see1Var.t = 0;
                } else {
                    if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                        i4 = 1;
                    } else if ("SERIF".equals(string4)) {
                        i4 = 2;
                    } else if ("MONOSPACED_SERIF".equals(string4)) {
                        i4 = 3;
                    } else {
                        if ("CASUAL".equals(string4)) {
                            i3 = 4;
                        } else if ("CURSIVE".equals(string4)) {
                            i3 = 5;
                        } else if ("SMALL_CAPITALS".equals(string4)) {
                            see1Var.t = 6;
                        }
                        see1Var.t = i3;
                    }
                    see1Var.t = i4;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    see1Var.X = 0;
                } else {
                    if ("BOLD".equals(string5)) {
                        i2 = 1;
                    } else if ("ITALIC".equals(string5)) {
                        i2 = 2;
                    } else if ("BOLD_ITALIC".equals(string5)) {
                        i2 = 3;
                    }
                    see1Var.X = i2;
                }
            }
            see1Var.Z = jSONObject4.optJSONObject("customData");
            this.g = see1Var;
            jti1Var = null;
        } else {
            jti1Var = null;
            this.g = null;
        }
        j(jSONObject);
        this.R0 = jSONObject.optJSONObject("customData");
        this.X = o4e.a("entity", jSONObject);
        this.N0 = o4e.a("atvEntity", jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.Y = jSONObjectOptJSONObject == null ? jti1Var : new jti1(o4e.a("adTagUrl", jSONObjectOptJSONObject), o4e.a("adsResponse", jSONObjectOptJSONObject));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0) {
                this.Z = (long) (dOptDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.O0 = jSONObject.optString("contentUrl");
        }
        this.P0 = o4e.a("hlsSegmentFormat", jSONObject);
        this.Q0 = o4e.a("hlsVideoSegmentFormat", jSONObject);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.R0;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.R0;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oha0.a(jSONObject, jSONObject2)) && o4e.c(this.a, mediaInfo.a) && this.b == mediaInfo.b && o4e.c(this.c, mediaInfo.c) && o4e.c(this.d, mediaInfo.d) && this.e == mediaInfo.e && o4e.c(this.f, mediaInfo.f) && o4e.c(this.g, mediaInfo.g) && o4e.c(this.i, mediaInfo.i) && o4e.c(this.t, mediaInfo.t) && o4e.c(this.X, mediaInfo.X) && o4e.c(this.Y, mediaInfo.Y) && this.Z == mediaInfo.Z && o4e.c(this.N0, mediaInfo.N0) && o4e.c(this.O0, mediaInfo.O0) && o4e.c(this.P0, mediaInfo.P0) && o4e.c(this.Q0, mediaInfo.Q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Long.valueOf(this.e), String.valueOf(this.R0), this.f, this.g, this.i, this.t, this.X, this.Y, Long.valueOf(this.Z), this.N0, this.P0, this.Q0});
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4 A[LOOP:0: B:5:0x0024->B:33:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ad A[SYNTHETIC] */
    public final void j(JSONObject jSONObject) throws JSONException {
        long j;
        mi0 mi0Var;
        ni0 ni0Var;
        long j2 = 1000;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    j = j2;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j3 = jSONObject2.getLong("position");
                        Pattern pattern = o4e.a;
                        long j4 = j3 * j2;
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jOptLong = jSONObject2.optLong("duration") * j2;
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            j = j2;
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                try {
                                    strArr[i2] = jSONArrayOptJSONArray.getString(i2);
                                } catch (JSONException e) {
                                    e = e;
                                    e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    ni0Var = null;
                                }
                            }
                        } else {
                            j = j2;
                        }
                        ni0Var = new ni0(j4, string, jOptLong, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e2) {
                        e = e2;
                        j = j2;
                    }
                    if (ni0Var != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(ni0Var);
                        i++;
                        j2 = j;
                    }
                } else {
                    j = j2;
                }
                ni0Var = null;
                if (ni0Var != null) {
                    arrayList.clear();
                    break;
                } else {
                    arrayList.add(ni0Var);
                    i++;
                    j2 = j;
                }
            }
            this.i = new ArrayList(arrayList);
        } else {
            j = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jOptLong2 = jSONObject3.optLong("duration") * j;
                        String strA = o4e.a("clickThroughUrl", jSONObject3);
                        String strA2 = o4e.a("contentUrl", jSONObject3);
                        String strA3 = o4e.a("mimeType", jSONObject3);
                        if (strA3 == null) {
                            strA3 = o4e.a("contentType", jSONObject3);
                        }
                        String str = strA3;
                        String strA4 = o4e.a("title", jSONObject3);
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                        String strA5 = o4e.a("contentId", jSONObject3);
                        String strA6 = o4e.a("posterUrl", jSONObject3);
                        long jIntValue = jSONObject3.has("whenSkippable") ? ((long) ((Integer) jSONObject3.get("whenSkippable")).intValue()) * j : -1L;
                        String strA7 = o4e.a("hlsSegmentFormat", jSONObject3);
                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        mi0Var = new mi0(string2, strA4, jOptLong2, strA2, str, strA, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), strA5, strA6, jIntValue, strA7, jSONObjectOptJSONObject2 == null ? null : new jti1(o4e.a("adTagUrl", jSONObjectOptJSONObject2), o4e.a("adsResponse", jSONObjectOptJSONObject2)));
                    } catch (JSONException e3) {
                        e3.getMessage();
                        Locale locale2 = Locale.ROOT;
                        mi0Var = null;
                    }
                } else {
                    mi0Var = null;
                }
                if (mi0Var == null) {
                    arrayList2.clear();
                    break;
                }
                arrayList2.add(mi0Var);
            }
            this.t = new ArrayList(arrayList2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.R0;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int iL = j541.L(20293, parcel);
        String str = this.a;
        if (str == null) {
            str = "";
        }
        j541.F(parcel, 2, str);
        j541.K(parcel, 3, 4);
        parcel.writeInt(this.b);
        j541.F(parcel, 4, this.c);
        j541.E(parcel, 5, this.d, i);
        j541.K(parcel, 6, 8);
        parcel.writeLong(this.e);
        j541.J(parcel, 7, this.f);
        j541.E(parcel, 8, this.g, i);
        j541.F(parcel, 9, this.h);
        List list = this.i;
        j541.J(parcel, 10, list == null ? null : Collections.unmodifiableList(list));
        List list2 = this.t;
        j541.J(parcel, 11, list2 != null ? Collections.unmodifiableList(list2) : null);
        j541.F(parcel, 12, this.X);
        j541.E(parcel, 13, this.Y, i);
        j541.K(parcel, 14, 8);
        parcel.writeLong(this.Z);
        j541.F(parcel, 15, this.N0);
        j541.F(parcel, 16, this.O0);
        j541.F(parcel, 17, this.P0);
        j541.F(parcel, 18, this.Q0);
        j541.M(iL, parcel);
    }

    public MediaInfo(String str, int i, String str2, sqh0 sqh0Var, long j, ArrayList arrayList, see1 see1Var, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, jti1 jti1Var, long j2, String str5, String str6, String str7, String str8) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = sqh0Var;
        this.e = j;
        this.f = arrayList;
        this.g = see1Var;
        this.h = str3;
        if (str3 != null) {
            try {
                this.R0 = new JSONObject(this.h);
            } catch (JSONException unused) {
                this.R0 = null;
                this.h = null;
            }
        } else {
            this.R0 = null;
        }
        this.i = arrayList2;
        this.t = arrayList3;
        this.X = str4;
        this.Y = jti1Var;
        this.Z = j2;
        this.N0 = str5;
        this.O0 = str6;
        this.P0 = str7;
        this.Q0 = str8;
        if (this.a == null && str6 == null && str4 == null) {
            hhg1.n("Either contentID or contentUrl or entity should be set");
            throw null;
        }
    }
}
