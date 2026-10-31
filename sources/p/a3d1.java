package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.car.app.model.Alert;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a3d1 {
    public final String i;
    public final s0d j;
    public final w2d k;
    public final fey l;
    public final int m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8p;
    public final boolean q;
    public final boolean r;
    public p29 s;
    public final oju u;
    public final oi x;
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final jxa v = new jxa((byte) 27);
    public final tz01 w = new tz01((byte) 8);

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.camera.core.CameraUnavailableException */
    public a3d1(Context context, String str, d4d d4dVar, s0d s0dVar) throws CameraUnavailableException {
        int i;
        List listSingletonList;
        int[] outputFormats;
        int[] iArr;
        this.n = false;
        this.o = false;
        this.f8p = false;
        this.q = false;
        this.r = false;
        str.getClass();
        this.i = str;
        s0dVar.getClass();
        this.j = s0dVar;
        this.l = new fey((byte) 6);
        this.u = oju.b(context);
        try {
            w2d w2dVarB = d4dVar.b(str);
            this.k = w2dVarB;
            Integer num = (Integer) w2dVarB.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.m = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) w2dVarB.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i2 : iArr2) {
                    if (i2 == 3) {
                        this.n = true;
                    } else if (i2 == 6) {
                        this.o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i2 == 16) {
                        this.r = true;
                    }
                }
            }
            this.x = new oi(this.k);
            ArrayList arrayList = this.a;
            int i3 = this.m;
            boolean z = this.n;
            boolean z2 = this.o;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            g3d1 g3d1Var = new g3d1();
            h3d1 h3d1Var = h3d1.MAXIMUM;
            h4b1.g(1, h3d1Var, 0L, g3d1Var);
            g3d1 g3d1VarF = h4b1.f(arrayList3, g3d1Var);
            h4b1.g(3, h3d1Var, 0L, g3d1VarF);
            g3d1 g3d1VarF2 = h4b1.f(arrayList3, g3d1VarF);
            h4b1.g(2, h3d1Var, 0L, g3d1VarF2);
            g3d1 g3d1VarF3 = h4b1.f(arrayList3, g3d1VarF2);
            h3d1 h3d1Var2 = h3d1.PREVIEW;
            g3d1VarF3.a(new k29(1, h3d1Var2, 0L));
            h4b1.g(3, h3d1Var, 0L, g3d1VarF3);
            g3d1 g3d1VarF4 = h4b1.f(arrayList3, g3d1VarF3);
            g3d1VarF4.a(new k29(2, h3d1Var2, 0L));
            h4b1.g(3, h3d1Var, 0L, g3d1VarF4);
            g3d1 g3d1VarF5 = h4b1.f(arrayList3, g3d1VarF4);
            g3d1VarF5.a(new k29(1, h3d1Var2, 0L));
            h4b1.g(1, h3d1Var2, 0L, g3d1VarF5);
            g3d1 g3d1VarF6 = h4b1.f(arrayList3, g3d1VarF5);
            g3d1VarF6.a(new k29(1, h3d1Var2, 0L));
            h4b1.g(2, h3d1Var2, 0L, g3d1VarF6);
            g3d1 g3d1VarF7 = h4b1.f(arrayList3, g3d1VarF6);
            g3d1VarF7.a(new k29(1, h3d1Var2, 0L));
            g3d1VarF7.a(new k29(2, h3d1Var2, 0L));
            h4b1.g(3, h3d1Var, 0L, g3d1VarF7);
            arrayList3.add(g3d1VarF7);
            arrayList2.addAll(arrayList3);
            h3d1 h3d1Var3 = h3d1.RECORD;
            if (i3 == 0 || i3 == 1 || i3 == 3) {
                ArrayList arrayList4 = new ArrayList();
                g3d1 g3d1Var2 = new g3d1();
                g3d1Var2.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var3, 0L, g3d1Var2);
                g3d1 g3d1VarF8 = h4b1.f(arrayList4, g3d1Var2);
                g3d1VarF8.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var3, 0L, g3d1VarF8);
                g3d1 g3d1VarF9 = h4b1.f(arrayList4, g3d1VarF8);
                g3d1VarF9.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var3, 0L, g3d1VarF9);
                g3d1 g3d1VarF10 = h4b1.f(arrayList4, g3d1VarF9);
                g3d1VarF10.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF10.a(new k29(1, h3d1Var3, 0L));
                h4b1.g(3, h3d1Var3, 0L, g3d1VarF10);
                g3d1 g3d1VarF11 = h4b1.f(arrayList4, g3d1VarF10);
                g3d1VarF11.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF11.a(new k29(2, h3d1Var3, 0L));
                i = 3;
                h4b1.g(3, h3d1Var3, 0L, g3d1VarF11);
                g3d1 g3d1VarF12 = h4b1.f(arrayList4, g3d1VarF11);
                g3d1VarF12.a(new k29(2, h3d1Var2, 0L));
                g3d1VarF12.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF12);
                arrayList4.add(g3d1VarF12);
                arrayList2.addAll(arrayList4);
            } else {
                i = 3;
            }
            h3d1 h3d1Var4 = h3d1.VGA;
            if (i3 == 1 || i3 == i) {
                ArrayList arrayList5 = new ArrayList();
                g3d1 g3d1Var3 = new g3d1();
                g3d1Var3.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var, 0L, g3d1Var3);
                g3d1 g3d1VarF13 = h4b1.f(arrayList5, g3d1Var3);
                g3d1VarF13.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF13);
                g3d1 g3d1VarF14 = h4b1.f(arrayList5, g3d1VarF13);
                g3d1VarF14.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF14);
                g3d1 g3d1VarF15 = h4b1.f(arrayList5, g3d1VarF14);
                g3d1VarF15.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF15.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF15);
                g3d1 g3d1VarF16 = h4b1.f(arrayList5, g3d1VarF15);
                g3d1VarF16.a(new k29(2, h3d1Var4, 0L));
                g3d1VarF16.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF16);
                g3d1 g3d1VarF17 = h4b1.f(arrayList5, g3d1VarF16);
                g3d1VarF17.a(new k29(2, h3d1Var4, 0L));
                g3d1VarF17.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF17);
                arrayList5.add(g3d1VarF17);
                arrayList2.addAll(arrayList5);
            }
            if (z) {
                ArrayList arrayList6 = new ArrayList();
                g3d1 g3d1Var4 = new g3d1();
                h4b1.g(5, h3d1Var, 0L, g3d1Var4);
                g3d1 g3d1VarF18 = h4b1.f(arrayList6, g3d1Var4);
                g3d1VarF18.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF18);
                g3d1 g3d1VarF19 = h4b1.f(arrayList6, g3d1VarF18);
                g3d1VarF19.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF19);
                g3d1 g3d1VarF20 = h4b1.f(arrayList6, g3d1VarF19);
                g3d1VarF20.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF20.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF20);
                g3d1 g3d1VarF21 = h4b1.f(arrayList6, g3d1VarF20);
                g3d1VarF21.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF21.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF21);
                g3d1 g3d1VarF22 = h4b1.f(arrayList6, g3d1VarF21);
                g3d1VarF22.a(new k29(2, h3d1Var2, 0L));
                g3d1VarF22.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF22);
                g3d1 g3d1VarF23 = h4b1.f(arrayList6, g3d1VarF22);
                g3d1VarF23.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF23.a(new k29(3, h3d1Var, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF23);
                g3d1 g3d1VarF24 = h4b1.f(arrayList6, g3d1VarF23);
                g3d1VarF24.a(new k29(2, h3d1Var2, 0L));
                g3d1VarF24.a(new k29(3, h3d1Var, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF24);
                arrayList6.add(g3d1VarF24);
                arrayList2.addAll(arrayList6);
            }
            if (z2 && i3 == 0) {
                ArrayList arrayList7 = new ArrayList();
                g3d1 g3d1Var5 = new g3d1();
                g3d1Var5.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var, 0L, g3d1Var5);
                g3d1 g3d1VarF25 = h4b1.f(arrayList7, g3d1Var5);
                g3d1VarF25.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF25);
                g3d1 g3d1VarF26 = h4b1.f(arrayList7, g3d1VarF25);
                g3d1VarF26.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF26);
                arrayList7.add(g3d1VarF26);
                arrayList2.addAll(arrayList7);
            }
            if (i3 == 3) {
                ArrayList arrayList8 = new ArrayList();
                g3d1 g3d1Var6 = new g3d1();
                g3d1Var6.a(new k29(1, h3d1Var2, 0L));
                g3d1Var6.a(new k29(1, h3d1Var4, 0L));
                g3d1Var6.a(new k29(2, h3d1Var, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1Var6);
                g3d1 g3d1VarF27 = h4b1.f(arrayList8, g3d1Var6);
                g3d1VarF27.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF27.a(new k29(1, h3d1Var4, 0L));
                g3d1VarF27.a(new k29(3, h3d1Var, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF27);
                arrayList8.add(g3d1VarF27);
                arrayList2.addAll(arrayList8);
            }
            arrayList.addAll(arrayList2);
            fey feyVar = this.l;
            String str2 = this.i;
            if (((ExtraSupportedSurfaceCombinationsQuirk) feyVar.b) == null) {
                listSingletonList = new ArrayList();
            } else {
                g3d1 g3d1Var7 = ExtraSupportedSurfaceCombinationsQuirk.a;
                String str3 = Build.DEVICE;
                if ("heroqltevzw".equalsIgnoreCase(str3) || "heroqltetmo".equalsIgnoreCase(str3)) {
                    ArrayList arrayList9 = new ArrayList();
                    listSingletonList = arrayList9;
                    if (str2.equals("1")) {
                        arrayList9.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                        listSingletonList = arrayList9;
                    }
                } else {
                    listSingletonList = ((!"google".equalsIgnoreCase(Build.BRAND) ? false : ExtraSupportedSurfaceCombinationsQuirk.c.contains(Build.MODEL.toUpperCase(Locale.US))) || ExtraSupportedSurfaceCombinationsQuirk.b()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
                }
            }
            arrayList.addAll(listSingletonList);
            if (this.r) {
                ArrayList arrayList10 = this.b;
                ArrayList arrayList11 = new ArrayList();
                g3d1 g3d1Var8 = new g3d1();
                h3d1 h3d1Var5 = h3d1.ULTRA_MAXIMUM;
                g3d1Var8.a(new k29(2, h3d1Var5, 0L));
                g3d1Var8.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var3, 0L, g3d1Var8);
                g3d1 g3d1VarF28 = h4b1.f(arrayList11, g3d1Var8);
                g3d1VarF28.a(new k29(3, h3d1Var5, 0L));
                g3d1VarF28.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var3, 0L, g3d1VarF28);
                g3d1 g3d1VarF29 = h4b1.f(arrayList11, g3d1VarF28);
                g3d1VarF29.a(new k29(5, h3d1Var5, 0L));
                g3d1VarF29.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var3, 0L, g3d1VarF29);
                g3d1 g3d1VarF30 = h4b1.f(arrayList11, g3d1VarF29);
                g3d1VarF30.a(new k29(2, h3d1Var5, 0L));
                g3d1VarF30.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF30);
                g3d1 g3d1VarF31 = h4b1.f(arrayList11, g3d1VarF30);
                g3d1VarF31.a(new k29(3, h3d1Var5, 0L));
                g3d1VarF31.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF31);
                g3d1 g3d1VarF32 = h4b1.f(arrayList11, g3d1VarF31);
                g3d1VarF32.a(new k29(5, h3d1Var5, 0L));
                g3d1VarF32.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF32);
                g3d1 g3d1VarF33 = h4b1.f(arrayList11, g3d1VarF32);
                g3d1VarF33.a(new k29(2, h3d1Var5, 0L));
                g3d1VarF33.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF33);
                g3d1 g3d1VarF34 = h4b1.f(arrayList11, g3d1VarF33);
                g3d1VarF34.a(new k29(3, h3d1Var5, 0L));
                g3d1VarF34.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF34);
                g3d1 g3d1VarF35 = h4b1.f(arrayList11, g3d1VarF34);
                g3d1VarF35.a(new k29(5, h3d1Var5, 0L));
                g3d1VarF35.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF35);
                g3d1 g3d1VarF36 = h4b1.f(arrayList11, g3d1VarF35);
                g3d1VarF36.a(new k29(2, h3d1Var5, 0L));
                g3d1VarF36.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF36);
                g3d1 g3d1VarF37 = h4b1.f(arrayList11, g3d1VarF36);
                g3d1VarF37.a(new k29(3, h3d1Var5, 0L));
                g3d1VarF37.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF37);
                g3d1 g3d1VarF38 = h4b1.f(arrayList11, g3d1VarF37);
                g3d1VarF38.a(new k29(5, h3d1Var5, 0L));
                g3d1VarF38.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(5, h3d1Var, 0L, g3d1VarF38);
                arrayList11.add(g3d1VarF38);
                arrayList10.addAll(arrayList11);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f8p = zHasSystemFeature;
            h3d1 h3d1Var6 = h3d1.s1440p;
            if (zHasSystemFeature) {
                ArrayList arrayList12 = this.c;
                ArrayList arrayList13 = new ArrayList();
                g3d1 g3d1Var9 = new g3d1();
                h4b1.g(2, h3d1Var6, 0L, g3d1Var9);
                g3d1 g3d1VarF39 = h4b1.f(arrayList13, g3d1Var9);
                h4b1.g(1, h3d1Var6, 0L, g3d1VarF39);
                g3d1 g3d1VarF40 = h4b1.f(arrayList13, g3d1VarF39);
                h4b1.g(3, h3d1Var6, 0L, g3d1VarF40);
                g3d1 g3d1VarF41 = h4b1.f(arrayList13, g3d1VarF40);
                h3d1 h3d1Var7 = h3d1.s720p;
                g3d1VarF41.a(new k29(2, h3d1Var7, 0L));
                h4b1.g(3, h3d1Var6, 0L, g3d1VarF41);
                g3d1 g3d1VarF42 = h4b1.f(arrayList13, g3d1VarF41);
                g3d1VarF42.a(new k29(1, h3d1Var7, 0L));
                h4b1.g(3, h3d1Var6, 0L, g3d1VarF42);
                g3d1 g3d1VarF43 = h4b1.f(arrayList13, g3d1VarF42);
                g3d1VarF43.a(new k29(2, h3d1Var7, 0L));
                h4b1.g(2, h3d1Var6, 0L, g3d1VarF43);
                g3d1 g3d1VarF44 = h4b1.f(arrayList13, g3d1VarF43);
                g3d1VarF44.a(new k29(2, h3d1Var7, 0L));
                h4b1.g(1, h3d1Var6, 0L, g3d1VarF44);
                g3d1 g3d1VarF45 = h4b1.f(arrayList13, g3d1VarF44);
                g3d1VarF45.a(new k29(1, h3d1Var7, 0L));
                h4b1.g(2, h3d1Var6, 0L, g3d1VarF45);
                g3d1 g3d1VarF46 = h4b1.f(arrayList13, g3d1VarF45);
                g3d1VarF46.a(new k29(1, h3d1Var7, 0L));
                h4b1.g(1, h3d1Var6, 0L, g3d1VarF46);
                arrayList13.add(g3d1VarF46);
                arrayList12.addAll(arrayList13);
            }
            if (this.x.b) {
                ArrayList arrayList14 = this.f;
                ArrayList arrayList15 = new ArrayList();
                g3d1 g3d1Var10 = new g3d1();
                h4b1.g(1, h3d1Var, 0L, g3d1Var10);
                g3d1 g3d1VarF47 = h4b1.f(arrayList15, g3d1Var10);
                h4b1.g(2, h3d1Var, 0L, g3d1VarF47);
                g3d1 g3d1VarF48 = h4b1.f(arrayList15, g3d1VarF47);
                g3d1VarF48.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(3, h3d1Var, 0L, g3d1VarF48);
                g3d1 g3d1VarF49 = h4b1.f(arrayList15, g3d1VarF48);
                g3d1VarF49.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF49);
                g3d1 g3d1VarF50 = h4b1.f(arrayList15, g3d1VarF49);
                g3d1VarF50.a(new k29(2, h3d1Var2, 0L));
                h4b1.g(2, h3d1Var, 0L, g3d1VarF50);
                g3d1 g3d1VarF51 = h4b1.f(arrayList15, g3d1VarF50);
                g3d1VarF51.a(new k29(1, h3d1Var2, 0L));
                h4b1.g(1, h3d1Var3, 0L, g3d1VarF51);
                g3d1 g3d1VarF52 = h4b1.f(arrayList15, g3d1VarF51);
                g3d1VarF52.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF52.a(new k29(1, h3d1Var3, 0L));
                h4b1.g(2, h3d1Var3, 0L, g3d1VarF52);
                g3d1 g3d1VarF53 = h4b1.f(arrayList15, g3d1VarF52);
                g3d1VarF53.a(new k29(1, h3d1Var2, 0L));
                g3d1VarF53.a(new k29(1, h3d1Var3, 0L));
                h4b1.g(3, h3d1Var3, 0L, g3d1VarF53);
                arrayList15.add(g3d1VarF53);
                arrayList14.addAll(arrayList15);
            }
            try {
                outputFormats = ((StreamConfigurationMap) ((ezb1) this.k.b().b).b).getOutputFormats();
            } catch (IllegalArgumentException | NullPointerException unused) {
                j2h1.N("StreamConfigurationMapCompatBaseImpl");
                outputFormats = null;
            }
            int[] iArr3 = outputFormats != null ? (int[]) outputFormats.clone() : null;
            if (iArr3 != null) {
                for (int i4 : iArr3) {
                    if (i4 == 4101) {
                        ArrayList arrayList16 = this.g;
                        ArrayList arrayList17 = new ArrayList();
                        g3d1 g3d1Var11 = new g3d1();
                        h4b1.g(4, h3d1Var, 0L, g3d1Var11);
                        g3d1 g3d1VarF54 = h4b1.f(arrayList17, g3d1Var11);
                        g3d1VarF54.a(new k29(1, h3d1Var2, 0L));
                        h4b1.g(4, h3d1Var, 0L, g3d1VarF54);
                        arrayList17.add(g3d1VarF54);
                        arrayList16.addAll(arrayList17);
                        break;
                    }
                }
            }
            boolean zD = hfc1.d(this.k);
            this.q = zD;
            if (zD && Build.VERSION.SDK_INT >= 33) {
                ArrayList arrayList18 = this.h;
                ArrayList arrayList19 = new ArrayList();
                g3d1 g3d1Var12 = new g3d1();
                h4b1.g(1, h3d1Var6, 4L, g3d1Var12);
                g3d1 g3d1VarF55 = h4b1.f(arrayList19, g3d1Var12);
                h4b1.g(2, h3d1Var6, 4L, g3d1VarF55);
                g3d1 g3d1VarF56 = h4b1.f(arrayList19, g3d1VarF55);
                h4b1.g(1, h3d1Var3, 3L, g3d1VarF56);
                g3d1 g3d1VarF57 = h4b1.f(arrayList19, g3d1VarF56);
                h4b1.g(2, h3d1Var3, 3L, g3d1VarF57);
                g3d1 g3d1VarF58 = h4b1.f(arrayList19, g3d1VarF57);
                h4b1.g(3, h3d1Var, 2L, g3d1VarF58);
                g3d1 g3d1VarF59 = h4b1.f(arrayList19, g3d1VarF58);
                h4b1.g(2, h3d1Var, 2L, g3d1VarF59);
                g3d1 g3d1VarF60 = h4b1.f(arrayList19, g3d1VarF59);
                g3d1VarF60.a(new k29(1, h3d1Var2, 1L));
                h4b1.g(3, h3d1Var, 2L, g3d1VarF60);
                g3d1 g3d1VarF61 = h4b1.f(arrayList19, g3d1VarF60);
                g3d1VarF61.a(new k29(1, h3d1Var2, 1L));
                h4b1.g(2, h3d1Var, 2L, g3d1VarF61);
                g3d1 g3d1VarF62 = h4b1.f(arrayList19, g3d1VarF61);
                g3d1VarF62.a(new k29(1, h3d1Var2, 1L));
                h4b1.g(1, h3d1Var3, 3L, g3d1VarF62);
                g3d1 g3d1VarF63 = h4b1.f(arrayList19, g3d1VarF62);
                g3d1VarF63.a(new k29(1, h3d1Var2, 1L));
                h4b1.g(2, h3d1Var3, 3L, g3d1VarF63);
                g3d1 g3d1VarF64 = h4b1.f(arrayList19, g3d1VarF63);
                g3d1VarF64.a(new k29(1, h3d1Var2, 1L));
                h4b1.g(2, h3d1Var2, 1L, g3d1VarF64);
                g3d1 g3d1VarF65 = h4b1.f(arrayList19, g3d1VarF64);
                g3d1VarF65.a(new k29(1, h3d1Var2, 1L));
                g3d1VarF65.a(new k29(1, h3d1Var3, 3L));
                h4b1.g(3, h3d1Var3, 2L, g3d1VarF65);
                g3d1 g3d1VarF66 = h4b1.f(arrayList19, g3d1VarF65);
                g3d1VarF66.a(new k29(1, h3d1Var2, 1L));
                g3d1VarF66.a(new k29(2, h3d1Var3, 3L));
                h4b1.g(3, h3d1Var3, 2L, g3d1VarF66);
                g3d1 g3d1VarF67 = h4b1.f(arrayList19, g3d1VarF66);
                g3d1VarF67.a(new k29(1, h3d1Var2, 1L));
                g3d1VarF67.a(new k29(2, h3d1Var2, 1L));
                h4b1.g(3, h3d1Var, 2L, g3d1VarF67);
                arrayList19.add(g3d1VarF67);
                arrayList18.addAll(arrayList19);
            }
            w2d w2dVar = this.k;
            if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) w2dVar.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && iArr.length != 0) {
                for (int i5 : iArr) {
                    if (i5 == 2) {
                        if (Build.VERSION.SDK_INT < 33) {
                            break;
                        }
                        ArrayList arrayList20 = this.d;
                        ArrayList arrayList21 = new ArrayList();
                        g3d1 g3d1Var13 = new g3d1();
                        h4b1.g(1, h3d1Var6, 0L, g3d1Var13);
                        g3d1 g3d1VarF68 = h4b1.f(arrayList21, g3d1Var13);
                        h4b1.g(2, h3d1Var6, 0L, g3d1VarF68);
                        g3d1 g3d1VarF69 = h4b1.f(arrayList21, g3d1VarF68);
                        g3d1VarF69.a(new k29(1, h3d1Var6, 0L));
                        h4b1.g(3, h3d1Var, 0L, g3d1VarF69);
                        g3d1 g3d1VarF70 = h4b1.f(arrayList21, g3d1VarF69);
                        g3d1VarF70.a(new k29(2, h3d1Var6, 0L));
                        h4b1.g(3, h3d1Var, 0L, g3d1VarF70);
                        g3d1 g3d1VarF71 = h4b1.f(arrayList21, g3d1VarF70);
                        g3d1VarF71.a(new k29(1, h3d1Var6, 0L));
                        h4b1.g(2, h3d1Var, 0L, g3d1VarF71);
                        g3d1 g3d1VarF72 = h4b1.f(arrayList21, g3d1VarF71);
                        g3d1VarF72.a(new k29(2, h3d1Var6, 0L));
                        h4b1.g(2, h3d1Var, 0L, g3d1VarF72);
                        g3d1 g3d1VarF73 = h4b1.f(arrayList21, g3d1VarF72);
                        g3d1VarF73.a(new k29(1, h3d1Var2, 0L));
                        h4b1.g(1, h3d1Var6, 0L, g3d1VarF73);
                        g3d1 g3d1VarF74 = h4b1.f(arrayList21, g3d1VarF73);
                        g3d1VarF74.a(new k29(2, h3d1Var2, 0L));
                        h4b1.g(1, h3d1Var6, 0L, g3d1VarF74);
                        g3d1 g3d1VarF75 = h4b1.f(arrayList21, g3d1VarF74);
                        g3d1VarF75.a(new k29(1, h3d1Var2, 0L));
                        h4b1.g(2, h3d1Var6, 0L, g3d1VarF75);
                        g3d1 g3d1VarF76 = h4b1.f(arrayList21, g3d1VarF75);
                        g3d1VarF76.a(new k29(2, h3d1Var2, 0L));
                        h4b1.g(2, h3d1Var6, 0L, g3d1VarF76);
                        arrayList21.add(g3d1VarF76);
                        arrayList20.addAll(arrayList21);
                        break;
                    }
                }
            }
            b();
        } catch (CameraAccessExceptionCompat e) {
            throw new CameraUnavailableException(e);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] highResolutionOutputSizes;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        oxh oxhVar = new oxh((byte) 0, false);
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), oxhVar);
        Size size2 = d391.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), oxhVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), oxhVar);
    }

    public static int e(Range range, Range range2) {
        o0c.q("Ranges must not intersect", (range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true);
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(j29 j29Var, List list) {
        List list2;
        HashMap map = this.e;
        if (map.containsKey(j29Var)) {
            list2 = (List) map.get(j29Var);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = j29Var.d;
            int i = j29Var.a;
            if (!z) {
                int i2 = j29Var.b;
                if (i2 == 8) {
                    if (i != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i != 2) {
                            if (j29Var.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        list2 = this.c;
                    }
                    map.put(j29Var, list2);
                } else if (i2 == 10 && i == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i == 0) {
                arrayList.addAll(this.g);
            }
            list2 = arrayList;
            map.put(j29Var, list2);
        }
        Iterator it = list2.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 = ((g3d1) it.next()).c(list) != null;
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() {
        Size size;
        Size size2;
        Size size3;
        Size sizeE = this.u.e();
        try {
            int i = Integer.parseInt(this.i);
            s0d s0dVar = this.j;
            CamcorderProfile camcorderProfileA = null;
            CamcorderProfile camcorderProfileA2 = s0dVar.c(i, 1) ? s0dVar.a(i, 1) : null;
            if (camcorderProfileA2 == null) {
                Size size4 = d391.c;
                if (s0dVar.c(i, 10)) {
                    camcorderProfileA = s0dVar.a(i, 10);
                } else if (s0dVar.c(i, 8)) {
                    camcorderProfileA = s0dVar.a(i, 8);
                } else if (s0dVar.c(i, 12)) {
                    camcorderProfileA = s0dVar.a(i, 12);
                } else if (s0dVar.c(i, 6)) {
                    camcorderProfileA = s0dVar.a(i, 6);
                } else if (s0dVar.c(i, 5)) {
                    camcorderProfileA = s0dVar.a(i, 5);
                } else if (s0dVar.c(i, 4)) {
                    camcorderProfileA = s0dVar.a(i, 4);
                }
                if (camcorderProfileA != null) {
                    size2 = new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight);
                } else {
                    size3 = size4;
                }
                this.s = new p29(d391.b, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
            }
            size2 = new Size(camcorderProfileA2.videoFrameWidth, camcorderProfileA2.videoFrameHeight);
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((ezb1) this.k.b().b).b).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = d391.c;
            } else {
                int i2 = 0;
                Arrays.sort(outputSizes, new oxh((byte) 0, true));
                int length = outputSizes.length;
                while (true) {
                    if (i2 < length) {
                        Size size5 = outputSizes[i2];
                        int width = size5.getWidth();
                        Size size6 = d391.e;
                        if (width <= size6.getWidth() && size5.getHeight() <= size6.getHeight()) {
                            size2 = size5;
                            break;
                        }
                        i2++;
                    } else {
                        size = d391.c;
                    }
                }
            }
            size2 = size;
            break;
        }
        size3 = size2;
        this.s = new p29(d391.b, new HashMap(), sizeE, new HashMap(), size3, new HashMap(), new HashMap());
    }

    public final List d(j29 j29Var, List list) {
        sy8 sy8Var = hfc1.a;
        if (j29Var.a != 0 || j29Var.b != 8) {
            return null;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            List listC = ((g3d1) it.next()).c(list);
            if (listC != null) {
                return listC;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:407:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:408:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:562:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0240  */
    /* JADX WARN: Code duplicated, block: B:86:0x024a  */
    public final Pair g(int i, ArrayList arrayList, HashMap map, boolean z, boolean z2) {
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        int i3;
        HashMap map2;
        HashMap map3;
        int i4;
        List list;
        HashMap map4;
        String str;
        HashMap map5;
        HashMap map6;
        ArrayList arrayList2;
        List list2;
        ArrayList arrayList3;
        String str2;
        List list3;
        List list4;
        Range range;
        HashMap map7;
        HashMap map8;
        Range[] rangeArr;
        int i5;
        Range range2;
        List list5;
        ArrayList arrayList4;
        int i6;
        int outputMinFrameDuration;
        Rational rational;
        Size sizeB;
        String str3;
        String str4;
        int outputMinFrameDuration2;
        liv livVar;
        Iterator it;
        ArrayList arrayList5;
        liv livVarB;
        Iterator it2;
        liv livVarT;
        Iterator it3;
        HashMap map9 = map;
        liv livVar2 = liv.c;
        oju ojuVar = this.u;
        ojuVar.b = ojuVar.a();
        if (this.s == null) {
            b();
        } else {
            Size sizeE = this.u.e();
            p29 p29Var = this.s;
            this.s = new p29(p29Var.a, p29Var.b, sizeE, p29Var.d, p29Var.e, p29Var.f, p29Var.g);
        }
        ArrayList<i4i1> arrayList6 = new ArrayList(map9.keySet());
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            Integer num = (Integer) ((i4i1) it4.next()).h(i4i1.E0, 0);
            num.getClass();
            if (!arrayList8.contains(num)) {
                arrayList8.add(num);
            }
        }
        Collections.sort(arrayList8);
        Collections.reverse(arrayList8);
        Iterator it5 = arrayList8.iterator();
        while (it5.hasNext()) {
            int iIntValue = ((Integer) it5.next()).intValue();
            for (i4i1 i4i1Var : arrayList6) {
                if (iIntValue == ((Integer) i4i1Var.h(i4i1.E0, 0)).intValue()) {
                    arrayList7.add(Integer.valueOf(arrayList6.indexOf(i4i1Var)));
                }
            }
        }
        oi oiVar = this.x;
        oiv oivVar = (oiv) oiVar.d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            linkedHashSet.add(((ey8) it6.next()).d);
        }
        Set setC = ((niv) oivVar.a).c();
        HashSet hashSet = new HashSet(setC);
        Iterator it7 = linkedHashSet.iterator();
        while (it7.hasNext()) {
            oi.K(hashSet, (liv) it7.next(), oivVar);
        }
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it8 = arrayList7.iterator();
        while (it8.hasNext()) {
            i4i1 i4i1Var2 = (i4i1) arrayList6.get(((Integer) it8.next()).intValue());
            ArrayList arrayList12 = arrayList7;
            liv livVar3 = (liv) i4i1Var2.h(st70.L, livVar2);
            livVar3.getClass();
            if (livVar3.equals(livVar2)) {
                arrayList11.add(i4i1Var2);
                it3 = it8;
            } else {
                it3 = it8;
                int i7 = livVar3.a;
                int i8 = livVar3.b;
                if (i7 == 2 || ((i7 != 0 && i8 == 0) || (i7 == 0 && i8 != 0))) {
                    arrayList10.add(i4i1Var2);
                } else {
                    arrayList9.add(i4i1Var2);
                }
            }
            arrayList7 = arrayList12;
            it8 = it3;
        }
        ArrayList arrayList13 = arrayList7;
        HashMap map10 = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList14 = new ArrayList();
        arrayList14.addAll(arrayList9);
        arrayList14.addAll(arrayList10);
        arrayList14.addAll(arrayList11);
        Iterator it9 = arrayList14.iterator();
        while (true) {
            Object obj = null;
            if (!it9.hasNext()) {
                ArrayList arrayList15 = arrayList6;
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        Iterator it11 = map9.keySet().iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                z3 = false;
                                break;
                            }
                            if (((i4i1) it11.next()).m() == 4101) {
                            }
                        }
                    } else if (((ey8) it10.next()).b == 4101) {
                    }
                    z3 = true;
                    break;
                }
                String str5 = this.i;
                Iterator it12 = map10.values().iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        i2 = 8;
                        break;
                    }
                    if (((liv) it12.next()).b == 10) {
                        i2 = 10;
                        break;
                    }
                }
                if (i != 0 && z3) {
                    throw new IllegalArgumentException(cy30.p("Camera device id is ", str5, ". Ultra HDR is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                if (i != 0 && i2 == 10) {
                    throw new IllegalArgumentException(cy30.p("Camera device id is ", str5, ". 10 bit dynamic range is not currently supported in ", i != 1 ? i != 2 ? "DEFAULT" : "ULTRA_HIGH_RESOLUTION_CAMERA" : "CONCURRENT_CAMERA", " camera mode."));
                }
                j29 j29Var = new j29(i, i2, z, z3);
                ArrayList arrayList16 = new ArrayList();
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    arrayList16.add(((ey8) it13.next()).a);
                }
                oxh oxhVar = new oxh((byte) 0, false);
                for (i4i1 i4i1Var3 : map9.keySet()) {
                    List list6 = (List) map9.get(i4i1Var3);
                    o0c.k("No available output size is found for " + i4i1Var3 + ".", (list6 == null || list6.isEmpty()) ? false : true);
                    Size size = (Size) Collections.min(list6, oxhVar);
                    int iM = i4i1Var3.m();
                    arrayList16.add(k29.b(j29Var.a, iM, size, i(iM)));
                }
                boolean zA = a(j29Var, arrayList16);
                String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
                String str7 = " New configs: ";
                String str8 = "No supported surface combination is found for camera device - Id : ";
                if (!zA) {
                    k220.o("No supported surface combination is found for camera device - Id : ", this.i, ".  May be attempting to bind too many use cases. Existing surfaces: ", arrayList, " New configs: ", arrayList15);
                    return null;
                }
                Iterator it14 = arrayList.iterator();
                Range rangeIntersect = null;
                while (it14.hasNext()) {
                    Range range3 = ((ey8) it14.next()).g;
                    if (rangeIntersect == null) {
                        rangeIntersect = range3;
                    } else if (range3 != null) {
                        try {
                            rangeIntersect = rangeIntersect.intersect(range3);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                Iterator it15 = arrayList13.iterator();
                Range range4 = rangeIntersect;
                while (it15.hasNext()) {
                    ArrayList arrayList17 = arrayList15;
                    Range rangeIntersect2 = (Range) ((i4i1) arrayList17.get(((Integer) it15.next()).intValue())).h(i4i1.F0, obj);
                    if (range4 == null) {
                        range4 = rangeIntersect2;
                    } else if (rangeIntersect2 != null) {
                        try {
                            rangeIntersect2 = range4.intersect(rangeIntersect2);
                            range4 = rangeIntersect2;
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    arrayList15 = arrayList17;
                    obj = null;
                }
                ArrayList<i4i1> arrayList18 = arrayList15;
                HashMap map11 = new HashMap();
                Iterator it16 = map9.keySet().iterator();
                while (true) {
                    z4 = zA;
                    if (!it16.hasNext()) {
                        break;
                    }
                    i4i1 i4i1Var4 = (i4i1) it16.next();
                    ArrayList arrayList19 = new ArrayList();
                    HashMap map12 = new HashMap();
                    for (Size size2 : (List) map9.get(i4i1Var4)) {
                        int iM2 = i4i1Var4.m();
                        Iterator it17 = it16;
                        h3d1 h3d1Var = k29.b(j29Var.a, iM2, size2, i(iM2)).b;
                        if (range4 != null) {
                            str3 = str6;
                            try {
                                str4 = str7;
                                try {
                                    outputMinFrameDuration2 = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(iM2, size2));
                                } catch (Exception unused3) {
                                    outputMinFrameDuration2 = 0;
                                }
                            } catch (Exception unused4) {
                                str4 = str7;
                            }
                        } else {
                            str3 = str6;
                            str4 = str7;
                            outputMinFrameDuration2 = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                        Set hashSet2 = (Set) map12.get(h3d1Var);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet();
                            map12.put(h3d1Var, hashSet2);
                        }
                        if (!hashSet2.contains(Integer.valueOf(outputMinFrameDuration2))) {
                            arrayList19.add(size2);
                            hashSet2.add(Integer.valueOf(outputMinFrameDuration2));
                        }
                        it16 = it17;
                        str6 = str3;
                        str7 = str4;
                    }
                    map11.put(i4i1Var4, arrayList19);
                    map9 = map;
                    zA = z4;
                }
                String str9 = str6;
                String str10 = str7;
                ArrayList arrayList20 = new ArrayList();
                Iterator it18 = arrayList13.iterator();
                while (it18.hasNext()) {
                    i4i1 i4i1Var5 = (i4i1) arrayList18.get(((Integer) it18.next()).intValue());
                    List<Size> list7 = (List) map11.get(i4i1Var5);
                    int iM3 = i4i1Var5.m();
                    jxa jxaVar = this.v;
                    w2d w2dVar = this.k;
                    jxaVar.getClass();
                    if (((Nexus4AndroidLTargetAspectRatioQuirk) vvt.a.m(Nexus4AndroidLTargetAspectRatioQuirk.class)) == null && qqn1.i(w2dVar).m(AspectRatioLegacyApi21Quirk.class) == null) {
                        rational = null;
                    } else {
                        Size size3 = (Size) i(SemanticState.Hidden).f.get(Integer.valueOf(SemanticState.Hidden));
                        rational = new Rational(size3.getWidth(), size3.getHeight());
                    }
                    if (rational != null) {
                        ArrayList arrayList21 = new ArrayList();
                        ArrayList arrayList22 = new ArrayList();
                        for (Size size4 : list7) {
                            if (g57.a(rational, size4)) {
                                arrayList21.add(size4);
                            } else {
                                arrayList22.add(size4);
                            }
                        }
                        arrayList22.addAll(0, arrayList21);
                        list7 = arrayList22;
                    }
                    tz01 tz01Var = this.w;
                    int iA = k29.a(iM3);
                    if (((ExtraCroppingQuirk) tz01Var.b) != null && (sizeB = ExtraCroppingQuirk.b(iA)) != null) {
                        ArrayList arrayList23 = new ArrayList();
                        arrayList23.add(sizeB);
                        for (Size size5 : list7) {
                            if (!size5.equals(sizeB)) {
                                arrayList23.add(size5);
                            }
                        }
                        list7 = arrayList23;
                    }
                    arrayList20.add(list7);
                }
                Iterator it19 = arrayList20.iterator();
                int size6 = 1;
                while (it19.hasNext()) {
                    size6 *= ((List) it19.next()).size();
                }
                if (size6 == 0) {
                    hhg1.n("Failed to find supported resolutions.");
                    return null;
                }
                ArrayList arrayList24 = new ArrayList();
                for (int i9 = 0; i9 < size6; i9++) {
                    arrayList24.add(new ArrayList());
                }
                int size7 = size6 / ((List) arrayList20.get(0)).size();
                int i10 = size6;
                for (int i11 = 0; i11 < arrayList20.size(); i11++) {
                    List list8 = (List) arrayList20.get(i11);
                    for (int i12 = 0; i12 < size6; i12++) {
                        ((List) arrayList24.get(i12)).add((Size) list8.get((i12 % i10) / size7));
                    }
                    if (i11 < arrayList20.size() - 1) {
                        i10 = size7;
                        size7 /= ((List) arrayList20.get(i11 + 1)).size();
                    }
                }
                HashMap map13 = new HashMap();
                HashMap map14 = new HashMap();
                HashMap map15 = new HashMap();
                HashMap map16 = new HashMap();
                sy8 sy8Var = hfc1.a;
                Iterator it20 = arrayList.iterator();
                while (true) {
                    if (!it20.hasNext()) {
                        Iterator it21 = arrayList18.iterator();
                        while (true) {
                            if (!it21.hasNext()) {
                                z5 = false;
                                break;
                            }
                            i4i1 i4i1Var6 = (i4i1) it21.next();
                            if (hfc1.e(i4i1Var6, i4i1Var6.x())) {
                            }
                        }
                    } else {
                        ey8 ey8Var = (ey8) it20.next();
                        if (hfc1.e(ey8Var.f, (k4i1) ey8Var.e.get(0))) {
                        }
                    }
                    z5 = true;
                    break;
                }
                Iterator it22 = arrayList.iterator();
                int iMin = Alert.DURATION_SHOW_INDEFINITELY;
                while (it22.hasNext()) {
                    ey8 ey8Var2 = (ey8) it22.next();
                    boolean z6 = z5;
                    Iterator it23 = it22;
                    try {
                        outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(ey8Var2.b, ey8Var2.c));
                    } catch (Exception unused5) {
                        outputMinFrameDuration = 0;
                    }
                    iMin = Math.min(iMin, outputMinFrameDuration);
                    z5 = z6;
                    it22 = it23;
                }
                boolean z7 = z5;
                if (!this.q || z7) {
                    i3 = iMin;
                    map2 = map15;
                    map3 = map16;
                    i4 = 0;
                    list = null;
                } else {
                    Iterator it24 = arrayList24.iterator();
                    list = null;
                    while (true) {
                        if (!it24.hasNext()) {
                            arrayList4 = arrayList18;
                            i3 = iMin;
                            map2 = map15;
                            map3 = map16;
                            break;
                        }
                        ArrayList arrayList25 = arrayList18;
                        Pair pairH = h(i, arrayList, (List) it24.next(), arrayList25, arrayList13, iMin, map15, map16);
                        map2 = map15;
                        ArrayList arrayList26 = arrayList25;
                        map3 = map16;
                        List listD = d(j29Var, (List) pairH.first);
                        if (listD != null) {
                            k4i1 k4i1Var = k4i1.e;
                            int i13 = 0;
                            while (true) {
                                if (i13 < listD.size()) {
                                    arrayList4 = arrayList26;
                                    i3 = iMin;
                                    long j = ((k29) listD.get(i13)).c;
                                    if (map2.containsKey(Integer.valueOf(i13))) {
                                        List list9 = ((ey8) map2.get(Integer.valueOf(i13))).e;
                                        i6 = i13;
                                        if (hfc1.c(list9.size() == 1 ? (k4i1) list9.get(0) : k4i1Var, j, list9)) {
                                            i13 = i6 + 1;
                                            arrayList26 = arrayList4;
                                            iMin = i3;
                                            listD = listD;
                                        } else {
                                            list = null;
                                        }
                                    } else {
                                        i6 = i13;
                                        if (!map3.containsKey(Integer.valueOf(i6))) {
                                            eg.f("SurfaceConfig does not map to any use case");
                                            return null;
                                        }
                                        i4i1 i4i1Var7 = (i4i1) map3.get(Integer.valueOf(i6));
                                        if (hfc1.c(i4i1Var7.x(), j, i4i1Var7.x() == k4i1Var ? (List) ((dfc1) i4i1Var7).e(dfc1.b) : Collections.EMPTY_LIST)) {
                                            i13 = i6 + 1;
                                            arrayList26 = arrayList4;
                                            iMin = i3;
                                            listD = listD;
                                        } else {
                                            list = null;
                                        }
                                    }
                                } else {
                                    arrayList4 = arrayList26;
                                    i3 = iMin;
                                    list = listD;
                                }
                            }
                        } else {
                            arrayList4 = arrayList26;
                            i3 = iMin;
                            list = listD;
                        }
                        if (list != null) {
                            if (hfc1.a(this.k, list)) {
                                break;
                            }
                            list = null;
                        }
                        map2.clear();
                        map3.clear();
                        arrayList18 = arrayList4;
                        map15 = map2;
                        map16 = map3;
                        iMin = i3;
                    }
                    i4 = 0;
                    if (list == null && !z4) {
                        k220.o("No supported surface combination is found for camera device - Id : ", this.i, str9, arrayList, str10, arrayList4);
                        return null;
                    }
                    arrayList18 = arrayList4;
                }
                Iterator it25 = arrayList24.iterator();
                int i14 = i4;
                int i15 = i14;
                int i16 = Alert.DURATION_SHOW_INDEFINITELY;
                int iIntValue2 = Alert.DURATION_SHOW_INDEFINITELY;
                List list10 = null;
                List list11 = null;
                while (true) {
                    if (it25.hasNext()) {
                        List list12 = (List) it25.next();
                        map4 = map2;
                        map5 = map3;
                        ArrayList arrayList27 = arrayList18;
                        Iterator it26 = it25;
                        map6 = map13;
                        ArrayList arrayList28 = arrayList13;
                        str = str8;
                        arrayList2 = arrayList;
                        list2 = list;
                        int i17 = i16;
                        str2 = str10;
                        int i18 = i3;
                        int i19 = iIntValue2;
                        Pair pairH2 = h(i, arrayList2, list12, arrayList27, arrayList28, i18, null, null);
                        arrayList3 = arrayList28;
                        arrayList18 = arrayList27;
                        List list13 = (List) pairH2.first;
                        iIntValue2 = ((Integer) pairH2.second).intValue();
                        int i20 = (range4 == null || i18 <= iIntValue2 || iIntValue2 >= ((Integer) range4.getLower()).intValue()) ? 1 : i4;
                        if (i14 == 0 && a(j29Var, list13)) {
                            list5 = list12;
                            if (i17 == Integer.MAX_VALUE || i17 < iIntValue2) {
                                i17 = iIntValue2;
                                list10 = list5;
                            }
                            if (i20 != 0) {
                                if (i15 != 0) {
                                    i16 = iIntValue2;
                                    iIntValue2 = i19;
                                    list3 = list5;
                                } else {
                                    i17 = iIntValue2;
                                    i14 = 1;
                                    list10 = list5;
                                }
                            }
                        } else {
                            list5 = list12;
                        }
                        if (list2 != null && i15 == 0 && d(j29Var, list13) != null) {
                            if (i19 == Integer.MAX_VALUE || i19 < iIntValue2) {
                                i19 = iIntValue2;
                                list11 = list5;
                            }
                            if (i20 != 0) {
                                if (i14 != 0) {
                                    i16 = i17;
                                    list4 = list5;
                                    list3 = list10;
                                    break;
                                }
                                i15 = 1;
                                list11 = list5;
                            }
                            i3 = i18;
                            i16 = i17;
                            str10 = str2;
                            map2 = map4;
                            map3 = map5;
                            str8 = str;
                            it25 = it26;
                            arrayList13 = arrayList3;
                            list = list2;
                            map13 = map6;
                        }
                        iIntValue2 = i19;
                        i3 = i18;
                        i16 = i17;
                        str10 = str2;
                        map2 = map4;
                        map3 = map5;
                        str8 = str;
                        it25 = it26;
                        arrayList13 = arrayList3;
                        list = list2;
                        map13 = map6;
                    } else {
                        map4 = map2;
                        str = str8;
                        map5 = map3;
                        map6 = map13;
                        arrayList2 = arrayList;
                        list2 = list;
                        arrayList3 = arrayList13;
                        str2 = str10;
                        list3 = list10;
                    }
                    list4 = list11;
                    break;
                }
                if (list3 == null) {
                    throw new IllegalArgumentException(str + this.i + " and Hardware level: " + this.m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + arrayList2 + str2 + arrayList18);
                }
                if (range4 != null) {
                    range = i29.f;
                    if (!range4.equals(range) && (rangeArr = (Range[]) this.k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES)) != null) {
                        Range range5 = new Range(Integer.valueOf(Math.min(((Integer) range4.getLower()).intValue(), i16)), Integer.valueOf(Math.min(((Integer) range4.getUpper()).intValue(), i16)));
                        int length = rangeArr.length;
                        int iF = i4;
                        Range range6 = range;
                        int i21 = iF;
                        while (i21 < length) {
                            int i22 = i21;
                            Range range7 = rangeArr[i22];
                            int i23 = length;
                            if (i16 >= ((Integer) range7.getLower()).intValue()) {
                                if (range6.equals(i29.f)) {
                                    range6 = range7;
                                }
                                if (range7.equals(range5)) {
                                    range6 = range7;
                                    break;
                                }
                                try {
                                    int iF2 = f(range7.intersect(range5));
                                    if (iF == 0) {
                                        iF = iF2;
                                    } else if (iF2 >= iF) {
                                        try {
                                            i5 = iF;
                                            double dF = f(range6.intersect(range5));
                                            try {
                                                range2 = range6;
                                                try {
                                                    double dF2 = f(range7.intersect(range5));
                                                    double dF3 = dF2 / ((double) f(range7));
                                                    double dF4 = dF / ((double) f(range2));
                                                    if (dF2 > dF) {
                                                        if (dF3 >= 0.5d || dF3 >= dF4) {
                                                            range6 = range7;
                                                        } else {
                                                            range6 = range2;
                                                        }
                                                    } else if (dF2 == dF) {
                                                        if (dF3 <= dF4 && (dF3 != dF4 || ((Integer) range7.getLower()).intValue() <= ((Integer) range2.getLower()).intValue())) {
                                                            range6 = range2;
                                                        } else {
                                                            range6 = range7;
                                                        }
                                                    } else if (dF4 >= 0.5d || dF3 <= dF4) {
                                                        range6 = range2;
                                                    } else {
                                                        range6 = range7;
                                                    }
                                                    try {
                                                        iF = f(range5.intersect(range6));
                                                        range7 = range6;
                                                    } catch (IllegalArgumentException unused6) {
                                                        if (i5 == 0 || (e(range7, range5) >= e(range6, range5) && (e(range7, range5) != e(range6, range5) || (((Integer) range7.getLower()).intValue() <= ((Integer) range6.getUpper()).intValue() && f(range7) >= f(range6))))) {
                                                            iF = i5;
                                                        } else {
                                                            iF = i5;
                                                        }
                                                        i21 = i22 + 1;
                                                        length = i23;
                                                    }
                                                } catch (IllegalArgumentException unused7) {
                                                    range6 = range2;
                                                    if (i5 == 0) {
                                                    }
                                                    iF = i5;
                                                    i21 = i22 + 1;
                                                    length = i23;
                                                }
                                            } catch (IllegalArgumentException unused8) {
                                                range2 = range6;
                                            }
                                        } catch (IllegalArgumentException unused9) {
                                            range2 = range6;
                                            i5 = iF;
                                        }
                                    } else {
                                        range7 = range6;
                                    }
                                } catch (IllegalArgumentException unused10) {
                                    i5 = iF;
                                }
                                range6 = range7;
                            }
                            i21 = i22 + 1;
                            length = i23;
                        }
                        range = range6;
                    }
                } else {
                    range = null;
                }
                for (i4i1 i4i1Var8 : arrayList18) {
                    Range range8 = range;
                    Size size8 = (Size) list3.get(arrayList3.indexOf(Integer.valueOf(arrayList18.indexOf(i4i1Var8))));
                    Range range9 = i29.f;
                    if (size8 == null) {
                        bhn0.i("Null resolution");
                        return null;
                    }
                    Range range10 = i29.f;
                    if (range10 == null) {
                        bhn0.i("Null expectedFrameRateRange");
                        return null;
                    }
                    liv livVar4 = (liv) map10.get(i4i1Var8);
                    livVar4.getClass();
                    xdn0 xdn0VarD = xdn0.d();
                    sy8 sy8Var2 = z1d.d;
                    if (i4i1Var8.g(sy8Var2)) {
                        xdn0VarD.r(sy8Var2, (Long) i4i1Var8.e(sy8Var2));
                    }
                    sy8 sy8Var3 = i4i1.G0;
                    if (i4i1Var8.g(sy8Var3)) {
                        xdn0VarD.r(sy8Var3, (Boolean) i4i1Var8.e(sy8Var3));
                    }
                    sy8 sy8Var4 = qr70.b;
                    if (i4i1Var8.g(sy8Var4)) {
                        xdn0VarD.r(sy8Var4, (Integer) i4i1Var8.e(sy8Var4));
                    }
                    sy8 sy8Var5 = st70.K;
                    if (i4i1Var8.g(sy8Var5)) {
                        xdn0VarD.r(sy8Var5, (Integer) i4i1Var8.e(sy8Var5));
                    }
                    map14.put(i4i1Var8, new i29(size8, livVar4, range8 != null ? range8 : range10, new z1d(xdn0VarD, (byte) 9), z2));
                    range = range8;
                    arrayList3 = arrayList3;
                }
                if (list2 == null || i16 != iIntValue2 || list3.size() != list4.size()) {
                    map7 = map6;
                    break;
                }
                int i24 = i4;
                while (true) {
                    if (i24 >= list3.size()) {
                        map7 = map6;
                        if (!hfc1.f(this.k, arrayList2, map14, map7)) {
                            int i25 = i4;
                            while (i25 < list2.size()) {
                                long j2 = ((k29) list2.get(i25)).c;
                                HashMap map17 = map4;
                                if (map17.containsKey(Integer.valueOf(i25))) {
                                    ey8 ey8Var3 = (ey8) map17.get(Integer.valueOf(i25));
                                    z1d z1dVarB = hfc1.b(ey8Var3.f, j2);
                                    if (z1dVarB != null) {
                                        Size size9 = ey8Var3.c;
                                        Range range11 = i29.f;
                                        if (size9 == null) {
                                            bhn0.i("Null resolution");
                                            return null;
                                        }
                                        Range range12 = i29.f;
                                        if (range12 == null) {
                                            bhn0.i("Null expectedFrameRateRange");
                                            return null;
                                        }
                                        liv livVar5 = ey8Var3.d;
                                        if (livVar5 == null) {
                                            bhn0.i("Null dynamicRange");
                                            return null;
                                        }
                                        Range range13 = ey8Var3.g;
                                        if (range13 != null) {
                                            range12 = range13;
                                        }
                                        map7.put(ey8Var3, new i29(size9, livVar5, range12, z1dVarB, false));
                                    }
                                    map8 = map5;
                                } else {
                                    map8 = map5;
                                    if (!map8.containsKey(Integer.valueOf(i25))) {
                                        eg.f("SurfaceConfig does not map to any use case");
                                        return null;
                                    }
                                    i4i1 i4i1Var9 = (i4i1) map8.get(Integer.valueOf(i25));
                                    i29 i29Var = (i29) map14.get(i4i1Var9);
                                    z1d z1dVarB2 = hfc1.b(i29Var.d, j2);
                                    if (z1dVarB2 != null) {
                                        zwg zwgVarA = i29Var.a();
                                        zwgVarA.d = z1dVarB2;
                                        map14.put(i4i1Var9, zwgVarA.i());
                                    }
                                }
                                i25++;
                                map5 = map8;
                                map4 = map17;
                            }
                            break;
                        }
                        break;
                    }
                    if (!((Size) list3.get(i24)).equals(list4.get(i24))) {
                        map7 = map6;
                        break;
                    }
                    i24++;
                }
                return new Pair(map14, map7);
            }
            i4i1 i4i1Var10 = (i4i1) it9.next();
            liv livVar6 = (liv) i4i1Var10.h(st70.L, livVar2);
            livVar6.getClass();
            liv livVar7 = liv.d;
            if (!livVar6.b()) {
                livVar = livVar2;
                int i26 = livVar6.a;
                it = it9;
                int i27 = livVar6.b;
                arrayList5 = arrayList6;
                if (i26 == 1 && i27 == 0) {
                    if (!hashSet.contains(livVar7)) {
                        livVarB = null;
                        break;
                    }
                    livVarB = livVar7;
                } else {
                    livVarB = oi.B(livVar6, linkedHashSet, hashSet);
                    if (livVarB == null) {
                        livVarB = oi.B(livVar6, linkedHashSet2, hashSet);
                        if (livVarB != null) {
                            livVar6.toString();
                            livVarB.toString();
                            j2h1.o("DynamicRangeResolver");
                        } else if (oi.v(livVar6, livVar7, hashSet)) {
                            livVar6.toString();
                            livVar7.toString();
                            j2h1.o("DynamicRangeResolver");
                            livVarB = livVar7;
                        } else if (i26 == 2 && (i27 == 10 || i27 == 0)) {
                            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                            if (Build.VERSION.SDK_INT >= 33 && (livVarT = gg.t((w2d) oiVar.c)) != null) {
                                linkedHashSet3.add(livVarT);
                            }
                            linkedHashSet3.add(liv.e);
                            liv livVarB2 = oi.B(livVar6, linkedHashSet3, hashSet);
                            if (livVarB2 == null) {
                                it2 = hashSet.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        livVarB = null;
                                        break;
                                    }
                                    livVarB = (liv) it2.next();
                                    Iterator it27 = it2;
                                    o0c.q("Candidate dynamic range must be fully specified.", livVarB.b());
                                    if (!livVarB.equals(livVar7)) {
                                        livVar6.toString();
                                        livVarB.toString();
                                        j2h1.o("DynamicRangeResolver");
                                        break;
                                    }
                                    it2 = it27;
                                }
                            } else {
                                livVar6.toString();
                                livVarB2.toString();
                                j2h1.o("DynamicRangeResolver");
                                livVarB = livVarB2;
                            }
                        } else {
                            it2 = hashSet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    livVarB = null;
                                    break;
                                }
                                livVarB = (liv) it2.next();
                                Iterator it28 = it2;
                                o0c.q("Candidate dynamic range must be fully specified.", livVarB.b());
                                if (!livVarB.equals(livVar7) && oi.u(livVar6, livVarB)) {
                                    livVar6.toString();
                                    livVarB.toString();
                                    j2h1.o("DynamicRangeResolver");
                                    break;
                                }
                                it2 = it28;
                            }
                        }
                    } else {
                        livVar6.toString();
                        livVarB.toString();
                        j2h1.o("DynamicRangeResolver");
                    }
                }
            } else {
                if (!hashSet.contains(livVar6)) {
                    livVar = livVar2;
                    arrayList5 = arrayList6;
                    it = it9;
                    livVarB = null;
                    break;
                }
                livVar = livVar2;
                arrayList5 = arrayList6;
                it = it9;
                livVarB = livVar6;
            }
            if (livVarB == null) {
                String str11 = (String) i4i1Var10.e(jrd1.r0);
                String strJoin = TextUtils.join("\n  ", setC);
                String strJoin2 = TextUtils.join("\n  ", hashSet);
                StringBuilder sb = new StringBuilder("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  ");
                sb.append(str11);
                sb.append("\nRequested dynamic range:\n  ");
                sb.append(livVar6);
                sb.append("\nSupported dynamic ranges:\n  ");
                hhg1.n(l1d.q(sb, strJoin, "\nConstrained set of concurrent dynamic ranges:\n  ", strJoin2));
                return null;
            }
            oi.K(hashSet, livVarB, oivVar);
            map10.put(i4i1Var10, livVarB);
            if (!linkedHashSet.contains(livVarB)) {
                linkedHashSet2.add(livVarB);
            }
            livVar2 = livVar;
            it9 = it;
            arrayList6 = arrayList5;
        }
    }

    public final Pair h(int i, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i2, HashMap map, HashMap map2) {
        int outputMinFrameDuration;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ey8 ey8Var = (ey8) it.next();
            arrayList4.add(ey8Var.a);
            if (map != null) {
                map.put(Integer.valueOf(arrayList4.size() - 1), ey8Var);
            }
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            Size size = (Size) list.get(i3);
            i4i1 i4i1Var = (i4i1) arrayList2.get(((Integer) arrayList3.get(i3)).intValue());
            int iM = i4i1Var.m();
            arrayList4.add(k29.b(i, iM, size, i(iM)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList4.size() - 1), i4i1Var);
            }
            try {
                outputMinFrameDuration = (int) (1.0E9d / ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i4i1Var.m(), size));
            } catch (Exception unused) {
                outputMinFrameDuration = 0;
            }
            i2 = Math.min(i2, outputMinFrameDuration);
        }
        return new Pair(arrayList4, Integer.valueOf(i2));
    }

    public final p29 i(int i) {
        StreamConfigurationMap streamConfigurationMap;
        Integer numValueOf = Integer.valueOf(i);
        ArrayList arrayList = this.t;
        if (!arrayList.contains(numValueOf)) {
            j(this.s.b, d391.d, i);
            j(this.s.d, d391.f, i);
            HashMap map = this.s.f;
            w2d w2dVar = this.k;
            Size sizeC = c((StreamConfigurationMap) ((ezb1) w2dVar.b().b).b, i, true);
            if (sizeC != null) {
                map.put(Integer.valueOf(i), sizeC);
            }
            HashMap map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) w2dVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i), c(streamConfigurationMap, i, true));
            }
            arrayList.add(Integer.valueOf(i));
        }
        return this.s;
    }

    public final void j(HashMap map, Size size, int i) {
        if (this.f8p) {
            Size sizeC = c((StreamConfigurationMap) ((ezb1) this.k.b().b).b, i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeC != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeC), new oxh((byte) 0, false));
            }
            map.put(numValueOf, size);
        }
    }
}
