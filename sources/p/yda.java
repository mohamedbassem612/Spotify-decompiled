package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yda extends hab0 implements iu30 {
    public static final yda N0;
    public static final yda O0;
    public static final yda P0;
    public static final yda Q0;
    public static final yda R0;
    public static final yda S0;
    public static final yda T0;
    public static final yda U0;
    public static final yda V0;
    public static final yda W0;
    public static final yda X;
    public static final yda X0;
    public static final yda Y;
    public static final yda Y0;
    public static final yda Z;
    public static final yda Z0;
    public static final yda a1;
    public static final yda b;
    public static final yda b1;
    public static final yda c;
    public static final yda c1;
    public static final yda d;
    public static final yda d1;
    public static final yda e;
    public static final yda e1;
    public static final yda f;
    public static final yda g;
    public static final yda h;
    public static final yda i;
    public static final yda t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new yda(i2, (byte) 0);
        c = new yda(i2, (byte) 1);
        d = new yda(i2, (byte) 2);
        e = new yda(i2, (byte) 3);
        f = new yda(i2, (byte) 4);
        g = new yda(i2, (byte) 5);
        h = new yda(i2, (byte) 6);
        i = new yda(i2, (byte) 7);
        t = new yda(i2, (byte) 8);
        X = new yda(i2, (byte) 9);
        Y = new yda(i2, (byte) 10);
        Z = new yda(i2, (byte) 11);
        N0 = new yda(i2, (byte) 12);
        O0 = new yda(i2, (byte) 13);
        P0 = new yda(i2, (byte) 14);
        Q0 = new yda(i2, (byte) 15);
        R0 = new yda(i2, (byte) 16);
        S0 = new yda(i2, (byte) 17);
        T0 = new yda(i2, (byte) 18);
        U0 = new yda(i2, (byte) 19);
        V0 = new yda(i2, (byte) 20);
        W0 = new yda(i2, (byte) 21);
        X0 = new yda(i2, (byte) 22);
        Y0 = new yda(i2, (byte) 23);
        Z0 = new yda(i2, (byte) 24);
        a1 = new yda(i2, (byte) 25);
        b1 = new yda(i2, (byte) 26);
        c1 = new yda(i2, (byte) 27);
        d1 = new yda(i2, (byte) 28);
        e1 = new yda(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yda(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Bespoke2026Content bespoke2026ContentQ;
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                kby kbyVar = ((wsc0) obj).f;
                return new wda(kbyVar.a, kbyVar.D, kbyVar.p, kbyVar.n, kbyVar.q);
            case 2:
            case 1:
                return null;
            case 3:
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                return n8p1.k((im6) obj, new pch(j1r.a, mm6.a, true));
            case 6:
                return mno1.h(new mmr0[]{new mmr0("artist_selection", (jm6) obj)});
            case 7:
                qtr qtrVar = (qtr) obj;
                qtrVar.b(new xia(5, (lnm) null, (byte) 0));
                qtrVar.d(h, vq9.Y);
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                bpb1 bpb1Var = fk41.b;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return new tj4((byte) 5);
            case 10:
                bpb1 bpb1Var2 = fk41.b;
                Boolean bool2 = Boolean.TRUE;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, bool2);
                return new tj4((byte) 6);
            case 11:
                ((Number) obj).intValue();
                return nim0.a;
            case 12:
                StoryCard storyCard = (StoryCard) obj;
                if (storyCard != null && (bespoke2026ContentQ = storyCard.q()) != null && bespoke2026ContentQ.U()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return rih1Var;
            case 14:
                return new qr11(((uv11) obj).a, (String) null, false);
            case 15:
                return new uho(((uv11) obj).a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 16:
                uv11 uv11Var = (uv11) obj;
                return new gvu(12, uv11Var.a, uv11Var.b, false, (String) null);
            case 17:
                uv11 uv11Var2 = (uv11) obj;
                return new t671(50, uv11Var2.a, (String) null, uv11Var2.b, "episode-row-quick-action", (List) null, false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Long.valueOf(((Number) obj).longValue() + 30000);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                nqa nqaVar = (nqa) obj;
                return new jqa(nqaVar.j(), nqaVar.h(), nqaVar.a(), nqaVar.k(), nqaVar.g(), nqaVar.getDescription(), nqaVar.b());
            case 20:
                return cqa.a;
            case 21:
                return Boolean.valueOf(!(((nqa) obj) instanceof kqa));
            case 22:
                jqa jqaVar = (jqa) obj;
                oqa.f.getClass();
                return new mqa(jqaVar.a, jqaVar.b, jqaVar.c, jqaVar.d, jqaVar.e, jqaVar.f, jqaVar.g, null);
            case 23:
                return new gqa((wkt) obj);
            case 24:
                return new bqa(((Boolean) obj).booleanValue());
            case 25:
                g271 g271Var = (g271) obj;
                u771 u771Var = g271Var.a;
                pz61 pz61Var = u771Var.b;
                qqa qqaVar = (qqa) pz61Var.b;
                int i2 = g271Var.c;
                t771 t771Var = u771Var.a;
                return new jqa(i2, t771Var.b, pz61Var.c, t771Var.a, qqaVar.a, qqaVar.b, qqaVar.c);
            case 26:
                double dDoubleValue = ((Number) obj).doubleValue();
                double d2 = 0.0d;
                if (dDoubleValue > 0.0d) {
                    double dN = yoi1.n(dDoubleValue, 0.0d, 1.0d);
                    double d3 = ara.a;
                    d2 = ((1.0d - d3) * dN) + d3;
                }
                return Double.valueOf(d2);
            case 27:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((pll0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                return ((nza) obj).a;
            default:
                return ((nza) obj).a;
        }
    }
}
