package p;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.os.SystemClock;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.bluetooth.events.proto.SocialRadarBluetoothDebug;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class it8 implements Function4, Function, j2d {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public it8(i8h1 i8h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 14:
                this.b = i8h1Var;
                this.c = new otk0(new bqk0((byte) 11), (byte) 2);
                break;
            default:
                this.b = i8h1Var;
                this.c = new xok0((byte) 7);
                break;
        }
    }

    public static ArrayList D(List list, Map map) {
        List<lvy> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (lvy lvyVar : list2) {
            String str = lvyVar.a;
            long j = lvyVar.b.a;
            long j2 = lvyVar.c.a;
            String str2 = (String) map.get(str);
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new yq9(j, j2, str, str2));
        }
        return arrayList;
    }

    public static final /* synthetic */ ai8 f(it8 it8Var) {
        return (ai8) it8Var.b;
    }

    public static void m(it8 it8Var, String str, String str2, Integer num, String str3, String str4, String str5, int i) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        if (((ni9) it8Var.b).h.isEnabled()) {
            String strY0 = o7h.y0(f46.J0(MessageDigest.getInstance("SHA-256").digest(str.getBytes(nne.a)), 8), "", (String) null, (String) null, zv8.X, 30);
            p5a1 p5a1VarN = SocialRadarBluetoothDebug.n();
            p5a1VarN.r(strY0);
            p5a1VarN.n(str2);
            if (num != null) {
                p5a1VarN.u(num.intValue());
            }
            if (str3 != null) {
                p5a1VarN.t(str3);
            }
            if (str4 != null) {
                p5a1VarN.s(str4);
            }
            if (str5 != null) {
                p5a1VarN.q(str5);
            }
            ((t2j0) it8Var.c).a(p5a1VarN.build());
        }
    }

    public void A(String str, String str2, tv80 tv80Var, nk51 nk51Var) {
        lik1 lik1Var = new lik1(str2);
        mfm mfmVarA = ((i4q) this.c).a(lik1Var);
        Observable observableA = a6z.a((a6z) this.b, str, str2, null, lik1Var, new r6z((String) null, true, false, false, false, false, true, false, false, true, false, false, false, false, false, false, (ugo0) null, (c821) null, false, false, false, false, nk51Var, false, (String) null, false, (p860) null, 1040186813), null, 36);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableA, yon1.Y0(), new bjm(4, str, str2), tv80Var, 16);
    }

    public void B() {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.u();
        }
        this.c = null;
    }

    public gtf1 C(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                oon1.v("Unmatched track of type: " + i);
                return new x6u();
            }
            if (i == iArr[i2]) {
                return ((n541[]) this.c)[i2];
            }
            i2++;
        }
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        mmr0 mmr0Var = (mmr0) obj;
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj4;
        g281 g281Var = (g281) ((Map) obj3).get((String) this.b);
        boolean z = false;
        if (g281Var != null && ((dma1) mmr0Var.b).l(kt8.e, 0) < 3 && !bool2.booleanValue()) {
            kt8 kt8Var = (kt8) this.c;
            boolean zBooleanValue = bool.booleanValue();
            kt8Var.getClass();
            if (!g281Var.x && (!g281Var.w || zBooleanValue)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public tod1 a() {
        return (tod1) this.b;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                return new CompletableFromAction(new wf0((Intent) this.b, (b72) this.c, (e961) obj, (byte) 3));
            case 15:
                List list = (List) this.b;
                f8b f8bVar = (f8b) this.c;
                if (((Boolean) obj).booleanValue()) {
                    return f8bVar.a.c("", list, false).map(y580.g).subscribeOn(f8bVar.d);
                }
                List list2 = list;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : list2) {
                    linkedHashMap.put(obj2, Boolean.FALSE);
                }
                return Observable.just(linkedHashMap);
            case 19:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to expand item for Bridge Tracks", new Object[0]);
                p4c p4cVar = (p4c) this.b;
                i iVar = (i) this.c;
                ka61 ka61Var = p4cVar.a;
                return new p4c(ka61.h(ka61Var, ka61Var.a.k(iVar, z6x.a, false)), p4cVar.b, p4cVar.c);
            default:
                List list3 = ((p510) obj).e;
                v7c v7cVar = (v7c) this.b;
                m210 m210Var = (m210) this.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    u310 u310Var = (u310) v7cVar.c.c((t510) it.next(), "", Boolean.TRUE, false, false, (n3q0) null, (y310) null, 3, m210Var, (String) null, (rz0) null).h();
                    if (u310Var != null) {
                        arrayList.add(u310Var);
                    }
                }
                return new z310(arrayList, (f410) null, (m510) null, (String) null);
        }
    }

    public CaptureResult b() {
        return (CaptureResult) this.c;
    }

    public h2d c() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AF_STATE);
        h2d h2dVar = h2d.a;
        if (num == null) {
            return h2dVar;
        }
        switch (num.intValue()) {
            case 0:
                return h2d.b;
            case 1:
            case 3:
                return h2d.c;
            case 2:
                return h2d.d;
            case 4:
                return h2d.f;
            case 5:
                return h2d.g;
            case 6:
                return h2d.e;
            default:
                j2h1.p("C2CameraCaptureResult");
                return h2dVar;
        }
    }

    public i2d d() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AWB_STATE);
        i2d i2dVar = i2d.a;
        if (num == null) {
            return i2dVar;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return i2d.b;
        }
        if (iIntValue == 1) {
            return i2d.c;
        }
        if (iIntValue == 2) {
            return i2d.d;
        }
        if (iIntValue == 3) {
            return i2d.e;
        }
        j2h1.p("C2CameraCaptureResult");
        return i2dVar;
    }

    public g2d e() {
        Integer num = (Integer) ((CaptureResult) this.c).get(CaptureResult.CONTROL_AE_STATE);
        g2d g2dVar = g2d.a;
        if (num == null) {
            return g2dVar;
        }
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return g2d.b;
        }
        if (iIntValue != 1) {
            if (iIntValue == 2) {
                return g2d.e;
            }
            if (iIntValue == 3) {
                return g2d.f;
            }
            if (iIntValue == 4) {
                return g2d.d;
            }
            if (iIntValue != 5) {
                j2h1.p("C2CameraCaptureResult");
                return g2dVar;
            }
        }
        return g2d.c;
    }

    public hhc g() {
        if (((nwg) this.b).E() == 0) {
            return new hhc((byte[]) this.c);
        }
        eg.m("Did not write as much data as expected.");
        return null;
    }

    public long getTimestamp() {
        Long l = (Long) ((CaptureResult) this.c).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public void h() {
        cab cabVar = (cab) this.b;
        if (cabVar != null) {
            ((AtomicBoolean) cabVar.c).set(true);
            ((ScheduledFuture) cabVar.b).cancel(true);
        }
        this.b = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat */
    public void i(jb61 jb61Var) throws CameraAccessExceptionCompat {
        CameraDevice cameraDevice = (CameraDevice) this.b;
        cameraDevice.getClass();
        ib61 ib61Var = jb61Var.a;
        ib61Var.g().getClass();
        List listA = ib61Var.a();
        if (listA == null) {
            hhg1.n("Invalid output configurations");
            return;
        }
        if (ib61Var.e() == null) {
            hhg1.n("Invalid executor");
            return;
        }
        cameraDevice.getId();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            String strD = ((utq0) it.next()).a.d();
            if (strD != null && !strD.isEmpty()) {
                j2h1.M("CameraDeviceCompat");
            }
        }
        q2d q2dVar = new q2d(ib61Var.e(), ib61Var.g());
        List listA2 = ib61Var.a();
        g3d g3dVar = (g3d) this.c;
        g3dVar.getClass();
        Handler handler = g3dVar.a;
        ei80 ei80VarD = ib61Var.d();
        try {
            if (ei80VarD != null) {
                InputConfiguration inputConfiguration = ei80VarD.a.a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, jb61.a(listA2), q2dVar, handler);
            } else {
                if (ib61Var.f() != 1) {
                    cameraDevice.createCaptureSessionByOutputConfigurations(jb61.a(listA2), q2dVar, handler);
                    return;
                }
                ArrayList arrayList = new ArrayList(listA2.size());
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((OutputConfiguration) ((utq0) it2.next()).a.c()).getSurface());
                }
                cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, q2dVar, handler);
            }
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        }
    }

    public nwg j() {
        return (nwg) this.b;
    }

    public String k() {
        Map map;
        o2u0 o2u0Var = (o2u0) this.c;
        if (o2u0Var == null || (map = o2u0Var.d) == null) {
            return null;
        }
        return (String) map.get("playback_id");
    }

    public boolean l() {
        return ((uoa) this.b) != null;
    }

    public mr20 n(String str) {
        if (str.length() == 0) {
            return new huz(new xq9((String) null, z6x.a, false), (byte) 10);
        }
        return new x010(o(str), new lt20(new m441(new us0(this, str, (lnm) null, (byte) 6)), new re1(3, (lnm) null, (byte) 8), (byte) 0), new l2(3, (lnm) null, (byte) 16), (byte) 1);
    }

    public mr20 o(String str) {
        return str.length() == 0 ? new huz(z6x.a, (byte) 10) : new lt20(hu20.e(rqt0.u(((uvy) this.b).f(str)), new qt((lnm) null, this, (byte) 23)), new re1(3, (lnm) null, (byte) 9), (byte) 0);
    }

    public void p() {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.android.volley.ClientError */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.android.volley.NoConnectionError */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.android.volley.ServerError */
    /* JADX WARN: Code duplicated, block: B:103:0x01cd A[LOOP:0: B:3:0x0004->B:103:0x01cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:64:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e A[LOOP:1: B:68:0x0128->B:70:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0146  */
    /* JADX WARN: Code duplicated, block: B:95:0x017b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0188  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:99:0x019b  */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x01cd, please report this as an issue */
    public h8o0 q(mn21 mn21Var) throws ServerError, ClientError, VolleyError, NoConnectionError {
        rok0 rok0Var;
        int i;
        List<ev50> listUnmodifiableList;
        TreeMap treeMap;
        String str;
        int timeoutMs;
        VolleyError volleyError;
        int i2;
        Map map;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            w4c0 w4c0Var = null;
            try {
                opc cacheEntry = mn21Var.getCacheEntry();
                if (cacheEntry == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e) {
                        e = e;
                        e = e;
                        if (e instanceof SocketTimeoutException) {
                            rok0Var = new rok0("socket", new TimeoutError(), (byte) 9);
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + mn21Var.getUrl(), e);
                            }
                            if (w4c0Var != null) {
                                i = w4c0Var.b;
                                vqk1.a("Unexpected response code %d for %s", Integer.valueOf(i), mn21Var.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList((ArrayList) w4c0Var.d);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map2 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            for (ev50 ev50Var : listUnmodifiableList) {
                                                treeMap.put(ev50Var.a, ev50Var.b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i != 401) {
                                        rok0Var = new rok0("auth", new AuthFailureError(), (byte) 9);
                                    } else {
                                        rok0Var = new rok0("auth", new AuthFailureError(), (byte) 9);
                                    }
                                } else {
                                    rok0Var = new rok0("network", new NetworkError(), (byte) 9);
                                }
                            } else {
                                if (!mn21Var.shouldRetryConnectionErrors()) {
                                    throw new NoConnectionError(e);
                                }
                                rok0Var = new rok0("connection", new NoConnectionError(), (byte) 9);
                            }
                        }
                        str = (String) rok0Var.b;
                        vc31 retryPolicy = mn21Var.getRetryPolicy();
                        timeoutMs = mn21Var.getTimeoutMs();
                        try {
                            volleyError = (VolleyError) rok0Var.c;
                            f3a f3aVar = (f3a) retryPolicy;
                            i2 = f3aVar.b + 1;
                            f3aVar.b = i2;
                            int i3 = f3aVar.a;
                            f3aVar.a = i3 + ((int) (i3 * 1.0f));
                            if (i2 > 1) {
                                throw volleyError;
                            }
                            mn21Var.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                        } catch (VolleyError e2) {
                            mn21Var.addMarker(str + "-timeout-giveup [timeout=" + timeoutMs + "]");
                            throw e2;
                        }
                    }
                } else {
                    HashMap map3 = new HashMap();
                    String str2 = cacheEntry.b;
                    if (str2 != null) {
                        map3.put("If-None-Match", str2);
                    }
                    long j = cacheEntry.d;
                    if (j > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        map3.put("If-Modified-Since", simpleDateFormat.format(new Date(j)));
                    }
                    map = map3;
                }
                try {
                    w4c0 w4c0VarX = ((mta) this.b).x(mn21Var, map);
                    try {
                        int i4 = w4c0VarX.b;
                        List listUnmodifiableList2 = Collections.unmodifiableList((ArrayList) w4c0VarX.d);
                        if (i4 == 304) {
                            SystemClock.elapsedRealtime();
                            return b3o1.t(mn21Var, listUnmodifiableList2);
                        }
                        InputStream inputStream = (InputStream) w4c0VarX.e;
                        if (inputStream == null) {
                            inputStream = null;
                        }
                        byte[] bArrV = inputStream != null ? b3o1.v(inputStream, w4c0VarX.c, (mgc) this.c) : new byte[0];
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (vqk1.a || jElapsedRealtime2 > 3000) {
                            vqk1.a("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", mn21Var, Long.valueOf(jElapsedRealtime2), bArrV != null ? Integer.valueOf(bArrV.length) : "null", Integer.valueOf(i4), Integer.valueOf(((f3a) mn21Var.getRetryPolicy()).b));
                        }
                        if (i4 < 200 || i4 > 299) {
                            throw new IOException();
                        }
                        SystemClock.elapsedRealtime();
                        return new h8o0(bArrV, false, listUnmodifiableList2);
                    } catch (IOException e3) {
                        e = e3;
                        w4c0Var = w4c0VarX;
                        if (e instanceof SocketTimeoutException) {
                            rok0Var = new rok0("socket", new TimeoutError(), (byte) 9);
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new RuntimeException("Bad URL " + mn21Var.getUrl(), e);
                            }
                            if (w4c0Var != null) {
                                i = w4c0Var.b;
                                vqk1.a("Unexpected response code %d for %s", Integer.valueOf(i), mn21Var.getUrl());
                                if (0 != 0) {
                                    listUnmodifiableList = Collections.unmodifiableList((ArrayList) w4c0Var.d);
                                    SystemClock.elapsedRealtime();
                                    if (listUnmodifiableList != null) {
                                        if (listUnmodifiableList.isEmpty()) {
                                            Map map4 = Collections.EMPTY_MAP;
                                        } else {
                                            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                            while (r5.hasNext()) {
                                                treeMap.put(ev50Var.a, ev50Var.b);
                                            }
                                        }
                                    }
                                    if (listUnmodifiableList != null) {
                                        Collections.unmodifiableList(listUnmodifiableList);
                                    }
                                    if (i != 401 || i == 403) {
                                        rok0Var = new rok0("auth", new AuthFailureError(), (byte) 9);
                                    } else {
                                        if (i >= 400 && i <= 499) {
                                            throw new ClientError();
                                        }
                                        if (i < 500 || i > 599 || !mn21Var.shouldRetryServerErrors()) {
                                            throw new ServerError();
                                        }
                                        rok0Var = new rok0("server", new ServerError(), (byte) 9);
                                    }
                                } else {
                                    rok0Var = new rok0("network", new NetworkError(), (byte) 9);
                                }
                            } else {
                                if (!mn21Var.shouldRetryConnectionErrors()) {
                                    throw new NoConnectionError(e);
                                }
                                rok0Var = new rok0("connection", new NoConnectionError(), (byte) 9);
                            }
                        }
                        str = (String) rok0Var.b;
                        vc31 retryPolicy2 = mn21Var.getRetryPolicy();
                        timeoutMs = mn21Var.getTimeoutMs();
                        volleyError = (VolleyError) rok0Var.c;
                        f3a f3aVar2 = (f3a) retryPolicy2;
                        i2 = f3aVar2.b + 1;
                        f3aVar2.b = i2;
                        int i5 = f3aVar2.a;
                        f3aVar2.a = i5 + ((int) (i5 * 1.0f));
                        if (i2 > 1) {
                            throw volleyError;
                        }
                        mn21Var.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                    }
                } catch (IOException e4) {
                    e = e4;
                    e = e;
                    if (e instanceof SocketTimeoutException) {
                        rok0Var = new rok0("socket", new TimeoutError(), (byte) 9);
                    } else {
                        if (e instanceof MalformedURLException) {
                            throw new RuntimeException("Bad URL " + mn21Var.getUrl(), e);
                        }
                        if (w4c0Var != null) {
                            i = w4c0Var.b;
                            vqk1.a("Unexpected response code %d for %s", Integer.valueOf(i), mn21Var.getUrl());
                            if (0 != 0) {
                                listUnmodifiableList = Collections.unmodifiableList((ArrayList) w4c0Var.d);
                                SystemClock.elapsedRealtime();
                                if (listUnmodifiableList != null) {
                                    if (listUnmodifiableList.isEmpty()) {
                                        Map map5 = Collections.EMPTY_MAP;
                                    } else {
                                        treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                        while (r5.hasNext()) {
                                            treeMap.put(ev50Var.a, ev50Var.b);
                                        }
                                    }
                                }
                                if (listUnmodifiableList != null) {
                                    Collections.unmodifiableList(listUnmodifiableList);
                                }
                                if (i != 401) {
                                    rok0Var = new rok0("auth", new AuthFailureError(), (byte) 9);
                                } else {
                                    rok0Var = new rok0("auth", new AuthFailureError(), (byte) 9);
                                }
                            } else {
                                rok0Var = new rok0("network", new NetworkError(), (byte) 9);
                            }
                        } else {
                            if (!mn21Var.shouldRetryConnectionErrors()) {
                                throw new NoConnectionError(e);
                            }
                            rok0Var = new rok0("connection", new NoConnectionError(), (byte) 9);
                        }
                    }
                    str = (String) rok0Var.b;
                    vc31 retryPolicy3 = mn21Var.getRetryPolicy();
                    timeoutMs = mn21Var.getTimeoutMs();
                    volleyError = (VolleyError) rok0Var.c;
                    f3a f3aVar3 = (f3a) retryPolicy3;
                    i2 = f3aVar3.b + 1;
                    f3aVar3.b = i2;
                    int i6 = f3aVar3.a;
                    f3aVar3.a = i6 + ((int) (i6 * 1.0f));
                    if (i2 > 1) {
                        throw volleyError;
                    }
                    mn21Var.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
                }
            } catch (IOException e5) {
                e = e5;
            }
            mn21Var.addMarker(str + "-retry [timeout=" + timeoutMs + "]");
        }
    }

    public void r(o2u0 o2u0Var, oot0 oot0Var) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.h(o2u0Var, oot0Var);
        }
        this.c = o2u0Var;
    }

    public void s(r4t r4tVar) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.j(r4tVar);
        }
    }

    public void t() {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.l();
        }
    }

    public void u(long j, boolean z) {
        p3u0 p3u0Var;
        uoa uoaVar = (uoa) this.b;
        if (uoaVar == null || (p3u0Var = uoaVar.f) == null) {
            return;
        }
        p3u0Var.J0(j, z);
    }

    public void v(long j, fpa fpaVar) {
        uoa uoaVar = (uoa) this.b;
        if ((uoaVar == null || uoaVar.q == null) && uoaVar != null) {
            y2g1 y2g1Var = new y2g1(fpaVar.a);
            y2g1Var.a = j;
            uoaVar.s(y2g1Var);
        }
    }

    public void w(tvj1 tvj1Var) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            fap1.d(tvj1Var, uoaVar);
        }
    }

    public void x(float f) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.m = f;
            p3u0 p3u0Var = uoaVar.f;
            if (p3u0Var != null) {
                p3u0Var.P0(f);
            }
        }
    }

    public void y(hpc1 hpc1Var) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.n = hpc1Var;
            p3u0 p3u0Var = uoaVar.f;
            if (p3u0Var != null) {
                p3u0Var.R0(hpc1Var);
            }
        }
    }

    public void z(boolean z) {
        uoa uoaVar = (uoa) this.b;
        if (uoaVar != null) {
            uoaVar.t(z);
        }
    }

    public /* synthetic */ it8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public it8(byte b) {
        this.a = b;
        switch (b) {
            case 18:
                this.c = new LinkedHashMap();
                break;
        }
    }

    public it8(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 12;
        this.b = i8h1Var;
        this.c = new fjl0(r6h1Var, (byte) 3);
    }

    public it8(zh8 zh8Var, ai8 ai8Var) {
        this.a = (byte) 2;
        this.b = ai8Var;
        this.c = new rku();
    }

    public it8(w6h1 w6h1Var, jly0 jly0Var) {
        this.a = (byte) 8;
        this.b = w6h1Var;
        this.c = new idd1(new vv8(jly0Var, (byte) 7));
    }

    public it8(CameraDevice cameraDevice, g3d g3dVar) {
        this.a = (byte) 27;
        cameraDevice.getClass();
        this.b = cameraDevice;
        this.c = g3dVar;
    }

    public it8(w4d w4dVar) {
        this.a = (byte) 28;
        this.b = w4dVar;
        kdn0 kdn0Var = new kdn0();
        this.c = kdn0Var;
        kdn0Var.j(new jy8(5, null));
    }

    public it8(mta mtaVar) {
        this.a = (byte) 10;
        mgc mgcVar = new mgc((byte) 0);
        this.b = mtaVar;
        this.c = mgcVar;
    }

    public it8(Scheduler scheduler, v5u0 v5u0Var, Observable observable, g510 g510Var) {
        this.a = (byte) 17;
        this.b = v5u0Var;
        this.c = g510Var;
    }

    public it8(int i) {
        this.a = (byte) 22;
        byte[] bArr = new byte[i];
        this.c = bArr;
        java.util.logging.Logger logger = rwg.b;
        this.b = new nwg(bArr, i);
    }

    public it8(p1d p1dVar) {
        this.a = (byte) 26;
        this.c = p1dVar;
        this.b = null;
    }
}
