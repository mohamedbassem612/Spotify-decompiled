package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.creativework.v1.Release;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lyy extends hab0 implements iu30 {
    public static final lyy N0;
    public static final lyy O0;
    public static final lyy P0;
    public static final lyy Q0;
    public static final lyy R0;
    public static final lyy S0;
    public static final lyy T0;
    public static final lyy U0;
    public static final lyy V0;
    public static final lyy W0;
    public static final lyy X;
    public static final lyy X0;
    public static final lyy Y;
    public static final lyy Y0;
    public static final lyy Z;
    public static final lyy Z0;
    public static final lyy a1;
    public static final lyy b;
    public static final lyy b1;
    public static final lyy c;
    public static final lyy c1;
    public static final lyy d;
    public static final lyy d1;
    public static final lyy e;
    public static final lyy e1;
    public static final lyy f;
    public static final lyy g;
    public static final lyy h;
    public static final lyy i;
    public static final lyy t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new lyy(i2, (byte) 0);
        c = new lyy(i2, (byte) 1);
        d = new lyy(i2, (byte) 2);
        e = new lyy(i2, (byte) 3);
        f = new lyy(i2, (byte) 4);
        g = new lyy(i2, (byte) 5);
        h = new lyy(i2, (byte) 6);
        i = new lyy(i2, (byte) 7);
        t = new lyy(i2, (byte) 8);
        X = new lyy(i2, (byte) 9);
        Y = new lyy(i2, (byte) 10);
        Z = new lyy(i2, (byte) 11);
        N0 = new lyy(i2, (byte) 12);
        O0 = new lyy(i2, (byte) 13);
        P0 = new lyy(i2, (byte) 14);
        Q0 = new lyy(i2, (byte) 15);
        R0 = new lyy(i2, (byte) 16);
        S0 = new lyy(i2, (byte) 17);
        T0 = new lyy(i2, (byte) 18);
        U0 = new lyy(i2, (byte) 19);
        V0 = new lyy(i2, (byte) 20);
        W0 = new lyy(i2, (byte) 21);
        X0 = new lyy(i2, (byte) 22);
        Y0 = new lyy(i2, (byte) 23);
        Z0 = new lyy(i2, (byte) 24);
        a1 = new lyy(i2, (byte) 25);
        b1 = new lyy(i2, (byte) 26);
        c1 = new lyy(i2, (byte) 27);
        d1 = new lyy(i2, (byte) 28);
        e1 = new lyy(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lyy(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return str;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                float fMax = Math.max(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.6003f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 1.0536f);
                Float fValueOf = Float.valueOf(0.45f);
                long j = szy.a;
                DrawScope.S0(drawScope, v9c.p(new mmr0[]{new mmr0(fValueOf, new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.6f), new u7h(u7h.b(j, 0.105f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(j, 0.35f, 0.0f, 0.0f, 0.0f, 14)))}, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) * 0.5f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) * 0.5f)) << 32), fMax, 8), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1.a;
            case 2:
                lo11 lo11VarO = Release.o();
                lo11VarO.q((String) obj);
                return (Release) lo11VarO.build();
            case 3:
                return new uho((String) obj, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 4:
                return new duu((String) obj);
            case 5:
                return Boolean.valueOf((obj instanceof f7l1) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 7:
                return (String) obj;
            case 8:
                return (f7l1) obj;
            case 9:
                o2z o2zVar = (o2z) obj;
                return new p2z(o2zVar.a, o2zVar.b, o2zVar.c, o2zVar.d, o2zVar.e, o2zVar.f, o2zVar.g, o2zVar.h, o2zVar.i, o2zVar.j, o2zVar.k, o2zVar.l, o2zVar.m, false, o2zVar.p, o2zVar.n, false, false, o2zVar.q, (Integer) null, o2zVar.r);
            case 10:
                p2z p2zVar = (p2z) obj;
                String str2 = p2zVar.b;
                String str3 = p2zVar.c;
                String str4 = p2zVar.g;
                String str5 = p2zVar.h;
                String str6 = p2zVar.e;
                int i2 = p2zVar.i;
                return new t2z(p2zVar.a, str2, str3, str4, str5, str6, oqn1.p(i2), o0c.F(i2, p2zVar.n, p2zVar.o), p2zVar.j, p2zVar.k, p2zVar.p, p2zVar.q, p2zVar.f, p2zVar.r, p2zVar.s, p2zVar.u);
            case 11:
                return ((o3m0) obj).l();
            case 12:
                bxo0 bxo0Var = (bxo0) obj;
                String str7 = bxo0Var.a;
                String str8 = bxo0Var.b;
                x0 x0Var = x0.a;
                return new c1(str7, str8, new a1(str7, x0Var), new a1(str7, x0Var));
            case 13:
                bxo0 bxo0Var2 = (bxo0) obj;
                String str9 = bxo0Var2.a;
                return new pyn(str9, bxo0Var2.b, new jyn(str9, 1), new jyn(str9, 1));
            case 14:
                return Collections.singleton(((bxo0) obj).a);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case 16:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 18:
                return Boolean.valueOf((obj instanceof qfd) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 20:
                return Boolean.valueOf((obj instanceof a7q0) || (obj instanceof rih1));
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 22:
                return Boolean.valueOf((obj instanceof e2k1) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (e2k1) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 27:
                return Boolean.valueOf((obj instanceof uld) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uld) obj;
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
        }
    }
}
