package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class htu extends hab0 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ htu(int i, byte b) {
        super(2);
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        wwy wwyVarG;
        wwy wwyVarG2;
        sx00 sx00Var;
        up70 up70VarA;
        goj0 goj0VarA;
        goj0 goj0VarA2;
        byte b = this.a;
        int i = 0;
        objArr = 0;
        Object[] objArr = 0;
        String str = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                itu.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                buu buuVar = (buu) obj2;
                return new euu(buuVar.a, ((duu) obj).a, buuVar.b, buuVar.c, buuVar.d, buuVar.e, buuVar.f);
            case 2:
                ((Number) obj2).intValue();
                qxy0.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                w6d1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                lfv lfvVar = (lfv) obj;
                iix0 iix0Var = (iix0) obj2;
                iix0 iix0VarI = fj30.I(iix0Var, lfvVar.b);
                if (iix0VarI != null) {
                    iix0Var = iix0VarI;
                }
                return new mfv(lfvVar, iix0Var);
            case 5:
                return new tfv((rfv) obj, (iix0) obj2);
            case 6:
                vtv vtvVar = (vtv) obj;
                Bundle bundle = (Bundle) obj2;
                str = bundle != null ? (kvv) jhc1.t(bundle, "model_state", kvv.class) : null;
                if (str == null) {
                    return new kvv(vtvVar.a, vtvVar.c, vtvVar.b, vtvVar.d, vtvVar.f, vtvVar.j, vtvVar.g, vtvVar.h, vtvVar.e, vtvVar.i, vtvVar.k, vtvVar.l, vtvVar.m, vtvVar.n, false, false, false, false, false, b7x.a, (w10) null, new gne(100, 0, false), new gne(300, 0, false));
                }
                return str;
            case 7:
                b7w b7wVar = (b7w) obj;
                d7w d7wVar = (f7w) obj2;
                d7w d7wVar2 = d7wVar instanceof d7w ? d7wVar : null;
                if (d7wVar2 != null) {
                    return hw2.i(d7wVar2, b7wVar).e();
                }
                return null;
            case 8:
                return z6x.a;
            case 9:
                szx szxVar = (szx) obj2;
                ContextTrack contextTrack = (ContextTrack) szxVar.a.track().b();
                boolean z = nhc1.Y(contextTrack.uri(), "spotify:track:", false) || (l4o1.O(contextTrack) && p7h.M(new e090[]{a090.a, b090.a}).contains(szxVar.b));
                String strF0 = l4o1.f0(contextTrack);
                if (strF0 == null) {
                    strF0 = "";
                }
                if (nhc1.Y(contextTrack.uri(), "spotify:track:", false)) {
                    i = 1;
                } else if (l4o1.O(contextTrack)) {
                    i = 4;
                }
                return new iem(strF0, i, z);
            case 10:
                ((Number) obj2).intValue();
                ha71.b((b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                wpb1.j((b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                twy twyVar = (twy) obj;
                wwy wwyVar = (ywy) obj2;
                boolean z2 = wwyVar instanceof wwy;
                if (z2) {
                    wwyVarG = wwy.g(wwyVar, twyVar.c, (wkt) null, (cuu0) null, (llw0) null, (vwy) null, 0, 4093);
                } else if (wwyVar instanceof uwy) {
                    wwyVarG = uwy.g((uwy) wwyVar, twyVar.a, twyVar.b, twyVar.c, (wkt) null, 56);
                } else {
                    if (!(wwyVar instanceof xwy)) {
                        eg.o();
                        return null;
                    }
                    wwyVarG = xwy.g((xwy) wwyVar, twyVar.a, twyVar.b, twyVar.c, null, 8);
                }
                Set setSingleton = w7x.a;
                if (z2 && (wwyVarG instanceof wwy)) {
                    wwy wwyVar2 = wwyVarG;
                    if (wwyVar.b != wwyVar2.b && wwyVar2.i == null && !(wwyVar2.e instanceof auu0)) {
                        setSingleton = Collections.singleton(new dwy(p8p1.G(wwyVar2)));
                    }
                }
                return Next.i(wwyVarG, setSingleton);
            case 13:
                twy twyVar2 = (twy) obj;
                wwy wwyVar3 = (ywy) obj2;
                boolean z3 = wwyVar3 instanceof wwy;
                if (z3) {
                    wwyVarG2 = wwy.g(wwyVar3, twyVar2.c, (wkt) null, (cuu0) null, (llw0) null, (vwy) null, 0, 4093);
                } else {
                    boolean z4 = wwyVar3 instanceof xwy;
                    u771 u771Var = twyVar2.b;
                    int i2 = twyVar2.c;
                    ela1 ela1Var = twyVar2.a;
                    wwyVarG2 = z4 ? xwy.g((xwy) wwyVar3, ela1Var, u771Var, i2, null, 8) : new xwy(ela1Var, u771Var, i2, null);
                }
                return First.c(wwyVarG2, z3 ? p8p1.y(wwyVar3) : Collections.singleton(new bwy(twyVar2.a, twyVar2.b, twyVar2.c, false)));
            case 14:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    era eraVar = een.Q0;
                    tq60 tq60Var = new tq60(eraVar);
                    String strO0 = cwl1.o0(x340Var2, 2131953612);
                    uwr uwrVar = cbx.a;
                    uwo1.e(strO0, tq60Var, cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                    tq60 tq60Var2 = new tq60(eraVar);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    uwo1.e(cwl1.o0(x340Var2, 2131953611), uyn1.B(tq60Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                rzn1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                h4o1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                sio1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ajo1.k((b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                iko1.g((b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ujo1.i((b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                px00 px00Var = (px00) obj;
                tx00 tx00Var = (tx00) obj2;
                String entityUri = tx00Var.getEntityUri();
                String str2 = px00Var.a;
                Object[] objArr2 = !u890.j(entityUri, str2) && str2.length() > 0;
                String strH = zx00.h(px00Var);
                dx00 dx00VarA = tx00Var.a();
                dx00 dx00Var = dx00VarA instanceof dx00 ? dx00VarA : null;
                String uri = dx00Var != null ? dx00Var.getUri() : null;
                if (strH != null && !strH.equals(uri)) {
                    objArr = 1;
                }
                sx00 sx00VarI = zx00.i(tx00Var, px00Var);
                if (objArr2 != false) {
                    if (sx00VarI instanceof sx00) {
                        sx00VarI = sx00VarI;
                    } else {
                        if (sx00VarI instanceof rx00) {
                            rx00 rx00Var = (rx00) sx00VarI;
                            sx00Var = new sx00(rx00Var.a, rx00Var.b, rx00Var.c, rx00Var.d, rx00Var.f, rx00Var.g, rx00Var.l);
                        } else {
                            if (!(sx00VarI instanceof qx00)) {
                                eg.o();
                                return null;
                            }
                            qx00 qx00Var = (qx00) sx00VarI;
                            sx00Var = new sx00(qx00Var.a, qx00Var.b, qx00Var.c, qx00Var.d);
                        }
                        sx00VarI = sx00Var;
                    }
                }
                xj61 xj61Var = new xj61();
                if (objArr2 != false) {
                    xj61Var.add(new obw(str2));
                }
                if (objArr != 0) {
                    xj61Var.add(new jbw(strH));
                }
                return Next.i(sx00VarI, cwl1.j(xj61Var));
            case 22:
                px00 px00Var2 = (px00) obj;
                String strH2 = zx00.h(px00Var2);
                tx00 tx00VarI = zx00.i((tx00) obj2, px00Var2);
                xj61 xj61Var2 = new xj61();
                String str3 = px00Var2.a;
                if (str3.length() > 0) {
                    xj61Var2.add(new obw(str3));
                }
                if (strH2 != null) {
                    xj61Var2.add(new jbw(strH2));
                }
                return First.c(tx00VarI, cwl1.j(xj61Var2));
            case 23:
                ((Number) obj2).intValue();
                vno1.c((b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ioj0 ioj0Var = (ioj0) obj2;
                String str4 = ((sk10) obj).a;
                hoj0 hoj0VarC = ioj0Var.c(o0o.class, str4);
                o0o o0oVar = (o0o) ((hoj0VarC == null || (goj0VarA2 = hoj0VarC.a()) == null) ? null : (ez00) goj0VarA2.a);
                if (o0oVar == null) {
                    return tk10.a;
                }
                hoj0 hoj0VarC2 = ioj0Var.c(xkk1.class, str4);
                xkk1 xkk1Var = (xkk1) ((hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA.a);
                String str5 = o0oVar.b;
                String str6 = o0oVar.a;
                if (xkk1Var != null && (up70VarA = xkk1Var.a.a(vp70.c)) != null) {
                    str = up70VarA.a.a;
                }
                return new uk10(str5, str6, str);
            case 25:
                ro10 ro10Var = (ro10) obj;
                so10 so10Var = (vo10) obj2;
                boolean z5 = ro10Var.e;
                fo10 fo10Var = ro10Var.b;
                qo10 qo10Var = fo10Var.c;
                String str7 = fo10Var.a;
                if (so10Var instanceof to10) {
                    return zo10.h(ro10Var);
                }
                if (so10Var instanceof so10) {
                    so10 so10Var2 = so10Var;
                    if (u890.j(so10Var2.b, str7)) {
                        return (u890.j(so10Var2.t, qo10Var) && so10Var2.Y == z5) ? Next.j() : Next.h(so10.a(so10Var2, qo10Var, z5, 1535));
                    }
                    return Next.i(so10.a(so10Var2, (qo10) null, z5, 2047), Collections.singleton(new qbw(ro10Var.a, str7, fo10Var.b, qo10Var)));
                }
                if (!(so10Var instanceof uo10)) {
                    eg.o();
                    return null;
                }
                uo10 uo10Var = (uo10) so10Var;
                String str8 = uo10Var.b;
                if (u890.j(str8, str7)) {
                    return (u890.j(uo10Var.d, qo10Var) && uo10Var.f == z5) ? Next.j() : Next.h(new uo10(uo10Var.a, str8, uo10Var.c, qo10Var, uo10Var.e, ro10Var.e));
                }
                return zo10.h(ro10Var);
            case 26:
                ((Number) obj2).intValue();
                zzo1.f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                m1p1.h((b0k) obj, czo1.p(1));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                ((Number) obj2).intValue();
                b2p1.d((b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                b2p1.h((b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ htu(byte b, int i, boolean z) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ htu(Object obj, byte b) {
        super(2);
        this.a = b;
    }
}
