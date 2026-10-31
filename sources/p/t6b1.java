package p;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import com.spotify.base.java.logging.Logger;
import j$.nio.file.Files;
import j$.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t6b1 implements s6b1 {
    public static final bma1 A;
    public static final bma1 B;
    public static final bma1 t;
    public static final bma1 u;
    public static final bma1 v;
    public static final bma1 w;
    public static final bma1 x;
    public static final bma1 y;
    public static final bma1 z;
    public final yqg a;
    public final hdn1 b;
    public final pjm1 c;
    public final gpm0 d;
    public final m6k0 e;
    public final po4 f;
    public final lxg g;
    public final zn41 h;
    public final xge0 i;
    public final int j;
    public final Context k;
    public final dma1 l;
    public String m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f83p;
    public ArrayList q;
    public boolean r;
    public final boolean s;

    static {
        new jma((byte) 26);
        nbc nbcVar = bma1.b;
        t = nbcVar.q("cache_location_v4");
        u = nbcVar.q("cache_location");
        v = nbcVar.q("settings_location");
        w = nbcVar.q("storage_location");
        x = nbcVar.q("previous_cache_path");
        y = nbcVar.q("previous_cache_size");
        z = nbcVar.q("previous_external_storage_failure");
        A = nbcVar.q("once_missed_cache");
        B = nbcVar.q("once_missed_cache_time");
    }

    public t6b1(Context context, yqg yqgVar, hdn1 hdn1Var, pjm1 pjm1Var, gpm0 gpm0Var, m6k0 m6k0Var, gtk1 gtk1Var, po4 po4Var, lxg lxgVar, f5u f5uVar, xge0 xge0Var, ut71 ut71Var, zn41 zn41Var, q8n q8nVar) {
        this.a = yqgVar;
        this.b = hdn1Var;
        this.c = pjm1Var;
        this.d = gpm0Var;
        this.e = m6k0Var;
        this.f = po4Var;
        this.g = lxgVar;
        this.h = zn41Var;
        this.i = xge0Var;
        this.j = po4Var.a();
        this.k = context.getApplicationContext();
        this.l = ut71Var.c(context);
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("SpotifyStorageManagerImpl")));
        if (po4Var.b()) {
            c921.y(llmVarE, (o8n) null, 0, new wp41(this, context, (lnm) null, (byte) 28), 3);
        } else {
            for (File file : context.getExternalCacheDirs()) {
                if (file != null) {
                    Logger.g("Cache dir=%s", new Object[]{file.getAbsolutePath()});
                }
            }
            h(context);
        }
        this.s = hdn1.f();
    }

    public static void h(Context context) {
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null) {
                Logger.g("Files dir=%s", new Object[]{file.getAbsolutePath()});
            }
        }
    }

    public final l420 a() {
        return this.i.a.n(this.k.getFilesDir(), "settings");
    }

    public final String b() {
        return this.l.e(w, hdn1.b());
    }

    public final synchronized String c() {
        String strF;
        try {
            ima1 ima1Var = this.l;
            bma1 bma1Var = B;
            if (ima1Var.n(bma1Var)) {
                long jB = this.a.b() - ima1Var.j(bma1Var);
                ima1 ima1Var2 = this.l;
                if (jB > 864000000) {
                    hma1 hma1VarEdit = ima1Var2.edit();
                    hma1VarEdit.f(bma1Var);
                    hma1VarEdit.f(A);
                    hma1VarEdit.g();
                } else {
                    bma1 bma1Var2 = A;
                    if ((ima1Var2.n(bma1Var2) && (strF = ima1Var2.f(bma1Var2)) != null) ? f5u.a(new File(strF)).a : false) {
                        hma1 hma1VarEdit2 = this.l.edit();
                        hma1VarEdit2.f(bma1Var);
                        hma1VarEdit2.f(bma1Var2);
                        hma1VarEdit2.g();
                    }
                }
            }
            if (!this.n) {
                i94 i94Var = (i94) this.g;
                tif1.a(i94Var.b, "resolve_and_create_cache_location", null, 6);
                t45 t45Var = i94Var.e;
                if (t45Var != null) {
                    t45Var.l("resolve_and_create_cache_location", null, false);
                }
                if (t45Var != null) {
                    Long l = i94Var.d;
                    Long lValueOf = l != null ? Long.valueOf((((s45) i94Var.a).a.a() - l.longValue()) / 1000) : null;
                    if (lValueOf != null) {
                        i94Var.c.d(lValueOf.longValue(), "resolve_and_create_cache_location");
                    }
                }
                this.m = g();
                i94 i94Var2 = (i94) this.g;
                t45 t45Var2 = i94Var2.e;
                if (t45Var2 != null) {
                    t45Var2.g("resolve_and_create_cache_location");
                }
                i94Var2.b.f("resolve_and_create_cache_location", "cst");
                if (t45Var2 != null) {
                    Long l2 = i94Var2.d;
                    Long lValueOf2 = l2 != null ? Long.valueOf((((s45) i94Var2.a).a.a() - l2.longValue()) / 1000) : null;
                    if (lValueOf2 != null) {
                        i94Var2.c.a(lValueOf2.longValue(), "resolve_and_create_cache_location", (String) null);
                    }
                }
                Logger.g("Using cache location %s", new Object[]{this.m});
                this.n = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final Long d(String str) {
        l420 l420VarK = this.i.a.k(str);
        AtomicLong atomicLong = new AtomicLong(0L);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.walkFileTree(Paths.get(l420VarK.b.getAbsolutePath(), new String[0]), new o420(atomicLong));
            } catch (FileSystemException e) {
                hhg1.n(e.getMessage());
                return null;
            }
        } else {
            atomicLong.addAndGet(u520.h(l420VarK));
        }
        return Long.valueOf(atomicLong.get());
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:3: B:70:0x017e->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143 A[Catch: IOException -> 0x0163, TryCatch #0 {IOException -> 0x0163, blocks: (B:54:0x0133, B:56:0x0143, B:58:0x014a, B:60:0x0153, B:62:0x0159, B:57:0x0147), top: B:82:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0147 A[Catch: IOException -> 0x0163, TryCatch #0 {IOException -> 0x0163, blocks: (B:54:0x0133, B:56:0x0143, B:58:0x014a, B:60:0x0153, B:62:0x0159, B:57:0x0147), top: B:82:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0190 A[SYNTHETIC] */
    public final String e() {
        boolean zF;
        ima1 ima1Var;
        bma1 bma1Var;
        boolean zI;
        String absolutePath;
        l420 l420VarK;
        boolean z2;
        File file;
        boolean zMkdirs;
        l420 l420VarA;
        l420[] l420VarArrB;
        ArrayList<l420> arrayList;
        Iterator it;
        l420[] l420VarArrB2;
        List listQ0;
        File file2;
        l420 l420VarP;
        l420 l420VarO;
        xge0 xge0Var = this.i;
        oi oiVar = xge0Var.a;
        do {
            zF = hdn1.f();
            ima1Var = this.l;
            ima1 ima1Var2 = ima1Var;
            bma1Var = v;
            if (ima1Var2.n(bma1Var)) {
                absolutePath = ima1Var.f(bma1Var);
            } else {
                boolean zN = ima1Var2.n(w);
                hdn1 hdn1Var = this.b;
                if (zN) {
                    zI = i();
                } else {
                    String strB = b();
                    strB.getClass();
                    l420 l420VarO2 = oiVar.o(strB, hdn1Var.d());
                    zI = l420VarO2.b.isDirectory() && f(l420VarO2.toString());
                }
                if (zI) {
                    String strB2 = b();
                    strB2.getClass();
                    absolutePath = oiVar.o(strB2, hdn1Var.d()).b.getAbsolutePath();
                } else {
                    absolutePath = (xge0Var.a.k("/sdcard/spotify2/").b.isDirectory() && f("/sdcard/spotify2/")) ? "/sdcard/spotify2/" : "";
                }
            }
        } while (zF != hdn1.f());
        if (!"".equals(absolutePath)) {
            absolutePath.getClass();
            l420VarK = oiVar.k(absolutePath);
            if (ihc1.h0(l420VarK.toString(), Environment.getExternalStorageDirectory().toString(), false) && f(l420VarK.toString())) {
                Logger.g("Will migrate settings dir in %s", new Object[]{l420VarK});
                l420VarK = a();
                z2 = true;
            }
            file = l420VarK.b;
            if (file.isDirectory()) {
                zMkdirs = true;
            } else {
                zMkdirs = l420VarK.mkdirs();
            }
            if (zMkdirs) {
                Logger.g("Failed to create settings directory, possibly because of full file system: %s", new Object[]{l420VarK});
                return absolutePath;
            }
            if (z2) {
                l420VarA = a();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("spotifycache");
                l420VarArrB = oiVar.k(absolutePath).b();
                if (l420VarArrB != null) {
                    arrayList = new ArrayList(new i36(l420VarArrB, false));
                } else {
                    arrayList = new ArrayList();
                }
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    l420VarO = oiVar.o(absolutePath, (String) it.next());
                    if (arrayList.contains(l420VarO)) {
                        arrayList.remove(l420VarO);
                    }
                }
                for (l420 l420Var : arrayList) {
                    try {
                        file2 = l420Var.b;
                        l420VarP = oiVar.p(l420VarA, file2.getName());
                        if (file2.isDirectory()) {
                            u520.b(l420Var, l420VarP);
                        } else {
                            u520.c(l420Var, l420VarP);
                        }
                        l420Var.setWritable(true);
                        if (!file2.canWrite() && !l420Var.delete()) {
                            Logger.d("Failed to delete settings file: %s", new Object[]{l420Var});
                        }
                    } catch (IOException unused) {
                        Logger.d("Exception thrown while migrating settings file: %s ", new Object[]{l420Var});
                    }
                }
                l420VarArrB2 = l420VarA.b();
                if (l420VarArrB2 != null) {
                    listQ0 = f46.Q0(l420VarArrB2);
                } else {
                    listQ0 = z6x.a;
                }
                for (l420 l420Var2 : arrayList) {
                    if (listQ0.contains(l420Var2)) {
                        Logger.d("Did not manage to migrate settings file: %s", new Object[]{l420Var2});
                        Logger.d("Failed to migrate settings directory, possibly because of full or inaccessible file system: %s", new Object[]{l420VarK});
                        return absolutePath;
                    }
                }
                absolutePath = file.getAbsolutePath();
            }
            hma1 hma1VarEdit = ima1Var.edit();
            hma1VarEdit.d(bma1Var, absolutePath);
            hma1VarEdit.g();
            return absolutePath;
        }
        l420VarK = a();
        absolutePath = l420VarK.b.getAbsolutePath();
        z2 = false;
        file = l420VarK.b;
        if (file.isDirectory()) {
            zMkdirs = true;
        } else {
            zMkdirs = l420VarK.mkdirs();
        }
        if (zMkdirs) {
            Logger.g("Failed to create settings directory, possibly because of full file system: %s", new Object[]{l420VarK});
            return absolutePath;
        }
        if (z2) {
            l420VarA = a();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("spotifycache");
            l420VarArrB = oiVar.k(absolutePath).b();
            if (l420VarArrB != null) {
                arrayList = new ArrayList(new i36(l420VarArrB, false));
            } else {
                arrayList = new ArrayList();
            }
            it = arrayList3.iterator();
            while (it.hasNext()) {
                l420VarO = oiVar.o(absolutePath, (String) it.next());
                if (arrayList.contains(l420VarO)) {
                    arrayList.remove(l420VarO);
                }
            }
            while (r2.hasNext()) {
                file2 = l420Var.b;
                l420VarP = oiVar.p(l420VarA, file2.getName());
                if (file2.isDirectory()) {
                    u520.b(l420Var, l420VarP);
                } else {
                    u520.c(l420Var, l420VarP);
                }
                l420Var.setWritable(true);
                if (!file2.canWrite()) {
                }
            }
            l420VarArrB2 = l420VarA.b();
            if (l420VarArrB2 != null) {
                listQ0 = f46.Q0(l420VarArrB2);
            } else {
                listQ0 = z6x.a;
            }
            while (r1.hasNext()) {
                if (listQ0.contains(l420Var2)) {
                    Logger.d("Did not manage to migrate settings file: %s", new Object[]{l420Var2});
                    Logger.d("Failed to migrate settings directory, possibly because of full or inaccessible file system: %s", new Object[]{l420VarK});
                    return absolutePath;
                }
            }
            absolutePath = file.getAbsolutePath();
        }
        hma1 hma1VarEdit2 = ima1Var.edit();
        hma1VarEdit2.d(bma1Var, absolutePath);
        hma1VarEdit2.g();
        return absolutePath;
    }

    public final boolean f(String str) {
        if (str.length() != 0) {
            l420[] l420VarArrB = this.i.a.k(str).b();
            if (l420VarArrB == null) {
                Logger.g("Settingsdir not a valid directory, or is inaccessible", new Object[0]);
                return false;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("spotifycache");
            for (l420 l420Var : l420VarArrB) {
                if (!arrayList.contains(l420Var.b.getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lcd1 */
    /* JADX WARN: Code duplicated, block: B:120:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x0307  */
    /* JADX WARN: Code duplicated, block: B:130:0x031e A[Catch: IOException -> 0x0368, TRY_ENTER, TryCatch #1 {IOException -> 0x0368, blocks: (B:125:0x0310, B:130:0x031e, B:132:0x0324, B:134:0x032c, B:136:0x0332, B:137:0x034a, B:138:0x034f, B:139:0x0350, B:140:0x0355, B:141:0x0356, B:142:0x035b, B:143:0x035c, B:144:0x0361, B:128:0x0319, B:145:0x0362, B:146:0x0367), top: B:264:0x0310, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0324 A[Catch: IOException -> 0x0368, TryCatch #1 {IOException -> 0x0368, blocks: (B:125:0x0310, B:130:0x031e, B:132:0x0324, B:134:0x032c, B:136:0x0332, B:137:0x034a, B:138:0x034f, B:139:0x0350, B:140:0x0355, B:141:0x0356, B:142:0x035b, B:143:0x035c, B:144:0x0361, B:128:0x0319, B:145:0x0362, B:146:0x0367), top: B:264:0x0310, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x032c A[Catch: IOException -> 0x0368, TryCatch #1 {IOException -> 0x0368, blocks: (B:125:0x0310, B:130:0x031e, B:132:0x0324, B:134:0x032c, B:136:0x0332, B:137:0x034a, B:138:0x034f, B:139:0x0350, B:140:0x0355, B:141:0x0356, B:142:0x035b, B:143:0x035c, B:144:0x0361, B:128:0x0319, B:145:0x0362, B:146:0x0367), top: B:264:0x0310, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0332 A[Catch: IOException -> 0x0368, TryCatch #1 {IOException -> 0x0368, blocks: (B:125:0x0310, B:130:0x031e, B:132:0x0324, B:134:0x032c, B:136:0x0332, B:137:0x034a, B:138:0x034f, B:139:0x0350, B:140:0x0355, B:141:0x0356, B:142:0x035b, B:143:0x035c, B:144:0x0361, B:128:0x0319, B:145:0x0362, B:146:0x0367), top: B:264:0x0310, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x038b  */
    /* JADX WARN: Code duplicated, block: B:156:0x039f A[Catch: RuntimeException -> 0x039b, IOException -> 0x03cb, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x039b, blocks: (B:153:0x0394, B:156:0x039f), top: B:267:0x0394, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:163:0x03b7 A[Catch: IOException -> 0x03ba, TryCatch #0 {IOException -> 0x03ba, blocks: (B:161:0x03b1, B:163:0x03b7, B:173:0x03cf, B:174:0x03d4, B:153:0x0394, B:156:0x039f), top: B:262:0x03b1, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:179:0x0406  */
    /* JADX WARN: Code duplicated, block: B:185:0x0432  */
    /* JADX WARN: Code duplicated, block: B:187:0x0438  */
    /* JADX WARN: Code duplicated, block: B:192:0x0464  */
    /* JADX WARN: Code duplicated, block: B:193:0x046f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0483  */
    /* JADX WARN: Code duplicated, block: B:211:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:213:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:215:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:216:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:219:0x0501  */
    /* JADX WARN: Code duplicated, block: B:221:0x0509  */
    /* JADX WARN: Code duplicated, block: B:223:0x0514  */
    /* JADX WARN: Code duplicated, block: B:224:0x051a  */
    /* JADX WARN: Code duplicated, block: B:225:0x051e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0524  */
    /* JADX WARN: Code duplicated, block: B:229:0x0531  */
    /* JADX WARN: Code duplicated, block: B:230:0x0537  */
    /* JADX WARN: Code duplicated, block: B:231:0x053b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0541  */
    /* JADX WARN: Code duplicated, block: B:236:0x054a  */
    /* JADX WARN: Code duplicated, block: B:237:0x054e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:238:0x0550  */
    /* JADX WARN: Code duplicated, block: B:254:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:264:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0394 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x03c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x03c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x0111  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:62:0x017f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01de  */
    public final String g() {
        boolean zF;
        dma1 dma1Var;
        bma1 bma1Var;
        pjm1 pjm1Var;
        hdn1 hdn1Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        File file;
        boolean zI;
        String absolutePath;
        l420 l420Var;
        ArrayList arrayList3;
        String strA;
        Iterator it;
        l420 l420VarO;
        int i;
        String absolutePath2;
        long j;
        dma1 dma1Var2;
        l420 l420VarK;
        File file2;
        File file3;
        hpm0 hpm0Var;
        hn60 hn60Var;
        lvc1 lvc1Var;
        epm0 epm0Var;
        boolean zJ;
        epm0 epm0Var2;
        boolean zK;
        epm0 epm0Var3;
        String strF;
        String strA2;
        epm0 epm0Var4;
        lvc1 lvc1Var2;
        String strA3;
        StatFs statFs;
        String strE;
        long jG;
        Iterator it2;
        String absolutePath3;
        StatFs statFs2;
        File file4;
        l420 l420VarN;
        File file5;
        String str;
        Iterator it3;
        long blockSizeLong;
        long availableBlocksLong;
        long blockSizeLong2;
        long blockCountLong;
        String strF2;
        xge0 xge0Var = this.i;
        oi oiVar = xge0Var.a;
        do {
            zF = hdn1.f();
            dma1Var = this.l;
            bma1Var = t;
            boolean zN = ((ima1) dma1Var).n(bma1Var);
            pjm1Var = this.c;
            hdn1Var = this.b;
            if (zN && (strF2 = dma1Var.f(bma1Var)) != null && nhc1.R(strF2, hdn1Var.c(), false)) {
                String strF3 = dma1Var.f(bma1Var);
                if (strF3 == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                absolutePath = jma.c(strF3, hdn1Var.c(), hdn1Var.a(), xge0Var);
                if (!absolutePath.equals(strF3)) {
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.d(bma1Var, absolutePath);
                    hma1VarEdit.g();
                }
            } else if (((ima1) dma1Var).n(bma1Var)) {
                absolutePath = dma1Var.f(bma1Var);
            } else {
                bma1 bma1Var2 = u;
                String strE2 = dma1Var.e(bma1Var2, (String) null);
                if (strE2 == null ? false : oiVar.k(strE2).b.isDirectory()) {
                    absolutePath = dma1Var.f(bma1Var2);
                    if (absolutePath == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    if (nhc1.R(absolutePath, hdn1Var.e(), false)) {
                        String strC = jma.c(absolutePath, hdn1Var.e(), hdn1Var.a(), xge0Var);
                        if (!strC.equals(absolutePath)) {
                            hma1 hma1VarEdit2 = dma1Var.edit();
                            hma1VarEdit2.d(bma1Var2, (String) null);
                            hma1VarEdit2.d(bma1Var, strC);
                            hma1VarEdit2.g();
                            absolutePath = strC;
                        }
                    } else {
                        hma1 hma1VarEdit3 = dma1Var.edit();
                        hma1VarEdit3.d(bma1Var2, (String) null);
                        hma1VarEdit3.d(bma1Var, absolutePath);
                        hma1VarEdit3.g();
                    }
                } else {
                    String strE3 = dma1Var.e(bma1Var2, (String) null);
                    if (strE3 == null) {
                        arrayList = this.q;
                        if (arrayList == null) {
                            Set setA = pjm1Var.a();
                            arrayList3 = new ArrayList();
                            strA = hdn1Var.a();
                            it = setA.iterator();
                            while (it.hasNext()) {
                                l420VarO = oiVar.o((String) it.next(), strA);
                                if (l420VarO.b.isDirectory()) {
                                    arrayList3.add(l420VarO);
                                }
                            }
                            this.q = arrayList3;
                            arrayList = arrayList3;
                        }
                        Logger.g("Found %d volume(s) containing a pre-existing cache", new Object[]{Integer.valueOf(arrayList.size())});
                        arrayList2 = this.q;
                        arrayList2.getClass();
                        if (arrayList2.isEmpty()) {
                            if (((ima1) dma1Var).n(w)) {
                                zI = i();
                            } else {
                                String strB = b();
                                strB.getClass();
                                file = oiVar.o(strB, hdn1Var.c().concat("/spotifycache")).b;
                                if (file.isDirectory() || !f5u.a(new File(file.getAbsolutePath())).a) {
                                    zI = false;
                                } else {
                                    zI = true;
                                }
                            }
                            if (zI) {
                                String strB2 = b();
                                strB2.getClass();
                                absolutePath = oiVar.o(strB2, hdn1Var.c()).b.getAbsolutePath();
                            } else {
                                absolutePath = "/sdcard/spotify2/";
                                if (!xge0Var.a.k("/sdcard/spotify2/").b.isDirectory()) {
                                    absolutePath = null;
                                }
                            }
                        } else {
                            ArrayList arrayList4 = this.q;
                            arrayList4.getClass();
                            l420Var = (l420) arrayList4.get(0);
                            Logger.g("Using orphan cache stored on %s", new Object[]{l420Var});
                            if (!l420Var.b.isDirectory() || l420Var.mkdirs()) {
                                absolutePath = l420Var.b.getAbsolutePath();
                            } else {
                                absolutePath = null;
                            }
                        }
                    } else {
                        l420 l420VarK2 = oiVar.k(strE3);
                        if (l420VarK2.b.isDirectory() || !l420VarK2.mkdirs()) {
                            absolutePath = dma1Var.f(bma1Var2);
                        } else {
                            hma1 hma1VarEdit4 = dma1Var.edit();
                            hma1VarEdit4.d(bma1Var2, (String) null);
                            hma1VarEdit4.g();
                            Logger.g("Deleted temporary cache dir: %b", new Object[]{Boolean.valueOf(l420VarK2.delete())});
                            arrayList = this.q;
                            if (arrayList == null) {
                                Set setA2 = pjm1Var.a();
                                arrayList3 = new ArrayList();
                                strA = hdn1Var.a();
                                it = setA2.iterator();
                                while (it.hasNext()) {
                                    l420VarO = oiVar.o((String) it.next(), strA);
                                    if (l420VarO.b.isDirectory()) {
                                        arrayList3.add(l420VarO);
                                    }
                                }
                                this.q = arrayList3;
                                arrayList = arrayList3;
                            }
                            Logger.g("Found %d volume(s) containing a pre-existing cache", new Object[]{Integer.valueOf(arrayList.size())});
                            arrayList2 = this.q;
                            arrayList2.getClass();
                            if (arrayList2.isEmpty()) {
                                ArrayList arrayList5 = this.q;
                                arrayList5.getClass();
                                l420Var = (l420) arrayList5.get(0);
                                Logger.g("Using orphan cache stored on %s", new Object[]{l420Var});
                                if (l420Var.b.isDirectory()) {
                                }
                                absolutePath = l420Var.b.getAbsolutePath();
                            } else {
                                if (((ima1) dma1Var).n(w)) {
                                    zI = i();
                                } else {
                                    String strB3 = b();
                                    strB3.getClass();
                                    file = oiVar.o(strB3, hdn1Var.c().concat("/spotifycache")).b;
                                    if (file.isDirectory()) {
                                        zI = false;
                                    } else {
                                        zI = false;
                                    }
                                }
                                if (zI) {
                                    String strB4 = b();
                                    strB4.getClass();
                                    absolutePath = oiVar.o(strB4, hdn1Var.c()).b.getAbsolutePath();
                                } else {
                                    absolutePath = "/sdcard/spotify2/";
                                    if (!xge0Var.a.k("/sdcard/spotify2/").b.isDirectory()) {
                                        absolutePath = null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (zF != hdn1.f());
        int i2 = this.j;
        yqg yqgVar = this.a;
        if (absolutePath != null) {
            l420 l420VarK3 = oiVar.k(absolutePath);
            int i3 = 0;
            while (i3 < i2 && "unknown".equals(Environment.getExternalStorageState(l420VarK3))) {
                i3++;
                yqgVar.f();
            }
            if (i3 >= 1) {
                this.r = true;
            }
        }
        if (absolutePath != null) {
            l420 l420VarK4 = oiVar.k(absolutePath);
            g5u g5uVarA = f5u.a(new File(absolutePath));
            if (this.f.c() && !this.r && !g5uVarA.a && "unmounted".equals(Environment.getExternalStorageState(oiVar.k(absolutePath)))) {
                l420 l420VarK5 = oiVar.k(absolutePath);
                int i4 = 0;
                while (i4 < i2 && "unmounted".equals(Environment.getExternalStorageState(l420VarK5))) {
                    i4++;
                    yqgVar.f();
                }
                "unmounted".equals(Environment.getExternalStorageState(l420VarK5));
                g5uVarA = f5u.a(new File(absolutePath));
            }
            boolean z2 = g5uVarA.a;
            bma1 bma1Var3 = z;
            if (z2) {
                hma1 hma1VarEdit5 = dma1Var.edit();
                i = 0;
                hma1VarEdit5.a(bma1Var3, false);
                hma1VarEdit5.g();
            } else {
                Logger.d("Found inaccessible cache directory: %s", new Object[]{absolutePath});
                if (!"unknown".equals(Environment.getExternalStorageState(l420VarK4))) {
                    absolutePath2 = null;
                } else if (dma1Var.h(bma1Var3, false)) {
                    Logger.d("Cache directory: %s, was previously inaccessible. Need to choose new directory", new Object[]{absolutePath});
                    hma1 hma1VarEdit6 = dma1Var.edit();
                    hma1VarEdit6.a(bma1Var3, false);
                    hma1VarEdit6.g();
                    absolutePath2 = null;
                } else {
                    hma1 hma1VarEdit7 = dma1Var.edit();
                    hma1VarEdit7.a(bma1Var3, true);
                    hma1VarEdit7.h();
                    Logger.d("Shutting down due to inaccessible storage location. Will reset if problem persists on next startup", new Object[0]);
                    n57.e("Failed to start client due to inaccessible cache location");
                    this.h.a("Storage failure shutdown", v3b1.g);
                    absolutePath2 = absolutePath;
                }
                if (absolutePath2 == null) {
                    hma1 hma1VarEdit8 = dma1Var.edit();
                    hma1VarEdit8.d(A, absolutePath);
                    l1d.B(yqgVar, hma1VarEdit8, B);
                }
                i = 0;
            }
            j = 0;
            if (absolutePath2 == null) {
                Logger.g("No cache location set", new Object[i]);
                Set<String> setA3 = pjm1Var.a();
                Logger.g("Choosing cache volume between %d candidate(s): ", new Object[]{Integer.valueOf(setA3.size())});
                statFs = null;
                for (String str2 : setA3) {
                    if (statFs == null) {
                        try {
                            try {
                                statFs = new StatFs(str2);
                            } catch (RuntimeException e) {
                                throw new IOException(e);
                            }
                        } catch (IOException unused) {
                            Logger.k("cannot stat %s", new Object[]{str2});
                        }
                    } else {
                        statFs.restat(str2);
                    }
                    if (statFs != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    availableBlocksLong = statFs.getAvailableBlocksLong();
                    if (statFs != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    blockSizeLong2 = statFs.getBlockSizeLong() * availableBlocksLong;
                    if (statFs != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    blockCountLong = statFs.getBlockCountLong();
                    if (statFs != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Logger.g("%s (%d/%d bytes free/total)", new Object[]{str2, Long.valueOf(blockSizeLong2), Long.valueOf(statFs.getBlockSizeLong() * blockCountLong)});
                }
                strE = dma1Var.e(x, (String) null);
                jG = dma1Var.g(y, 0L);
                it2 = setA3.iterator();
                absolutePath3 = null;
                statFs2 = null;
                while (it2.hasNext()) {
                    str = (String) it2.next();
                    if (statFs2 == null) {
                        try {
                            try {
                                statFs2 = new StatFs(str);
                            } catch (IOException e2) {
                                e = e2;
                                it3 = it2;
                                n57.s("Tried to stat path " + str + " but failed with exception: " + e.getMessage());
                            }
                        } catch (RuntimeException e3) {
                            it3 = it2;
                            throw new IOException(e3);
                        }
                    } else {
                        statFs2.restat(str);
                    }
                    blockSizeLong = statFs2.getBlockSizeLong() * statFs2.getAvailableBlocksLong();
                    if (strE != null) {
                        it3 = it2;
                        try {
                            if (nhc1.Y(strE, str, false)) {
                                blockSizeLong += jG;
                            }
                        } catch (IOException e4) {
                            e = e4;
                            n57.s("Tried to stat path " + str + " but failed with exception: " + e.getMessage());
                        }
                    } else {
                        it3 = it2;
                    }
                    if (blockSizeLong > j) {
                        absolutePath3 = str;
                        it2 = it3;
                        j = blockSizeLong;
                    } else {
                        it2 = it3;
                        dma1Var = dma1Var;
                    }
                }
                dma1Var2 = dma1Var;
                Logger.g("Chose cache volume: %s", new Object[]{absolutePath3});
                if (absolutePath3 == null) {
                    absolutePath3 = Environment.getExternalStorageDirectory().getAbsolutePath();
                    Logger.g("Falling back to volume: %s", new Object[]{absolutePath3});
                }
                absolutePath3.getClass();
                l420 l420VarO2 = oiVar.o(absolutePath3, hdn1Var.a());
                file4 = l420VarO2.b;
                if (!file4.isDirectory() || l420VarO2.mkdirs()) {
                    absolutePath2 = file4.getAbsolutePath();
                } else {
                    absolutePath2 = null;
                }
                if (absolutePath2 == null) {
                    l420VarN = oiVar.n(this.k.getFilesDir(), "spotifycache");
                    file5 = l420VarN.b;
                    Logger.g("Falling back to internal storage: %s", new Object[]{file5.getAbsolutePath()});
                    if (file5.isDirectory() && l420VarN.mkdirs()) {
                        absolutePath2 = file5.getAbsolutePath();
                    } else {
                        Logger.d("Could not create cache location %s", new Object[]{l420VarN});
                        absolutePath2 = null;
                    }
                }
            } else {
                dma1Var2 = dma1Var;
                l420VarK = oiVar.k(absolutePath2);
                file2 = l420VarK.b;
                if (file2.exists() || !file2.isDirectory()) {
                    Logger.g("Recreating cache directory %s, success: %b", new Object[]{l420VarK, Boolean.valueOf(l420VarK.mkdirs())});
                }
                if (file2.exists() && file2.isDirectory() && ((nhc1.Y(absolutePath2, "/sdcard/spotify2", false) || yqgVar.b() % 1000 == 0) && nhc1.R(absolutePath2, "/cache", false))) {
                    n57.e("Using legacy path ".concat(absolutePath2));
                }
            }
            if (!jhc1.F(absolutePath2)) {
                absolutePath2.getClass();
                hpm0Var = this.d;
                hn60Var = hpm0Var.a;
                lvc1Var = new lvc1(absolutePath2, hn60Var);
                hpm0Var.b = lvc1Var;
                epm0Var = epm0.a;
                hpm0Var.b(epm0Var);
                zJ = pxd0.J(lvc1Var);
                epm0Var2 = epm0.e;
                if (zJ) {
                    hpm0Var.b(epm0.b);
                    strA3 = pxd0.A(lvc1Var);
                    if (strA3 != null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    hpm0Var.c = new lvc1(strA3, hn60Var);
                } else {
                    zK = pxd0.K(lvc1Var);
                    epm0Var3 = epm0.c;
                    if (zK) {
                        hpm0Var.b(epm0Var3);
                        strA2 = pxd0.A(lvc1Var);
                        if (strA2 != null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        hpm0Var.c = new lvc1(strA2, hn60Var);
                    } else if (pxd0.I(lvc1Var)) {
                        hpm0Var.b(epm0Var3);
                        hpm0Var.c = lvc1Var;
                        strF = pxd0.F(lvc1Var);
                        if (strF != null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        hpm0Var.b = new lvc1(strF, hn60Var);
                    } else if (pxd0.G(lvc1Var)) {
                        hpm0Var.b(epm0Var2);
                        hpm0Var.c = lvc1Var;
                    }
                }
                epm0Var4 = hpm0Var.d;
                if (epm0Var4 == epm0Var2) {
                    hpm0Var.a();
                } else if (epm0Var4 != epm0Var) {
                    new Handler(Looper.getMainLooper()).post(new xfz0(this, (byte) 19));
                    lvc1Var2 = hpm0Var.c;
                    lvc1 lvc1Var3 = hpm0Var.b;
                    if (lvc1Var2 != null || lvc1Var3 == null || hpm0Var.d == epm0Var) {
                        eg.m("Could not finalize move");
                        return null;
                    }
                    try {
                        hpm0Var.c(jdd1.p0);
                        if (!pxd0.G(lvc1Var3)) {
                            hpm0Var.b(epm0.d);
                            try {
                                avw0.d(lvc1Var3.j());
                                lvc1Var2.a();
                            } catch (IOException unused2) {
                                throw new lcd1("Unable to delete old cache folder: ".concat(lvc1Var3.j().b.getAbsolutePath()));
                            }
                        }
                    } catch (lcd1 unused3) {
                    }
                    hpm0Var.b(epm0Var);
                    lvc1 lvc1Var4 = new lvc1(lvc1Var2.j(), hn60Var);
                    hpm0Var.b = lvc1Var4;
                    absolutePath2 = lvc1Var4.j().b.getAbsolutePath();
                }
            }
            if (absolutePath2 != null) {
                file3 = oiVar.k(absolutePath2).b;
                if (file3.exists() && file3.isDirectory()) {
                    hma1 hma1VarEdit9 = dma1Var2.edit();
                    hma1VarEdit9.d(bma1Var, absolutePath2);
                    hma1VarEdit9.g();
                }
            }
            return absolutePath2;
        }
        i = 0;
        absolutePath2 = absolutePath;
        j = 0;
        if (absolutePath2 == null) {
            Logger.g("No cache location set", new Object[i]);
            Set<String> setA4 = pjm1Var.a();
            Logger.g("Choosing cache volume between %d candidate(s): ", new Object[]{Integer.valueOf(setA4.size())});
            statFs = null;
            while (r5.hasNext()) {
                if (statFs == null) {
                    statFs = new StatFs(str2);
                } else {
                    statFs.restat(str2);
                }
                if (statFs != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                availableBlocksLong = statFs.getAvailableBlocksLong();
                if (statFs != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                blockSizeLong2 = statFs.getBlockSizeLong() * availableBlocksLong;
                if (statFs != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                blockCountLong = statFs.getBlockCountLong();
                if (statFs != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Logger.g("%s (%d/%d bytes free/total)", new Object[]{str2, Long.valueOf(blockSizeLong2), Long.valueOf(statFs.getBlockSizeLong() * blockCountLong)});
            }
            strE = dma1Var.e(x, (String) null);
            jG = dma1Var.g(y, 0L);
            it2 = setA4.iterator();
            absolutePath3 = null;
            statFs2 = null;
            while (it2.hasNext()) {
                str = (String) it2.next();
                if (statFs2 == null) {
                    statFs2 = new StatFs(str);
                } else {
                    statFs2.restat(str);
                }
                blockSizeLong = statFs2.getBlockSizeLong() * statFs2.getAvailableBlocksLong();
                if (strE != null) {
                    it3 = it2;
                    if (nhc1.Y(strE, str, false)) {
                        blockSizeLong += jG;
                    }
                } else {
                    it3 = it2;
                }
                if (blockSizeLong > j) {
                    absolutePath3 = str;
                    it2 = it3;
                    j = blockSizeLong;
                } else {
                    it2 = it3;
                    dma1Var = dma1Var;
                }
            }
            dma1Var2 = dma1Var;
            Logger.g("Chose cache volume: %s", new Object[]{absolutePath3});
            if (absolutePath3 == null) {
                absolutePath3 = Environment.getExternalStorageDirectory().getAbsolutePath();
                Logger.g("Falling back to volume: %s", new Object[]{absolutePath3});
            }
            absolutePath3.getClass();
            l420 l420VarO3 = oiVar.o(absolutePath3, hdn1Var.a());
            file4 = l420VarO3.b;
            if (file4.isDirectory()) {
                absolutePath2 = file4.getAbsolutePath();
            } else {
                absolutePath2 = file4.getAbsolutePath();
            }
            if (absolutePath2 == null) {
                l420VarN = oiVar.n(this.k.getFilesDir(), "spotifycache");
                file5 = l420VarN.b;
                Logger.g("Falling back to internal storage: %s", new Object[]{file5.getAbsolutePath()});
                if (file5.isDirectory()) {
                    Logger.d("Could not create cache location %s", new Object[]{l420VarN});
                    absolutePath2 = null;
                } else {
                    Logger.d("Could not create cache location %s", new Object[]{l420VarN});
                    absolutePath2 = null;
                }
            }
        } else {
            dma1Var2 = dma1Var;
            l420VarK = oiVar.k(absolutePath2);
            file2 = l420VarK.b;
            if (file2.exists()) {
                Logger.g("Recreating cache directory %s, success: %b", new Object[]{l420VarK, Boolean.valueOf(l420VarK.mkdirs())});
            } else {
                Logger.g("Recreating cache directory %s, success: %b", new Object[]{l420VarK, Boolean.valueOf(l420VarK.mkdirs())});
            }
            if (file2.exists()) {
                n57.e("Using legacy path ".concat(absolutePath2));
            }
        }
        if (!jhc1.F(absolutePath2)) {
            absolutePath2.getClass();
            hpm0Var = this.d;
            hn60Var = hpm0Var.a;
            lvc1Var = new lvc1(absolutePath2, hn60Var);
            hpm0Var.b = lvc1Var;
            epm0Var = epm0.a;
            hpm0Var.b(epm0Var);
            zJ = pxd0.J(lvc1Var);
            epm0Var2 = epm0.e;
            if (zJ) {
                hpm0Var.b(epm0.b);
                strA3 = pxd0.A(lvc1Var);
                if (strA3 != null) {
                    eg.m("Required value was null.");
                    return null;
                }
                hpm0Var.c = new lvc1(strA3, hn60Var);
            } else {
                zK = pxd0.K(lvc1Var);
                epm0Var3 = epm0.c;
                if (zK) {
                    hpm0Var.b(epm0Var3);
                    strA2 = pxd0.A(lvc1Var);
                    if (strA2 != null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    hpm0Var.c = new lvc1(strA2, hn60Var);
                } else if (pxd0.I(lvc1Var)) {
                    hpm0Var.b(epm0Var3);
                    hpm0Var.c = lvc1Var;
                    strF = pxd0.F(lvc1Var);
                    if (strF != null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    hpm0Var.b = new lvc1(strF, hn60Var);
                } else if (pxd0.G(lvc1Var)) {
                    hpm0Var.b(epm0Var2);
                    hpm0Var.c = lvc1Var;
                }
            }
            epm0Var4 = hpm0Var.d;
            if (epm0Var4 == epm0Var2) {
                hpm0Var.a();
            } else if (epm0Var4 != epm0Var) {
                new Handler(Looper.getMainLooper()).post(new xfz0(this, (byte) 19));
                lvc1Var2 = hpm0Var.c;
                lvc1 lvc1Var5 = hpm0Var.b;
                if (lvc1Var2 != null) {
                }
                eg.m("Could not finalize move");
                return null;
            }
        }
        if (absolutePath2 != null) {
            file3 = oiVar.k(absolutePath2).b;
            if (file3.exists()) {
                hma1 hma1VarEdit10 = dma1Var2.edit();
                hma1VarEdit10.d(bma1Var, absolutePath2);
                hma1VarEdit10.g();
            }
        }
        return absolutePath2;
    }

    public final boolean i() {
        if (!this.s) {
            return true;
        }
        String strF = this.l.f(w);
        strF.getClass();
        return this.i.a.k(strF).b.isDirectory();
    }
}
