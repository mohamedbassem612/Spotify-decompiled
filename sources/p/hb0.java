package p;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.audiorecognition.v1.AudioRecognitionRequest;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hb0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public hb0(c9n c9nVar, jb0 jb0Var) {
        this.a = (byte) 0;
        this.b = jb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(l0l l0lVar, lnm lnmVar) {
        gb0 gb0Var;
        m231 m231Var;
        if (lnmVar instanceof gb0) {
            gb0Var = (gb0) lnmVar;
            int i = gb0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb0Var.c = i - Integer.MIN_VALUE;
            } else {
                gb0Var = new gb0(this, lnmVar);
            }
        } else {
            gb0Var = new gb0(this, lnmVar);
        }
        Object obj = gb0Var.a;
        int i2 = gb0Var.c;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                jb0 jb0Var = (jb0) this.b;
                kfb0 kfb0Var = jb0Var.b;
                String strD = l0lVar.d();
                long jB = jb0Var.d.b();
                gb0Var.c = 1;
                Object objD = kfb0Var.d(jB, strD, gb0Var);
                d9n d9nVar = d9n.a;
                if (objD == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            Logger.d("DevicePredictability: Failed to save active device ID", new Object[]{thA});
        }
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0506  */
    public final Object emit(Object obj, lnm lnmVar) {
        p6r0 p6r0VarG1;
        FrameLayout frameLayout;
        g7a g7aVar;
        mmr0 mmr0Var;
        MessageResponseToken messageResponseToken;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return b((l0l) obj, lnmVar);
            case 1:
                ((ay0) obj2).f.l((px0) obj);
                return rih1Var;
            case 2:
                Function0 function0 = ((mj11) obj2).b;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 3:
                ta2 ta2Var = (ta2) obj2;
                int iOrdinal = ((oe2) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        ta2Var.a.e();
                    } else if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            ta2Var.a.e();
                        } else {
                            if (iOrdinal != 4) {
                                eg.o();
                                return null;
                            }
                            ta2Var.d = true;
                            xab1 xab1Var = ta2Var.e;
                            if (xab1Var != null) {
                                xab1Var.d((CancellationException) null);
                            }
                            ta2Var.e = null;
                        }
                    }
                }
                return rih1Var;
            case 4:
                oi2 oi2Var = (qi2) obj;
                ii2 ii2Var = (ii2) obj2;
                cbr0 cbr0Var = ii2Var.g;
                if (oi2Var instanceof oi2) {
                    ihv0 ihv0Var = ii2Var.f;
                    oi2 oi2Var2 = oi2Var;
                    int i = oi2Var2.a;
                    ihv0Var.a.a(new khv0((String) null, 1, sqg0.J(new mmr0[]{new mmr0("reason", kk0.A(i)), new mmr0("source", kk0.y(oi2Var2.b))}), "age_signal_blocked_page_shown"));
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        p6r0VarG1 = yon1.G1("AGE_SIGNAL_BLOCKED_CONFIRM_AGE", "age-signal/blocked/confirm-age", 131, "age-signal");
                    } else if (iC == 1) {
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        p6r0VarG1 = yon1.G1("AGE_SIGNAL_BLOCKED_ASK_PARENT", "age-signal/blocked/ask-parent", 130, "age-signal");
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                        p6r0VarG1 = yon1.G1("AGE_SIGNAL_BLOCKED_PARENT_SETUP", "age-signal/blocked/parent-setup", 132, "age-signal");
                    }
                    cbr0Var.a(new bn70(p6r0VarG1, li2.b, (nar0) null));
                } else {
                    if (!u890.j(oi2Var, ni2.a) && !u890.j(oi2Var, pi2.a)) {
                        eg.o();
                        return null;
                    }
                    cbr0Var.a(new q6b(2, false));
                    Object objA = ii2Var.c.a(lnmVar);
                    if (objA == d9nVar) {
                        return objA;
                    }
                }
                return rih1Var;
            case 5:
                Object objB = i3j0.b((i3j0) ((ui2) obj2).b.b, li2.b.a, f3j0.a, (Bundle) null, lnmVar, 20);
                if (objB != d9nVar) {
                    objB = rih1Var;
                }
                return objB == d9nVar ? objB : rih1Var;
            case 6:
                jre jreVar = (jre) obj;
                qu2 qu2Var = (qu2) obj2;
                if (jreVar instanceof fre) {
                    qu2Var.e();
                } else {
                    if (!(jreVar instanceof ire) && !(jreVar instanceof dre) && !(jreVar instanceof ere) && !(jreVar instanceof gre) && !(jreVar instanceof hre)) {
                        eg.o();
                        return null;
                    }
                    ((yo2) ((ynb0) qu2Var.d).get()).A(true);
                    ComposeView composeView = (ComposeView) qu2Var.g;
                    if ((composeView != null ? composeView.getParent() : null) == null && (frameLayout = (FrameLayout) ((gj5) qu2Var.c).findViewById(R.id.content)) != null) {
                        View composeView2 = new ComposeView((gj5) qu2Var.c, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                        composeView2.setViewCompositionStrategy(p5x0.W0);
                        composeView2.setContent(new j2i(83245288, new nu2(qu2Var, (byte) 2), true));
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.gravity = 80;
                        frameLayout.addView(composeView2, layoutParams);
                        qu2Var.g = composeView2;
                    }
                }
                return rih1Var;
            case 7:
                ((id3) obj2).k.l((gd3) obj);
                return rih1Var;
            case 8:
                oj80 oj80Var = (oj80) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    gg.Q(oj80Var.d(), (View) oj80Var.b);
                }
                return rih1Var;
            case 9:
                ((xid) obj2).t();
                return rih1Var;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((vw5) obj2).Z.m((Object) null, bool);
                return rih1Var;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                bpb1 bpb1Var = ((vb6) obj2).S0;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool2);
                return rih1Var;
            case 12:
                jx11 jx11Var = (jx11) obj;
                yu3 yu3Var = (yu3) obj2;
                cbr0 cbr0Var2 = (cbr0) yu3Var.b;
                bn70 bn70VarA = cbr0Var2.b0(bn70.class).a();
                if (bn70VarA != null) {
                    String strC = jx11Var.c((String) ((em0) yu3Var.c).b);
                    kik1 kik1Var = wk6.a;
                    lik1 lik1VarB = nhc1.Y(strC, "spotify:artist-music-videos:", false) ? wk6.a.b(strC) : nik1.N.b(strC);
                    if (!lik1VarB.equals(bn70VarA.b)) {
                        n6r0 n6r0Var = bn70VarA.a;
                        bn70 bn70Var = new bn70(n6r0Var, lik1VarB, bn70VarA.c);
                        cbr0Var2.a(bn70Var);
                        qhe0 qhe0Var = (t8h1) ((i26) yu3Var.d).invoke();
                        if (qhe0Var != null) {
                            qir0 qir0VarA = lik1VarB.a();
                            qhe0 qhe0Var2 = qhe0Var;
                            if (!u890.j(n6r0Var.path(), ((uba) qhe0Var2).Y.a.path()) || !qir0VarA.equals(((uba) qhe0Var2).Y.b)) {
                                int iC2 = l1d.C(((uba) qhe0Var2).t);
                                u8h1 u8h1Var = bn70Var.d;
                                if (iC2 == 0 || iC2 == 1) {
                                    qhe0Var2.C(n6r0Var, qir0VarA, u8h1Var);
                                } else if (iC2 == 2) {
                                    qhe0Var2.C(n6r0Var, qir0VarA, u8h1Var);
                                    qhe0Var2.t();
                                }
                            }
                        }
                    }
                }
                return rih1Var;
            case 13:
                ix11 ix11Var = (ix11) obj;
                bv6 bv6Var = (bv6) obj2;
                if (ix11Var instanceof gx11) {
                    su6 su6Var = ((gx11) ix11Var).a;
                    if (su6Var.k == 2) {
                        bv6Var.N0 = su6Var;
                    }
                    bv6Var.i.m((Object) null, su6Var);
                    if (!bv6Var.d()) {
                        bv6Var.i();
                    }
                    if (bv6Var.d()) {
                        bv6Var.O0.m((Object) null, Boolean.FALSE);
                    }
                } else if (ix11Var instanceof hx11) {
                    yyq yyqVar = ((hx11) ix11Var).a;
                    if (!bv6Var.d() && !bv6Var.Z) {
                        bv6Var.Z = true;
                        bv6Var.h(new RuntimeException(yyqVar.getMessage()));
                    }
                } else if (!u890.j(ix11Var, ex11.a)) {
                    if (!u890.j(ix11Var, fx11.a)) {
                        eg.o();
                        return null;
                    }
                    bv6Var.e.P0(jx11.b);
                }
                return rih1Var;
            case 14:
                h1r h1rVar = (k1r) obj;
                s67 s67Var = (s67) obj2;
                if (h1rVar instanceof h1r) {
                    s67Var.h(new IllegalStateException(h1rVar.a.getMessage()));
                } else if (h1rVar instanceof i1r) {
                    s67Var.f = new t67((List) ((i1r) h1rVar).a);
                    s67Var.i();
                } else {
                    if (!u890.j(h1rVar, j1r.a)) {
                        eg.o();
                        return null;
                    }
                    s67Var.j();
                }
                return rih1Var;
            case 15:
                ((vu30) obj2).invoke(new Integer(((Number) obj).intValue()), Boolean.FALSE);
                return rih1Var;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    bpb1 bpb1Var2 = ((ot7) obj2).c;
                    Boolean bool3 = Boolean.TRUE;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool3);
                }
                return rih1Var;
            case 17:
                AudioRecognitionRequest audioRecognitionRequest = (AudioRecognitionRequest) obj;
                byte[] byteArray = audioRecognitionRequest.toByteArray();
                byteArray.getClass();
                int length = byteArray.length;
                zod.u(byteArray.length, 0L, length);
                if (!((ig01) obj2).f(2, new rhc(f46.Z(0, byteArray, length)))) {
                    eg.m("AudioRecognition WebSocket rejected a request");
                    return null;
                }
                if (audioRecognitionRequest.n() == 1) {
                    new Integer(audioRecognitionRequest.o().p());
                    new Integer(audioRecognitionRequest.o().n());
                    audioRecognitionRequest.o().getClass();
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                jl8 jl8Var = (jl8) obj;
                hrr0 hrr0Var = ((cl8) obj2).g;
                if (!u890.j(hrr0Var.getValue(), jl8Var)) {
                    hrr0Var.setValue(jl8Var);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                String str = (String) obj;
                cue0 cue0Var = ((or8) obj2).d;
                str.getClass();
                cue0Var.d = str;
                cue0Var.a(new z9b0(str, (byte) 11));
                return rih1Var;
            case 20:
                rev revVar = (rev) obj;
                c21 c21Var = (c21) obj2;
                xab1 xab1Var2 = (xab1) c21Var.h;
                if (xab1Var2 != null) {
                    xab1Var2.d((CancellationException) null);
                }
                ((b8p1) c21Var.c).m((List) c21Var.f, revVar.a, revVar.b, revVar.c);
                c21Var.x(revVar.a);
                return rih1Var;
            case 21:
                ((q01) obj2).invoke();
                return rih1Var;
            case 22:
                if (((Boolean) obj).booleanValue() && (mmr0Var = (g7aVar = (g7a) obj2).h) != null && (messageResponseToken = (MessageResponseToken) mmr0Var.a) != null) {
                    g7aVar.d.a(messageResponseToken);
                }
                return rih1Var;
            case 23:
                ((f7a) obj2).invoke(lnmVar);
                return rih1Var;
            case 24:
                ((e7a) obj2).invoke(lnmVar);
                return rih1Var;
            case 25:
                ((lzn0) ((cpa) obj2).b).i(new dwn0(d5j1.b.a, "", true, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), mno1.h(new mmr0[]{new mmr0("has_expired", Boolean.TRUE)}));
                return rih1Var;
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    ozb ozbVar = (ozb) obj2;
                    x7q0 x7q0Var = ozbVar.e;
                    MessageResponseToken messageResponseToken2 = ozbVar.j;
                    if (messageResponseToken2 == null) {
                        hhg1.n("Required value was null.");
                        return null;
                    }
                    x7q0Var.a(messageResponseToken2);
                }
                return rih1Var;
            case 27:
                ((Boolean) obj).getClass();
                Object objC = ((f1n0) ((fta) obj2).c).c(new dwn0("spotify:find", "", true, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), null, lnmVar);
                return objC == d9nVar ? objC : rih1Var;
            case 28:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ((bpb1) ((h7c) obj2).e.d).m((Object) null, bool4);
                return rih1Var;
            default:
                mmr0 mmr0Var2 = (mmr0) obj;
                o5e0 o5e0Var = (o5e0) mmr0Var2.a;
                ioj0 ioj0Var = (ioj0) mmr0Var2.b;
                a8c a8cVar = (a8c) obj2;
                int i2 = a8cVar.i.d() ? 0 : 10;
                if (o5e0Var.h() && ioj0Var.a.c() >= i2) {
                    a8cVar.i();
                } else if (o5e0Var.b()) {
                    a8cVar.j();
                } else if (!o5e0Var.h()) {
                    a8cVar.g();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ hb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
