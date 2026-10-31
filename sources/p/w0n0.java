package p;

import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.ServiceLoader;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w0n0 extends hab0 implements Function0 {
    public static final w0n0 N0;
    public static final w0n0 O0;
    public static final w0n0 P0;
    public static final w0n0 Q0;
    public static final w0n0 R0;
    public static final w0n0 S0;
    public static final w0n0 T0;
    public static final w0n0 U0;
    public static final w0n0 V0;
    public static final w0n0 W0;
    public static final w0n0 X;
    public static final w0n0 X0;
    public static final w0n0 Y;
    public static final w0n0 Y0;
    public static final w0n0 Z;
    public static final w0n0 Z0;
    public static final w0n0 a1;
    public static final w0n0 b;
    public static final w0n0 b1;
    public static final w0n0 c;
    public static final w0n0 c1;
    public static final w0n0 d;
    public static final w0n0 d1;
    public static final w0n0 e;
    public static final w0n0 f;
    public static final w0n0 g;
    public static final w0n0 h;
    public static final w0n0 i;
    public static final w0n0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new w0n0(i2, (byte) 0);
        c = new w0n0(i2, (byte) 1);
        d = new w0n0(i2, (byte) 2);
        e = new w0n0(i2, (byte) 3);
        f = new w0n0(i2, (byte) 4);
        g = new w0n0(i2, (byte) 5);
        h = new w0n0(i2, (byte) 6);
        i = new w0n0(i2, (byte) 7);
        t = new w0n0(i2, (byte) 8);
        X = new w0n0(i2, (byte) 9);
        Y = new w0n0(i2, (byte) 10);
        Z = new w0n0(i2, (byte) 11);
        N0 = new w0n0(i2, (byte) 12);
        O0 = new w0n0(i2, (byte) 13);
        P0 = new w0n0(i2, (byte) 14);
        Q0 = new w0n0(i2, (byte) 15);
        R0 = new w0n0(i2, (byte) 16);
        S0 = new w0n0(i2, (byte) 17);
        T0 = new w0n0(i2, (byte) 18);
        U0 = new w0n0(i2, (byte) 19);
        V0 = new w0n0(i2, (byte) 20);
        W0 = new w0n0(i2, (byte) 21);
        X0 = new w0n0(i2, (byte) 22);
        Y0 = new w0n0(i2, (byte) 23);
        Z0 = new w0n0(i2, (byte) 24);
        a1 = new w0n0(i2, (byte) 25);
        b1 = new w0n0(i2, (byte) 26);
        c1 = new w0n0(i2, (byte) 27);
        d1 = new w0n0(i2, (byte) 28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0n0(bl3 bl3Var) {
        super(0);
        this.a = (byte) 29;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new u0n0(hrx.c, 2131959100, nik1.S4, new mtn0(v0n0.a, czm0.d, dbm0.U0), gvn0.e, Collections.singleton(mno1.X), null, 128);
            case 1:
                return xbs.d;
            case 2:
                return itn0.i;
            case 3:
                return new vrm();
            case 4:
                return new q5n();
            case 5:
                return new d8n();
            case 6:
                return new i420();
            case 7:
                return new lco0();
            case 8:
                return mno1.a(Integer.MAX_VALUE, 0, 6);
            case 9:
                return new dtp0(itp0.f, false, new vgc0((Integer) 2131959358, (ugc0) new sgc0(2131959357), 1));
            case 10:
                return xto.t((Object) null);
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                return pro1.t("disablePersonalizedRecommendations");
            case 13:
                return new Locale(upn1.m());
            case 14:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1);
            case 15:
                return z6x.a;
            case 16:
                return null;
            case 17:
                a3i1 a3i1Var = new a3i1();
                for (t2i1 t2i1Var : sa81.b) {
                    a3i1Var.b(t2i1Var.a, t2i1Var.b);
                }
                return a3i1Var;
            case 18:
                return new Locale(upn1.m());
            case 19:
                return new e27((byte) 5);
            case 20:
                return new pfp0("unknown", lla1.INSTANCE, new Annotation[0]);
            case 21:
                a3i1 a3i1Var2 = new a3i1();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    for (u2i1 u2i1Var : ServiceLoader.load(u2i1.class, u2i1.class.getClassLoader())) {
                        for (t2i1 t2i1Var2 : u2i1Var.b()) {
                            a3i1Var2.b(t2i1Var2.a, t2i1Var2.b);
                        }
                        for (b3i1 b3i1Var : u2i1Var.a()) {
                            linkedHashMap.put(b3i1Var.getKey(), b3i1Var);
                        }
                        break;
                    }
                    return new c7b1(a3i1Var2, linkedHashMap);
                } finally {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                }
            case 22:
                return new s45();
            case 23:
                return new r36(chc1.a, (byte) 0);
            case 24:
                return rih1.a;
            case 25:
                return new m511(0.0f, 0.0f, 0.0f, 0.0f);
            case 26:
                return Pattern.compile("spotify[\\w_\\-!.~'()*:%]*");
            case 27:
                return o7h.l1(f46.H0(prm1.values(), new epj1((byte) 7)));
            case 28:
                return t6p1.g();
            default:
                return new hk3();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0n0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
