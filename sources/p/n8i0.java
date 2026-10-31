package p;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n8i0 {
    public static final e380 f;
    public static final nme g;
    public static final HashMap h;
    public static final n8i0 i;
    public static final l7m0 j;
    public final String a;
    public final String b;
    public final e380 c;
    public String d;
    public int e;

    static {
        e380 e380Var;
        String strW = eth.W(StandardCharsets.UTF_8.name());
        dqu dquVar = new dqu((byte) 29);
        n3p1.i("charset", strW);
        muh muhVarA = (muh) dquVar.b;
        if (muhVarA == null) {
            muhVarA = muh.a();
            dquVar.b = muhVarA;
        }
        v280 v280VarN = (o280) muhVarA.get("charset");
        if (v280VarN == null) {
            v280VarN = b380.n(4);
            muh muhVarA2 = (muh) dquVar.b;
            if (muhVarA2 == null) {
                muhVarA2 = muh.a();
                dquVar.b = muhVarA2;
            }
            muhVarA2.put("charset", v280VarN);
        }
        v280VarN.a(strW);
        muh muhVar = (muh) dquVar.b;
        if (muhVar == null) {
            e380Var = v6x.g;
        } else {
            Collection collectionEntrySet = muhVar.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                e380Var = v6x.g;
            } else {
                juh<Map.Entry> juhVar = (juh) collectionEntrySet;
                h380 h380Var = new h380(juhVar.b.size());
                int i2 = 0;
                for (Map.Entry entry : juhVar) {
                    Object key = entry.getKey();
                    bg11 bg11VarG = ((v280) entry.getValue()).g();
                    h380Var.e(key, bg11VarG);
                    i2 += bg11VarG.d;
                }
                e380Var = new e380(h380Var.b(true), i2);
            }
        }
        f = e380Var;
        ome omeVar = ome.d;
        ome omeVar2 = ome.e;
        omeVar2.getClass();
        vme vmeVar = new vme(omeVar2);
        omeVar.getClass();
        g = new nme(new nme(new nme(omeVar, vmeVar), new rme(' ', (byte) 1)), xme.a("()<>@,;:\\\"/[]?=").e());
        xme.a("\"\\\r").e().getClass();
        xme.a(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new l7m0(new cfa0("; "), (byte) 25);
    }

    public n8i0(String str, String str2, e380 e380Var) {
        this.a = str;
        this.b = str2;
        this.c = e380Var;
    }

    public static void a(String str, String str2) {
        n8i0 n8i0Var = new n8i0(str, str2, v6x.g);
        h.put(n8i0Var, n8i0Var);
    }

    public static n8i0 b(String str, String str2) {
        n8i0 n8i0Var = new n8i0(str, str2, f);
        h.put(n8i0Var, n8i0Var);
        spq0.d(StandardCharsets.UTF_8);
        return n8i0Var;
    }

    public final qqg0 c() {
        return new qqg0(this.c.a(), new dp5(new cwa((byte) 17), (byte) 27));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n8i0)) {
            return false;
        }
        n8i0 n8i0Var = (n8i0) obj;
        return this.a.equals(n8i0Var.a) && this.b.equals(n8i0Var.b) && c().equals(n8i0Var.c());
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
        this.e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('/');
        sb.append(this.b);
        e380 e380Var = this.c;
        if (e380Var.m() != 0) {
            sb.append("; ");
            Collection collectionH = new hwm0(e380Var, new dp5(new cwa((byte) 16), (byte) 27)).h();
            l7m0 l7m0Var = j;
            l7m0Var.getClass();
            try {
                l7m0Var.d(sb, collectionH.iterator());
            } catch (IOException e) {
                eg.f(e);
                return null;
            }
        }
        String string = sb.toString();
        this.d = string;
        return string;
    }
}
