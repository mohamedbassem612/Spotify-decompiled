package p;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hl60 implements uzr0 {
    public final fl60 a;
    public final bl60 b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");
    public static final Pattern t = Pattern.compile("SAMPLE-RATE=(\\d+)\\b");
    public static final Pattern X = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");
    public static final Pattern Y = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern Z = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");
    public static final Pattern N0 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern O0 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern P0 = Pattern.compile("SCORE=([\\d\\.]+)\\b");
    public static final Pattern Q0 = Pattern.compile("SERVER-URI=\"((?:.|\f)+?)\"");
    public static final Pattern R0 = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");
    public static final Pattern S0 = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");
    public static final Pattern T0 = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");
    public static final Pattern U0 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern V0 = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern W0 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");
    public static final Pattern X0 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern Y0 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern Z0 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern a1 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern b1 = a("CAN-SKIP-DATERANGES");
    public static final Pattern c1 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern d1 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern e1 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern f1 = a("CAN-BLOCK-RELOAD");
    public static final Pattern g1 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern h1 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern i1 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern j1 = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern k1 = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern l1 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern m1 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern n1 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern o1 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern p1 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern q1 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern r1 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");
    public static final Pattern s1 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");
    public static final Pattern t1 = Pattern.compile("URI=\"((?:.|\f)+?)\"");
    public static final Pattern u1 = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern v1 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern w1 = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern x1 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");
    public static final Pattern y1 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");
    public static final Pattern z1 = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");
    public static final Pattern A1 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");
    public static final Pattern B1 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");
    public static final Pattern C1 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern D1 = a("AUTOSELECT");
    public static final Pattern E1 = a("DEFAULT");
    public static final Pattern F1 = a("FORCED");
    public static final Pattern G1 = a("INDEPENDENT");
    public static final Pattern H1 = a("GAP");
    public static final Pattern I1 = a("PRECISE");
    public static final Pattern J1 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");
    public static final Pattern K1 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");
    public static final Pattern L1 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");
    public static final Pattern M1 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");
    public static final Pattern N1 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern O1 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");
    public static final Pattern P1 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");
    public static final Pattern Q1 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");
    public static final Pattern R1 = a("END-ON-NEXT");
    public static final Pattern S1 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");
    public static final Pattern T1 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");
    public static final Pattern U1 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern V1 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");
    public static final Pattern W1 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");
    public static final Pattern X1 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");
    public static final Pattern Y1 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");
    public static final Pattern Z1 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");
    public static final Pattern a2 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");
    public static final Pattern b2 = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");
    public static final Pattern c2 = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");
    public static final Pattern d2 = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");
    public static final Pattern e2 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    public static final Pattern f2 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public hl60(fl60 fl60Var, bl60 bl60Var) {
        this.a = fl60Var;
        this.b = bl60Var;
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static x8v b(String str, w8v[] w8vVarArr) {
        w8v[] w8vVarArr2 = new w8v[w8vVarArr.length];
        for (int i2 = 0; i2 < w8vVarArr.length; i2++) {
            w8v w8vVar = w8vVarArr[i2];
            w8vVarArr2[i2] = new w8v(w8vVar.b, w8vVar.c, w8vVar.d, null);
        }
        return new x8v(str, true, w8vVarArr2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static w8v c(String str, String str2, HashMap map, qzq qzqVar) throws ParserException {
        String strK = k(str, s1, "1", map, qzqVar);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = t1;
        if (zEquals) {
            String strL = l(str, pattern, map, qzqVar);
            return new w8v(whc.e, null, "video/mp4", Base64.decode(strL.substring(strL.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = whc.e;
            String str3 = zoi1.a;
            return new w8v(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strK)) {
            return null;
        }
        String strL2 = l(str, pattern, map, qzqVar);
        byte[] bArrDecode = Base64.decode(strL2.substring(strL2.indexOf(44)), 0);
        UUID uuid2 = whc.f;
        return new w8v(uuid2, null, "video/mp4", n3o1.m(uuid2, (UUID[]) null, bArrDecode));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 47661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static p.bl60 e(p.fl60 r126, p.bl60 r127, p.lc20 r128, android.net.Uri r129, p.qzq r130) {
        /*
            Method dump skipped, instruction units count: 4766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hl60.e(p.fl60, p.bl60, p.lc20, android.net.Uri, p.qzq):p.bl60");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:102:0x0272  */
    /* JADX WARN: Code duplicated, block: B:103:0x0279  */
    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
    /* JADX WARN: Code duplicated, block: B:109:0x0291  */
    /* JADX WARN: Code duplicated, block: B:112:0x029a  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:126:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x030c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0311  */
    /* JADX WARN: Code duplicated, block: B:142:0x031a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0342  */
    /* JADX WARN: Code duplicated, block: B:147:0x034d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0353  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:202:0x0562  */
    /* JADX WARN: Code duplicated, block: B:299:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0234  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    public static fl60 f(lc20 lc20Var, Uri uri, qzq qzqVar) throws ParserException {
        ?? r29;
        int i2;
        int i3;
        ArrayList arrayList;
        el60 el60Var;
        String strE;
        ArrayList arrayList2;
        int i4;
        String str;
        el60 el60Var2;
        String strE2;
        el60 el60Var3;
        int i5;
        String str2;
        String str3;
        String strB;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        x8h x8hVar;
        String[] strArrJ0;
        StringBuilder sb;
        int length;
        int i11;
        String string;
        String str4;
        x8h x8hVar2;
        String strK;
        int i12;
        int i13;
        String strK2;
        float f3;
        Uri uriQ;
        Uri uri2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String string2 = uri.toString();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        dh30 dh30Var = null;
        while (true) {
            boolean zJ = lc20Var.j();
            Pattern pattern = t1;
            ArrayList arrayList13 = arrayList9;
            Pattern pattern2 = y1;
            boolean zContains = z;
            boolean z3 = z2;
            if (!zJ) {
                ArrayList arrayList14 = arrayList5;
                HashMap map3 = map;
                ArrayList arrayList15 = arrayList10;
                ArrayList arrayList16 = arrayList12;
                ArrayList arrayList17 = arrayList6;
                ArrayList arrayList18 = arrayList7;
                ArrayList arrayList19 = arrayList8;
                ArrayList arrayList20 = arrayList11;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i14 = 0;
                while (i14 < arrayList14.size()) {
                    el60 el60Var4 = (el60) arrayList14.get(i14);
                    Uri uri3 = el60Var4.a;
                    ie30 ie30Var = el60Var4.b;
                    if (hashSet.add(uri3)) {
                        dm5.y(ie30Var.m == null);
                        ArrayList arrayList22 = (ArrayList) map3.get(el60Var4.a);
                        arrayList22.getClass();
                        hjj0 hjj0Var = new hjj0(new tl60(null, arrayList22, null));
                        ge30 ge30VarA = ie30Var.a();
                        ge30VarA.l = hjj0Var;
                        arrayList21.add(new el60(el60Var4.a, new ie30(ge30VarA), el60Var4.c, el60Var4.d, el60Var4.e, el60Var4.f, el60Var4.g, el60Var4.h));
                    }
                    i14++;
                    hashSet = hashSet;
                    map3 = map3;
                }
                int i15 = 0;
                ArrayList arrayList23 = null;
                ie30 ie30Var2 = null;
                while (i15 < arrayList15.size()) {
                    ArrayList arrayList24 = arrayList15;
                    String str5 = (String) arrayList24.get(i15);
                    String strL = l(str5, A1, map2, qzqVar);
                    String strL2 = l(str5, pattern2, map2, qzqVar);
                    ArrayList arrayList25 = arrayList23;
                    ArrayList arrayList26 = arrayList21;
                    String strK3 = k(str5, T0, null, map2, qzqVar);
                    ge30 ge30Var = new ge30();
                    ge30Var.a = f4i1.f(strL, ":", strL2);
                    ge30Var.b = strL2;
                    ge30Var.n = asj0.p("application/x-mpegURL");
                    boolean zG = g(str5, E1, qzqVar);
                    if (g(str5, F1, qzqVar)) {
                        r29 = zG;
                        r29 = (zG ? 1 : 0) | 2;
                    }
                    r29 = zG;
                    ge30Var.e = g(str5, D1, qzqVar) ? r29 | 4 : r29;
                    ie30 ie30Var3 = ie30Var2;
                    String strK4 = k(str5, B1, null, map2, qzqVar);
                    if (TextUtils.isEmpty(strK4)) {
                        i3 = i15;
                        i2 = 0;
                    } else {
                        String str6 = zoi1.a;
                        String[] strArrSplit = strK4.split(",", -1);
                        i2 = zoi1.m(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
                        i3 = i15;
                        if (zoi1.m(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
                            i2 |= SemanticState.Obscured;
                        }
                        if (zoi1.m(strArrSplit, "public.accessibility.describes-music-and-sound")) {
                            i2 |= SemanticState.ReadOnly;
                        }
                        if (zoi1.m(strArrSplit, "public.easy-to-read")) {
                            i2 |= SemanticState.Multiline;
                        }
                    }
                    ge30Var.f = i2;
                    ge30Var.d = k(str5, x1, null, map2, qzqVar);
                    String strK5 = k(str5, pattern, null, map2, qzqVar);
                    Uri uriQ2 = strK5 == null ? null : pno1.q(string2, strK5);
                    String str7 = string2;
                    hjj0 hjj0Var2 = new hjj0(new tl60(strL, Collections.EMPTY_LIST, strL2));
                    switch (l(str5, v1, map2, qzqVar)) {
                        case "SUBTITLES":
                            arrayList = arrayList18;
                            int i16 = 0;
                            while (true) {
                                if (i16 < arrayList14.size()) {
                                    el60 el60Var5 = (el60) arrayList14.get(i16);
                                    if (strL.equals(el60Var5.e)) {
                                        el60Var = el60Var5;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    el60Var = null;
                                }
                            }
                            if (el60Var != null) {
                                String strB2 = zoi1.B(3, el60Var.b.l);
                                ge30Var.k = strB2;
                                strE = asj0.e(strB2);
                            } else {
                                strE = null;
                            }
                            if (strE == null) {
                                strE = "text/vtt";
                            }
                            ge30Var.o = asj0.p(strE);
                            ge30Var.l = hjj0Var2;
                            if (uriQ2 != null) {
                                arrayList2 = arrayList19;
                                arrayList2.add(new dl60(uriQ2, new ie30(ge30Var), strL, strL2, strK3));
                            } else {
                                arrayList2 = arrayList19;
                                oon1.H("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList23 = arrayList25;
                            ie30Var2 = ie30Var3;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList18;
                            String strL3 = l(str5, C1, map2, qzqVar);
                            if (strL3.startsWith("CC")) {
                                i4 = Integer.parseInt(strL3.substring(2));
                                str = "application/cea-608";
                            } else {
                                i4 = Integer.parseInt(strL3.substring(7));
                                str = "application/cea-708";
                            }
                            ArrayList arrayList27 = arrayList25 == null ? new ArrayList() : arrayList25;
                            ge30Var.o = asj0.p(str);
                            ge30Var.O = i4;
                            arrayList27.add(new ie30(ge30Var));
                            arrayList23 = arrayList27;
                            arrayList2 = arrayList19;
                            ie30Var2 = ie30Var3;
                            break;
                        case "AUDIO":
                            ArrayList arrayList28 = arrayList17;
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList14.size()) {
                                    el60Var2 = (el60) arrayList14.get(i17);
                                    if (!strL.equals(el60Var2.d)) {
                                        i17++;
                                    }
                                } else {
                                    el60Var2 = null;
                                }
                            }
                            if (el60Var2 != null) {
                                String strB3 = zoi1.B(1, el60Var2.b.l);
                                ge30Var.k = strB3;
                                strE2 = asj0.e(strB3);
                            } else {
                                strE2 = null;
                            }
                            arrayList17 = arrayList28;
                            String strK6 = k(str5, i, null, map2, qzqVar);
                            if (strK6 != null) {
                                String str8 = zoi1.a;
                                ge30Var.I = Integer.parseInt(strK6.split("/", 2)[0]);
                                if ("audio/eac3".equals(strE2) && strK6.endsWith("/JOC")) {
                                    ge30Var.k = "ec+3";
                                    strE2 = "audio/eac3-joc";
                                }
                            }
                            int i18 = i(str5, t, qzqVar);
                            if (i18 != -1) {
                                ge30Var.K = i18;
                            }
                            ge30Var.e(strE2);
                            if (uriQ2 == null) {
                                arrayList = arrayList18;
                                if (el60Var2 != null) {
                                    ie30 ie30Var4 = new ie30(ge30Var);
                                    arrayList23 = arrayList25;
                                    ie30Var2 = ie30Var4;
                                    arrayList2 = arrayList19;
                                }
                                break;
                            } else {
                                ge30Var.l = hjj0Var2;
                                arrayList = arrayList18;
                                arrayList.add(new dl60(uriQ2, new ie30(ge30Var), strL, strL2, strK3));
                            }
                            arrayList2 = arrayList19;
                            arrayList23 = arrayList25;
                            ie30Var2 = ie30Var3;
                            break;
                        case "VIDEO":
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList14.size()) {
                                    el60Var3 = (el60) arrayList14.get(i19);
                                    if (!strL.equals(el60Var3.c)) {
                                        i19++;
                                    }
                                } else {
                                    el60Var3 = null;
                                }
                            }
                            if (el60Var3 != null) {
                                ie30 ie30Var5 = el60Var3.b;
                                String strB4 = zoi1.B(2, ie30Var5.l);
                                ge30Var.k = strB4;
                                ge30Var.o = asj0.p(asj0.e(strB4));
                                ge30Var.v = ie30Var5.w;
                                ge30Var.w = ie30Var5.x;
                                ge30Var.c(ie30Var5.B);
                            }
                            if (uriQ2 != null) {
                                ge30Var.l = hjj0Var2;
                                arrayList17.add(new dl60(uriQ2, new ie30(ge30Var), strL, strL2, strK3));
                                break;
                            }
                        default:
                            arrayList2 = arrayList19;
                            arrayList = arrayList18;
                            arrayList23 = arrayList25;
                            ie30Var2 = ie30Var3;
                            break;
                    }
                    i15 = i3 + 1;
                    arrayList18 = arrayList;
                    arrayList15 = arrayList24;
                    arrayList19 = arrayList2;
                    arrayList21 = arrayList26;
                    string2 = str7;
                }
                return new fl60(uri.toString(), arrayList16, arrayList21, arrayList17, arrayList18, arrayList19, arrayList13, ie30Var2, zContains ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20, dh30Var);
            }
            String strM = lc20Var.m();
            ArrayList arrayList29 = arrayList8;
            if (strM.startsWith("#EXT")) {
                arrayList12.add(strM);
            }
            boolean zStartsWith = strM.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList30 = arrayList12;
            if (strM.startsWith("#EXT-X-DEFINE")) {
                String strK7 = k(strM, pattern2, null, map2, qzqVar);
                if (strK7 != null) {
                    n(strK7, map2);
                    map2.put(strK7, l(strM, J1, map2, qzqVar));
                } else {
                    String strL4 = l(strM, z1, map2, qzqVar);
                    n(strL4, map2);
                    String queryParameter = uri.getQueryParameter(strL4);
                    if (queryParameter == null) {
                        throw ParserException.b("QUERYPARAM \"" + strL4 + "\" not found in playlist URI");
                    }
                    map2.put(strL4, queryParameter);
                }
            } else {
                if (strM.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    ArrayList arrayList31 = arrayList5;
                    map = map;
                    arrayList3 = arrayList31;
                    arrayList10 = arrayList10;
                    arrayList6 = arrayList6;
                    arrayList7 = arrayList7;
                    arrayList11 = arrayList11;
                    z = zContains;
                    z2 = true;
                } else if (strM.startsWith("#EXT-X-MEDIA")) {
                    arrayList10.add(strM);
                } else if (strM.startsWith("#EXT-X-SESSION-KEY")) {
                    w8v w8vVarC = c(strM, k(strM, r1, "identity", map2, qzqVar), map2, qzqVar);
                    if (w8vVarC != null) {
                        String strL5 = l(strM, q1, map2, qzqVar);
                        arrayList11.add(new x8v(("SAMPLE-AES-CENC".equals(strL5) || "SAMPLE-AES-CTR".equals(strL5)) ? "cenc" : "cbcs", true, w8vVarC));
                    }
                } else {
                    boolean zStartsWith2 = strM.startsWith("#EXT-X-CONTENT-STEERING");
                    Pattern pattern3 = R0;
                    if (zStartsWith2) {
                        if (dh30Var != null) {
                            throw ParserException.b("The #EXT-X-CONTENT-STEERING tag must not appear more than once in a multivariant playlist");
                        }
                        arrayList3 = arrayList5;
                        dh30Var = new dh30(pno1.q(string2, l(strM, Q0, map2, qzqVar)), k(strM, pattern3, null, map2, qzqVar), (byte) 17);
                    } else if (strM.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        zContains |= strM.contains("CLOSED-CAPTIONS=NONE");
                        int i20 = zStartsWith ? 16384 : 0;
                        int i21 = Integer.parseInt(l(strM, h, Collections.EMPTY_MAP, qzqVar));
                        int i22 = i(strM, c, qzqVar);
                        arrayList7 = arrayList7;
                        arrayList6 = arrayList6;
                        String strK8 = k(strM, X, null, map2, qzqVar);
                        arrayList10 = arrayList10;
                        String strK9 = k(strM, Y, null, map2, qzqVar);
                        HashMap map4 = map;
                        String strK10 = k(strM, Z, null, map2, qzqVar);
                        if (strK10 != null) {
                            String str9 = zoi1.a;
                            String[] strArrSplit2 = strK10.split(",", 2)[0].split("/", -1);
                            str2 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str3 = strArrSplit2[1];
                                arrayList5 = arrayList5;
                                i5 = 2;
                            } else {
                                i5 = 2;
                            }
                            strB = zoi1.B(i5, strK9);
                            if (asj0.l(strB, str2)) {
                                if (str2 == null) {
                                    i6 = i20;
                                } else {
                                    if (strK8 != null || str3 == null) {
                                        i6 = i20;
                                    } else {
                                        i6 = i20;
                                        if ((!strK8.equals("PQ") || str3.equals("db1p")) && ((!strK8.equals("SDR") || str3.equals("db2g")) && (!strK8.equals("HLG") || str3.startsWith("db4")))) {
                                        }
                                    }
                                    x8hVar2 = null;
                                }
                                if (strK9 == null && asj0.l(strK9, str2)) {
                                    i7 = 6;
                                    if (!strK9.startsWith("dvhe") || strK9.startsWith("dvh1") || strK9.startsWith("dav1")) {
                                        i8 = 6;
                                        i9 = -1;
                                        i10 = 1;
                                    } else if (str3 == null) {
                                        i9 = -1;
                                        i7 = -1;
                                        i10 = -1;
                                        i8 = -1;
                                    } else if (str3.equals("db1p")) {
                                        i8 = 6;
                                        i9 = -1;
                                        i10 = 2;
                                    } else if (str3.startsWith("db4")) {
                                        i9 = -1;
                                        i10 = 2;
                                        i8 = 7;
                                    } else {
                                        i9 = -1;
                                        i7 = -1;
                                        i10 = -1;
                                        i8 = -1;
                                    }
                                    if (i7 == i9) {
                                        x8hVar = null;
                                    } else {
                                        x8hVar = new x8h(i7, i10, i8, null, -1, -1);
                                    }
                                } else {
                                    x8hVar = null;
                                }
                                if (str2 == null) {
                                    str2 = strB;
                                }
                                strArrJ0 = zoi1.j0(strK9);
                                if (strArrJ0.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrJ0.length;
                                    i11 = 0;
                                    while (i11 < length) {
                                        str4 = strArrJ0[i11];
                                        String[] strArr = strArrJ0;
                                        if (2 == asj0.i(asj0.e(str4))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str4);
                                        }
                                        i11++;
                                        strArrJ0 = strArr;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strK9 = xcg1.i(str2, ",", string);
                                } else {
                                    strK9 = str2;
                                }
                                x8hVar2 = x8hVar;
                            } else {
                                i6 = i20;
                                x8hVar2 = null;
                            }
                            strK = k(strM, N0, null, map2, qzqVar);
                            if (strK != null) {
                                String[] strArrSplit3 = strK.split("x", -1);
                                i13 = Integer.parseInt(strArrSplit3[0]);
                                i12 = Integer.parseInt(strArrSplit3[1]);
                                if (i13 > 0 || i12 <= 0) {
                                    i12 = -1;
                                    i13 = -1;
                                }
                            } else {
                                i12 = -1;
                                i13 = -1;
                            }
                            strK2 = k(strM, O0, null, map2, qzqVar);
                            if (strK2 != null) {
                                f3 = Float.parseFloat(strK2);
                            } else {
                                f3 = -1.0f;
                            }
                            String strK11 = k(strM, P0, null, map2, qzqVar);
                            float f4 = strK11 != null ? Float.parseFloat(strK11) : -1.0f;
                            String strK12 = k(strM, pattern3, null, map2, qzqVar);
                            String strK13 = k(strM, d, null, map2, qzqVar);
                            String strK14 = k(strM, e, null, map2, qzqVar);
                            String strK15 = k(strM, f, null, map2, qzqVar);
                            String strK16 = k(strM, g, null, map2, qzqVar);
                            String strK17 = k(strM, S0, null, map2, qzqVar);
                            if (zStartsWith) {
                                uriQ = pno1.q(string2, l(strM, pattern, map2, qzqVar));
                            } else {
                                if (lc20Var.j()) {
                                    throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriQ = pno1.q(string2, m(lc20Var.m(), map2, qzqVar));
                            }
                            uri2 = uriQ;
                            ge30 ge30Var2 = new ge30();
                            ge30Var2.a = Integer.toString(arrayList5.size());
                            ge30Var2.n = asj0.p("application/x-mpegURL");
                            ge30Var2.k = strK9;
                            ge30Var2.i = i22;
                            ge30Var2.j = i21;
                            ge30Var2.v = i13;
                            ge30Var2.w = i12;
                            ge30Var2.c(f3);
                            ge30Var2.g = f4;
                            ge30Var2.f = i6;
                            ge30Var2.G = x8hVar2;
                            arrayList3 = arrayList5;
                            arrayList3.add(new el60(uri2, new ie30(ge30Var2), strK13, strK14, strK15, strK16, strK12, strK17));
                            map = map4;
                            arrayList4 = (ArrayList) map.get(uri2);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                                map.put(uri2, arrayList4);
                            }
                            arrayList4.add(new sl60(i22, i21, strK13, strK14, strK15, strK16));
                        } else {
                            i5 = 2;
                            str2 = null;
                        }
                        str3 = null;
                        strB = zoi1.B(i5, strK9);
                        if (asj0.l(strB, str2)) {
                            if (str2 == null) {
                                i6 = i20;
                            } else {
                                if (strK8 != null) {
                                    i6 = i20;
                                } else {
                                    i6 = i20;
                                }
                                x8hVar2 = null;
                            }
                            if (strK9 == null) {
                                x8hVar = null;
                            } else {
                                i7 = 6;
                                if (strK9.startsWith("dvhe")) {
                                    i8 = 6;
                                    i9 = -1;
                                    i10 = 1;
                                } else {
                                    i8 = 6;
                                    i9 = -1;
                                    i10 = 1;
                                }
                                if (i7 == i9) {
                                    x8hVar = null;
                                } else {
                                    x8hVar = new x8h(i7, i10, i8, null, -1, -1);
                                }
                            }
                            if (str2 == null) {
                                str2 = strB;
                            }
                            strArrJ0 = zoi1.j0(strK9);
                            if (strArrJ0.length == 0) {
                                string = null;
                            } else {
                                sb = new StringBuilder();
                                length = strArrJ0.length;
                                i11 = 0;
                                while (i11 < length) {
                                    str4 = strArrJ0[i11];
                                    String[] strArr2 = strArrJ0;
                                    if (2 == asj0.i(asj0.e(str4))) {
                                        if (sb.length() > 0) {
                                            sb.append(",");
                                        }
                                        sb.append(str4);
                                    }
                                    i11++;
                                    strArrJ0 = strArr2;
                                }
                                if (sb.length() > 0) {
                                    string = sb.toString();
                                } else {
                                    string = null;
                                }
                            }
                            if (string != null) {
                                strK9 = xcg1.i(str2, ",", string);
                            } else {
                                strK9 = str2;
                            }
                            x8hVar2 = x8hVar;
                        } else {
                            i6 = i20;
                            x8hVar2 = null;
                        }
                        strK = k(strM, N0, null, map2, qzqVar);
                        if (strK != null) {
                            String[] strArrSplit4 = strK.split("x", -1);
                            i13 = Integer.parseInt(strArrSplit4[0]);
                            i12 = Integer.parseInt(strArrSplit4[1]);
                            if (i13 > 0) {
                                i12 = -1;
                                i13 = -1;
                            } else {
                                i12 = -1;
                                i13 = -1;
                            }
                        } else {
                            i12 = -1;
                            i13 = -1;
                        }
                        strK2 = k(strM, O0, null, map2, qzqVar);
                        if (strK2 != null) {
                            f3 = Float.parseFloat(strK2);
                        } else {
                            f3 = -1.0f;
                        }
                        String strK18 = k(strM, P0, null, map2, qzqVar);
                        if (strK18 != null) {
                        }
                        String strK19 = k(strM, pattern3, null, map2, qzqVar);
                        String strK110 = k(strM, d, null, map2, qzqVar);
                        String strK111 = k(strM, e, null, map2, qzqVar);
                        String strK112 = k(strM, f, null, map2, qzqVar);
                        String strK113 = k(strM, g, null, map2, qzqVar);
                        String strK114 = k(strM, S0, null, map2, qzqVar);
                        if (zStartsWith) {
                            uriQ = pno1.q(string2, l(strM, pattern, map2, qzqVar));
                        } else {
                            if (lc20Var.j()) {
                                throw ParserException.b("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriQ = pno1.q(string2, m(lc20Var.m(), map2, qzqVar));
                        }
                        uri2 = uriQ;
                        ge30 ge30Var3 = new ge30();
                        ge30Var3.a = Integer.toString(arrayList5.size());
                        ge30Var3.n = asj0.p("application/x-mpegURL");
                        ge30Var3.k = strK9;
                        ge30Var3.i = i22;
                        ge30Var3.j = i21;
                        ge30Var3.v = i13;
                        ge30Var3.w = i12;
                        ge30Var3.c(f3);
                        ge30Var3.g = f4;
                        ge30Var3.f = i6;
                        ge30Var3.G = x8hVar2;
                        arrayList3 = arrayList5;
                        arrayList3.add(new el60(uri2, new ie30(ge30Var3), strK110, strK111, strK112, strK113, strK19, strK114));
                        map = map4;
                        arrayList4 = (ArrayList) map.get(uri2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            map.put(uri2, arrayList4);
                        }
                        arrayList4.add(new sl60(i22, i21, strK110, strK111, strK112, strK113));
                    }
                    z = zContains;
                    z2 = z3;
                }
                HashMap map5 = map;
                arrayList5 = arrayList3;
                map = map5;
                arrayList9 = arrayList13;
                arrayList8 = arrayList29;
                arrayList12 = arrayList30;
                arrayList11 = arrayList11;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList10 = arrayList10;
            }
            arrayList3 = arrayList5;
            z = zContains;
            z2 = z3;
            HashMap map6 = map;
            arrayList5 = arrayList3;
            map = map6;
            arrayList9 = arrayList13;
            arrayList8 = arrayList29;
            arrayList12 = arrayList30;
            arrayList11 = arrayList11;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList10 = arrayList10;
        }
    }

    public static boolean g(String str, Pattern pattern, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(pattern, str);
        if (matcherA.find()) {
            return "YES".equals(matcherA.group(1));
        }
        return false;
    }

    public static double h(String str, Pattern pattern, double d3, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(pattern, str);
        if (!matcherA.find()) {
            return d3;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    public static int i(String str, Pattern pattern, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(pattern, str);
        if (!matcherA.find()) {
            return -1;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    public static long j(String str, Pattern pattern, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(pattern, str);
        if (!matcherA.find()) {
            return -1L;
        }
        String strGroup = matcherA.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    public static String k(String str, Pattern pattern, String str2, Map map, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(pattern, str);
        if (matcherA.find()) {
            str2 = matcherA.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map, qzqVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static String l(String str, Pattern pattern, Map map, qzq qzqVar) throws ParserException {
        String strK = k(str, pattern, null, map, qzqVar);
        if (strK != null) {
            return strK;
        }
        throw ParserException.b("Couldn't match " + pattern.pattern() + " in " + str);
    }

    public static String m(String str, Map map, qzq qzqVar) {
        int i2 = qzq.b;
        Matcher matcherA = qzqVar.a(e2, str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcherA.find()) {
            String strGroup = matcherA.group(1);
            if (map.containsKey(strGroup)) {
                matcherA.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcherA.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static void n(String str, HashMap map) throws ParserException {
        if (map.containsKey(str)) {
            throw ParserException.b("duplicate variable name \"" + str + "\"");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:19:0x004a A[Catch: all -> 0x009c, TryCatch #0 {all -> 0x009c, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:31:0x0073, B:33:0x0079, B:36:0x0084, B:38:0x008c, B:43:0x009e, B:45:0x00a6, B:47:0x00ae, B:49:0x00b6, B:51:0x00be, B:53:0x00c6, B:55:0x00ce, B:57:0x00d6, B:60:0x00df, B:61:0x00e3, B:66:0x0101, B:67:0x0107, B:13:0x003b, B:15:0x0041, B:19:0x004a, B:22:0x0053, B:24:0x005c, B:26:0x0062, B:28:0x0068, B:29:0x006d), top: B:70:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x009c, LOOP:2: B:17:0x0047->B:22:0x0053, LOOP_END, TryCatch #0 {all -> 0x009c, blocks: (B:3:0x001a, B:5:0x0023, B:7:0x002b, B:10:0x0034, B:31:0x0073, B:33:0x0079, B:36:0x0084, B:38:0x008c, B:43:0x009e, B:45:0x00a6, B:47:0x00ae, B:49:0x00b6, B:51:0x00be, B:53:0x00c6, B:55:0x00ce, B:57:0x00d6, B:60:0x00df, B:61:0x00e3, B:66:0x0101, B:67:0x0107, B:13:0x003b, B:15:0x0041, B:19:0x004a, B:22:0x0053, B:24:0x005c, B:26:0x0062, B:28:0x0068, B:29:0x006d), top: B:70:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:89:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0052 A[SYNTHETIC] */
    public final Object d(Uri uri, g3r g3rVar) throws ParserException {
        int i2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(g3rVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        qzq qzqVar = new qzq(16, 0.75f, true, (byte) 2);
        try {
            int i3 = bufferedReader.read();
            boolean zR = false;
            if (i3 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i3 = bufferedReader.read();
                    while (i3 != -1) {
                        i3 = bufferedReader.read();
                    }
                    i2 = 0;
                    while (true) {
                        if (i2 < 7) {
                            while (i3 != -1) {
                                i3 = bufferedReader.read();
                            }
                            zR = zoi1.R(i3);
                            break;
                        }
                        if (i3 != "#EXTM3U".charAt(i2)) {
                            break;
                            break;
                        }
                        i3 = bufferedReader.read();
                        i2++;
                    }
                }
            } else {
                while (i3 != -1 && Character.isWhitespace(i3)) {
                    i3 = bufferedReader.read();
                }
                i2 = 0;
                while (true) {
                    if (i2 < 7) {
                        while (i3 != -1 && Character.isWhitespace(i3) && !zoi1.R(i3)) {
                            i3 = bufferedReader.read();
                        }
                        zR = zoi1.R(i3);
                        break;
                    }
                    if (i3 != "#EXTM3U".charAt(i2)) {
                        break;
                    }
                    i3 = bufferedReader.read();
                    i2++;
                }
            }
            if (!zR) {
                throw ParserException.b("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    zoi1.h(bufferedReader);
                    throw ParserException.b("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        fl60 fl60VarF = f(new lc20(arrayDeque, bufferedReader), uri, qzqVar);
                        zoi1.h(bufferedReader);
                        return fl60VarF;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    bl60 bl60VarE = e(this.a, this.b, new lc20(arrayDeque, bufferedReader), uri, qzqVar);
                    zoi1.h(bufferedReader);
                    return bl60VarE;
                }
            }
        } catch (Throwable th) {
            zoi1.h(bufferedReader);
            throw th;
        }
    }

    public hl60() {
        this(fl60.o, null);
    }
}
