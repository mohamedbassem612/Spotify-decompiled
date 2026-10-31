package p;

import android.net.Network;
import android.os.SystemClock;
import android.text.TextUtils;
import io.reactivex.rxjava3.functions.Function;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d18 implements Function, j2d {
    public long a;
    public Object b;
    public Object c;

    public d18(byte b) {
        switch (b) {
            case 5:
                this.b = new sui1();
                this.c = new sui1();
                break;
            case 6:
                this.b = new LinkedHashMap(16, 0.75f, true);
                break;
            default:
                this.a = 0L;
                this.b = sqe1.a;
                this.c = null;
                break;
        }
    }

    public static void A(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        z(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public static String m(String str) {
        int length = str.length() / 2;
        return String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode());
    }

    public static int r(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        eg.l();
        return 0;
    }

    public static int t(InputStream inputStream) {
        return (r(inputStream) << 24) | r(inputStream) | (r(inputStream) << 8) | (r(inputStream) << 16);
    }

    public static long u(InputStream inputStream) {
        return (((long) r(inputStream)) & 255) | ((((long) r(inputStream)) & 255) << 8) | ((((long) r(inputStream)) & 255) << 16) | ((((long) r(inputStream)) & 255) << 24) | ((((long) r(inputStream)) & 255) << 32) | ((((long) r(inputStream)) & 255) << 40) | ((((long) r(inputStream)) & 255) << 48) | ((255 & ((long) r(inputStream))) << 56);
    }

    public static String v(ugc ugcVar) {
        return new String(x(ugcVar, u(ugcVar)), "UTF-8");
    }

    public static byte[] x(ugc ugcVar, long j) throws IOException {
        long j2 = ugcVar.b - ugcVar.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(ugcVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbS = cy30.s(j, "streamToBytes length=", ", maxLength=");
        sbS.append(j2);
        throw new IOException(sbS.toString());
    }

    public static void y(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void z(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public tod1 a() {
        return (tod1) this.c;
    }

    public Object apply(Object obj) {
        return ((mcu0) this.b).a((String) null, (String) this.c, (ege0) obj, this.a, true);
    }

    public h2d c() {
        j2d j2dVar = (j2d) this.b;
        return j2dVar != null ? j2dVar.c() : h2d.a;
    }

    public i2d d() {
        j2d j2dVar = (j2d) this.b;
        return j2dVar != null ? j2dVar.d() : i2d.a;
    }

    public g2d e() {
        j2d j2dVar = (j2d) this.b;
        return j2dVar != null ? j2dVar.e() : g2d.a;
    }

    public void f(long j, long j2) {
        ((sui1) this.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((sui1) this.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object g(x4k1 x4k1Var, onm onmVar) {
        ayv0 ayv0Var;
        Object objS;
        s5k1 s5k1Var;
        long jLongValue;
        x4k1 x4k1Var2 = x4k1Var;
        if (onmVar instanceof ayv0) {
            ayv0Var = (ayv0) onmVar;
            int i = ayv0Var.e;
            if ((i & os00.INVALID_ID) != 0) {
                ayv0Var.e = i - os00.INVALID_ID;
            } else {
                ayv0Var = new ayv0(this, onmVar);
            }
        } else {
            ayv0Var = new ayv0(this, onmVar);
        }
        Object obj = ayv0Var.c;
        int i2 = ayv0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            s5k1 s5k1Var2 = x4k1Var2.e;
            ayv0Var.a = x4k1Var2;
            ayv0Var.b = s5k1Var2;
            ayv0Var.e = 1;
            if (((Set) this.c).contains(x4k1Var2.a.a())) {
                s5k1 s5k1Var3 = x4k1Var2.e;
                if (s5k1Var3.P0 != null) {
                    long j = s5k1Var3.t;
                    zrj1 zrj1Var = (zrj1) this.b;
                    String string = s5k1Var3.X.toString();
                    String str = s5k1Var3.a;
                    vve1 vve1Var = s5k1Var3.Z;
                    Long l = vve1Var != null ? new Long(vve1Var.a) : null;
                    long j2 = this.a;
                    if (l != null) {
                        jLongValue = l.longValue();
                        if (jLongValue - j > j2) {
                            jLongValue = j + j2;
                        }
                    } else {
                        jLongValue = j + j2;
                    }
                    objS = smo1.s(new l1k1(j, jLongValue, string, str, s5k1Var3.i.a.b.b(), (lnm) null, zrj1Var), ayv0Var);
                } else {
                    objS = Boolean.FALSE;
                }
            } else {
                objS = Boolean.FALSE;
            }
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            obj = objS;
            s5k1Var = s5k1Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            s5k1Var = ayv0Var.b;
            x4k1Var2 = ayv0Var.a;
            hm5.M(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return new l5k1(x4k1Var2.a);
        }
        wkt wktVar = x4k1Var2.a;
        int i3 = s5k1Var.e;
        return new h5k1(wktVar, new ant(i3, i3), x4k1Var2.b, x4k1Var2.c);
    }

    public long getTimestamp() {
        j2d j2dVar = (j2d) this.b;
        if (j2dVar != null) {
            return j2dVar.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        eg.m("No timestamp is available.");
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(onm onmVar) {
        sy71 sy71Var;
        if (onmVar instanceof sy71) {
            sy71Var = (sy71) onmVar;
            int i = sy71Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                sy71Var.c = i - os00.INVALID_ID;
            } else {
                sy71Var = new sy71(this, onmVar);
            }
        } else {
            sy71Var = new sy71(this, onmVar);
        }
        Object obj = sy71Var.a;
        int i2 = sy71Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            long j = this.a;
            if (j > 0) {
                sy71Var.c = 1;
                if (hap1.i(j, sy71Var) != d9nVar) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        q8n q8nVar = (q8n) this.c;
        kdt0 kdt0Var = new kdt0(this, (lnm) null, (byte) 24);
        sy71Var.c = 2;
        return fn31.Y(q8nVar, kdt0Var, sy71Var) == d9nVar ? d9nVar : rih1Var;
    }

    public e18 i() {
        Object obj;
        if (!((sqe1) this.b).p() && (obj = this.c) != null) {
            dm5.m(((sqe1) this.b).b(obj) != -1);
        }
        return new e18(this);
    }

    public synchronized void j() {
        this.c = null;
        this.a++;
        ((LinkedHashMap) this.b).clear();
    }

    public synchronized opc k(String str) {
        qdu qduVar = (qdu) ((LinkedHashMap) this.b).get(str);
        if (qduVar == null) {
            return null;
        }
        File fileL = l(str);
        try {
            ugc ugcVar = new ugc(new BufferedInputStream(new FileInputStream(fileL)), fileL.length());
            try {
                qdu qduVarA = qdu.a(ugcVar);
                if (TextUtils.equals(str, qduVarA.b)) {
                    opc opcVarB = qduVar.b(x(ugcVar, ugcVar.b - ugcVar.c));
                    ugcVar.close();
                    return opcVarB;
                }
                vqk1.a("%s: key=%s, found=%s", fileL.getAbsolutePath(), str, qduVarA.b);
                qdu qduVar2 = (qdu) ((LinkedHashMap) this.b).remove(str);
                if (qduVar2 != null) {
                    this.a -= qduVar2.a;
                }
                ugcVar.close();
                return null;
            } catch (Throwable th) {
                ugcVar.close();
                throw th;
            }
        } catch (IOException e) {
            vqk1.a("%s: %s", fileL.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean zDelete = l(str).delete();
                qdu qduVar3 = (qdu) ((LinkedHashMap) this.b).remove(str);
                if (qduVar3 != null) {
                    this.a -= qduVar3.a;
                }
                if (!zDelete) {
                    vqk1.a("Could not delete cache entry for key=%s, filename=%s", str, m(str));
                }
                return null;
            }
        }
    }

    public File l(String str) {
        return new File(((ilh1) this.c).d(), m(str));
    }

    public synchronized void n() {
        try {
            File fileD = ((ilh1) this.c).d();
            if (!fileD.exists()) {
                if (!fileD.mkdirs()) {
                    vqk1.a("Unable to create cache dir %s", fileD.getAbsolutePath());
                }
                return;
            }
            File[] fileArrListFiles = fileD.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    long length = file.length();
                    ugc ugcVar = new ugc(new BufferedInputStream(new FileInputStream(file)), length);
                    try {
                        qdu qduVarA = qdu.a(ugcVar);
                        qduVarA.a = length;
                        q(qduVarA.b, qduVarA);
                        ugcVar.close();
                    } catch (Throwable th) {
                        ugcVar.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void o() {
        if (this.a < 5242880) {
            return;
        }
        int i = 0;
        if (vqk1.a) {
            vqk1.b("Pruning old cache entries.", new Object[0]);
        }
        long j = this.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = ((LinkedHashMap) this.b).entrySet().iterator();
        while (it.hasNext()) {
            qdu qduVar = (qdu) ((Map.Entry) it.next()).getValue();
            if (l(qduVar.b).delete()) {
                this.a -= qduVar.a;
            } else {
                String str = qduVar.b;
                vqk1.a("Could not delete cache entry for key=%s, filename=%s", str, m(str));
            }
            it.remove();
            i++;
            if (this.a < 4718592.0f) {
                break;
            }
        }
        if (vqk1.a) {
            vqk1.b("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.a - j), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    public synchronized void p(String str, opc opcVar) {
        long j = this.a;
        byte[] bArr = opcVar.a;
        if (j + ((long) bArr.length) > 5242880 && bArr.length > 4718592.0f) {
            return;
        }
        File fileL = l(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileL));
            qdu qduVar = new qdu(str, opcVar);
            if (!qduVar.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                vqk1.a("Failed to write header for %s", fileL.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(opcVar.a);
            bufferedOutputStream.close();
            qduVar.a = fileL.length();
            q(str, qduVar);
            o();
        } catch (IOException unused) {
            if (!fileL.delete()) {
                vqk1.a("Could not clean up file %s", fileL.getAbsolutePath());
            }
            if (!((ilh1) this.c).d().exists()) {
                vqk1.a("Re-initializing cache after external clearing.", new Object[0]);
                ((LinkedHashMap) this.b).clear();
                this.a = 0L;
                n();
            }
        }
    }

    public void q(String str, qdu qduVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(str)) {
            this.a = (qduVar.a - ((qdu) linkedHashMap.get(str)).a) + this.a;
        } else {
            this.a += qduVar.a;
        }
        linkedHashMap.put(str, qduVar);
    }

    public Object s(Object obj) {
        sts stsVar = (sts) ((LinkedHashMap) this.c).get(obj);
        if (stsVar != null) {
            if (((yqg) this.b).b() - stsVar.b >= jfv.h(this.a)) {
                stsVar = null;
            }
            if (stsVar != null) {
                return stsVar.a;
            }
        }
        return null;
    }

    public synchronized boolean w(String str, long j, double d, long j2, long j3, long j4, long j5) {
        try {
            if (!(((Network) this.c) != null && this.a == j)) {
                return false;
            }
            if (Math.abs(d) <= Double.MAX_VALUE && d > 0.0d && j2 > 0) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                Object sw60Var = linkedHashMap.get(str);
                if (sw60Var == null) {
                    sw60Var = new sw60();
                    linkedHashMap.put(str, sw60Var);
                }
                ((sw60) sw60Var).a(d, j2, j3, j4, j5);
                while (((LinkedHashMap) this.b).size() > 8) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.b;
                    linkedHashMap2.remove(o7h.p0(linkedHashMap2.keySet()));
                }
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public d18(Function0 function0, long j, q8n q8nVar) {
        this.b = function0;
        this.a = j;
        this.c = q8nVar;
    }

    public d18(long j, yqg yqgVar) {
        this.a = j;
        this.b = yqgVar;
        this.c = new LinkedHashMap();
    }

    public /* synthetic */ d18(Object obj, long j, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
