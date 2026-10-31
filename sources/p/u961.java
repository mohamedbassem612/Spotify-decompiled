package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.spotify.allboarding.allboardingimpl.search.ui.BackKeyEditText;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u961 implements t6b0, j6p0, Function, t1s0 {
    public static u961 e;
    public static final ygm f = new ygm(2);
    public static final fb81 g = new fb81();
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public u961(Context context, ToolbarSearchFieldView toolbarSearchFieldView, boolean z) {
        this((byte) 2);
        this.d = toolbarSearchFieldView;
        toolbarSearchFieldView.getLayoutParams().width = -1;
        ViewGroup.LayoutParams layoutParams = toolbarSearchFieldView.getLayoutParams();
        int iK = dug.k(context);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if ((activity.getWindow().getAttributes().flags & 67108864) != 0 || Color.alpha(activity.getWindow().getStatusBarColor()) < 255) {
                iK += d4o1.h(context);
            }
        }
        layoutParams.height = iK;
        Resources resources = context.getResources();
        Drawable g4b1Var = new g4b1(context, j4b1.W5, resources.getDimensionPixelSize(2131167069));
        Button searchPlaceHolder = toolbarSearchFieldView.getSearchPlaceHolder();
        int insetX = toolbarSearchFieldView.getInsetX() + ((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        searchPlaceHolder.getClass();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = insetX;
        layoutParams2.rightMargin = insetX;
        layoutParams2.gravity = 8388611;
        searchPlaceHolder.setLayoutParams(layoutParams2);
        searchPlaceHolder.setTextAppearance(2132018007);
        if (z) {
            searchPlaceHolder.setTextColor(searchPlaceHolder.getContext().getColor(2131100143));
            g4b1Var.b(searchPlaceHolder.getContext().getColor(2131100143));
        } else {
            searchPlaceHolder.setTextColor(searchPlaceHolder.getContext().getColor(2131100145));
            g4b1Var.b(searchPlaceHolder.getContext().getColor(2131100145));
        }
        searchPlaceHolder.setCompoundDrawablesRelativeWithIntrinsicBounds(g4b1Var, (Drawable) null, (Drawable) null, (Drawable) null);
        toolbarSearchFieldView.getQueryEditText().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER)});
        View viewFindViewById = toolbarSearchFieldView.findViewById(2131430847);
        WeakHashMap weakHashMap = b8k1.a;
        viewFindViewById.setTransitionName("search_field");
        toolbarSearchFieldView.setToolbarSearchFieldRightButtonListener(new a351(this));
        toolbarSearchFieldView.setToolbarSearchFieldCallbacks(new z251(this));
        BackKeyEditText queryEditText = toolbarSearchFieldView.getQueryEditText();
        queryEditText.setOnEditorActionListener((nca) this.c);
        queryEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: p.lca
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                u961 u961Var = this.a;
                ToolbarSearchFieldView toolbarSearchFieldView2 = (ToolbarSearchFieldView) u961Var.d;
                if (z2) {
                    e821.e((ObjectAnimator) toolbarSearchFieldView2.O0.c);
                } else if (TextUtils.isEmpty(toolbarSearchFieldView2.getQueryEditText().getText())) {
                    e821.e((ObjectAnimator) toolbarSearchFieldView2.O0.d);
                }
                Iterator it = ((CopyOnWriteArraySet) u961Var.a).iterator();
                while (it.hasNext()) {
                    ((s151) it.next()).b(z2);
                }
            }
        });
        queryEditText.addTextChangedListener(new mca(this, (byte) 0));
        ImageButton imageButton = toolbarSearchFieldView.e;
        imageButton.setContentDescription(imageButton.getContext().getString(2131961489));
    }

    public static final /* synthetic */ w4b1 l(u961 u961Var) {
        return (w4b1) u961Var.b;
    }

    public static synchronized u961 w() {
        u961 u961Var;
        u961Var = e;
        if (u961Var == null) {
            u961Var = new u961((byte) 0);
            e = u961Var;
        }
        return u961Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object A(int i, String str, onm onmVar, boolean z) throws AbortFlowException {
        jd3 jd3Var;
        q8n q8nVar = (q8n) this.d;
        zu00 zu00Var = (uu00) this.b;
        if (onmVar instanceof jd3) {
            jd3Var = (jd3) onmVar;
            int i2 = jd3Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jd3Var.c = i2 - Integer.MIN_VALUE;
            } else {
                jd3Var = new jd3(this, onmVar);
            }
        } else {
            jd3Var = new jd3(this, onmVar);
        }
        Object objK = jd3Var.a;
        int i3 = jd3Var.c;
        if (i3 == 0) {
            hm5.M(objK);
            zu00 zu00Var2 = zu00Var;
            l4p1.u((u9c0) this.c, o4p1.r(yoi1.g(zu00Var2.b(new oi("album-page-pre-load", false, new c30(this, z, str, (byte) 4)))), q8nVar));
            gk gkVar = new gk(new vd0((byte) 6, this, str, o4p1.r(yoi1.g(zu00Var2.b(new oi("album-page-cdp-redirect", false, new v1(str, (byte) 28)))), q8nVar)), str, (byte) 22);
            ytw0 ytw0Var = jfv.b;
            lt20 lt20Var = new lt20(r4p1.w(gkVar, fdg1.k0(i, ngv.d)), new kd3(3, (lnm) null, (byte) 0), (byte) 0);
            jd3Var.c = 1;
            objK = b5p1.k(lt20Var, jd3Var);
            d9n d9nVar = d9n.a;
            if (objK == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objK);
        }
        e331 e331Var = (e331) objK;
        return e331Var != null ? e331Var.a : Boolean.FALSE;
    }

    public mr20 B(PlayerState playerState) {
        vhs0 vhs0Var = (vhs0) this.d;
        if (playerState.signals().contains("switch-to-audio") && vhs0Var.a.length() > 0) {
            vhs0Var.a = "";
        }
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack != null) {
            String strUri = (l4o1.P(contextTrack) || !l4o1.Y(contextTrack)) ? (String) contextTrack.metadata().get("video_association") : contextTrack.uri();
            if (strUri != null) {
                return rqt0.u(new lt20(new vd0(hu20.c(((ov20) this.a).a("should-assure-age-content-playback", false), new q4(this, strUri, (lnm) null, (byte) 25)), this, playerState, (byte) 3), new re1(3, (lnm) null, (byte) 2), (byte) 0));
            }
        }
        return new huz(new ge2(false), (byte) 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r9 == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object C(java.lang.String r8, p.onm r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            android.content.res.Resources r0 = (android.content.res.Resources) r0
            boolean r1 = r9 instanceof p.wd1
            if (r1 == 0) goto L17
            r1 = r9
            p.wd1 r1 = (p.wd1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            p.wd1 r1 = new p.wd1
            r1.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r1.b
            int r2 = r1.d
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.String r8 = r1.a
            p.hm5.M(r9)
            goto L64
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r5
        L37:
            java.lang.String r8 = r1.a
            p.hm5.M(r9)
            goto L4f
        L3d:
            p.hm5.M(r9)
            java.lang.Object r9 = r7.d
            p.peu0 r9 = (p.peu0) r9
            r1.a = r8
            r1.d = r4
            java.lang.Object r9 = r9.c(r1)
            if (r9 != r6) goto L4f
            goto L63
        L4f:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r7.c
            p.v5n r2 = (p.v5n) r2
            io.reactivex.rxjava3.core.Single r9 = r2.a(r9)
            r1.a = r8
            r1.d = r3
            java.lang.Object r9 = p.fc11.j(r9, r1)
            if (r9 != r6) goto L64
        L63:
            return r6
        L64:
            java.lang.String r9 = (java.lang.String) r9
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "android.intent.action.SEND"
            r1.setAction(r2)
            r2 = 2131958515(0x7f131af3, float:1.9553644E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "android.intent.extra.SUBJECT"
            r1.putExtra(r3, r2)
            r2 = 2131958514(0x7f131af2, float:1.9553642E38)
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r8}
            java.lang.String r8 = r0.getString(r2, r8)
            java.lang.String r9 = "android.intent.extra.TEXT"
            r1.putExtra(r9, r8)
            java.lang.String r8 = "text/plain"
            r1.setType(r8)
            java.lang.Object r7 = r7.b
            p.bi0 r7 = (p.bi0) r7
            android.content.Intent r8 = android.content.Intent.createChooser(r1, r5)
            r7.a(r8)
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.u961.C(java.lang.String, p.onm):java.lang.Object");
    }

    public d520 D(int i, heg hegVar, ab11 ab11Var) {
        bqi0 bqi0Var = new bqi0(((bqi0) this.a).a + '@' + i);
        oj80 oj80Var = (oj80) this.d;
        HashMap map = (HashMap) oj80Var.c;
        List arrayList = (List) map.get(bqi0Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(bqi0Var, arrayList);
        }
        return ((p2o0) oj80Var.b).G(hegVar, ab11Var, arrayList);
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.isEmpty()) {
            return;
        }
        ((HashMap) ((oj80) this.c).c).put((bqi0) this.a, arrayList);
    }

    public Object apply(Object obj) {
        String str = (String) obj;
        g23 g23Var = (g23) this.b;
        agu0 agu0Var = (vfu0) g23Var.c;
        axu0 axu0Var = (axu0) this.c;
        ArrayList arrayList = axu0Var.b;
        String str2 = axu0Var.c;
        return agu0Var.b(new ufu0(str, (String) this.a, axu0Var.d, str2, arrayList)).h(nm.X).g(new t33(axu0Var, g23Var, (String) this.d));
    }

    public mr20 d() {
        return (huz) this.c;
    }

    public void e() {
        n57.e("Partner Integration is only available when Amazon Alexa app is already installed.");
    }

    public Flowable f() {
        return yoi1.h(rqt0.u(new mt((bpb1) this.c, (byte) 2)), o6x.a);
    }

    public void g(tv80 tv80Var) {
        ((Activity) this.a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")));
    }

    public Flowable h() {
        return yoi1.h((bpb1) this.c, o6x.a);
    }

    public r6b0 i(heg hegVar, ab11 ab11Var) {
        return ((p2o0) ((oj80) this.c).b).G(hegVar, ab11Var, (ArrayList) this.b);
    }

    public mr20 j() {
        return (gk) this.d;
    }

    public mr20 k() {
        return (mr20) this.b;
    }

    public Flowable m() {
        int i = Flowable.a;
        return FlowableEmpty.b;
    }

    public void o() {
        u9c0 u9c0Var = (u9c0) this.b;
        idd1 idd1Var = w55.Z;
        fn31.T(u9c0Var, ton1.u(), 0, new a03(this, (lnm) null, (byte) 0), 2);
    }

    public void p() {
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) this.d;
        BackKeyEditText queryEditText = toolbarSearchFieldView.getQueryEditText();
        queryEditText.requestFocus();
        xap1.z(queryEditText);
        e821 e821Var = toolbarSearchFieldView.O0;
        e821.e((ObjectAnimator) e821Var.c, (AnimatorSet) e821Var.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object q(f0k0 f0k0Var, onm onmVar) {
        dq1 dq1Var;
        cbk0 cbk0Var = (cbk0) this.b;
        if (onmVar instanceof dq1) {
            dq1Var = (dq1) onmVar;
            int i = dq1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq1Var.d = i - Integer.MIN_VALUE;
            } else {
                dq1Var = new dq1(this, onmVar);
            }
        } else {
            dq1Var = new dq1(this, onmVar);
        }
        Object obj = dq1Var.b;
        int i2 = dq1Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            ldk0 ldk0Var = (cdk0) this.c;
            dq1Var.a = f0k0Var;
            dq1Var.d = 1;
            Object objH = ldk0Var.h(dq1Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f0k0Var = dq1Var.a;
            hm5.M(obj);
        }
        String strC = kkg1.c(f0k0Var.a);
        String str = cbk0Var.b.a;
        String str2 = cbk0Var.c.a;
        ((vu1) this.d).a(p7h.M(new String[]{str, str2}), ((lik1) this.a).a, cbk0Var.a, f0k0Var.b, new fy1(new ajg1(str, str2, strC)), true);
        return rih1.a;
    }

    public void r() {
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) this.d;
        if (TextUtils.isEmpty(toolbarSearchFieldView.getQueryEditText().getText())) {
            toolbarSearchFieldView.O0.w();
        }
        BackKeyEditText queryEditText = toolbarSearchFieldView.getQueryEditText();
        queryEditText.clearFocus();
        ((InputMethodManager) queryEditText.getContext().getSystemService("input_method")).hideSoftInputFromWindow(queryEditText.getWindowToken(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(String str, onm onmVar) {
        gl1 gl1Var;
        a1q a1qVarC;
        Object objL;
        if (onmVar instanceof gl1) {
            gl1Var = (gl1) onmVar;
            int i = gl1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gl1Var.e = i - Integer.MIN_VALUE;
            } else {
                gl1Var = new gl1(this, onmVar);
            }
        } else {
            gl1Var = new gl1(this, onmVar);
        }
        Object obj = gl1Var.c;
        int i2 = gl1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            a1qVarC = ((il1) this.b).a.c(str);
            Observable observableC = a1qVarC.c();
            gl1Var.a = str;
            gl1Var.b = a1qVarC;
            gl1Var.e = 1;
            objL = fc11.l(observableC, 1, (Object) null, gl1Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a1q a1qVar = gl1Var.b;
            String str2 = gl1Var.a;
            hm5.M(obj);
            a1qVarC = a1qVar;
            str = str2;
            objL = obj;
        }
        boolean zBooleanValue = ((Boolean) objL).booleanValue();
        jhm jhmVarT = ((u961) this.d).t(str, true, true, zBooleanValue);
        return jhm.a(jhmVarT, (String) null, ihm.a(jhmVarT.i, new c30(this, zBooleanValue, a1qVarC, (byte) 1)), 255);
    }

    public jhm t(String str, boolean z, boolean z2, boolean z3) {
        klx klxVar;
        int i;
        Set set = s4b1.f;
        blc0 blc0Var = uic.x(str).c;
        if (blc0.fh != blc0Var && blc0.Pg != blc0Var) {
            n57.m(String.format("Unsupported link type %s", Arrays.copyOf(new Object[]{blc0Var}, 1)));
        }
        if (z && z3) {
            klxVar = klx.c;
        } else if (z) {
            klxVar = irx.c;
        } else {
            klxVar = z3 ? fux.c : hrx.c;
        }
        klx klxVar2 = klxVar;
        if (z && z3) {
            i = 2131954422;
        } else if (z) {
            i = 2131954318;
        } else {
            i = z3 ? 2131954468 : 2131954371;
        }
        return new jhm("podcast_follow_show", klxVar2, (fhm) null, Integer.valueOf(i), (String) null, z2, (tm81) null, new ihm(f, z3 ? hhm.b : hhm.a, new ghm(i330.b1, new cl1(z3, str, (byte) 17)), new c30(this, z3, str, (byte) 16)), 180);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Object u(iu30 iu30Var, onm onmVar) {
        os0 os0Var;
        String str;
        Throwable th;
        yt0 yt0Var;
        ji0 m231Var;
        zt0 zt0Var = (zt0) this.d;
        if (onmVar instanceof os0) {
            os0Var = (os0) onmVar;
            int i = os0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                os0Var.d = i - Integer.MIN_VALUE;
            } else {
                os0Var = new os0(this, onmVar);
            }
        } else {
            os0Var = new os0(this, onmVar);
        }
        os0 os0Var2 = os0Var;
        Object objA = os0Var2.b;
        int i2 = os0Var2.d;
        if (i2 == 0) {
            hm5.M(objA);
            yqg yqgVar = (yqg) this.c;
            try {
                str = DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(OffsetDateTime.ofInstant(Instant.ofEpochMilli(yqgVar.b()), ZoneId.systemDefault()));
                str.getClass();
            } catch (Exception e2) {
                bt0.a((bt0) this.b, at0.Y, (String) null, (List) null, j2h1.I(e2), 30);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX", Locale.US);
                simpleDateFormat.setTimeZone(yqgVar.g());
                str = simpleDateFormat.format(new Date(yqgVar.b()));
            }
            String string = UUID.randomUUID().toString();
            yt0 yt0Var2 = new yt0(str, string);
            iu30Var.invoke(string);
            bt0.a((bt0) this.b, at0.e, string, (List) null, (String) null, 60);
            t45 t45Var = zt0Var.b;
            if (t45Var != null) {
                t45Var.b("request_identifier", string);
            }
            zt0Var.a(4);
            try {
                ys0 ys0Var = (ys0) this.a;
                try {
                    os0Var2.a = yt0Var2;
                    os0Var2.d = 1;
                    objA = ys0Var.a(yt0Var2, os0Var2);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    yt0Var = yt0Var2;
                } catch (Throwable th2) {
                    th = th2;
                    yt0Var = yt0Var2;
                    m231Var = new m231(th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yt0Var = os0Var2.a;
            try {
                hm5.M(objA);
            } catch (Throwable th4) {
                th = th4;
                m231Var = new m231(th);
            }
        }
        m231Var = jhc1.G(((ns0) objA).a, yt0Var.b);
        if (!(m231Var instanceof m231)) {
            ji0 ji0Var = m231Var;
            t45 t45Var2 = zt0Var.b;
            if (t45Var2 != null) {
                t45Var2.g(kk0.b(4));
            }
            bt0.a((bt0) this.b, at0.f, yt0Var.b, Collections.singletonList(ji0Var.a), (String) null, 52);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            zt0Var.c(4, 3);
            bt0.a((bt0) this.b, at0.g, yt0Var.b, (List) null, j2h1.I(thA), 28);
        }
        return m231Var;
    }

    public void v(String str, tv80 tv80Var) {
        lzn0 lzn0Var = (lzn0) this.d;
        if (!nhc1.Y(str, "spotify:", false) && !ihc1.h0(str, "play.google.com", false)) {
            lzn0Var.f(new dwn0(nik1.W1.a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
        }
        huj.b(lzn0Var, (Activity) this.a, (ryf) this.b, oxf.b, str, tv80Var);
    }

    public bpb1 x() {
        return (bpb1) this.d;
    }

    public boolean y(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.b).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.c).booleanValue();
    }

    public boolean z(Context context) {
        Boolean boolValueOf = (Boolean) this.b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
            this.b = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.b).booleanValue();
    }

    public void n() {
    }

    public /* synthetic */ u961(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public u961(fey feyVar, i8h1 i8h1Var) {
        this.b = feyVar;
        this.c = i8h1Var;
    }

    public u961(Activity activity, x6o0 x6o0Var, g23 g23Var) {
        this.a = activity;
        this.b = g23Var.k();
        this.c = new huz(new j2s0(""), (byte) 10);
        this.d = new gk(g23Var.d(), this, (byte) 26);
    }

    public /* synthetic */ u961(ViewGroup viewGroup, View view, TextView textView, TextView textView2, TextView textView3) {
        this.a = view;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    public u961(oj80 oj80Var, bqi0 bqi0Var) {
        this.d = oj80Var;
        this.c = oj80Var;
        this.a = bqi0Var;
        this.b = new ArrayList();
    }

    public u961(byte b) {
        switch (b) {
            case 2:
                this.a = new CopyOnWriteArraySet();
                this.c = new TextView.OnEditorActionListener() { // from class: p.nca
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        boolean z = i == 3;
                        boolean z2 = i == 0 && keyEvent != null && keyEvent.getAction() == 0;
                        if (z || z2) {
                            u961 u961Var = this.a;
                            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) u961Var.a;
                            if (!copyOnWriteArraySet.isEmpty()) {
                                Editable text = ((ToolbarSearchFieldView) u961Var.d).getQueryEditText().getText();
                                if (text != null) {
                                    text.toString();
                                }
                                Iterator it = copyOnWriteArraySet.iterator();
                                while (it.hasNext()) {
                                    ((s151) it.next()).getClass();
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                };
                break;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = new ArrayDeque();
                break;
        }
    }
}
