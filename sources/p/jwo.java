package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jwo implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ jwo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return pzm.h((mos) ((xp0) ((oql) obj).b).f.get());
            case 1:
                dy0 dy0Var = (dy0) ((uw0) ((gal) obj).b).i;
                c8o.l(dy0Var);
                return dy0Var;
            case 2:
                luk lukVar = (luk) ((w4b1) ((ham) obj).b).b;
                c8o.l(lukVar);
                return new c05(false, lukVar);
            case 3:
                return ((j21) ((wzn) obj).a).m;
            case 4:
                return pzm.h((mos) ((f81) ((oql) obj).b).a.get());
            case 5:
                return pzm.h((mos) ((dc1) ((gal) obj).b).b.get());
            case 6:
                i8h1 i8h1Var = (i8h1) ((bd1) ((ham) obj).b).e.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            case 7:
                asn asnVar = (asn) obj;
                String strD = ((qop) asnVar.a).d();
                sb7 sb7Var = (sb7) ((lzp) asnVar.b).a.V5.get();
                c8o.l(sb7Var);
                return new ldo(strD, sb7Var);
            case 8:
                return new xwo(this);
            case 9:
                return u1n0.z((q7r0) ((gal) obj).b);
            case 10:
                return new ywo(this);
            case 11:
                return new fxo(this);
            case 12:
                return new kxo(this);
            case 13:
                return u1n0.z((q7r0) ((ham) obj).b);
            case 14:
                wzn wznVar = (wzn) obj;
                qop qopVar = (qop) wznVar.b;
                String strD2 = qopVar.d();
                koc0 koc0Var = ((jbt) wznVar.a).d;
                nzp nzpVar = (nzp) wznVar.c;
                lzn0 lzn0Var = (lzn0) nzpVar.b.i.get();
                c8o.l(lzn0Var);
                pe peVar = (pe) nzpVar.a.p9.get();
                c8o.l(peVar);
                joe joeVar = (joe) nzpVar.b.af.get();
                c8o.l(joeVar);
                tra0 tra0Var = (tra0) nzpVar.b.Jf.get();
                c8o.l(tra0Var);
                yo2 yo2Var = (yo2) nzpVar.a.tq.get();
                c8o.l(yo2Var);
                return new z72(strD2, koc0Var, lzn0Var, peVar, joeVar, tra0Var, yo2Var, ((cyp) ((uap) qopVar.a.b).u.get()).a());
            case 15:
                return u1n0.z((q7r0) ((oql) obj).b);
            case 16:
                return new zxo(this, (byte) 0);
            case 17:
                asn asnVar2 = (asn) obj;
                njm njmVar = new njm((q7r0) asnVar2.b);
                bf2 bf2Var = (bf2) asnVar2.a;
                f4f0 f4f0Var = (f4f0) bf2Var.b.get();
                c8o.l(f4f0Var);
                vb2 vb2Var = (vb2) bf2Var.d.get();
                c8o.l(vb2Var);
                return new hf2(njmVar, f4f0Var, vb2Var, ((Boolean) bf2Var.e.get()).booleanValue());
            case 18:
                return new hyo(this);
            case 19:
                return new iyo(this);
            case 20:
                return new kyo(this, (byte) 0);
            case 21:
                return new qyo(this);
            case 22:
                return new fzo(this, (byte) 0);
            case 23:
                return new gzo(this);
            case 24:
                return new hzo(this);
            case 25:
                return pzm.h((mos) ((mz5) ((ham) obj).b).l.get());
            case 26:
                return new yzo(this);
            case 27:
                return new c0p(this);
            default:
                return new h0p(this, (byte) 0);
        }
    }
}
