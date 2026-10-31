package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.navigation.model.Maneuver;
import androidx.emoji2.emojipicker.EmojiView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.a;
import app.p000rive.semantics.SemanticState;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e0i implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0i(ej30 ej30Var, View view, Rect rect) {
        this.a = (byte) 12;
        this.b = view;
        this.c = rect;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        k2t k2tVar;
        CharSequence charSequence;
        int i;
        long j;
        boolean z;
        byte b = 2;
        int iQ0 = -1;
        Drawable drawable = null;
        long j2 = -9223372036854775807L;
        byte b2 = 1;
        boolean zEquals = false;
        Object[] objArr = 0;
        switch (this.a) {
            case 0:
                g0i g0iVar = (g0i) this.b;
                r1q0 r1q0Var = (r1q0) this.c;
                int i2 = g0i.T0;
                ((f0i) g0iVar).a.a(new zzh(r1q0Var, g0iVar, objArr == true ? 1 : 0));
                return;
            case 1:
                aqq0 aqq0Var = (aqq0) this.b;
                lly0 lly0Var = (lly0) this.c;
                if (aqq0Var.b != aqq0.d) {
                    eg.m("provide() can be called only once.");
                    return;
                }
                synchronized (aqq0Var) {
                    k2tVar = aqq0Var.a;
                    aqq0Var.a = null;
                    aqq0Var.b = lly0Var;
                    break;
                }
                k2tVar.b(lly0Var);
                return;
            case 2:
                kub0 kub0Var = (kub0) this.b;
                lly0 lly0Var2 = (lly0) this.c;
                synchronized (kub0Var) {
                    try {
                        if (kub0Var.b == null) {
                            kub0Var.a.add(lly0Var2);
                        } else {
                            kub0Var.b.add(lly0Var2.get());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 3:
                ((v1k) this.b).i((q8l) this.c);
                return;
            case 4:
                List<daa> list = (List) this.b;
                til tilVar = (til) this.c;
                for (daa daaVar : list) {
                    Object obj = tilVar.e;
                    eaa eaaVar = daaVar.a;
                    daaVar.b.c().l(eaaVar.e(obj) ? new njl(eaaVar.d()) : mjl.a);
                }
                return;
            case 5:
                ((jhn) this.b).b((String) this.c, Boolean.FALSE);
                return;
            case 6:
                ohn ohnVar = (ohn) this.b;
                Throwable th2 = (Throwable) this.c;
                jhn jhnVar = ohnVar.h;
                Thread threadCurrentThread = Thread.currentThread();
                jhnVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                cjn cjnVar = jhnVar.n;
                if (cjnVar == null || !cjnVar.e.get()) {
                    long j3 = jCurrentTimeMillis / 1000;
                    String strE = jhnVar.e();
                    if (strE == null) {
                        return;
                    }
                    bh61 bh61Var = jhnVar.m;
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    bh61Var.j(th2, threadCurrentThread, strE, "error", j3, false);
                    return;
                }
                return;
            case 7:
                ohn ohnVar2 = (ohn) this.b;
                String str = (String) this.c;
                mxa1 mxa1Var = ohnVar2.h.d;
                String strA = ava0.a(SemanticState.ReadOnly, str);
                synchronized (((AtomicMarkableReference) mxa1Var.h)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) mxa1Var.h).getReference();
                        if (strA != null) {
                            zEquals = strA.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) mxa1Var.h).set(strA, true);
                        ((djn) ((uo5) mxa1Var.d).c).a(new v241(mxa1Var, (byte) 17));
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            case 8:
                ohn ohnVar3 = (ohn) this.b;
                Map map = (Map) this.c;
                wh41 wh41Var = (wh41) ohnVar3.h.d.e;
                synchronized (wh41Var) {
                    ((ava0) ((AtomicMarkableReference) wh41Var.c).getReference()).c(map);
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) wh41Var.c;
                    atomicMarkableReference.set((ava0) atomicMarkableReference.getReference(), true);
                    break;
                }
                wh41Var.i();
                return;
            case 9:
                bwr bwrVar = (bwr) this.b;
                ie30 ie30Var = (ie30) this.c;
                cwr cwrVar = bwrVar.d;
                if (cwrVar.f29p == 0 || bwrVar.c) {
                    return;
                }
                Looper looper = cwrVar.t;
                looper.getClass();
                bwrVar.b = cwrVar.a(looper, bwrVar.a, ie30Var, false);
                cwrVar.n.add(bwrVar);
                return;
            case 10:
                f1s f1sVar = (f1s) this.b;
                Uri uri = (Uri) this.c;
                f1sVar.t = false;
                if (f1sVar.a.equals(f1sVar.Z.R0) || f1sVar.Y) {
                    f1sVar.b(uri);
                    return;
                }
                return;
            case 11:
                foa1 foa1Var = (foa1) this.b;
                foa1 foa1Var2 = (foa1) this.c;
                zf30 zf30Var = foa1Var.c;
                zf30 zf30Var2 = foa1Var2.c;
                cj30 cj30Var = xi30.a;
                return;
            case 12:
                ej30.j((Rect) this.c, (View) this.b);
                return;
            case 13:
                iss issVar = (iss) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                Iterator it = issVar.c.iterator();
                while (it.hasNext()) {
                    foa1 foa1Var3 = (foa1) ((jss) it.next()).b;
                    View view = foa1Var3.c.j1;
                    if (view != null) {
                        cy30.a(foa1Var3.a, view, viewGroup);
                    }
                }
                return;
            case 14:
                rts rtsVar = (rts) this.b;
                d4d1 d4d1Var = (d4d1) this.c;
                Surface surfaceC = d4d1Var.c(rtsVar.c, new x4d(rtsVar, d4d1Var, b2));
                rtsVar.a.l(surfaceC);
                rtsVar.h.put(d4d1Var, surfaceC);
                return;
            case 15:
                final rts rtsVar2 = (rts) this.b;
                final j4d1 j4d1Var = (j4d1) this.c;
                rtsVar2.i++;
                xmm0 xmm0Var = rtsVar2.a;
                hy30.d((AtomicBoolean) xmm0Var.c, true);
                hy30.c((Thread) xmm0Var.e);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(xmm0Var.b);
                Size size = j4d1Var.b;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                js50 js50Var = rtsVar2.c;
                j4d1Var.b(js50Var, new uk4(rtsVar2, j4d1Var, (byte) 20));
                j4d1Var.a(surface, js50Var, new dkl() { // from class: p.pts
                    public final void accept(Object obj2) {
                        rts rtsVar3 = rtsVar2;
                        j4d1 j4d1Var2 = j4d1Var;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (j4d1Var2.a) {
                            j4d1Var2.m = null;
                            j4d1Var2.n = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        rtsVar3.i--;
                        rtsVar3.c();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(rtsVar2, rtsVar2.d);
                return;
            case 16:
                ((azs) this.b).h.e(((zys) this.c).b.B);
                return;
            case 17:
                ((a) ((iir) this.b).c).i.b((z1k1) this.c);
                return;
            case 18:
                Callable callable = (Callable) this.b;
                h9n h9nVar = (h9n) this.c;
                try {
                    h9nVar.b(callable.call());
                    return;
                } catch (Exception e) {
                    h9nVar.c(e);
                    return;
                }
            case 19:
                fn31.T(((egu) this.b).e, null, 0, new mx((iu30) this.c, (lnm) null, (byte) 18), 3);
                return;
            case 20:
                ((dgu) this.b).e.l((iu30) this.c);
                return;
            case 21:
                qwu qwuVar = (qwu) this.b;
                IOException iOException = (IOException) this.c;
                mxr mxrVar = qwuVar.j;
                mxrVar.getClass();
                ((SingleEmitter) mxrVar.d).onError(iOException);
                qwuVar.e();
                return;
            case 22:
                ((mxr) this.c).A((qwu) this.b, false);
                return;
            case 23:
                final hev hevVar = (hev) this.b;
                j4d1 j4d1Var2 = (j4d1) this.c;
                hevVar.e++;
                fev fevVar = hevVar.a;
                boolean z2 = j4d1Var2.e;
                Size size2 = j4d1Var2.b;
                hy30.d((AtomicBoolean) fevVar.c, true);
                hy30.c((Thread) fevVar.e);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z2 ? fevVar.n : fevVar.o);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                j4d1Var2.a(surface2, hevVar.c, new dkl() { // from class: p.gev
                    public final void accept(Object obj2) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        hev hevVar2 = hevVar;
                        hevVar2.e--;
                        hevVar2.c();
                    }
                });
                if (z2) {
                    hevVar.i = surfaceTexture2;
                    return;
                } else {
                    hevVar.t = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(hevVar, hevVar.d);
                    return;
                }
            case 24:
                hev hevVar2 = (hev) this.b;
                d4d1 d4d1Var2 = (d4d1) this.c;
                Surface surfaceC2 = d4d1Var2.c(hevVar2.c, new x4d(hevVar2, d4d1Var2, b));
                hevVar2.a.l(surfaceC2);
                hevVar2.h.put(d4d1Var2, surfaceC2);
                return;
            case 25:
                CharSequence charSequence2 = (CharSequence) this.b;
                EmojiView emojiView = (EmojiView) this.c;
                Bitmap bitmap = emojiView.c;
                if (charSequence2 == null) {
                    bitmap.eraseColor(0);
                    return;
                }
                if (charSequence2.equals(emojiView.emoji)) {
                    if (b5x.O0) {
                        a4x a4xVarA = a4x.a();
                        a4xVarA.getClass();
                        CharSequence charSequenceH = a4xVarA.h(0, charSequence2.length(), 0, charSequence2);
                        if (charSequenceH == null) {
                            charSequence = charSequence2;
                        } else {
                            charSequence = charSequenceH;
                        }
                    } else {
                        charSequence = charSequence2;
                    }
                    if (emojiView.willDrawVariantIndicator) {
                        LinkedHashMap linkedHashMap = uwg.Q0;
                        if (linkedHashMap == null) {
                            eg.m("BundledEmojiListLoader.load is not called or complete");
                            return;
                        }
                        b2 = linkedHashMap.containsKey(charSequence2) ? (byte) 1 : (byte) 0;
                    }
                    TextPaint textPaint = emojiView.b;
                    bitmap.eraseColor(0);
                    Canvas canvas = new Canvas(bitmap);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(spanned, 0, spanned.length(), textPaint, canvas.getWidth());
                        builderObtain.setAlignment(Layout.Alignment.ALIGN_CENTER);
                        builderObtain.setLineSpacing(0.0f, 1.0f);
                        builderObtain.setIncludePad(false);
                        builderObtain.build().draw(canvas);
                    } else {
                        canvas.drawText(charSequence, 0, charSequence.length(), (canvas.getWidth() - textPaint.measureText(charSequence, 0, charSequence.length())) / 2.0f, -textPaint.getFontMetrics().top, textPaint);
                    }
                    if (b2 != 0) {
                        Drawable drawable2 = emojiView.getContext().getDrawable(2131233994);
                        if (drawable2 != null) {
                            int width = canvas.getWidth();
                            int height = canvas.getHeight();
                            drawable2.setBounds(new Rect(width - emojiView.getContext().getResources().getDimensionPixelSize(2131167187), height - emojiView.getContext().getResources().getDimensionPixelSize(2131167186), width, height));
                            drawable = drawable2;
                        }
                        drawable.getClass();
                        drawable.draw(canvas);
                    }
                    emojiView.setContentDescription(emojiView.getContext().getString(2131955461, emojiView.emoji));
                }
                emojiView.invalidate();
                return;
            case 26:
                yo00 yo00Var = (yo00) this.b;
                fp00 fp00Var = (fp00) this.c;
                int i3 = yo00Var.J - fp00Var.b;
                yo00Var.J = i3;
                if (fp00Var.e) {
                    yo00Var.K = fp00Var.c;
                    yo00Var.L = true;
                }
                if (i3 == 0) {
                    sqe1 sqe1Var = ((o0u0) fp00Var.f).a;
                    if (!yo00Var.t0.a.p() && sqe1Var.p()) {
                        yo00Var.u0 = -1;
                        yo00Var.v0 = 0L;
                    }
                    if (!sqe1Var.p()) {
                        List listAsList = Arrays.asList(((uwu0) sqe1Var).k);
                        dm5.y(listAsList.size() == yo00Var.f177p.size());
                        for (int i4 = 0; i4 < listAsList.size(); i4++) {
                            ((uo00) yo00Var.f177p.get(i4)).c = (sqe1) listAsList.get(i4);
                        }
                    }
                    if (yo00Var.L) {
                        Object[] objArr2 = ((o0u0) fp00Var.f).a.p() && yo00Var.t0.a.p();
                        boolean zB = ((o0u0) fp00Var.f).b.b(yo00Var.t0.b);
                        Object[] objArr3 = ((o0u0) fp00Var.f).d == yo00Var.t0.s;
                        if (objArr2 != false || (zB && objArr3 != false)) {
                            b2 = 0;
                        }
                        if (b2 != 0) {
                            iQ0 = yo00Var.Q0();
                            if (sqe1Var.p() || ((o0u0) fp00Var.f).b.c()) {
                                j2 = ((o0u0) fp00Var.f).d;
                            } else {
                                o0u0 o0u0Var = (o0u0) fp00Var.f;
                                p2i0 p2i0Var = o0u0Var.b;
                                long j4 = o0u0Var.d;
                                Object obj2 = p2i0Var.a;
                                dqe1 dqe1Var = yo00Var.o;
                                sqe1Var.g(obj2, dqe1Var);
                                j2 = j4 + dqe1Var.e;
                            }
                        }
                        i = iQ0;
                        j = j2;
                        z = b2;
                    } else {
                        i = -1;
                        j = -9223372036854775807L;
                        z = 0;
                    }
                    yo00Var.L = false;
                    yo00Var.H1((o0u0) fp00Var.f, 1, z, yo00Var.K, j, i, false);
                    return;
                }
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                yjq yjqVar = (yjq) this.b;
                ((h9d0) yjqVar.c).h(-1, new nay(yjqVar, (zfg1) this.c));
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((cg20) this.b).j.a(VideoFrameProcessingException.a(-9223372036854775807L, (InterruptedException) this.c));
                return;
            default:
                ((cg20) this.b).j.a(VideoFrameProcessingException.a(-9223372036854775807L, (GlUtil.GlException) this.c));
                return;
        }
    }

    public /* synthetic */ e0i(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ e0i(foa1 foa1Var, foa1 foa1Var2, iss issVar) {
        this.a = (byte) 11;
        this.b = foa1Var;
        this.c = foa1Var2;
    }
}
