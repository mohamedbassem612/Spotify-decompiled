package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ry4 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ry4(ArrayList arrayList, byte b) {
        this.a = b;
        this.b = arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        String strY0;
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                p5t0 p5t0Var = (p5t0) obj;
                int iL = p7h.L(arrayList);
                if (iL >= 0) {
                    int i = 0;
                    while (true) {
                        p5t0.l(0, 0, p5t0Var, (q5t0) arrayList.get(i));
                        if (i != iL) {
                            i++;
                        }
                    }
                }
                return rih1.a;
            case 1:
                return ((zm7) arrayList.get(((Number) obj).intValue())).a;
            case 2:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 3:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 4:
                return ((jwm) arrayList.get(((Number) obj).intValue())).a.a;
            case 5:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 6:
                return ((tpy) arrayList.get(((Number) obj).intValue())).a;
            case 7:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 8:
                return ((kdl) arrayList.get(((Number) obj).intValue())).a;
            case 9:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 10:
                return ((kdl) arrayList.get(((Number) obj).intValue())).a;
            case 11:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 12:
                return ((o6g0) arrayList.get(((Number) obj).intValue())).getUuid();
            case 13:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                return szr.t.invoke(Integer.valueOf(iIntValue), arrayList.get(iIntValue));
            case 15:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 16:
                return ((zha1) arrayList.get(((Number) obj).intValue())).name();
            case 17:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 18:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 19:
                he00 he00Var = (ke00) arrayList.get(((Number) obj).intValue());
                if (he00Var instanceof he00) {
                    strY0 = he00Var.a;
                } else if (he00Var instanceof je00) {
                    strY0 = ((je00) he00Var).a;
                } else if (he00Var instanceof ie00) {
                    strY0 = o7h.y0(z6x.a, ",", (String) null, (String) null, (iu30) null, 62);
                } else {
                    if (!(he00Var instanceof ge00)) {
                        eg.o();
                        return null;
                    }
                    strY0 = ((ge00) he00Var).a;
                }
                return strY0;
            case 20:
                ke00 ke00Var = (ke00) arrayList.get(((Number) obj).intValue());
                if (ke00Var instanceof he00) {
                    return "event";
                }
                if (ke00Var instanceof je00) {
                    return "venue";
                }
                if (ke00Var instanceof ie00) {
                    return "multi_event";
                }
                if (ke00Var instanceof ge00) {
                    return "album";
                }
                eg.o();
                return null;
            case 21:
                bf00 bf00Var = (bf00) arrayList.get(((Number) obj).intValue());
                if ((bf00Var instanceof ze00) || (bf00Var instanceof ye00) || (bf00Var instanceof af00)) {
                    throw null;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                bf00 bf00Var2 = (bf00) arrayList.get(((Number) obj).intValue());
                if (bf00Var2 instanceof ze00) {
                    return "event";
                }
                if (bf00Var2 instanceof ye00) {
                    return "album";
                }
                if (bf00Var2 instanceof af00) {
                    return "venue";
                }
                eg.o();
                return null;
            case 23:
                return arrayList.get(((Number) obj).intValue()).getClass().getName();
            case 24:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 25:
                arrayList.get(((Number) obj).intValue());
                return null;
            case 26:
                int iIntValue2 = ((Number) obj).intValue();
                return Integer.valueOf(iIntValue2);
            case 27:
                arrayList.get(((Number) obj).intValue());
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ((dji0) arrayList.get(((Number) obj).intValue())).d;
            default:
                arrayList.get(((Number) obj).intValue());
                return null;
        }
    }
}
