package p;

import android.content.Context;
import androidx.car.app.k;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0q implements jly0 {
    public final daq a;
    public final r4p b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public w0q(daq daqVar, r4p r4pVar, int i) {
        this.a = daqVar;
        this.b = r4pVar;
        this.c = i;
    }

    @Override // p.kly0
    public final Object get() {
        daq daqVar = this.a;
        r4p r4pVar = this.b;
        byte b = this.c;
        switch (b) {
            case 0:
                return new iwc(r4pVar.c(), r4pVar.C(), xqu.a((g5t) r4pVar.d), xqu.a((jly0) r4pVar.g), r4pVar.y(), xqu.a((w0q) r4pVar.h), (oie) daqVar.bf.get(), r4pVar.k(), r4pVar.a(), (yvc) ((jly0) r4pVar.C).get(), (zvc) ((jly0) r4pVar.f).get());
            case 1:
                return new qzn0((q8n) daqVar.V2.get(), (hp41) ((jly0) r4pVar.a).get(), r4pVar.j(), (w0q) r4pVar.e, (zvc) ((jly0) r4pVar.f).get(), r4pVar.k(), r4pVar.a(), n0a.o());
            case 2:
                return bhb.w((k) ((w0q) r4pVar.c).get());
            case 3:
                return bhb.t();
            case 4:
                return new iue0((k) ((w0q) r4pVar.c).get(), (qzn0) ((g5t) r4pVar.d).get(), n0a.p(), r4pVar.k(), r4pVar.a());
            case 5:
                return new zvc();
            case 6:
                return new b5a0((k) ((w0q) r4pVar.c).get(), r4pVar.b(), r4pVar.K());
            case 7:
                gg11 gg11VarA = r4pVar.A();
                gg11 gg11VarB = r4pVar.B();
                return w290.D(r4pVar.h(), w290.i(), gg11VarA, gg11VarB, r4pVar.z());
            case 8:
                return new yvc((w0q) r4pVar.l, (w0q) r4pVar.r, (t0q) ((jly0) r4pVar.s).get(), (w0q) r4pVar.u, (u0q) ((jly0) r4pVar.v).get(), (w0q) r4pVar.w, (w0q) r4pVar.x, (w0q) r4pVar.y, (v0q) ((jly0) r4pVar.A).get(), (w0q) r4pVar.B);
            case 9:
                return new qhd1((k) ((w0q) r4pVar.c).get(), r4pVar.J(), r4pVar.p(), r4pVar.k(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.a(), (zle1) daqVar.a3.get(), r4pVar.G(), r4pVar.l(), r4pVar.r(), n0a.o(), r4pVar.I(), r4pVar.q());
            case 10:
                return new fln0((jo0) daqVar.fb.get(), (q8n) daqVar.E1.get());
            case 11:
                return new kzp0((w5b1) daqVar.W3.get());
            case 12:
                return new jln0((fln0) ((w0q) r4pVar.i).get(), (kzp0) ((w0q) r4pVar.j).get(), (iln0) daqVar.No.get(), r4pVar.D());
            case 13:
                return new e6p0((k) ((w0q) r4pVar.c).get(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.k(), r4pVar.E(), r4pVar.a(), r4pVar.r(), (qmu) ((jly0) r4pVar.p).get());
            case 14:
                return new qmu((jly0) r4pVar.m, (g38) ((jly0) r4pVar.o).get(), (mr20) daqVar.ul.get(), (Flowable) daqVar.D5.get());
            case 15:
                return ton1.A((xm41) daqVar.Yl.get());
            case 16:
                return hva1.f((n8q) daqVar.ql.get(), r4pVar.f());
            case 17:
                return new xuc((k) ((w0q) r4pVar.c).get(), r4pVar.n(), r4pVar.e());
            case 18:
                return new t290(r4pVar.d(), (yqg) daqVar.J1.get());
            case 19:
                return new t0q(this);
            case 20:
                return new ibz0((k) ((w0q) r4pVar.c).get(), r4pVar.r(), r4pVar.H(), r4pVar.p(), r4pVar.k(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.a());
            case 21:
                return new i5a1((bo71) daqVar.eo.get(), (Context) daqVar.x1.a, (q8n) daqVar.E1.get());
            case 22:
                return new u0q(this);
            case 23:
                return new o2a0((k) ((w0q) r4pVar.c).get(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.k(), r4pVar.x(), r4pVar.a());
            case 24:
                return new xz90(r4pVar.w(), (k) ((w0q) r4pVar.c).get(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.k(), r4pVar.a());
            case 25:
                return new gx80((k) ((w0q) r4pVar.c).get(), r4pVar.v(), (qmu) ((jly0) r4pVar.p).get(), r4pVar.k(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.a());
            case 26:
                return new v0q(this);
            case 27:
                return n0a.t((tlu) daqVar.Gc.get(), (lvc0) daqVar.i5.get());
            case 28:
                return new eo((k) ((w0q) r4pVar.c).get(), n0a.o(), (qzn0) ((g5t) r4pVar.d).get(), r4pVar.k(), r4pVar.a());
            default:
                jah.e(b);
                return null;
        }
    }
}
