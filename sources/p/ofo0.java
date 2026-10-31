package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.scrollsita.v1.Section;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ofo0 extends hab0 implements vu30 {
    public static final ofo0 N0;
    public static final ofo0 O0;
    public static final ofo0 P0;
    public static final ofo0 Q0;
    public static final ofo0 R0;
    public static final ofo0 S0;
    public static final ofo0 T0;
    public static final ofo0 U0;
    public static final ofo0 V0;
    public static final ofo0 W0;
    public static final ofo0 X;
    public static final ofo0 X0;
    public static final ofo0 Y;
    public static final ofo0 Y0;
    public static final ofo0 Z;
    public static final ofo0 Z0;
    public static final ofo0 a1;
    public static final ofo0 b;
    public static final ofo0 b1;
    public static final ofo0 c;
    public static final ofo0 c1;
    public static final ofo0 d;
    public static final ofo0 d1;
    public static final ofo0 e;
    public static final ofo0 e1;
    public static final ofo0 f;
    public static final ofo0 g;
    public static final ofo0 h;
    public static final ofo0 i;
    public static final ofo0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ofo0(i2, (byte) 0);
        c = new ofo0(i2, (byte) 1);
        d = new ofo0(i2, (byte) 2);
        e = new ofo0(i2, (byte) 3);
        f = new ofo0(i2, (byte) 4);
        g = new ofo0(i2, (byte) 5);
        h = new ofo0(i2, (byte) 6);
        i = new ofo0(i2, (byte) 7);
        t = new ofo0(i2, (byte) 8);
        X = new ofo0(i2, (byte) 9);
        Y = new ofo0(i2, (byte) 10);
        Z = new ofo0(i2, (byte) 11);
        N0 = new ofo0(i2, (byte) 12);
        O0 = new ofo0(i2, (byte) 13);
        P0 = new ofo0(i2, (byte) 14);
        Q0 = new ofo0(i2, (byte) 15);
        R0 = new ofo0(i2, (byte) 16);
        S0 = new ofo0(i2, (byte) 17);
        T0 = new ofo0(i2, (byte) 18);
        U0 = new ofo0(i2, (byte) 19);
        V0 = new ofo0(i2, (byte) 20);
        W0 = new ofo0(i2, (byte) 21);
        X0 = new ofo0(i2, (byte) 22);
        Y0 = new ofo0(i2, (byte) 23);
        Z0 = new ofo0(i2, (byte) 24);
        a1 = new ofo0(i2, (byte) 25);
        b1 = new ofo0(i2, (byte) 26);
        c1 = new ofo0(i2, (byte) 27);
        d1 = new ofo0(i2, (byte) 28);
        e1 = new ofo0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ofo0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str;
        mq70 mq70Var;
        List list;
        up70 up70Var;
        amo0 amo0Var;
        pmp0 pmp0VarValueOf;
        String str2 = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                mmr0 mmr0Var = (mmr0) obj;
                ft40 ft40Var = (ft40) obj2;
                return ft40Var instanceof jy9 ? new mmr0(ft40Var, mmr0Var.b) : new mmr0(mmr0Var.a, ((gt40) mmr0Var.b).c(ft40Var));
            case 1:
                mmr0 mmr0Var2 = (mmr0) obj;
                ft40 ft40Var2 = (ft40) obj2;
                return ft40Var2 instanceof q60 ? new mmr0(ft40Var2, mmr0Var2.b) : new mmr0(mmr0Var2.a, ((gt40) mmr0Var2.b).c(ft40Var2));
            case 2:
                int iIntValue = ((Number) obj).intValue();
                if (((ft40) obj2) instanceof q60) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 3:
                return new ggo0((r231) obj, ((ggo0) obj2).b);
            case 4:
                return new u7h(u7h.j);
            case 5:
                bio0 bio0Var = (bio0) obj;
                return new cio0(bio0Var.a, (List) obj2, bio0Var.b, bio0Var.c);
            case 6:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                if (jo70Var == null || (str = jo70Var.a) == null || str.length() == 0) {
                    str = null;
                }
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (list = mq70Var.a) != null && (up70Var = (up70) o7h.s0(list)) != null) {
                    str2 = up70Var.a.a;
                }
                return new s2o(str, str2, false);
            case 7:
                jo70 jo70Var2 = (jo70) obj;
                uwz0 uwz0Var = (uwz0) obj2;
                str2 = jo70Var2 != null ? jo70Var2.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                return new vlo0(str2, uwz0Var instanceof twz0 ? eh10.R0 : yb10.R0);
            case 8:
                w910 w910Var = (w910) obj2;
                aoo0 aoo0Var = w910Var.b.a;
                if (aoo0Var instanceof yno0) {
                    amo0Var = ylo0.a;
                } else {
                    if (!(aoo0Var instanceof zno0)) {
                        eg.o();
                        return null;
                    }
                    amo0Var = zlo0.a;
                }
                vlo0 vlo0Var = w910Var.a;
                return new bmo0(vlo0Var.a, amo0Var, vlo0Var.b);
            case 9:
                qpo0 qpo0Var = (qpo0) obj;
                return new rpo0(qpo0Var.a, qpo0Var.b, (jpo0) obj2);
            case 10:
                return Boolean.valueOf(u890.j(((ContextTrack) ((PlayerState) obj).track().b()).uri(), ((ContextTrack) ((PlayerState) obj2).track().b()).uri()));
            case 11:
                return new yyo0((Set) obj2, ((xyo0) obj).a);
            case 12:
                return ((f1p0) obj).d;
            case 13:
                return (y1p0) obj2;
            case 14:
                return (p7p0) obj2;
            case 15:
                return Next.j();
            case 16:
                return First.b((w9p0) obj2);
            case 17:
                return Boolean.valueOf(((PlayerState) obj).isPaused() == ((PlayerState) obj2).isPaused());
            case 18:
                q1g1 q1g1Var = (q1g1) obj;
                q1g1 q1g1Var2 = (q1g1) obj2;
                if (q1g1Var.equals(q1g1Var2) || ((q1g1Var instanceof l1g1) && (q1g1Var2 instanceof k1g1))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                vlp0 vlp0Var = (vlp0) obj;
                return Next.h(wlp0.a((wlp0) obj2, 0, vlp0Var.a, 0, vlp0Var.b, false, 21));
            case 20:
                Bundle bundle = (Bundle) obj;
                omp0 omp0Var = (omp0) obj2;
                String string = bundle.getString("off_platform_friend_invite_screen");
                if (string == null || (pmp0VarValueOf = pmp0.valueOf(string)) == null) {
                    pmp0VarValueOf = pmp0.a;
                }
                return new qmp0(omp0Var.c, bundle.getString("off_platform_friend_invite_qr_code_content"), omp0Var.e, pmp0VarValueOf);
            case 21:
                return new mnp0((nnp0) obj, ((Number) obj2).intValue());
            case 22:
                return zso1.c0(((cfr0) obj).b, (op80) obj2);
            case 23:
                return new oop0(((Boolean) obj2).booleanValue());
            case 24:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new sop0(bool);
            case 25:
                return new yop0((List) obj2);
            case 26:
                return new fpp0((List) obj2);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new zqp0(obj, ((Boolean) obj2).booleanValue());
            case 28:
                hxl0 hxl0Var = (hxl0) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                y6h1 y6h1Var = hxl0Var.a;
                r6h1 r6h1Var = hxl0Var.b.b;
                b7x b7xVar = b7x.a;
                return zBooleanValue ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("setting_enable", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1Var, r6h1Var, System.currentTimeMillis());
            default:
                wvp0 wvp0Var = (wvp0) obj;
                f910 f910Var = (f910) obj2;
                String str3 = wvp0Var.a;
                String str4 = wvp0Var.b;
                String str5 = wvp0Var.c;
                String str6 = wvp0Var.d;
                int i2 = wvp0Var.e;
                int i3 = wvp0Var.f;
                boolean z2 = f910Var.c;
                boolean z3 = f910Var.b;
                boolean z4 = f910Var.f;
                boolean z5 = wvp0Var.g;
                int iQ = o0c.Q(f910Var.a, str3);
                boolean z6 = f910Var.d;
                o841 o841Var = f910Var.e;
                return new xvp0(str3, str4, str5, str6, i2, i3, z2, z3, z4, z5, iQ, z6, o841Var != o841.a, o841Var == o841.b);
        }
    }
}
