package p;

import android.os.Bundle;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mmp0 extends hab0 implements iu30 {
    public static final mmp0 N0;
    public static final mmp0 O0;
    public static final mmp0 P0;
    public static final mmp0 Q0;
    public static final mmp0 R0;
    public static final mmp0 S0;
    public static final mmp0 T0;
    public static final mmp0 U0;
    public static final mmp0 V0;
    public static final mmp0 W0;
    public static final mmp0 X;
    public static final mmp0 X0;
    public static final mmp0 Y;
    public static final mmp0 Y0;
    public static final mmp0 Z;
    public static final mmp0 Z0;
    public static final mmp0 a1;
    public static final mmp0 b;
    public static final mmp0 b1;
    public static final mmp0 c;
    public static final mmp0 c1;
    public static final mmp0 d;
    public static final mmp0 d1;
    public static final mmp0 e;
    public static final mmp0 e1;
    public static final mmp0 f;
    public static final mmp0 g;
    public static final mmp0 h;
    public static final mmp0 i;
    public static final mmp0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new mmp0(i2, (byte) 0);
        c = new mmp0(i2, (byte) 1);
        d = new mmp0(i2, (byte) 2);
        e = new mmp0(i2, (byte) 3);
        f = new mmp0(i2, (byte) 4);
        g = new mmp0(i2, (byte) 5);
        h = new mmp0(i2, (byte) 6);
        i = new mmp0(i2, (byte) 7);
        t = new mmp0(i2, (byte) 8);
        X = new mmp0(i2, (byte) 9);
        Y = new mmp0(i2, (byte) 10);
        Z = new mmp0(i2, (byte) 11);
        N0 = new mmp0(i2, (byte) 12);
        O0 = new mmp0(i2, (byte) 13);
        P0 = new mmp0(i2, (byte) 14);
        Q0 = new mmp0(i2, (byte) 15);
        R0 = new mmp0(i2, (byte) 16);
        S0 = new mmp0(i2, (byte) 17);
        T0 = new mmp0(i2, (byte) 18);
        U0 = new mmp0(i2, (byte) 19);
        V0 = new mmp0(i2, (byte) 20);
        W0 = new mmp0(i2, (byte) 21);
        X0 = new mmp0(i2, (byte) 22);
        Y0 = new mmp0(i2, (byte) 23);
        Z0 = new mmp0(i2, (byte) 24);
        a1 = new mmp0(i2, (byte) 25);
        b1 = new mmp0(i2, (byte) 26);
        c1 = new mmp0(i2, (byte) 27);
        d1 = new mmp0(i2, (byte) 28);
        e1 = new mmp0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mmp0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        z6x z6xVar = z6x.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                zh71 zh71Var = (zh71) obj;
                te71 te71Var = zh71Var.h;
                p571 p571Var = zh71Var.f;
                o571 o571Var = p571Var.a;
                String str = zh71Var.c;
                va71 va71Var = zh71Var.d;
                String str2 = zh71Var.a;
                String str3 = zh71Var.b;
                int i2 = zh71Var.g;
                bb71 bb71Var = zh71Var.e;
                return new jmp0(o571Var, !bb71Var.a.c.a.contains(o571Var), (te71Var instanceof qe71) && u890.j(((qe71) te71Var).a, p571Var.a), str, bb71Var, va71Var, str2, str3, i2, p571Var.b);
            case 1:
                omp0 omp0Var = (omp0) obj;
                return new qmp0(omp0Var.c, (String) null, omp0Var.e, pmp0.a);
            case 2:
                qmp0 qmp0Var = (qmp0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("off_platform_friend_invite_screen", qmp0Var.d.name());
                bundle.putString("off_platform_friend_invite_qr_code_content", qmp0Var.b);
                return bundle;
            case 3:
                return dop0.a;
            case 4:
                return new oop0(false);
            case 5:
                return rih1Var;
            case 6:
                return new sop0((Boolean) null);
            case 7:
                return rih1Var;
            case 8:
                return new yop0(z6xVar);
            case 9:
                throw td6.k(obj);
            case 10:
                return Boolean.FALSE;
            case 11:
                if (obj != null) {
                    throw new ClassCastException();
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListConceptsTable.Value");
            case 12:
                return xop0.a;
            case 13:
                return new fpp0(z6xVar);
            case 14:
                return rih1Var;
            case 15:
                return new g4d0((String) obj);
            case 16:
                return (g3d0) obj;
            case 17:
                return Boolean.valueOf(obj instanceof g3d0);
            case 18:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 19:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.a(e261Var);
                return rih1Var;
            case 20:
                return new g1l0((i3l0) obj);
            case 21:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return new zrp0("", "", (hux) null, fg91.b);
            case 24:
                return new ntp0((jfv) null, (jfv) null);
            case 25:
                return new hxl0(new opl0((r6h1) obj, (byte) 14));
            case 26:
                gxl0 gxl0Var = (gxl0) obj;
                x6h1 x6h1VarC = gxl0Var.a.c();
                x6h1VarC.i.add(new a7h1("confirm_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), gxl0Var.b.b.b, System.currentTimeMillis());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                gxl0 gxl0Var2 = (gxl0) obj;
                x6h1 x6h1VarC2 = gxl0Var2.a.c();
                x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), gxl0Var2.b.b.b, System.currentTimeMillis());
            case 28:
                return new wup0(((tup0) obj).a);
            default:
                return ((rup0) obj).b;
        }
    }
}
