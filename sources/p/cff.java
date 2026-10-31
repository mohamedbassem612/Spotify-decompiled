package p;

import com.spotify.player.model.PlayerError;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cff implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cff(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object b(PlayerError playerError, lnm lnmVar) {
        ci11 ci11Var;
        hi11 hi11Var = (hi11) this.b;
        if (lnmVar instanceof ci11) {
            ci11Var = (ci11) lnmVar;
            int i = ci11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ci11Var.d = i - Integer.MIN_VALUE;
            } else {
                ci11Var = new ci11(this, lnmVar);
            }
        } else {
            ci11Var = new ci11(this, lnmVar);
        }
        Object objI = ci11Var.b;
        int i2 = ci11Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            ezc ezcVarB = hi11Var.b.b();
            ci11Var.a = playerError;
            ci11Var.d = 1;
            objI = b5p1.i(ezcVarB, ci11Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        playerError = ci11Var.a;
        hm5.M(objI);
        if (((Boolean) objI).booleanValue()) {
            dxy dxyVar = hi11Var.X;
            if (dxyVar == null) {
                u890.C("handler");
                throw null;
            }
            playerError.getClass();
            ci11Var.a = null;
            ci11Var.d = 2;
            if (dxyVar.H(playerError, ci11Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object emit(Object obj, lnm lnmVar) throws NoWhenBranchMatchedException {
        Object objJ;
        ArrayList arrayList;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w8d w8dVar = (w8d) obj;
                if (w8dVar != null) {
                    ((iu30) obj2).invoke(new w2f(w8dVar.a()));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                xdp0 xdp0Var = (xdp0) obj;
                LinkedHashMap linkedHashMap = ((kvg) obj2).b;
                wdp0 wdp0Var = (wdp0) linkedHashMap.get("fingerprint emitter");
                cnr cnrVar = wdp0Var != null ? wdp0Var.c : null;
                wdp0 wdp0Var2 = (wdp0) linkedHashMap.get("fingerprint emitter");
                boolean zC = uug.c(wdp0Var2 != null ? yah0.m(wdp0Var2.d) : null);
                wdp0 wdp0Var3 = (wdp0) linkedHashMap.get("fingerprint emitter");
                return (wdp0Var3 == null || (objJ = wdp0Var3.b.J(yah0.m(zC), cnrVar, xdp0Var.a, lnmVar)) != d9nVar) ? rih1Var : objJ;
            case 2:
                ((m8l) obj2).g.add(((ji0) obj).a);
                return rih1Var;
            case 3:
                List list = (List) obj;
                ((vdr) obj2).f.l(list);
                list.size();
                list.toString();
                return rih1Var;
            case 4:
                long jCurrentTimeMillis = System.currentTimeMillis();
                njr njrVar = (njr) obj2;
                if (jCurrentTimeMillis - njrVar.h >= 5000) {
                    njrVar.h = jCurrentTimeMillis;
                    njrVar.a(2, (List) ((zob1) njrVar.a.a.h.getValue()).getValue());
                }
                return rih1Var;
            case 5:
                czc czcVar = (czc) obj;
                Objects.toString(czcVar);
                ((hks) obj2).j.a(czcVar);
                return rih1Var;
            case 6:
                ((el00) obj2).g.g(kq60.N0);
                return rih1Var;
            case 7:
                ((psw0) ((nsw0) obj2)).setValue(obj);
                return rih1Var;
            case 8:
                Object objB = ((ssw0) obj2).b(obj, lnmVar);
                return objB == d9nVar ? objB : rih1Var;
            case 9:
                p811 p811Var = (p811) obj2;
                if (p811Var.a == wqn1.a) {
                    p811Var.a = obj;
                    return rih1Var;
                }
                hhg1.n("Flow has more than one element");
                return null;
            case 10:
                sy20 sy20Var = (ty20) obj;
                my20 my20Var = (my20) obj2;
                boolean zH1 = my20Var.H1();
                if (sy20Var instanceof ry20) {
                    ArrayList arrayList2 = my20Var.S0;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        my20Var.S0 = arrayList2;
                    }
                    arrayList2.add(sy20Var);
                } else if ((sy20Var instanceof sy20) && (arrayList = my20Var.S0) != null) {
                    arrayList.remove(sy20Var.a());
                }
                if (my20Var.H1() != zH1) {
                    ha71.x(my20Var);
                }
                return rih1Var;
            case 11:
                xa50 xa50Var = (xa50) obj;
                h950 h950Var = (h950) obj2;
                if (h950Var.h != xa50Var) {
                    h950Var.h = xa50Var;
                    xa50Var.getClass();
                    h950Var.b(xa50Var);
                }
                return rih1Var;
            case 12:
                z590 z590Var = (z590) obj;
                w590 w590Var = (w590) obj2;
                if (upf.f(z590Var)) {
                    lsm0 lsm0VarB = z590Var.b();
                    if (lsm0VarB != null && lsm0VarB.b() && sqe.p(z590Var.b()) && !w590.a(w590Var)) {
                        w590.f(w590Var, z590Var.b(), w590.d(w590Var), w590.b(w590Var), w590.c(w590Var));
                        w590.g(w590Var, true);
                    }
                } else {
                    w590.g(w590Var, false);
                }
                return rih1Var;
            case 13:
                ((yse0) obj2).c = (String) obj;
                return rih1Var;
            case 14:
                iue0 iue0Var = (iue0) obj2;
                iue0.f(iue0Var, (svc) obj);
                iue0Var.c();
                return rih1Var;
            case 15:
                ((knn0) obj2).a(new z9r0(f610.g(((Boolean) obj).booleanValue())));
                return rih1Var;
            case 16:
                h6r0 h6r0Var = (h6r0) obj;
                h6r0Var.getClass();
                boolean z = h6r0Var == h6r0.b;
                air0 air0Var = (air0) obj2;
                air0Var.a.b().a(new k7r0(z));
                if (z) {
                    nhr0 nhr0Var = air0Var.t.Y;
                    c921.y(cto1.q(nhr0Var.g.d), (o8n) null, 0, new i2p0(nhr0Var, (lnm) null, (byte) 15), 3);
                }
                return rih1Var;
            case 17:
                bal1 bal1Var = (bal1) obj;
                ven0 ven0Var = (ven0) obj2;
                if ((bal1Var instanceof z9l1) || u890.j(bal1Var, aal1.a)) {
                    ven0Var.setValue(false);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                ((ojz0) obj2).f = yah0.m(((Boolean) obj).booleanValue());
                return rih1Var;
            case 19:
                return b((PlayerError) obj, lnmVar);
            case 20:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fh81 fh81Var = (fh81) obj2;
                mta mtaVar = fh81.B1;
                fh81Var.y();
                if (zBooleanValue) {
                    fh81Var.i1.a().G();
                }
                return rih1Var;
            case 21:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((bh81) obj2).c(ch81.c[0], (Object) null, bool);
                return rih1Var;
            default:
                Map map = (Map) obj;
                if (!map.isEmpty()) {
                    ((kd8) obj2).invoke(map);
                }
                return rih1Var;
        }
    }
}
