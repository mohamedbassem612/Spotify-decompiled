package p;

import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class c7b extends hab0 implements iu30 {
    public static final c7b N0;
    public static final c7b O0;
    public static final c7b P0;
    public static final c7b Q0;
    public static final c7b R0;
    public static final c7b S0;
    public static final c7b T0;
    public static final c7b U0;
    public static final c7b V0;
    public static final c7b W0;
    public static final c7b X;
    public static final c7b X0;
    public static final c7b Y;
    public static final c7b Y0;
    public static final c7b Z;
    public static final c7b Z0;
    public static final c7b a1;
    public static final c7b b;
    public static final c7b b1;
    public static final c7b c;
    public static final c7b c1;
    public static final c7b d;
    public static final c7b d1;
    public static final c7b e;
    public static final c7b e1;
    public static final c7b f;
    public static final c7b g;
    public static final c7b h;
    public static final c7b i;
    public static final c7b t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new c7b(i2, (byte) 0);
        c = new c7b(i2, (byte) 1);
        d = new c7b(i2, (byte) 2);
        e = new c7b(i2, (byte) 3);
        f = new c7b(i2, (byte) 4);
        g = new c7b(i2, (byte) 5);
        h = new c7b(i2, (byte) 6);
        i = new c7b(i2, (byte) 7);
        t = new c7b(i2, (byte) 8);
        X = new c7b(i2, (byte) 9);
        Y = new c7b(i2, (byte) 10);
        Z = new c7b(i2, (byte) 11);
        N0 = new c7b(i2, (byte) 12);
        O0 = new c7b(i2, (byte) 13);
        P0 = new c7b(i2, (byte) 14);
        Q0 = new c7b(i2, (byte) 15);
        R0 = new c7b(i2, (byte) 16);
        S0 = new c7b(i2, (byte) 17);
        T0 = new c7b(i2, (byte) 18);
        U0 = new c7b(i2, (byte) 19);
        V0 = new c7b(i2, (byte) 20);
        W0 = new c7b(i2, (byte) 21);
        X0 = new c7b(i2, (byte) 22);
        Y0 = new c7b(i2, (byte) 23);
        Z0 = new c7b(i2, (byte) 24);
        a1 = new c7b(i2, (byte) 25);
        b1 = new c7b(i2, (byte) 26);
        c1 = new c7b(i2, (byte) 27);
        d1 = new c7b(i2, (byte) 28);
        e1 = new c7b(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c7b(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((ezk0) obj).a, r6h1.c, System.currentTimeMillis());
            case 1:
                return ((ho70) obj).a;
            case 2:
                return new p2l0((i3l0) obj);
            case 3:
                return ((p2l0) obj).a("spotify:internal:bluejay");
            case 4:
                return ((n3l0) obj).a(nik1.p6.a);
            case 5:
                ((zk8) obj).b.invoke(kj8.a);
                return rih1Var;
            case 6:
                c261.a((e261) obj);
                return rih1Var;
            case 7:
                c261.a((e261) obj);
                return rih1Var;
            case 8:
                c261.a((e261) obj);
                return rih1Var;
            case 9:
                return ((hgb) obj).getClass().getSimpleName();
            case 10:
                return new pgb(new lkb(false));
            case 11:
                ak akVar = ((cz81) obj).a;
                if (akVar != ak.c && akVar != ak.b) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                String str = ((cz81) obj).b;
                if (str == null || ihc1.y0(str)) {
                    return null;
                }
                return str;
            case 13:
                return ((String) obj).toLowerCase(Locale.ROOT);
            case 14:
                return ((Map) obj).keySet();
            case 15:
                return Boolean.valueOf(((peo0) obj).equals(meo0.a));
            case 16:
                return nlb.a;
            case 17:
                return Collections.singletonList(((rlb) obj).a);
            case 18:
                return (String) obj;
            case 19:
                return (String) obj;
            case 20:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 22:
                return Boolean.valueOf(obj instanceof zc8);
            case 23:
                if (obj != null) {
                    return (zc8) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookspecifics.AudiobookSpecifics");
                return null;
            case 24:
                return wlb.a;
            case 25:
                return new w2l0((i3l0) obj, "podcast/show/audiobook");
            case 26:
                return new ra01(((enb) obj).a);
            case 27:
                return w7x.a;
            case 28:
                dnb dnbVar = (dnb) obj;
                return new h8r0(dnbVar.a, dnbVar.b);
            default:
                return Collections.singleton(((dnb) obj).a);
        }
    }
}
