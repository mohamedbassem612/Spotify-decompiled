package p;

import android.net.http.SslError;
import android.view.View;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ame extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ame(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj2;
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.a;
                String str2 = uv11Var.d;
                return (tgm) vu30Var.invoke(str, str2 != null ? str2 : "");
            case 1:
                ((ven0) obj).setValue(Boolean.FALSE);
                ((q7r0) obj2).c("");
                return rih1Var;
            case 2:
                ((iu30) obj2).invoke((xse) obj);
                return rih1Var;
            case 3:
                tkf tkfVar = (tkf) obj2;
                ((ven0) obj).setValue(new ydx0(tkfVar.b, tkfVar.d));
                return rih1Var;
            case 4:
                iaf iafVar = (iaf) obj2;
                String str3 = (String) obj;
                return new vd0((byte) 17, iafVar, str3, iafVar.b.l(Collections.singleton(str3)));
            case 5:
                w4i1 w4i1Var = ((xif) obj).f;
                ((iu30) obj2).invoke(new mif(w4i1Var.a, w4i1Var.e));
                return rih1Var;
            case 6:
                ((ven0) obj).setValue(Boolean.FALSE);
                ((flf) obj2).i.invoke();
                return rih1Var;
            case 7:
                ((iu30) obj2).invoke((h5f) obj);
                return rih1Var;
            case 8:
                mkp mkpVar = (mkp) ((wsf) obj2).d.a.c;
                mxr mxrVarA = mkpVar.a();
                ukp ukpVar = mkpVar.b;
                c9c0 c9c0VarB = ukpVar.b();
                c8o.l(c9c0VarB);
                nkp nkpVar = mkpVar.a;
                ser serVarA = nkpVar.a();
                sr90 sr90Var = mkpVar.c;
                cn30 cn30Var = new cn30(serVarA, (v5n) sr90Var.y.get(), sr90Var.e(), sr90Var.c(), (byte) 2);
                z1s z1sVarC = nkpVar.c();
                c8o.l(z1sVarC);
                l6s l6sVar = new l6s(c9c0VarB, cn30Var, z1sVarC);
                ukp ukpVar2 = ukpVar;
                c9c0 c9c0VarB2 = ukpVar2.b();
                c8o.l(c9c0VarB2);
                byp bypVarI = nkpVar.i();
                z1s z1sVarC2 = nkpVar.c();
                c8o.l(z1sVarC2);
                mxr mxrVar = new mxr(c9c0VarB2, bypVarI, z1sVarC2, sr90Var.c());
                tq90 tq90VarD = nkpVar.d();
                i3b i3bVar = new i3b(nkpVar.a(), (byte) 6);
                b0a0 b0a0VarD = ukpVar2.d();
                c8o.l(b0a0VarD);
                return new bmr(mxrVarA, l6sVar, mxrVar, tq90VarD, i3bVar, b0a0VarD, (u9c0) obj);
            case 9:
                o220 o220Var = (o220) obj;
                ((iu30) obj2).invoke(new ivf(!o220Var.d, o220Var.a));
                return rih1Var;
            case 10:
                SslError sslError = (SslError) obj;
                dsk0 dsk0Var = ((pyf) obj2).g2;
                if (dsk0Var == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                String strC = f4i1.c(sslError.getPrimaryError(), "SSL ");
                String url = sslError.getUrl();
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("page_error", (String) null, (Integer) null, url, strC));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 11:
                if (((Boolean) ((tob1) obj).getValue()).booleanValue()) {
                    ((Function0) obj2).invoke();
                }
                return rih1Var;
            case 12:
                if (((y7e1) obj2).d().d.length() > 0 && ((y7e1) obj).d().d.length() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                b6t b6tVar = (k6a1) obj2;
                if (b6tVar != null) {
                    b6tVar.a();
                }
                ((scx) obj).a();
                return rih1Var;
            case 14:
                ((Function0) obj).invoke();
                return rih1Var;
            case 15:
                ((iu30) obj2).invoke(new gat(((qat) obj).c));
                return rih1Var;
            case 16:
                ((iu30) obj2).invoke((lax) obj);
                return rih1Var;
            case 17:
                p811 p811Var = new p811();
                xpg xpgVar = (xpg) obj;
                return new kpg0(new br0(new cfd(xpgVar, p811Var)), new o0d(p811Var, xpgVar, ((g431) ((z1p) obj2).get()).a(uj1.w, new wj1(new syf(xpgVar, (byte) 14), (byte) 8)), (byte) 10));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                org orgVar = (org) obj2;
                if (orgVar != null) {
                    ((iu30) obj).invoke(orgVar);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                cug cugVar = (cug) obj2;
                lo9 lo9Var = (lo9) obj;
                cugVar.d = lo9Var;
                aug augVar = cugVar.j;
                w2k1 w2k1Var = cugVar.a;
                boolean z2 = cugVar.h;
                if (lo9Var == null) {
                    if (z2) {
                        cugVar.h = false;
                        w2k1Var.c.remove(augVar);
                        Iterator it = o7h.l1(cugVar.c.keySet()).iterator();
                        while (it.hasNext()) {
                            cugVar.e((VideoSurfaceView) it.next());
                        }
                        cugVar.a();
                    }
                } else if (z2) {
                    cugVar.f(true);
                } else {
                    cugVar.h = true;
                    w2k1Var.h(true);
                    w2k1Var.c.add(augVar);
                    Iterator it2 = w2k1Var.b.iterator();
                    while (it2.hasNext()) {
                        cugVar.b((VideoSurfaceView) it2.next());
                    }
                    cugVar.f(true);
                }
                return rih1Var;
            case 20:
                return new xzq((tyq) ((x6h) obj2).a.invoke((oud) obj), m4h.V0);
            case 21:
                ((iu30) obj2).invoke(x7h.a);
                ((c8h) obj).a.invoke();
                return rih1Var;
            case 22:
                return ((uhh) obj2).h.a(((mhh) obj).a, false);
            case 23:
                ulh ulhVar = (ulh) obj;
                xtb0 xtb0Var = (xtb0) obj2;
                qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l);
                int i = qtb0Var != null ? qtb0Var.a : 0;
                int i2 = xtb0Var.h().o;
                if (ulhVar.d != null && ulhVar.e == 1 && i >= i2 - 10) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                iu30 iu30Var = (iu30) obj2;
                c380 c380Var = ((kkh) obj).b;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it3 = c380Var.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((Reply) it3.next()).o());
                }
                iu30Var.invoke(new aph(o7h.p1(arrayList)));
                return rih1Var;
            case 25:
                ((View) obj2).announceForAccessibility((String) obj);
                return Boolean.TRUE;
            case 26:
                iu30 iu30Var2 = (iu30) obj2;
                ul0 ul0Var = (ul0) obj;
                String str4 = ul0Var.b;
                Boolean bool = ul0Var.e;
                iu30Var2.invoke(new pl0(str4, !((bool == null && (bool = ul0Var.d) == null) ? false : bool.booleanValue())));
                return rih1Var;
            case 27:
                ((iu30) obj2).invoke((bpt0) obj);
                return rih1Var;
            case 28:
                ((iu30) obj2).invoke(new yv7(((aw7) obj).b));
                return rih1Var;
            default:
                ((iu30) obj2).invoke(((nk9) obj).b ? jk9.a : kk9.a);
                return rih1Var;
        }
    }
}
