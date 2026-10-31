package p;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.components.ComponentRegistrar;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.messages.ClientAuthEventFailureNonAuth;
import com.spotify.messages.ClientAuthEventStart;
import com.spotify.messages.ClientAuthEventStartNonAuth;
import com.spotify.messages.ClientAuthEventSuccess;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageListRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.network.FetchMessageRequest;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.events.proto.ClientMessagingPlatformProtoTransformationFailure;
import com.spotify.pendragon.v1.proto.InAppMessage;
import com.spotify.pendragon.v1.proto.MessageCreative;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.LongConsumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lag implements Function, CompletableOnSubscribe {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public lag(Map map, sf4 sf4Var, d0r d0rVar) {
        this.a = (byte) 20;
        this.b = map;
        this.c = sf4Var;
        this.d = d0rVar;
        jd11 jd11Var = rc11.a;
        this.e = w3p1.n(new l4r(new xv00(jd11Var.b(hzy.class)), 1, vll.X, new j4r(vll.g), vll.Y), new l4r(new xv00(jd11Var.b(jo70.class)), 2, vll.i, new j4r(vll.h), vll.t), yzj.Y0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object a(r021 r021Var, onm onmVar) {
        erg ergVar;
        String string;
        Object objY;
        if (onmVar instanceof erg) {
            ergVar = (erg) onmVar;
            int i = ergVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ergVar.c = i - Integer.MIN_VALUE;
            } else {
                ergVar = new erg(this, onmVar);
            }
        } else {
            ergVar = new erg(this, onmVar);
        }
        Object obj = ergVar.a;
        int i2 = ergVar.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(obj);
            boolean zH = ((a1r0) this.e).h((Activity) this.b);
            if (r021Var.b) {
                qr91 qr91Var = (qr91) this.c;
                w131 w131Var = r021Var.a;
                ergVar.c = 1;
                Activity activity = qr91Var.a;
                if (w131Var instanceof w131) {
                    string = activity.getString(2131961106, w131Var.a);
                } else if (w131Var instanceof t231) {
                    string = activity.getString(2131961107, ((t231) w131Var).a);
                } else {
                    if (!(w131Var instanceof x131)) {
                        eg.o();
                        return null;
                    }
                    string = activity.getString(2131961078);
                }
                String str = string;
                str.getClass();
                er91 er91Var = new er91((fs91) null, str, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                d9n d9nVar = d9n.a;
                if (zH) {
                    qr91Var.b.o(er91Var);
                } else {
                    objY = fn31.Y(qr91Var.d, new wp41(qr91Var, er91Var, (lnm) null, (byte) 21), ergVar);
                    if (objY != d9nVar) {
                        objY = rih1Var;
                    }
                    if (objY != d9nVar) {
                    }
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                }
                objY = rih1Var;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ((los) this.d).a(ixb.c);
        return rih1Var;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                String str = (String) this.e;
                boolean z = ((th61) obj).b;
                lag lagVar = (lag) this.b;
                String str2 = (String) this.c;
                wq8 wq8Var = (wq8) this.d;
                if (z) {
                    lagVar.m(str2, wq8Var, str);
                } else {
                    lagVar.n(str2, wq8Var, str);
                }
                return rih1.a;
            default:
                return ((jeh1) obj) instanceof ieh1 ? bn41.a : new an41(new f80((nx9) this.b, (tif1) this.c, (dn41) this.d, (kly0) this.e, (byte) 27));
        }
    }

    public void b(vzh vzhVar) {
        ((ArrayList) this.d).add(vzhVar);
    }

    public void c(ComponentRegistrar componentRegistrar) {
        ((ArrayList) this.c).add(new s0i(componentRegistrar, (byte) 1));
    }

    public void d(ArrayList arrayList) {
        ((ArrayList) this.c).addAll(arrayList);
    }

    public k1i e() {
        return new k1i((Executor) this.b, (ArrayList) this.c, (ArrayList) this.d, (d1i) this.e);
    }

    public Single f(FetchMessageRequest fetchMessageRequest) {
        jjg jjgVar = (jjg) this.b;
        pz10 pz10VarO = com.spotify.pendragon.v1.proto.FetchMessageRequest.o();
        pz10VarO.q(fetchMessageRequest.getLocale());
        pz10VarO.u(qvg1.valueOf(fetchMessageRequest.getTriggerType().toUpperCase(Locale.ROOT)));
        pz10VarO.n(fetchMessageRequest.getTriggerPatterns());
        String entityUri = fetchMessageRequest.getEntityUri();
        if (entityUri != null) {
            pz10VarO.v(entityUri);
        }
        pz10VarO.s(fetchMessageRequest.getOpportunityId());
        pz10VarO.t(fetchMessageRequest.getPurchaseAllowed());
        pz10VarO.r();
        return jjgVar.b(pz10VarO.build()).map(new mp8((Object) this, (byte) 18));
    }

    public Single g(FetchMessageListRequest fetchMessageListRequest) {
        jjg jjgVar = (jjg) this.b;
        nz10 nz10VarN = com.spotify.pendragon.v1.proto.FetchMessageListRequest.n();
        nz10VarN.n(fetchMessageListRequest.getLocale());
        nz10VarN.q();
        return jjgVar.a(nz10VarN.build()).map(new zwa(this, (byte) 12));
    }

    public mr20 h() {
        return (mr20) ((idd1) this.e).getValue();
    }

    public i8h1 i() {
        return (i8h1) ((idd1) this.e).getValue();
    }

    public void j(String str, String str2) {
        String str3 = (String) ((HashMap) this.e).remove(str);
        if (str3 == null) {
            str3 = "";
        }
        gig gigVarN = ClientAuthEventFailureNonAuth.n();
        gigVarN.r(str2);
        gigVarN.q();
        gigVarN.n(str3);
        ClientAuthEventFailureNonAuth clientAuthEventFailureNonAuthBuild = gigVarN.build();
        t2j0 t2j0Var = (t2j0) this.b;
        clientAuthEventFailureNonAuthBuild.getClass();
        t2j0Var.a(clientAuthEventFailureNonAuthBuild);
    }

    public FlowableIgnoreElementsCompletable k(String str, wq8 wq8Var) {
        String string = UUID.randomUUID().toString();
        ((HashMap) this.e).put(str, string);
        Flowable flowable = (Flowable) this.c;
        FlowableTake flowableTakeF = ydh.f(flowable, flowable);
        lig ligVar = new lig(this, str, wq8Var, string);
        Consumer consumer = Functions.d;
        LongConsumer longConsumer = Functions.g;
        Objects.requireNonNull(consumer, "onSubscribe is null");
        Objects.requireNonNull(longConsumer, "onRequest is null");
        return new FlowableIgnoreElementsCompletable(new FlowableDoOnLifecycle(flowableTakeF, consumer, longConsumer, ligVar).J(new lag((Object) this, (Object) str, (Object) wq8Var, (Object) string, (byte) 1)));
    }

    public void l(String str) {
        String str2 = (String) ((HashMap) this.e).remove(str);
        if (str2 == null) {
            str2 = "";
        }
        kig kigVarN = ClientAuthEventSuccess.n();
        kigVarN.n(str2);
        ClientAuthEventSuccess clientAuthEventSuccessBuild = kigVarN.build();
        t2j0 t2j0Var = (t2j0) this.b;
        clientAuthEventSuccessBuild.getClass();
        t2j0Var.a(clientAuthEventSuccessBuild);
    }

    public void m(String str, wq8 wq8Var, String str2) {
        iig iigVarO = ClientAuthEventStart.o();
        iigVarO.u(wq8Var.a);
        iigVarO.y(td6.r(wq8Var.b));
        iigVarO.x(wq8Var.c);
        iigVarO.n(wq8Var.f);
        iigVarO.w();
        iigVarO.q(str);
        iigVarO.v();
        iigVarO.s(str2);
        iigVarO.t(((jqt) this.d).b());
        String str3 = wq8Var.k;
        if (str3 != null) {
            iigVarO.z(str3);
        }
        String str4 = wq8Var.i;
        if (str4 != null) {
            iigVarO.B(str4);
        }
        String str5 = wq8Var.j;
        if (str5 != null) {
            iigVarO.A(str5);
        }
        String str6 = wq8Var.l;
        if (str6 != null) {
            iigVarO.r(str6);
        }
        ClientAuthEventStart clientAuthEventStartBuild = iigVarO.build();
        t2j0 t2j0Var = (t2j0) this.b;
        clientAuthEventStartBuild.getClass();
        t2j0Var.a(clientAuthEventStartBuild);
    }

    public void n(String str, wq8 wq8Var, String str2) {
        jig jigVarO = ClientAuthEventStartNonAuth.o();
        jigVarO.u(wq8Var.a);
        jigVarO.y(td6.r(wq8Var.b));
        jigVarO.x(wq8Var.c);
        jigVarO.n(wq8Var.f);
        jigVarO.w();
        jigVarO.q(str);
        jigVarO.v();
        jigVarO.s(str2);
        jigVarO.t(((jqt) this.d).b());
        String str3 = wq8Var.k;
        if (str3 != null) {
            jigVarO.z(str3);
        }
        String str4 = wq8Var.i;
        if (str4 != null) {
            jigVarO.B(str4);
        }
        String str5 = wq8Var.j;
        if (str5 != null) {
            jigVarO.A(str5);
        }
        String str6 = wq8Var.l;
        if (str6 != null) {
            jigVarO.r(str6);
        }
        ClientAuthEventStartNonAuth clientAuthEventStartNonAuthBuild = jigVarO.build();
        t2j0 t2j0Var = (t2j0) this.b;
        clientAuthEventStartNonAuthBuild.getClass();
        t2j0Var.a(clientAuthEventStartNonAuthBuild);
    }

    public void o(InAppMessage inAppMessage, MessageParsingException messageParsingException) {
        String strY;
        gjc gjcVar = (gjc) this.e;
        long jS = inAppMessage.s();
        long jO = inAppMessage.p().o();
        long jP = inAppMessage.p().p();
        String strV = inAppMessage.v();
        MessageCreative messageCreativeP = inAppMessage.p();
        if (messageCreativeP.w()) {
            strY = dv20.q(messageCreativeP.s().w());
        } else {
            strY = messageCreativeP.x() ? cy30.y(messageCreativeP.t().r()) : "FORMAT_UNKNOWN";
        }
        String message = messageParsingException.getMessage();
        if (message == null) {
            f4j0 f4j0Var = g4j0.Companion;
            message = "unknownError";
        }
        t2j0 t2j0Var = gjcVar.a;
        xjg xjgVarN = ClientMessagingPlatformProtoTransformationFailure.n();
        xjgVarN.s(jS);
        xjgVarN.n(jO);
        xjgVarN.q(jP);
        xjgVarN.t(strV);
        xjgVarN.r(strY);
        xjgVarN.u(message);
        t2j0Var.a(xjgVarN.build());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r13 == r6) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(java.lang.String r13, p.onm r14) {
        /*
            r12 = this;
            r0 = 2131953922(0x7f130902, float:1.9544329E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r12.c
            p.dng r0 = (p.dng) r0
            java.lang.String r0 = r0.a
            boolean r1 = r14 instanceof p.tng
            if (r1 == 0) goto L20
            r1 = r14
            p.tng r1 = (p.tng) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L20
            int r2 = r2 - r3
            r1.d = r2
            goto L25
        L20:
            p.tng r1 = new p.tng
            r1.<init>(r12, r14)
        L25:
            java.lang.Object r14 = r1.b
            int r2 = r1.d
            r3 = 0
            r5 = 2
            r11 = 1
            p.d9n r6 = p.d9n.a
            if (r2 == 0) goto L48
            if (r2 == r11) goto L42
            if (r2 != r5) goto L3c
            p.hm5.M(r14)
            p.e331 r14 = (p.e331) r14
            java.lang.Object r13 = r14.a
            goto L7b
        L3c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r12)
            return r3
        L42:
            java.lang.String r13 = r1.a
            p.hm5.M(r14)
            goto L6c
        L48:
            p.hm5.M(r14)
            java.lang.Object r14 = r12.b
            p.d0r r14 = (p.d0r) r14
            p.wlu r2 = new p.wlu
            java.lang.Class<p.jo70> r7 = p.jo70.class
            p.jd11 r8 = p.rc11.a
            p.tka0 r7 = r8.b(r7)
            r2.<init>(r7)
            p.ko70 r7 = new p.ko70
            r7.<init>(r13)
            r1.a = r13
            r1.d = r11
            java.lang.Object r14 = p.d0r.d(r14, r2, r0, r7, r1)
            if (r14 != r6) goto L6c
            goto L7a
        L6c:
            java.lang.Object r14 = r12.e
            p.tai1 r14 = (p.tai1) r14
            r1.a = r3
            r1.d = r5
            java.lang.Object r13 = r14.a(r0, r13, r1)
            if (r13 != r6) goto L7b
        L7a:
            return r6
        L7b:
            java.lang.Throwable r14 = p.e331.a(r13)
            if (r14 == 0) goto La6
            java.lang.Object r12 = r12.d
            p.kt91 r12 = (p.kt91) r12
            java.lang.Object[] r14 = new java.lang.Object[]{r4}
            java.lang.String r0 = "Invalid resource ID provided: %s"
            p.n57.k(r11, r0, r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r3}
            p.n57.k(r11, r0, r14)
            p.er91 r1 = new p.er91
            r2 = 0
            java.lang.String r3 = ""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r12.k(r1)
        La6:
            boolean r12 = r13 instanceof p.m231
            r12 = r12 ^ r11
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lag.p(java.lang.String, p.onm):java.lang.Object");
    }

    public void q(ViewGroup viewGroup) {
        etg etgVar;
        lag lagVar = (lag) this.d;
        eg7 eg7Var = (eg7) lagVar.e;
        ViewGroup viewGroup2 = (ViewGroup) lagVar.b;
        if (viewGroup2 == viewGroup) {
            return;
        }
        etg etgVar2 = (etg) lagVar.c;
        if (viewGroup2 != null) {
            viewGroup2.removeOnLayoutChangeListener(eg7Var);
            if (etgVar2 != null) {
                viewGroup2.getOverlay().remove((View) etgVar2);
            }
        }
        lagVar.b = null;
        lagVar.c = null;
        if (viewGroup == null) {
            return;
        }
        lagVar.b = viewGroup;
        etg etgVar3 = new etg(viewGroup.getContext());
        lagVar.c = etgVar3;
        viewGroup.getOverlay().add((View) etgVar3);
        viewGroup.addOnLayoutChangeListener(eg7Var);
        ViewGroup viewGroup3 = (ViewGroup) lagVar.b;
        if (viewGroup3 != null && (etgVar = (etg) lagVar.c) != null) {
            etgVar.layout(0, 0, viewGroup3.getWidth(), viewGroup3.getHeight());
        }
        etgVar3.setCue((zsg) lagVar.d);
    }

    public void r(twb twbVar) {
        this.e = twbVar;
    }

    public void s(String str) {
        zsg zsgVar = str != null ? (zsg) ((LinkedHashMap) this.e).get(str) : null;
        lag lagVar = (lag) this.d;
        lagVar.d = zsgVar;
        etg etgVar = (etg) lagVar.c;
        if (etgVar != null) {
            etgVar.setCue(zsgVar);
        }
    }

    public void subscribe(CompletableEmitter completableEmitter) {
        ((CookieManager) this.b).setCookie((String) this.c, xcg1.i((String) this.d, "=", (String) this.e), new b3n(completableEmitter));
    }

    public Object t(String str, u4m u4mVar, tv80 tv80Var, onm onmVar) {
        boolean z = u4mVar instanceof o4m;
        rih1 rih1Var = rih1.a;
        if (z) {
            vb2.b((vb2) this.d, new db2(((o4m) u4mVar).a), true, tv80Var);
            return rih1Var;
        }
        if (u4mVar instanceof p4m) {
            ((yh2) this.c).b(str, (String) null);
            return rih1Var;
        }
        if (u4mVar instanceof r4m) {
            w390 w390Var = (w390) this.b;
            r6h1 r6h1Var = r6h1.c;
            Object objA = w390Var.a().a(onmVar);
            if (objA == d9n.a) {
                return objA;
            }
        } else if (!u4mVar.equals(s4m.a) && !u4mVar.equals(t4m.a)) {
            if (u4mVar.equals(q4m.a)) {
                ((x290) this.e).a().a(str, false);
                return rih1Var;
            }
            eg.o();
            return null;
        }
        return rih1Var;
    }

    public void u() {
        ((kt91) this.d).k(new er91((fs91) null, ((Resources) this.e).getString(2131959829), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
    }

    public lag(byte b) {
        this.a = b;
        switch (b) {
            case 11:
                this.e = new eg7(this, (byte) 4);
                break;
        }
    }

    public lag(jtg jtgVar, ftg ftgVar) {
        this.a = (byte) 10;
        this.b = jtgVar;
        this.c = ftgVar;
        this.d = new lag((byte) 11);
        this.e = new LinkedHashMap();
    }

    public lag(qa2 qa2Var, h7l0 h7l0Var, g5l0 g5l0Var, g5l0 g5l0Var2) {
        this.a = (byte) 16;
        this.b = h7l0Var;
        this.c = g5l0Var;
        this.d = g5l0Var2;
        this.e = new idd1(new vjh(qa2Var, (byte) 19));
    }

    public lag(f1n0 f1n0Var, kt91 kt91Var, ymu0 ymu0Var, String str) {
        this.a = (byte) 9;
        this.b = f1n0Var;
        this.d = kt91Var;
        this.c = ymu0Var;
        this.e = str;
    }

    public lag(d0r d0rVar, dng dngVar, tai1 tai1Var, kt91 kt91Var) {
        this.a = (byte) 5;
        this.b = d0rVar;
        this.c = dngVar;
        this.e = tai1Var;
        this.d = kt91Var;
    }

    public lag(qpj1 qpj1Var, g23 g23Var, m021 m021Var, vx40 vx40Var, v9c v9cVar) {
        this.a = (byte) 19;
        this.b = qpj1Var;
        this.c = g23Var;
        this.d = m021Var;
        this.e = vx40Var;
    }

    public lag(t2j0 t2j0Var, Flowable flowable, jqt jqtVar) {
        this.a = (byte) 2;
        this.b = t2j0Var;
        this.c = flowable;
        this.d = jqtVar;
        this.e = new HashMap(1);
    }

    public lag(g0l g0lVar) {
        this.a = (byte) 18;
        this.b = g0lVar;
        this.c = new idd1(new g6l(this, (byte) 2));
        this.d = new idd1(new g6l(this, (byte) 1));
        this.e = new idd1(new g6l(this, (byte) 0));
    }

    public /* synthetic */ lag(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public lag(dg30 dg30Var, jma jmaVar, km3 km3Var, n2s0 n2s0Var) {
        this.a = (byte) 17;
        u9c0 u9c0VarQ = cto1.q(dg30Var);
        this.b = dg30Var;
        this.c = u9c0VarQ;
        this.d = km3Var;
        this.e = n2s0Var;
    }

    public lag(LinearLayout linearLayout, ArtworkView artworkView, fp8 fp8Var, ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.a = (byte) 27;
        this.b = linearLayout;
        this.c = artworkView;
        this.d = fp8Var;
        this.e = frameLayout;
    }

    public lag(ConstraintLayout constraintLayout, View view, Group group, Button button, RecyclerView recyclerView, CheckBox checkBox) {
        this.a = (byte) 21;
        this.b = view;
        this.c = group;
        this.d = button;
        this.e = checkBox;
    }

    public lag(Executor executor) {
        this.a = (byte) 13;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = d1i.z;
        this.b = executor;
    }
}
