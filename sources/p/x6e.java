package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x6e implements oi51 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public x6e(Context context, lzn0 lzn0Var) {
        this.a = (byte) 6;
        this.b = context;
        this.c = lzn0Var;
        this.d = new uh51(this, (byte) 0);
    }

    public final void a(ji50 ji50Var, tcr0 tcr0Var) {
        r3r r3rVarQ;
        byte b = this.a;
        Object obj = this.c;
        w7x w7xVar = w7x.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                d0r d0rVar = ji50Var.a;
                u9p u9pVar = (u9p) ((r9p) obj).a.c;
                s9p s9pVar = (s9p) u9pVar.n.get();
                t9p t9pVar = (t9p) u9pVar.o.get();
                gw70 gw70VarE = ((i1o) u9pVar.C).e();
                c8o.l(gw70VarE);
                ji50Var.b.put(ner0.class, r4o1.Q(jzd.g, w7xVar, new cka(f6o1.A(new kpg0(new w6e(s9pVar, t9pVar, gw70VarE, (zeu) obj2, d0rVar), new m4d(this, (byte) 11)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (byte) 21), wnb.U0));
                break;
            case 1:
                g1o g1oVar = new g1o(this, tcr0Var, (byte) 0);
                ji50Var.b.put(afr0.class, r4o1.Q(rwn.X0, as10.f(8, false, false, ((xf4) obj2).u(), false), g1oVar, wmn.i));
                break;
            case 2:
                LinkedHashMap linkedHashMap = ji50Var.b;
                boolean zK = ((xf4) obj2).k();
                h1m h1mVar = new h1m(this, (byte) 25);
                f2o.a.getClass();
                Set set = e2o.b;
                r1o r1oVar = r1o.X;
                wmn wmnVar = wmn.t;
                if (zK) {
                    d0r d0rVar2 = ji50Var.a;
                    x2p x2pVar = (x2p) ((w9p) ((jly0) ((g2o) obj).a.d).get()).a.c;
                    xfx xfxVar = (xfx) ((asn) x2pVar.c).a;
                    c8o.l(xfxVar);
                    hjc hjcVar = new hjc(xfxVar.b, (byte) 5);
                    asn asnVar = (asn) x2pVar.c;
                    xfx xfxVar2 = (xfx) asnVar.a;
                    c8o.l(xfxVar2);
                    pp ppVar = new pp(xfxVar2.c, (byte) 15);
                    xfx xfxVar3 = (xfx) asnVar.a;
                    c8o.l(xfxVar3);
                    hjc hjcVar2 = new hjc(xfxVar3.b, (byte) 4);
                    lzn0 lzn0Var = (lzn0) asnVar.b;
                    c8o.l(lzn0Var);
                    z710 z710Var = (z710) asnVar.c;
                    c8o.l(z710Var);
                    r3rVarQ = new r3r(new wzq(new s1o(hjcVar, ppVar, hjcVar2, lzn0Var, z710Var, d0rVar2), r1o.i), wmnVar, (vu30) null);
                } else {
                    r3rVarQ = r4o1.Q(r1oVar, set, h1mVar, wmnVar);
                }
                linkedHashMap.put(oer0.class, r3rVarQ);
                break;
            case 3:
                LinkedHashMap linkedHashMap2 = ji50Var.b;
                boolean zQ = ((xf4) obj2).q();
                utt uttVar = new utt(this, (byte) 8);
                Set setS0 = f46.S0(new yp21[]{new yp21(jo70.class), new yp21(xkk1.class), new yp21(zoy0.class), new yp21(gh3.class)});
                nzu nzuVar = nzu.d1;
                qlt qltVar = qlt.d1;
                linkedHashMap2.put(rer0.class, zQ ? new r3r(new xzq(((zwg) obj).k(ji50Var.a, nzu.Z0, (x6o0) null), nzu.a1), qltVar, 4) : r4o1.Q(nzuVar, setS0, uttVar, qltVar));
                break;
            case 4:
                ji50Var.b.put(xer0.class, r4o1.Q(xdc0.Y, w7xVar, new s2c0(this, (byte) 4), f7c0.X));
                break;
            case 5:
                nso0 nso0Var = new nso0(this, (byte) 5);
                ji50Var.b.put(cfr0.class, r4o1.Q(new mop0(this, (byte) 1), lop0.t, nso0Var, ofo0.X0));
                break;
            default:
                ji50Var.b.put(gfr0.class, r4o1.Q(th51.c, w7xVar, new u841(this, (byte) 9), jh31.W0));
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return ner0.class;
            case 1:
                return afr0.class;
            case 2:
                return oer0.class;
            case 3:
                return rer0.class;
            case 4:
                return xer0.class;
            case 5:
                return cfr0.class;
            default:
                return gfr0.class;
        }
    }

    public final Set c() {
        byte b = this.a;
        w7x w7xVar = w7x.a;
        switch (b) {
            case 0:
                return w7xVar;
            case 1:
                return Collections.singleton(new scr0(kcr0.a, rwn.Y0));
            case 2:
                return w7xVar;
            case 3:
                return Collections.singleton(new scr0(jcr0.a, nzu.e1));
            case 4:
            case 5:
            default:
                return w7xVar;
        }
    }

    public /* synthetic */ x6e(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
