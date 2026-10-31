package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c5a extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c5a(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b = this.a;
        hjf hjfVar = hjf.a;
        gjf gjfVar = gjf.a;
        pjf pjfVar = pjf.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 1:
                k3r k3rVar = (k3r) iu30Var.invoke(((jh5) obj).b);
                if (k3rVar != null) {
                    return k3rVar;
                }
                return null;
            case 2:
                iu30Var.invoke(Integer.valueOf(yoi1.p((int) (((Number) obj).floatValue() * 100.0f), 0, 100)));
                return rih1Var;
            case 3:
                iu30Var.invoke(Integer.valueOf(yoi1.p((int) (((Number) obj).floatValue() * 100.0f), 0, 100)));
                return rih1Var;
            case 4:
                iu30Var.invoke((sja) obj);
                return rih1Var;
            case 5:
                sja sjaVar = (sja) obj;
                if (sjaVar.equals(qja.c) || sjaVar.equals(qja.a) || sjaVar.equals(qja.b) || (sjaVar instanceof rja) || sjaVar.equals(qja.d) || sjaVar.equals(qja.e)) {
                    iu30Var.invoke(a8t0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 6:
                iu30Var.invoke(new gta((String) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke((wcg) obj);
                return rih1Var;
            case 8:
                jix jixVar = (mix) obj;
                if (jixVar instanceof jix) {
                    iu30Var.invoke(new t7b(i7g0.valueOf(jixVar.a.a)));
                } else if (jixVar instanceof iix) {
                    iu30Var.invoke(new s7b(i7g0.valueOf(((iix) jixVar).a.a)));
                } else if (jixVar instanceof gix) {
                    iu30Var.invoke(u7b.a);
                }
                return rih1Var;
            case 9:
                return iu30Var.invoke(new pyg(obj, true, cu9.Y0, (iu30) null, true));
            case 10:
                return iu30Var.invoke(new pyg(obj, true, cu9.Z0, (iu30) null, true));
            case 11:
                return iu30Var.invoke(new pyg(obj, true, cu9.a1, (iu30) null, true));
            case 12:
                iu30Var.invoke(((o95) obj).e());
                return rih1Var;
            case 13:
                iu30Var.invoke(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            case 14:
                iu30Var.invoke((xzz) obj);
                return rih1Var;
            case 15:
                iu30Var.invoke(new mde((String) obj));
                return rih1Var;
            case 16:
                iu30Var.invoke(new m1f((String) obj));
                return rih1Var;
            case 17:
                iu30Var.invoke(new ydf((h5f) obj));
                return rih1Var;
            case 18:
                o0j0 o0j0Var = (w0j0) obj;
                if (o0j0Var instanceof o0j0) {
                    iu30Var.invoke(new jdf(o0j0Var.a));
                } else if (o0j0Var instanceof p0j0) {
                    p0j0 p0j0Var = (p0j0) o0j0Var;
                    iu30Var.invoke(new odf(p0j0Var.a, p0j0Var.b));
                } else if (o0j0Var instanceof s0j0) {
                    iu30Var.invoke(new sdf(((s0j0) o0j0Var).a));
                } else if (o0j0Var instanceof t0j0) {
                    t0j0 t0j0Var = (t0j0) o0j0Var;
                    iu30Var.invoke(new tdf(t0j0Var.a, t0j0Var.b));
                } else if (o0j0Var.equals(u0j0.a)) {
                    iu30Var.invoke(zdf.a);
                } else if (o0j0Var.equals(l0j0.a)) {
                    iu30Var.invoke(wcf.a);
                } else if (o0j0Var instanceof v0j0) {
                    iu30Var.invoke(new aef(((v0j0) o0j0Var).a));
                } else if (o0j0Var instanceof n0j0) {
                    iu30Var.invoke(new hdf(((n0j0) o0j0Var).a));
                } else if (o0j0Var instanceof r0j0) {
                    r0j0 r0j0Var = (r0j0) o0j0Var;
                    iu30Var.invoke(new qdf(r0j0Var.a, r0j0Var.b));
                } else if (o0j0Var instanceof m0j0) {
                    m0j0 m0j0Var = (m0j0) o0j0Var;
                    iu30Var.invoke(new edf(m0j0Var.a, m0j0Var.b));
                } else {
                    if (!(o0j0Var instanceof q0j0)) {
                        eg.o();
                        return null;
                    }
                    q0j0 q0j0Var = (q0j0) o0j0Var;
                    iu30Var.invoke(new pdf(q0j0Var.a, q0j0Var.b));
                }
                return rih1Var;
            case 19:
                ejf ejfVar = (ejf) obj;
                if (ejfVar.equals(ajf.a)) {
                    iu30Var.invoke(iif.a);
                } else if (ejfVar.equals(djf.a)) {
                    iu30Var.invoke(sif.a);
                } else if (ejfVar.equals(bjf.a)) {
                    iu30Var.invoke(jif.a);
                } else {
                    if (!ejfVar.equals(cjf.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(rif.a);
                }
                return rih1Var;
            case 20:
                qjf qjfVar = (qjf) obj;
                if (qjfVar instanceof ojf) {
                    iu30Var.invoke(gjfVar);
                } else {
                    if (!qjfVar.equals(pjfVar)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(hjfVar);
                }
                return rih1Var;
            case 21:
                qjf qjfVar2 = (qjf) obj;
                if (qjfVar2 instanceof ojf) {
                    iu30Var.invoke(gjfVar);
                } else {
                    if (!qjfVar2.equals(pjfVar)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(hjfVar);
                }
                return rih1Var;
            case 22:
                iu30Var.invoke((qjf) obj);
                return rih1Var;
            case 23:
                iu30Var.invoke(new ojf((String) obj));
                return rih1Var;
            case 24:
                iu30Var.invoke(new ojf((String) obj));
                return rih1Var;
            case 25:
                iu30Var.invoke(pjfVar);
                return rih1Var;
            case 26:
                b261.g((e261) obj, (String) null, new ggf(iu30Var, (byte) 15));
                return rih1Var;
            case 27:
                h251 h251Var = (k251) obj;
                if (h251Var.equals(b251.a)) {
                    str = "";
                } else {
                    if (!(h251Var instanceof h251)) {
                        eg.o();
                        return null;
                    }
                    str = h251Var.a;
                }
                iu30Var.invoke(str);
                return rih1Var;
            case 28:
                if (((wz20) obj).b()) {
                    iu30Var.invoke(p6f.a);
                }
                return rih1Var;
            default:
                iu30Var.invoke(new x5f((String) obj));
                return rih1Var;
        }
    }
}
