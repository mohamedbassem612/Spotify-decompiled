package p;

import android.os.Parcelable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s571 extends hab0 implements iu30 {
    public static final s571 N0;
    public static final s571 O0;
    public static final s571 P0;
    public static final s571 Q0;
    public static final s571 R0;
    public static final s571 S0;
    public static final s571 T0;
    public static final s571 U0;
    public static final s571 V0;
    public static final s571 W0;
    public static final s571 X;
    public static final s571 X0;
    public static final s571 Y;
    public static final s571 Y0;
    public static final s571 Z;
    public static final s571 Z0;
    public static final s571 a1;
    public static final s571 b;
    public static final s571 b1;
    public static final s571 c;
    public static final s571 c1;
    public static final s571 d;
    public static final s571 d1;
    public static final s571 e;
    public static final s571 e1;
    public static final s571 f;
    public static final s571 g;
    public static final s571 h;
    public static final s571 i;
    public static final s571 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new s571(i2, (byte) 0);
        c = new s571(i2, (byte) 1);
        d = new s571(i2, (byte) 2);
        e = new s571(i2, (byte) 3);
        f = new s571(i2, (byte) 4);
        g = new s571(i2, (byte) 5);
        h = new s571(i2, (byte) 6);
        i = new s571(i2, (byte) 7);
        t = new s571(i2, (byte) 8);
        X = new s571(i2, (byte) 9);
        Y = new s571(i2, (byte) 10);
        Z = new s571(i2, (byte) 11);
        N0 = new s571(i2, (byte) 12);
        O0 = new s571(i2, (byte) 13);
        P0 = new s571(i2, (byte) 14);
        Q0 = new s571(i2, (byte) 15);
        R0 = new s571(i2, (byte) 16);
        S0 = new s571(i2, (byte) 17);
        T0 = new s571(i2, (byte) 18);
        U0 = new s571(i2, (byte) 19);
        V0 = new s571(i2, (byte) 20);
        W0 = new s571(i2, (byte) 21);
        X0 = new s571(i2, (byte) 22);
        Y0 = new s571(i2, (byte) 23);
        Z0 = new s571(i2, (byte) 24);
        a1 = new s571(i2, (byte) 25);
        b1 = new s571(i2, (byte) 26);
        c1 = new s571(i2, (byte) 27);
        d1 = new s571(i2, (byte) 28);
        e1 = new s571(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s571(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Integer.valueOf(new m15(0, 0, (luk) obj).b());
            case 1:
                return new p671(false, (String) null, (String) null);
            case 2:
                return new p671(true, (String) null, (String) null);
            case 3:
                return (p671) obj;
            case 4:
                return (k671) obj;
            case 5:
                return new x671((s671) obj, new kby((String) null, -1));
            case 6:
                return (vn71) obj;
            case 7:
                return Boolean.valueOf(obj instanceof vn71);
            case 8:
                if (obj != null) {
                    return (vn71) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.sharetrait.ShareTrait");
                return null;
            case 9:
                return f4i1.f("spotify:", (String) obj, ":*");
            case 10:
                return (qxc0) obj;
            case 11:
                kby kbyVar = ((cxc0) obj).f;
                return new i871(new g771(kbyVar.a, kbyVar.b), kbyVar.p, kbyVar.q);
            case 12:
                return Boolean.valueOf(obj instanceof qxc0);
            case 13:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 14:
                return rih1Var;
            case 15:
                itl0 itl0Var = (itl0) obj;
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), itl0Var.a, itl0Var.b.c.b.a, System.currentTimeMillis());
            case 16:
                return ((h2l0) obj).e();
            case 17:
                return ((w4i1) obj).b;
            case 18:
                return g0p1.u((qa71) obj);
            case 19:
                return ((h2l0) obj).e();
            case 20:
                return new sx61();
            case 21:
                return ((u771) obj).a.a.a;
            case 22:
                return ((u771) obj).a.b.b();
            case 23:
                ((kd31) obj).i(1);
                return rih1Var;
            case 24:
                lsl lslVar = (lsl) obj;
                DrawScope.b0(lslVar, u7h.b, (Size.e(lslVar.j()) * 0.5f) + (Size.e(lslVar.j()) * 0.07f), 0L, 0.0f, (DrawStyle) null, 60);
                lslVar.s1();
                return rih1Var;
            case 25:
                return ((eqc) obj).b(Z0);
            case 26:
                return ((h2l0) obj).e();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return hi71.a;
            case 28:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            default:
                pl71 pl71Var = (pl71) obj;
                cmt cmtVar = pl71Var.a;
                return new ei71(pl71Var.b, pl71Var.c, pl71Var.d, pl71Var.h, cmtVar, pl71Var.e, pl71Var.g, pl71Var.f);
        }
    }
}
