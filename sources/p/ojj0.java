package p;

import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ojj0 extends hab0 implements iu30 {
    public static final ojj0 N0;
    public static final ojj0 O0;
    public static final ojj0 P0;
    public static final ojj0 Q0;
    public static final ojj0 R0;
    public static final ojj0 S0;
    public static final ojj0 T0;
    public static final ojj0 U0;
    public static final ojj0 V0;
    public static final ojj0 W0;
    public static final ojj0 X;
    public static final ojj0 X0;
    public static final ojj0 Y;
    public static final ojj0 Y0;
    public static final ojj0 Z;
    public static final ojj0 Z0;
    public static final ojj0 a1;
    public static final ojj0 b;
    public static final ojj0 b1;
    public static final ojj0 c;
    public static final ojj0 c1;
    public static final ojj0 d;
    public static final ojj0 d1;
    public static final ojj0 e;
    public static final ojj0 e1;
    public static final ojj0 f;
    public static final ojj0 g;
    public static final ojj0 h;
    public static final ojj0 i;
    public static final ojj0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ojj0(i2, (byte) 0);
        c = new ojj0(i2, (byte) 1);
        d = new ojj0(i2, (byte) 2);
        e = new ojj0(i2, (byte) 3);
        f = new ojj0(i2, (byte) 4);
        g = new ojj0(i2, (byte) 5);
        h = new ojj0(i2, (byte) 6);
        i = new ojj0(i2, (byte) 7);
        t = new ojj0(i2, (byte) 8);
        X = new ojj0(i2, (byte) 9);
        Y = new ojj0(i2, (byte) 10);
        Z = new ojj0(i2, (byte) 11);
        N0 = new ojj0(i2, (byte) 12);
        O0 = new ojj0(i2, (byte) 13);
        P0 = new ojj0(i2, (byte) 14);
        Q0 = new ojj0(i2, (byte) 15);
        R0 = new ojj0(i2, (byte) 16);
        S0 = new ojj0(i2, (byte) 17);
        T0 = new ojj0(i2, (byte) 18);
        U0 = new ojj0(i2, (byte) 19);
        V0 = new ojj0(i2, (byte) 20);
        W0 = new ojj0(i2, (byte) 21);
        X0 = new ojj0(i2, (byte) 22);
        Y0 = new ojj0(i2, (byte) 23);
        Z0 = new ojj0(i2, (byte) 24);
        a1 = new ojj0(i2, (byte) 25);
        b1 = new ojj0(i2, (byte) 26);
        c1 = new ojj0(i2, (byte) 27);
        d1 = new ojj0(i2, (byte) 28);
        e1 = new ojj0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ojj0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        Object obj2 = zpn1.a;
        z6x z6xVar = z6x.a;
        boolean z = false;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof hll);
            case 2:
                return Boolean.valueOf(obj instanceof hll);
            case 3:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 4:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 5:
                return ((skj0) obj).a;
            case 6:
                return ((skj0) obj).b;
            case 7:
                View view = (View) ((aa80) obj).b;
                if (!(view instanceof Flow) && view.getVisibility() == 0 && view.getTag() != obj2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                List list = (List) obj;
                aa80 aa80Var = (aa80) list.get(0);
                aa80 aa80Var2 = (aa80) list.get(1);
                if (((View) aa80Var.b).getLayoutParams().q0 || ((View) aa80Var2.b).getLayoutParams().r0) {
                    return aa80Var;
                }
                return null;
            case 9:
                return Integer.valueOf(((aa80) obj).a);
            case 10:
                return Boolean.valueOf(((View) obj).getTag() == obj2);
            case 11:
                ((qtr) obj).b(new xia(5, (lnm) null, (byte) 3));
                return rih1.a;
            case 12:
                return Collections.singletonList(((fmj0) obj).a);
            case 13:
                String str = ((fmj0) obj).a;
                Set set = s4b1.f;
                return uic.h(str, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6}) ? Collections.singletonList(str) : z6xVar;
            case 14:
                return p7h.N(((fmj0) obj).b.j);
            case 15:
                fmj0 fmj0Var = (fmj0) obj;
                return fmj0Var.b.m ? Collections.singletonList(new pl90(fmj0Var.a)) : z6xVar;
            case 16:
                return (String) obj;
            case 17:
                return (String) obj;
            case 18:
                return (String) obj;
            case 19:
                return (String) obj;
            case 20:
                return (String) obj;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (String) obj;
            case 22:
                return "rating-access";
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return (String) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (mdz) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return (String) obj;
            case 26:
                return (String) obj;
            case 27:
                return new rxc0((String) obj);
            case 28:
                return (qxc0) obj;
            default:
                return (String) obj;
        }
    }
}
