package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i7z extends hab0 implements iu30 {
    public static final i7z N0;
    public static final i7z O0;
    public static final i7z P0;
    public static final i7z Q0;
    public static final i7z R0;
    public static final i7z S0;
    public static final i7z T0;
    public static final i7z U0;
    public static final i7z V0;
    public static final i7z W0;
    public static final i7z X;
    public static final i7z X0;
    public static final i7z Y;
    public static final i7z Y0;
    public static final i7z Z;
    public static final i7z Z0;
    public static final i7z a1;
    public static final i7z b;
    public static final i7z b1;
    public static final i7z c;
    public static final i7z c1;
    public static final i7z d;
    public static final i7z d1;
    public static final i7z e;
    public static final i7z e1;
    public static final i7z f;
    public static final i7z g;
    public static final i7z h;
    public static final i7z i;
    public static final i7z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new i7z(i2, (byte) 0);
        c = new i7z(i2, (byte) 1);
        d = new i7z(i2, (byte) 2);
        e = new i7z(i2, (byte) 3);
        f = new i7z(i2, (byte) 4);
        g = new i7z(i2, (byte) 5);
        h = new i7z(i2, (byte) 6);
        i = new i7z(i2, (byte) 7);
        t = new i7z(i2, (byte) 8);
        X = new i7z(i2, (byte) 9);
        Y = new i7z(i2, (byte) 10);
        Z = new i7z(i2, (byte) 11);
        N0 = new i7z(i2, (byte) 12);
        O0 = new i7z(i2, (byte) 13);
        P0 = new i7z(i2, (byte) 14);
        Q0 = new i7z(i2, (byte) 15);
        R0 = new i7z(i2, (byte) 16);
        S0 = new i7z(i2, (byte) 17);
        T0 = new i7z(i2, (byte) 18);
        U0 = new i7z(i2, (byte) 19);
        V0 = new i7z(i2, (byte) 20);
        W0 = new i7z(i2, (byte) 21);
        X0 = new i7z(i2, (byte) 22);
        Y0 = new i7z(i2, (byte) 23);
        Z0 = new i7z(i2, (byte) 24);
        a1 = new i7z(i2, (byte) 25);
        b1 = new i7z(i2, (byte) 26);
        c1 = new i7z(i2, (byte) 27);
        d1 = new i7z(i2, (byte) 28);
        e1 = new i7z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 1:
                if (!(obj instanceof p6v0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (p6v0) obj;
            case 3:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 5:
                if (!(obj instanceof zvh) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zvh) obj;
            case 7:
                if (!(obj instanceof ddz) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ddz) obj;
            case 9:
                if (!(obj instanceof prl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                return (String) obj;
            case 11:
                return (String) obj;
            case 12:
                return (String) obj;
            case 13:
                return (String) obj;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, null, null, null, null, 124);
            case 17:
                return new duu(((uv11) obj).a);
            case 18:
                uv11 uv11Var2 = (uv11) obj;
                String str = uv11Var2.b;
                String str2 = uv11Var2.a;
                String str3 = uv11Var2.d;
                str3.getClass();
                return new o0q0(str, str2, 8, str3);
            case 19:
                uv11 uv11Var3 = (uv11) obj;
                return new s371(uv11Var3.a, uv11Var3.b, 8, "episode-row-quick-action");
            case 20:
                uv11 uv11Var4 = (uv11) obj;
                tv11 tv11Var = uv11Var4.f;
                String str4 = uv11Var4.a;
                String str5 = tv11Var != null ? tv11Var.a : null;
                String str6 = str5 == null ? "" : str5;
                String str7 = tv11Var != null ? tv11Var.b : null;
                return new c1x0(str4, new x4i1(40, tv11Var != null ? tv11Var.e : null, str6, str7 == null ? "" : str7, tv11Var != null ? tv11Var.d : null, tv11Var != null ? tv11Var.c : null), 2);
            case 21:
                return ((uv11) obj).a;
            case 22:
                return rih1.a;
            case 23:
                return new rxc0((String) obj);
            case 24:
                return (qxc0) obj;
            case 25:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            default:
                if (!(obj instanceof gz51) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
