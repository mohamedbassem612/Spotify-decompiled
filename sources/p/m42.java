package p;

import com.spotify.mobius.functions.Consumer;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Emitter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m42 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m42(Consumer consumer, byte b) {
        super(1);
        this.a = b;
        this.b = consumer;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept((c52) obj);
                return rih1Var;
            case 1:
                consumer.accept(new ao5((do5) obj));
                return rih1Var;
            case 2:
                consumer.accept(new bo5((do5) obj));
                return rih1Var;
            case 3:
                consumer.accept((sn6) obj);
                return rih1Var;
            case 4:
                consumer.accept(lf7.a);
                return rih1Var;
            case 5:
                ((Boolean) obj).booleanValue();
                consumer.accept(wzb.a);
                return rih1Var;
            case 6:
                int iOrdinal = ((ixb) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        consumer.accept(xzb.a);
                    } else {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        consumer.accept(yzb.a);
                    }
                }
                return rih1Var;
            case 7:
                consumer.accept((vlk) obj);
                return rih1Var;
            case 8:
                consumer.accept((apk) obj);
                return rih1Var;
            case 9:
                if (((Boolean) obj).booleanValue()) {
                    consumer.accept(pel.a);
                }
                return rih1Var;
            case 10:
                ((Boolean) obj).booleanValue();
                consumer.accept(luv.a);
                return rih1Var;
            case 11:
                c1w c1wVar = (d1w) obj;
                if (c1wVar instanceof c1w) {
                    consumer.accept(new f0w(c1wVar.a));
                } else if (!(c1wVar instanceof a1w)) {
                    if (!(c1wVar instanceof b1w)) {
                        eg.o();
                        return null;
                    }
                    consumer.accept(rzv.a);
                }
                return rih1Var;
            case 12:
                c1w c1wVar2 = (d1w) obj;
                if (c1wVar2 instanceof c1w) {
                    consumer.accept(new e0w(c1wVar2.a));
                } else if (!(c1wVar2 instanceof a1w) && !(c1wVar2 instanceof b1w)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 13:
                d1w d1wVar = (d1w) obj;
                if (!(d1wVar instanceof c1w)) {
                    if (!(d1wVar instanceof a1w) && !(d1wVar instanceof b1w)) {
                        eg.o();
                        return null;
                    }
                    consumer.accept(yzv.a);
                }
                return rih1Var;
            case 14:
                d1w d1wVar2 = (d1w) obj;
                if (!(d1wVar2 instanceof c1w)) {
                    if (!(d1wVar2 instanceof a1w) && !(d1wVar2 instanceof b1w)) {
                        eg.o();
                        return null;
                    }
                    consumer.accept(xzv.a);
                }
                return rih1Var;
            case 15:
                consumer.accept(new axw((String) obj, true));
                return rih1Var;
            case 16:
                tw10 tw10Var = (tw10) obj;
                Object obj2 = tw10Var.a;
                nw10 nw10Var = obj2 instanceof nw10 ? (nw10) obj2 : null;
                consumer.accept(new lv10(tw10Var.b, nw10Var != null ? nw10Var.b : false));
                return Boolean.FALSE;
            case 17:
                consumer.accept(nv10.a);
                return Boolean.TRUE;
            case 18:
                consumer.accept(mv10.a);
                return Boolean.TRUE;
            case 19:
                consumer.accept((s9h) obj);
                return rih1Var;
            case 20:
                consumer.accept(new u3c0((String) obj));
                return rih1Var;
            case 21:
                ssg0 ssg0Var = (vsg0) obj;
                if (ssg0Var instanceof ssg0) {
                    consumer.accept(new nrg0(ssg0Var.a));
                } else if (ssg0Var instanceof tsg0) {
                    consumer.accept(new org0(((tsg0) ssg0Var).a));
                } else if (ssg0Var instanceof rsg0) {
                    consumer.accept(mrg0.a);
                } else if (ssg0Var instanceof psg0) {
                    consumer.accept(jrg0.a);
                } else if (ssg0Var instanceof qsg0) {
                    consumer.accept(krg0.a);
                } else {
                    if (!(ssg0Var instanceof usg0)) {
                        eg.o();
                        return null;
                    }
                    consumer.accept(lrg0.a);
                }
                return rih1Var;
            case 22:
                consumer.accept(new ogp0((Emitter) obj));
                return rih1Var;
            case 23:
                consumer.accept(new f6s0((String) obj, true));
                return rih1Var;
            case 24:
                zww0 zww0Var = (ixw0) obj;
                if (zww0Var.equals(exw0.a)) {
                    consumer.accept(syw0.a);
                } else if (zww0Var.equals(fxw0.a)) {
                    consumer.accept(tyw0.a);
                } else if (zww0Var instanceof axw0) {
                    consumer.accept(oyw0.a);
                } else if (zww0Var instanceof zww0) {
                    consumer.accept(new nyw0(zww0Var.a));
                } else if (zww0Var.equals(bxw0.a)) {
                    consumer.accept(pyw0.a);
                } else if (zww0Var.equals(cxw0.a)) {
                    consumer.accept(qyw0.a);
                } else if (zww0Var.equals(dxw0.a)) {
                    consumer.accept(ryw0.a);
                } else if (zww0Var.equals(hxw0.a)) {
                    consumer.accept(jzw0.a);
                } else {
                    if (!zww0Var.equals(gxw0.a)) {
                        eg.o();
                        return null;
                    }
                    consumer.accept(izw0.a);
                }
                return rih1Var;
            case 25:
                consumer.accept(new wax0((r830) obj));
                return rih1Var;
            case 26:
                consumer.accept(new pax0((obx0) obj));
                return rih1Var;
            case 27:
                consumer.accept(new max0((obx0) obj));
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                consumer.accept(new lax0((obx0) obj));
                return rih1Var;
            default:
                consumer.accept(new oax0((obx0) obj));
                return rih1Var;
        }
    }
}
