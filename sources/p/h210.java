package p;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import app.p000rive.core.CommandQueue;
import app.p000rive.core.SurfaceTextureSurface;
import com.spotify.mobius.MobiusLoop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h210 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h210(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                h210 h210Var = new h210((i210) obj2, lnmVar, (byte) 0);
                h210Var.b = obj;
                return h210Var;
            case 1:
                h210 h210Var2 = new h210((sp00) obj2, lnmVar, (byte) 1);
                h210Var2.b = obj;
                return h210Var2;
            case 2:
                return new h210((lk10) this.b, (iu30) obj2, lnmVar, (byte) 2);
            case 3:
                return new h210((cy10) this.b, (ven0) obj2, lnmVar, (byte) 3);
            case 4:
                return new h210((wv10) this.b, (ven0) obj2, lnmVar, (byte) 4);
            case 5:
                return new h210((y7e1) this.b, (nho0) obj2, lnmVar, (byte) 5);
            case 6:
                return new h210((vgr) this.b, (String) obj2, lnmVar, (byte) 6);
            case 7:
                return new h210((uz21) this.b, (df01) obj2, lnmVar, (byte) 7);
            case 8:
                return new h210((jwb0) this.b, (ven0) obj2, lnmVar, (byte) 8);
            case 9:
                return new h210((List) this.b, (ff20) obj2, lnmVar, (byte) 9);
            case 10:
                return new h210((ymd0) this.b, (q1d) obj2, lnmVar, (byte) 10);
            case 11:
                h210 h210Var3 = new h210((a630) obj2, lnmVar, (byte) 11);
                h210Var3.b = obj;
                return h210Var3;
            case 12:
                h210 h210Var4 = new h210((ul30) obj2, lnmVar, (byte) 12);
                h210Var4.b = obj;
                return h210Var4;
            case 13:
                return new h210((c9n) this.b, (is30) obj2, lnmVar, (byte) 13);
            case 14:
                return new h210((sz30) this.b, (u040) obj2, lnmVar, (byte) 14);
            case 15:
                return new h210((tz30) this.b, (u040) obj2, lnmVar, (byte) 15);
            case 16:
                return new h210((u040) this.b, (rz30) obj2, lnmVar, (byte) 16);
            case 17:
                return new h210((r140) this.b, (hdn0) obj2, lnmVar, (byte) 17);
            case 18:
                return new h210((View) this.b, (tnb1) obj2, lnmVar, (byte) 18);
            case 19:
                return new h210((wdm) this.b, (j840) obj2, lnmVar, (byte) 19);
            case 20:
                return new h210((wdm) this.b, (String) obj2, lnmVar, (byte) 20);
            case 21:
                return new h210((wdm) this.b, (f840) obj2, lnmVar, (byte) 21);
            case 22:
                return new h210((wdm) this.b, (h840) obj2, lnmVar, (byte) 22);
            case 23:
                return new h210((sp00) this.b, (String) obj2, lnmVar, (byte) 23);
            case 24:
                return new h210((pg40) this.b, (nmu0) obj2, lnmVar, (byte) 24);
            case 25:
                return new h210((tv80) this.b, (tdo) obj2, lnmVar, (byte) 25);
            case 26:
                return new h210((wz40) this.b, (slc0) obj2, lnmVar, (byte) 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new h210((Surface) this.b, (x550) obj2, lnmVar, (byte) 27);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new h210((ven0) this.b, (mjh) obj2, lnmVar, (byte) 28);
            default:
                return new h210((List) this.b, (qu50) obj2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((o710) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((p530) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((pp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
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
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) throws IOException {
        int i = 2;
        boolean zEquals = true;
        switch (this.a) {
            case 0:
                o710 o710Var = (o710) this.b;
                hm5.M(obj);
                boolean z = o710Var.c;
                m210 m210Var = o710Var.b;
                i210 i210Var = (i210) this.c;
                if (z) {
                    i210Var.a(m210Var);
                } else if (i210Var.h) {
                    c921.y(i210Var.e, (o8n) null, 0, new hl1(false, i210Var, m210Var, (lnm) null, (byte) 6), 3);
                } else {
                    i210Var.f.remove(m210Var);
                }
                return rih1.a;
            case 1:
                String str = (String) this.b;
                hm5.M(obj);
                sp00 sp00Var = (sp00) this.c;
                str.getClass();
                m210 m210Var2 = (m210) sp00Var.c;
                String str2 = m210Var2.d;
                String str3 = str2 == null ? "" : str2;
                String str4 = m210Var2.h;
                String str5 = str4 == null ? "" : str4;
                String str6 = m210Var2.g;
                String str7 = str6 == null ? "" : str6;
                String str8 = m210Var2.c;
                m210 m210Var3 = new m210("bluetooth", "", str8 == null ? "" : str8, str3, "", str, str7, str5, "", "", "");
                sp00Var.c = m210Var3;
                ((i210) sp00Var.d).a(m210Var3);
                return rih1.a;
            case 2:
                hm5.M(obj);
                if (((lk10) this.b).c != null) {
                    ((iu30) this.c).invoke(sj10.a);
                }
                return rih1.a;
            case 3:
                hm5.M(obj);
                ((ven0) this.c).setValue((cy10) this.b);
                return rih1.a;
            case 4:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.c;
                nho0 nho0Var = ((wv10) this.b).e;
                ven0Var.setValue(nho0Var != null ? nho0Var.a : null);
                return rih1.a;
            case 5:
                hm5.M(obj);
                y7e1 y7e1Var = (y7e1) this.b;
                String string = y7e1Var.d().d.toString();
                nho0 nho0Var2 = (nho0) this.c;
                if (!u890.j(string, nho0Var2.a)) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), nho0Var2.a);
                        y7e1Var.a(h4e1VarH);
                    } finally {
                        y7e1Var.c();
                    }
                }
                return rih1.a;
            case 6:
                hm5.M(obj);
                File file = new File(((Context) ((vgr) this.b).c).getCacheDir(), "log_dump_" + UUID.randomUUID() + ".txt");
                String str9 = (String) this.c;
                Charset charset = nne.a;
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    y520.K(fileOutputStream, str9, charset);
                    fileOutputStream.close();
                    return file;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(fileOutputStream, th);
                        throw th2;
                    }
                }
            case 7:
                hm5.M(obj);
                uz21 uz21Var = (uz21) this.b;
                df01 df01Var = (df01) this.c;
                try {
                    df01Var.B(uz21Var.d1());
                    df01Var.close();
                    uz21Var.close();
                    return rih1.a;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        u890.p(uz21Var, th3);
                        throw th4;
                    }
                }
            case 8:
                hm5.M(obj);
                ven0 ven0Var2 = (ven0) this.c;
                jwb0 jwb0Var = (jwb0) this.b;
                bby bbyVar = xd20.a;
                ven0Var2.setValue(jwb0Var);
                return rih1.a;
            case 9:
                bf20 bf20Var = ((ff20) this.c).a;
                hm5.M(obj);
                List list = (List) this.b;
                list.getClass();
                List<xe20> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xe20) it.next()).a);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("DELETE FROM liked_songs_filter_tags_entity WHERE id NOT IN (");
                anm1.h(arrayList.size(), sb);
                sb.append(")");
                qyo1.x(bf20Var.a, false, true, new cpk(sb.toString(), arrayList));
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                for (xe20 xe20Var : list2) {
                    arrayList2.add(new ye20(xe20Var.c, xe20Var.a, xe20Var.b, xe20Var.d));
                }
                qyo1.x(bf20Var.a, false, true, new af20(bf20Var, arrayList2, (byte) 0));
                return rih1.a;
            case 10:
                hm5.M(obj);
                ((ymd0) this.b).g((q1d) this.c);
                return rih1.a;
            case 11:
                p530 p530Var = (p530) this.b;
                hm5.M(obj);
                q4u q4uVar = ((a630) this.c).X0;
                if (q4uVar != null) {
                    q4uVar.a(p530Var);
                    return rih1.a;
                }
                u890.C("followFeedModelDiffuser");
                throw null;
            case 12:
                pp90 pp90Var = (pp90) this.b;
                hm5.M(obj);
                ul30 ul30Var = (ul30) this.c;
                String str10 = pp90Var != null ? pp90Var.a : null;
                synchronized (ul30Var) {
                    try {
                        String str11 = ul30Var.f;
                        if (str11 != null) {
                            zEquals = str10 == null ? false : str11.equals(str10);
                        } else if (str10 == null) {
                        }
                        if (!zEquals) {
                            synchronized (ul30Var) {
                                try {
                                    MobiusLoop mobiusLoop = ul30Var.e;
                                    if (mobiusLoop != null) {
                                        mobiusLoop.dispose();
                                    }
                                    ul30Var.e = null;
                                    ul30Var.f = null;
                                    if (str10 != null) {
                                        ul30Var.f = str10;
                                        ul30Var.e = ((wl30) ul30Var.a.get()).a().g(new zl30((ozh1) null, false));
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return rih1.a;
            case 13:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                is30 is30Var = (is30) this.c;
                fn31.T(c9nVar, is30Var.i, 0, new j020(is30Var, (lnm) null, (byte) 12), 2);
                return rih1.a;
            case 14:
                hm5.M(obj);
                sz30 sz30Var = (sz30) this.b;
                xh71.b(((u040) this.c).c, new wa71(sz30Var.e, (String) null, mqo1.G(sqg0.J(new mmr0[]{new mmr0("challenge_id", sz30Var.c), new mmr0("fallback", "getapp")})), (dqi1) null, sz30Var.f, (String) null, (Bundle) null, 106), mno1.h(new mmr0[]{new mmr0("music_quiz.share.completion_id", sz30Var.d)}), new vm71("music-quiz-challenge"), sz30Var.g, (List) null, 16);
                return rih1.a;
            case 15:
                kt91 kt91Var = ((u040) this.c).b;
                hm5.M(obj);
                int i2 = ((tz30) this.b).c;
                n57.k(i2 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i2), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1.a;
            case 16:
                hm5.M(obj);
                ((u040) this.b).d.f(new dwn0(((rz30) this.c).c, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                return rih1.a;
            case 17:
                hm5.M(obj);
                ((hdn0) this.c).t(((r140) this.b).d);
                return rih1.a;
            case 18:
                hm5.M(obj);
                ((View) this.b).setVisibility(((tnb1) this.c).f ? 0 : 8);
                return rih1.a;
            case 19:
                hm5.M(obj);
                ((kt91) ((wdm) this.b).f).k(new er91((fs91) null, ((j840) this.c).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 20:
                hm5.M(obj);
                ((i1r0) ((wdm) this.b).d).a((String) this.c);
                return rih1.a;
            case 21:
                hm5.M(obj);
                t740 t740Var = (t740) ((wdm) this.b).c;
                f840 f840Var = (f840) this.c;
                String str12 = f840Var.a;
                String str13 = f840Var.b;
                t740.b(t740Var, str12, str13.length() == 0 ? null : str13, (tv80) null, (String) null, 28);
                return rih1.a;
            case 22:
                hm5.M(obj);
                x1i1 x1i1Var = (x1i1) ((wdm) this.b).Y;
                h840 h840Var = (h840) this.c;
                String str14 = h840Var.a;
                int iC = l1d.C(h840Var.b);
                if (iC == 0) {
                    i = 1;
                } else if (iC != 1) {
                    eg.o();
                    return null;
                }
                x1i1.a(x1i1Var, new z740(i, str14, "play"), 6);
                return rih1.a;
            case 23:
                hm5.M(obj);
                sp00 sp00Var2 = (sp00) this.b;
                ((q7r0) sp00Var2.e).d.c.getLifecycle().a(new zh0(sp00Var2, (String) this.c, (byte) 7));
                return rih1.a;
            case 24:
                hm5.M(obj);
                a1r0 a1r0Var = ((pg40) this.b).b;
                pqr0 pqr0Var = new pqr0((nmu0) this.c);
                Bundle bundle = new Bundle();
                bundle.putParcelable("generation_mode_initial", pqr0Var);
                a1r0.j(a1r0Var, "spotify:internal:magpie:update-generation-mode", (String) null, bundle, false, 10);
                return rih1.a;
            case 25:
                hm5.M(obj);
                String strT = pro1.t("downloadOver3g");
                tv80 tv80Var = (tv80) this.b;
                dwn0 dwn0Var = new dwn0(strT, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null);
                tdo tdoVar = (tdo) this.c;
                tdoVar.a.f(dwn0Var);
                tdoVar.b.a(ixb.c);
                return rih1.a;
            case 26:
                hm5.M(obj);
                ((z0s0) ((wz40) this.b).d.get()).c((slc0) this.c);
                return rih1.a;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                x550 x550Var = (x550) this.c;
                hm5.M(obj);
                yzu yzuVar = new yzu();
                yzuVar.a = EGL14.EGL_NO_DISPLAY;
                yzuVar.b = EGL14.EGL_NO_CONTEXT;
                yzuVar.c = EGL14.EGL_NO_SURFACE;
                Surface surface = (Surface) this.b;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                yzuVar.a = eGLDisplayEglGetDisplay;
                if (eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    eg.m("eglGetDisplay failed");
                    return null;
                }
                int[] iArr = new int[2];
                if (!EGL14.eglInitialize((EGLDisplay) yzuVar.a, iArr, 0, iArr, 1)) {
                    eg.m("eglInitialize failed");
                    return null;
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                if (!EGL14.eglChooseConfig((EGLDisplay) yzuVar.a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                    eg.m("eglChooseConfig failed");
                    return null;
                }
                if (iArr2[0] <= 0) {
                    eg.m("No EGL config found with EGL_RECORDABLE_ANDROID");
                    return null;
                }
                EGLConfig eGLConfig = eGLConfigArr[0];
                eGLConfig.getClass();
                yzuVar.d = eGLConfig;
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) yzuVar.a, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                yzuVar.b = eGLContextEglCreateContext;
                if (eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
                    eg.m("eglCreateContext failed");
                    return null;
                }
                EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface((EGLDisplay) yzuVar.a, (EGLConfig) yzuVar.d, surface, new int[]{12344}, 0);
                yzuVar.c = eGLSurfaceEglCreateWindowSurface;
                if (eGLSurfaceEglCreateWindowSurface.equals(EGL14.EGL_NO_SURFACE)) {
                    eg.m("eglCreateWindowSurface failed");
                    return null;
                }
                yzuVar.D();
                x550Var.j = yzuVar;
                int[] iArr3 = new int[1];
                GLES20.glGenTextures(1, iArr3, 0);
                int i3 = iArr3[0];
                x550Var.n = i3;
                GLES20.glBindTexture(36197, i3);
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                GLES20.glBindTexture(36197, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(x550Var.n);
                surfaceTexture.setDefaultBufferSize(x550Var.o, x550Var.p);
                surfaceTexture.setOnFrameAvailableListener(new v550(x550Var, (byte) 0), x550Var.r);
                x550Var.l = surfaceTexture;
                efe1 efe1Var = new efe1();
                FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                floatBufferPut.position(0);
                efe1Var.f = floatBufferPut;
                FloatBuffer floatBufferPut2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
                floatBufferPut2.position(0);
                efe1Var.g = floatBufferPut2;
                int iA = efe1.a(35633, "\n      attribute vec4 aPosition;\n      attribute vec2 aTexCoord;\n      uniform mat4 uTexMatrix;\n      varying vec2 vTexCoord;\n      void main() {\n        gl_Position = aPosition;\n        vTexCoord = (uTexMatrix * vec4(aTexCoord, 0.0, 1.0)).xy;\n      }\n    ");
                int iA2 = efe1.a(35632, "\n      #extension GL_OES_EGL_image_external : require\n      precision mediump float;\n      uniform samplerExternalOES uTexture;\n      varying vec2 vTexCoord;\n      void main() {\n        gl_FragColor = texture2D(uTexture, vTexCoord);\n      }\n    ");
                int iGlCreateProgram = GLES20.glCreateProgram();
                efe1Var.a = iGlCreateProgram;
                GLES20.glAttachShader(iGlCreateProgram, iA);
                GLES20.glAttachShader(efe1Var.a, iA2);
                GLES20.glLinkProgram(efe1Var.a);
                int[] iArr4 = new int[1];
                GLES20.glGetProgramiv(efe1Var.a, 35714, iArr4, 0);
                int i4 = iArr4[0];
                int i5 = efe1Var.a;
                if (i4 != 1) {
                    String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(i5);
                    GLES20.glDeleteProgram(efe1Var.a);
                    bhn0.g(strGlGetProgramInfoLog, "Program link failed: ");
                    return null;
                }
                efe1Var.b = GLES20.glGetAttribLocation(i5, "aPosition");
                efe1Var.c = GLES20.glGetAttribLocation(efe1Var.a, "aTexCoord");
                efe1Var.d = GLES20.glGetUniformLocation(efe1Var.a, "uTexMatrix");
                efe1Var.e = GLES20.glGetUniformLocation(efe1Var.a, "uTexture");
                GLES20.glDeleteShader(iA);
                GLES20.glDeleteShader(iA2);
                x550Var.k = efe1Var;
                CommandQueue commandQueue = x550Var.c;
                commandQueue.getClass();
                x550Var.m = commandQueue.createRiveSurface(new SurfaceTextureSurface(surfaceTexture, x550Var.o, x550Var.p));
                return rih1.a;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) this.b;
                List list3 = (List) ven0Var3.getValue();
                mjh mjhVar = (mjh) this.c;
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    mjhVar.b.g((t480) it2.next());
                }
                ven0Var3.setValue(z6x.a);
                return rih1.a;
            default:
                hm5.M(obj);
                List list4 = (List) this.b;
                qu50 qu50Var = (qu50) this.c;
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    qu50Var.c.g((t480) it3.next());
                }
                list4.clear();
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h210(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }
}
