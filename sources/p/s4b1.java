package p;

import android.content.UriMatcher;
import android.net.Uri;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s4b1 {
    public static final Set f;
    public static final LinkedHashSet g;
    public static final UriMatcher h;
    public static final Pattern i;
    public static final Map j;
    public final Uri a;
    public final String b;
    public final blc0 c;
    public final v5b1 d;
    public final String e;

    static {
        new uic((byte) 25);
        Set setZ0 = dm61.z0(oyu0.e, qyu0.f, ryu0.f, pyu0.f, xyu0.f, zyu0.g, azu0.g, yyu0.g);
        f = setZ0;
        g = dm61.y0(setZ0, dm61.z0(nyu0.e, wyu0.f));
        h = f7b1.b;
        i = Pattern.compile("user:([^:]+)");
        j = mp10.l();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:52:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0119  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x0169  */
    /* JADX WARN: Code duplicated, block: B:72:0x0173  */
    /* JADX WARN: Code duplicated, block: B:75:0x0189  */
    /* JADX WARN: Code duplicated, block: B:79:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:0: B:70:0x016d->B:80:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b9, please report this as an issue */
    public s4b1(String str) {
        String strReplaceFirst;
        String str2;
        String strSubstring;
        String str3;
        v5b1 v5b1VarA;
        int iMatch;
        blc0 blc0VarM;
        List listQ0;
        List list;
        List list2;
        Iterator it;
        List listQ1;
        int length;
        if (str == null) {
            this.a = Uri.EMPTY;
            this.c = blc0.DUMMY;
            this.e = null;
            this.b = null;
            this.d = null;
            return;
        }
        if (nhc1.Y(str, "spotify://", false)) {
            this.e = "spotify://";
        } else if (nhc1.Y(str, "spotify:", false)) {
            this.e = "spotify:";
        } else if (nhc1.Y(str, "http://open.spotify.com/", false)) {
            this.e = "http://open.spotify.com/";
        } else {
            if (!nhc1.Y(str, "https://open.spotify.com/", false)) {
                if (nhc1.Y(str, "https://r.spotify.com/", false)) {
                    int iW0 = ihc1.w0(str, "/app_android/", 0, false, 6);
                    if (iW0 > 0) {
                        strReplaceFirst = Pattern.compile("([^/?]+).*").matcher(str.substring(iW0 + 13)).replaceFirst("$1");
                        str = str.substring(0, iW0);
                    } else {
                        strReplaceFirst = null;
                    }
                    this.e = "https://r.spotify.com/";
                } else {
                    this.e = null;
                }
                this.b = strReplaceFirst;
                str2 = this.e;
                if (str2 == null) {
                    this.a = Uri.EMPTY;
                    this.c = blc0.DUMMY;
                    this.d = null;
                    return;
                }
                strSubstring = str.substring(str2.length());
                if (nhc1.Y(strSubstring, "intl-", false)) {
                    listQ1 = ihc1.Q0(strSubstring, new String[]{"/"}, 0, 6);
                    if (listQ1.size() == 1 || nhc1.R(strSubstring, "/", false)) {
                        length = (listQ1.get(0) + "/").length();
                    } else {
                        length = ((String) listQ1.get(0)).length();
                    }
                    if (strSubstring.length() >= length) {
                        strSubstring = strSubstring.substring(length);
                    }
                }
                if (strSubstring.equals("?")) {
                    this.a = Uri.EMPTY;
                    this.c = blc0.DUMMY;
                    this.d = null;
                    return;
                }
                String strReplaceAll = w6b1.j.matcher(strSubstring).replaceAll("/");
                Uri uri = Uri.parse(strReplaceAll);
                this.a = uri == null ? Uri.EMPTY : uri;
                strReplaceAll.getClass();
                str3 = w6b1.k.split(strReplaceAll, 0)[0];
                v5b1VarA = d7b1.a(str);
                if (v5b1VarA != null) {
                    this.d = v5b1VarA;
                    this.c = blc0.NOT_SET;
                    return;
                }
                this.d = null;
                Uri uri2 = Uri.parse(str3);
                Uri uri3 = Uri.EMPTY;
                WeakHashMap weakHashMap = xoi1.a;
                iMatch = h.match(uri2 == null ? uri3 : uri2);
                if (iMatch != -1) {
                    str3.getClass();
                    String str4 = w6b1.l.split(str3, 0)[0];
                    str4.getClass();
                    listQ0 = ihc1.Q0(str4, new String[]{"/"}, 0, 6);
                    blc0.a.getClass();
                    w6b1 w6b1VarA = f7b1.a(l7c.m(iMatch));
                    list = w6b1VarA != null ? w6b1VarA.c : null;
                    if (list != null) {
                        list2 = list;
                        if ((list2 instanceof Collection) || !list2.isEmpty()) {
                            it = list2.iterator();
                            while (it.hasNext()) {
                                if (fno1.m((String) it.next(), listQ0)) {
                                    blc0.a.getClass();
                                    blc0VarM = l7c.m(iMatch);
                                }
                            }
                            blc0VarM = blc0.DUMMY;
                        } else {
                            blc0VarM = blc0.DUMMY;
                        }
                    } else {
                        blc0VarM = blc0.DUMMY;
                    }
                } else {
                    blc0VarM = blc0.DUMMY;
                }
                this.c = blc0VarM;
            }
            this.e = "https://open.spotify.com/";
        }
        strReplaceFirst = null;
        this.b = strReplaceFirst;
        str2 = this.e;
        if (str2 == null) {
            this.a = Uri.EMPTY;
            this.c = blc0.DUMMY;
            this.d = null;
            return;
        }
        strSubstring = str.substring(str2.length());
        if (nhc1.Y(strSubstring, "intl-", false)) {
            listQ1 = ihc1.Q0(strSubstring, new String[]{"/"}, 0, 6);
            if (listQ1.size() == 1) {
                length = (listQ1.get(0) + "/").length();
            } else {
                length = (listQ1.get(0) + "/").length();
            }
            if (strSubstring.length() >= length) {
                strSubstring = strSubstring.substring(length);
            }
        }
        if (strSubstring.equals("?")) {
            this.a = Uri.EMPTY;
            this.c = blc0.DUMMY;
            this.d = null;
            return;
        }
        String strReplaceAll2 = w6b1.j.matcher(strSubstring).replaceAll("/");
        Uri uri4 = Uri.parse(strReplaceAll2);
        this.a = uri4 == null ? Uri.EMPTY : uri4;
        strReplaceAll2.getClass();
        str3 = w6b1.k.split(strReplaceAll2, 0)[0];
        v5b1VarA = d7b1.a(str);
        if (v5b1VarA != null) {
            this.d = v5b1VarA;
            this.c = blc0.NOT_SET;
            return;
        }
        this.d = null;
        Uri uri5 = Uri.parse(str3);
        Uri uri6 = Uri.EMPTY;
        WeakHashMap weakHashMap2 = xoi1.a;
        iMatch = h.match(uri5 == null ? uri6 : uri5);
        if (iMatch != -1) {
            str3.getClass();
            String str5 = w6b1.l.split(str3, 0)[0];
            str5.getClass();
            listQ0 = ihc1.Q0(str5, new String[]{"/"}, 0, 6);
            blc0.a.getClass();
            w6b1 w6b1VarA2 = f7b1.a(l7c.m(iMatch));
            if (w6b1VarA2 != null) {
            }
            if (list != null) {
                list2 = list;
                if (list2 instanceof Collection) {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (fno1.m((String) it.next(), listQ0)) {
                            blc0.a.getClass();
                            blc0VarM = l7c.m(iMatch);
                        }
                    }
                    blc0VarM = blc0.DUMMY;
                } else {
                    it = list2.iterator();
                    while (it.hasNext()) {
                        if (fno1.m((String) it.next(), listQ0)) {
                            blc0.a.getClass();
                            blc0VarM = l7c.m(iMatch);
                        }
                    }
                    blc0VarM = blc0.DUMMY;
                }
            } else {
                blc0VarM = blc0.DUMMY;
            }
        } else {
            blc0VarM = blc0.DUMMY;
        }
        this.c = blc0VarM;
    }

    public final String A(String str) {
        StringBuilder sb = new StringBuilder("spotify:");
        Uri uri = this.a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments != null) {
            int size = pathSegments.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (sb.charAt(sb.length() - 1) != ':') {
                    sb.append(':');
                }
                if (i2 == 0) {
                    sb.append(str);
                } else {
                    sb.append(Uri.encode(pathSegments.get(i2)));
                }
            }
        }
        return sb.toString();
    }

    public final String B(String str) {
        v5b1 v5b1Var = this.d;
        if (v5b1Var != null) {
            b3i1 type = v5b1Var.getType();
            if (type.equals(nyu0.e) || type.equals(wyu0.f)) {
                return H(str);
            }
        }
        int iOrdinal = this.c.ordinal();
        return (iOrdinal == 30 || iOrdinal == 44) ? H(str) : z();
    }

    public final String C(String str) {
        return r4b1.a[this.c.ordinal()] == 7 ? gvg.h("spotify:user:", str, ":collection:artist:", h()) : z();
    }

    public final String D() {
        String encodedPath;
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.a;
        String str = null;
        if (u890.j(uri2, uri)) {
            return null;
        }
        String strReplace = (uri2 == null || (encodedPath = uri2.getEncodedPath()) == null) ? null : encodedPath.replace('/', ':');
        String strM = l1d.m("?", uri2 != null ? uri2.getEncodedQuery() : null);
        String encodedQuery = uri2 != null ? uri2.getEncodedQuery() : null;
        if (encodedQuery != null && !ihc1.y0(encodedQuery)) {
            str = strM;
        }
        if (str == null) {
            str = "";
        }
        return f4i1.f("spotify:", strReplace, str);
    }

    public final String E() {
        String strConcat;
        String strG;
        p4b1 p4b1VarX = x();
        if (p4b1VarX == null) {
            strConcat = null;
        } else if (p4b1VarX.d() != null) {
            strConcat = gvg.h("spotify:user:", Uri.encode(p4b1VarX.d()), ":playlist:", p4b1VarX.b());
        } else {
            strConcat = "spotify:playlist:".concat(p4b1VarX.b());
        }
        if (strConcat != null) {
            return strConcat;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 31) {
            String strO = o(3);
            strG = (u890.j(strO, "episode") || u890.j(strO, "track")) ? G(2, 4) : null;
            return (strG == null || strG.length() == 0) ? G(2, 3) : strG;
        }
        if (iOrdinal == 50) {
            String strO2 = o(3);
            strG = (u890.j(strO2, "episode") || u890.j(strO2, "track")) ? G(2, 4) : null;
            return (strG == null || strG.length() == 0) ? G(2, 3) : strG;
        }
        if (iOrdinal == 309) {
            return G(2, 2);
        }
        if (iOrdinal == 334) {
            return G(7, 9);
        }
        if (iOrdinal == 338) {
            return G(7, 9);
        }
        if (iOrdinal != 927) {
            return (iOrdinal == 845 || iOrdinal == 846) ? G(0, 2) : z();
        }
        return G(2, 2);
    }

    public final String F() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal != 171) {
            return iOrdinal != 173 ? z() : "spotify:artist:".concat(h());
        }
        return "spotify:album:".concat(h());
    }

    public final String G(int i2, int i3) {
        StringBuilder sb = new StringBuilder("spotify:");
        Uri uri = this.a;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        if (pathSegments != null) {
            int size = pathSegments.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (i2 > i4 || i4 > i3) {
                    if (ihc1.z0(sb) != ':') {
                        sb.append(':');
                    }
                    sb.append(Uri.encode(pathSegments.get(i4)));
                }
            }
        }
        return sb.toString();
    }

    public final String H(String str) {
        StringBuilder sb = new StringBuilder();
        String strE = E();
        if (strE != null) {
            sb.append(strE);
        }
        sb.append(":play:");
        sb.append(nhc1.W(str, "spotify:", ""));
        return sb.toString();
    }

    public final String a() {
        String queryParameter;
        Uri uri;
        Uri uri2 = this.a;
        String queryParameter2 = uri2 != null ? uri2.getQueryParameter("prid") : null;
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            return queryParameter2;
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter("prid");
    }

    public final String b() {
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 44) {
            return z();
        }
        Uri uri = this.a;
        if (iOrdinal != 45 && iOrdinal != 47 && iOrdinal != 48) {
            if (iOrdinal == 50) {
                return E();
            }
            if (iOrdinal != 51 && iOrdinal != 53 && iOrdinal != 54 && iOrdinal != 57 && iOrdinal != 69) {
                switch (iOrdinal) {
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                        break;
                    default:
                        uh61.i(uri, "\" is not artist related");
                        return null;
                }
            }
        }
        String strZ = z();
        if (strZ != null) {
            String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
            return lastPathSegment != null ? strZ.substring(0, ihc1.B0(strZ, lastPathSegment, 0, 6) - 1) : strZ;
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public final String c(int i2) {
        String strO = o(i2);
        if (strO == null || strO.length() == 0) {
            return null;
        }
        return l1d.m("spotify:episode:", Uri.encode(strO));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    public final String d() {
        String strM;
        p4b1 p4b1VarX = x();
        if (p4b1VarX == null) {
            strM = null;
        } else if (p4b1VarX.c() != null) {
            strM = l1d.m("spotify:track:", p4b1VarX.c());
        } else if (p4b1VarX.a() != null) {
            strM = l1d.m("spotify:episode:", p4b1VarX.a());
        } else {
            strM = null;
        }
        if (strM != null) {
            return strM;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 31) {
            String strK = k();
            return (strK == null || strK.length() == 0) ? e(3) : strK;
        }
        if (iOrdinal == 50) {
            String strK2 = k();
            return (strK2 == null || strK2.length() == 0) ? e(3) : strK2;
        }
        if (iOrdinal == 309) {
            return c(5);
        }
        if (iOrdinal != 334) {
            return null;
        }
        return e(9);
    }

    public final String e(int i2) {
        String strO = o(i2);
        if (strO == null || strO.length() == 0) {
            return null;
        }
        return l1d.m("spotify:track:", Uri.encode(strO));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4b1)) {
            return false;
        }
        s4b1 s4b1Var = (s4b1) obj;
        return u890.j(this.a, s4b1Var.a) && u890.j(this.b, s4b1Var.b);
    }

    public final String f() {
        v5b1 v5b1Var = this.d;
        bzu0 bzu0Var = v5b1Var instanceof bzu0 ? (bzu0) v5b1Var : null;
        if (bzu0Var != null) {
            return bzu0Var.b;
        }
        if (this.c == blc0.COLLECTION_PLAYLIST_FOLDER) {
            return o(3);
        }
        bhn0.k("URI \"", this.a, "\" is not a folder");
        return null;
    }

    public final s4b1 g() {
        String str;
        Uri uri = this.a;
        String queryParameter = uri != null ? uri.getQueryParameter("context") : null;
        String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
        List<String> pathSegments = uri != null ? uri.getPathSegments() : null;
        List<String> list = pathSegments;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            Object objQ0 = o7h.q0(pathSegments);
            String str2 = (String) objQ0;
            if (!u890.j(str2, "episode") && !u890.j(str2, "track")) {
                objQ0 = null;
            }
            str = (String) objQ0;
        }
        if (queryParameter == null) {
            return null;
        }
        String strReplaceAll = w6b1.m.matcher(queryParameter).replaceAll(":");
        if (str != null && str.length() != 0) {
            lastPathSegment = f4i1.f(str, ":", lastPathSegment);
        }
        String strI = xcg1.i(strReplaceAll, ":play:", lastPathSegment);
        String queryParameter2 = uri != null ? uri.getQueryParameter("t") : null;
        String queryParameter3 = uri != null ? uri.getQueryParameter("he") : null;
        if (queryParameter2 != null) {
            strI = f4i1.f(strI, ":", queryParameter2);
        }
        if (queryParameter3 != null) {
            strI = f4i1.f(strI, "&he=", queryParameter3);
        }
        return uic.x(strI);
    }

    public final String h() {
        String lastPathSegment;
        List<String> pathSegments;
        String str;
        List<String> pathSegments2;
        String str2;
        List<String> pathSegments3;
        String str3;
        List<String> pathSegments4;
        String str4;
        String str5;
        int iOrdinal = this.c.ordinal();
        Uri uri = this.a;
        switch (iOrdinal) {
            case 9:
            case 30:
            case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
            case 60:
            case 71:
            case 96:
            case 98:
            case 127:
            case 128:
            case 166:
            case 171:
            case 173:
            case 202:
            case 226:
            case 230:
            case 304:
            case 366:
            case 368:
            case 538:
            case 562:
            case 563:
            case 621:
            case 622:
            case 696:
            case 844:
            case 860:
            case 926:
            case 927:
            case 967:
                if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
                    return lastPathSegment;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            case 31:
            case PlaylistDecorationPolicy.LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER /* 45 */:
            case PlaylistDecorationPolicy.UNFILTERED_LENGTH_FIELD_NUMBER /* 50 */:
            case 64:
            case 849:
            case 859:
            case 885:
                if (uri != null && (pathSegments = uri.getPathSegments()) != null && (str = (String) o7h.t0(1, pathSegments)) != null) {
                    return str;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            case 215:
                if (uri != null && (pathSegments2 = uri.getPathSegments()) != null && (str2 = (String) o7h.t0(uri.getPathSegments().size() - 2, pathSegments2)) != null) {
                    return str2;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            case 216:
            case 221:
                if (uri != null && (pathSegments3 = uri.getPathSegments()) != null && (str3 = (String) o7h.t0(4, pathSegments3)) != null) {
                    return str3;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            case 223:
                if (uri != null && (pathSegments4 = uri.getPathSegments()) != null && (str4 = (String) o7h.t0(uri.getPathSegments().size() - 3, pathSegments4)) != null) {
                    return str4;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            case 593:
                v5b1 v5b1Var = this.d;
                if (v5b1Var != null) {
                    if (v5b1Var instanceof xxu0) {
                        str5 = ((xxu0) v5b1Var).a;
                    } else if (v5b1Var instanceof byu0) {
                        str5 = ((byu0) v5b1Var).a;
                    } else if (v5b1Var instanceof jyu0) {
                        str5 = ((jyu0) v5b1Var).a;
                    } else {
                        str5 = v5b1Var instanceof myu0 ? ((myu0) v5b1Var).a : null;
                    }
                    if (str5 != null) {
                        return str5;
                    }
                }
                String lastPathSegment2 = uri != null ? uri.getLastPathSegment() : null;
                if (lastPathSegment2 != null) {
                    return lastPathSegment2;
                }
                uh61.i(uri, "\" does not contain an ID");
                return null;
            default:
                uh61.i(uri, "\" does not contain an ID");
                return null;
        }
    }

    public final int hashCode() {
        return p7h.M(this.a, this.b).hashCode();
    }

    public final String i(int i2) {
        Uri uri = this.a;
        if (uri == null) {
            return null;
        }
        if ((h.match(uri) == -1 && this.d == null) || i2 < 0 || i2 >= uri.getPathSegments().size()) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        encodedPath.getClass();
        List listQ0 = ihc1.Q0(encodedPath, new String[]{"/"}, 0, 6);
        return o7h.y0(listQ0.subList(i2, listQ0.size()), ":", null, null, v3b1.c, 30);
    }

    public final String j() {
        Uri uri = this.a;
        if (uri != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    public final String k() {
        String strO = o(3);
        if (strO == null || strO.length() == 0) {
            return null;
        }
        if (strO.equals("episode")) {
            return c(4);
        }
        if (strO.equals("track")) {
            return e(4);
        }
        return null;
    }

    public final String l() {
        return h4b1.d(this.a, "https://open.spotify.com/");
    }

    public final String m() {
        String queryParameter;
        Uri uri;
        String str;
        Uri uri2 = this.a;
        String queryParameter2 = uri2 != null ? uri2.getQueryParameter("pt") : null;
        if (queryParameter2 != null && queryParameter2.length() != 0) {
            return queryParameter2;
        }
        List<String> pathSegments = uri2 != null ? uri2.getPathSegments() : null;
        if (pathSegments != null && u890.j(o7h.t0(3, pathSegments), "invite") && (str = (String) o7h.t0(4, pathSegments)) != null && str.length() != 0) {
            return str;
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter("pt");
    }

    public final String n(String str) {
        String queryParameter;
        Uri uri = this.a;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return null;
        }
        return w6b1.m.matcher(queryParameter).replaceAll(":");
    }

    public final String o(int i2) {
        Uri uri = this.a;
        if (uri == null) {
            return null;
        }
        if ((h.match(uri) == -1 && this.d == null) || i2 < 0 || i2 >= uri.getPathSegments().size()) {
            return null;
        }
        String encodedPath = uri.getEncodedPath();
        encodedPath.getClass();
        return i1o1.k((String) ihc1.Q0(encodedPath, new String[]{"/"}, 0, 6).get(i2), nne.a);
    }

    public final int p() {
        List<String> pathSegments;
        Uri uri = this.a;
        if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
            return 0;
        }
        return pathSegments.size();
    }

    public final q4b1 q() {
        String queryParameter;
        Uri uri;
        String queryParameter2;
        Uri uri2 = this.a;
        String queryParameter3 = uri2 != null ? uri2.getQueryParameter("signal") : null;
        if (queryParameter3 != null && queryParameter3.length() != 0) {
            return new q4b1(queryParameter3, uri2.getQueryParameter("signal_data"));
        }
        if (uri2 == null || (queryParameter = uri2.getQueryParameter("target_url")) == null || (uri = Uri.parse(queryParameter)) == null || !uri.isHierarchical() || (queryParameter2 = uri.getQueryParameter("signal")) == null || queryParameter2.length() == 0) {
            return null;
        }
        return new q4b1(queryParameter2, uri.getQueryParameter("signal_data"));
    }

    public final String r() {
        int iOrdinal = this.c.ordinal();
        Uri uri = this.a;
        if (iOrdinal != 885 && iOrdinal != 928) {
            uh61.i(uri, "\" is not track related");
            return null;
        }
        String strZ = z();
        if (strZ != null) {
            String lastPathSegment = uri != null ? uri.getLastPathSegment() : null;
            return lastPathSegment != null ? strZ.substring(0, ihc1.B0(strZ, lastPathSegment, 0, 6) - 1) : strZ;
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public final String s() {
        String strZ = z();
        if (strZ == null) {
            return null;
        }
        Matcher matcher = i.matcher(strZ);
        if (matcher.find()) {
            return Uri.decode(matcher.group(1));
        }
        return null;
    }

    public final boolean t() {
        String str = this.e;
        return u890.j(str, "http://open.spotify.com/") || u890.j(str, "https://open.spotify.com/") || u890.j(str, "spotify://");
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    public final boolean u() {
        return this.c == blc0.TRACK && u890.j(o(0), "local");
    }

    public final boolean v() {
        Uri uri = this.a;
        String queryParameter = uri != null ? uri.getQueryParameter("si") : null;
        return !(queryParameter == null || queryParameter.length() == 0);
    }

    public final boolean w() {
        int iOrdinal = this.c.ordinal();
        return iOrdinal == 208 || iOrdinal == 209;
    }

    public final p4b1 x() {
        v5b1 v5b1Var = this.d;
        if (v5b1Var instanceof oyu0) {
            return new p4b1(14, ((oyu0) v5b1Var).a, (String) null, (String) null, (String) null);
        }
        if (v5b1Var instanceof qyu0) {
            qyu0 qyu0Var = (qyu0) v5b1Var;
            return new p4b1(10, qyu0Var.a, (String) null, qyu0Var.b, (String) null);
        }
        if (v5b1Var instanceof ryu0) {
            ryu0 ryu0Var = (ryu0) v5b1Var;
            return new p4b1(10, ryu0Var.a, (String) null, ryu0Var.b, (String) null);
        }
        if (v5b1Var instanceof pyu0) {
            pyu0 pyu0Var = (pyu0) v5b1Var;
            return new p4b1(6, pyu0Var.a, (String) null, (String) null, pyu0Var.b);
        }
        if (v5b1Var instanceof xyu0) {
            xyu0 xyu0Var = (xyu0) v5b1Var;
            return new p4b1(12, xyu0Var.b, xyu0Var.a, (String) null, (String) null);
        }
        if (v5b1Var instanceof zyu0) {
            zyu0 zyu0Var = (zyu0) v5b1Var;
            return new p4b1(8, zyu0Var.b, zyu0Var.a, zyu0Var.c, (String) null);
        }
        if (v5b1Var instanceof azu0) {
            azu0 azu0Var = (azu0) v5b1Var;
            return new p4b1(8, azu0Var.b, azu0Var.a, azu0Var.c, (String) null);
        }
        if (!(v5b1Var instanceof yyu0)) {
            return null;
        }
        yyu0 yyu0Var = (yyu0) v5b1Var;
        return new p4b1(4, yyu0Var.b, yyu0Var.a, (String) null, yyu0Var.c);
    }

    public final String y() {
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.a;
        if (u890.j(uri2, uri)) {
            return null;
        }
        return l1d.m("https://open.spotify.com/", uri2 != null ? uri2.getEncodedPath() : null);
    }

    public final String z() {
        String encodedPath;
        Uri uri = Uri.EMPTY;
        Uri uri2 = this.a;
        String strReplace = null;
        if (u890.j(uri2, uri)) {
            return null;
        }
        if (uri2 != null && (encodedPath = uri2.getEncodedPath()) != null) {
            strReplace = encodedPath.replace('/', ':');
        }
        return l1d.m("spotify:", strReplace);
    }
}
