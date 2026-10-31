package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.media3.common.ParserException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jxa implements c290, Function, BiFunction, t38, jrn0, jgi0, ya, p2r0, uzr0, w710, h271 {
    public final /* synthetic */ byte a;

    public static boolean D(String str) {
        blc0 m231Var;
        try {
            Set set = s4b1.f;
            m231Var = uic.x(str).c;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var == blc0.T3 || nhc1.Y(str, "spotify:list:liked-songs-artist:", false);
    }

    public static String E(String str) {
        String m231Var;
        String m231Var2;
        try {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str);
            try {
                m231Var2 = s4b1VarX.h();
            } catch (Throwable th) {
                m231Var2 = new m231(th);
            }
            if (m231Var2 instanceof m231) {
                m231Var2 = null;
            }
            String str2 = m231Var2;
            if (str2 == null) {
                m231Var = null;
            } else {
                if (ihc1.y0(str2)) {
                    str2 = null;
                }
                if (str2 == null) {
                    m231Var = null;
                } else {
                    String strS = s4b1VarX.s();
                    if (strS == null) {
                        strS = "@";
                    }
                    m231Var = gvg.h("spotify:user:", Uri.encode(strS), ":collection:artist:", str2);
                }
            }
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        String str3 = m231Var;
        if (str3 == null) {
            return str;
        }
        String str4 = ihc1.y0(str3) ? null : str3;
        return str4 != null ? str4 : str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void F(JsonReader jsonReader, v280 v280Var) throws ParserException, IOException {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                jsonReader.beginObject();
                String strNextString = null;
                String strNextString2 = null;
                oub1 oub1Var = null;
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    if (strNextName.equals("BASE-ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString = jsonReader.nextString();
                    } else if (strNextName.equals("ID") && jsonReader.peek().equals(JsonToken.STRING)) {
                        strNextString2 = jsonReader.nextString();
                    } else if (strNextName.equals("URI-REPLACEMENT") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                        jsonReader.beginObject();
                        HashMap map = new HashMap();
                        HashMap map2 = new HashMap();
                        HashMap map3 = new HashMap();
                        String strNextString3 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            if (strNextName2.equals("HOST") && jsonReader.peek().equals(JsonToken.STRING)) {
                                strNextString3 = jsonReader.nextString();
                                if (strNextString3.isEmpty()) {
                                    throw ParserException.c("The HOST string is present but empty");
                                }
                            } else if (strNextName2.equals("PARAMS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName3 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map.put(strNextName3, jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-VARIANT-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map2.put(strNextName4, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else if (strNextName2.equals("PER-RENDITION-URIS") && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    if (jsonReader.peek().equals(JsonToken.STRING)) {
                                        map3.put(strNextName5, Uri.parse(jsonReader.nextString()));
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        oub1Var = new oub1(strNextString3, map, map2, map3);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString == null) {
                    throw ParserException.c("BASE-ID field is missing in a PATHWAY-CLONE object");
                }
                if (strNextString2 == null) {
                    throw ParserException.c("ID field is missing in a PATHWAY-CLONE object");
                }
                if (oub1Var == null) {
                    throw ParserException.c("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object");
                }
                v280Var.c(new nub1(strNextString, strNextString2, oub1Var));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw ParserException.c("The PATHWAY-CLONES array is present but empty");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void H(JsonReader jsonReader, v280 v280Var) throws ParserException, IOException {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String strNextString = jsonReader.nextString();
                if (!hashSet.add(strNextString)) {
                    throw ParserException.c("The pathway ID (" + strNextString + ") appears more than once in the PATHWAY-PRIORITY array");
                }
                v280Var.c(strNextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw ParserException.c("The PATHWAY-PRIORITY array is present but empty");
        }
    }

    public static int J(e700 e700Var, oey0 oey0Var, boolean z) {
        ryy ryyVar = ryy.d;
        vvm1 vvm1Var = ryy.i;
        String str = oey0Var.h;
        c380 c380Var = oey0Var.s;
        boolean z2 = oey0Var.e;
        if (!eyo1.q(str) || !c380Var.contains(m9m.b)) {
            if (eyo1.q(str) && o7h.X0(c380Var) == m9m.d) {
                vvm1Var = ryyVar;
            } else if (eyo1.q(str)) {
                vvm1Var = z2 ? wyy.c : wyy.d;
            } else {
                Set set = s4b1.f;
                if (!uic.h(str, new blc0[]{blc0.ti, blc0.ui})) {
                    if (eyo1.t(str)) {
                        vvm1Var = ryy.h;
                    } else if (eyo1.n(str)) {
                        vvm1Var = z2 ? oyy.c : oyy.d;
                    } else if (eyo1.u(str)) {
                        vvm1Var = z2 ? tyy.c : tyy.d;
                    } else if (eyo1.o(str)) {
                        vvm1Var = ryy.c;
                    } else if (uic.g(str, blc0.C8)) {
                        vvm1Var = ryy.g;
                    } else {
                        if (!eyo1.v(str)) {
                            n57.e("Failed to determine entity type for uri: ".concat(str));
                        }
                        vvm1Var = null;
                    }
                }
            }
        }
        if (e700Var instanceof i400) {
            if (vvm1Var != null) {
                return u(vvm1Var, oey0Var, z);
            }
            return 2;
        }
        if (e700Var instanceof xwz) {
            if (!u890.j(vvm1Var, ryyVar)) {
                return 2;
            }
            String str2 = oey0Var.r;
            return (str2 == null || ihc1.y0(str2)) ? 7 : 3;
        }
        if (!e700Var.equals(l400.a)) {
            if (e700Var instanceof r300) {
                return 5;
            }
            if (e700Var instanceof ovz) {
                return 6;
            }
            eg.o();
            return 0;
        }
        if (eyo1.v(str)) {
            return 7;
        }
        if (!oey0Var.q) {
            return 4;
        }
        if (vvm1Var != null) {
            return u(vvm1Var, oey0Var, z);
        }
        return 2;
    }

    public static final float[] a(float[] fArr, fol1 fol1Var) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fol1Var.a;
        float f8 = fol1Var.b;
        float f9 = 1.0f - f;
        float f10 = f9 / f2;
        float f11 = 1.0f - f3;
        float f12 = 1.0f - f5;
        float f13 = (1.0f - f7) / f8;
        float f14 = f / f2;
        float f15 = f7 / f8;
        float f16 = (f3 / f4) - f14;
        float f17 = f15 - f14;
        float f18 = (f11 / f4) - f10;
        float f19 = (f5 / f6) - f14;
        float f20 = (((f13 - f10) * f16) - (f17 * f18)) / ((((f12 / f6) - f10) * f16) - (f18 * f19));
        float fE = ktd.e(f20, f19, f17, f16);
        float f21 = (1.0f - fE) - f20;
        float f22 = f21 / f2;
        float f23 = fE / f4;
        float f24 = f20 / f6;
        return new float[]{f * f22, f21, (f9 - f2) * f22, f3 * f23, fE, (f11 - f4) * f23, f5 * f24, f20, (f12 - f6) * f24};
    }

    public static final zqu c(zeg1 zeg1Var) {
        double d = zeg1Var.a;
        if (d == -3.0d) {
            return new ie31(zeg1Var, (byte) 0);
        }
        if (d == -2.0d) {
            return new ie31(zeg1Var, (byte) 1);
        }
        return (zeg1Var.f == 0.0d && zeg1Var.g == 0.0d) ? new ie31(zeg1Var, (byte) 2) : new ie31(zeg1Var, (byte) 3);
    }

    public static final zqu e(zeg1 zeg1Var) {
        double d = zeg1Var.a;
        if (d == -3.0d) {
            return new ie31(zeg1Var, (byte) 4);
        }
        if (d == -2.0d) {
            return new ie31(zeg1Var, (byte) 5);
        }
        return (zeg1Var.f == 0.0d && zeg1Var.g == 0.0d) ? new ie31(zeg1Var, (byte) 6) : new ie31(zeg1Var, (byte) 7);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0079 A[LOOP:1: B:23:0x0048->B:29:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080 A[SYNTHETIC] */
    public static final boolean g(float[] fArr, fol1 fol1Var, zqu zquVar, zqu zquVar2, float f, float f2, int i) {
        je31 je31Var;
        double d;
        if (i == 0) {
            return true;
        }
        float[] fArr2 = kah.a;
        float[] fArr3 = kah.a;
        if (fArr != fArr3) {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (Float.compare(fArr[i2], fArr3[i2]) == 0 || Math.abs(fArr[i2] - fArr3[i2]) <= 0.001f) {
                }
            }
            if (h5p1.u(fol1Var, dm5.e)) {
                float[] fArr4 = kah.a;
                je31Var = kah.e;
                for (d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                    if (Math.abs(zquVar.c(d) - je31Var.k.c(d)) <= 0.001d) {
                        if (Math.abs(zquVar2.c(d) - je31Var.n.c(d)) <= 0.001d) {
                        }
                    }
                    return false;
                }
                return true;
            }
        } else if (h5p1.u(fol1Var, dm5.e) && f == 0.0f && f2 == 1.0f) {
            float[] fArr5 = kah.a;
            je31Var = kah.e;
            while (d <= 1.0d) {
                if (Math.abs(zquVar.c(d) - je31Var.k.c(d)) <= 0.001d) {
                    if (Math.abs(zquVar2.c(d) - je31Var.n.c(d)) <= 0.001d) {
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void j(float f, float f2, float[] fArr) {
        float fO = o(fArr);
        float[] fArr2 = kah.a;
        if (fO / o(kah.b) > 0.9f) {
            float[] fArr3 = kah.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[2];
            float f6 = fArr[3];
            float f7 = fArr[4];
            float f8 = fArr[5];
        }
    }

    public static final float[] m(float[] fArr) {
        float[] fArr2 = new float[6];
        if (fArr.length != 9) {
            f46.X(fArr, fArr2, 6);
            return fArr2;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = f + f2 + fArr[2];
        fArr2[0] = f / f3;
        fArr2[1] = f2 / f3;
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = f4 + f5 + fArr[5];
        fArr2[2] = f4 / f6;
        fArr2[3] = f5 / f6;
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = f7 + f8 + fArr[8];
        fArr2[4] = f7 / f9;
        fArr2[5] = f8 / f9;
        return fArr2;
    }

    public static float o(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float fG = fd21.g(f, f6, (((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3), 0.5f);
        return fG < 0.0f ? -fG : fG;
    }

    public static int u(vvm1 vvm1Var, oey0 oey0Var, boolean z) {
        if (vvm1Var.equals(ryy.i) || vvm1Var.equals(ryy.g)) {
            return (z || oey0Var.q) ? 1 : 2;
        }
        if (!vvm1Var.equals(ryy.d)) {
            return 2;
        }
        String str = oey0Var.r;
        return (str == null || ihc1.y0(str)) ? 7 : 3;
    }

    public synchronized bma1 I(String str) {
        Object objU;
        try {
            LinkedHashMap linkedHashMap = rqa0.e;
            objU = linkedHashMap.get(str);
            if (objU == null) {
                objU = bma1.b.u("minichat_keyboard_accessory_draft_" + str);
                linkedHashMap.put(str, objU);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (bma1) objU;
    }

    public boolean accept(Object obj) {
        jxu0 jxu0VarC = oxu0.a.c(((ksk) obj).a);
        jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
        return u890.j(jxu0Var != null ? jxu0Var.a : null, "offline-playable-artist");
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return jc9.s((sy21) obj);
            case 9:
                return v0y.b.get(obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return cr51.d((feh) obj);
            default:
                f291 f291Var = ((eq40) obj).a;
                f291Var.getClass();
                return f291Var;
        }
    }

    public Object b(u171 u171Var) {
        Long lValueOf;
        qz61 qz61Var = u171Var.a;
        zsd zsdVar = qz61Var.c;
        if (zsdVar instanceof xsd) {
            lValueOf = Long.valueOf(((xsd) zsdVar).a.b);
        } else {
            if (!u890.j(zsdVar, ysd.a)) {
                hhg1.n("Expected Timestamp or Unknown card data");
                return null;
            }
            lValueOf = null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new k3k1(lValueOf, strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Object convert(int i) {
        oig oigVar;
        if (i != 0) {
            oigVar = i != 1 ? null : oig.c;
        } else {
            oigVar = oig.b;
        }
        return oigVar == null ? oig.d : oigVar;
    }

    public kgi0 create() {
        return new kgi0();
    }

    public Object d(Uri uri, g3r g3rVar) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(g3rVar));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw ParserException.c("Steering manifest JSON should be an object at root");
            }
            v280 v280Var = new v280(4);
            v280 v280Var2 = new v280(4);
            jsonReader.beginObject();
            Uri uri2 = null;
            int iNextInt = 1;
            long jNextInt = -9223372036854775807L;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (strNextName.equals("VERSION") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    iNextInt = jsonReader.nextInt();
                } else if (strNextName.equals("TTL") && jsonReader.peek().equals(JsonToken.NUMBER)) {
                    jNextInt = ((long) jsonReader.nextInt()) * 1000;
                } else if (strNextName.equals("RELOAD-URI") && jsonReader.peek().equals(JsonToken.STRING)) {
                    uri2 = Uri.parse(jsonReader.nextString());
                } else if (strNextName.equals("PATHWAY-PRIORITY") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    H(jsonReader, v280Var);
                } else if (strNextName.equals("PATHWAY-CLONES") && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                    F(jsonReader, v280Var2);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            bg11 bg11VarG = v280Var.g();
            if (bg11VarG.isEmpty()) {
                throw ParserException.c("PATHWAY-PRIORITY field is missing");
            }
            pub1 pub1Var = new pub1(iNextInt, jNextInt, uri2, bg11VarG, v280Var2.g());
            jsonReader.close();
            return pub1Var;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public rqw f(u710 u710Var) {
        return new eih1();
    }

    public o2r0 h(q7r0 q7r0Var, Bundle bundle) {
        return new rpv0((byte) 0);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String strO = s4b1VarX.o(2);
        if (strO != null) {
            return new hrn0(c4t0.class, new vau(strO, lvx.k(s4b1VarX), e9k.s(s4b1VarX), e9k.r(s4b1VarX), true, khc.g()), a6w0.a);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for video timestamp cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for video timestamp cards");
    }

    public String v(String str, String str2) {
        return (str2 == null || str2.length() == 0) ? xcg1.i(nik1.G4.a, ":", str) : xcg1.i(nik1.H4.b(m4c.n(str2)).a, ":", str);
    }

    public /* synthetic */ jxa(Object obj, byte b) {
        this.a = b;
    }

    public Object apply(Object obj, Object obj2) {
        spq0 spq0Var = (spq0) obj;
        return spq0Var.c() ? spq0Var : hqq0.L((List) obj2);
    }
}
