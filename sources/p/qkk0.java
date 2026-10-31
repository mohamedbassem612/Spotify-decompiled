package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qkk0 extends hab0 implements iu30 {
    public static final qkk0 N0;
    public static final qkk0 O0;
    public static final qkk0 P0;
    public static final qkk0 Q0;
    public static final qkk0 R0;
    public static final qkk0 S0;
    public static final qkk0 T0;
    public static final qkk0 U0;
    public static final qkk0 V0;
    public static final qkk0 W0;
    public static final qkk0 X;
    public static final qkk0 X0;
    public static final qkk0 Y;
    public static final qkk0 Y0;
    public static final qkk0 Z;
    public static final qkk0 Z0;
    public static final qkk0 a1;
    public static final qkk0 b;
    public static final qkk0 b1;
    public static final qkk0 c;
    public static final qkk0 c1;
    public static final qkk0 d;
    public static final qkk0 d1;
    public static final qkk0 e;
    public static final qkk0 e1;
    public static final qkk0 f;
    public static final qkk0 g;
    public static final qkk0 h;
    public static final qkk0 i;
    public static final qkk0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qkk0(i2, (byte) 0);
        c = new qkk0(i2, (byte) 1);
        d = new qkk0(i2, (byte) 2);
        e = new qkk0(i2, (byte) 3);
        f = new qkk0(i2, (byte) 4);
        g = new qkk0(i2, (byte) 5);
        h = new qkk0(i2, (byte) 6);
        i = new qkk0(i2, (byte) 7);
        t = new qkk0(i2, (byte) 8);
        X = new qkk0(i2, (byte) 9);
        Y = new qkk0(i2, (byte) 10);
        Z = new qkk0(i2, (byte) 11);
        N0 = new qkk0(i2, (byte) 12);
        O0 = new qkk0(i2, (byte) 13);
        P0 = new qkk0(i2, (byte) 14);
        Q0 = new qkk0(i2, (byte) 15);
        R0 = new qkk0(i2, (byte) 16);
        S0 = new qkk0(i2, (byte) 17);
        T0 = new qkk0(i2, (byte) 18);
        U0 = new qkk0(i2, (byte) 19);
        V0 = new qkk0(i2, (byte) 20);
        W0 = new qkk0(i2, (byte) 21);
        X0 = new qkk0(i2, (byte) 22);
        Y0 = new qkk0(i2, (byte) 23);
        Z0 = new qkk0(i2, (byte) 24);
        a1 = new qkk0(i2, (byte) 25);
        b1 = new qkk0(i2, (byte) 26);
        c1 = new qkk0(i2, (byte) 27);
        d1 = new qkk0(i2, (byte) 28);
        e1 = new qkk0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkk0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mq70 mq70Var;
        up70 up70VarA;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return l1d.m("mixing_style_picker_filter_", ((ha20) obj).name());
            case 1:
                return l1d.m("mixing_style_picker_fx_", ((rx30) obj).name());
            case 2:
                return l1d.m("mixing_style_picker_jogwheel_", ((vaa0) obj).name());
            case 3:
                return l1d.m("mixing_style_picker_looping_", ((m7f0) obj).name());
            case 4:
                long j = ((Offset) obj).a;
                return rih1Var;
            case 5:
                return l1d.m("mixing_style_picker_volume_", ((duk1) obj).name());
            case 6:
                return ((blk0) obj).a;
            case 7:
                return ((blk0) obj).b;
            case 8:
                return Boolean.valueOf(obj instanceof ro7);
            case 9:
                if (obj != null) {
                    return (ro7) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audioattributesv2.AudioAttributesV2");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof ro7);
            case 11:
                if (obj != null) {
                    return (ro7) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audioattributesv2.AudioAttributesV2");
                return null;
            case 12:
                return new nlk0((mlk0) obj, (jo70) null, (xkk1) null);
            case 13:
                return Boolean.valueOf(((mlk0) obj).f);
            case 14:
                return ((mlk0) obj).a;
            case 15:
                return ((mlk0) obj).a;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case 17:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 18:
                return Boolean.valueOf(obj instanceof xkk1);
            case 19:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 20:
                return rih1Var;
            case 21:
                return new dmk0(((emk0) obj).a, fnk0.a);
            case 22:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 24:
                return (String) obj;
            case 25:
                xkk1 xkk1Var = (xkk1) obj;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.e)) == null) {
                    return null;
                }
                return up70VarA.a.a;
            case 26:
                eok0 eok0Var = eok0.a;
                return new dok0((cok0) obj, null, null, null, null, null, null, null, null, null, null, null, null, eok0Var, eok0Var);
            case 27:
                cok0 cok0Var = (cok0) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : vaa0.Y) {
                    vaa0 vaa0Var = (vaa0) obj2;
                    if (vaa0Var != vaa0.None && vaa0Var != vaa0.Unknown) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : m7f0.X) {
                    m7f0 m7f0Var = (m7f0) obj3;
                    if (m7f0Var != m7f0.None && m7f0Var != m7f0.Unknown) {
                        arrayList2.add(obj3);
                    }
                }
                return new ujk0(arrayList, arrayList2, cok0Var.a.b.N0);
            case 28:
                return ((cok0) obj).a.b.c;
            default:
                return ((cok0) obj).a.b.d;
        }
    }
}
