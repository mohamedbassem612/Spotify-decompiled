package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xrc extends hab0 implements Function0 {
    public static final xrc N0;
    public static final xrc O0;
    public static final xrc P0;
    public static final xrc Q0;
    public static final xrc R0;
    public static final xrc S0;
    public static final xrc T0;
    public static final xrc U0;
    public static final xrc V0;
    public static final xrc W0;
    public static final xrc X;
    public static final xrc X0;
    public static final xrc Y;
    public static final xrc Y0;
    public static final xrc Z;
    public static final xrc Z0;
    public static final xrc a1;
    public static final xrc b;
    public static final xrc b1;
    public static final xrc c;
    public static final xrc c1;
    public static final xrc d;
    public static final xrc d1;
    public static final xrc e;
    public static final xrc e1;
    public static final xrc f;
    public static final xrc g;
    public static final xrc h;
    public static final xrc i;
    public static final xrc t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new xrc(i2, (byte) 0);
        c = new xrc(i2, (byte) 1);
        d = new xrc(i2, (byte) 2);
        e = new xrc(i2, (byte) 3);
        f = new xrc(i2, (byte) 4);
        g = new xrc(i2, (byte) 5);
        h = new xrc(i2, (byte) 6);
        i = new xrc(i2, (byte) 7);
        t = new xrc(i2, (byte) 8);
        X = new xrc(i2, (byte) 9);
        Y = new xrc(i2, (byte) 10);
        Z = new xrc(i2, (byte) 11);
        N0 = new xrc(i2, (byte) 12);
        O0 = new xrc(i2, (byte) 13);
        P0 = new xrc(i2, (byte) 14);
        Q0 = new xrc(i2, (byte) 15);
        R0 = new xrc(i2, (byte) 16);
        S0 = new xrc(i2, (byte) 17);
        T0 = new xrc(i2, (byte) 18);
        U0 = new xrc(i2, (byte) 19);
        V0 = new xrc(i2, (byte) 20);
        W0 = new xrc(i2, (byte) 21);
        X0 = new xrc(i2, (byte) 22);
        Y0 = new xrc(i2, (byte) 23);
        Z0 = new xrc(i2, (byte) 24);
        a1 = new xrc(i2, (byte) 25);
        b1 = new xrc(i2, (byte) 26);
        c1 = new xrc(i2, (byte) 27);
        d1 = new xrc(i2, (byte) 28);
        e1 = new xrc(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xrc(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new nlc0(chc1.a, fqc.a);
            case 1:
                return new r36(rtc.a, (byte) 0);
            case 2:
                return rih1Var;
            case 3:
                return new nlc0(chc1.a, wr80.a);
            case 4:
                chc1 chc1Var = chc1.a;
                return new nlc0(chc1Var, chc1Var);
            case 5:
                throw new IllegalStateException("No BitmapStorage in local composition");
            case 6:
                return rih1Var;
            case 7:
                return WorkRunners.a();
            case 8:
                return WorkRunners.a();
            case 9:
                return null;
            case 10:
                return new err0(0);
            case 11:
                return v8r.q(Boolean.FALSE);
            case 12:
                return null;
            case 13:
                throw new IllegalStateException("EntityLinkingElement not provided.");
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return rih1Var;
            case 19:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 21:
                return rih1Var;
            case 22:
                return v8r.q(Boolean.FALSE);
            case 23:
                return Locale.forLanguageTag(upn1.p());
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                return rih1Var;
            default:
                a180 a180Var = new a180("CheckboxChecked", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 224);
                n6a1 n6a1Var = new n6a1(z4p1.g(4294967295L));
                int i2 = bui1.a;
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new f9s0(6.708f, 12.623f));
                arrayList.add(new e9s0(12.506f, 5.842f));
                arrayList.add(new e9s0(10.986f, 4.542f));
                arrayList.add(new e9s0(6.709f, 9.544f));
                arrayList.add(new e9s0(5.144f, 7.709f));
                arrayList.add(new e9s0(3.623f, 9.007f));
                arrayList.add(new e9s0(6.708f, 12.623f));
                arrayList.add(b9s0.c);
                a180.a(a180Var, arrayList, n6a1Var, 0.0f, 0, 4.0f);
                return a180Var.b();
        }
    }
}
