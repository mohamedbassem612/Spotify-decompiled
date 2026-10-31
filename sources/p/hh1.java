package p;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hh1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(pfj0 pfj0Var, boolean z, MessageTemplate messageTemplate, gr91 gr91Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 14;
        this.c = pfj0Var;
        this.b = z;
        this.d = messageTemplate;
        this.f = gr91Var;
        this.e = iu30Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        s8w0 s8w0Var = (s8w0) this.f;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        ArrayList arrayList = (ArrayList) this.d;
        e9w0 e9w0Var = (e9w0) this.c;
        String str = e9w0Var.e;
        boolean z = this.b;
        Object obj4 = this.e;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-752861508);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            o8w0 o8w0Var = (o8w0) obj4;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar2);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            kkn.e(0, str, x340Var2, (qim0) null);
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((e311) it.next()).f);
            }
            kkn.g(e9w0Var, arrayList2, o8w0Var, s8w0Var, u291.f(nim0Var, 1.0f), x340Var2, 4096);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-752332214);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            o8w0 o8w0Var2 = (o8w0) obj4;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var3, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarF2);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var3, lljVar4);
            nko1.H(xos0VarM2, x340Var3, lljVar3);
            nko1.H(Integer.valueOf(iHashCode2), x340Var3, lljVar2);
            nko1.F(x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar);
            kkn.e(0, str, x340Var3, (qim0) null);
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((e311) it2.next()).f);
            }
            kkn.g(e9w0Var, arrayList3, o8w0Var2, s8w0Var, u291.j(120.0f, 0.0f, 2, new wnb0(1.0f, true)), x340Var3, 4096);
            x340Var3.r(true);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        r541 r541Var = (r541) this.c;
        String str = r541Var.n;
        gft0 gft0Var = (gft0) this.d;
        tyq tyqVar = (tyq) this.e;
        idm idmVar = (idm) this.f;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        nb51.b(r541Var.g, r541Var.i, r541Var.h, x340Var, 0);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        fra fraVar = een.N0;
        jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        boolean z2 = false;
        jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var, 0);
        int iHashCode3 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM3 = x340Var3.m();
        qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA2, x340Var, lljVar);
        nko1.H(xos0VarM3, x340Var, lljVar2);
        i3a.l(iHashCode3, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE3, x340Var, lljVar4);
        otw.c(tyqVar, new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), eqr0.D(-12.0f, 0.0f, 2, anm1.N("curation_button", nim0Var)), (ipb1) null, x340Var, 0, 8);
        otw.c(idmVar, new wcm(str, r541Var.m, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1020), anm1.N("context_menu", nim0Var), (ipb1) null, x340Var, 0, 8);
        x340Var3.r(true);
        if (!this.b && r541Var.l == qtt0.b) {
            z2 = true;
        }
        otw.c(gft0Var, new qet0(str, z2, false, new oet0(), 4), anm1.N("play_button", nim0Var), (ipb1) null, x340Var, 64, 8);
        x340Var3.r(true);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        pt ptVar = (pt) this.c;
        ti81 ti81Var = (ti81) this.d;
        Function0 function0 = (Function0) this.e;
        Function0 function1 = (Function0) this.f;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        ptVar.w(6, apo.r(-1517937873, new ofi0(ti81Var, ptVar, function0, function1, this.b), x340Var), x340Var);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        MessageTemplate messageTemplate;
        Object obj4;
        x340 x340Var;
        Button button;
        iu30 iu30Var;
        boolean z;
        iu30 iu30Var2 = (iu30) this.e;
        gr91 gr91Var = (gr91) this.f;
        i2c i2cVar = (i2c) obj;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0Var = nim0.a;
        qim0 qim0VarF = u291.f(qim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        kfj0 kfj0Var = ((pfj0) this.c).b;
        Button button2 = kfj0Var.d;
        MessageText messageText = kfj0Var.b;
        d36 d36Var = new d36(8.0f, false, new g21(kfj0Var.e == null ? een.N0 : een.Z, (byte) 28));
        Object obj5 = this.d;
        MessageTemplate messageTemplate2 = (MessageTemplate) obj5;
        mbh mbhVarA = jbh.a(d36Var, een.P0, b0kVar, 0);
        x340 x340Var2 = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarF);
        hzj.A.getClass();
        x340 x340Var3 = (x340) b0kVar;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, b0kVar, y580.O0);
        nko1.H(xos0VarM, b0kVar, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar, y580.R0);
        nko1.F(b0kVar);
        nko1.H(qim0VarE, b0kVar, y580.Y);
        Header header = kfj0Var.a;
        bjc0 bjc0Var = bjc0.a;
        if (header == null) {
            x340Var3.i0(-1439841423);
            x340Var3.r(false);
            obj4 = obj5;
            messageTemplate = messageTemplate2;
        } else {
            x340Var3.i0(-1439841422);
            messageTemplate = messageTemplate2;
            obj4 = obj5;
            y9j0.g(header, messageTemplate, uyn1.B(anm1.N("messaging_snackbar_header_content", u291.f(qim0Var, 1.0f)), 0.0f, 0.0f, cbx.b(b0kVar).b.b, 0.0f, 11), 5, bjc0Var, b0kVar, Header.$stable);
            b0kVar = b0kVar;
            x340Var3.r(false);
        }
        b0k b0kVar2 = b0kVar;
        MessageTemplate messageTemplate3 = messageTemplate;
        y9j0.c(0, 5, 0, 848, v9p1.P(v9p1.D(messageTemplate, b0kVar), messageText.getTextColor()), messageTemplate3, messageText.getText(), (String) null, b0kVar2, (iu30) null, bjc0Var, uyn1.B(anm1.N("messaging_snackbar_body", u291.f(qim0Var, 1.0f)), 0.0f, 0.0f, cbx.b(b0kVar).b.b, 0.0f, 11), (lee1) null);
        boolean z2 = this.b;
        if (z2) {
            qim0Var = qim0Var;
            x340Var = x340Var3;
            button = button2;
            iu30Var = iu30Var2;
            z = false;
            x340Var.i0(-1438548040);
            x340Var.r(false);
        } else {
            x340Var3.i0(1616153586);
            if (button2 == null) {
                x340Var3.i0(-1438846385);
                x340Var3.r(false);
                x340Var = x340Var3;
                button = button2;
                z = false;
                iu30Var = iu30Var2;
            } else {
                x340Var3.i0(-1438846384);
                x340Var = x340Var3;
                z = false;
                button = button2;
                iu30Var = iu30Var2;
                gr91Var.b(button, messageTemplate3, iu30Var, (qim0) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), 0, b0kVar2, Button.$stable, 40);
                x340Var.r(false);
            }
            x340Var.r(z);
        }
        x340Var.r(true);
        if (z2) {
            x340Var.i0(-1552046727);
            if (button == null) {
                x340Var.i0(-868808280);
                x340Var.r(z);
            } else {
                x340Var.i0(-868808279);
                qim0 qim0VarA = i2cVar.a(u291.x(0.0f, i2cVar.d() * 0.3f, 1, qim0Var), een.i);
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                gr91Var.b(button, (MessageTemplate) obj4, iu30Var, qim0VarA, new zzq0(8.0f, 0.0f, 8.0f, 0.0f), 6, b0kVar2, Button.$stable, 0);
                x340Var.r(z);
            }
            x340Var.r(z);
        } else {
            x340Var.i0(-868238034);
            x340Var.r(z);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        boolean z;
        wat watVar;
        c380 c380Var;
        int i;
        int iMin;
        boolean z2;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.e;
        Object obj4 = fkj0.X;
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).n;
        yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
        x340 x340Var2 = x340Var;
        Object objK = x340Var2.k(t4k.h);
        j06 j06Var = x340Var2.a;
        wat watVar2 = (wat) objK;
        zov0 zov0Var = cbx.b(x340Var2).g;
        cvx cvxVar = cbx.b(x340Var2).b;
        c380 c380Var2 = (c380) this.c;
        int size = c380Var2.size();
        x340Var2.i0(1820290304);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        float fX0 = watVar2.X0(8.0f);
        x340Var2.r(false);
        float fH = watVar2.h();
        float fU0 = watVar2.U0();
        Object obj5 = this.d;
        boolean zG = x340Var2.g((String) obj5) | x340Var2.g(lee1Var) | x340Var2.d(fH) | x340Var2.d(fU0);
        String str = (String) obj5;
        Object objT = x340Var2.T();
        if (zG || objT == obj4) {
            z = true;
            watVar = watVar2;
            c380Var = c380Var2;
            i = size;
            objT = Integer.valueOf((int) (yae1.a(yae1VarQ, str, lee1Var, 0, false, 1, 0L, (flb0) null, (xat) null, 996).c >> 32));
            x340Var2.s0(objT);
        } else {
            watVar = watVar2;
            c380Var = c380Var2;
            i = size;
            z = true;
        }
        int iIntValue = ((Number) objT).intValue();
        float fX1 = watVar.X0(16.0f);
        float fX2 = watVar.X0(12.0f);
        float fI = (hjl.i(i2cVar.b) - iIntValue) - fX0;
        if (i == 0 || fI < fX1) {
            iMin = 0;
        } else {
            iMin = fX2 <= 0.0f ? i : Math.min(i, ((int) ((fI - fX1) / fX2)) + 1);
        }
        Integer numValueOf = Integer.valueOf(iMin);
        boolean zG2 = x340Var2.g(iu30Var) | x340Var2.e(iMin);
        Object objT2 = x340Var2.T();
        if (zG2 || objT2 == obj4) {
            objT2 = new f8f1(iu30Var, iMin, (byte) 3);
            x340Var2.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        if (x340Var2.g(numValueOf) | x340Var2.g(iu30Var)) {
            qxd0.S(function0, x340Var2);
        }
        c380 c380Var3 = c380Var;
        boolean zG3 = x340Var2.g(c380Var3) | x340Var2.e(iMin);
        Object objT3 = x340Var2.T();
        if (zG3 || objT3 == obj4) {
            objT3 = mqo1.A(o7h.d1(c380Var3, iMin));
            x340Var2.s0(objT3);
        }
        c380 c380Var4 = (c380) objT3;
        boolean z3 = (!this.b || iMin <= 0) ? false : z;
        fra fraVar = een.N0;
        cvx cvxVar3 = cbx.b(x340Var2).b;
        d36 d36Var = new d36(8.0f, z, new um5(false));
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        String str2 = (String) obj5;
        iu30 iu30Var2 = (iu30) this.f;
        jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        boolean z4 = x340Var2.S;
        n4k n4kVar = hmb0.t1;
        if (z4) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(jw31VarA, x340Var2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, lljVar2);
        Integer numValueOf2 = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf2, x340Var2, lljVar3);
        nko1.F(x340Var2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar4);
        uwo1.e(str2, new wnb0(1.0f, false), lee1Var, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1712);
        boolean zH = x340Var2.h(z3) | x340Var2.g(iu30Var2);
        Object objT4 = x340Var2.T();
        if (zH || objT4 == obj4) {
            objT4 = new rid(z3, iu30Var2, (byte) 2);
            x340Var2.s0(objT4);
        }
        qim0 qim0VarX = ern1.x(nim0Var, (iu30) objT4);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(gfh0VarC, x340Var2, lljVar);
        nko1.H(xos0VarM2, x340Var2, lljVar2);
        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
        nko1.H(qim0VarE2, x340Var2, lljVar4);
        if (z3) {
            x340Var2.i0(11771719);
            z2 = false;
            k2g1.d(c380Var4, (qim0) null, x340Var2, 0);
        } else {
            z2 = false;
            x340Var2.i0(364966536);
        }
        x340Var2.r(z2);
        x340Var2.r(true);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        nbh nbhVar = (nbh) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(nbhVar) ? 4 : 2;
        }
        boolean z = true;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            wj31 wj31Var = (wj31) this.c;
            List list = (List) this.d;
            if (!this.b && !((Boolean) ((tob1) this.f).getValue()).booleanValue()) {
                z = false;
            }
            ern1.a(nbhVar, wj31Var, list, z, (tob1) this.e, x340Var2, iIntValue & 14);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        int iIntValue = ((Number) obj3).intValue();
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        x340 x340Var = (b0k) obj2;
        boolean zH = x340Var.h(this.b);
        y0k1 y0k1Var = (y0k1) this.c;
        boolean zG = zH | x340Var.g(y0k1Var);
        Object obj4 = this.d;
        boolean zG2 = zG | x340Var.g((Function0) obj4);
        Object obj5 = this.e;
        boolean zG3 = zG2 | x340Var.g((Function0) obj5);
        Object obj6 = this.f;
        boolean zG4 = zG3 | x340Var.g((Function0) obj6) | x340Var.h(true);
        Function0 function0 = (Function0) obj4;
        Function0 function1 = (Function0) obj5;
        Function0 function2 = (Function0) obj6;
        Object objT = x340Var.T();
        if (zG4 || objT == fkj0.X) {
            o96 o96Var = new o96(this.b, y0k1Var, function0, function1, function2, (byte) 14);
            x340Var.s0(o96Var);
            objT = o96Var;
        }
        ujo1.d(qim0VarD, (xtb0) null, vzq0Var, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, (iIntValue << 6) & 896, 506);
        return rih1.a;
    }

    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v41 */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String strU;
        String strU2;
        List list;
        ?? r10;
        ?? r11;
        b0k b0kVar;
        oux nuxVar;
        x340 x340Var;
        byte b = this.a;
        f36 f36Var = h36.c;
        u5j1 u5j1Var = d4o1.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.d;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                vzq0 vzq0Var = (vzq0) obj;
                int iIntValue = ((Number) obj3).intValue();
                d36 d36Var = new d36(16.0f, true, new um5(false));
                qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                xtb0 xtb0Var = (xtb0) obj5;
                yg1 yg1Var = (yg1) obj6;
                x340 x340Var2 = (b0k) obj2;
                boolean zG = x340Var2.g(yg1Var);
                boolean z3 = this.b;
                iu30 iu30Var = (iu30) obj7;
                boolean zH = x340Var2.h(z3) | zG | x340Var2.g(iu30Var);
                af10 af10Var = (af10) obj4;
                boolean zI = zH | x340Var2.i(af10Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    gh1 gh1Var = new gh1(z3, yg1Var, iu30Var, af10Var, (byte) 0);
                    x340Var2.s0(gh1Var);
                    objT = gh1Var;
                }
                ujo1.d(qim0VarC, xtb0Var, vzq0Var, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, (iIntValue << 6) & 896, 488);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                String strN0 = (String) obj4;
                Function0 function0 = (Function0) obj7;
                m4c m4cVar = fkj0.X;
                jwm jwmVar = (jwm) obj6;
                c380 c380Var = (c380) obj5;
                x340 x340Var3 = (b0k) obj2;
                boolean zG2 = x340Var3.g(c380Var);
                Object objT2 = x340Var3.T();
                dwm dwmVar = dwm.a;
                Object obj8 = objT2;
                if (zG2 || objT2 == m4cVar) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj9 : c380Var) {
                        if (!u890.j(((jwm) obj9).c, dwmVar)) {
                            arrayList.add(obj9);
                        }
                    }
                    x340Var3.s0(arrayList);
                    obj8 = arrayList;
                }
                List list2 = (List) obj8;
                boolean z4 = list2.size() == 1 && !u890.j(jwmVar.c, dwmVar);
                boolean zG3 = x340Var3.g(list2) | x340Var3.h(z4);
                Object objT3 = x340Var3.T();
                if (zG3 || objT3 == m4cVar) {
                    List listN0 = z4 ? o7h.N0(list2, Collections.singletonList(jwmVar)) : list2;
                    ArrayList arrayList2 = new ArrayList(q7h.U(listN0, 10));
                    Iterator it = listN0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((jwm) it.next()).a);
                    }
                    objT3 = mqo1.A(arrayList2);
                    x340Var3.s0(objT3);
                }
                c380 c380Var2 = (c380) objT3;
                boolean zG4 = x340Var3.g(function0);
                Object objT4 = x340Var3.T();
                if (zG4 || objT4 == m4cVar) {
                    objT4 = new pj8(function0, (byte) 28);
                    x340Var3.s0(objT4);
                }
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarX = bin.x(nim0Var2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15);
                Parcelable.Creator creator = w4i1.CREATOR;
                aqo1.f(6, 0, x340Var3, hcx.e, c380Var2, qim0VarX);
                if (strN0 != null && !ihc1.y0(strN0)) {
                    x340Var3.i0(1736405777);
                    x340Var3.r(false);
                } else if (list2.size() > 1) {
                    x340Var3.i0(1736407995);
                    x340Var3.r(false);
                    strN0 = o7h.y0(o7h.a1(list2, new p0d((byte) 4)), ", ", (String) null, (String) null, nve.i, 30);
                } else if (list2.size() == 1) {
                    x340Var3.i0(-2005858987);
                    strN0 = cwl1.n0(2131953617, new Object[]{jwmVar.a.b}, x340Var3) + ", " + ((jwm) o7h.q0(list2)).a.b;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1736418008);
                    strN0 = cwl1.n0(2131953617, new Object[]{jwmVar.a.b}, x340Var3);
                    x340Var3.r(false);
                }
                String str = strN0;
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var3).e;
                long j = cbx.a(x340Var3).b.a;
                cjc0 cjc0Var = new cjc0(1);
                cvx cvxVar = cbx.b(x340Var3).b;
                uwo1.e(str, uyn1.z(0.0f, 8.0f, 1, nim0Var2), lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var3, 0, 0, 1712);
                x340Var3.i0(1773323934);
                ArrayList arrayListN0 = o7h.N0(c380Var, Collections.singletonList(jwmVar));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj10 : arrayListN0) {
                    jwm jwmVar2 = (jwm) obj10;
                    if (!u890.j(jwmVar2.c, ewm.a) && !u890.j(jwmVar2.c, dwmVar)) {
                        arrayList3.add(obj10);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj11 : arrayList3) {
                    if (u890.j(((jwm) obj11).c, cwm.a)) {
                        arrayList4.add(obj11);
                    } else {
                        arrayList5.add(obj11);
                    }
                }
                if (arrayList4.isEmpty()) {
                    z = false;
                    strU = x0d.k(x340Var3, 996049901, 2131953619, x340Var3, false);
                } else {
                    z = false;
                    x340Var3.i0(-937698089);
                    strU = cwl1.U(2131820609, arrayList4.size(), new Object[]{Integer.valueOf(arrayList4.size())}, x340Var3);
                    x340Var3.r(false);
                    if (z2) {
                        strU2 = x0d.k(x340Var3, -937691420, 2131953618, x340Var3, false);
                    } else if (arrayList5.isEmpty()) {
                        x340Var3.i0(996437120);
                        x340Var3.r(false);
                        strU2 = "";
                    } else {
                        x340Var3.i0(-937687244);
                        strU2 = cwl1.U(2131820610, arrayList5.size(), new Object[]{Integer.valueOf(arrayList5.size())}, x340Var3);
                        x340Var3.r(false);
                    }
                    if (strU2.length() > 0) {
                        strU = xcg1.i(strU, " ", strU2);
                    }
                }
                x340Var3.r(z);
                String str2 = strU;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(x340Var3).j, cbx.a(x340Var3).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var3, 0, 0, 1714);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                sn51 sn51Var = (sn51) obj4;
                m4c m4cVar2 = fkj0.X;
                ewe1 ewe1Var = (ewe1) obj6;
                iu30 iu30Var2 = (iu30) obj7;
                b0k b0kVar3 = (x340) b0kVar2;
                if (b0kVar3.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    oih oihVar = (oih) obj5;
                    boolean zG5 = b0kVar3.g(iu30Var2) | b0kVar3.i(ewe1Var);
                    boolean z5 = this.b;
                    boolean zH2 = b0kVar3.h(z5) | zG5;
                    Object objT5 = b0kVar3.T();
                    if (zH2 || objT5 == m4cVar2) {
                        objT5 = new vm1(iu30Var2, ewe1Var, z5, (byte) 5);
                        b0kVar3.s0(objT5);
                    }
                    Function0 function1 = (Function0) objT5;
                    boolean zG6 = b0kVar3.g(iu30Var2) | b0kVar3.i(ewe1Var) | b0kVar3.i(sn51Var) | b0kVar3.h(z5);
                    Object objT6 = b0kVar3.T();
                    if (zG6 || objT6 == m4cVar2) {
                        zg6 zg6Var = new zg6(iu30Var2, ewe1Var, sn51Var, z5, (byte) 2);
                        b0kVar3.s0(zg6Var);
                        objT6 = zg6Var;
                    }
                    oihVar.l(ewe1Var, function1, (Function0) objT6, null, b0kVar3, 0);
                } else {
                    b0kVar3.b0();
                }
                return rih1Var;
            case 3:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                ldo ldoVar = (ldo) obj6;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                ann annVar = (ann) obj7;
                List list3 = annVar.f;
                hux huxVar = annVar.a;
                imn imnVar = (imn) obj5;
                imn imnVar2 = imn.b;
                nim0 nim0Var3 = nim0.a;
                if (imnVar == imnVar2) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(452645711);
                    gfh0 gfh0VarC = t1c.c(een.i, false);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    list = list3;
                    qim0 qim0VarE = zr7.E(x340Var5, nim0Var3);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(n4kVar);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(gfh0VarC, x340Var5, lljVar4);
                    nko1.H(xos0VarM, x340Var5, lljVar3);
                    x0d.q(iHashCode, x340Var5, lljVar2, x340Var5);
                    nko1.H(qim0VarE, x340Var5, lljVar);
                    ldoVar.e(annVar.a, null, this.b, annVar.g.equals(omn.a), x340Var5, 8);
                    x340Var5.r(true);
                    r10 = 0;
                    x340Var5.r(false);
                } else {
                    list = list3;
                    r10 = 0;
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(452893649);
                    x340Var6.r(false);
                }
                fra fraVar = een.N0;
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var4).b;
                String str3 = (String) obj4;
                jw31 jw31VarA = ew31.a(new d36(6.0f, true, new um5((boolean) r10)), fraVar, x340Var4, (int) r10);
                x340 x340Var7 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, nim0Var3);
                hzj.A.getClass();
                x340 x340Var8 = x340Var4;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(jw31VarA, x340Var4, lljVar4);
                nko1.H(xos0VarM2, x340Var4, lljVar3);
                i3a.l(iHashCode2, x340Var4, lljVar2, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar);
                if (imnVar != imn.a) {
                    x340Var8.i0(93498169);
                    r11 = 0;
                    x340Var8.r(false);
                } else {
                    r11 = 0;
                    if (z2) {
                        x340Var8.i0(93499130);
                        ldoVar.j(huxVar, null, x340Var4, 8);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(93501352);
                        cvx cvxVar3 = cbx.b(x340Var4).b;
                        ldoVar.n(huxVar, uyn1.B(nim0Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11), x340Var4, 8);
                        r11 = 0;
                        x340Var8.r(false);
                    }
                }
                wnb0 wnb0Var = new wnb0(1.0f, (boolean) r11);
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var4, (int) r11);
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, wnb0Var);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(mbhVarA, x340Var4, lljVar4);
                nko1.H(xos0VarM3, x340Var4, lljVar3);
                i3a.l(iHashCode3, x340Var4, lljVar2, x340Var4);
                nko1.H(qim0VarE3, x340Var4, lljVar);
                j2i j2iVarR = apo.r(1052797304, new pji(str3, (byte) 21), x340Var4);
                List list4 = list;
                n9p1.i(384, list4, j2iVarR, x340Var4, (qim0) null);
                i9p1.p(384, list4, apo.r(2048337008, new kf2(annVar, z2, ldoVar), x340Var4), x340Var4, (qim0) null);
                x340Var8.r(true);
                x340Var8.r(true);
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                float f = xd20.b;
                qim0 qim0VarB = uyn1.B(nim0.a, f, 0.0f, 0.0f, 0.0f, 14);
                c9 c9Var = (c9) obj5;
                zc20 zc20Var = (zc20) obj6;
                iu30 iu30Var3 = (iu30) obj7;
                yc20 yc20Var = (yc20) obj4;
                jw31 jw31VarA2 = ew31.a(new d36(f, true, new um5(false)), een.Z, x340Var9, 6);
                x340 x340Var10 = x340Var9;
                int iHashCode4 = Long.hashCode(x340Var10.T);
                xos0 xos0VarM4 = x340Var10.m();
                qim0 qim0VarE4 = zr7.E(x340Var9, qim0VarB);
                hzj.A.getClass();
                x340 x340Var11 = x340Var9;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(n4kVar);
                } else {
                    x340Var11.v0();
                }
                nko1.H(jw31VarA2, x340Var9, y580.O0);
                nko1.H(xos0VarM4, x340Var9, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var9, y580.R0);
                nko1.F(x340Var9);
                nko1.H(qim0VarE4, x340Var9, y580.Y);
                x340Var11.i0(-367768614);
                ListIterator listIterator = c9Var.listIterator(0);
                int i = 0;
                while (listIterator.hasNext()) {
                    Object next = listIterator.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    zc20 zc20Var2 = (zc20) next;
                    x340Var11.f0(357946592, zc20Var2.c);
                    boolean zEquals = zc20Var2.equals(zc20Var);
                    fq7.f(zEquals || zc20Var == null, hxo1.l(), xd20.a, ln00.b, (String) null, apo.r(-564730287, new wd20(zc20Var2, i, zEquals, this.b, iu30Var3, yc20Var), x340Var9), x340Var9, 1575942, 16);
                    x340Var11.r(false);
                    iu30Var3 = iu30Var3;
                    i = i2;
                    yc20Var = yc20Var;
                }
                x340Var11.r(false);
                x340Var11.r(true);
                return rih1Var;
            case 5:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                d9p1.h(z2 ? 1 : 2, 24576, apo.r(1630732736, new cb60((pl80) obj5, (iu30) obj7, (iu30) obj6, (kl80) obj4), b0kVar4), b0kVar4, uyn1.z(16.0f, 0.0f, 2, nim0Var));
                return rih1Var;
            case 6:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                cvx cvxVar4 = cbx.b(b0kVar5).b;
                nim0 nim0Var4 = nim0.a;
                qim0 qim0VarF = u291.f(uyn1.B(nim0Var4, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                cvx cvxVar5 = cbx.b(b0kVar5).b;
                rwi0 rwi0Var = (rwi0) obj5;
                ven0 ven0Var = (ven0) obj6;
                Function0 function2 = (Function0) obj7;
                Function0 function3 = (Function0) obj4;
                mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, b0kVar5, 0);
                x340 x340Var12 = (x340) b0kVar5;
                int iHashCode5 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM5 = x340Var12.m();
                qim0 qim0VarE5 = zr7.E(b0kVar5, qim0VarF);
                hzj.A.getClass();
                x340 x340Var13 = (x340) b0kVar5;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA2, b0kVar5, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM5, b0kVar5, lljVar6);
                Integer numValueOf = Integer.valueOf(iHashCode5);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf, b0kVar5, lljVar7);
                nko1.F(b0kVar5);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE5, b0kVar5, lljVar8);
                String str4 = rwi0Var.b;
                String str5 = rwi0Var.e;
                uwo1.e(str4, (qim0) null, (lee1) null, cbx.a(b0kVar5).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar5, 0, 0, 2038);
                qim0 qim0VarJ = u291.j(0.0f, 32.0f, 1, new tq60(een.R0));
                cvx cvxVar6 = cbx.b(b0kVar5).b;
                jw31 jw31VarA3 = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, b0kVar5, 0);
                int iHashCode6 = Long.hashCode(x340Var13.T);
                xos0 xos0VarM6 = x340Var13.m();
                qim0 qim0VarE6 = zr7.E(b0kVar5, qim0VarJ);
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(jw31VarA3, b0kVar5, lljVar5);
                nko1.H(xos0VarM6, b0kVar5, lljVar6);
                i3a.l(iHashCode6, b0kVar5, lljVar7, b0kVar5);
                nko1.H(qim0VarE6, b0kVar5, lljVar8);
                if (rwi0Var.c && z2) {
                    x340Var13.i0(-1175383584);
                    jdx jdxVar = jdx.c;
                    qim0 qim0VarN = anm1.N("message-box-ui-dismiss-button", nim0Var4);
                    String strO0 = cwl1.o0(b0kVar5, 2131956216);
                    boolean zI2 = x340Var13.i(ven0Var) | x340Var13.g(function2);
                    Object objT7 = x340Var13.T();
                    if (zI2 || objT7 == fkj0.X) {
                        objT7 = new swi0(ven0Var, function2, (byte) 0);
                        x340Var13.s0(objT7);
                    }
                    Function0 function4 = (Function0) objT7;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    } else {
                        b0kVar = b0kVar5;
                        ouo1.n(cwl1.o0(b0kVar5, 2131958564), new gbx(new y50(strO0), function4), jdxVar, qim0VarN, b0kVar, 0);
                        x340Var13.r(false);
                    }
                    return null;
                }
                b0kVar = b0kVar5;
                x340Var13.i0(-1174698856);
                x340Var13.r(false);
                if (str5 != null) {
                    x340Var13.i0(-1174618349);
                    idx idxVar = new idx(6);
                    qim0 qim0VarN2 = anm1.N("message-box-ui-action-button", nim0Var4);
                    if (ihc1.y0(str5)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    ouo1.n(rwi0Var.e, new gbx(new y50(str5), function3), idxVar, qim0VarN2, b0kVar, 0);
                    x340Var13.r(false);
                } else {
                    x340Var13.i0(-1174228648);
                    x340Var13.r(false);
                }
                x340Var13.r(true);
                x340Var13.r(true);
                return rih1Var;
            case 7:
                x340 x340Var14 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarY = voo1.y(u291.f(nim0Var, 1.0f), voo1.g);
                lis0 lis0Var = (lis0) obj5;
                iu30 iu30Var4 = (iu30) obj7;
                Function0 function5 = (Function0) obj6;
                vu30 vu30Var = (vu30) obj4;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var14, 0);
                x340 x340Var15 = x340Var14;
                int iHashCode7 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM7 = x340Var15.m();
                qim0 qim0VarE7 = zr7.E(x340Var14, qim0VarY);
                hzj.A.getClass();
                x340 x340Var16 = x340Var14;
                if (x340Var16.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var16.m0();
                if (x340Var16.S) {
                    x340Var16.l(n4kVar);
                } else {
                    x340Var16.v0();
                }
                nko1.H(mbhVarA3, x340Var14, y580.O0);
                nko1.H(xos0VarM7, x340Var14, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var14, y580.R0);
                nko1.F(x340Var14);
                nko1.H(qim0VarE7, x340Var14, y580.Y);
                zqo1.g(lis0Var.a, iu30Var4, function5, x340Var14, 0);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar5 = cbx.a;
                cvx cvxVar7 = cbx.b(x340Var14).b;
                op71.g(x340Var14, dug.f(u291.h(uyn1.z(0.0f, 8.0f, 1, qim0VarF2), 1.0f), cbx.a(x340Var14).a.b.c(), u5j1Var));
                x340Var16.i0(1303899803);
                int i3 = 0;
                for (Object obj12 : lis0Var.b) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    kis0 kis0Var = (kis0) obj12;
                    boolean zG7 = x340Var16.g(vu30Var) | x340Var16.e(i3) | x340Var16.g(kis0Var);
                    Object objT8 = x340Var16.T();
                    if (zG7 || objT8 == fkj0.X) {
                        objT8 = new wv1(vu30Var, i3, kis0Var, (byte) 20);
                        x340Var16.s0(objT8);
                    }
                    zqo1.i(kis0Var, z2, (Function0) objT8, x340Var14, 0);
                    i3 = i4;
                }
                x340Var16.r(false);
                x340Var16.r(true);
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar6 = cbx.a;
                cvx cvxVar8 = cbx.b(x340Var17).b;
                d36 d36Var2 = new d36(8.0f, true, new um5(false));
                fra fraVar2 = een.N0;
                String str6 = (String) obj5;
                String str7 = (String) obj6;
                String str8 = (String) obj7;
                String str9 = (String) obj4;
                jw31 jw31VarA4 = ew31.a(d36Var2, fraVar2, x340Var17, 0);
                x340 x340Var18 = x340Var17;
                int iHashCode8 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM8 = x340Var18.m();
                qim0 qim0VarE8 = zr7.E(x340Var17, qim0VarF3);
                hzj.A.getClass();
                x340 x340Var19 = x340Var17;
                if (x340Var19.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(jw31VarA4, x340Var17, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM8, x340Var17, lljVar10);
                Integer numValueOf2 = Integer.valueOf(iHashCode8);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf2, x340Var17, lljVar11);
                nko1.F(x340Var17);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE8, x340Var17, lljVar12);
                zov0 zov0Var = cbx.b(x340Var17).g;
                qim0 qim0VarF4 = dug.f(i1p1.q(u291.r(nim0Var, 64.0f), er31.b(2.0f)), cbx.a(x340Var17).a.b.a(), u5j1Var);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode9 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM9 = x340Var19.m();
                qim0 qim0VarE9 = zr7.E(x340Var17, qim0VarF4);
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                nko1.H(gfh0VarC2, x340Var17, lljVar9);
                nko1.H(xos0VarM9, x340Var17, lljVar10);
                i3a.l(iHashCode9, x340Var17, lljVar11, x340Var17);
                nko1.H(qim0VarE9, x340Var17, lljVar12);
                Uri uri = Uri.parse(str6);
                zov0 zov0Var2 = cbx.b(x340Var17).g;
                h6m h6mVar = mif1.Q0;
                if (z2) {
                    nuxVar = oux.a;
                } else {
                    box boxVar = box.c;
                    nuxVar = new nux(boxVar, boxVar);
                }
                oux ouxVar = nuxVar;
                cvx cvxVar9 = cbx.b(x340Var17).b;
                eso1.e(uri, isl.a, anm1.N("physical_book_sale_button_image", uyn1.x(nim0Var, 4.0f)), new p3v(64.0f), (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var17, 48, 0, 3504);
                x340Var19.r(true);
                wnb0 wnb0Var2 = new wnb0(1.0f, true);
                cvx cvxVar10 = cbx.b(x340Var17).b;
                mbh mbhVarA4 = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var17, 0);
                int iHashCode10 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM10 = x340Var19.m();
                qim0 qim0VarE10 = zr7.E(x340Var17, wnb0Var2);
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                nko1.H(mbhVarA4, x340Var17, lljVar9);
                nko1.H(xos0VarM10, x340Var17, lljVar10);
                i3a.l(iHashCode10, x340Var17, lljVar11, x340Var17);
                nko1.H(qim0VarE10, x340Var17, lljVar12);
                uwo1.e(str7, (qim0) null, cbx.d(x340Var17).h, cbx.a(x340Var17).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2034);
                if (str8.length() > 0) {
                    x340Var19.i0(581895800);
                    cvx cvxVar11 = cbx.b(x340Var17).b;
                    jw31 jw31VarA5 = ew31.a(new d36(2.0f, true, new um5(false)), fraVar2, x340Var17, 0);
                    int iHashCode11 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM11 = x340Var19.m();
                    qim0 qim0VarE11 = zr7.E(x340Var17, nim0Var);
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(jw31VarA5, x340Var17, lljVar9);
                    nko1.H(xos0VarM11, x340Var17, lljVar10);
                    i3a.l(iHashCode11, x340Var17, lljVar11, x340Var17);
                    nko1.H(qim0VarE11, x340Var17, lljVar12);
                    uwo1.e(str8, (qim0) null, cbx.d(x340Var17).k, cbx.a(x340Var17).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2034);
                    uwo1.e("• ".concat(str9), (qim0) null, cbx.d(x340Var17).j, cbx.a(x340Var17).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2034);
                    x340Var19.r(true);
                    x340Var19.r(false);
                } else {
                    x340Var19.i0(582468649);
                    uwo1.e(str9, (qim0) null, cbx.d(x340Var17).j, cbx.a(x340Var17).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2034);
                    x340Var19.r(false);
                }
                x340Var19.r(true);
                x340Var19.r(true);
                return rih1Var;
            case 9:
                return a(obj, obj2, obj3);
            case 10:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                c380 c380Var3 = (c380) obj5;
                vu30 vu30Var2 = (vu30) obj6;
                vu30 vu30Var3 = (vu30) obj7;
                vu30 vu30Var4 = (vu30) obj4;
                mbh mbhVarA5 = jbh.a(f36Var, een.P0, x340Var20, 0);
                x340 x340Var21 = x340Var20;
                int iHashCode12 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM12 = x340Var21.m();
                qim0 qim0VarE12 = zr7.E(x340Var20, nim0Var);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(mbhVarA5, x340Var20, y580.O0);
                nko1.H(xos0VarM12, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode12), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE12, x340Var20, y580.Y);
                if (c380Var3.isEmpty()) {
                    x340Var = x340Var20;
                    x340Var22.i0(-761528071);
                    x340Var22.r(false);
                } else {
                    x340Var22.i0(-761817332);
                    u4p1.b(c380Var3, vu30Var2, vu30Var3, this.b, x340Var20, 0);
                    x340Var = x340Var20;
                    x340Var22.r(false);
                }
                if (vu30Var4 == null) {
                    x340Var22.i0(-761496080);
                } else {
                    x340Var22.i0(-1410037711);
                    vu30Var4.invoke(x340Var, 0);
                }
                x340Var22.r(false);
                x340Var22.r(true);
                return rih1Var;
            case 11:
                g2c g2cVar = (g2c) obj;
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                jmb1 jmb1Var = (jmb1) obj6;
                u4p1.u((String) obj5, jmb1Var.i, jmb1Var.j, (u37) obj7, (o27) obj4, (qim0) null, x340Var23, 0);
                if (z2) {
                    x340 x340Var24 = x340Var23;
                    x340Var24.i0(-2079588101);
                    u4p1.t(g2cVar.b(nim0Var), x340Var24, 0);
                    x340Var24.r(false);
                } else {
                    x340 x340Var25 = x340Var23;
                    x340Var25.i0(-2079496806);
                    x340Var25.r(false);
                }
                return rih1Var;
            case 12:
                return d(obj, obj2, obj3);
            case 13:
                return e(obj, obj2, obj3);
            case 14:
                return f(obj, obj2, obj3);
            case 15:
                return g(obj, obj2, obj3);
            case 16:
                return h(obj, obj2, obj3);
            case 17:
                return i(obj, obj2, obj3);
            default:
                cce cceVar = (cce) obj6;
                x340 x340Var26 = (b0k) obj2;
                ((Number) obj3).intValue();
                z0i z0iVar = (z0i) obj5;
                n1i n1iVar = n1i.a;
                n1i n1iVar2 = n1i.d;
                x340 x340Var27 = x340Var26;
                if (z0iVar == null) {
                    x340Var27.i0(618336918);
                    x340Var27.r(false);
                } else {
                    x340Var27.i0(618336919);
                    rwq.e(cceVar, (dbp) obj7, z0iVar, z2 ? n1iVar2 : n1iVar, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13), x340Var27, 0);
                    op71.g(x340Var27, dug.f(u291.h(nim0Var, 0.5f), u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), u5j1Var));
                    x340Var27.r(false);
                }
                rwq.e(cceVar, (dbp) obj7, (z0i) obj4, z2 ? n1iVar2 : n1iVar, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7), x340Var26, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(xtb0 xtb0Var, yg1 yg1Var, boolean z, iu30 iu30Var, af10 af10Var) {
        super(3);
        this.a = (byte) 0;
        this.c = xtb0Var;
        this.d = yg1Var;
        this.b = z;
        this.e = iu30Var;
        this.f = af10Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(lis0 lis0Var, iu30 iu30Var, Function0 function0, boolean z, vu30 vu30Var) {
        super(3);
        this.a = (byte) 7;
        this.c = lis0Var;
        this.e = iu30Var;
        this.d = function0;
        this.b = z;
        this.f = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh1(boolean z, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(boolean z, pl80 pl80Var, iu30 iu30Var, iu30 iu30Var2, kl80 kl80Var) {
        super(3);
        this.a = (byte) 5;
        this.b = z;
        this.c = pl80Var;
        this.e = iu30Var;
        this.d = iu30Var2;
        this.f = kl80Var;
    }
}
