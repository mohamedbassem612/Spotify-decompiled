package p;

import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oxx extends hab0 implements Function0 {
    public static final oxx N0;
    public static final oxx O0;
    public static final oxx P0;
    public static final oxx Q0;
    public static final oxx R0;
    public static final oxx S0;
    public static final oxx T0;
    public static final oxx U0;
    public static final oxx V0;
    public static final oxx W0;
    public static final oxx X;
    public static final oxx X0;
    public static final oxx Y;
    public static final oxx Y0;
    public static final oxx Z;
    public static final oxx Z0;
    public static final oxx a1;
    public static final oxx b;
    public static final oxx b1;
    public static final oxx c;
    public static final oxx c1;
    public static final oxx d;
    public static final oxx d1;
    public static final oxx e;
    public static final oxx e1;
    public static final oxx f;
    public static final oxx g;
    public static final oxx h;
    public static final oxx i;
    public static final oxx t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new oxx(i2, (byte) 0);
        c = new oxx(i2, (byte) 1);
        d = new oxx(i2, (byte) 2);
        e = new oxx(i2, (byte) 3);
        f = new oxx(i2, (byte) 4);
        g = new oxx(i2, (byte) 5);
        h = new oxx(i2, (byte) 6);
        i = new oxx(i2, (byte) 7);
        t = new oxx(i2, (byte) 8);
        X = new oxx(i2, (byte) 9);
        Y = new oxx(i2, (byte) 10);
        Z = new oxx(i2, (byte) 11);
        N0 = new oxx(i2, (byte) 12);
        O0 = new oxx(i2, (byte) 13);
        P0 = new oxx(i2, (byte) 14);
        Q0 = new oxx(i2, (byte) 15);
        R0 = new oxx(i2, (byte) 16);
        S0 = new oxx(i2, (byte) 17);
        T0 = new oxx(i2, (byte) 18);
        U0 = new oxx(i2, (byte) 19);
        V0 = new oxx(i2, (byte) 20);
        W0 = new oxx(i2, (byte) 21);
        X0 = new oxx(i2, (byte) 22);
        Y0 = new oxx(i2, (byte) 23);
        Z0 = new oxx(i2, (byte) 24);
        a1 = new oxx(i2, (byte) 25);
        b1 = new oxx(i2, (byte) 26);
        c1 = new oxx(i2, (byte) 27);
        d1 = new oxx(i2, (byte) 28);
        e1 = new oxx(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxx(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke() {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Float.valueOf(Float.POSITIVE_INFINITY);
            case 1:
                return vgx.a;
            case 2:
                return null;
            case 3:
                throw new IllegalStateException("Encore theme was not provided. Please wrap your content with ProvideEncoreTheme. For @Previews use com.spotify.encore.tooling.preview.EncorePreview()");
            case 4:
                return Float.valueOf(0.0f);
            case 5:
                return Float.valueOf(0.0f);
            case 6:
                return Boolean.FALSE;
            case 7:
                return Float.valueOf(0.0f);
            case 8:
                return new tgm((String) null, false, false, true, true, false, false, (yh10) null, false, false, 1, false, false, false, false, false, (iu30) null, true, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1058921, 1);
            case 9:
                return new wqy(null, false, false, false, false, false, false, false, null, null, null, null, null, false, 15745);
            case 10:
                return new wqy(null, true, true, true, true, true, true, false, null, null, null, null, null, false, 15745);
            case 11:
                return new wqy(null, true, true, true, true, true, true, false, null, null, null, null, null, false, 15745);
            case 12:
                return tyo1.p(blc0.Hg, new String[0]);
            case 13:
                WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 14:
                WorkRunners.MyThreadFactory myThreadFactory2 = WorkRunners.a;
                return new ImmediateWorkRunner();
            case 15:
                return Float.valueOf(0.0f);
            case 16:
                return new tgm((String) null, false, false, true, false, false, false, (yh10) null, false, false, 0, false, false, true, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -32795, 1);
            case 17:
                return new z8z(false, false, false, (c821) null, 111);
            case 18:
                return new z8z(false, false, false, (c821) null, 111);
            case 19:
                return rih1Var;
            case 20:
                return new yc9();
            case 21:
                return new rc00();
            case 22:
                return gio1.b(new pod0("", new ood0(""), 0, (String) null, 60));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return gio1.b(fa00.e);
            case 24:
                return gio1.b(new cj00((ui00) null, (List) null, (ti00) null, (pi00) null, (ri00) null, (String) null, (si00) null, 1023));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return rih1Var;
            case 26:
                return new pfp0("com.spotify.blend.tastematch.api.ExpiredInvitation", jr00.INSTANCE, new Annotation[0]);
            case 27:
            case 28:
                return rih1Var;
            default:
                return new r36(chc1.a, (byte) 1);
        }
    }
}
