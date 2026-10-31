package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k9b0 extends hab0 implements vu30 {
    public static final k9b0 N0;
    public static final k9b0 O0;
    public static final k9b0 P0;
    public static final k9b0 Q0;
    public static final k9b0 R0;
    public static final k9b0 S0;
    public static final k9b0 T0;
    public static final k9b0 U0;
    public static final k9b0 V0;
    public static final k9b0 W0;
    public static final k9b0 X;
    public static final k9b0 X0;
    public static final k9b0 Y;
    public static final k9b0 Y0;
    public static final k9b0 Z;
    public static final k9b0 Z0;
    public static final k9b0 a1;
    public static final k9b0 b;
    public static final k9b0 b1;
    public static final k9b0 c;
    public static final k9b0 c1;
    public static final k9b0 d;
    public static final k9b0 d1;
    public static final k9b0 e;
    public static final k9b0 e1;
    public static final k9b0 f;
    public static final k9b0 g;
    public static final k9b0 h;
    public static final k9b0 i;
    public static final k9b0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new k9b0(i2, (byte) 0);
        c = new k9b0(i2, (byte) 1);
        d = new k9b0(i2, (byte) 2);
        e = new k9b0(i2, (byte) 3);
        f = new k9b0(i2, (byte) 4);
        g = new k9b0(i2, (byte) 5);
        h = new k9b0(i2, (byte) 6);
        i = new k9b0(i2, (byte) 7);
        t = new k9b0(i2, (byte) 8);
        X = new k9b0(i2, (byte) 9);
        Y = new k9b0(i2, (byte) 10);
        Z = new k9b0(i2, (byte) 11);
        N0 = new k9b0(i2, (byte) 12);
        O0 = new k9b0(i2, (byte) 13);
        P0 = new k9b0(i2, (byte) 14);
        Q0 = new k9b0(i2, (byte) 15);
        R0 = new k9b0(i2, (byte) 16);
        S0 = new k9b0(i2, (byte) 17);
        T0 = new k9b0(i2, (byte) 18);
        U0 = new k9b0(i2, (byte) 19);
        V0 = new k9b0(i2, (byte) 20);
        W0 = new k9b0(i2, (byte) 21);
        X0 = new k9b0(i2, (byte) 22);
        Y0 = new k9b0(i2, (byte) 23);
        Z0 = new k9b0(i2, (byte) 24);
        a1 = new k9b0(i2, (byte) 25);
        b1 = new k9b0(i2, (byte) 26);
        c1 = new k9b0(i2, (byte) 27);
        d1 = new k9b0(i2, (byte) 28);
        e1 = new k9b0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9b0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        float f2;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return Boolean.valueOf(((r9b0) obj).a == ((r9b0) obj2).a);
            case 9:
                icx icxVar = ((afx) obj).a;
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = icxVar.c;
                } else if (iOrdinal == 1) {
                    j = icxVar.e;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    j = icxVar.d;
                }
                return new u7h(j);
            case 10:
                bcb0 bcb0Var = (bcb0) jhc1.t((Bundle) obj, "LanguagePickerPageElementStateKey", bcb0.class);
                return bcb0Var == null ? new bcb0() : bcb0Var;
            case 11:
                sdb0 sdb0Var = (sdb0) obj;
                return new eeb0(new beb0(sdb0Var.a), new xcb0(sdb0Var.b));
            case 12:
                return new bfb0(((Boolean) obj2).booleanValue());
            case 13:
                oib0 oib0Var = (oib0) obj2;
                return new pib0((String) obj, oib0Var.a, oib0Var.b);
            case 14:
                return new oib0((jo70) obj, (xkk1) obj2);
            case 15:
                Logger.l((Throwable) obj2, "Failure from confirmGeneration endpoint", new Object[0]);
                return new xvk((gmc1) obj);
            case 16:
                ft40 ft40Var = (ft40) obj2;
                return ft40Var instanceof iql1 ? ft40Var : obj;
            case 17:
                ft40 ft40Var2 = (ft40) obj2;
                return ft40Var2 instanceof f660 ? ft40Var2 : obj;
            case 18:
                ft40 ft40Var3 = (ft40) obj2;
                return ft40Var3 instanceof iql1 ? ft40Var3 : obj;
            case 19:
                ft40 ft40Var4 = (ft40) obj2;
                return ft40Var4 instanceof f660 ? ft40Var4 : obj;
            case 20:
                ft40 ft40Var5 = (ft40) obj2;
                return ft40Var5 instanceof iql1 ? ft40Var5 : obj;
            case 21:
                ft40 ft40Var6 = (ft40) obj2;
                return ft40Var6 instanceof f660 ? ft40Var6 : obj;
            case 22:
                ft40 ft40Var7 = (ft40) obj2;
                return ft40Var7 instanceof cm3 ? ft40Var7 : obj;
            case 23:
                ft40 ft40Var8 = (ft40) obj2;
                return ft40Var8 instanceof iql1 ? ft40Var8 : obj;
            case 24:
                ft40 ft40Var9 = (ft40) obj2;
                return ft40Var9 instanceof f660 ? ft40Var9 : obj;
            case 25:
                pob0 pob0Var = (pob0) obj2;
                Float[] fArr = new Float[4];
                fArr[0] = pob0Var.g.e();
                fArr[1] = pob0Var.h.e();
                tz20 tz20Var = (tz20) pob0Var.c.getValue();
                if (tz20Var instanceof rz20) {
                    f2 = -1.0f;
                } else {
                    if (!(tz20Var instanceof qz20)) {
                        eg.o();
                        return null;
                    }
                    f2 = ((qz20) tz20Var).a;
                }
                fArr[2] = Float.valueOf(f2);
                fArr[3] = Float.valueOf(pob0Var.k.s());
                return p7h.M(fArr);
            case 26:
                return new fwb0((ewb0) obj, ((Boolean) obj2).booleanValue());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return Next.j();
            case 28:
                return First.b((eyb0) obj2);
            default:
                return null;
        }
    }
}
