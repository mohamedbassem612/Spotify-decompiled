package p;

import android.util.Base64;
import android.util.JsonReader;
import android.view.contentcapture.ContentCaptureSession;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class eqg implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ eqg(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession b(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static /* synthetic */ void c(String str, Object obj, Object obj2, Object obj3) throws i9n {
        throw new i9n(str + obj + obj2 + obj3 + ')');
    }

    public Object a(Object obj, Object obj2) {
        qop qopVar = (qop) obj;
        switch (this.a) {
            case 0:
                jbt jbtVar = (jbt) obj2;
                qopVar.getClass();
                jbtVar.getClass();
                return new dqg(new x2p(qopVar, jbtVar).b);
            case 6:
                lbt lbtVar = (lbt) obj2;
                qopVar.getClass();
                lbtVar.getClass();
                return new jgm(lbtVar, (s8p) iy81.a(new fyo((byte) 10)).get());
            case 7:
                ybt ybtVar = (ybt) obj2;
                qopVar.getClass();
                ybtVar.getClass();
                return new ejm(ybtVar, (s8p) iy81.a(new fyo((byte) 11)).get());
            case 9:
                qopVar.getClass();
                ((gl90) obj2).getClass();
                return new wmm(qopVar.d(), (t8p) iy81.a(new fyo((byte) 12)).get());
            case 10:
                qopVar.getClass();
                ((gzu0) obj2).getClass();
                return new uo7((byte) 1);
            default:
                qopVar.getClass();
                ((gzu0) obj2).getClass();
                return new ymm((byte) 0);
        }
    }

    public Object apply(Object obj) {
        Object obj2;
        nmr0 nmr0Var = (nmr0) obj;
        Object obj3 = nmr0Var.a;
        if (obj3 == null || (obj2 = nmr0Var.b) == null) {
            qq5.Companion.getClass();
            return qq5.m;
        }
        PlayerState playerState = (PlayerState) obj3;
        playerState.getClass();
        return new qq5((iun0) obj2, playerState);
    }

    public Object d(JsonReader jsonReader) throws IOException {
        switch (this.a) {
            case 13:
                yy8 yy8Var = new yy8();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    strNextName.getClass();
                    switch (strNextName) {
                        case "libraryName":
                            yy8Var.i(jsonReader.nextString());
                            break;
                        case "arch":
                            yy8Var.e(jsonReader.nextString());
                            break;
                        case "buildId":
                            yy8Var.f(jsonReader.nextString());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return yy8Var.c();
            case 14:
                jsonReader.beginObject();
                String strNextString = null;
                byte[] bArrDecode = null;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("filename")) {
                        strNextString = jsonReader.nextString();
                        if (strNextString == null) {
                            bhn0.i("Null filename");
                            return null;
                        }
                    } else if (strNextName2.equals("contents")) {
                        bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                        if (bArrDecode == null) {
                            bhn0.i("Null contents");
                            return null;
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (strNextString != null && bArrDecode != null) {
                    return new ez8(strNextString, bArrDecode);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" filename");
                }
                if (bArrDecode == null) {
                    sb.append(" contents");
                }
                eg.m(l1d.p(sb, "Missing required properties:"));
                return null;
            case 15:
                f09 f09Var = new f09();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName3 = jsonReader.nextName();
                    strNextName3.getClass();
                    switch (strNextName3) {
                        case "parameterKey":
                            f09Var.b(jsonReader.nextString());
                            break;
                        case "templateVersion":
                            f09Var.c(jsonReader.nextLong());
                            break;
                        case "rolloutVariant":
                            jsonReader.beginObject();
                            String strNextString2 = null;
                            String strNextString3 = null;
                            while (jsonReader.hasNext()) {
                                String strNextName4 = jsonReader.nextName();
                                strNextName4.getClass();
                                if (strNextName4.equals("variantId")) {
                                    strNextString3 = jsonReader.nextString();
                                    if (strNextString3 == null) {
                                        bhn0.i("Null variantId");
                                        return null;
                                    }
                                } else if (strNextName4.equals("rolloutId")) {
                                    strNextString2 = jsonReader.nextString();
                                    if (strNextString2 == null) {
                                        bhn0.i("Null rolloutId");
                                        return null;
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                            jsonReader.endObject();
                            if (strNextString2 != null && strNextString3 != null) {
                                f09Var.a = new h09(strNextString2, strNextString3);
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                if (strNextString2 == null) {
                                    sb2.append(" rolloutId");
                                }
                                if (strNextString3 == null) {
                                    sb2.append(" variantId");
                                }
                                eg.m(l1d.p(sb2, "Missing required properties:"));
                                return null;
                            }
                            break;
                        case "parameterValue":
                            String strNextString4 = jsonReader.nextString();
                            if (strNextString4 == null) {
                                bhn0.i("Null parameterValue");
                                break;
                            } else {
                                f09Var.c = strNextString4;
                                break;
                            }
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return f09Var.a();
            case 16:
                wz8 wz8Var = new wz8();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName5 = jsonReader.nextName();
                    strNextName5.getClass();
                    switch (strNextName5) {
                        case "frames":
                            wz8Var.b(xin.b(jsonReader, new eqg((byte) 18)));
                            break;
                        case "name":
                            wz8Var.d(jsonReader.nextString());
                            break;
                        case "importance":
                            wz8Var.c(jsonReader.nextInt());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return wz8Var.a();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qz8 qz8Var = new qz8();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.getClass();
                    switch (strNextName6) {
                        case "name":
                            qz8Var.c(jsonReader.nextString());
                            break;
                        case "size":
                            qz8Var.d(jsonReader.nextLong());
                            break;
                        case "uuid":
                            qz8Var.d = new String(Base64.decode(jsonReader.nextString(), 2), vin.a);
                            break;
                        case "baseAddress":
                            qz8Var.b(jsonReader.nextLong());
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                return qz8Var.a();
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return xin.f(jsonReader);
            default:
                return xin.f(jsonReader);
        }
    }
}
