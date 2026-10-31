package p;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mta implements SingleTransformer, c7g1, qs40, Function, c290, BiFunction, rl71, n8n, av30, h271 {
    public final /* synthetic */ byte a;

    public mta(d1d d1dVar, w2d w2dVar, g4r g4rVar, g661 g661Var, js50 js50Var) {
        this.a = (byte) 1;
        Integer num = (Integer) w2dVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        new nhc(g4rVar);
        x2p1.m(new vq6(w2dVar, (byte) 29));
    }

    public static final a811 l(Integer num) {
        a811 a811Var = (a811) men0.d.get(Integer.valueOf(num.intValue()));
        return a811Var == null ? men0.e : a811Var;
    }

    public static final float r(mta mtaVar, float f, boolean z) {
        mtaVar.getClass();
        return z ? -f : f;
    }

    public static void u(HttpURLConnection httpURLConnection, mn21 mn21Var, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", mn21Var.getBodyContentType());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public static ArrayList v(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new ev50((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    public static void z(HttpURLConnection httpURLConnection, mn21 mn21Var) throws IOException {
        switch (mn21Var.getMethod()) {
            case -1:
                byte[] postBody = mn21Var.getPostBody();
                if (postBody != null) {
                    httpURLConnection.setRequestMethod("POST");
                    u(httpURLConnection, mn21Var, postBody);
                }
                break;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                break;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                byte[] body = mn21Var.getBody();
                if (body != null) {
                    u(httpURLConnection, mn21Var, body);
                }
                break;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                byte[] body2 = mn21Var.getBody();
                if (body2 != null) {
                    u(httpURLConnection, mn21Var, body2);
                }
                break;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                break;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                break;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                break;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                byte[] body3 = mn21Var.getBody();
                if (body3 != null) {
                    u(httpURLConnection, mn21Var, body3);
                }
                break;
            default:
                eg.m("Unknown method type.");
                break;
        }
    }

    public void a(j8e0 j8e0Var, boolean z, boolean z2, iu30 iu30Var, uw9 uw9Var, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, xu30 xu30Var8, xu30 xu30Var9, xu30 xu30Var10, xu30 xu30Var11, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        boolean z4;
        uw9 uw9Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-437537699);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(j8e0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= x340Var.h(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            z4 = z2;
            i2 |= x340Var.h(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            uw9Var2 = uw9Var;
            i2 |= x340Var.i(uw9Var2) ? 16384 : 8192;
        } else {
            uw9Var2 = uw9Var;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var.i(xu30Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 536870912 : 268435456;
        }
        int i3 = i2;
        char c = 1024;
        int i4 = (x340Var.i(xu30Var6) ? (char) 4 : (char) 2) | (x340Var.i(xu30Var7) ? ' ' : (char) 16) | (x340Var.i(xu30Var8) ? 256 : 128);
        if (x340Var.i(xu30Var9)) {
            c = 2048;
        }
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (((((i4 | c) | (x340Var.i(xu30Var10) ? (char) 16384 : (char) 8192)) | (x340Var.i(xu30Var11) ? (char) 0 : (char) 0)) | (x340Var.g(this) ? (char) 0 : (char) 0)) & 599187) == 599186) ? false : true)) {
            apo.r(-1111441381, new wfb1(z3, j8e0Var, uw9Var2, xu30Var5, this, xu30Var6, xu30Var3, xu30Var7, xu30Var, z4, xu30Var4, xu30Var8, xu30Var10, xu30Var11, xu30Var9, xu30Var2), x340Var).invoke(iu30Var, x340Var, Integer.valueOf(((i3 >> 9) & 14) | 48));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new by00(this, j8e0Var, z, z2, iu30Var, uw9Var, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, xu30Var8, xu30Var9, xu30Var10, xu30Var11, i);
        }
    }

    public Object apply(Object obj, Object obj2) {
        i5w0 i5w0Var;
        v031 v031Var = (v031) obj;
        boolean zContains = v031Var.b.contains("mft_disallow");
        i5w0 i5w0Var2 = j5.a;
        if (zContains) {
            i5w0Var = new i5w0(v031Var.a);
        } else {
            Logger.d("Unhandled restricted action: %s", new Object[]{rc11.a.b(v031Var.getClass()).r()});
            i5w0Var = i5w0Var2;
        }
        mgz mgzVar = (mgz) i5w0Var.h();
        return mgzVar != null ? new i5w0(new r0i0(5, 0L, 0.0f, (Bundle) null, mgzVar, v031Var.getClass().getCanonicalName(), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16334)) : i5w0Var2;
    }

    public Object b(u171 u171Var) {
        qz61 qz61Var = u171Var.a;
        if (!u890.j(qz61Var.c, ysd.a)) {
            hhg1.n("Expected Unknown card data for video chapter card");
            return null;
        }
        String strZ = qz61Var.b.z();
        if (strZ != null) {
            return new ufj1(strZ);
        }
        hhg1.n("Required value was null.");
        return null;
    }

    public Single c(Single single) {
        return single.flatMap(qzs0.Z).compose(new dn81(30, 1000L, 5)).onErrorResumeNext(rzs0.Y);
    }

    public Object convert(int i) {
        Object obj = null;
        switch (this.a) {
            case 12:
                mig migVarA = mig.a(i);
                return migVarA == null ? mig.f : migVarA;
            case 21:
                if (i == 0) {
                    obj = pex0.PROFILE_EDITABLE_FEATURE_UNSPECIFIED;
                } else if (i == 1) {
                    obj = pex0.PROFILE_EDITABLE_FEATURE_BIO;
                } else if (i == 2) {
                    obj = pex0.PROFILE_EDITABLE_FEATURE_SOCIAL_HANDLE;
                }
                return obj == null ? pex0.UNRECOGNIZED : obj;
            default:
                if (i == 0) {
                    obj = f131.UNKNOWN_RESTRICTION;
                } else if (i == 1) {
                    obj = f131.FILTER_EXPLICIT_CONTENT;
                }
                return obj == null ? f131.UNRECOGNIZED : obj;
        }
    }

    public Object g(k371 k371Var, lnm lnmVar) {
        return Boolean.TRUE;
    }

    public void i(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1030791524);
        int i2 = (b0kVar3.g(this) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            boolean zD = b0kVar3.d(4.0f);
            Object objT = b0kVar3.T();
            if (zD || objT == fkj0.X) {
                objT = new uvx(1, (pgx) null, 3, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 490);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("standard_row_loader", u291.f(nim0.a, 1.0f)), (uvx) objT, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-1788087461, new xfb1(this, (byte) 0), b0kVar3), (xu30) null, apo.r(1379273372, new xfb1(this, (byte) 1), b0kVar3), (xu30) null, (xu30) null, (xu30) null, apo.r(-1618508384, new xfb1(this, (byte) 2), b0kVar3), b0kVar2, 805306438, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(this, i, (byte) 21);
        }
    }

    public void j(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        float f5;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1001251140);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f4 = f3;
        } else if ((i & 384) == 0) {
            f4 = f3;
            i3 = (x340Var.d(f4) ? 256 : 128) | i;
        } else {
            f4 = f3;
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            float f7 = i4 != 0 ? 0.0f : f4;
            f5 = f2;
            qim0 qim0VarN = anm1.N("standard_row_shimmer_box", uyn1.B(u291.h(u291.v(nim0.a, f), f5), 0.0f, f7, 0.0f, 0.0f, 13));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarN, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f6 = f7;
        } else {
            f5 = f2;
            x340Var.b0();
            f6 = f4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ep7(this, f, f5, f6, i, i2, (byte) 2);
        }
    }

    public String k(String str, ioj0 ioj0Var) {
        mq70 mq70Var;
        up70 up70VarA;
        goj0 goj0VarA;
        hoj0 hoj0VarC = ioj0Var.c(xkk1.class, str);
        xkk1 xkk1Var = (xkk1) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a);
        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) {
            return null;
        }
        return up70VarA.a.a;
    }

    public Set m() {
        return f46.S0(new aq21[]{new yp21(zoy0.class), new yp21(xkk1.class), new zp21(jo70.class)});
    }

    public mmr0 n(String str, ioj0 ioj0Var) {
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        if (hoj0VarC == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        goj0 goj0VarA = hoj0VarC.a();
        goj0VarA.getClass();
        jo70 jo70Var = (ez00) goj0VarA.a;
        io70 io70Var = jo70Var.e;
        vto vtoVar = io70Var != null ? new vto(io70Var.b, io70Var.a) : null;
        List<ho70> list = jo70Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ho70 ho70Var : list) {
            arrayList.add(new uto(ho70Var.b, ho70Var.a));
        }
        return new mmr0(vtoVar, arrayList);
    }

    public long o(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        hoj0 hoj0VarC = ioj0Var.c(zoy0.class, str);
        Long lZ = l4o1.z((zoy0) ((hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA.a), new h94());
        if (lZ != null) {
            return lZ.longValue();
        }
        return 0L;
    }

    public String p(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null) {
            return null;
        }
        return ((jo70) goj0VarA.a).a;
    }

    public String q(String str, ioj0 ioj0Var) {
        goj0 goj0VarA;
        jo70 jo70Var;
        hoj0 hoj0VarC = ioj0Var.c(jo70.class, str);
        if (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (jo70Var = (jo70) goj0VarA.a) == null) {
            return null;
        }
        return jo70Var.b;
    }

    public Object s(t171 t171Var) {
        throw new UnsupportedOperationException("Chat preview input not supported for video chapter cards");
    }

    public Object t(v171 v171Var) {
        throw new UnsupportedOperationException("URI input not supported for video chapter cards");
    }

    public long w() {
        return System.currentTimeMillis();
    }

    public w4c0 x(mn21 mn21Var, Map map) throws Throwable {
        String url = mn21Var.getUrl();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(mn21Var.getHeaders());
        URL url2 = new URL(url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int timeoutMs = mn21Var.getTimeoutMs();
        httpURLConnection.setConnectTimeout(timeoutMs);
        httpURLConnection.setReadTimeout(timeoutMs);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals(url2.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            z(httpURLConnection, mn21Var);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (mn21Var.getMethod() == 4 || ((100 <= responseCode && responseCode < 200) || responseCode == 204 || responseCode == 304)) {
                w4c0 w4c0Var = new w4c0(responseCode, v(httpURLConnection.getHeaderFields()), -1, (ye70) null);
                httpURLConnection.disconnect();
                return w4c0Var;
            }
            try {
                return new w4c0(responseCode, v(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new ye70(httpURLConnection));
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int y(d700 d700Var, ney0 ney0Var) {
        ryy ryyVar = ryy.f;
        ryy ryyVar2 = wyy.d;
        ryy ryyVar3 = wyy.c;
        ryy ryyVar4 = ryy.i;
        ryy ryyVar5 = ryy.e;
        ryy ryyVar6 = ryy.h;
        String str = ney0Var.k;
        boolean z = ney0Var.f;
        if (eyo1.q(str) && ney0Var.v.contains(m9m.b)) {
            ryyVar6 = ryyVar4;
        } else if (eyo1.q(str)) {
            ryyVar6 = z ? ryyVar3 : ryyVar2;
        } else if (eyo1.p(str)) {
            ryyVar6 = ryyVar;
        } else if (!eyo1.t(str)) {
            if (eyo1.n(str)) {
                ryyVar6 = z ? oyy.c : oyy.d;
            } else if (eyo1.u(str)) {
                ryyVar6 = z ? tyy.c : tyy.d;
            } else if (eyo1.o(str)) {
                ryyVar6 = ryy.c;
            } else if (!eyo1.r(str)) {
                ryyVar6 = ryyVar5;
            }
        }
        if (d700Var instanceof yvz) {
            if (ryyVar6.equals(ryyVar5)) {
                return 5;
            }
            return (ryyVar6.equals(ryyVar3) || ryyVar6.equals(ryyVar2)) ? 3 : 2;
        }
        if (d700Var instanceof k400) {
            if (ney0Var.g) {
                return 4;
            }
            if (ryyVar6.equals(ryyVar5)) {
                return 5;
            }
            return (ryyVar6.equals(ryyVar4) || ryyVar6.equals(ryy.g)) ? 1 : 2;
        }
        if (d700Var.equals(pvz.c)) {
            return (ryyVar6.equals(ryyVar5) || ryyVar6.equals(ryyVar)) ? 8 : 6;
        }
        if (d700Var.equals(pvz.b)) {
            return 5;
        }
        if (d700Var.equals(pvz.a)) {
            return 7;
        }
        eg.o();
        return 0;
    }

    public mta(int i) {
        this.a = (byte) 9;
    }

    public /* synthetic */ mta(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public Object apply(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 7:
                c7l c7lVar = (c7l) obj;
                if (c7lVar.a) {
                    z = false;
                } else {
                    ArrayList<e2l> arrayList = c7lVar.c;
                    if (arrayList.isEmpty()) {
                        z = false;
                    } else {
                        for (e2l e2lVar : arrayList) {
                            if (!e2lVar.b || e2lVar.a) {
                            }
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                ((a5g1) obj).getClass();
                int iC = l1d.C(2);
                if (iC == 0) {
                    return y5g1.b;
                }
                if (iC == 1) {
                    return y5g1.a;
                }
                eg.o();
                return null;
        }
    }
}
