package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mwr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwr(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new f1x((Exception) obj));
                return rih1Var;
            case 1:
                iu30Var.invoke(h2x.a);
                return rih1Var;
            case 2:
                iu30Var.invoke(h2x.c);
                return rih1Var;
            case 3:
                iu30Var.invoke(h2x.b);
                return rih1Var;
            case 4:
                iu30Var.invoke(h2x.d);
                return rih1Var;
            case 5:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(d2z.e);
                return rih1Var;
            case 6:
                iu30Var.invoke(d2z.d);
                return rih1Var;
            case 7:
                iu30Var.invoke(d2z.c);
                return rih1Var;
            case 8:
                int iOrdinal = ((a20) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(s2z.c);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(s2z.d);
                }
                return rih1Var;
            case 9:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(l9z.a);
                return rih1Var;
            case 10:
                iu30Var.invoke(new m9z(((abz) obj).a));
                return rih1Var;
            case 11:
                int iOrdinal2 = ((a20) obj).ordinal();
                if (iOrdinal2 == 0) {
                    iu30Var.invoke(ebz.b);
                } else if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 12:
                iu30Var.invoke(new dc20((List) obj));
                return rih1Var;
            case 13:
                iu30Var.invoke(new cc20((String) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(qg20.a);
                return rih1Var;
            case 15:
                int iOrdinal3 = ((a20) obj).ordinal();
                if (iOrdinal3 == 0) {
                    iu30Var.invoke(ak60.b);
                } else if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 16:
                iu30Var.invoke(mt70.a);
                return rih1Var;
            case 17:
                iu30Var.invoke(zvp0.c);
                return rih1Var;
            case 18:
                iu30Var.invoke(yis0.b);
                return rih1Var;
            case 19:
                iu30Var.invoke(tgu0.a);
                return rih1Var;
            case 20:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(tgu0.f);
                return rih1Var;
            case 21:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(tgu0.e);
                return rih1Var;
            case 22:
                iu30Var.invoke(tgu0.d);
                return rih1Var;
            case 23:
                int iOrdinal4 = ((a20) obj).ordinal();
                if (iOrdinal4 == 0) {
                    iu30Var.invoke(jhu0.b);
                } else {
                    if (iOrdinal4 != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(jhu0.c);
                }
                return rih1Var;
            case 24:
                iu30Var.invoke(wsu0.b);
                return rih1Var;
            case 25:
                iu30Var.invoke(new zhv0((ok1) obj));
                return rih1Var;
            case 26:
                fan fanVar = (fan) obj;
                if (fanVar instanceof dan) {
                    iu30Var.invoke(aiv0.c);
                } else if (fanVar instanceof ean) {
                    iu30Var.invoke(aiv0.d);
                } else if (!(fanVar instanceof can) && !(fanVar instanceof ban)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 27:
                iu30Var.invoke(u3w0.a);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke(t3w0.a);
                return rih1Var;
            default:
                if (((ezn) obj).equals(czn.a)) {
                    iu30Var.invoke(x3w0.a);
                }
                return rih1Var;
        }
    }
}
