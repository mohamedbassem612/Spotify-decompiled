package p;

import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x0y extends hab0 implements iu30 {
    public static final x0y N0;
    public static final x0y O0;
    public static final x0y P0;
    public static final x0y Q0;
    public static final x0y R0;
    public static final x0y S0;
    public static final x0y T0;
    public static final x0y U0;
    public static final x0y V0;
    public static final x0y W0;
    public static final x0y X;
    public static final x0y X0;
    public static final x0y Y;
    public static final x0y Y0;
    public static final x0y Z;
    public static final x0y Z0;
    public static final x0y a1;
    public static final x0y b;
    public static final x0y b1;
    public static final x0y c;
    public static final x0y c1;
    public static final x0y d;
    public static final x0y d1;
    public static final x0y e;
    public static final x0y e1;
    public static final x0y f;
    public static final x0y g;
    public static final x0y h;
    public static final x0y i;
    public static final x0y t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new x0y(i2, (byte) 0);
        c = new x0y(i2, (byte) 1);
        d = new x0y(i2, (byte) 2);
        e = new x0y(i2, (byte) 3);
        f = new x0y(i2, (byte) 4);
        g = new x0y(i2, (byte) 5);
        h = new x0y(i2, (byte) 6);
        i = new x0y(i2, (byte) 7);
        t = new x0y(i2, (byte) 8);
        X = new x0y(i2, (byte) 9);
        Y = new x0y(i2, (byte) 10);
        Z = new x0y(i2, (byte) 11);
        N0 = new x0y(i2, (byte) 12);
        O0 = new x0y(i2, (byte) 13);
        P0 = new x0y(i2, (byte) 14);
        Q0 = new x0y(i2, (byte) 15);
        R0 = new x0y(i2, (byte) 16);
        S0 = new x0y(i2, (byte) 17);
        T0 = new x0y(i2, (byte) 18);
        U0 = new x0y(i2, (byte) 19);
        V0 = new x0y(i2, (byte) 20);
        W0 = new x0y(i2, (byte) 21);
        X0 = new x0y(i2, (byte) 22);
        Y0 = new x0y(i2, (byte) 23);
        Z0 = new x0y(i2, (byte) 24);
        a1 = new x0y(i2, (byte) 25);
        b1 = new x0y(i2, (byte) 26);
        c1 = new x0y(i2, (byte) 27);
        d1 = new x0y(i2, (byte) 28);
        e1 = new x0y(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0y(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return new mhl0((nhl0) obj, (byte) 4);
            case 1:
                return new mhl0((nhl0) obj, (byte) 2);
            case 2:
                return new mhl0((nhl0) obj, (byte) 0);
            case 3:
                return new ugc1(poo1.H((PlayerState) obj, "station_title"));
            case 4:
                return new ugc1(poo1.H((PlayerState) obj, "station_subtitle"));
            case 5:
                return poo1.H((PlayerState) obj, "station_uri");
            case 6:
                return new zzk0((i3l0) obj);
            case 7:
                zzk0 zzk0Var = (zzk0) obj;
                String str = nik1.F4.a;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), zzk0Var.a, r6h1.c, System.currentTimeMillis());
            case 8:
                return new a0l0((i3l0) obj);
            case 9:
                b261.c((e261) obj);
                return rih1.a;
            case 10:
                return new b0l0((i3l0) obj);
            case 11:
                return new c0l0((i3l0) obj);
            case 12:
                return (q7y) obj;
            case 13:
                return mno1.h(new mmr0[]{new mmr0("enhanced-share-card-element-state-key", (v9y) obj)});
            case 14:
                return ((u9y) obj).a;
            case 15:
                return ((u9y) obj).a;
            case 16:
                return ((u9y) obj).a;
            case 17:
                if (!(obj instanceof eid) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (eid) obj;
            case 19:
                return Boolean.valueOf(obj instanceof xkk1);
            case 20:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 21:
                return Boolean.valueOf(obj instanceof jo70);
            case 22:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                long j = ((ofg1) obj).a;
                return new le5(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            case 24:
                le5 le5Var = (le5) obj;
                return new ofg1(sgc1.u(le5Var.a, le5Var.b));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return irn1.l0(0.0f, 0.0f, (Object) null, 7);
            case 26:
                ((Number) obj).intValue();
                return 0;
            case 27:
                long j2 = ((yr80) obj).a;
                return new yr80(0L);
            case 28:
                ((Number) obj).intValue();
                return 0;
            default:
                long j3 = ((yr80) obj).a;
                return new yr80(0L);
        }
    }
}
