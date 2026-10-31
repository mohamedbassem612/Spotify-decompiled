package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w8b implements ct80 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ w8b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public static String b(String str) {
        try {
            Set set = s4b1.f;
            String strH = uic.x(str).h();
            if (nik1.f.a(str) || nik1.g.a(str)) {
                return strH;
            }
            return null;
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public final gt80 a(Intent intent) {
        String path;
        String dataString;
        String str;
        List<String> pathSegments;
        Uri data;
        String schemeSpecificPart;
        Uri uri;
        byte b = this.a;
        String strG1 = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        Uri uri2 = null;
        Intent intent2 = null;
        strG1 = null;
        Object obj = this.b;
        et80 et80Var = et80.a;
        switch (b) {
            case 0:
                q6b q6bVarA = ((bbr0) obj).b0(q6b.class).a();
                if (q6bVarA == null || !q6bVarA.a) {
                    return et80Var;
                }
                Uri data2 = intent.getData();
                if (data2 != null && (path = data2.getPath()) != null) {
                    strG1 = ihc1.g1(path, new char[]{'/'});
                }
                if (strG1 == null) {
                    strG1 = "";
                }
                Set set = q6bVarA.b;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (nhc1.R(strG1, (String) it.next(), false)) {
                            return et80Var;
                        }
                    }
                }
                return dt80.a;
            case 1:
                if (!((aqh) obj).a() || (dataString = intent.getDataString()) == null) {
                    return et80Var;
                }
                if (nik1.f.a(dataString)) {
                    Bundle extras = intent.getExtras();
                    String strB = b(dataString);
                    if (strB == null || strB.length() == 0) {
                        return et80Var;
                    }
                    Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("spotify:episode:".concat(strB)));
                    if (extras != null) {
                        intent3.putExtras(extras);
                    }
                    intent3.putExtra("com.spotify.podcast.EXTRA_ORIGINATED_FROM_COMMENTS", true);
                    return new ft80(intent3);
                }
                if (!nik1.g.a(dataString)) {
                    return et80Var;
                }
                Bundle extras2 = intent.getExtras();
                String strB2 = b(dataString);
                if (strB2 == null || strB2.length() == 0) {
                    return et80Var;
                }
                try {
                    Set set2 = s4b1.f;
                    Uri uri3 = uic.x(dataString).a;
                    str = (uri3 != null && (pathSegments = uri3.getPathSegments()) != null) ? (String) o7h.C0(pathSegments) : null;
                    break;
                } catch (Exception unused) {
                }
                if (str != null) {
                    intent2 = new Intent("android.intent.action.VIEW", Uri.parse("spotify:episode:".concat(strB2)));
                    if (extras2 != null) {
                        intent2.putExtras(extras2);
                    }
                    intent2.putExtra("com.spotify.podcast.EXTRA_COMMENT_ID_ORIGINATED_FROM_COMMENT_THREAD", str);
                }
                return intent2 != null ? new ft80(intent2) : et80Var;
            case 2:
                return (intent.getFlags() & 1048576) != 0 ? new ft80(((io60) obj).a()) : et80Var;
            default:
                if (!((r44) obj).b() || (data = intent.getData()) == null) {
                    return et80Var;
                }
                Map mapY = smo1.y(data);
                String str2 = (String) mapY.get("nl");
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        Uri uri4 = Uri.parse(str2);
                        uri4.getClass();
                        if (don1.x(uri4) && (schemeSpecificPart = uri4.getSchemeSpecificPart()) != null) {
                            String strH0 = ihc1.H0(schemeSpecificPart, "nl:");
                            if (strH0.length() <= 0) {
                                strH0 = null;
                            }
                            if (strH0 != null) {
                                StringBuilder sb = new StringBuilder();
                                for (Map.Entry entry : mapY.entrySet()) {
                                    String str3 = (String) entry.getKey();
                                    String str4 = (String) entry.getValue();
                                    if (!u890.j(str3, "nl")) {
                                        if (sb.length() > 0) {
                                            sb.append("&");
                                        }
                                        sb.append(Uri.encode(str3));
                                        sb.append("=");
                                        sb.append(Uri.encode(str4));
                                    }
                                }
                                String string = data.toString();
                                int iV0 = ihc1.v0(string, '?', 0, 6);
                                if (iV0 >= 0) {
                                    uri = Uri.parse(string.substring(0, iV0));
                                    uri.getClass();
                                } else {
                                    uri = data;
                                }
                                String string2 = uri.toString();
                                if (sb.length() > 0) {
                                    sb.append("&");
                                }
                                sb.append(Uri.encode("origin_uri"));
                                sb.append("=");
                                sb.append(Uri.encode(string2));
                                uri2 = Uri.parse(uri4 + "?" + ((Object) sb));
                            }
                        }
                    }
                }
                if (uri2 == null) {
                    return et80Var;
                }
                data.toString();
                uri2.toString();
                Intent intent4 = new Intent(intent);
                intent4.setData(uri2);
                return new ft80(intent4);
        }
    }
}
