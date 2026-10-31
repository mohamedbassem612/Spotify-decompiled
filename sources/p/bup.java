package p;

import android.content.res.Resources;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bup implements jly0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ bup(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                s3p0 s3p0Var = (s3p0) ((h72) ((d3p) obj2).a).b;
                Resources resources = (Resources) s3p0Var.d.get();
                c8o.l(resources);
                luk lukVar = (luk) s3p0Var.f.get();
                c8o.l(lukVar);
                hv4 hv4Var = new hv4(false, false, false, lukVar);
                fza1 fza1Var = (fza1) s3p0Var.r.get();
                c8o.l(fza1Var);
                jxa jxaVar = new jxa((byte) 2);
                yqg yqgVar = (yqg) s3p0Var.h.get();
                c8o.l(yqgVar);
                bnj0 bnj0Var = new bnj0(resources, g7y.y(hv4Var, fza1Var, jxaVar, yqgVar), (byte) 10);
                s3p0 s3p0Var2 = (s3p0) ((h72) obj).b;
                Resources resources2 = (Resources) s3p0Var2.d.get();
                c8o.l(resources2);
                Boolean bool = (Boolean) s3p0Var2.y.get();
                bool.getClass();
                i5w0 i5w0Var = new i5w0(bool);
                q8n q8nVar = (q8n) s3p0Var2.x.get();
                c8o.l(q8nVar);
                return new lun0(bnj0Var, resources2, i5w0Var, q8nVar);
            case 1:
                wj3 wj3Var = (wj3) ((z2p) obj2).b;
                Resources resourcesQ = ((r2p0) wj3Var.c).q();
                c8o.l(resourcesQ);
                r2p0 r2p0Var = (r2p0) wj3Var.c;
                luk lukVarD = r2p0Var.d();
                c8o.l(lukVarD);
                hv4 hv4Var2 = new hv4(false, false, false, lukVarD);
                fza1 fza1VarS = r2p0Var.s();
                c8o.l(fza1VarS);
                jxa jxaVar2 = new jxa((byte) 2);
                yqg yqgVarB = r2p0Var.b();
                c8o.l(yqgVarB);
                bnj0 bnj0Var2 = new bnj0(resourcesQ, g7y.y(hv4Var2, fza1VarS, jxaVar2, yqgVarB), (byte) 10);
                wj3 wj3Var2 = (wj3) obj;
                Resources resourcesQ2 = ((r2p0) wj3Var2.c).q();
                c8o.l(resourcesQ2);
                r2p0 r2p0Var2 = (r2p0) wj3Var2.c;
                i5w0 i5w0Var2 = new i5w0(Boolean.valueOf(r2p0Var2.p()));
                q8n q8nVarG = r2p0Var2.g();
                c8o.l(q8nVarG);
                return new lun0(bnj0Var2, resourcesQ2, i5w0Var2, q8nVarG);
            case 2:
                r2p0 r2p0Var3 = (r2p0) ((wdm) ((z2p) obj2).b).c;
                Resources resourcesQ3 = r2p0Var3.q();
                c8o.l(resourcesQ3);
                luk lukVarD2 = r2p0Var3.d();
                c8o.l(lukVarD2);
                hv4 hv4Var3 = new hv4(false, false, false, lukVarD2);
                fza1 fza1VarS2 = r2p0Var3.s();
                c8o.l(fza1VarS2);
                jxa jxaVar3 = new jxa((byte) 2);
                yqg yqgVarB2 = r2p0Var3.b();
                c8o.l(yqgVarB2);
                bnj0 bnj0Var3 = new bnj0(resourcesQ3, g7y.y(hv4Var3, fza1VarS2, jxaVar3, yqgVarB2), (byte) 10);
                r2p0 r2p0Var4 = (r2p0) ((wdm) obj).c;
                Resources resourcesQ4 = r2p0Var4.q();
                c8o.l(resourcesQ4);
                i5w0 i5w0Var3 = new i5w0(Boolean.valueOf(r2p0Var4.p()));
                q8n q8nVarG2 = r2p0Var4.g();
                c8o.l(q8nVarG2);
                return new lun0(bnj0Var3, resourcesQ4, i5w0Var3, q8nVarG2);
            case 3:
                return new v2q(this, (byte) 1);
            case 4:
                return new f3q(this, (byte) 0);
            case 5:
                return new f3q(this, (byte) 1);
            case 6:
                daq daqVar = (daq) obj;
                return new t1o0((i8h1) daqVar.A5.get(), new xok0((byte) 9), (q1o0) daqVar.ht.get(), (d3o0) daqVar.E2.get(), new o2o0(((m3q) obj2).a()));
            case 7:
                wtp wtpVar = (wtp) obj2;
                dg30 dg30Var = (dg30) wtpVar.d;
                p2o0 p2o0VarY = wtpVar.y();
                v1o0 v1o0Var = (v1o0) ((daq) obj).Nd.get();
                daq daqVar2 = (daq) wtpVar.c;
                return new qig0(dg30Var, p2o0VarY, v1o0Var, new l6s((q1o0) daqVar2.ht.get(), new xok0((byte) 9), (i8h1) daqVar2.A5.get()), t380.p(s2.o((gwo) daqVar2.ve.get())));
            default:
                return new c1r0((PageActivityProxy) ((wtp) obj2).d, (mwn0) ((daq) obj).Wd.get());
        }
    }
}
