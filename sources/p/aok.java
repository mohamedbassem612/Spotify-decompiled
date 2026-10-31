package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aok extends hab0 implements Function0 {
    public static final aok N0;
    public static final aok O0;
    public static final aok P0;
    public static final aok Q0;
    public static final aok R0;
    public static final aok S0;
    public static final aok T0;
    public static final aok U0;
    public static final aok V0;
    public static final aok W0;
    public static final aok X;
    public static final aok X0;
    public static final aok Y;
    public static final aok Y0;
    public static final aok Z;
    public static final aok Z0;
    public static final aok a1;
    public static final aok b;
    public static final aok b1;
    public static final aok c;
    public static final aok c1;
    public static final aok d;
    public static final aok d1;
    public static final aok e;
    public static final aok e1;
    public static final aok f;
    public static final aok g;
    public static final aok h;
    public static final aok i;
    public static final aok t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new aok(i2, (byte) 0);
        c = new aok(i2, (byte) 1);
        d = new aok(i2, (byte) 2);
        e = new aok(i2, (byte) 3);
        f = new aok(i2, (byte) 4);
        g = new aok(i2, (byte) 5);
        h = new aok(i2, (byte) 6);
        i = new aok(i2, (byte) 7);
        t = new aok(i2, (byte) 8);
        X = new aok(i2, (byte) 9);
        Y = new aok(i2, (byte) 10);
        Z = new aok(i2, (byte) 11);
        N0 = new aok(i2, (byte) 12);
        O0 = new aok(i2, (byte) 13);
        P0 = new aok(i2, (byte) 14);
        Q0 = new aok(i2, (byte) 15);
        R0 = new aok(i2, (byte) 16);
        S0 = new aok(i2, (byte) 17);
        T0 = new aok(i2, (byte) 18);
        U0 = new aok(i2, (byte) 19);
        V0 = new aok(i2, (byte) 20);
        W0 = new aok(i2, (byte) 21);
        X0 = new aok(i2, (byte) 22);
        Y0 = new aok(i2, (byte) 23);
        Z0 = new aok(i2, (byte) 24);
        a1 = new aok(i2, (byte) 25);
        b1 = new aok(i2, (byte) 26);
        c1 = new aok(i2, (byte) 27);
        d1 = new aok(i2, (byte) 28);
        e1 = new aok(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aok(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new r36(ylk.a, (byte) 0);
            case 1:
                return gio1.b(new uy30("", "", "#ff000000", (String) null));
            case 2:
                return gio1.b(rgk.Y);
            case 3:
                return gio1.b(new gpk((uy30) null, z6x.a, qmo1.t(new s55(2, (lnm) null, (byte) 6)), (String) null));
            case 4:
                return rih1Var;
            case 5:
                return v8r.q(Boolean.FALSE);
            case 6:
                return v8r.q(Boolean.FALSE);
            case 7:
                return new r36(wcl.a, (byte) 0);
            case 8:
                return new r36(vvw0.a, (byte) 0);
            case 9:
                return new r36(jvj1.a, (byte) 0);
            case 10:
                return new r36(g18.a, (byte) 0);
            case 11:
                return new r36(izx.a, (byte) 0);
            case 12:
                return Boolean.FALSE;
            case 13:
                throw new IllegalStateException("CaptionElement not provided");
            case 14:
                throw new IllegalStateException("EntityLinkingElement not provided");
            case 15:
                throw new IllegalStateException("ExternalLinkImageFooterElement not provided");
            case 16:
                throw new IllegalStateException("ExternalLinkViewElement not provided");
            case 17:
                throw new IllegalStateException("UbiImpressionLogger not provided");
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ts3.CONTENT_PICKER.a.c;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 20:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 21:
                return v8r.q((Object) null);
            case 22:
                return v8r.q((Object) null);
            case 23:
                return new ozg();
            case 24:
                return v8r.q("");
            case 25:
                WorkRunners.MyThreadFactory myThreadFactory3 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 26:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1);
            case 27:
                return new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1);
            case 28:
                return f4i1.c(dqz0.b.f(), "fallback-");
            default:
                return rih1Var;
        }
    }
}
