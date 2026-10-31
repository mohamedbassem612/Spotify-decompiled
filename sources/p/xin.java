package p;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xin {
    public static final wb00 a;

    static {
        aga0 aga0Var = new aga0();
        mm10.P0.a(aga0Var);
        aga0Var.d = true;
        a = new wb00(aga0Var, (byte) 23);
    }

    public static xy8 a(JsonReader jsonReader) throws IOException {
        wy8 wy8Var = new wy8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    wy8Var.b(b(jsonReader, new eqg((byte) 13)));
                    break;
                case "pid":
                    wy8Var.d(jsonReader.nextInt());
                    break;
                case "pss":
                    wy8Var.f(jsonReader.nextLong());
                    break;
                case "rss":
                    wy8Var.h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    wy8Var.i(jsonReader.nextLong());
                    break;
                case "processName":
                    wy8Var.e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    wy8Var.g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    wy8Var.j(jsonReader.nextString());
                    break;
                case "importance":
                    wy8Var.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return wy8Var.a();
    }

    public static List b(JsonReader jsonReader, eqg eqgVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(eqgVar.d(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static bz8 c(JsonReader jsonReader) throws IOException {
        az8 az8Var = new az8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                az8Var.b(jsonReader.nextString());
            } else if (strNextName.equals("value")) {
                az8Var.c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return az8Var.a();
    }

    public static mz8 d(JsonReader jsonReader) throws IOException {
        lz8 lz8Var = new lz8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    c09 c09Var = new c09();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c09Var.b(Double.valueOf(jsonReader.nextDouble()));
                                break;
                            case "batteryVelocity":
                                c09Var.c(jsonReader.nextInt());
                                break;
                            case "orientation":
                                c09Var.e(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                c09Var.d(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                c09Var.g(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                c09Var.f(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    lz8Var.c(c09Var.a());
                    break;
                case "rollouts":
                    i09 i09Var = new i09();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            i09Var.c(b(jsonReader, new eqg((byte) 15)));
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    lz8Var.e(i09Var.b());
                    break;
                case "app":
                    nz8 nz8Var = new nz8();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                nz8Var.b(Collections.unmodifiableList(arrayList));
                                break;
                            case "background":
                                nz8Var.c(Boolean.valueOf(jsonReader.nextBoolean()));
                                break;
                            case "execution":
                                zwg zwgVar = new zwg((byte) 14);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            zwgVar.B(a(jsonReader));
                                            break;
                                        case "threads":
                                            zwgVar.H(b(jsonReader, new eqg((byte) 16)));
                                            break;
                                        case "signal":
                                            uz8 uz8Var = new uz8();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        uz8Var.b(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        uz8Var.c(jsonReader.nextString());
                                                        break;
                                                    case "name":
                                                        uz8Var.d(jsonReader.nextString());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            zwgVar.G(uz8Var.a());
                                            break;
                                        case "binaries":
                                            zwgVar.C(b(jsonReader, new eqg((byte) 17)));
                                            break;
                                        case "exception":
                                            zwgVar.F(e(jsonReader));
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                nz8Var.f(zwgVar.d());
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                nz8Var.g(Collections.unmodifiableList(arrayList2));
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                nz8Var.e(Collections.unmodifiableList(arrayList3));
                                break;
                            case "uiOrientation":
                                nz8Var.h(jsonReader.nextInt());
                                break;
                            case "currentProcessDetails":
                                nz8Var.d(g(jsonReader));
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    lz8Var.b(nz8Var.a());
                    break;
                case "log":
                    vdn1 vdn1Var = new vdn1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            vdn1Var.b(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    lz8Var.d(vdn1Var.a());
                    break;
                case "type":
                    lz8Var.g(jsonReader.nextString());
                    break;
                case "timestamp":
                    lz8Var.f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return lz8Var.a();
    }

    public static tz8 e(JsonReader jsonReader) throws IOException {
        sz8 sz8Var = new sz8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    sz8Var.c(b(jsonReader, new eqg((byte) 19)));
                    break;
                case "reason":
                    sz8Var.e(jsonReader.nextString());
                    break;
                case "type":
                    sz8Var.f(jsonReader.nextString());
                    break;
                case "causedBy":
                    sz8Var.b(e(jsonReader));
                    break;
                case "overflowCount":
                    sz8Var.d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return sz8Var.a();
    }

    public static zz8 f(JsonReader jsonReader) throws IOException {
        yz8 yz8Var = new yz8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    yz8Var.d(jsonReader.nextLong());
                    break;
                case "symbol":
                    yz8Var.f(jsonReader.nextString());
                    break;
                case "pc":
                    yz8Var.e(jsonReader.nextLong());
                    break;
                case "file":
                    yz8Var.b(jsonReader.nextString());
                    break;
                case "importance":
                    yz8Var.c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return yz8Var.a();
    }

    public static b09 g(JsonReader jsonReader) throws IOException {
        a09 a09Var = new a09();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    a09Var.b = jsonReader.nextInt();
                    a09Var.e = (byte) (a09Var.e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bhn0.i("Null processName");
                        return null;
                    }
                    a09Var.a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    a09Var.d = jsonReader.nextBoolean();
                    a09Var.e = (byte) (a09Var.e | 4);
                    break;
                case "importance":
                    a09Var.c = jsonReader.nextInt();
                    a09Var.e = (byte) (a09Var.e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a09Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0241  */
    public static uy8 h(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = vin.a;
        ty8 ty8Var = new ty8();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    cz8 cz8Var = new cz8();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            cz8Var.b(b(jsonReader, new eqg((byte) 14)));
                        } else if (strNextName2.equals("orgId")) {
                            cz8Var.c(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    ty8Var.k = cz8Var.a();
                    continue;
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        bhn0.i("Null sdkVersion");
                        return null;
                    }
                    ty8Var.a = strNextString;
                    break;
                    break;
                case "appQualitySessionId":
                    ty8Var.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    ty8Var.l = a(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        bhn0.i("Null buildVersion");
                        return null;
                    }
                    ty8Var.h = strNextString2;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    ty8Var.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        bhn0.i("Null gmpAppId");
                        return null;
                    }
                    ty8Var.b = strNextString3;
                    break;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        bhn0.i("Null installationUuid");
                        return null;
                    }
                    ty8Var.d = strNextString4;
                    break;
                    break;
                case "firebaseInstallationId":
                    ty8Var.e = jsonReader.nextString();
                    break;
                case "platform":
                    ty8Var.c = jsonReader.nextInt();
                    ty8Var.m = (byte) (ty8Var.m | 1);
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        bhn0.i("Null displayVersion");
                        return null;
                    }
                    ty8Var.i = strNextString5;
                    break;
                    break;
                case "session":
                    fz8 fz8Var = new fz8();
                    fz8Var.f = false;
                    fz8Var.m = (byte) (fz8Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                fz8Var.d = jsonReader.nextLong();
                                fz8Var.m = (byte) (fz8Var.m | 1);
                                break;
                            case "appQualitySessionId":
                                fz8Var.c = jsonReader.nextString();
                                break;
                            case "identifier":
                                fz8Var.b = new String(Base64.decode(jsonReader.nextString(), 2), vin.a);
                                break;
                            case "endedAt":
                                fz8Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                jz8 jz8Var = new jz8();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            jz8Var.f = jsonReader.nextBoolean();
                                            jz8Var.j = (byte) (jz8Var.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                bhn0.i("Null manufacturer");
                                                return null;
                                            }
                                            jz8Var.h = strNextString6;
                                            break;
                                            break;
                                        case "ram":
                                            jz8Var.d = jsonReader.nextLong();
                                            jz8Var.j = (byte) (jz8Var.j | 4);
                                            break;
                                        case "arch":
                                            jz8Var.a = jsonReader.nextInt();
                                            jz8Var.j = (byte) (jz8Var.j | 1);
                                            break;
                                        case "diskSpace":
                                            jz8Var.e = jsonReader.nextLong();
                                            jz8Var.j = (byte) (jz8Var.j | 8);
                                            break;
                                        case "cores":
                                            jz8Var.c = jsonReader.nextInt();
                                            jz8Var.j = (byte) (jz8Var.j | 2);
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                bhn0.i("Null model");
                                                return null;
                                            }
                                            jz8Var.b = strNextString7;
                                            break;
                                            break;
                                        case "state":
                                            jz8Var.g = jsonReader.nextInt();
                                            jz8Var.j = (byte) (jz8Var.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                bhn0.i("Null modelClass");
                                                return null;
                                            }
                                            jz8Var.i = strNextString8;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz8Var.j = jz8Var.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                fz8Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                k09 k09Var = new k09();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                bhn0.i("Null buildVersion");
                                                return null;
                                            }
                                            k09Var.c = strNextString9;
                                            break;
                                            break;
                                        case "jailbroken":
                                            k09Var.d = jsonReader.nextBoolean();
                                            k09Var.e = (byte) (k09Var.e | 2);
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                bhn0.i("Null version");
                                                return null;
                                            }
                                            k09Var.b = strNextString10;
                                            break;
                                            break;
                                        case "platform":
                                            k09Var.a = jsonReader.nextInt();
                                            k09Var.e = (byte) (k09Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz8Var.i = k09Var.a();
                                break;
                            case "app":
                                p2o0 p2o0Var = new p2o0((byte) 6);
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            p2o0Var.S(jsonReader.nextString());
                                            break;
                                        case 1:
                                            p2o0Var.P(jsonReader.nextString());
                                            break;
                                        case 2:
                                            p2o0Var.Q(jsonReader.nextString());
                                            break;
                                        case 3:
                                            p2o0Var.U(jsonReader.nextString());
                                            break;
                                        case 4:
                                            p2o0Var.T(jsonReader.nextString());
                                            break;
                                        case 5:
                                            p2o0Var.R(jsonReader.nextString());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                fz8Var.g = p2o0Var.l();
                                break;
                            case "user":
                                gap1 gap1Var = new gap1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        gap1Var.d(jsonReader.nextString());
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                fz8Var.h = gap1Var.b();
                                break;
                            case "generator":
                                String strNextString11 = jsonReader.nextString();
                                if (strNextString11 == null) {
                                    bhn0.i("Null generator");
                                    return null;
                                }
                                fz8Var.a = strNextString11;
                                break;
                                break;
                            case "crashed":
                                fz8Var.f = jsonReader.nextBoolean();
                                fz8Var.m = (byte) (fz8Var.m | 2);
                                break;
                            case "generatorType":
                                fz8Var.l = jsonReader.nextInt();
                                fz8Var.m = (byte) (fz8Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    ty8Var.j = fz8Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return ty8Var.a();
    }

    public static uy8 i(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                uy8 uy8VarH = h(jsonReader);
                jsonReader.close();
                return uy8VarH;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
