package p;

import android.net.NetworkRequest;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.messages.EventSenderStats2NonAuth;
import com.spotify.nowplaying.scroll.view.PeekScrollView;
import com.spotify.oopsplatform.appintegration.DiagnosticReportUploadWorker;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class y0u extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0u(Object obj, byte b) {
        super(0, obj, zh30.class, "connectFragmentLifecycle", "connectFragmentLifecycle()V", 0);
        this.a = b;
        switch (b) {
            case 29:
                super(0, obj, yrd0.class, "clickedHostTopBar", "clickedHostTopBar()V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0130  */
    /* JADX WARN: Code duplicated, block: B:36:0x0134 A[LOOP:0: B:25:0x0100->B:36:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee A[LOOP:4: B:75:0x01be->B:85:0x01ee, LOOP_END] */
    public final Object invoke() {
        Object value;
        jdo0 jdo0Var;
        byte b = this.a;
        w8c0 w8c0Var = w8c0.a;
        b7x b7xVar = b7x.a;
        p550 p550VarB = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                z1u z1uVar = (z1u) ((lyc) this).receiver;
                z1uVar.getClass();
                z1uVar.a.c("diagnostic-report-upload", 2, new ciq0(DiagnosticReportUploadWorker.class).f(new gjl(new e8o0((NetworkRequest) null), 3, false, false, true, true, -1L, -1L, o7h.p1(new LinkedHashSet()))).e(5L, TimeUnit.MINUTES).b());
                z1uVar.b.t("Enqueued diagnostic report upload work");
                return rih1Var;
            case 1:
                return Long.valueOf(((yqg) ((lyc) this).receiver).b());
            case 2:
                return (nfa0) ((kly0) ((lyc) this).receiver).get();
            case 3:
                return sqg0.U(((rol1) ((lyc) this).receiver).a);
            case 4:
                ((s061) ((lyc) this).receiver).b();
                return rih1Var;
            case 5:
                ((bow) ((lyc) this).receiver).getClass();
                if (u890.j(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                        eg.m("No EGL display");
                    } else {
                        int[] iArr = new int[2];
                        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                            eGLDisplayEglGetDisplay.getClass();
                            try {
                                aow aowVarA = bow.a(eGLDisplayEglGetDisplay, 64, new int[]{12440, 3, 12539, 2, 12344});
                                p550VarB = (aowVarA == null && (aowVarA = bow.a(eGLDisplayEglGetDisplay, 4, new int[]{12440, 2, 12344})) == null) ? p550.a : bow.b(eGLDisplayEglGetDisplay, aowVarA);
                            } finally {
                                EGL14.eglReleaseThread();
                            }
                        } else {
                            eg.m("Failed to initialize EGL");
                        }
                    }
                } else {
                    eg.m("An EGL context is already current on this thread");
                }
                return p550VarB;
            case 6:
                wvw wvwVar = (wvw) ((lyc) this).receiver;
                jut jutVar = wvwVar.c;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((h4l0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("otp_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                bpb1 bpb1Var = wvwVar.g;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, vvw.a((vvw) value, false, false, (uvw) null, kvw.a, 7)));
                return rih1Var;
            case 7:
                wvw wvwVar2 = (wvw) ((lyc) this).receiver;
                jut jutVar2 = wvwVar2.c;
                i8h1 i8h1Var2 = (i8h1) jutVar2.c;
                x6h1 x6h1VarC2 = ((h4l0) jutVar2.b).b.c();
                x6h1VarC2.i.add(new a7h1("otp_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                wvwVar2.W(new mhv0("email_otp", "otp", ew80.b, (String) null));
                return rih1Var;
            case 8:
                bhx bhxVar = (bhx) ((lyc) this).receiver;
                bhxVar.getClass();
                oqo1.i();
                if (bhxVar.e) {
                    fhx fhxVar = bhxVar.c;
                    if (fhxVar.e) {
                        fhxVar.f.invoke();
                        bhxVar.a();
                    }
                }
                return rih1Var;
            case 9:
                return (y0y) ((kly0) ((lyc) this).receiver).get();
            case 10:
                int[] iArr2 = new int[2];
                ConstraintLayout constraintLayout = ((y0y) ((lyc) this).receiver).E1;
                if (constraintLayout != null) {
                    constraintLayout.getLocationInWindow(iArr2);
                    return Integer.valueOf(iArr2[1]);
                }
                u890.C("playbackControlsContainer");
                throw null;
            case 11:
                ((PeekScrollView) ((lyc) this).receiver).o();
                return rih1Var;
            case 12:
                ((dqy) ((lyc) this).receiver).f.setValue(Boolean.TRUE);
                return rih1Var;
            case 13:
                return (d0r) ((ynb0) ((lyc) this).receiver).get();
            case 14:
                return (d0r) ((ynb0) ((lyc) this).receiver).get();
            case 15:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).U();
            case 16:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).Z();
            case 17:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).T();
            case 18:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).X();
            case 19:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).Y();
            case 20:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).S();
            case 21:
                return ((EventSenderStats2NonAuth) ((lyc) this).receiver).R();
            case 22:
                ((buc1) ((lyc) this).receiver).h.m((Object) null, Boolean.TRUE);
                return rih1Var;
            case 23:
                return Long.valueOf(((yqg) ((lyc) this).receiver).b());
            case 24:
                vy20 vy20Var = (vy20) ((lyc) this).receiver;
                oen0 oen0Var = vy20Var.c;
                oen0 oen0Var2 = vy20Var.d;
                dz20 dz20Var = vy20Var.a;
                d030 d030VarH = dz20Var.h();
                char c = 7;
                wz20 wz20Var = wz20.c;
                int i = 8;
                if (d030VarH == null) {
                    Object[] objArr = oen0Var2.b;
                    long[] jArr = oen0Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            int i3 = i2;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((ay20) objArr[(i3 << 3) + i5]).e0(wz20Var);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i2 = i3 + 1;
                                    }
                                }
                            } else if (i3 != length) {
                                i2 = i3 + 1;
                            }
                        }
                    }
                } else if (((pim0) d030VarH).N0) {
                    if (oen0Var.c(d030VarH)) {
                        d030VarH.M1();
                    }
                    wz20 wz20VarL1 = d030VarH.L1();
                    if (!((pim0) d030VarH).a.N0) {
                        qf80.c("visitAncestors called on an unattached node");
                    }
                    ay20 ay20Var = ((pim0) d030VarH).a;
                    hmb0 hmb0VarB = oap1.B(d030VarH);
                    int i6 = 0;
                    while (hmb0VarB != null) {
                        if ((((pim0) hmb0VarB.e1.g).d & 5120) != 0) {
                            while (ay20Var != null) {
                                int i7 = ((pim0) ay20Var).c;
                                char c2 = c;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((ay20Var instanceof ay20) && oen0Var2.c(ay20Var)) {
                                        if (i6 <= 1) {
                                            ay20Var.e0(wz20VarL1);
                                        } else {
                                            ay20Var.e0(wz20.b);
                                        }
                                        oen0Var2.l(ay20Var);
                                    }
                                }
                                ay20Var = ((pim0) ay20Var).e;
                                c = c2;
                            }
                        }
                        char c3 = c;
                        hmb0VarB = hmb0VarB.v();
                        ay20Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
                        c = c3;
                    }
                    char c4 = c;
                    Object[] objArr2 = oen0Var2.b;
                    long[] jArr2 = oen0Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            int i9 = i;
                            int i10 = i8;
                            if ((((~j2) << c4) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((ay20) objArr2[(i10 << 3) + i12]).e0(wz20Var);
                                    }
                                    j2 >>= i9;
                                }
                                if (i11 == i9) {
                                    if (i10 != length2) {
                                        i8 = i10 + 1;
                                        i = i9;
                                    }
                                }
                            } else if (i10 != length2) {
                                i8 = i10 + 1;
                                i = i9;
                            }
                        }
                    }
                }
                if (dz20Var.h() == null || dz20Var.c.L1() == wz20Var) {
                    dz20Var.e();
                }
                oen0Var.b();
                oen0Var2.b();
                vy20Var.e = false;
                return rih1Var;
            case 25:
                return Boolean.valueOf(d030.O1(((l030) ((lyc) this).receiver).V0));
            case 26:
                zh30 zh30Var = (zh30) ((lyc) this).receiver;
                if (zh30Var.h != w8c0Var) {
                    zh30Var.g = true;
                    zh30Var.f.a().i(zh30Var.h);
                }
                return rih1Var;
            case 27:
                zh30 zh30Var2 = (zh30) ((lyc) this).receiver;
                if (zh30Var2.h != w8c0Var) {
                    zh30Var2.g = true;
                    zh30Var2.f.a().i(zh30Var2.h);
                }
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                yrd0 yrd0Var = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var3 = yrd0Var.a;
                py9 py9Var = yrd0Var.c;
                x6h1 x6h1VarC3 = py9Var.c.c();
                x6h1VarC3.i.add(new a7h1("host_end_session_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop_hosting_social_listening_session", 1, b7xVar), x6h1VarC3.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            default:
                yrd0 yrd0Var2 = (yrd0) ((lyc) this).receiver;
                i8h1 i8h1Var4 = yrd0Var2.a;
                py9 py9Var2 = yrd0Var2.c;
                x6h1 x6h1VarC4 = py9Var2.c.c();
                x6h1VarC4.i.add(new a7h1("host_top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("join_social_listening_session", 1, b7xVar), x6h1VarC4.a(), py9Var2.b, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0u(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0u(vy20 vy20Var) {
        super(0, vy20Var, vy20.class, "invalidateNodes", "invalidateNodes()V", 0);
        this.a = (byte) 24;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0u(l030 l030Var) {
        super(0, l030Var, l030.class, "requestFocus", "requestFocus()Z", 0);
        this.a = (byte) 25;
    }
}
