package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rwn extends hab0 implements iu30 {
    public static final rwn N0;
    public static final rwn O0;
    public static final rwn P0;
    public static final rwn Q0;
    public static final rwn R0;
    public static final rwn S0;
    public static final rwn T0;
    public static final rwn U0;
    public static final rwn V0;
    public static final rwn W0;
    public static final rwn X;
    public static final rwn X0;
    public static final rwn Y;
    public static final rwn Y0;
    public static final rwn Z;
    public static final rwn Z0;
    public static final rwn a1;
    public static final rwn b;
    public static final rwn b1;
    public static final rwn c;
    public static final rwn c1;
    public static final rwn d;
    public static final rwn d1;
    public static final rwn e;
    public static final rwn e1;
    public static final rwn f;
    public static final rwn g;
    public static final rwn h;
    public static final rwn i;
    public static final rwn t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rwn(i2, (byte) 0);
        c = new rwn(i2, (byte) 1);
        d = new rwn(i2, (byte) 2);
        e = new rwn(i2, (byte) 3);
        f = new rwn(i2, (byte) 4);
        g = new rwn(i2, (byte) 5);
        h = new rwn(i2, (byte) 6);
        i = new rwn(i2, (byte) 7);
        t = new rwn(i2, (byte) 8);
        X = new rwn(i2, (byte) 9);
        Y = new rwn(i2, (byte) 10);
        Z = new rwn(i2, (byte) 11);
        N0 = new rwn(i2, (byte) 12);
        O0 = new rwn(i2, (byte) 13);
        P0 = new rwn(i2, (byte) 14);
        Q0 = new rwn(i2, (byte) 15);
        R0 = new rwn(i2, (byte) 16);
        S0 = new rwn(i2, (byte) 17);
        T0 = new rwn(i2, (byte) 18);
        U0 = new rwn(i2, (byte) 19);
        V0 = new rwn(i2, (byte) 20);
        W0 = new rwn(i2, (byte) 21);
        X0 = new rwn(i2, (byte) 22);
        Y0 = new rwn(i2, (byte) 23);
        Z0 = new rwn(i2, (byte) 24);
        a1 = new rwn(i2, (byte) 25);
        b1 = new rwn(i2, (byte) 26);
        c1 = new rwn(i2, (byte) 27);
        d1 = new rwn(i2, (byte) 28);
        e1 = new rwn(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rwn(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return rih1Var;
            case 2:
                uwo0 uwo0Var = (uwo0) obj;
                String str = uwo0Var.b;
                Set set = s4b1.f;
                String str2 = uwo0Var.a;
                int iOrdinal = uic.x(str2).c.ordinal();
                x0 x0Var = x0.a;
                if (iOrdinal == 44) {
                    return new c1(str2, str, new a1(str2, x0Var), new a1(str2.concat(":about"), x0.b));
                }
                if (iOrdinal == 88) {
                    return new c1(str2, str, new a1(str2, x0Var), new z0());
                }
                eg.m("Link type doesn't match with any Creator link type");
                return null;
            case 3:
                uwo0 uwo0Var2 = (uwo0) obj;
                String str3 = uwo0Var2.b;
                Set set2 = s4b1.f;
                String str4 = uwo0Var2.a;
                int iOrdinal2 = uic.x(str4).c.ordinal();
                if (iOrdinal2 == 44) {
                    return new pyn(str4, str3, new jyn(str4, 1), new jyn(str4.concat(":about"), 2));
                }
                if (iOrdinal2 == 88) {
                    return new pyn(str4, str3, new jyn(str4, 1), new iyn());
                }
                eg.m("Link type doesn't match with any Creator link type");
                return null;
            case 4:
                return Collections.singleton(((uwo0) obj).a);
            case 5:
                return o7h.y0((List) obj, ", ", (String) null, (String) null, (iu30) null, 62);
            case 6:
                return LayoutInflater.from((Context) obj).inflate(2131624484, (ViewGroup) null);
            case 7:
                return (String) obj;
            case 8:
                return (String) obj;
            case 9:
                return "disable-blocked-content";
            case 10:
                return (String) obj;
            case 11:
                return Boolean.valueOf(obj instanceof hzy);
            case 12:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof String);
            case 16:
                return (k1r) obj;
            case 17:
                return Boolean.valueOf(obj instanceof vnb1);
            case 18:
                return (k1r) obj;
            case 19:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.b0(lslVar, u7h.b, Size.e(lslVar.j()) / 2.0f, zno1.o(lslVar.j()), 0.0f, new phc1(4.0f, 0.0f, 0, 0, (uw4) null, 30), 40);
                return rih1Var;
            case 20:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                DrawScope.b0(lslVar2, u7h.b, Size.e(lslVar2.j()) / 2.0f, zno1.o(lslVar2.j()), 0.0f, new phc1(4.0f, 0.0f, 0, 0, (uw4) null, 30), 40);
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                afr0 afr0Var = (afr0) obj;
                return new d1o(afr0Var.b, afr0Var.a, afr0Var.c, afr0Var.d, afr0Var.e, afr0Var.f);
            case 22:
                return o7h.p1(((afr0) obj).f);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return o7h.p1(((afr0) obj).f);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return u1o.a;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return ((i2o) obj).a;
            case 26:
                return (jo70) obj;
            case 27:
                return ((i2o) obj).a;
            case 28:
                return (o2o) obj;
            default:
                if (!(obj instanceof o2o) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
