package p;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kse extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 2;
    public boolean b;
    public Object c;
    public /* synthetic */ Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(boolean z, Function0 function0, String str, Function0 function1, Function0 function2, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.e = function0;
        this.f = str;
        this.g = function1;
        this.h = function2;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.i = ven0Var3;
        this.t = ven0Var4;
        this.X = ven0Var5;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.X;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new kse((ven0) this.d, (nse) this.f, (View) obj2, (uhd1) this.h, lnmVar);
            case 1:
                return new kse(this.b, (Function0) this.e, (String) this.f, (Function0) this.g, (Function0) this.h, (ven0) this.c, (ven0) this.d, (ven0) this.i, (ven0) this.t, (ven0) obj2, lnmVar);
            default:
                kse kseVar = new kse((aje0) this.i, (Activity) this.t, (p811) obj2, lnmVar);
                kseVar.d = obj;
                return kseVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f A[Catch: all -> 0x0032, CancellationException -> 0x00df, TryCatch #0 {CancellationException -> 0x00df, blocks: (B:8:0x002e, B:19:0x0069, B:21:0x006f, B:22:0x0078, B:15:0x004f), top: B:94:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078 A[Catch: all -> 0x0032, CancellationException -> 0x00df, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00df, blocks: (B:8:0x002e, B:19:0x0069, B:21:0x006f, B:22:0x0078, B:15:0x004f), top: B:94:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    public final Object invokeSuspend(Object obj) {
        Object objI;
        ven0 ven0Var;
        nse nseVar;
        uhd1 uhd1Var;
        xse xseVar;
        tv80 tv80Var;
        p811 p811VarU;
        aje0 aje0Var;
        p811 p811Var;
        Throwable th;
        p811 p811Var2;
        p811 p811Var3;
        String m231Var;
        Bitmap bitmap;
        Bitmap bitmap2;
        boolean z;
        Object obj2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.X;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ven0 ven0Var2 = (ven0) this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        tv80Var = (tv80) this.t;
                        xseVar = (xse) this.i;
                        ven0Var = (ven0) this.c;
                        uhd1Var = (uhd1) this.g;
                        nseVar = (nse) this.e;
                        hm5.M(obj);
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                hm5.M(obj);
                mmr0 mmr0Var = (mmr0) ven0Var2.getValue();
                if (mmr0Var == null) {
                    return rih1Var;
                }
                nse nseVar2 = (nse) this.f;
                View view = (View) obj3;
                uhd1 uhd1Var2 = (uhd1) this.h;
                xse xseVar2 = (xse) mmr0Var.a;
                tv80 tv80Var2 = (tv80) mmr0Var.b;
                this.e = nseVar2;
                this.g = uhd1Var2;
                this.c = ven0Var2;
                this.i = xseVar2;
                this.t = tv80Var2;
                this.b = true;
                if (!((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0) || (objI = hap1.i(300L, this)) != d9nVar) {
                    objI = rih1Var;
                }
                if (objI == d9nVar) {
                    return d9nVar;
                }
                ven0Var = ven0Var2;
                nseVar = nseVar2;
                uhd1Var = uhd1Var2;
                xseVar = xseVar2;
                tv80Var = tv80Var2;
                String str = xseVar.d;
                mwn0 mwn0Var = nseVar.j;
                if (tv80Var != null) {
                    lsn0 lsn0Var = new lsn0(str, tv80Var.a);
                    mwn0Var.e(lsn0Var);
                    mwn0Var.f(lsn0Var);
                }
                uhd1 uhd1Var3 = (uhd1) uhd1Var.f.b;
                c380 c380Var = uhd1Var3.a;
                if (!c380Var.contains(xseVar)) {
                    bhn0.l("Tab '", xseVar, "' not in tab set: ", c380Var);
                    return null;
                }
                if (!xseVar.equals(uhd1Var3.c.getValue())) {
                    uhd1Var3.e = c380Var.indexOf(xseVar) < ((Number) uhd1Var3.d.getValue()).intValue() ? hm5.P(xay.n(1, d6d1.Z0), xay.r(1, d6d1.a1)) : hm5.P(xay.n(1, d6d1.b1), xay.r(1, d6d1.c1));
                    uhd1Var3.b.setValue(xseVar);
                }
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 1:
                ven0 ven0Var3 = (ven0) this.t;
                ven0 ven0Var4 = (ven0) this.i;
                String str2 = (String) this.f;
                ven0 ven0Var5 = (ven0) this.d;
                ven0 ven0Var6 = (ven0) this.c;
                hm5.M(obj);
                boolean z3 = this.b;
                if (z3 && n7h0.b(ven0Var6)) {
                    ven0Var5.setValue(Boolean.TRUE);
                    ((Function0) this.e).invoke();
                } else if (!z3) {
                    if (!u890.j((String) ven0Var4.getValue(), str2) && (((Boolean) ven0Var5.getValue()).booleanValue() || (n7h0.b(ven0Var6) && !u890.j(str2, (Object) null)))) {
                    }
                    ven0Var5.setValue(Boolean.FALSE);
                }
                ven0Var4.setValue(str2);
                return rih1Var;
            default:
                boolean z4 = this.b;
                try {
                    if (!z4) {
                        p811VarU = cy30.u(obj);
                        p811 p811Var4 = new p811();
                        aje0Var = (aje0) this.i;
                        Activity activity = (Activity) this.t;
                        p811 p811Var5 = (p811) obj3;
                        try {
                            this.d = null;
                            this.e = p811VarU;
                            this.f = p811Var4;
                            this.g = aje0Var;
                            this.h = p811Var5;
                            this.c = p811VarU;
                            this.b = true;
                            Object objC = aje0.c(activity, this);
                            if (objC == d9nVar) {
                                return d9nVar;
                            }
                            p811Var = p811Var4;
                            p811Var3 = p811Var5;
                            obj = objC;
                            p811Var2 = p811VarU;
                            p811VarU.a = obj;
                            obj2 = p811Var2.a;
                            if (obj2 == null) {
                                Logger.k("ScreenShotGrabber Failed to capture screenshot", new Object[0]);
                                m231Var = null;
                            } else {
                                Bitmap bitmap3 = (Bitmap) obj2;
                                aje0Var.getClass();
                                float fMax = 1000.0f / Math.max(bitmap3.getWidth(), bitmap3.getHeight());
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap3, (int) (bitmap3.getWidth() * fMax), (int) (bitmap3.getHeight() * fMax), true);
                                p811Var.a = bitmapCreateScaledBitmap;
                                File fileH = aje0Var.h(bitmapCreateScaledBitmap);
                                p811Var3.a = fileH;
                                m231Var = fileH.getAbsolutePath();
                            }
                            bitmap = (Bitmap) p811Var2.a;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            bitmap2 = (Bitmap) p811Var.a;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            z = m231Var instanceof m231;
                            if (z) {
                                Logger.e(e331.a(m231Var), "ScreenShotGrabber Screenshot capture failed", new Object[0]);
                            } else if (!z) {
                                return m231Var;
                            }
                        } catch (Throwable th2) {
                            p811Var = p811Var4;
                            th = th2;
                            p811Var2 = p811VarU;
                            m231Var = new m231(th);
                        }
                    } else if (z4) {
                        p811VarU = (p811) this.c;
                        p811Var3 = (p811) this.h;
                        aje0Var = (aje0) this.g;
                        p811Var = (p811) this.f;
                        p811Var2 = (p811) this.e;
                        try {
                            hm5.M(obj);
                            p811VarU.a = obj;
                            obj2 = p811Var2.a;
                            if (obj2 == null) {
                                Logger.k("ScreenShotGrabber Failed to capture screenshot", new Object[0]);
                                m231Var = null;
                            } else {
                                Bitmap bitmap4 = (Bitmap) obj2;
                                aje0Var.getClass();
                                float fMax2 = 1000.0f / Math.max(bitmap4.getWidth(), bitmap4.getHeight());
                                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmap4, (int) (bitmap4.getWidth() * fMax2), (int) (bitmap4.getHeight() * fMax2), true);
                                p811Var.a = bitmapCreateScaledBitmap2;
                                File fileH2 = aje0Var.h(bitmapCreateScaledBitmap2);
                                p811Var3.a = fileH2;
                                m231Var = fileH2.getAbsolutePath();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            m231Var = new m231(th);
                        }
                        bitmap = (Bitmap) p811Var2.a;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap2 = (Bitmap) p811Var.a;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        z = m231Var instanceof m231;
                        if (z) {
                            Logger.e(e331.a(m231Var), "ScreenShotGrabber Screenshot capture failed", new Object[0]);
                        } else if (!z) {
                            return m231Var;
                        }
                    } else {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                } catch (CancellationException e) {
                    throw e;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(ven0 ven0Var, nse nseVar, View view, uhd1 uhd1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = ven0Var;
        this.f = nseVar;
        this.X = view;
        this.h = uhd1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kse(aje0 aje0Var, Activity activity, p811 p811Var, lnm lnmVar) {
        super(2, lnmVar);
        this.i = aje0Var;
        this.t = activity;
        this.X = p811Var;
    }
}
