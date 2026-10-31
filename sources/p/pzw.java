package p;

import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pzw implements xpw {
    public final Object N0;
    public final mqw O0;
    public final rqw P0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final Object b;
    public final psw c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public pzw(e441 e441Var, gzw gzwVar, ffe1 ffe1Var, otu otuVar, gw70 gw70Var, q8n q8nVar, f0x f0xVar, ewp ewpVar, List list, d1x d1xVar, z1x z1xVar, ti0 ti0Var) {
        d0x d0xVar;
        this.a = (byte) 0;
        this.d = gzwVar;
        this.e = ffe1Var;
        this.f = otuVar;
        this.g = gw70Var;
        this.b = q8nVar;
        this.h = f0xVar;
        this.i = list;
        this.t = d1xVar;
        this.X = z1xVar;
        switch (ewpVar.a) {
            case 0:
                nwp nwpVar = (nwp) ewpVar.b.c;
                List listK = nwpVar.k();
                q8n q8nVarG0 = nwpVar.a.g0();
                c8o.l(q8nVarG0);
                d0xVar = new d0x(listK, q8nVarG0, (wen0) nwpVar.y1.get(), (sen0) nwpVar.x1.get(), (z1x) nwpVar.A1.get(), ((daq) nwpVar.a.b).a.k());
                break;
            default:
                thq thqVar = ewpVar.b;
                v5q v5qVar = thqVar.c;
                List listS = v5qVar.s();
                daq daqVar = thqVar.b;
                d0xVar = new d0x(listS, (q8n) daqVar.V2.get(), (wen0) v5qVar.G4.get(), (sen0) v5qVar.F4.get(), (z1x) v5qVar.H4.get(), daqVar.a.k());
                break;
        }
        Flowable flowable = (Flowable) ffe1Var.b;
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        vrw vrwVar = vrw.Q0;
        n75 n75Var = rqt0.b;
        this.Y = new i0h(new ir9(z4p1.v(rqt0.w(kgeVar, vrwVar, n75Var), 1), (byte) 2), (byte) 26);
        this.Z = new ir9(z4p1.v(rqt0.w(new xy0(new kge(flowable), (byte) 24), vrw.R0, n75Var), 1), (byte) 3);
        this.N0 = new x3s(ti0Var.b, (byte) 21);
        this.O0 = sbl.z(new dih1(0L, false, e441Var, false), new drm1(f0xVar), d0xVar, new z6n(2, f0xVar, f0x.class, "onProps", "onProps(Lcom/spotify/adsdisplay/embeddedad/ui/npv/Props;Lcom/spotify/adsdisplay/embeddedad/mobius/domain/EmbeddedAdContainerState;)Lcom/spotify/mobius/Next;", 0, (byte) 26), new izw(this));
        this.P0 = new eih1();
        j2i j2iVar = new j2i(843784835, new ent(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return this.P0;
            case 1:
                return (d9k) this.P0;
            default:
                return this.P0;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }

    public rqw e(uca0 uca0Var) {
        return uca0Var.c ? (rqw) ((idd1) this.N0).getValue() : (rqw) ((idd1) this.Z).getValue();
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.O0;
    }

    public pzw(ulc ulcVar, iir iirVar, vt90 vt90Var, los losVar, bbl0 bbl0Var, b0a0 b0a0Var, js90 js90Var, qo90 qo90Var, lzn0 lzn0Var, q8n q8nVar) {
        byte b = 1;
        this.a = (byte) 1;
        this.d = ulcVar;
        this.e = iirVar;
        this.f = vt90Var;
        this.g = bbl0Var;
        this.h = b0a0Var;
        this.i = js90Var;
        this.t = qo90Var;
        this.X = lzn0Var;
        this.b = q8nVar;
        this.Y = new svh0(losVar, (byte) 16);
        this.Z = new idd1(new zca0(this, b));
        byte b2 = 0;
        this.N0 = new idd1(new zca0(this, b2));
        this.O0 = x3p1.n(new ada0(this, b2), mr90.O0, new gs90(this, (byte) 6), (o8n) null, new ada0(this, b), 8);
        this.P0 = new d9k(this, b);
        j2i j2iVar = new j2i(176532649, new pba0(this, b), true);
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public pzw(ebi0 ebi0Var, epb1 epb1Var, kko kkoVar, qa2 qa2Var, qa2 qa2Var2, klv0 klv0Var, clm clmVar, nwt nwtVar, yqg yqgVar, fza fzaVar, gw70 gw70Var, iuj iujVar, l0x0 l0x0Var, myq0 myq0Var, aru0 aru0Var, cua cuaVar, ycm ycmVar, aru0 aru0Var2, tbw0 tbw0Var, hvp0 hvp0Var, ytp0 ytp0Var, tiv0 tiv0Var, e9g1 e9g1Var, vgm vgmVar, lzn0 lzn0Var, ytp0 ytp0Var2) {
        this.a = (byte) 2;
        this.d = ebi0Var;
        this.e = epb1Var;
        this.f = kkoVar;
        this.g = clmVar;
        this.b = nwtVar;
        this.h = yqgVar;
        this.i = fzaVar;
        this.t = hvp0Var;
        this.X = ytp0Var;
        this.Y = vgmVar;
        this.Z = lzn0Var;
        this.N0 = ytp0Var2;
        this.O0 = x3p1.n(new fbi0(this, (byte) 0), new fbi0(this, (byte) 1), new yih0(this, (byte) 3), (o8n) null, new fbi0(this, (byte) 2), 8);
        this.c = voo1.j(this, ebi0Var.a, gw70Var, kkoVar, qa2Var, qa2Var2, klv0Var, tbw0Var, aru0Var2, myq0Var, aru0Var, cuaVar, ycmVar, e9g1Var, tiv0Var, iujVar, yqgVar, ebi0Var.b);
        this.P0 = poo1.y(this, l0x0Var, kkoVar, klv0Var);
    }
}
