package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gyl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new pol((byte) 21);
    public Double N0;
    public String O0;
    public String P0;
    public String Q0;
    public String R0;
    public String S0;
    public Double T0;
    public Double U0;
    public final ArrayList V0 = new ArrayList();
    public final HashMap W0 = new HashMap();
    public Double X;
    public Double Y;
    public Integer Z;
    public int a;
    public Double b;
    public Double c;
    public int d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String t;

    public final JSONObject a() {
        ArrayList arrayList = this.V0;
        String str = this.S0;
        String str2 = this.R0;
        String str3 = this.Q0;
        String str4 = this.P0;
        String str5 = this.O0;
        String str6 = this.t;
        String str7 = this.g;
        String str8 = this.f;
        String str9 = this.e;
        HashMap map = this.W0;
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.a;
            if (i != 0) {
                f4t f4tVar = f4t.b;
                jSONObject.put("$content_schema", i3a.s(i));
            }
            Double d = this.b;
            if (d != null) {
                f4t f4tVar2 = f4t.b;
                jSONObject.put("$quantity", d);
            }
            Double d2 = this.c;
            if (d2 != null) {
                f4t f4tVar3 = f4t.b;
                jSONObject.put("$price", d2);
            }
            int i2 = this.d;
            if (i2 != 0) {
                f4t f4tVar4 = f4t.b;
                jSONObject.put("$currency", pzm.a(i2));
            }
            if (!TextUtils.isEmpty(str9)) {
                f4t f4tVar5 = f4t.b;
                jSONObject.put("$sku", str9);
            }
            if (!TextUtils.isEmpty(str8)) {
                f4t f4tVar6 = f4t.b;
                jSONObject.put("$product_name", str8);
            }
            if (!TextUtils.isEmpty(str7)) {
                f4t f4tVar7 = f4t.b;
                jSONObject.put("$product_brand", str7);
            }
            int i3 = this.h;
            if (i3 != 0) {
                f4t f4tVar8 = f4t.b;
                jSONObject.put("$product_category", lzu0.c(i3));
            }
            int i4 = this.i;
            if (i4 != 0) {
                f4t f4tVar9 = f4t.b;
                jSONObject.put("$condition", ydh.p(i4));
            }
            if (!TextUtils.isEmpty(str6)) {
                f4t f4tVar10 = f4t.b;
                jSONObject.put("$product_variant", str6);
            }
            Double d3 = this.X;
            if (d3 != null) {
                f4t f4tVar11 = f4t.b;
                jSONObject.put("$rating", d3);
            }
            Double d4 = this.Y;
            if (d4 != null) {
                f4t f4tVar12 = f4t.b;
                jSONObject.put("$rating_average", d4);
            }
            Integer num = this.Z;
            if (num != null) {
                f4t f4tVar13 = f4t.b;
                jSONObject.put("$rating_count", num);
            }
            Double d5 = this.N0;
            if (d5 != null) {
                f4t f4tVar14 = f4t.b;
                jSONObject.put("$rating_max", d5);
            }
            if (!TextUtils.isEmpty(str5)) {
                f4t f4tVar15 = f4t.b;
                jSONObject.put("$address_street", str5);
            }
            if (!TextUtils.isEmpty(str4)) {
                f4t f4tVar16 = f4t.b;
                jSONObject.put("$address_city", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                f4t f4tVar17 = f4t.b;
                jSONObject.put("$address_region", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                f4t f4tVar18 = f4t.b;
                jSONObject.put("$address_country", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                f4t f4tVar19 = f4t.b;
                jSONObject.put("$address_postal_code", str);
            }
            Double d6 = this.T0;
            if (d6 != null) {
                f4t f4tVar20 = f4t.b;
                jSONObject.put("$latitude", d6);
            }
            Double d7 = this.U0;
            if (d7 != null) {
                f4t f4tVar21 = f4t.b;
                jSONObject.put("$longitude", d7);
            }
            if (arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                f4t f4tVar22 = f4t.b;
                jSONObject.put("$image_captions", jSONArray);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
            }
            if (map.size() > 0) {
                for (String str10 : map.keySet()) {
                    jSONObject.put(str10, map.get(str10));
                }
            }
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        parcel.writeString(i2 != 0 ? i3a.s(i2) : "");
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        int i3 = this.d;
        if (i3 != 0) {
            switch (i3) {
                case 1:
                    str = "AED";
                    break;
                case 2:
                    str = "AFN";
                    break;
                case 3:
                    str = "ALL";
                    break;
                case 4:
                    str = "AMD";
                    break;
                case 5:
                    str = "ANG";
                    break;
                case 6:
                    str = "AOA";
                    break;
                case 7:
                    str = "ARS";
                    break;
                case 8:
                    str = "AUD";
                    break;
                case 9:
                    str = "AWG";
                    break;
                case 10:
                    str = "AZN";
                    break;
                case 11:
                    str = "BAM";
                    break;
                case 12:
                    str = "BBD";
                    break;
                case 13:
                    str = "BDT";
                    break;
                case 14:
                    str = "BGN";
                    break;
                case 15:
                    str = "BHD";
                    break;
                case 16:
                    str = "BIF";
                    break;
                case 17:
                    str = "BMD";
                    break;
                case 18:
                    str = "BND";
                    break;
                case 19:
                    str = "BOB";
                    break;
                case 20:
                    str = "BOV";
                    break;
                case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                    str = "BRL";
                    break;
                case 22:
                    str = "BSD";
                    break;
                case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                    str = "BTN";
                    break;
                case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                    str = "BWP";
                    break;
                case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                    str = "BYN";
                    break;
                case 26:
                    str = "BYR";
                    break;
                case 27:
                    str = "BZD";
                    break;
                case 28:
                    str = "CAD";
                    break;
                case 29:
                    str = "CDF";
                    break;
                case 30:
                    str = "CHE";
                    break;
                case 31:
                    str = "CHF";
                    break;
                case 32:
                    str = "CHW";
                    break;
                case 33:
                    str = "CLF";
                    break;
                case 34:
                    str = "CLP";
                    break;
                case 35:
                    str = "CNY";
                    break;
                case 36:
                    str = "COP";
                    break;
                case 37:
                    str = "COU";
                    break;
                case 38:
                    str = "CRC";
                    break;
                case 39:
                    str = "CUC";
                    break;
                case 40:
                    str = "CUP";
                    break;
                case 41:
                    str = "CVE";
                    break;
                case 42:
                    str = "CZK";
                    break;
                case 43:
                    str = "DJF";
                    break;
                case 44:
                    str = "DKK";
                    break;
                case 45:
                    str = "DOP";
                    break;
                case 46:
                    str = "DZD";
                    break;
                case 47:
                    str = "EGP";
                    break;
                case 48:
                    str = "ERN";
                    break;
                case 49:
                    str = "ETB";
                    break;
                case 50:
                    str = "EUR";
                    break;
                case 51:
                    str = "FJD";
                    break;
                case 52:
                    str = "FKP";
                    break;
                case 53:
                    str = "GBP";
                    break;
                case 54:
                    str = "GEL";
                    break;
                case 55:
                    str = "GHS";
                    break;
                case 56:
                    str = "GIP";
                    break;
                case 57:
                    str = "GMD";
                    break;
                case 58:
                    str = "GNF";
                    break;
                case 59:
                    str = "GTQ";
                    break;
                case 60:
                    str = "GYD";
                    break;
                case 61:
                    str = "HKD";
                    break;
                case 62:
                    str = "HNL";
                    break;
                case 63:
                    str = "HRK";
                    break;
                case 64:
                    str = "HTG";
                    break;
                case 65:
                    str = "HUF";
                    break;
                case 66:
                    str = "IDR";
                    break;
                case 67:
                    str = "ILS";
                    break;
                case 68:
                    str = "INR";
                    break;
                case 69:
                    str = "IQD";
                    break;
                case 70:
                    str = "IRR";
                    break;
                case 71:
                    str = "ISK";
                    break;
                case 72:
                    str = "JMD";
                    break;
                case 73:
                    str = "JOD";
                    break;
                case 74:
                    str = "JPY";
                    break;
                case 75:
                    str = "KES";
                    break;
                case 76:
                    str = "KGS";
                    break;
                case 77:
                    str = "KHR";
                    break;
                case 78:
                    str = "KMF";
                    break;
                case 79:
                    str = "KPW";
                    break;
                case 80:
                    str = "KRW";
                    break;
                case 81:
                    str = "KWD";
                    break;
                case 82:
                    str = "KYD";
                    break;
                case 83:
                    str = "KZT";
                    break;
                case 84:
                    str = "LAK";
                    break;
                case 85:
                    str = "LBP";
                    break;
                case 86:
                    str = "LKR";
                    break;
                case 87:
                    str = "LRD";
                    break;
                case 88:
                    str = "LSL";
                    break;
                case 89:
                    str = "LYD";
                    break;
                case 90:
                    str = "MAD";
                    break;
                case 91:
                    str = "MDL";
                    break;
                case 92:
                    str = "MGA";
                    break;
                case 93:
                    str = "MKD";
                    break;
                case 94:
                    str = "MMK";
                    break;
                case 95:
                    str = "MNT";
                    break;
                case 96:
                    str = "MOP";
                    break;
                case 97:
                    str = "MRO";
                    break;
                case 98:
                    str = "MUR";
                    break;
                case 99:
                    str = "MVR";
                    break;
                case GetCheckoutPageResponse.UcbCheckout.BillingProvider.QUEBEC_STUDENT_TRIAL_TERM_FIELD_NUMBER /* 100 */:
                    str = "MWK";
                    break;
                case 101:
                    str = "MXN";
                    break;
                case 102:
                    str = "MXV";
                    break;
                case 103:
                    str = "MYR";
                    break;
                case 104:
                    str = "MZN";
                    break;
                case 105:
                    str = "NAD";
                    break;
                case 106:
                    str = "NGN";
                    break;
                case 107:
                    str = "NIO";
                    break;
                case 108:
                    str = "NOK";
                    break;
                case 109:
                    str = "NPR";
                    break;
                case 110:
                    str = "NZD";
                    break;
                case 111:
                    str = "OMR";
                    break;
                case 112:
                    str = "PAB";
                    break;
                case 113:
                    str = "PEN";
                    break;
                case 114:
                    str = "PGK";
                    break;
                case 115:
                    str = "PHP";
                    break;
                case 116:
                    str = "PKR";
                    break;
                case 117:
                    str = "PLN";
                    break;
                case 118:
                    str = "PYG";
                    break;
                case 119:
                    str = "QAR";
                    break;
                case 120:
                    str = "RON";
                    break;
                case 121:
                    str = "RSD";
                    break;
                case 122:
                    str = "RUB";
                    break;
                case 123:
                    str = "RWF";
                    break;
                case 124:
                    str = "SAR";
                    break;
                case 125:
                    str = "SBD";
                    break;
                case 126:
                    str = "SCR";
                    break;
                case 127:
                    str = "SDG";
                    break;
                case 128:
                    str = "SEK";
                    break;
                case 129:
                    str = "SGD";
                    break;
                case 130:
                    str = "SHP";
                    break;
                case 131:
                    str = "SLL";
                    break;
                case 132:
                    str = "SOS";
                    break;
                case 133:
                    str = "SRD";
                    break;
                case 134:
                    str = "SSP";
                    break;
                case 135:
                    str = "STD";
                    break;
                case 136:
                    str = "SYP";
                    break;
                case 137:
                    str = "SZL";
                    break;
                case 138:
                    str = "THB";
                    break;
                case 139:
                    str = "TJS";
                    break;
                case 140:
                    str = "TMT";
                    break;
                case 141:
                    str = "TND";
                    break;
                case 142:
                    str = "TOP";
                    break;
                case 143:
                    str = "TRY";
                    break;
                case 144:
                    str = "TTD";
                    break;
                case 145:
                    str = "TWD";
                    break;
                case 146:
                    str = "TZS";
                    break;
                case 147:
                    str = "UAH";
                    break;
                case 148:
                    str = "UGX";
                    break;
                case 149:
                    str = "USD";
                    break;
                case 150:
                    str = "USN";
                    break;
                case 151:
                    str = "UYI";
                    break;
                case 152:
                    str = "UYU";
                    break;
                case 153:
                    str = "UZS";
                    break;
                case 154:
                    str = "VEF";
                    break;
                case 155:
                    str = "VND";
                    break;
                case 156:
                    str = "VUV";
                    break;
                case 157:
                    str = "WST";
                    break;
                case 158:
                    str = "XAF";
                    break;
                case 159:
                    str = "XAG";
                    break;
                case 160:
                    str = "XAU";
                    break;
                case 161:
                    str = "XBA";
                    break;
                case 162:
                    str = "XBB";
                    break;
                case 163:
                    str = "XBC";
                    break;
                case 164:
                    str = "XBD";
                    break;
                case 165:
                    str = "XCD";
                    break;
                case 166:
                    str = "XDR";
                    break;
                case 167:
                    str = "XFU";
                    break;
                case 168:
                    str = "XOF";
                    break;
                case 169:
                    str = "XPD";
                    break;
                case 170:
                    str = "XPF";
                    break;
                case 171:
                    str = "XPT";
                    break;
                case 172:
                    str = "XSU";
                    break;
                case 173:
                    str = "XTS";
                    break;
                case 174:
                    str = "XUA";
                    break;
                case 175:
                    str = "XXX";
                    break;
                case 176:
                    str = "YER";
                    break;
                case 177:
                    str = "ZAR";
                    break;
                case 178:
                    str = "ZMW";
                    break;
                default:
                    throw null;
            }
        } else {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        int i4 = this.h;
        parcel.writeString(i4 != 0 ? lzu0.c(i4) : "");
        int i5 = this.i;
        parcel.writeString(i5 != 0 ? ydh.p(i5) : "");
        parcel.writeString(this.t);
        parcel.writeSerializable(this.X);
        parcel.writeSerializable(this.Y);
        parcel.writeSerializable(this.Z);
        parcel.writeSerializable(this.N0);
        parcel.writeString(this.O0);
        parcel.writeString(this.P0);
        parcel.writeString(this.Q0);
        parcel.writeString(this.R0);
        parcel.writeString(this.S0);
        parcel.writeSerializable(this.T0);
        parcel.writeSerializable(this.U0);
        parcel.writeSerializable(this.V0);
        parcel.writeSerializable(this.W0);
    }
}
