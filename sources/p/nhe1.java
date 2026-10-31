package p;

import android.os.Parcelable;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nhe1 extends hab0 implements iu30 {
    public static final nhe1 N0;
    public static final nhe1 O0;
    public static final nhe1 P0;
    public static final nhe1 Q0;
    public static final nhe1 R0;
    public static final nhe1 S0;
    public static final nhe1 T0;
    public static final nhe1 U0;
    public static final nhe1 V0;
    public static final nhe1 W0;
    public static final nhe1 X;
    public static final nhe1 X0;
    public static final nhe1 Y;
    public static final nhe1 Y0;
    public static final nhe1 Z;
    public static final nhe1 Z0;
    public static final nhe1 a1;
    public static final nhe1 b;
    public static final nhe1 b1;
    public static final nhe1 c;
    public static final nhe1 c1;
    public static final nhe1 d;
    public static final nhe1 d1;
    public static final nhe1 e;
    public static final nhe1 e1;
    public static final nhe1 f;
    public static final nhe1 g;
    public static final nhe1 h;
    public static final nhe1 i;
    public static final nhe1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nhe1(i2, (byte) 0);
        c = new nhe1(i2, (byte) 1);
        d = new nhe1(i2, (byte) 2);
        e = new nhe1(i2, (byte) 3);
        f = new nhe1(i2, (byte) 4);
        g = new nhe1(i2, (byte) 5);
        h = new nhe1(i2, (byte) 6);
        i = new nhe1(i2, (byte) 7);
        t = new nhe1(i2, (byte) 8);
        X = new nhe1(i2, (byte) 9);
        Y = new nhe1(i2, (byte) 10);
        Z = new nhe1(i2, (byte) 11);
        N0 = new nhe1(i2, (byte) 12);
        O0 = new nhe1(i2, (byte) 13);
        P0 = new nhe1(i2, (byte) 14);
        Q0 = new nhe1(i2, (byte) 15);
        R0 = new nhe1(i2, (byte) 16);
        S0 = new nhe1(i2, (byte) 17);
        T0 = new nhe1(i2, (byte) 18);
        U0 = new nhe1(i2, (byte) 19);
        V0 = new nhe1(i2, (byte) 20);
        W0 = new nhe1(i2, (byte) 21);
        X0 = new nhe1(i2, (byte) 22);
        Y0 = new nhe1(i2, (byte) 23);
        Z0 = new nhe1(i2, (byte) 24);
        a1 = new nhe1(i2, (byte) 25);
        b1 = new nhe1(i2, (byte) 26);
        c1 = new nhe1(i2, (byte) 27);
        d1 = new nhe1(i2, (byte) 28);
        e1 = new nhe1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhe1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return ilo1.a;
            case 2:
                ((kd31) obj).i(1);
                return rih1Var;
            case 3:
                return new xke1("", false);
            case 4:
                return rih1Var;
            case 5:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                DrawScope drawScope = (DrawScope) obj;
                List list = roe1.a;
                float fX0 = drawScope.X0(2.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f;
                float f2 = fX0 / 2.0f;
                long j = u7h.f;
                float f3 = fIntBitsToFloat - f2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f2;
                DrawScope.p0(drawScope, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), fX0, 1, (uw4) null, 480);
                return rih1Var;
            case 8:
                return new nue1();
            case 9:
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                b261.c((e261) obj);
                return rih1Var;
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                b261.F((e261) obj, true);
                return rih1Var;
            case 15:
                ((Number) obj).intValue();
                return rih1Var;
            case 16:
                ((Number) obj).intValue();
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                return rih1Var;
            case 19:
                return ((mbh0) obj).a.group();
            case 20:
                return Boolean.valueOf(((s1f1) obj) instanceof q1f1);
            case 21:
                return new q2f1("", (Integer) null, 0, false, false, true, false);
            case 22:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 23:
                ((xas) obj).a(X0, ppd1.X0);
                return rih1Var;
            case 24:
                ((n161) obj).b(lgo1.b, "TEST_TAG_TOOLTIP");
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                b261.c((e261) obj);
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return rih1Var;
            case 28:
                b261.c((e261) obj);
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
