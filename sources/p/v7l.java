package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.functions.Consumer;
import com.spotify.outcome.outcomeapi.exceptions.HttpError;
import com.spotify.outcome.outcomeapi.exceptions.UnableToParseMessageException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v7l extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7l(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0143  */
    public final Object invoke(Object obj) {
        byte b = this.a;
        int i = 3;
        byte b2 = 14;
        boolean z = true;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                ((gf6) obj2).invoke();
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 2);
                b261.E(e261Var, kbb.n(((cdl) obj2).a));
                return rih1Var;
            case 2:
                return new k3h1(((kdl) obj2).g);
            case 3:
                kd31 kd31Var = (kd31) obj;
                xol1 xol1Var = (xol1) obj2;
                if (!Float.isNaN(xol1Var.d) || !Float.isNaN(xol1Var.e)) {
                    kd31Var.A(sgc1.u(Float.isNaN(xol1Var.d) ? 0.5f : xol1Var.d, Float.isNaN(xol1Var.e) ? 0.5f : xol1Var.e));
                }
                if (!Float.isNaN(xol1Var.f)) {
                    kd31Var.l(xol1Var.f);
                }
                if (!Float.isNaN(xol1Var.g)) {
                    kd31Var.n(xol1Var.g);
                }
                if (!Float.isNaN(xol1Var.h)) {
                    kd31Var.p(xol1Var.h);
                }
                if (!Float.isNaN(xol1Var.i)) {
                    kd31Var.C(xol1Var.i);
                }
                if (!Float.isNaN(xol1Var.j)) {
                    kd31Var.E(xol1Var.j);
                }
                if (!Float.isNaN(xol1Var.k)) {
                    kd31Var.u(xol1Var.k);
                }
                if (!Float.isNaN(xol1Var.l) || !Float.isNaN(xol1Var.m)) {
                    kd31Var.q(Float.isNaN(xol1Var.l) ? 1.0f : xol1Var.l);
                    kd31Var.r(Float.isNaN(xol1Var.m) ? 1.0f : xol1Var.m);
                }
                if (!Float.isNaN(xol1Var.n)) {
                    kd31Var.b(xol1Var.n);
                }
                return rih1Var;
            case 4:
                return Boolean.valueOf(((vjl) obj).a.equals(((sjl) obj2).a));
            case 5:
                xll xllVar = (xll) obj2;
                fai0 fai0Var = new fai0();
                fai0Var.m(new tx50(0L));
                fai0Var.n(t5p1.j(rqt0.u(new x010(new qbk(d3p1.F(xllVar.b, xll.d, xllVar.a), xllVar, (byte) 11), yoi1.g(xllVar.c), new l2(3, (lnm) null, (byte) 29), (byte) 1)), 3), new df3(fai0Var, (byte) 4));
                return fai0Var;
            case 6:
                hix0 hix0Var = (iix0) ((whx0) obj).a.get((String) ((rl1) obj2).c);
                if (!(hix0Var instanceof gix0) && (!(hix0Var instanceof hix0) || !hix0Var.a)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                dml dmlVar = (dml) obj2;
                return new lo8(new cml(dmlVar, (byte) 0), new mgl(dmlVar, (byte) 1), b2);
            case 8:
                return new lo8((cir0) obj, (h0r0) obj2, (byte) 6);
            case 9:
                return (xu30) ((eyl) obj2).d.get(Integer.valueOf(((Number) obj).intValue()));
            case 10:
                b261.n((e261) obj, ((af5) obj2).b);
                return rih1Var;
            case 11:
                ((j8m) obj2).e.invoke(new h8m(((mz71) obj).a));
                return rih1Var;
            case 12:
                ((qtr) obj).b(new k1((idm) obj2, (lnm) null, (byte) 7));
                return rih1Var;
            case 13:
                jem jemVar = (jem) obj;
                return rqt0.u(r4p1.l(new ht20(new vd0(jemVar.b, (cfm) obj2, jemVar, (byte) 25), new uem(2, (lnm) null, (byte) 0)), rbm.b1));
            case 14:
                rwq0.z((qtr) obj, new yem((dfm) obj2, (byte) 0));
                return rih1Var;
            case 15:
                ((iu30) ((as0) obj2).b).invoke(cem.a);
                return rih1Var;
            case 16:
                ((qtr) obj).b(new lu((qhm) obj2, (lnm) null, (byte) 18));
                return rih1Var;
            case 17:
                return ((o2l0) obj).e(((xcm) obj2).d);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                xhm xhmVar = (xhm) obj2;
                xhmVar.i.a.k("spotify:transcript:languagepicker", (tv80) obj, mno1.h(new mmr0[]{new mmr0("episode_uri", xhmVar.g)}), true);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((wmm) obj2).a;
            case 20:
                return new m441(new hqm((Set) obj, (jqm) obj2, (lnm) null));
            case 21:
                xrm xrmVar = (xrm) obj2;
                return hu20.e(d3p1.F(xrmVar.a, xrmVar.b, (yrm) obj), new i64(i, lnmVar, (byte) 5));
            case 22:
                return ((hum) obj2).a((String) obj);
            case 23:
                return (eq80) obj2;
            case 24:
                b261.k((e261) obj, new d4h(((i2n) obj2).b.size(), 1));
                return rih1Var;
            case 25:
                HttpError httpError = (Throwable) obj;
                if (!(httpError instanceof InvalidProtocolBufferException) && !(httpError instanceof UnableToParseMessageException) && !(httpError instanceof TimeoutException)) {
                    if (httpError instanceof HttpError) {
                        ((l5n) obj2).getClass();
                        tr80 tr80Var = n5n.a;
                        int i2 = ((rr80) tr80Var).a;
                        int i3 = ((rr80) tr80Var).b;
                        int i4 = httpError.a;
                        if (i2 <= i4 && i4 <= i3) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 26:
                g1i g1iVar = (g1i) ((gbn) obj2).c.a.c;
                EventSource eventSource = (EventSource) ((jly0) g1iVar.d).get();
                hbn hbnVar = (hbn) g1iVar.b;
                c8o.l((x5p) hbnVar.d.get());
                q7r0 q7r0Var = (q7r0) g1iVar.c;
                a1r0 a1r0Var = (a1r0) hbnVar.c.get();
                c8o.l(a1r0Var);
                m021 m021Var = new m021(q7r0Var, a1r0Var, (byte) 14);
                amy0 amy0Var = (amy0) hbnVar.a.get();
                c8o.l(amy0Var);
                return new sak((cir0) obj, eventSource, m021Var, amy0Var, u1n0.z(q7r0Var), (gik1) ((jly0) g1iVar.e).get(), (byte) 1);
            case 27:
                jbn jbnVar = (jbn) obj2;
                i8h1 i8h1Var = jbnVar.f;
                dsk0 dsk0Var = jbnVar.X;
                dsk0Var.getClass();
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("countries", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                tan tanVar = ((kbn) obj).a;
                String str = tanVar.a;
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("country_item", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                Consumer consumer = jbnVar.t;
                if (consumer != null) {
                    consumer.accept(new yan(tanVar));
                }
                return rih1Var;
            case 28:
                cas casVar = (a7m0) obj;
                casVar.a = cln.a;
                gln glnVar = (gln) obj2;
                casVar.d = new dln(glnVar, (byte) 0);
                casVar.e = new dln(glnVar, (byte) 1);
                casVar.a(y6n.e1, eln.b);
                return rih1Var;
            default:
                ((qtr) obj).b(new bnn((ldo) obj2, (lnm) null, (byte) 0));
                return rih1Var;
        }
    }
}
