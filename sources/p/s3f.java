package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3f {
    public final yqg a;
    public final lzn0 b;
    public final cwe c;
    public final add d;
    public final kwe e;

    public s3f(yqg yqgVar, lzn0 lzn0Var, cwe cweVar, add addVar, kwe kweVar) {
        this.a = yqgVar;
        this.b = lzn0Var;
        this.c = cweVar;
        this.d = addVar;
        this.e = kweVar;
    }

    public final long a() {
        return this.a.b() / 1000;
    }

    public final void b(bef befVar, iu30 iu30Var) {
        boolean z = befVar instanceof qdf;
        xcf xcfVar = xcf.a;
        ycf ycfVar = ycf.a;
        ddf ddfVar = ddf.a;
        zcf zcfVar = zcf.a;
        wcf wcfVar = wcf.a;
        bdf bdfVar = bdf.a;
        zdf zdfVar = zdf.a;
        if (!z && !befVar.equals(zdfVar) && !befVar.equals(fdf.a) && !(befVar instanceof wdf) && !(befVar instanceof vdf) && !(befVar instanceof mdf) && !(befVar instanceof ndf) && !befVar.equals(bdfVar) && !befVar.equals(wcfVar) && !(befVar instanceof edf) && !(befVar instanceof pdf) && !(befVar instanceof xdf) && !befVar.equals(zcfVar) && !befVar.equals(ldf.a) && !befVar.equals(ddfVar) && !(befVar instanceof cdf) && !(befVar instanceof hdf) && !(befVar instanceof sdf) && !befVar.equals(kdf.a) && !(befVar instanceof tdf) && !befVar.equals(ycfVar) && !befVar.equals(xcfVar) && !(befVar instanceof udf) && !(befVar instanceof idf) && !befVar.equals(rdf.a)) {
            if (befVar instanceof jdf) {
                iu30Var.invoke(new d2f(((jdf) befVar).a, a()));
                return;
            }
            if (befVar instanceof odf) {
                odf odfVar = (odf) befVar;
                iu30Var.invoke(new l2f(odfVar.a, odfVar.b, a()));
                return;
            }
            if (befVar instanceof adf) {
                qf4 qf4Var = this.d.a;
                if (qf4Var.h() && qf4Var.k()) {
                    this.e.b.a(rih1.a, null);
                    return;
                }
                gob gobVar = new gob(iu30Var, (byte) 23);
                cwe cweVar = this.c;
                nwe nweVarA = cweVar.b.a();
                th30 th30Var = cweVar.a;
                nweVarA.c2 = new d1c(nweVarA, cweVar, gobVar, (byte) 12);
                nweVarA.e2 = false;
                nweVarA.g1(th30Var, owe.a);
                return;
            }
            boolean z2 = befVar instanceof aef;
            lzn0 lzn0Var = this.b;
            if (z2) {
                String str = ((aef) befVar).a;
                if (str != null) {
                    lzn0Var.f(new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                    return;
                } else {
                    eg.m("uri was not set!");
                    return;
                }
            }
            if (befVar.equals(gdf.a)) {
                lzn0Var.e();
                return;
            } else if (befVar instanceof ydf) {
                iu30Var.invoke(new j3f(((ydf) befVar).a));
                return;
            } else {
                eg.o();
                return;
            }
        }
        if (befVar instanceof fdf) {
            iu30Var.invoke(o1f.a);
            return;
        }
        if (befVar instanceof sdf) {
            iu30Var.invoke(new r2f(((sdf) befVar).a));
            return;
        }
        if (befVar instanceof tdf) {
            tdf tdfVar = (tdf) befVar;
            iu30Var.invoke(new s2f(tdfVar.a, tdfVar.b));
            return;
        }
        if (befVar instanceof vdf) {
            iu30Var.invoke(new b3f(((vdf) befVar).a, a()));
            return;
        }
        if (befVar instanceof wdf) {
            h7q0 h7q0Var = ((wdf) befVar).a;
            if (h7q0Var instanceof h7q0) {
                iu30Var.invoke(new f3f(h7q0Var.a, a()));
                return;
            } else {
                iu30Var.invoke(new g3f((f7q0) h7q0Var, a()));
                return;
            }
        }
        if (befVar instanceof udf) {
            udf udfVar = (udf) befVar;
            h7q0 h7q0Var2 = udfVar.b;
            boolean z3 = h7q0Var2 instanceof h7q0;
            String str2 = udfVar.a;
            if (z3) {
                iu30Var.invoke(new z2f(str2, h7q0Var2.a, a()));
                return;
            } else {
                iu30Var.invoke(new a3f(str2, (f7q0) h7q0Var2, a()));
                return;
            }
        }
        if (befVar instanceof rdf) {
            iu30Var.invoke(o2f.a);
            return;
        }
        if (befVar instanceof idf) {
            iu30Var.invoke(new z1f(((idf) befVar).a));
            return;
        }
        if (befVar instanceof xdf) {
            iu30Var.invoke(new i3f(((xdf) befVar).a));
            return;
        }
        if (befVar.equals(zdfVar)) {
            iu30Var.invoke(k3f.a);
            return;
        }
        if (befVar.equals(wcfVar)) {
            iu30Var.invoke(b1f.a);
            return;
        }
        if (befVar instanceof hdf) {
            iu30Var.invoke(new s1f(((hdf) befVar).a));
            return;
        }
        if (befVar instanceof ldf) {
            iu30Var.invoke(g2f.a);
            return;
        }
        if (befVar instanceof kdf) {
            iu30Var.invoke(f2f.a);
            return;
        }
        if (befVar.equals(bdfVar)) {
            iu30Var.invoke(g1f.a);
            return;
        }
        if (befVar instanceof cdf) {
            iu30Var.invoke(new h1f(((cdf) befVar).a));
            return;
        }
        if (befVar instanceof mdf) {
            iu30Var.invoke(new j2f(((mdf) befVar).a));
            return;
        }
        if (befVar instanceof ndf) {
            ndf ndfVar = (ndf) befVar;
            iu30Var.invoke(new k2f(ndfVar.a, ndfVar.b));
            return;
        }
        if (befVar instanceof edf) {
            edf edfVar = (edf) befVar;
            iu30Var.invoke(new l1f(edfVar.a, edfVar.b));
            return;
        }
        if (befVar instanceof pdf) {
            pdf pdfVar = (pdf) befVar;
            iu30Var.invoke(new m2f(pdfVar.a, pdfVar.b));
            return;
        }
        boolean zEquals = befVar.equals(ycfVar);
        d1f d1fVar = d1f.a;
        if (zEquals) {
            iu30Var.invoke(d1fVar);
            return;
        }
        if (befVar.equals(xcfVar)) {
            iu30Var.invoke(u1f.a);
            return;
        }
        if (befVar.equals(ddfVar)) {
            iu30Var.invoke(t1f.a);
            return;
        }
        if (befVar.equals(zcfVar)) {
            iu30Var.invoke(d1fVar);
        } else if (z) {
            qdf qdfVar = (qdf) befVar;
            iu30Var.invoke(new n2f(qdfVar.a, qdfVar.b));
        }
    }
}
