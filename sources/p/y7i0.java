package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y7i0 extends hab0 implements iu30 {
    public static final y7i0 N0;
    public static final y7i0 O0;
    public static final y7i0 P0;
    public static final y7i0 Q0;
    public static final y7i0 R0;
    public static final y7i0 S0;
    public static final y7i0 T0;
    public static final y7i0 U0;
    public static final y7i0 V0;
    public static final y7i0 W0;
    public static final y7i0 X;
    public static final y7i0 X0;
    public static final y7i0 Y;
    public static final y7i0 Y0;
    public static final y7i0 Z;
    public static final y7i0 Z0;
    public static final y7i0 a1;
    public static final y7i0 b;
    public static final y7i0 b1;
    public static final y7i0 c;
    public static final y7i0 c1;
    public static final y7i0 d;
    public static final y7i0 d1;
    public static final y7i0 e;
    public static final y7i0 e1;
    public static final y7i0 f;
    public static final y7i0 g;
    public static final y7i0 h;
    public static final y7i0 i;
    public static final y7i0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new y7i0(i2, (byte) 0);
        c = new y7i0(i2, (byte) 1);
        d = new y7i0(i2, (byte) 2);
        e = new y7i0(i2, (byte) 3);
        f = new y7i0(i2, (byte) 4);
        g = new y7i0(i2, (byte) 5);
        h = new y7i0(i2, (byte) 6);
        i = new y7i0(i2, (byte) 7);
        t = new y7i0(i2, (byte) 8);
        X = new y7i0(i2, (byte) 9);
        Y = new y7i0(i2, (byte) 10);
        Z = new y7i0(i2, (byte) 11);
        N0 = new y7i0(i2, (byte) 12);
        O0 = new y7i0(i2, (byte) 13);
        P0 = new y7i0(i2, (byte) 14);
        Q0 = new y7i0(i2, (byte) 15);
        R0 = new y7i0(i2, (byte) 16);
        S0 = new y7i0(i2, (byte) 17);
        T0 = new y7i0(i2, (byte) 18);
        U0 = new y7i0(i2, (byte) 19);
        V0 = new y7i0(i2, (byte) 20);
        W0 = new y7i0(i2, (byte) 21);
        X0 = new y7i0(i2, (byte) 22);
        Y0 = new y7i0(i2, (byte) 23);
        Z0 = new y7i0(i2, (byte) 24);
        a1 = new y7i0(i2, (byte) 25);
        b1 = new y7i0(i2, (byte) 26);
        c1 = new y7i0(i2, (byte) 27);
        d1 = new y7i0(i2, (byte) 28);
        e1 = new y7i0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y7i0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (w7i0) obj;
            case 1:
                return new uxh1("");
            case 2:
                wxh1 wxh1Var = (wxh1) obj;
                return new vxh1(wxh1Var.a, wxh1Var.b, wxh1Var.c, wxh1Var.d, wxh1Var.e, wxh1Var.f, wxh1Var.g, wxh1Var.h);
            case 3:
                return rih1Var;
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return ((iai0) obj).b();
            case 7:
                return ((iai0) obj).b();
            case 8:
                iai0 iai0Var = (iai0) obj;
                return sqg0.J(new mmr0[]{new mmr0(1, Collections.singleton(iai0Var.b().d)), new mmr0(2, Collections.singleton(iai0Var.b().c))});
            case 9:
                return n9p1.l((mey0) obj);
            case 10:
                return ((mey0) obj).d;
            case 11:
                return ((mey0) obj).d;
            case 12:
                return ((mey0) obj).c;
            case 13:
                return ((mey0) obj).c;
            case 14:
                return ((mey0) obj).d;
            case 15:
                return ((mey0) obj).c;
            case 16:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 18:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 20:
                return Boolean.valueOf((obj instanceof prl) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            case 22:
                return Boolean.valueOf(obj instanceof nbw0);
            case 23:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
            case 24:
                return Boolean.valueOf(obj instanceof yo60);
            case 25:
                if (obj != null) {
                    return (yo60) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.HomePreviewPlaybackTrait");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof jo70);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 28:
                return Integer.valueOf(((Number) obj).intValue());
            default:
                mey0 mey0Var = (mey0) obj;
                String str = mey0Var.h;
                return str == null ? mey0Var.c : str;
        }
    }
}
