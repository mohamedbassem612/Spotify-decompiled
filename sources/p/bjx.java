package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.icu.text.BreakIterator;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import com.spotify.puffin.setup.setupflow.autodetect.ui.AutodetectView;
import com.spotify.puffin.setup.setupflow.ui.ErrorView;
import com.spotify.puffin.sharedui.views.DisconnectedView;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import com.spotify.voiceassistants.playermodels.SearchEndpointRequest;
import com.spotify.voiceassistants.playermodels.SpeakeasyDualResponse;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bjx implements Function, o2r0, juh0, b0z0 {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public bjx(Context context) {
        this.a = (byte) 25;
        this.b = context;
        this.c = Locale.forLanguageTag(upn1.o(context, "-"));
        Typeface typeface = Typeface.DEFAULT;
        Typeface typefaceB = qx21.b(context, 2131296269);
        this.d = typefaceB != null ? typefaceB : typeface;
        Typeface typeface2 = Typeface.DEFAULT_BOLD;
        Typeface typefaceB2 = qx21.b(context, 2131296262);
        this.e = typefaceB2 == null ? typeface2 : typefaceB2;
        Typeface typefaceB3 = qx21.b(context, 2131296277);
        this.f = typefaceB3 != null ? typefaceB3 : typeface2;
        Typeface typeface3 = Typeface.MONOSPACE;
        Typeface typefaceB4 = qx21.b(context, 2131296259);
        this.g = typefaceB4 != null ? typefaceB4 : typeface3;
    }

    public static String B(String str, Paint paint, float f) {
        if (paint.measureText(str) <= f) {
            return str;
        }
        while (str.length() > 0 && paint.measureText(str.concat("…")) > f) {
            str = ihc1.m0(1, str);
        }
        return str.concat("…");
    }

    public static Path V(RectF rectF, boolean z) {
        float f = z ? rectF.top : rectF.bottom;
        float fSqrt = (float) Math.sqrt(672.0d);
        float fAtan2 = (float) (((double) (((float) Math.atan2(fSqrt, 2.0d)) * 180.0f)) / 3.141592653589793d);
        Path path = new Path();
        path.moveTo(rectF.left + 16.0f, rectF.top);
        path.lineTo(rectF.right - 16.0f, rectF.top);
        d(path, rectF.right - 16.0f, rectF.top + 16.0f, 16.0f, -90.0f, 90.0f);
        path.lineTo(rectF.right, rectF.bottom - fSqrt);
        d(path, rectF.right - 2.0f, rectF.bottom - fSqrt, 2.0f, 0.0f, fAtan2);
        float f2 = 90.0f - (fAtan2 * 2.0f);
        d(path, rectF.right, rectF.bottom, 24.0f, fAtan2 - 180.0f, f2);
        d(path, rectF.right - fSqrt, rectF.bottom - 2.0f, 2.0f, 90.0f - fAtan2, fAtan2);
        path.lineTo(rectF.left + fSqrt, rectF.bottom);
        d(path, rectF.left + fSqrt, rectF.bottom - 2.0f, 2.0f, 90.0f, fAtan2);
        d(path, rectF.left, rectF.bottom, 24.0f, fAtan2 - 90.0f, f2);
        d(path, rectF.left + 2.0f, rectF.bottom - fSqrt, 2.0f, 180.0f - fAtan2, fAtan2);
        path.lineTo(rectF.left, rectF.top + 16.0f);
        d(path, rectF.left + 16.0f, rectF.top + 16.0f, 16.0f, 180.0f, 90.0f);
        path.close();
        if (z) {
            Matrix matrix = new Matrix();
            matrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, -1.0f, rectF.top + rectF.bottom, 0.0f, 0.0f, 1.0f});
            path.transform(matrix);
        }
        for (int i = 0; i < 30; i++) {
            float f3 = (i * 11.0f) + 26.4707f;
            float f4 = f - 1.5f;
            Path path2 = new Path();
            path2.addRoundRect(new RectF(f3, f4, 7.0f + f3, 3.0f + f4), 1.5f, 1.5f, Path.Direction.CW);
            path.op(path2, Path.Op.DIFFERENCE);
        }
        return path;
    }

    public static void X(Canvas canvas, Path path, int i, float f) {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        canvas.drawPath(path, paint);
    }

    public static Paint Y(float f, Typeface typeface, int i, Paint.Align align, boolean z) {
        Paint paint = new Paint(129);
        paint.setTextSize(f);
        paint.setTypeface(typeface);
        paint.setColor(i);
        paint.setTextAlign(align);
        if (z) {
            paint.setTextScaleX(1.3f);
        }
        return paint;
    }

    public static /* synthetic */ Paint Z(float f, Typeface typeface, int i) {
        return Y(f, typeface, i, Paint.Align.LEFT, false);
    }

    public static int b0(float f, int i) {
        return Color.argb((int) (255.0f * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void d(Path path, float f, float f2, float f3, float f4, float f5) {
        path.arcTo(new RectF(f - f3, f2 - f3, f + f3, f2 + f3), f4, f5, false);
    }

    public static ArrayList n(String str, Paint paint, float f) {
        List<String> listX;
        String string = ihc1.e1(str).toString();
        Pattern patternCompile = Pattern.compile("\\s+");
        int iEnd = 0;
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher(string);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(string.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(string.subSequence(iEnd, string.length()).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x(string.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        String str2 = "";
        for (String str3 : listX) {
            String str4 = str2.length() == 0 ? str3 : ((Object) str2) + " " + str3;
            if (str2.length() <= 0 || paint.measureText(str4) <= f) {
                str2 = str4;
            } else {
                arrayList2.add(str2);
                str2 = str3;
            }
        }
        if (str2.length() > 0) {
            arrayList2.add(str2);
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        List listSingletonList = arrayList2;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList("");
        }
        List list = listSingletonList;
        if (list.size() > 2) {
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(o7h.d1(list2, 2));
            arrayList3.set(p7h.L(arrayList3), B(o7h.y0(o7h.k0(list2, 1), " ", (String) null, (String) null, (iu30) null, 62), paint, f));
            return arrayList3;
        }
        List list3 = list;
        ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList4.add(B((String) it.next(), paint, f));
        }
        return arrayList4;
    }

    public static jgb1 r(bjx bjxVar, mr20 mr20Var, pux0 pux0Var) {
        return bjxVar.q(mr20Var, pux0Var, ((kz4) ((m7y0) bjxVar.e).b).c());
    }

    public static void t(ixg ixgVar, File file, long j) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            Logger.d("Couldn't create directories for \"%s\".", new Object[]{file});
            return;
        }
        parentFile.mkdirs();
        try {
            Bitmap bitmap = (Bitmap) ixgVar.i().timeout(j, TimeUnit.SECONDS).blockingGet();
            File file2 = new File(file.getParentFile(), file.getName() + ".tmp." + Thread.currentThread().getId());
            if (wyo1.q(bitmap, file2) && file2.renameTo(file)) {
                return;
            }
            Logger.d("Couldn't publish cache entry for \"%s\".", new Object[]{file});
            file2.delete();
        } catch (Exception e) {
            Logger.e(e, "Exception while trying to load the image.", new Object[0]);
        }
    }

    public static void u(Canvas canvas, Bitmap bitmap, RectF rectF, float f, float f2, float f3) {
        float fMax = Math.max(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight()) * f2;
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate(rectF.centerX() - ((bitmap.getWidth() * fMax) / 2.0f), (rectF.centerY() - ((bitmap.getHeight() * fMax) / 2.0f)) + f3);
        canvas.save();
        Path path = new Path();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmap, matrix, new Paint(3));
        canvas.restore();
    }

    public static void v(Canvas canvas, Path path, int i) {
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setShadowLayer(2.0f, 0.0f, 4.0f, Color.argb(38, 0, 0, 0));
        canvas.drawPath(path, paint);
    }

    public static void y(Canvas canvas, ArrayList arrayList, Paint paint, float f, float f2) {
        int i = 0;
        for (Object obj : o7h.d1(arrayList, 2)) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            canvas.drawText((String) obj, 190.0f, (i * f2) + f, paint);
            i = i2;
        }
    }

    public void A(Canvas canvas, as21 as21Var, Bitmap bitmap, String str, float f, float f2) {
        Typeface typeface = (Typeface) this.f;
        int i = as21Var.i;
        Paint.Align align = Paint.Align.CENTER;
        Paint paintY = Y(24.0f, typeface, i, align, true);
        ArrayList arrayListN = n(str, paintY, 348.0f);
        float fMax = Math.max(f, (arrayListN.size() * 26.4f) + 24.0f + 15.0f);
        float fMax2 = Math.max(0.0f, 383.0f - fMax);
        String upperCase = as21Var.b.toUpperCase((Locale) this.c);
        int i2 = as21Var.i;
        Paint paintY2 = Y(16.0f, typeface, i2, align, true);
        ArrayList arrayListN2 = n(upperCase, paintY2, 274.0f);
        Paint paint = new Paint(1);
        paint.setShader(new RadialGradient(85.0f, 99.0f, 213.0f, new int[]{b0(f2, -1), 0, 0}, new float[]{0.0f, 0.68f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.clipRect(-63.0f, -114.0f, 233.0f, 312.0f);
        canvas.drawCircle(85.0f, 99.0f, 213.0f, paint);
        canvas.restore();
        y(canvas, arrayListN, paintY, 46.0f, 26.4f);
        u(canvas, bitmap, new RectF((380.0f - fMax2) / 2.0f, fMax, (380.0f + fMax2) / 2.0f, fMax2 + fMax), 8.0f, 1.0f, 0.0f);
        y(canvas, arrayListN2, paintY2, 416.0f, 18.0f);
        if (arrayListN2.size() == 1) {
            Paint paintY3 = Y(14.0f, (Typeface) this.d, i2, align, true);
            canvas.drawText(B(as21Var.c, paintY3, 274.0f), 190.0f, 439.0f, paintY3);
        }
    }

    public void C(rpt0 rpt0Var) {
        ((ConcurrentHashMap) this.b).remove(rpt0Var);
        R(rpt0Var);
        ((ConcurrentHashMap.KeySetView) this.e).add(rpt0Var);
        spt0 spt0Var = (spt0) ((ConcurrentHashMap) this.g).get(rpt0Var);
        if (spt0Var != null) {
            spt0Var.a = bqt0.a;
        }
    }

    public String D(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance((Locale) this.c);
        characterInstance.setText(str);
        int next = characterInstance.next();
        return next == -1 ? "?" : str.substring(0, next);
    }

    public r6h1 E(r6h1 r6h1Var) {
        return ((n8h1) ((iu30) this.g).invoke(U(r6h1Var))).b();
    }

    public String F(int i, long j) {
        DateFormat dateInstance = DateFormat.getDateInstance(2, (Locale) this.c);
        char c = i < 0 ? '-' : '+';
        int iAbs = Math.abs(i);
        dateInstance.setTimeZone(DesugarTimeZone.getTimeZone("GMT" + c + (iAbs / 60) + ":" + ihc1.F0(2, String.valueOf(iAbs % 60))));
        return dateInstance.format(new Date(j));
    }

    public r6h1 G(r6h1 r6h1Var) {
        return ((n8h1) ((iu30) this.c).invoke(U(r6h1Var))).b();
    }

    public boolean H(rpt0 rpt0Var) {
        return ((ConcurrentHashMap) this.b).containsKey(rpt0Var) || ((ConcurrentHashMap) this.c).containsKey(rpt0Var);
    }

    public void I() {
        i8h1 i8h1Var = (i8h1) this.e;
        x6h1 x6h1VarC = ((txk0) this.f).b.c();
        x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
        ((iu30) this.c).invoke(s240.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
    
        if (r14 == r1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object J(java.lang.String r12, p.l921 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.eoi0
            if (r0 == 0) goto L13
            r0 = r14
            p.eoi0 r0 = (p.eoi0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.eoi0 r0 = new p.eoi0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            int r1 = r0.c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L2f
            if (r1 != r3) goto L29
            p.hm5.M(r14)
            goto L91
        L29:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r2
        L2f:
            p.hm5.M(r14)
            goto L66
        L33:
            p.hm5.M(r14)
            java.lang.Object r14 = r11.f
            p.dxz0 r14 = (p.dxz0) r14
            boolean r14 = r14.d()
            if (r14 != 0) goto L43
            p.soi0 r11 = p.soi0.a
            return r11
        L43:
            p.k921 r13 = r13.a
            p.i921 r14 = p.i921.a
            boolean r14 = r13.equals(r14)
            r9 = 0
            p.d9n r1 = p.d9n.a
            if (r14 == 0) goto L70
            java.lang.Object r11 = r11.b
            p.uxy0 r11 = (p.uxy0) r11
            r0.c = r4
            java.lang.Object r13 = r11.b
            p.q8n r13 = (p.q8n) r13
            p.d821 r14 = new p.d821
            r14.<init>(r11, r12, r9, r4)
            java.lang.Object r14 = p.fn31.Y(r13, r14, r0)
            if (r14 != r1) goto L66
            goto L90
        L66:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L9b
            p.uoi0 r11 = new p.uoi0
            r11.<init>(r14)
            return r11
        L70:
            boolean r14 = r13 instanceof p.j921
            if (r14 == 0) goto L9e
            java.lang.Object r11 = r11.c
            r6 = r11
            p.hyy0 r6 = (p.hyy0) r6
            r8 = r13
            p.j921 r8 = (p.j921) r8
            r0.c = r3
            java.lang.Object r11 = r6.b
            p.q8n r11 = (p.q8n) r11
            p.m311 r5 = new p.m311
            r10 = 10
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r14 = p.fn31.Y(r11, r5, r0)
            if (r14 != r1) goto L91
        L90:
            return r1
        L91:
            p.fru r14 = (p.fru) r14
            if (r14 == 0) goto L9b
            p.qoi0 r11 = new p.qoi0
            r11.<init>(r14)
            return r11
        L9b:
            p.roi0 r11 = p.roi0.a
            return r11
        L9e:
            p.eg.o()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bjx.J(java.lang.String, p.l921, p.onm):java.lang.Object");
    }

    public void K(xjb1 xjb1Var) {
        vku vkuVar = (vku) this.g;
        Single singleFromCallable = Single.fromCallable(new e71(this, xjb1Var, (byte) 22));
        Scheduler scheduler = (Scheduler) this.c;
        vkuVar.a(singleFromCallable.subscribeOn(scheduler).flatMap(new yjb1(this, xjb1Var)).observeOn(scheduler).subscribe(new z0u0(this, xjb1Var, (byte) 22), new z2a1(xjb1Var, (byte) 4)));
    }

    public r6h1 L(r6h1 r6h1Var) {
        return ((n8h1) ((iu30) this.f).invoke(U(r6h1Var))).b();
    }

    public void M(rpt0 rpt0Var, int i) {
        ((ConcurrentHashMap) this.b).put(rpt0Var, Integer.valueOf(i));
        spt0 spt0Var = (spt0) ((ConcurrentHashMap) this.g).get(rpt0Var);
        if (spt0Var != null) {
            spt0Var.a = dqt0.a;
        }
    }

    public void N(rpt0 rpt0Var, faa0 faa0Var) {
        ((ConcurrentHashMap) this.c).put(rpt0Var, faa0Var);
        spt0 spt0Var = (spt0) ((ConcurrentHashMap) this.g).get(rpt0Var);
        if (spt0Var != null) {
            spt0Var.a = cqt0.a;
        }
    }

    public void O(String str, rpt0 rpt0Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f;
        Object linkedHashSet = concurrentHashMap.get(str);
        if (linkedHashSet == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (linkedHashSet = new LinkedHashSet()))) != null) {
            linkedHashSet = objPutIfAbsent;
        }
        ((Set) linkedHashSet).add(rpt0Var);
    }

    public void P() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        for (faa0 faa0Var : concurrentHashMap.values()) {
            faa0Var.getClass();
            faa0Var.d((CancellationException) null);
        }
        concurrentHashMap.clear();
        ((ConcurrentHashMap.KeySetView) this.d).clear();
        ((ConcurrentHashMap.KeySetView) this.e).clear();
        ((ConcurrentHashMap) this.f).clear();
        ((ConcurrentHashMap) this.b).clear();
        ((ConcurrentHashMap) this.g).clear();
    }

    public List Q(String str) {
        Set<rpt0> set = (Set) ((ConcurrentHashMap) this.f).remove(str);
        if (set == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        for (rpt0 rpt0Var : set) {
            faa0 faa0Var = (faa0) ((ConcurrentHashMap) this.c).remove(rpt0Var);
            if (faa0Var != null) {
                faa0Var.d((CancellationException) null);
            }
            ((ConcurrentHashMap.KeySetView) this.d).remove(rpt0Var);
            ((ConcurrentHashMap.KeySetView) this.e).remove(rpt0Var);
            Integer num = (Integer) ((ConcurrentHashMap) this.b).get(rpt0Var);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            }
            ((ConcurrentHashMap) this.g).remove(rpt0Var);
        }
        return arrayList;
    }

    public void R(rpt0 rpt0Var) {
    }

    public Bitmap S(as21 as21Var, Bitmap bitmap, Bitmap bitmap2) {
        mmr0 mmr0Var;
        Context context = (Context) this.b;
        int i = as21Var.h;
        yr21 yr21Var = as21Var.a;
        boolean z = yr21Var instanceof yr21;
        if (z) {
            mmr0Var = new mmr0(380, 675);
        } else {
            if (!(yr21Var instanceof xr21)) {
                eg.o();
                return null;
            }
            mmr0Var = new mmr0(396, 700);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((Number) mmr0Var.a).intValue() * 2, ((Number) mmr0Var.b).intValue() * 2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(2.0f, 2.0f);
        if (!z) {
            if (!(yr21Var instanceof xr21)) {
                eg.o();
                return null;
            }
            xr21 xr21Var = (xr21) yr21Var;
            canvas.save();
            canvas.translate(200.0f, 228.5f);
            canvas.rotate(-0.97f);
            canvas.translate(-190.0f, -226.5f);
            Path pathV = V(new RectF(0.0f, 0.0f, 380.0f, 453.0f), false);
            v(canvas, pathV, i);
            canvas.save();
            canvas.clipPath(pathV);
            canvas.drawColor(i);
            A(canvas, as21Var, bitmap, context.getString(2131961309), 71.0f, 0.2f);
            canvas.restore();
            X(canvas, pathV, Color.argb(26, 255, 255, 255), 2.0f);
            canvas.restore();
            canvas.save();
            canvas.translate(198.0f, 579.0f);
            canvas.rotate(3.0f);
            canvas.translate(-190.0f, -111.0f);
            Path pathV2 = V(new RectF(0.0f, 0.0f, 380.0f, 222.0f), true);
            v(canvas, pathV2, i);
            canvas.save();
            canvas.clipPath(pathV2);
            canvas.drawColor(i);
            x(canvas, as21Var, bitmap2, context.getString(2131961304), F(xr21Var.b, xr21Var.a), xr21Var.c, 25.0f);
            z(canvas, as21Var, context.getString(2131961306), 136.0f, 194.0f, 135.0f, -0.19f);
            canvas.restore();
            X(canvas, pathV2, Color.argb(26, 255, 255, 255), 2.0f);
            canvas.restore();
            return bitmapCreateBitmap;
        }
        yr21 yr21Var2 = yr21Var;
        RectF rectF = new RectF(0.0f, 0.0f, 380.0f, 675.0f);
        float fSqrt = (float) Math.sqrt(672.0d);
        float fAtan2 = (float) (((double) (((float) Math.atan2(fSqrt, 2.0d)) * 180.0f)) / 3.141592653589793d);
        Path path = new Path();
        path.moveTo(rectF.left + 16.0f, rectF.top);
        path.lineTo(rectF.right - 16.0f, rectF.top);
        d(path, rectF.right - 16.0f, rectF.top + 16.0f, 16.0f, -90.0f, 90.0f);
        float f = 453.0f - fSqrt;
        path.lineTo(rectF.right, f);
        d(path, rectF.right - 2.0f, f, 2.0f, 0.0f, fAtan2);
        float f2 = fAtan2 * (-2.0f);
        d(path, rectF.right, 453.0f, 24.0f, fAtan2 - 180.0f, f2);
        float f3 = 453.0f + fSqrt;
        d(path, rectF.right - 2.0f, f3, 2.0f, -fAtan2, fAtan2);
        path.lineTo(rectF.right, rectF.bottom - 16.0f);
        d(path, rectF.right - 16.0f, rectF.bottom - 16.0f, 16.0f, 0.0f, 90.0f);
        path.lineTo(rectF.left + 16.0f, rectF.bottom);
        d(path, rectF.left + 16.0f, rectF.bottom - 16.0f, 16.0f, 90.0f, 90.0f);
        path.lineTo(rectF.left, f3);
        d(path, rectF.left + 2.0f, f3, 2.0f, 180.0f, fAtan2);
        d(path, rectF.left, 453.0f, 24.0f, fAtan2, f2);
        d(path, rectF.left + 2.0f, f, 2.0f, 180.0f - fAtan2, fAtan2);
        path.lineTo(rectF.left, rectF.top + 16.0f);
        d(path, rectF.left + 16.0f, rectF.top + 16.0f, 16.0f, 180.0f, 90.0f);
        path.close();
        v(canvas, path, i);
        canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i);
        A(canvas, as21Var, bitmap, context.getString(2131961310), 92.0f, 0.3f);
        int i2 = as21Var.i;
        Paint paint = new Paint(1);
        paint.setColor(b0(0.1f, i2));
        for (int i3 = 0; i3 < 30; i3++) {
            float f4 = (i3 * 11.0f) + 26.4707f;
            canvas.drawRoundRect(new RectF(f4, 452.0f, 7.0f + f4, 455.0f), 1.5f, 1.5f, paint);
        }
        x(canvas, as21Var, bitmap2, context.getString(2131961307), F(0, yr21Var2.a), null, 483.0f);
        z(canvas, as21Var, context.getString(2131961305), 177.0f, 180.0f, 594.0f, -3.14f);
        canvas.restore();
        X(canvas, path, Color.argb(26, 255, 255, 255), 1.0f);
        return bitmapCreateBitmap;
    }

    public void T(rpt0 rpt0Var) {
        ((ConcurrentHashMap) this.b).remove(rpt0Var);
        R(rpt0Var);
        ((ConcurrentHashMap.KeySetView) this.d).add(rpt0Var);
        spt0 spt0Var = (spt0) ((ConcurrentHashMap) this.g).get(rpt0Var);
        if (spt0Var != null) {
            spt0Var.a = eqt0.a;
        }
    }

    public n8h1 U(r6h1 r6h1Var) {
        return (n8h1) ((iu30) this.b).invoke(r6h1Var);
    }

    public fqt0 W(rpt0 rpt0Var) {
        if (((ConcurrentHashMap.KeySetView) this.d).contains(rpt0Var)) {
            return eqt0.a;
        }
        if (((ConcurrentHashMap.KeySetView) this.e).contains(rpt0Var)) {
            return bqt0.a;
        }
        if (((ConcurrentHashMap) this.b).containsKey(rpt0Var)) {
            return dqt0.a;
        }
        return ((ConcurrentHashMap) this.c).containsKey(rpt0Var) ? cqt0.a : aqt0.a;
    }

    public jgb1 a(f5y0 f5y0Var) {
        return r(this, f5y0Var, ((g58) this.d).c());
    }

    public r6h1 a0(r6h1 r6h1Var) {
        return ((n8h1) ((iu30) this.e).invoke(U(r6h1Var))).b();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:128:0x0322  */
    public Object apply(Object obj) {
        f6o1 zdh1Var;
        Single singleJust;
        spq0 spq0VarTrackUid;
        spq0 spq0VarTrackUri;
        spq0 spq0VarSkipTo;
        Single singleSingleOrError;
        b3i1 type = null;
        switch (this.a) {
            case 3:
                String str = (String) obj;
                q410 q410Var = (q410) this.b;
                String str2 = (String) this.c;
                PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.d;
                SkipToTrack skipToTrack = (preparePlayOptions == null || (spq0VarSkipTo = preparePlayOptions.skipTo()) == null) ? null : (SkipToTrack) spq0VarSkipTo.h();
                String str3 = (skipToTrack == null || (spq0VarTrackUri = skipToTrack.trackUri()) == null) ? null : (String) spq0VarTrackUri.h();
                String str4 = (skipToTrack == null || (spq0VarTrackUid = skipToTrack.trackUid()) == null) ? null : (String) spq0VarTrackUid.h();
                Set set = s4b1.f;
                blc0 blc0Var = uic.x(str2).c;
                beh1 beh1Var = beh1.g;
                if (str4 != null) {
                    zdh1Var = new aeh1(str4);
                } else {
                    zdh1Var = str3 != null ? new zdh1(str3) : beh1Var;
                }
                blc0 blc0Var2 = blc0.fh;
                Object t2u0Var = s2u0.a;
                if (blc0Var == blc0Var2) {
                    if (str3 == null || uic.x(str3).c != blc0.Pg) {
                        str3 = null;
                    }
                    if (!zdh1Var.equals(beh1Var)) {
                        t2u0Var = new t2u0(zdh1Var);
                    }
                    singleJust = Single.zip(rqt0.F(q410Var.j, new p1r(q410Var, str, type, (byte) 21)).map(uml1.d1), q410Var.l.b(new oi("external-integration-list-playback", false, new kq00(str, (byte) 6))).filter(cq41.d1).firstOrError().map(new k9p1(str, (byte) 10)).onErrorReturnItem(Boolean.FALSE), drm0.c1).map(new uny(t2u0Var, (Object) str3, (Object) str, (byte) 20)).onErrorReturnItem(t2u0Var);
                } else if (str3 != null) {
                    if (uic.x(str3).c != blc0.ed && uic.x(str3).c != blc0.Pg && uic.x(str3).c != blc0.M3) {
                        if (q410.q.contains(uic.x(str3).c)) {
                            if (!str2.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                                if (!str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ")) {
                                    singleJust = Single.just(t2u0Var);
                                } else {
                                    s4b1 s4b1VarX = uic.x(str2);
                                    v5b1 v5b1Var = s4b1VarX.d;
                                    if (v5b1Var != null) {
                                    }
                                    if (u890.j(type, nyu0.e)) {
                                        singleJust = Single.just(t2u0Var);
                                    } else {
                                        singleJust = Single.just(t2u0Var);
                                    }
                                }
                            }
                        }
                    }
                    singleJust = Single.just(new t2u0(zdh1Var));
                } else if (!str2.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
                    singleJust = Single.just(new t2u0(zdh1Var));
                } else if (!str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str2.equals("spotify:collection:tracks") || str2.equals("spotify:internal:collection:tracks") || (nhc1.Y(str2, "spotify:user:", false) && nhc1.R(str2, ":collection", false))) {
                    singleJust = Single.just(t2u0Var);
                } else {
                    s4b1 s4b1VarX2 = uic.x(str2);
                    v5b1 v5b1Var2 = s4b1VarX2.d;
                    type = v5b1Var2 != null ? v5b1Var2.getType() : null;
                    if (u890.j(type, nyu0.e) || u890.j(type, wyu0.f) || f46.S0(new blc0[]{blc0.u1, blc0.T3, blc0.k4}).contains(s4b1VarX2.c)) {
                        singleJust = Single.just(t2u0Var);
                    } else {
                        singleJust = Single.just(q2u0.a);
                    }
                }
                return singleJust.flatMap(new m410(q410Var, (PlayOrigin) this.e, (LoggingParams) this.f, (Map) this.g, str, (PreparePlayOptions) this.d));
            case 4:
                v410 v410Var = (v410) obj;
                Map map = (Map) this.g;
                String str5 = (String) this.f;
                LoggingParams loggingParams = (LoggingParams) this.e;
                PlayOrigin playOrigin = (PlayOrigin) this.d;
                PreparePlayOptions preparePlayOptions2 = (PreparePlayOptions) this.c;
                z410 z410Var = (z410) this.b;
                if (v410Var instanceof u410) {
                    return z410Var.b(((u410) v410Var).a, preparePlayOptions2, playOrigin, loggingParams);
                }
                if (!(v410Var instanceof t410)) {
                    eg.o();
                    return null;
                }
                Set set2 = s4b1.f;
                s4b1 s4b1VarX3 = uic.x(str5);
                blc0 blc0Var3 = s4b1VarX3.c;
                int[] iArr = s310.a;
                if (iArr[blc0Var3.ordinal()] != 1) {
                    Observable observable = z410Var.a;
                    if (str5.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str5.equals("spotify:collection:tracks") || str5.equals("spotify:internal:collection:tracks") || (nhc1.Y(str5, "spotify:user:", false) && nhc1.R(str5, ":collection", false))) {
                        singleSingleOrError = observable.map(new fjb(z410Var, (byte) 10)).take(1L).singleOrError();
                    } else {
                        singleSingleOrError = uic.x(str5).w() ? observable.map(xbp1.d1).take(1L).singleOrError() : Single.just(str5);
                    }
                    return singleSingleOrError.map(new y410(z410Var, map)).flatMap(new sp00(z410Var, preparePlayOptions2, playOrigin, loggingParams, (byte) 5));
                }
                t310 t310Var = z410Var.e;
                String strZ = s4b1VarX3.z();
                if (strZ == null) {
                    strZ = "";
                }
                if (iArr[blc0Var3.ordinal()] != 1) {
                    return Single.error(new Throwable("Invalid uri ".concat(strZ)));
                }
                com.spotify.player.model.Context.Builder builder = com.spotify.player.model.Context.fromUri("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ").toBuilder();
                if (map != null) {
                    builder.metadata(map);
                }
                PlayCommand.Builder builderLoggingParams = PlayCommand.builder(builder.build(), playOrigin).loggingParams(loggingParams);
                if (preparePlayOptions2 != null) {
                    builderLoggingParams.options(preparePlayOptions2);
                }
                return ((muz) t310Var.b.getValue()).a(builderLoggingParams.build());
            default:
                SpeakeasyDualResponse.CanPrepareResponse canPrepareResponse = (SpeakeasyDualResponse) obj;
                aoa1 aoa1Var = (aoa1) this.b;
                HashMap map2 = aoa1Var.f;
                gyv0 gyv0Var = (gyv0) map2.get((Uri) this.c);
                if (gyv0Var != null) {
                    gyv0Var.c = canPrepareResponse;
                }
                Uri uri = (Uri) this.c;
                SearchEndpointRequest searchEndpointRequest = (SearchEndpointRequest) this.d;
                zle1 zle1Var = (zle1) this.e;
                t45 t45Var = (t45) this.f;
                VoiceAssistantLoggingContext voiceAssistantLoggingContext = (VoiceAssistantLoggingContext) this.g;
                lv41 lv41Var = aoa1Var.b;
                mzr0 mzr0Var = new mzr0(uri, searchEndpointRequest, map2, lv41Var, zle1Var, t45Var, voiceAssistantLoggingContext);
                if (canPrepareResponse instanceof SpeakeasyDualResponse.CanPrepareResponse) {
                    return aoa1Var.a.a(new CommandPlayRequest(canPrepareResponse.getActionNlUri(), searchEndpointRequest.getSourceDevice().getDeviceType(), false, 4, (DefaultConstructorMarker) null)).compose(aoa1Var.e).flatMapCompletable(new wna1(uri, t45Var, voiceAssistantLoggingContext, aoa1Var, canPrepareResponse, mzr0Var, searchEndpointRequest)).p(new xna1(uri, voiceAssistantLoggingContext, aoa1Var, (byte) 0));
                }
                searchEndpointRequest.getInteractionId();
                return lv41Var.b(canPrepareResponse, mzr0Var, voiceAssistantLoggingContext);
        }
    }

    public jgb1 b(f5y0 f5y0Var) {
        return r(this, f5y0Var, ((g58) this.d).e());
    }

    public ParcelFileDescriptor c(Uri uri, File file, String str) throws FileNotFoundException {
        p370 p370Var = (p370) this.d;
        aai0 aai0Var = (aai0) this.c;
        gw70 gw70Var = (gw70) this.b;
        int i = hu50.a;
        File file2 = new File(file, gu50.a.H(uri.toString()).toString());
        if (file2.exists()) {
            return ParcelFileDescriptor.open(file2, 268435456);
        }
        if (((xr4) ((kly0) this.f).get()).a()) {
            yqg yqgVar = (yqg) this.e;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.g;
            Long l = (Long) concurrentHashMap.get(file2.getName());
            if (l != null) {
                if (yqgVar.e() - l.longValue() < 60000) {
                    throw new FileNotFoundException(h4b1.d(uri, "Recently failed to load "));
                }
                concurrentHashMap.remove(file2.getName(), l);
            }
            t(ilo1.s(gw70Var, aai0Var, p370Var, uri), file2, 2L);
            if (!file2.exists()) {
                concurrentHashMap.put(file2.getName(), Long.valueOf(yqgVar.e()));
            }
        } else {
            t(ilo1.s(gw70Var, aai0Var, p370Var, uri), file2, 5L);
        }
        return ParcelFileDescriptor.open(file2, 268435456);
    }

    public jgb1 e(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.d).c;
        mzy0 mzy0Var = mzy0.d;
        return q(f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 16), false);
    }

    public jgb1 f(f5y0 f5y0Var) {
        return r(this, f5y0Var, kdy0.d(((g58) this.d).c, mzy0.d, mzy0.e, false, 28));
    }

    public j4m g(nhr0 nhr0Var, Bundle bundle) {
        z7e0 z7e0Var = (z7e0) this.d;
        c4z c4zVar = new c4z(2, z7e0Var.b, i1n0.class, "createViewBuilder", "createViewBuilder(Lcom/spotify/navigation/identifier/ViewUri$Provider;Lcom/spotify/ubi/pageidentifier/PageIdentifierProvider;)Lcom/spotify/tome/pageloader/PageLoaderView$Builder;", 0, (byte) 23);
        cbr0 cbr0VarA = ((q7r0) this.e).d.b().a();
        return new r6e0(nhr0Var, (k241) ((w6e0) this.c).b, (u7r0) this.f, (iu30) this.g, c4zVar, z7e0Var.c, cbr0VarA);
    }

    public jgb1 h(f5y0 f5y0Var) {
        return r(this, f5y0Var, ((g58) this.d).d());
    }

    public jgb1 i(f5y0 f5y0Var) {
        return r(this, f5y0Var, ((g58) this.d).f());
    }

    public jgb1 j(f5y0 f5y0Var) {
        kdy0 kdy0Var = ((g58) this.d).c;
        mzy0 mzy0Var = mzy0.d;
        return r(this, f5y0Var, kdy0.d(kdy0Var, mzy0Var, mzy0Var, false, 4));
    }

    public n2r k() {
        return (w6e0) this.c;
    }

    public jgb1 m(f5y0 f5y0Var) {
        return r(this, f5y0Var, ((g58) this.d).b());
    }

    public void o(rpt0 rpt0Var) {
        ((ConcurrentHashMap.KeySetView) this.e).remove(rpt0Var);
        spt0 spt0Var = (spt0) ((ConcurrentHashMap) this.g).get(rpt0Var);
        if (spt0Var != null) {
            spt0Var.a = W(rpt0Var);
        }
    }

    public r6h1 p(r6h1 r6h1Var) {
        return ((n8h1) ((iu30) this.d).invoke(U(r6h1Var))).b();
    }

    public jgb1 q(mr20 mr20Var, pux0 pux0Var, boolean z) {
        c0g.x.getClass();
        return new jgb1("nonMeteredAudioStreamQuality", 2131961911, (String) null, 2131961906, (sp00) null, (Integer) null, (a2i) null, mr20Var, pbo1.N0, z ? ((pcl) this.c).a() : ((lag) this.b).h(), new xxm0((List) pux0Var.b, (Map) pux0Var.c, new oxm0(5), z ? new rxm0(rc11.a.b(uce0.class), n3o0.X) : new sxm0(u6n.a, n3o0.Y), (mxm0) null, 16), sqg0.J(new mmr0[]{new mmr0("wifiWarning", new reo0(z, this)), new mmr0("internalQualityWifiWarning", new reo0(this, z))}), 4026);
    }

    public void s() {
        ((vku) this.g).c();
    }

    public void w(Canvas canvas, as21 as21Var, String str, String str2, float f, float f2, float f3, float f4) {
        Paint paintZ = Z(9.0f, (Typeface) this.g, as21Var.i);
        Paint paintZ2 = Z(f4, (Typeface) this.e, as21Var.i);
        Locale locale = (Locale) this.c;
        canvas.drawText(str.toUpperCase(locale), f, 10.0f + f2, paintZ);
        canvas.drawText(B(str2.toUpperCase(locale), paintZ2, f3), f, f2 + 28.0f, paintZ2);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v10 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v11 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v12 ??, new type: android.content.Context
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r15v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: android.graphics.drawable.Drawable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: java.lang.CharSequence
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v13 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v11 ??, new type: java.util.regex.Pattern
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v12 ??, new type: java.util.regex.Matcher
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public void x(android.graphics.Canvas r22, p.as21 r23, android.graphics.Bitmap r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, float r28) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bjx.x(android.graphics.Canvas, p.as21, android.graphics.Bitmap, java.lang.String, java.lang.String, java.lang.String, float):void");
    }

    public void z(Canvas canvas, as21 as21Var, String str, float f, float f2, float f3, float f4) {
        canvas.save();
        float f5 = f / 2.0f;
        canvas.translate(f2 + f5, f3 + 24.5f);
        canvas.rotate(f4);
        canvas.translate((-f) / 2.0f, -24.5f);
        RectF rectF = new RectF(0.0f, 0.0f, f, 49.0f);
        Paint paint = new Paint(1);
        paint.setColor(b0(0.2f, as21Var.i));
        canvas.drawRoundRect(new RectF(4.0f, 4.0f, f + 4.0f, 53.0f), 16.0f, 16.0f, paint);
        canvas.drawRoundRect(rectF, 16.0f, 16.0f, paint);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(3.5f);
        int i = as21Var.i;
        paint2.setColor(i);
        canvas.drawRoundRect(rectF, 16.0f, 16.0f, paint2);
        Paint paintY = Y(14.0f, (Typeface) this.f, i, Paint.Align.CENTER, true);
        canvas.drawText(str.toUpperCase((Locale) this.c), f5, 24.5f - ((paintY.descent() + paintY.ascent()) / 2.0f), paintY);
        canvas.restore();
    }

    public bjx(rzo0 rzo0Var, Map map, Scheduler scheduler, Scheduler scheduler2) {
        this.a = (byte) 15;
        this.b = rzo0Var;
        this.c = map;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = new rku();
    }

    public bjx(lag lagVar, pcl pclVar, q3c q3cVar, g58 g58Var, m7y0 m7y0Var, b7n b7nVar, xv61 xv61Var) {
        this.a = (byte) 17;
        this.b = lagVar;
        this.c = pclVar;
        this.d = g58Var;
        this.e = m7y0Var;
        this.f = b7nVar;
        this.g = xv61Var;
    }

    public bjx(gw70 gw70Var, aai0 aai0Var, p370 p370Var, yqg yqgVar, caq caqVar) {
        this.a = (byte) 13;
        this.b = gw70Var;
        this.c = aai0Var;
        this.d = p370Var;
        this.e = yqgVar;
        this.f = caqVar;
        this.g = new ConcurrentHashMap();
    }

    public bjx(muz muzVar, Scheduler scheduler, rb00 rb00Var, l0x0 l0x0Var, rvy0 rvy0Var) {
        this.a = (byte) 29;
        this.b = muzVar;
        this.c = scheduler;
        this.d = rb00Var;
        this.e = l0x0Var;
        this.f = rvy0Var;
        this.g = new vku();
    }

    public bjx(q8n q8nVar, cir0 cir0Var) {
        this.a = (byte) 23;
        this.b = q8nVar;
        dt71 dt71VarE = mgo1.e(0, 1, 2, 1);
        this.c = dt71VarE;
        this.d = d5p1.g(dt71VarE);
        this.g = cir0Var.h().a(i7w0.e, new wj1(this, (byte) 28));
    }

    public /* synthetic */ bjx(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    public bjx(g1s0 g1s0Var, i8h1 i8h1Var, pdl0 pdl0Var, xov0 xov0Var, lvc lvcVar) {
        this.a = (byte) 19;
        this.g = new CompositeDisposable();
        this.c = g1s0Var;
        this.d = i8h1Var;
        this.b = xov0Var;
        this.e = pdl0Var;
        this.f = lvcVar;
    }

    public bjx(x7e0 x7e0Var, z7e0 z7e0Var, q7r0 q7r0Var, u7r0 u7r0Var, Bundle bundle, iu30 iu30Var) {
        this.a = (byte) 11;
        this.d = z7e0Var;
        this.e = q7r0Var;
        this.f = u7r0Var;
        this.g = iu30Var;
        this.b = f4p1.g(x7e0Var);
        this.c = new w6e0(new vt1(z7e0Var, this, q7r0Var, u7r0Var, bundle, (byte) 23), new jgd0(this, (byte) 9));
    }

    public bjx(ConstraintLayout constraintLayout, AutodetectView autodetectView, EncoreButton encoreButton, ComposeView composeView, EncoreButton encoreButton2, DisconnectedView disconnectedView, ErrorView errorView, ProgressBar progressBar) {
        this.a = (byte) 22;
        this.b = autodetectView;
        this.c = encoreButton;
        this.d = encoreButton2;
        this.e = disconnectedView;
        this.f = errorView;
        this.g = progressBar;
    }

    public bjx(byte b) {
        this.a = b;
        switch (b) {
            case 9:
                this.b = new ConcurrentHashMap();
                this.c = new ConcurrentHashMap();
                this.d = ConcurrentHashMap.newKeySet();
                this.e = ConcurrentHashMap.newKeySet();
                this.f = new ConcurrentHashMap();
                this.g = new ConcurrentHashMap();
                break;
        }
    }

    public bjx(ea70 ea70Var, Integer num, bx40 bx40Var, String str, String str2, pc70 pc70Var) {
        this.a = (byte) 8;
        this.g = ea70Var;
        this.b = num;
        this.c = bx40Var;
        this.d = str;
        this.e = str2;
        this.f = pc70Var;
    }
}
