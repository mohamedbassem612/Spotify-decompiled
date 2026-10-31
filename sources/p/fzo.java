package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fzo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ fzo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final bs0 a() {
        byte b = this.a;
        xrp xrpVar = this.b;
        switch (b) {
            case 0:
                asn asnVar = (asn) ((jwo) xrpVar).b;
                lzn0 lzn0Var = (lzn0) ((kzp) asnVar.a).b.i.get();
                c8o.l(lzn0Var);
                kzp kzpVar = (kzp) asnVar.a;
                lzn0 lzn0Var2 = (lzn0) kzpVar.b.i.get();
                c8o.l(lzn0Var2);
                gw70 gw70Var = (gw70) kzpVar.a.d8.get();
                c8o.l(gw70Var);
                tm tmVar = new tm(lzn0Var2, gw70Var, new kba());
                koc0 koc0Var = ((bct) asnVar.b).d;
                uu00 uu00Var = (uu00) kzpVar.a.a5.get();
                c8o.l(uu00Var);
                return new bs0(lzn0Var, tmVar, (cyd) new pux0(koc0Var, uu00Var, (byte) 20), (hyd) new fjb((byte) 22));
            default:
                wtp wtpVar = (wtp) xrpVar.b;
                lzn0 lzn0Var3 = (lzn0) ((l3q) wtpVar.d).b.i.get();
                c8o.l(lzn0Var3);
                l3q l3qVar = (l3q) wtpVar.d;
                lzn0 lzn0Var4 = (lzn0) l3qVar.b.i.get();
                c8o.l(lzn0Var4);
                gw70 gw70Var2 = (gw70) l3qVar.a.d8.get();
                c8o.l(gw70Var2);
                tm tmVar2 = new tm(lzn0Var4, gw70Var2, new ps7((byte) 17, false));
                daq daqVar = l3qVar.a;
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                koc0 koc0Var2 = ((bct) wtpVar.c).d;
                uu00 uu00Var2 = (uu00) daqVar.a5.get();
                c8o.l(uu00Var2);
                o241 o241Var = (o241) daqVar.u4.get();
                c8o.l(o241Var);
                luk lukVar = (luk) daqVar.L1.get();
                c8o.l(lukVar);
                return new bs0(lzn0Var3, tmVar2, (cyd) new ytp0(context, koc0Var2, uu00Var2, o241Var, new dp4(false, false, lukVar), (byte) 17), (hyd) new hvp0((byte) 16));
        }
    }
}
