package com.airbnb.lottie;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import com.spotify.scannables.scannables.tagreader.SPTTagReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;
import p.b930;
import p.cdf0;
import p.dks0;
import p.er70;
import p.eyh0;
import p.fcf0;
import p.gv40;
import p.hhg1;
import p.hw81;
import p.i4k;
import p.idf0;
import p.itj0;
import p.j2e0;
import p.jj7;
import p.jmz0;
import p.kcf0;
import p.kpa0;
import p.l1d;
import p.ndf0;
import p.odf0;
import p.p2r;
import p.p5r;
import p.pze0;
import p.qdf0;
import p.qpi1;
import p.sdf0;
import p.ubf0;
import p.ur00;
import p.vcf0;
import p.wbf0;
import p.x74;
import p.xbf0;
import p.xc21;
import p.y3e1;
import p.ybf0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final ubf0 T0 = new ubf0();
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public final HashSet Q0;
    public final HashSet R0;
    public qdf0 S0;
    public final ybf0 d;
    public final ybf0 e;
    public idf0 f;
    public int g;
    public final cdf0 h;
    public String i;
    public int t;

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new ybf0(this, (byte) 1);
        this.e = new ybf0(this, (byte) 0);
        this.g = 0;
        this.h = new cdf0();
        this.N0 = false;
        this.O0 = false;
        this.P0 = true;
        this.Q0 = new HashSet();
        this.R0 = new HashSet();
        e(null, 2130969668);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setCompositionTask(qdf0 qdf0Var) {
        odf0 odf0Var = qdf0Var.d;
        Drawable drawable = this.h;
        if (odf0Var != null && drawable == getDrawable() && ((cdf0) drawable).a == odf0Var.a) {
            return;
        }
        this.Q0.add(xbf0.a);
        this.h.d();
        d();
        qdf0Var.b(this.d);
        qdf0Var.a(this.e);
        this.S0 = qdf0Var;
    }

    public final void c() {
        this.O0 = false;
        this.Q0.add(xbf0.f);
        cdf0 cdf0Var = this.h;
        cdf0Var.f.clear();
        cdf0Var.b.cancel();
        if (cdf0Var.isVisible()) {
            return;
        }
        cdf0Var.p1 = 1;
    }

    public final void d() {
        qdf0 qdf0Var = this.S0;
        if (qdf0Var != null) {
            qdf0Var.e(this.d);
            this.S0.d(this.e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, jmz0.a, i, 0);
        this.P0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            hhg1.n("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            return;
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.O0 = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        cdf0 cdf0Var = this.h;
        if (z) {
            cdf0Var.w(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            this.Q0.add(xbf0.b);
        }
        cdf0Var.v(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (cdf0Var.Y != z2) {
            cdf0Var.Y = z2;
            if (cdf0Var.a != null) {
                cdf0Var.c();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            cdf0Var.a(new kpa0("**"), ndf0.F, new j2e0(new hw81(x74.E(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(15, 0);
            if (i2 >= xc21.values().length) {
                i2 = 0;
            }
            setRenderMode(xc21.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i3 >= xc21.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(jj7.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        Context context = getContext();
        p5r p5rVar = qpi1.a;
        cdf0Var.c = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void g() {
        this.Q0.add(xbf0.f);
        this.h.k();
    }

    public jj7 getAsyncUpdates() {
        jj7 jj7Var = this.h.j1;
        return jj7Var != null ? jj7Var : jj7.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        jj7 jj7Var = this.h.j1;
        if (jj7Var == null) {
            jj7Var = jj7.a;
        }
        return jj7Var == jj7.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.h.T0;
    }

    public boolean getClipToCompositionBounds() {
        return this.h.N0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fcf0 getComposition() {
        cdf0 drawable = getDrawable();
        cdf0 cdf0Var = this.h;
        if (drawable == cdf0Var) {
            return cdf0Var.a;
        }
        return null;
    }

    public long getDuration() {
        fcf0 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.h.b.h;
    }

    public String getImageAssetsFolder() {
        return this.h.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.h.Z;
    }

    public float getMaxFrame() {
        return this.h.b.k();
    }

    public float getMinFrame() {
        return this.h.b.l();
    }

    public dks0 getPerformanceTracker() {
        fcf0 fcf0Var = this.h.a;
        if (fcf0Var != null) {
            return fcf0Var.a;
        }
        return null;
    }

    public float getProgress() {
        return this.h.b.j();
    }

    public xc21 getRenderMode() {
        return this.h.V0 ? xc21.c : xc21.b;
    }

    public int getRepeatCount() {
        return this.h.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.h.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.h.b.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invalidate() {
        super/*android.view.View*/.invalidate();
        cdf0 drawable = getDrawable();
        if (drawable instanceof cdf0) {
            boolean z = drawable.V0;
            xc21 xc21Var = xc21.c;
            if ((z ? xc21Var : xc21.b) == xc21Var) {
                this.h.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invalidateDrawable(Drawable drawable) {
        cdf0 drawable2 = getDrawable();
        cdf0 cdf0Var = this.h;
        if (drawable2 == cdf0Var) {
            super/*android.view.View*/.invalidateDrawable(cdf0Var);
        } else {
            super/*android.view.View*/.invalidateDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        if (isInEditMode() || !this.O0) {
            return;
        }
        this.h.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof wbf0)) {
            super/*android.view.View*/.onRestoreInstanceState(parcelable);
            return;
        }
        wbf0 wbf0Var = (wbf0) parcelable;
        super/*android.view.View*/.onRestoreInstanceState(wbf0Var.getSuperState());
        this.i = wbf0Var.a;
        HashSet hashSet = this.Q0;
        xbf0 xbf0Var = xbf0.a;
        if (!hashSet.contains(xbf0Var) && !TextUtils.isEmpty(this.i)) {
            setAnimation(this.i);
        }
        this.t = wbf0Var.b;
        if (!hashSet.contains(xbf0Var) && (i = this.t) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(xbf0.b)) {
            this.h.v(wbf0Var.c);
        }
        if (!hashSet.contains(xbf0.f) && wbf0Var.d) {
            g();
        }
        if (!hashSet.contains(xbf0.e)) {
            setImageAssetsFolder(wbf0Var.e);
        }
        if (!hashSet.contains(xbf0.c)) {
            setRepeatMode(wbf0Var.f);
        }
        if (hashSet.contains(xbf0.d)) {
            return;
        }
        setRepeatCount(wbf0Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Parcelable onSaveInstanceState() {
        boolean z;
        wbf0 wbf0Var = new wbf0(super/*android.view.View*/.onSaveInstanceState());
        wbf0Var.a = this.i;
        wbf0Var.b = this.t;
        cdf0 cdf0Var = this.h;
        sdf0 sdf0Var = cdf0Var.b;
        sdf0 sdf0Var2 = cdf0Var.b;
        wbf0Var.c = sdf0Var.j();
        if (cdf0Var.isVisible()) {
            z = sdf0Var2.Z;
        } else {
            int i = cdf0Var.p1;
            z = i == 2 || i == 3;
        }
        wbf0Var.d = z;
        wbf0Var.e = cdf0Var.h;
        wbf0Var.f = sdf0Var2.getRepeatMode();
        wbf0Var.g = sdf0Var2.getRepeatCount();
        return wbf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAnimation(final String str) {
        qdf0 qdf0VarA;
        this.i = str;
        this.t = 0;
        final byte b = 1;
        if (isInEditMode()) {
            qdf0VarA = new qdf0(new p2r(this, str, (byte) 5), true);
        } else {
            final String str2 = null;
            if (this.P0) {
                Context context = getContext();
                HashMap map = kcf0.a;
                final String strM = l1d.m("asset_", str);
                final Context applicationContext = context.getApplicationContext();
                qdf0VarA = kcf0.a(strM, new Callable() { // from class: p.hcf0
                    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v0 */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v19 */
                    /* JADX WARN: Type inference failed for: r4v2, types: [p.x6s] */
                    /* JADX WARN: Type inference failed for: r4v20 */
                    /* JADX WARN: Type inference failed for: r4v21 */
                    /* JADX WARN: Type inference failed for: r4v22 */
                    /* JADX WARN: Type inference failed for: r4v23 */
                    /* JADX WARN: Type inference failed for: r4v24 */
                    /* JADX WARN: Type inference failed for: r4v4 */
                    /* JADX WARN: Type inference failed for: r4v5 */
                    /* JADX WARN: Type inference failed for: r4v9 */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        fcf0 fcf0Var;
                        Exception exc;
                        Throwable th;
                        ?? r4;
                        odf0 odf0Var;
                        ?? r5;
                        fcf0 fcf0Var2;
                        Pair pair;
                        odf0 odf0VarH;
                        x6o0 x6o0Var;
                        switch (b) {
                            case 0:
                                Context context2 = applicationContext;
                                String str3 = str;
                                String str4 = strM;
                                t7o0 t7o0Var = l4o1.c;
                                if (t7o0Var == null) {
                                    synchronized (t7o0.class) {
                                        try {
                                            t7o0Var = l4o1.c;
                                            if (t7o0Var == null) {
                                                Context applicationContext2 = context2.getApplicationContext();
                                                x6o0 x6o0Var2 = l4o1.d;
                                                byte b2 = 0;
                                                if (x6o0Var2 == null) {
                                                    synchronized (x6o0.class) {
                                                        try {
                                                            x6o0Var = l4o1.d;
                                                            if (x6o0Var == null) {
                                                                x6o0Var = new x6o0(new n8b0(applicationContext2), (byte) 0);
                                                                l4o1.d = x6o0Var;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    x6o0Var2 = x6o0Var;
                                                }
                                                t7o0Var = new t7o0(x6o0Var2, new vhc((byte) 6), b2);
                                                l4o1.c = t7o0Var;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                t7o0 t7o0Var2 = t7o0Var;
                                ?? r6 = 0;
                                int responseCode = 0;
                                x6s x6sVar = null;
                                if (str4 != null) {
                                    try {
                                        File fileH = ((x6o0) t7o0Var2.b).h(str3);
                                        if (fileH == null) {
                                            pair = null;
                                        } else {
                                            FileInputStream fileInputStream = new FileInputStream(fileH);
                                            e420 e420Var = fileH.getAbsolutePath().endsWith(".zip") ? e420.ZIP : fileH.getAbsolutePath().endsWith(".gz") ? e420.GZIP : e420.JSON;
                                            fileH.getAbsolutePath();
                                            nue0.a();
                                            pair = new Pair(e420Var, fileInputStream);
                                        }
                                    } catch (FileNotFoundException unused) {
                                    }
                                    if (pair == null) {
                                        fcf0Var = null;
                                    } else {
                                        e420 e420Var2 = (e420) pair.first;
                                        InputStream inputStream = (InputStream) pair.second;
                                        int iOrdinal = e420Var2.ordinal();
                                        if (iOrdinal == 1) {
                                            odf0VarH = kcf0.h(context2, new ZipInputStream(inputStream), str4);
                                        } else if (iOrdinal != 2) {
                                            odf0VarH = kcf0.c(inputStream, str4);
                                        } else {
                                            try {
                                                odf0VarH = kcf0.c(new GZIPInputStream(inputStream), str4);
                                            } catch (IOException e) {
                                                odf0VarH = new odf0(e);
                                            }
                                        }
                                        fcf0Var = odf0VarH.a;
                                        if (fcf0Var == null) {
                                            fcf0Var = null;
                                        }
                                    }
                                    break;
                                } else {
                                    fcf0Var = null;
                                }
                                if (fcf0Var == null) {
                                    nue0.a();
                                    nue0.a();
                                    try {
                                        try {
                                            x6s x6sVarG = vhc.g(str3);
                                            try {
                                                HttpURLConnection httpURLConnection = x6sVarG.a;
                                                try {
                                                    responseCode = httpURLConnection.getResponseCode() / 100;
                                                    if (responseCode == 2) {
                                                        InputStream inputStream2 = httpURLConnection.getInputStream();
                                                        odf0Var = t7o0Var2.d(context2, str3, inputStream2, httpURLConnection.getContentType(), str4);
                                                        fcf0 fcf0Var3 = odf0Var.a;
                                                        nue0.a();
                                                        r5 = inputStream2;
                                                    } else {
                                                        odf0Var = new odf0(new IllegalArgumentException(x6sVarG.a()));
                                                        r5 = responseCode;
                                                    }
                                                } catch (IOException unused2) {
                                                }
                                                try {
                                                    x6sVarG.close();
                                                    r6 = r5;
                                                } catch (IOException unused3) {
                                                    nue0.d("LottieFetchResult close failed ");
                                                    r6 = r5;
                                                }
                                                break;
                                            } catch (Exception e2) {
                                                exc = e2;
                                                x6sVar = x6sVarG;
                                                odf0 odf0Var2 = new odf0(exc);
                                                if (x6sVar != null) {
                                                    try {
                                                        x6sVar.close();
                                                    } catch (IOException unused4) {
                                                        nue0.d("LottieFetchResult close failed ");
                                                    }
                                                }
                                                odf0Var = odf0Var2;
                                                r6 = x6sVar;
                                                break;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r4 = x6sVarG;
                                                if (r4 == 0) {
                                                    throw th;
                                                }
                                                try {
                                                    r4.close();
                                                    throw th;
                                                } catch (IOException unused5) {
                                                    nue0.d("LottieFetchResult close failed ");
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            r4 = r6;
                                        }
                                    } catch (Exception e3) {
                                        exc = e3;
                                    }
                                    break;
                                } else {
                                    odf0Var = new odf0(fcf0Var);
                                }
                                if (str4 != null && (fcf0Var2 = odf0Var.a) != null) {
                                    gcf0.b.a.d(str4, fcf0Var2);
                                }
                                return odf0Var;
                            default:
                                return kcf0.b(applicationContext, str, strM);
                        }
                    }
                }, (Runnable) null);
            } else {
                Context context2 = getContext();
                HashMap map2 = kcf0.a;
                final Context applicationContext2 = context2.getApplicationContext();
                qdf0VarA = kcf0.a((String) null, new Callable() { // from class: p.hcf0
                    /* JADX WARN: Code duplicated, block: B:48:0x009e  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v0 */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v19 */
                    /* JADX WARN: Type inference failed for: r4v2, types: [p.x6s] */
                    /* JADX WARN: Type inference failed for: r4v20 */
                    /* JADX WARN: Type inference failed for: r4v21 */
                    /* JADX WARN: Type inference failed for: r4v22 */
                    /* JADX WARN: Type inference failed for: r4v23 */
                    /* JADX WARN: Type inference failed for: r4v24 */
                    /* JADX WARN: Type inference failed for: r4v4 */
                    /* JADX WARN: Type inference failed for: r4v5 */
                    /* JADX WARN: Type inference failed for: r4v9 */
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        fcf0 fcf0Var;
                        Exception exc;
                        Throwable th;
                        ?? r4;
                        odf0 odf0Var;
                        ?? r5;
                        fcf0 fcf0Var2;
                        Pair pair;
                        odf0 odf0VarH;
                        x6o0 x6o0Var;
                        switch (b) {
                            case 0:
                                Context context3 = applicationContext2;
                                String str3 = str;
                                String str4 = str2;
                                t7o0 t7o0Var = l4o1.c;
                                if (t7o0Var == null) {
                                    synchronized (t7o0.class) {
                                        try {
                                            t7o0Var = l4o1.c;
                                            if (t7o0Var == null) {
                                                Context applicationContext3 = context3.getApplicationContext();
                                                x6o0 x6o0Var2 = l4o1.d;
                                                byte b2 = 0;
                                                if (x6o0Var2 == null) {
                                                    synchronized (x6o0.class) {
                                                        try {
                                                            x6o0Var = l4o1.d;
                                                            if (x6o0Var == null) {
                                                                x6o0Var = new x6o0(new n8b0(applicationContext3), (byte) 0);
                                                                l4o1.d = x6o0Var;
                                                            }
                                                        } catch (Throwable th2) {
                                                            throw th2;
                                                        }
                                                        break;
                                                    }
                                                    x6o0Var2 = x6o0Var;
                                                }
                                                t7o0Var = new t7o0(x6o0Var2, new vhc((byte) 6), b2);
                                                l4o1.c = t7o0Var;
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                t7o0 t7o0Var2 = t7o0Var;
                                ?? r6 = 0;
                                int responseCode = 0;
                                x6s x6sVar = null;
                                if (str4 != null) {
                                    try {
                                        File fileH = ((x6o0) t7o0Var2.b).h(str3);
                                        if (fileH == null) {
                                            pair = null;
                                        } else {
                                            FileInputStream fileInputStream = new FileInputStream(fileH);
                                            e420 e420Var = fileH.getAbsolutePath().endsWith(".zip") ? e420.ZIP : fileH.getAbsolutePath().endsWith(".gz") ? e420.GZIP : e420.JSON;
                                            fileH.getAbsolutePath();
                                            nue0.a();
                                            pair = new Pair(e420Var, fileInputStream);
                                        }
                                    } catch (FileNotFoundException unused) {
                                    }
                                    if (pair == null) {
                                        fcf0Var = null;
                                    } else {
                                        e420 e420Var2 = (e420) pair.first;
                                        InputStream inputStream = (InputStream) pair.second;
                                        int iOrdinal = e420Var2.ordinal();
                                        if (iOrdinal == 1) {
                                            odf0VarH = kcf0.h(context3, new ZipInputStream(inputStream), str4);
                                        } else if (iOrdinal != 2) {
                                            odf0VarH = kcf0.c(inputStream, str4);
                                        } else {
                                            try {
                                                odf0VarH = kcf0.c(new GZIPInputStream(inputStream), str4);
                                            } catch (IOException e) {
                                                odf0VarH = new odf0(e);
                                            }
                                        }
                                        fcf0Var = odf0VarH.a;
                                        if (fcf0Var == null) {
                                            fcf0Var = null;
                                        }
                                    }
                                    break;
                                } else {
                                    fcf0Var = null;
                                }
                                if (fcf0Var == null) {
                                    nue0.a();
                                    nue0.a();
                                    try {
                                        try {
                                            x6s x6sVarG = vhc.g(str3);
                                            try {
                                                HttpURLConnection httpURLConnection = x6sVarG.a;
                                                try {
                                                    responseCode = httpURLConnection.getResponseCode() / 100;
                                                    if (responseCode == 2) {
                                                        InputStream inputStream2 = httpURLConnection.getInputStream();
                                                        odf0Var = t7o0Var2.d(context3, str3, inputStream2, httpURLConnection.getContentType(), str4);
                                                        fcf0 fcf0Var3 = odf0Var.a;
                                                        nue0.a();
                                                        r5 = inputStream2;
                                                    } else {
                                                        odf0Var = new odf0(new IllegalArgumentException(x6sVarG.a()));
                                                        r5 = responseCode;
                                                    }
                                                } catch (IOException unused2) {
                                                }
                                                try {
                                                    x6sVarG.close();
                                                    r6 = r5;
                                                } catch (IOException unused3) {
                                                    nue0.d("LottieFetchResult close failed ");
                                                    r6 = r5;
                                                }
                                                break;
                                            } catch (Exception e2) {
                                                exc = e2;
                                                x6sVar = x6sVarG;
                                                odf0 odf0Var2 = new odf0(exc);
                                                if (x6sVar != null) {
                                                    try {
                                                        x6sVar.close();
                                                    } catch (IOException unused4) {
                                                        nue0.d("LottieFetchResult close failed ");
                                                    }
                                                }
                                                odf0Var = odf0Var2;
                                                r6 = x6sVar;
                                                break;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r4 = x6sVarG;
                                                if (r4 == 0) {
                                                    throw th;
                                                }
                                                try {
                                                    r4.close();
                                                    throw th;
                                                } catch (IOException unused5) {
                                                    nue0.d("LottieFetchResult close failed ");
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            r4 = r6;
                                        }
                                    } catch (Exception e3) {
                                        exc = e3;
                                    }
                                    break;
                                } else {
                                    odf0Var = new odf0(fcf0Var);
                                }
                                if (str4 != null && (fcf0Var2 = odf0Var.a) != null) {
                                    gcf0.b.a.d(str4, fcf0Var2);
                                }
                                return odf0Var;
                            default:
                                return kcf0.b(applicationContext2, str, str2);
                        }
                    }
                }, (Runnable) null);
            }
        }
        setCompositionTask(qdf0VarA);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        final byte b = 3;
        setCompositionTask(kcf0.a((String) null, new Callable() { // from class: p.lhn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                byte b2 = b;
                boolean z = true;
                int i = 0;
                Object obj = byteArrayInputStream;
                switch (b2) {
                    case 0:
                        jhn jhnVar = ((ohn) obj).h;
                        jhnVar.getClass();
                        uo5.t();
                        ham hamVar = jhnVar.c;
                        if (hamVar.o()) {
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            hamVar.p();
                        } else {
                            String strE = jhnVar.e();
                            if (strE == null || !jhnVar.j.d(strE)) {
                                z = false;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        v0s v0sVar = (v0s) obj;
                        synchronized (v0sVar) {
                            ((q6y) v0sVar.a.get()).i(System.currentTimeMillis(), ((gys) v0sVar.c.get()).a());
                            break;
                        }
                        return null;
                    case 2:
                        WorkDatabase workDatabase = (WorkDatabase) ((ifl1) obj).b;
                        Long lA = workDatabase.v().a("next_job_scheduler_id");
                        int iLongValue = lA != null ? (int) lA.longValue() : 0;
                        int i2 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                        jnv0 jnv0VarV = workDatabase.v();
                        qyo1.x(jnv0VarV.a, false, true, new gub0(jnv0VarV, new hnv0(Long.valueOf(i2), "next_job_scheduler_id"), (byte) 13));
                        if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                            jnv0 jnv0VarV2 = workDatabase.v();
                            qyo1.x(jnv0VarV2.a, false, true, new gub0(jnv0VarV2, new hnv0(1L, "next_job_scheduler_id"), (byte) 13));
                        } else {
                            i = iLongValue;
                        }
                        return Integer.valueOf(i);
                    case 3:
                        return kcf0.c((ByteArrayInputStream) obj, (String) null);
                    case 4:
                        ((lkw0) obj).m = true;
                        return Boolean.TRUE;
                    case 5:
                        u141 u141Var = (u141) obj;
                        byte[] bArr = u141Var.a;
                        int i3 = u141Var.b;
                        String[] strArrDecodeWaveformTag = SPTTagReader.decodeWaveformTag(bArr, 0, i3, u141Var.c, i3);
                        return (strArrDecodeWaveformTag == null || strArrDecodeWaveformTag.length <= 0) ? j5.a : spq0.d(strArrDecodeWaveformTag[0]);
                    case 6:
                        s880 s880Var = (s880) ((nn61) obj).c;
                        gap1 gap1Var = (gap1) s880Var.f;
                        at61 at61Var = (at61) s880Var.c;
                        uo5.u();
                        try {
                            HashMap mapC = gap1.c(at61Var);
                            st60 st60Var = new st60(gap1Var.b, mapC);
                            st60Var.x("User-Agent", "Crashlytics Android SDK/19.3.0");
                            st60Var.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                            gap1.a(st60Var, at61Var);
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            mapC.toString();
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            tqt tqtVarU = st60Var.u();
                            int i4 = tqtVarU.b;
                            Log.isLoggable("FirebaseCrashlytics", 2);
                            if (i4 == 200 || i4 == 201 || i4 == 202 || i4 == 203) {
                                return new JSONObject(tqtVarU.c);
                            }
                            return null;
                        } catch (IOException | Exception unused) {
                            return null;
                        }
                    default:
                        return (AssetFileDescriptor) obj;
                }
            }
        }, new gv40(byteArrayInputStream, (byte) 12)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAnimationFromUrl(String str) {
        qdf0 qdf0VarG;
        if (this.P0) {
            Context context = getContext();
            HashMap map = kcf0.a;
            qdf0VarG = kcf0.g(context, str, "url_" + str);
        } else {
            qdf0VarG = kcf0.g(getContext(), str, (String) null);
        }
        setCompositionTask(qdf0VarG);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.h.S0 = z;
    }

    public void setAsyncUpdates(jj7 jj7Var) {
        this.h.j1 = jj7Var;
    }

    public void setCacheComposition(boolean z) {
        this.P0 = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        cdf0 cdf0Var = this.h;
        if (z != cdf0Var.T0) {
            cdf0Var.T0 = z;
            cdf0Var.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        cdf0 cdf0Var = this.h;
        if (z != cdf0Var.N0) {
            cdf0Var.N0 = z;
            i4k i4kVar = cdf0Var.O0;
            if (i4kVar != null) {
                i4kVar.I = z;
            }
            cdf0Var.invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setComposition(fcf0 fcf0Var) {
        Drawable drawable = this.h;
        drawable.setCallback(this);
        this.N0 = true;
        boolean zN = drawable.n(fcf0Var);
        if (this.O0) {
            drawable.k();
        }
        this.N0 = false;
        if (getDrawable() != drawable || zN) {
            if (!zN) {
                sdf0 sdf0Var = ((cdf0) drawable).b;
                boolean z = sdf0Var != null ? sdf0Var.Z : false;
                setImageDrawable(null);
                setImageDrawable(drawable);
                if (z) {
                    drawable.m();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.R0.iterator();
            if (it.hasNext()) {
                throw pze0.g(it);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        cdf0 cdf0Var = this.h;
        cdf0Var.X = str;
        ur00 ur00VarI = cdf0Var.i();
        if (ur00VarI != null) {
            ur00VarI.y(str);
        }
    }

    public void setFailureListener(idf0 idf0Var) {
        this.f = idf0Var;
    }

    public void setFallbackResource(int i) {
        this.g = i;
    }

    public void setFontAssetDelegate(b930 b930Var) {
        ur00 ur00Var = this.h.i;
    }

    public void setFontMap(Map<String, Typeface> map) {
        cdf0 cdf0Var = this.h;
        if (map == cdf0Var.t) {
            return;
        }
        cdf0Var.t = map;
        cdf0Var.invalidateSelf();
    }

    public void setFrame(int i) {
        this.h.o(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.h.d = z;
    }

    public void setImageAssetDelegate(er70 er70Var) {
        eyh0 eyh0Var = this.h.g;
    }

    public void setImageAssetsFolder(String str) {
        this.h.h = str;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.t = 0;
        this.i = null;
        d();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        this.t = 0;
        this.i = null;
        d();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        this.t = 0;
        this.i = null;
        d();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.h.Z = z;
    }

    public void setMaxFrame(int i) {
        this.h.p(i);
    }

    public void setMaxProgress(float f) {
        cdf0 cdf0Var = this.h;
        fcf0 fcf0Var = cdf0Var.a;
        if (fcf0Var == null) {
            cdf0Var.f.add(new vcf0(cdf0Var, f, (byte) 0));
            return;
        }
        sdf0 sdf0Var = cdf0Var.b;
        sdf0Var.s(sdf0Var.t, itj0.e(fcf0Var.l, fcf0Var.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.h.s(str);
    }

    public void setMinFrame(int i) {
        this.h.t(i);
    }

    public void setMinProgress(float f) {
        cdf0 cdf0Var = this.h;
        fcf0 fcf0Var = cdf0Var.a;
        if (fcf0Var == null) {
            cdf0Var.f.add(new vcf0(cdf0Var, f, (byte) 1));
        } else {
            cdf0Var.t((int) itj0.e(fcf0Var.l, fcf0Var.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        cdf0 cdf0Var = this.h;
        if (cdf0Var.R0 == z) {
            return;
        }
        cdf0Var.R0 = z;
        i4k i4kVar = cdf0Var.O0;
        if (i4kVar != null) {
            i4kVar.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        cdf0 cdf0Var = this.h;
        cdf0Var.Q0 = z;
        fcf0 fcf0Var = cdf0Var.a;
        if (fcf0Var != null) {
            fcf0Var.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.Q0.add(xbf0.b);
        this.h.v(f);
    }

    public void setRenderMode(xc21 xc21Var) {
        cdf0 cdf0Var = this.h;
        cdf0Var.U0 = xc21Var;
        cdf0Var.e();
    }

    public void setRepeatCount(int i) {
        this.Q0.add(xbf0.d);
        this.h.w(i);
    }

    public void setRepeatMode(int i) {
        this.Q0.add(xbf0.c);
        this.h.x(i);
    }

    public void setSafeMode(boolean z) {
        this.h.e = z;
    }

    public void setSpeed(float f) {
        this.h.b.d = f;
    }

    public void setTextDelegate(y3e1 y3e1Var) {
        this.h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.h.b.N0 = z;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void unscheduleDrawable(Drawable drawable) {
        cdf0 cdf0Var;
        sdf0 sdf0Var;
        cdf0 cdf0Var2;
        boolean z = this.N0;
        if (!z && drawable == (cdf0Var2 = this.h)) {
            sdf0 sdf0Var2 = cdf0Var2.b;
            if (sdf0Var2 == null ? false : sdf0Var2.Z) {
                this.O0 = false;
                cdf0Var2.j();
            } else if (!z) {
                cdf0Var = (cdf0) drawable;
                sdf0Var = cdf0Var.b;
                if (sdf0Var != null ? sdf0Var.Z : false) {
                    cdf0Var.j();
                }
            }
        } else if (!z && (drawable instanceof cdf0)) {
            cdf0Var = (cdf0) drawable;
            sdf0Var = cdf0Var.b;
            if (sdf0Var != null ? sdf0Var.Z : false) {
                cdf0Var.j();
            }
        }
        super/*android.view.View*/.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.h.q(str);
    }

    public void setMinFrame(String str) {
        this.h.u(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ybf0(this, (byte) 1);
        this.e = new ybf0(this, (byte) 0);
        this.g = 0;
        this.h = new cdf0();
        this.N0 = false;
        this.O0 = false;
        this.P0 = true;
        this.Q0 = new HashSet();
        this.R0 = new HashSet();
        e(attributeSet, 2130969668);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ybf0(this, (byte) 1);
        this.e = new ybf0(this, (byte) 0);
        this.g = 0;
        this.h = new cdf0();
        this.N0 = false;
        this.O0 = false;
        this.P0 = true;
        this.Q0 = new HashSet();
        this.R0 = new HashSet();
        e(attributeSet, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAnimation(final int i) {
        qdf0 qdf0VarE;
        this.t = i;
        this.i = null;
        if (isInEditMode()) {
            qdf0VarE = new qdf0(new Callable() { // from class: p.vbf0
                /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, com.airbnb.lottie.LottieAnimationView] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ubf0 ubf0Var = LottieAnimationView.T0;
                    ?? r0 = this.a;
                    boolean z = r0.P0;
                    int i2 = i;
                    if (!z) {
                        return kcf0.f(i2, r0.getContext(), (String) null);
                    }
                    Context context = r0.getContext();
                    return kcf0.f(i2, context, kcf0.l(context, i2));
                }
            }, true);
        } else if (this.P0) {
            Context context = getContext();
            qdf0VarE = kcf0.e(i, context, kcf0.l(context, i));
        } else {
            qdf0VarE = kcf0.e(i, getContext(), (String) null);
        }
        setCompositionTask(qdf0VarE);
    }
}
