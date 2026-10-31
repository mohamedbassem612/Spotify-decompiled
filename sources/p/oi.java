package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oi implements Function, ry70, xjh0, b8b0, Predicate, k2i1, f420 {
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;

    public oi(w2d w2dVar) {
        this.a = (byte) 15;
        this.c = w2dVar;
        this.d = oiv.d(w2dVar);
        int[] iArr = (int[]) w2dVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z = false;
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 18) {
                    z = true;
                    break;
                }
            }
        }
        this.b = z;
    }

    public static liv B(liv livVar, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (livVar.a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            liv livVar2 = (liv) it.next();
            o0c.p(livVar2, "Fully specified DynamicRange cannot be null.");
            int i = livVar2.a;
            o0c.q("Fully specified DynamicRange must have fully defined encoding.", livVar2.b());
            if (i != 1 && v(livVar, livVar2, hashSet)) {
                return livVar2;
            }
        }
        return null;
    }

    public static void K(HashSet hashSet, liv livVar, oiv oivVar) {
        o0c.q("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set setB = ((niv) oivVar.a).b(livVar);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet2 = new HashSet(hashSet);
        hashSet.retainAll(setB);
        if (hashSet.isEmpty()) {
            k220.o("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", livVar, "\nConstraints:\n  ", TextUtils.join("\n  ", setB), "\nExisting constraints:\n  ", TextUtils.join("\n  ", hashSet2));
        }
    }

    public static boolean u(liv livVar, liv livVar2) {
        boolean zB = livVar2.b();
        int i = livVar2.a;
        o0c.q("Fully specified range is not actually fully specified.", zB);
        int i2 = livVar.a;
        if (i2 == 2 && i == 1) {
            return false;
        }
        if (i2 != 2 && i2 != 0 && i2 != i) {
            return false;
        }
        int i3 = livVar.b;
        return i3 == 0 || i3 == livVar2.b;
    }

    public static boolean v(liv livVar, liv livVar2, HashSet hashSet) {
        if (hashSet.contains(livVar2)) {
            return u(livVar, livVar2);
        }
        livVar.toString();
        livVar2.toString();
        j2h1.o("DynamicRangeResolver");
        return false;
    }

    public mr20 A(k8g1 k8g1Var) {
        return this.b ? new ipr(z4p1.J(o4p1.r(((b5s0) this.c).b(k8g1Var.a, false), (q8n) this.d), new uls(this, (lnm) null, (byte) 3)), this, k8g1Var, (byte) 5) : new huz(vnt.a, (byte) 10);
    }

    public q5f0 C() {
        return (q5f0) this.c;
    }

    public String D() {
        return (String) this.c;
    }

    public MotionEvent E() {
        return (MotionEvent) ((yqu0) this.d).b;
    }

    public boolean F() {
        return this.b;
    }

    public ArrayList G() {
        return (ArrayList) this.d;
    }

    public void H() {
        if (((fsw0) this.c) == fsw0.a && this.b) {
            cxd1 cxd1Var = (cxd1) ((kly0) this.d).get();
            fn31.T(cxd1Var.e, null, 0, new xba1(cxd1Var, (lnm) null, (byte) 22), 3);
        }
    }

    public Single I() {
        lhc lhcVar = (lhc) this.d;
        boolean z = this.b;
        gmd gmdVar = (gmd) this.c;
        if (z) {
            Single map = gmdVar.a().map(new x5j1(lhcVar, (byte) 25));
            map.getClass();
            return map;
        }
        Single map2 = gmdVar.b().map(new lan1(lhcVar, (byte) 27));
        map2.getClass();
        return map2;
    }

    public void J(View view) {
        ViewGroup viewGroup = (ViewGroup) this.c;
        View view2 = (View) this.d;
        if (view2 == view) {
            return;
        }
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        this.d = view;
        if (view == null) {
            viewGroup.setVisibility(8);
            return;
        }
        view.setDuplicateParentStateEnabled(this.b);
        viewGroup.addView(view);
        viewGroup.setVisibility(0);
        View view3 = (View) viewGroup.getParent();
        view3.post(new ni(this, view3, (byte) 0));
    }

    public l420 a(File file) {
        return new l420(this, file, (hfb) this.c, this.b, (v520) this.d);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                en1 en1Var = (en1) this.c;
                oj3 oj3Var = (oj3) en1Var.d;
                List listSingletonList = Collections.singletonList(((zuc0) this.d).c);
                String str = (String) en1Var.b;
                return oj3Var.c(listSingletonList, str, str, this.b, new gj3(27, (tv80) obj));
            case 20:
                g510 g510Var = (g510) this.c;
                m210 m210Var = (m210) this.d;
                boolean z = this.b;
                return Single.fromCallable(new e510(z, g510Var, (String) obj)).flatMap(new t64(z, m210Var, g510Var));
            default:
                r9c r9cVarA = (r9c) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean z2 = this.b;
                Bundle bundle = (Bundle) this.d;
                if (tyo1.l(bundle)) {
                    r9cVarA = r9c.a(r9cVarA, tyo1.k(bundle), (String) null, false, false, (String) null, false, 262142);
                }
                return r9c.a(r9cVarA, (String) null, (String) null, zBooleanValue, z2, (String) null, false, 261759);
        }
    }

    public void b(Uri uri) {
        lan1 lan1Var = (lan1) this.c;
        try {
            if (this.b && ras0.a(uri) && !u890.j(o7h.s0(uri.getPathSegments()), "app-switch-checkout")) {
                lan1Var.c(uri);
            } else {
                ((Activity) lan1Var.b).startActivity(new Intent("android.intent.action.VIEW", uri));
            }
            ((fyf) this.d).g();
        } catch (ActivityNotFoundException e) {
            Logger.e(e, "Couldn't launch external browser to handle URI %s", new Object[]{uri});
        }
    }

    public zx70 c() {
        Image imageAcquireLatestImage;
        synchronized (this.d) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.c).acquireLatestImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new al4(imageAcquireLatestImage);
        }
    }

    public void close() {
        synchronized (this.d) {
            ((ImageReader) this.c).close();
        }
    }

    public int d() {
        int imageFormat;
        synchronized (this.d) {
            imageFormat = ((ImageReader) this.c).getImageFormat();
        }
        return imageFormat;
    }

    public void e() {
        synchronized (this.d) {
            this.b = true;
            ((ImageReader) this.c).setOnImageAvailableListener(null, null);
        }
    }

    public boolean f(h0h1 h0h1Var, h0h1 h0h1Var2) {
        boolean z = this.b;
        hyc hycVar = (hyc) this.c;
        hyc hycVar2 = (hyc) this.d;
        if (h0h1Var.equals(h0h1Var2)) {
            return true;
        }
        y0h1 y0h1VarS = h0h1Var.s();
        y0h1 y0h1VarS2 = h0h1Var2.s();
        if ((y0h1VarS instanceof y0h1) && (y0h1VarS2 instanceof y0h1)) {
            return rzs0.Z0.b(y0h1VarS, y0h1VarS2, z, new ek1(hycVar, hycVar2, (byte) 7));
        }
        return false;
    }

    public void g(final qy70 qy70Var, final Executor executor) {
        synchronized (this.d) {
            this.b = false;
            ((ImageReader) this.c).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: p.bl4
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    oi oiVar = this.a;
                    Executor executor2 = executor;
                    qy70 qy70Var2 = qy70Var;
                    synchronized (oiVar.d) {
                        try {
                            if (!oiVar.b) {
                                executor2.execute(new ny2((Object) oiVar, (Object) qy70Var2, (byte) 4));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, w2g0.m());
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.d) {
            height = ((ImageReader) this.c).getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.d) {
            surface = ((ImageReader) this.c).getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.d) {
            width = ((ImageReader) this.c).getWidth();
        }
        return width;
    }

    public int h() {
        int maxImages;
        synchronized (this.d) {
            maxImages = ((ImageReader) this.c).getMaxImages();
        }
        return maxImages;
    }

    public m420 j(l420 l420Var) {
        File file = l420Var.b;
        return new m420(new FileInputStream(file), (hfb) this.c, file.getAbsolutePath(), this.b, (v520) this.d);
    }

    public l420 k(String str) {
        return new l420(this, new File(str), (hfb) this.c, this.b, (v520) this.d);
    }

    public r420 l(l420 l420Var) {
        File file = l420Var.b;
        return new r420(new FileOutputStream(file, false), (hfb) this.c, file.getAbsolutePath(), this.b, (v520) this.d);
    }

    public zx70 m() {
        Image imageAcquireNextImage;
        synchronized (this.d) {
            try {
                imageAcquireNextImage = ((ImageReader) this.c).acquireNextImage();
            } catch (RuntimeException e) {
                if (!"ImageReaderContext is not initialized".equals(e.getMessage())) {
                    throw e;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new al4(imageAcquireNextImage);
        }
    }

    public l420 n(File file, String str) {
        return new l420(this, new File(file, str), (hfb) this.c, this.b, (v520) this.d);
    }

    public l420 o(String str, String str2) {
        return new l420(this, new File(str, str2), (hfb) this.c, this.b, (v520) this.d);
    }

    public l420 p(l420 l420Var, String str) {
        return new l420(this, new File(f4i1.f(l420Var.b.getPath(), File.separator, str)), (hfb) this.c, this.b, (v520) this.d);
    }

    public z420 q(String str) {
        return new z420(new FileReader(str), new File(str).getAbsolutePath(), (hfb) this.c, this.b, (v520) this.d);
    }

    public z420 r(l420 l420Var) {
        File file = l420Var.b;
        return new z420(new FileReader(file), file.getAbsolutePath(), (hfb) this.c, this.b, (v520) this.d);
    }

    public w520 s(l420 l420Var) {
        File file = l420Var.b;
        return new w520(new FileWriter(file, false), file.getAbsolutePath(), (hfb) this.c, this.b, (v520) this.d);
    }

    public boolean t(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((yqu0) this.d).c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (w8p1.n(((jav0) obj).a, j)) {
                break;
            }
            i++;
        }
        jav0 jav0Var = (jav0) obj;
        if (jav0Var != null) {
            return jav0Var.h;
        }
        return false;
    }

    public boolean test(Object obj) {
        boolean z;
        Map map = (Map) obj;
        List list = ((wsc0) this.c).e;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                zuc0 zuc0Var = (zuc0) it.next();
                if (!f7p1.m(zuc0Var.c) && !map.containsKey(new iey0(zuc0Var.c))) {
                    z = false;
                    break;
                }
            }
        } else {
            z = true;
            break;
        }
        return z && (!this.b || map.containsKey(new iey0((String) this.d)));
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return "JavaTypeEnhancementState(jsr305=" + ((rha0) this.c) + ", getReportLevelForAnnotation=" + ((p5) this.d) + ')';
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public mj7 i(g2z g2zVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        up41 pj7Var;
        int i;
        String str = ((bkh0) g2zVar.a).a;
        mj7 mj7Var = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                if (!this.b || Build.VERSION.SDK_INT < 36) {
                    pj7Var = new pj7(mediaCodecCreateByCodecName, (HandlerThread) ((lj7) this.d).get());
                    i = 0;
                } else {
                    pj7Var = new up41(mediaCodecCreateByCodecName, (byte) 25);
                    i = 4;
                }
                mj7 mj7Var2 = new mj7(mediaCodecCreateByCodecName, (HandlerThread) ((lj7) this.c).get(), pj7Var, (vdf0) g2zVar.f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) g2zVar.d;
                    if (surface == null && ((bkh0) g2zVar.a).h && Build.VERSION.SDK_INT >= 35) {
                        i |= 8;
                    }
                    mj7Var2.r((MediaFormat) g2zVar.b, surface, (MediaCrypto) g2zVar.e, i);
                    return mj7Var2;
                } catch (Exception e) {
                    e = e;
                    mj7Var = mj7Var2;
                    if (mj7Var != null) {
                        mj7Var.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            mediaCodecCreateByCodecName = null;
        }
    }

    public l420 x(String str, String str2, l420 l420Var) {
        return new l420(this, File.createTempFile(str, str2, l420Var), (hfb) this.c, this.b, (v520) this.d);
    }

    public v1k y() {
        if (this.b) {
            return (v1k) this.c;
        }
        oi oiVarL = ((v3k) this.d).l();
        v1k v1kVar = oiVarL != null ? (v1k) oiVarL.c : null;
        if (!u890.j(v1kVar, (v1k) this.c)) {
            this.c = v1kVar;
        }
        return v1kVar;
    }

    public String z(ttm1 ttm1Var, mum1 mum1Var, boolean z, boolean z2) {
        return z ? ((Activity) this.c).getString(2131964127) : ((cey) this.d).a(ttm1Var, new pey(this.b, mum1Var.c, mum1Var.a, z2, mum1Var.b));
    }

    public /* synthetic */ oi(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public oi(c610 c610Var, r9c r9cVar, boolean z, Bundle bundle) {
        this.a = (byte) 21;
        this.c = r9cVar;
        this.b = z;
        this.d = bundle;
    }

    public oi(wsc0 wsc0Var, boolean z, String str) {
        this.a = (byte) 16;
        this.c = wsc0Var;
        this.b = z;
        this.d = str;
    }

    public /* synthetic */ oi(boolean z, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oi(String str, iu30 iu30Var) {
        this(str, false, iu30Var);
        this.a = (byte) 18;
    }

    public oi(String str, boolean z, iu30 iu30Var) {
        this.a = (byte) 18;
        this.c = str;
        this.b = z;
        qv00 qv00Var = new qv00();
        iu30Var.invoke(qv00Var);
        this.d = qv00Var.a;
    }

    public oi(rha0 rha0Var, p5 p5Var) {
        this.a = (byte) 26;
        this.c = rha0Var;
        this.d = p5Var;
        this.b = rha0Var.d || p5Var.invoke(d8a0.a) == kl21.a;
    }

    public oi(hfb hfbVar, boolean z, Context context, ajg ajgVar) {
        this.a = (byte) 22;
        this.c = hfbVar;
        this.b = z;
        this.d = new v520(context, ajgVar);
    }

    public oi(q5f0 q5f0Var, yqu0 yqu0Var) {
        this.a = (byte) 25;
        this.c = q5f0Var;
        this.d = yqu0Var;
    }

    public oi(wr00 wr00Var, zr00 zr00Var, iac0 iac0Var) {
        this.a = (byte) 17;
        this.c = wr00Var;
        iac0Var.getLifecycle().a(new xm8(this, zr00Var));
    }

    public oi(ViewGroup viewGroup) {
        this.a = (byte) 0;
        this.c = viewGroup;
    }

    public oi(cdo0 cdo0Var, d9z0 d9z0Var) {
        this.a = (byte) 28;
        this.b = false;
        this.c = cdo0Var;
        this.d = d9z0Var;
    }

    public oi(fsw0 fsw0Var, boolean z, kly0 kly0Var, kly0 kly0Var2, caq caqVar, p2p p2pVar, kly0 kly0Var3, p2p p2pVar2, caq caqVar2, q8n q8nVar) {
        this.a = (byte) 24;
        this.c = fsw0Var;
        this.b = z;
        this.d = kly0Var2;
    }

    public oi(ImageReader imageReader) {
        this.a = (byte) 3;
        this.d = new Object();
        this.b = true;
        this.c = imageReader;
    }

    public oi(i8h1 i8h1Var, String str, boolean z, w6h1 w6h1Var) {
        this.a = (byte) 6;
        this.c = i8h1Var;
        this.b = z;
        this.d = new wqk0(z ? 1 : 2, str, w6h1Var.b(), (byte) 14);
    }

    public /* synthetic */ oi(byte b) {
        this.a = b;
    }

    public oi(Context context) {
        this.a = (byte) 9;
        this.c = context.getApplicationContext();
        this.d = pkj1.h;
        this.b = true;
    }

    public oi(lj7 lj7Var, lj7 lj7Var2) {
        this.a = (byte) 4;
        this.c = lj7Var;
        this.d = lj7Var2;
        this.b = true;
    }

    public oi(v3k v3kVar) {
        this.a = (byte) 7;
        this.c = null;
        this.b = false;
        this.d = v3kVar;
    }
}
