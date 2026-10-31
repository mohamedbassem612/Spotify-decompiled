package p;

import android.app.AlertDialog;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.initialization.app.EarlyInitializationProvider;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n3s extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3s(dh30 dh30Var, rey reyVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.b = dh30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new n3s(obj2, lnmVar, (byte) 0);
            case 1:
                return new n3s(obj2, lnmVar, (byte) 1);
            case 2:
                return new n3s(obj2, lnmVar, (byte) 2);
            case 3:
                return new n3s(obj2, lnmVar, (byte) 3);
            case 4:
                return new n3s(obj2, lnmVar, (byte) 4);
            case 5:
                return new n3s(obj2, lnmVar, (byte) 5);
            case 6:
                return new n3s(obj2, lnmVar, (byte) 6);
            case 7:
                return new n3s(obj2, lnmVar, (byte) 7);
            case 8:
                return new n3s(obj2, lnmVar, (byte) 8);
            case 9:
                return new n3s(obj2, lnmVar, (byte) 9);
            case 10:
                return new n3s(obj2, lnmVar, (byte) 10);
            case 11:
                return new n3s((dh30) obj2, (rey) null, lnmVar);
            case 12:
                return new n3s(obj2, lnmVar, (byte) 12);
            case 13:
                return new n3s(obj2, lnmVar, (byte) 13);
            case 14:
                return new n3s(obj2, lnmVar, (byte) 14);
            case 15:
                return new n3s(obj2, lnmVar, (byte) 15);
            case 16:
                return new n3s(obj2, lnmVar, (byte) 16);
            case 17:
                return new n3s(obj2, lnmVar, (byte) 17);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new n3s(obj2, lnmVar, (byte) 18);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new n3s(obj2, lnmVar, (byte) 19);
            case 20:
                return new n3s(obj2, lnmVar, (byte) 20);
            case 21:
                return new n3s(obj2, lnmVar, (byte) 21);
            case 22:
                return new n3s(obj2, lnmVar, (byte) 22);
            case 23:
                return new n3s(obj2, lnmVar, (byte) 23);
            case 24:
                return new n3s(obj2, lnmVar, (byte) 24);
            case 25:
                return new n3s(obj2, lnmVar, (byte) 25);
            case 26:
                return new n3s(obj2, lnmVar, (byte) 26);
            case 27:
                return new n3s(obj2, lnmVar, (byte) 27);
            case 28:
                return new n3s(obj2, lnmVar, (byte) 28);
            default:
                return new n3s(obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((iwo0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        uz21 uz21Var;
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((o3s) obj2).c.l();
                return rih1Var;
            case 1:
                hm5.M(obj);
                ((p7s) obj2).c();
                owh0.h(2);
                return rih1Var;
            case 2:
                hm5.M(obj);
                Iterator it = ((e4t) obj2).d.iterator();
                while (it.hasNext()) {
                    ((ynb0) it.next()).get();
                }
                return rih1Var;
            case 3:
                hm5.M(obj);
                kt91 kt91Var = ((t6t) obj2).d;
                if (kt91Var.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958526});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var.k(new er91((fs91) null, "", 2131958526, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                ((p9t) obj2).a.e();
                return rih1Var;
            case 5:
                hm5.M(obj);
                fut futVar = (fut) obj2;
                futVar.c.a(Collections.singleton(gut.a));
                l4p1.u(futVar.f, new fu20(futVar.b.a(), new eum(futVar, (lnm) null, (byte) 29), (byte) 1));
                return rih1Var;
            case 6:
                hm5.M(obj);
                pw40 pw40VarB = ((mw40) obj2).b();
                pw40VarB.b();
                return pw40VarB;
            case 7:
                hm5.M(obj);
                AlertDialog alertDialogCreate = ((AlertDialog.Builder) obj2).create();
                alertDialogCreate.show();
                return alertDialogCreate;
            case 8:
                hm5.M(obj);
                ((los) ((gmt) obj2).b).a(ixb.c);
                return rih1Var;
            case 9:
                hm5.M(obj);
                EarlyInitializationProvider earlyInitializationProvider = (EarlyInitializationProvider) obj2;
                tif1 tif1Var = earlyInitializationProvider.b;
                try {
                    tif1Var.e(2, "early_init_provider_oncreate_subscribe_to_zero", "cst");
                    ynb0 ynb0Var = earlyInitializationProvider.c;
                    if (ynb0Var == null) {
                        u890.C("zeroScopeLazy");
                        throw null;
                    }
                    ((xm41) ynb0Var.get()).e(xzu.i, jkv.P0);
                    tif1Var.f("early_init_provider_oncreate_subscribe_to_zero", "cst");
                    p2p p2pVar = earlyInitializationProvider.a;
                    if (p2pVar == null) {
                        u890.C("scopeCoordinator");
                        throw null;
                    }
                    en41 en41Var = (en41) p2pVar.get();
                    vkv vkvVar = (vkv) en41Var.a.getValue();
                    Iterator it2 = vkvVar.a.iterator();
                    while (it2.hasNext()) {
                        vkvVar.b.a(eth.X((xm41) it2.next()).subscribe());
                    }
                    hd61 hd61Var = (hd61) en41Var.b.getValue();
                    ((xm41) hd61Var.a.get()).e(new ggx0(0, hd61Var, hd61.class, "disableNestedControllers", "disableNestedControllers()V", 0, (byte) 24), new d061(1, hd61Var, hd61.class, "enableNestedControllers", "enableNestedControllers(Lcom/spotify/app/music/scopes/configuredbackground/ConfiguredBackgroundContext;)V", 0, (byte) 1));
                    return rih1Var;
                } catch (Throwable th) {
                    tif1Var.f("early_init_provider_oncreate_subscribe_to_zero", "cst");
                    throw th;
                }
            case 10:
                hm5.M(obj);
                mtf mtfVar = (mtf) obj2;
                switch (mtfVar.a) {
                    case 0:
                        ((ssw0) mtfVar.b).l(ltf.a);
                        return rih1Var;
                    default:
                        ((PublishProcessor) mtfVar.b).onNext(kc30.a);
                        return rih1Var;
                }
            case 11:
                hm5.M(obj);
                throw null;
            case 12:
                hm5.M(obj);
                ((f800) obj2).a.e();
                return rih1Var;
            case 13:
                hm5.M(obj);
                lzn0 lzn0Var = ((yrg) obj2).a;
                lzn0Var.e();
                lzn0Var.h("spotify:activitycenter");
                return rih1Var;
            case 14:
                hm5.M(obj);
                ry21 ry21Var = ((ry21) obj2).i;
                if (ry21Var == null || (uz21Var = ry21Var.g) == null) {
                    return null;
                }
                return uz21Var.f();
            case 15:
                hm5.M(obj);
                return ((ff20) obj2).b();
            case 16:
                hm5.M(obj);
                ((ser) ((kp00) obj2).b).a((String) null, nik1.B5.a, (Bundle) null);
                return rih1Var;
            case 17:
                hm5.M(obj);
                r091 r091Var = ((cz30) obj2).d;
                if (r091Var == null) {
                    return null;
                }
                r091Var.j();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                hm5.M(obj);
                ((q240) obj2).c.e();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                ((Function0) ((u540) obj2).e.c).invoke();
                return rih1Var;
            case 20:
                hm5.M(obj);
                kt91 kt91Var2 = (kt91) ((wdm) obj2).f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131959378});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", 2131959378, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 21:
                hm5.M(obj);
                x550 x550Var = (x550) obj2;
                SurfaceTexture surfaceTexture = x550Var.l;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                x550Var.l = null;
                if (x550Var.n != 0) {
                    yzu yzuVar = x550Var.j;
                    if (yzuVar != null) {
                        yzuVar.D();
                    }
                    GLES20.glDeleteTextures(1, new int[]{x550Var.n}, 0);
                    x550Var.n = 0;
                }
                efe1 efe1Var = x550Var.k;
                if (efe1Var != null && (i = efe1Var.a) != 0) {
                    GLES20.glDeleteProgram(i);
                    efe1Var.a = 0;
                }
                x550Var.k = null;
                yzu yzuVar2 = x550Var.j;
                if (yzuVar2 != null) {
                    if (!u890.j((EGLDisplay) yzuVar2.a, EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay = (EGLDisplay) yzuVar2.a;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                        if (!u890.j((EGLSurface) yzuVar2.c, EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface((EGLDisplay) yzuVar2.a, (EGLSurface) yzuVar2.c);
                        }
                        if (!u890.j((EGLContext) yzuVar2.b, EGL14.EGL_NO_CONTEXT)) {
                            EGL14.eglDestroyContext((EGLDisplay) yzuVar2.a, (EGLContext) yzuVar2.b);
                        }
                        EGL14.eglTerminate((EGLDisplay) yzuVar2.a);
                    }
                    yzuVar2.a = EGL14.EGL_NO_DISPLAY;
                    yzuVar2.b = EGL14.EGL_NO_CONTEXT;
                    yzuVar2.c = EGL14.EGL_NO_SURFACE;
                    yzuVar2.d = null;
                }
                x550Var.j = null;
                return rih1Var;
            case 22:
                hm5.M(obj);
                sp00 sp00Var = (sp00) obj2;
                sp00Var.n().f(((wqk0) sp00Var.d).e(), (Set) null);
                return rih1Var;
            case 23:
                hm5.M(obj);
                nb50 nb50Var = (nb50) obj2;
                ((i8h1) nb50Var.a.get()).f(nb50Var.c.e(), (Set) null);
                return rih1Var;
            case 24:
                hm5.M(obj);
                ((xv60) obj2).X.i();
                return rih1Var;
            case 25:
                hm5.M(obj);
                av7 av7Var = (av7) obj2;
                Integer num = (Integer) ((Function0) av7Var.c).invoke();
                char c = '?';
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue == 100) {
                        c = 'F';
                    } else if (iIntValue == 125) {
                        c = 'G';
                    } else if (iIntValue == 200) {
                        c = 'V';
                    } else if (iIntValue == 230) {
                        c = 'P';
                    } else if (iIntValue == 300) {
                        c = 'S';
                    } else if (iIntValue == 325) {
                        c = 'T';
                    } else if (iIntValue == 350) {
                        c = 'H';
                    } else if (iIntValue == 400) {
                        c = 'C';
                    } else if (iIntValue == 1000) {
                        c = 'X';
                    }
                }
                Character ch = (Character) av7Var.g;
                if (ch == null || c != ch.charValue()) {
                    av7Var.g = new Character(c);
                    ((nrw0) av7Var.d).invoke(new Character(c));
                }
                return rih1Var;
            case 26:
                hm5.M(obj);
                return ((ie90) obj2).a();
            case 27:
                hm5.M(obj);
                ((y2a0) obj2).a((String) null);
                return rih1Var;
            case 28:
                hm5.M(obj);
                haa0 haa0Var = ((zgb0) obj2).h;
                ((i8h1) ((kly0) haa0Var.b).get()).f(((tnl0) haa0Var.d).e(), (Set) null);
                return rih1Var;
            default:
                hm5.M(obj);
                kt91 kt91Var3 = ((bxb0) obj2).d;
                if (kt91Var3.g()) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958541});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    kt91Var3.k(new er91((fs91) null, "", 2131958541, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3s(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
    }
}
