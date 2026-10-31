package p;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class d1d implements c3d {
    public final b1d b;
    public final g661 c;
    public final Object d = new Object();
    public final w2d e;
    public final kba f;
    public final va61 g;
    public final xy20 h;
    public final o4n1 i;
    public final uqs j;
    public final lls0 k;
    public final q450 l;
    public final w0d m;
    public final mta n;
    public final xq81 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31p;
    public volatile boolean q;
    public volatile int r;
    public final fl1 s;
    public final ju8 t;
    public final AtomicLong u;
    public int v;
    public long w;
    public final a1d x;

    public d1d(w2d w2dVar, js50 js50Var, g661 g661Var, kba kbaVar, g4r g4rVar) {
        va61 va61Var = new va61();
        this.g = va61Var;
        this.f31p = 0;
        this.q = false;
        this.r = 2;
        this.u = new AtomicLong(0L);
        this.v = 1;
        this.w = 0L;
        a1d a1dVar = new a1d();
        a1dVar.b = new HashSet();
        a1dVar.c = new ArrayMap();
        this.x = a1dVar;
        this.e = w2dVar;
        this.f = kbaVar;
        this.c = g661Var;
        this.o = new xq81(g661Var);
        b1d b1dVar = new b1d(g661Var);
        this.b = b1dVar;
        va61Var.b.b = this.v;
        va61Var.b.b(new qnd(b1dVar));
        va61Var.b.b(a1dVar);
        this.k = new lls0(this, g661Var);
        this.h = new xy20(this, g661Var);
        this.i = new o4n1(this, w2dVar, g661Var);
        this.j = new uqs(this, w2dVar, g661Var);
        this.l = new q450(w2dVar);
        this.s = new fl1(g4rVar);
        this.t = new ju8(g4rVar, (byte) 0);
        this.m = new w0d(this, g661Var);
        this.n = new mta(this, w2dVar, g4rVar, g661Var, js50Var);
    }

    public static int k(w2d w2dVar, int i) {
        int[] iArr = (int[]) w2dVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (l(i, iArr)) {
            return i;
        }
        return l(1, iArr) ? 1 : 0;
    }

    public static boolean l(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // p.c3d
    public final Rect a() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // p.c3d
    public final void b(int i) {
        int i2;
        synchronized (this.d) {
            i2 = this.f31p;
        }
        if (!(i2 > 0)) {
            j2h1.M("Camera2CameraControlImp");
            return;
        }
        this.r = i;
        j2h1.o("Camera2CameraControlImp");
        q450 q450Var = this.l;
        if (this.r != 1) {
            int i3 = this.r;
        }
        q450Var.getClass();
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            this.c.execute(new ny2((Object) this, (Object) mzcVar, (byte) 19));
            mzcVar.a = "updateSessionConfigAsync";
        } catch (Exception e) {
            pzcVar.a(e);
        }
        poz0.F(pzcVar);
    }

    @Override // p.c3d
    public final qsk c() {
        z1d z1dVar;
        w0d w0dVar = this.m;
        synchronized (w0dVar.e) {
            z1dVar = new z1d(eqq0.b((xdn0) ((fp8) w0dVar.f).b), (byte) 9);
        }
        return z1dVar;
    }

    @Override // p.c3d
    public final void d(qsk qskVar) {
        w0d w0dVar = this.m;
        uq8 uq8VarD = l2a.l(qskVar).d();
        synchronized (w0dVar.e) {
            fp8 fp8Var = (fp8) w0dVar.f;
            osk oskVar = osk.c;
            for (sy8 sy8Var : uq8VarD.c()) {
                ((xdn0) fp8Var.b).s(sy8Var, oskVar, uq8VarD.e(sy8Var));
            }
        }
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            ((g661) w0dVar.d).execute(new v0d(w0dVar, mzcVar, (byte) 1));
            mzcVar.a = "addCaptureRequestOptions";
        } catch (Exception e) {
            pzcVar.a(e);
        }
        poz0.F(pzcVar).b(new k((byte) 8), n5u.a());
    }

    @Override // p.c3d
    public final void e(va61 va61Var) throws Exception {
        boolean zIsEmpty;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        q450 q450Var = this.l;
        zxl1 zxl1Var = (zxl1) q450Var.e;
        while (true) {
            synchronized (zxl1Var.c) {
                zIsEmpty = ((ArrayDeque) zxl1Var.b).isEmpty();
            }
            if (zIsEmpty) {
                break;
            } else {
                ((zx70) zxl1Var.h()).close();
            }
        }
        g280 g280Var = (g280) q450Var.h;
        final byte b = 2;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (g280Var != null) {
            final vnd vndVar = (vnd) q450Var.f;
            if (vndVar != null) {
                poz0.F(g280Var.e).b(new Runnable() { // from class: p.znd
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        vnd vndVar2 = vndVar;
                        switch (b2) {
                            case 0:
                                vndVar2.k();
                                break;
                            case 1:
                                if (vndVar2 != null) {
                                    vndVar2.k();
                                }
                                break;
                            default:
                                vndVar2.k();
                                break;
                        }
                    }
                }, x2g0.A());
                q450Var.f = null;
            }
            g280Var.a();
            q450Var.h = null;
        }
        ImageWriter imageWriter = (ImageWriter) q450Var.i;
        if (imageWriter != null) {
            imageWriter.close();
            q450Var.i = null;
        }
        if (q450Var.a) {
            va61Var.b.b = 1;
            return;
        }
        if (q450Var.c) {
            va61Var.b.b = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) ((w2d) q450Var.d).a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            e.getMessage();
            j2h1.p("ZslControlImpl");
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new oxh((byte) 0, true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (q450Var.b && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) ((w2d) q450Var.d).a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    ekj0 ekj0Var = new ekj0(size.getWidth(), size.getHeight(), 34, 9);
                    q450Var.g = ekj0Var.b;
                    q450Var.f = new vnd(ekj0Var);
                    ekj0Var.g(new hhm1(q450Var, (byte) 2), ve90.a());
                    g280 g280Var2 = new g280(((vnd) q450Var.f).getSurface(), new Size(((vnd) q450Var.f).getWidth(), ((vnd) q450Var.f).getHeight()), 34);
                    q450Var.h = g280Var2;
                    final vnd vndVar2 = (vnd) q450Var.f;
                    n8d0 n8d0VarF = poz0.F(g280Var2.e);
                    Objects.requireNonNull(vndVar2);
                    n8d0VarF.b(new Runnable() { // from class: p.znd
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            vnd vndVar3 = vndVar2;
                            switch (b2) {
                                case 0:
                                    vndVar3.k();
                                    break;
                                case 1:
                                    if (vndVar3 != null) {
                                        vndVar3.k();
                                    }
                                    break;
                                default:
                                    vndVar3.k();
                                    break;
                            }
                        }
                    }, x2g0.A());
                    va61Var.b((g280) q450Var.h, liv.d, -1);
                    dkj0 dkj0Var = (dkj0) q450Var.g;
                    va61Var.b.b(dkj0Var);
                    ArrayList arrayList = va61Var.e;
                    if (!arrayList.contains(dkj0Var)) {
                        arrayList.add(dkj0Var);
                    }
                    t2d t2dVar = new t2d(q450Var, b);
                    ArrayList arrayList2 = va61Var.d;
                    if (!arrayList2.contains(t2dVar)) {
                        arrayList2.add(t2dVar);
                    }
                    va61Var.g = new InputConfiguration(((vnd) q450Var.f).getWidth(), ((vnd) q450Var.f).getHeight(), ((vnd) q450Var.f).d());
                    return;
                }
            }
        }
        va61Var.b.b = 1;
    }

    @Override // p.c3d
    public final void g() {
        w0d w0dVar = this.m;
        synchronized (w0dVar.e) {
            w0dVar.f = new fp8((byte) 11);
        }
        mzc mzcVar = new mzc();
        mzcVar.c = new it21();
        pzc pzcVar = new pzc(mzcVar);
        mzcVar.b = pzcVar;
        mzcVar.a = x0d.class;
        try {
            ((g661) w0dVar.d).execute(new v0d(w0dVar, mzcVar, (byte) 0));
            mzcVar.a = "clearCaptureRequestOptions";
        } catch (Exception e) {
            pzcVar.a(e);
        }
        poz0.F(pzcVar).b(new k((byte) 8), n5u.a());
    }

    public final void h(c1d c1dVar) {
        ((HashSet) this.b.b).add(c1dVar);
    }

    public final void i() {
        synchronized (this.d) {
            try {
                int i = this.f31p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f31p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x011f A[Catch: all -> 0x0165, LOOP:0: B:63:0x0119->B:65:0x011f, LOOP_END, TryCatch #0 {, blocks: (B:62:0x0107, B:63:0x0119, B:65:0x011f, B:66:0x0131), top: B:75:0x0107 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    public final bb61 j() {
        int[] iArr;
        lls0 lls0Var;
        w0d w0dVar;
        xdn0 xdn0Var;
        osk oskVar;
        va61 va61Var = this.g;
        va61Var.b.b = this.v;
        fp8 fp8Var = new fp8((byte) 11);
        int i = 1;
        fp8Var.n(CaptureRequest.CONTROL_MODE, 1);
        xy20 xy20Var = this.h;
        xy20Var.getClass();
        int i2 = 4;
        int i3 = 3;
        int i4 = xy20Var.c != 3 ? 4 : 3;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        int[] iArr2 = (int[]) xy20Var.a.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr2 == null) {
            i2 = 0;
        } else if (l(i4, iArr2)) {
            i2 = i4;
        } else if (!l(4, iArr2)) {
            if (l(1, iArr2)) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        fp8Var.n(key, Integer.valueOf(i2));
        MeteringRectangle[] meteringRectangleArr = xy20Var.d;
        if (meteringRectangleArr.length != 0) {
            fp8Var.n(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = xy20Var.e;
        if (meteringRectangleArr2.length != 0) {
            fp8Var.n(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = xy20Var.f;
        if (meteringRectangleArr3.length != 0) {
            fp8Var.n(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
        Range range = (Range) this.s.b;
        if (range != null) {
            fp8Var.n(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
        }
        this.i.d.d(fp8Var);
        int i5 = this.h.g ? 5 : 1;
        if (!this.q) {
            int i6 = this.r;
            if (i6 == 0) {
                ju8 ju8Var = this.t;
                if (ju8Var.a || ju8Var.b) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
            } else if (i6 != 1) {
                if (i6 == 2) {
                    i3 = 1;
                }
            }
            fp8Var.n(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(k(this.e, i3)));
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!l(1, iArr) && !l(1, iArr))) {
                i = 0;
            }
            fp8Var.n(key2, Integer.valueOf(i));
            lls0Var = this.k;
            lls0Var.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (((h0y) lls0Var.c).b) {
            }
            fp8Var.n(key3, 0);
            w0dVar = this.m;
            synchronized (w0dVar.e) {
                xdn0Var = (xdn0) ((fp8) w0dVar.f).b;
                oskVar = osk.a;
                for (sy8 sy8Var : xdn0Var.c()) {
                    ((xdn0) fp8Var.b).s(sy8Var, oskVar, xdn0Var.e(sy8Var));
                }
            }
            va61Var.b.d = xdn0.n(new z1d(eqq0.b((xdn0) fp8Var.b), (byte) 9));
            ((yen0) this.g.b.f).a.put("CameraControlSessionUpdateId", Long.valueOf(this.w));
            return this.g.c();
        }
        fp8Var.n(CaptureRequest.FLASH_MODE, 2);
        i3 = i5;
        fp8Var.n(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(k(this.e, i3)));
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i = 0;
        } else {
            i = 0;
        }
        fp8Var.n(key4, Integer.valueOf(i));
        lls0Var = this.k;
        lls0Var.getClass();
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (((h0y) lls0Var.c).b) {
            fp8Var.n(key5, 0);
            w0dVar = this.m;
            synchronized (w0dVar.e) {
                xdn0Var = (xdn0) ((fp8) w0dVar.f).b;
                oskVar = osk.a;
                while (r5.hasNext()) {
                    ((xdn0) fp8Var.b).s(sy8Var, oskVar, xdn0Var.e(sy8Var));
                }
                va61Var.b.d = xdn0.n(new z1d(eqq0.b((xdn0) fp8Var.b), (byte) 9));
                ((yen0) this.g.b.f).a.put("CameraControlSessionUpdateId", Long.valueOf(this.w));
                return this.g.c();
            }
        }
    }

    public final void m(boolean z) {
        c19 c19Var;
        j2h1.o("Camera2CameraControlImp");
        xy20 xy20Var = this.h;
        byte b = 1;
        if (z != xy20Var.b) {
            xy20Var.b = z;
            if (!xy20Var.b) {
                d1d d1dVar = xy20Var.a;
                ((HashSet) d1dVar.b.b).remove(null);
                ((HashSet) d1dVar.b.b).remove(null);
                if (xy20Var.d.length > 0 && xy20Var.b) {
                    vnd vndVar = new vnd();
                    vndVar.a = true;
                    vndVar.b = xy20Var.c;
                    xdn0 xdn0VarD = xdn0.d();
                    xdn0VarD.r(z1d.J(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    vndVar.i(new z1d(eqq0.b(xdn0VarD), (byte) 9));
                    xy20Var.a.n(Collections.singletonList(vndVar.j()));
                }
                MeteringRectangle[] meteringRectangleArr = xy20.h;
                xy20Var.d = meteringRectangleArr;
                xy20Var.e = meteringRectangleArr;
                xy20Var.f = meteringRectangleArr;
                d1dVar.o();
            }
        }
        o4n1 o4n1Var = this.i;
        if (o4n1Var.e != z) {
            o4n1Var.e = z;
            if (!z) {
                synchronized (o4n1Var.b) {
                    o4n1Var.b.e();
                    q4n1 q4n1Var = o4n1Var.b;
                    c19Var = new c19(q4n1Var.d(), q4n1Var.b(), q4n1Var.c(), q4n1Var.a());
                }
                Looper looperMyLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                kdn0 kdn0Var = o4n1Var.c;
                if (looperMyLooper == mainLooper) {
                    kdn0Var.m(c19Var);
                } else {
                    kdn0Var.j(c19Var);
                }
                o4n1Var.d.c();
                o4n1Var.a.o();
            }
        }
        uqs uqsVar = this.j;
        if (uqsVar.a != z) {
            uqsVar.a = z;
            if (!z) {
                if (uqsVar.b) {
                    uqsVar.b = false;
                    d1d d1dVar2 = (d1d) uqsVar.c;
                    d1dVar2.q = false;
                    vnd vndVar2 = new vnd();
                    vndVar2.b = d1dVar2.v;
                    vndVar2.a = true;
                    xdn0 xdn0VarD2 = xdn0.d();
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                    xdn0VarD2.r(z1d.J(key), Integer.valueOf(k(d1dVar2.e, 1)));
                    xdn0VarD2.r(z1d.J(CaptureRequest.FLASH_MODE), 0);
                    vndVar2.i(new z1d(eqq0.b(xdn0VarD2), (byte) 9));
                    d1dVar2.n(Collections.singletonList(vndVar2.j()));
                    d1dVar2.o();
                    kdn0 kdn0Var2 = (kdn0) uqsVar.d;
                    if (w8p1.w()) {
                        kdn0Var2.m(0);
                    } else {
                        kdn0Var2.j(0);
                    }
                }
                mzc mzcVar = (mzc) uqsVar.e;
                if (mzcVar != null) {
                    mzcVar.c(new CameraControl$OperationCanceledException("Camera is not active."));
                    uqsVar.e = null;
                }
            }
        }
        lls0 lls0Var = this.k;
        if (z != lls0Var.b) {
            lls0Var.b = z;
            if (!z) {
                synchronized (((h0y) lls0Var.c).b) {
                }
            }
        }
        w0d w0dVar = this.m;
        ((g661) w0dVar.d).execute(new s38(w0dVar, z, b));
        if (z) {
            return;
        }
        ((AtomicInteger) this.o.b).set(0);
        j2h1.o("VideoUsageControl");
    }

    public final void n(List list) {
        int iB;
        int iA;
        j2d j2dVar;
        p1d p1dVar = (p1d) this.f.b;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wnd wndVar = (wnd) it.next();
            HashSet hashSet = new HashSet();
            xdn0.d();
            ArrayList arrayList2 = new ArrayList();
            yen0.a();
            hashSet.addAll(wndVar.a);
            xdn0 xdn0VarN = xdn0.n(wndVar.b);
            int i = wndVar.c;
            arrayList2.addAll(wndVar.d);
            boolean z = wndVar.e;
            tod1 tod1Var = wndVar.f;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = tod1Var.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            yen0 yen0Var = new yen0(arrayMap);
            j2d j2dVar2 = (wndVar.c != 5 || (j2dVar = wndVar.g) == null) ? null : j2dVar;
            if (Collections.unmodifiableList(wndVar.a).isEmpty() && wndVar.e) {
                if (hashSet.isEmpty()) {
                    owf1 owf1Var = p1dVar.a;
                    owf1Var.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) owf1Var.b).entrySet()) {
                        g4i1 g4i1Var = (g4i1) entry.getValue();
                        if (g4i1Var.f && g4i1Var.e) {
                            arrayList3.add(((g4i1) entry.getValue()).a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        wnd wndVar2 = ((bb61) it2.next()).g;
                        List listUnmodifiableList = Collections.unmodifiableList(wndVar2.a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (wndVar2.a() != 0 && (iA = wndVar2.a()) != 0) {
                                xdn0VarN.r(i4i1.J0, Integer.valueOf(iA));
                            }
                            if (wndVar2.b() != 0 && (iB = wndVar2.b()) != 0) {
                                xdn0VarN.r(i4i1.K0, Integer.valueOf(iB));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((j2t) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        j2h1.M("Camera2CameraImpl");
                    }
                } else {
                    j2h1.M("Camera2CameraImpl");
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            eqq0 eqq0VarB = eqq0.b(xdn0VarN);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            tod1 tod1Var2 = tod1.b;
            ArrayMap arrayMap3 = new ArrayMap();
            ArrayMap arrayMap4 = yen0Var.a;
            for (String str2 : arrayMap4.keySet()) {
                arrayMap3.put(str2, arrayMap4.get(str2));
            }
            arrayList.add(new wnd(arrayList4, eqq0VarB, i, arrayList5, z, new tod1(arrayMap3), j2dVar2));
        }
        p1dVar.t("Issue capture request");
        p1dVar.Y.i(arrayList);
    }

    public final long o() {
        this.w = this.u.getAndIncrement();
        ((p1d) this.f.b).K();
        return this.w;
    }

    @Override // p.c3d
    public final void f(nr70 nr70Var) {
    }
}
