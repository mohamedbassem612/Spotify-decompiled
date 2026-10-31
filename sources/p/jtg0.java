package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.encoremobile.component.icons.IconSpotifyLogo;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.martini.martinidata.model.Mode;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jtg0 extends hab0 implements iu30 {
    public static final jtg0 N0;
    public static final jtg0 O0;
    public static final jtg0 P0;
    public static final jtg0 Q0;
    public static final jtg0 R0;
    public static final jtg0 S0;
    public static final jtg0 T0;
    public static final jtg0 U0;
    public static final jtg0 V0;
    public static final jtg0 W0;
    public static final jtg0 X;
    public static final jtg0 X0;
    public static final jtg0 Y;
    public static final jtg0 Y0;
    public static final jtg0 Z;
    public static final jtg0 Z0;
    public static final jtg0 a1;
    public static final jtg0 b;
    public static final jtg0 b1;
    public static final jtg0 c;
    public static final jtg0 c1;
    public static final jtg0 d;
    public static final jtg0 d1;
    public static final jtg0 e;
    public static final jtg0 e1;
    public static final jtg0 f;
    public static final jtg0 g;
    public static final jtg0 h;
    public static final jtg0 i;
    public static final jtg0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jtg0(i2, (byte) 0);
        c = new jtg0(i2, (byte) 1);
        d = new jtg0(i2, (byte) 2);
        e = new jtg0(i2, (byte) 3);
        f = new jtg0(i2, (byte) 4);
        g = new jtg0(i2, (byte) 5);
        h = new jtg0(i2, (byte) 6);
        i = new jtg0(i2, (byte) 7);
        t = new jtg0(i2, (byte) 8);
        X = new jtg0(i2, (byte) 9);
        Y = new jtg0(i2, (byte) 10);
        Z = new jtg0(i2, (byte) 11);
        N0 = new jtg0(i2, (byte) 12);
        O0 = new jtg0(i2, (byte) 13);
        P0 = new jtg0(i2, (byte) 14);
        Q0 = new jtg0(i2, (byte) 15);
        R0 = new jtg0(i2, (byte) 16);
        S0 = new jtg0(i2, (byte) 17);
        T0 = new jtg0(i2, (byte) 18);
        U0 = new jtg0(i2, (byte) 19);
        V0 = new jtg0(i2, (byte) 20);
        W0 = new jtg0(i2, (byte) 21);
        X0 = new jtg0(i2, (byte) 22);
        Y0 = new jtg0(i2, (byte) 23);
        Z0 = new jtg0(i2, (byte) 24);
        a1 = new jtg0(i2, (byte) 25);
        b1 = new jtg0(i2, (byte) 26);
        c1 = new jtg0(i2, (byte) 27);
        d1 = new jtg0(i2, (byte) 28);
        e1 = new jtg0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jtg0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        int i2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i3 = 1;
        w7x w7xVar = w7x.a;
        switch (b2) {
            case 0:
                mbh0 mbh0Var = (mbh0) obj;
                return new gtg0(1, mbh0Var.b(), mbh0Var);
            case 1:
                mbh0 mbh0Var2 = (mbh0) obj;
                return new gtg0(2, mbh0Var2.b(), mbh0Var2);
            case 2:
                return rih1Var;
            case 3:
                Context context = (Context) obj;
                IconSpotifyLogo iconSpotifyLogo = new IconSpotifyLogo(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int i4 = (int) (24.0f * context.getResources().getDisplayMetrics().density);
                iconSpotifyLogo.setLayoutParams(new ViewGroup.LayoutParams(i4, i4));
                return iconSpotifyLogo;
            case 4:
                return rih1Var;
            case 5:
                return ((wyg0) obj).a;
            case 6:
                return (jo70) obj;
            case 7:
                return new uyg0("", (String) null, false, false, (gzg0) null);
            case 8:
                return Boolean.valueOf(obj instanceof jo70);
            case 9:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 10:
                return tyg0.a;
            case 11:
                r5h0 r5h0Var = (r5h0) obj;
                return new kka1(r5h0Var.c, r5h0Var.b);
            case 12:
                return w7xVar;
            case 13:
                return w7xVar;
            case 14:
                throw td6.k(obj);
            case 15:
                return w7xVar;
            case 16:
                return new ff50();
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return w7xVar;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new cwc1(((t5h0) obj).b);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return w7xVar;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return w7xVar;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x5h0 x5h0Var = (x5h0) obj;
                g5h0 g5h0Var = x5h0Var.c;
                return new cei1(g5h0Var.c, g5h0Var.b, x5h0Var.b);
            case 22:
                return w7xVar;
            case 23:
                return w7xVar;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                p5h0 p5h0Var = (p5h0) obj;
                return new oc31(p5h0Var.c, p5h0Var.b, p5h0Var.d);
            case 25:
                return w7xVar;
            case 26:
                i5h0 i5h0Var = (i5h0) obj;
                String str = i5h0Var.d;
                int iC = l1d.C(i5h0Var.e);
                return new d5h(str, (iC == 0 || iC != 2) ? 1 : 2, i5h0Var.f, i5h0Var.g, i5h0Var.h, i5h0Var.b, i5h0Var.c, i5h0Var.i ? c5h.b : c5h.a);
            case 27:
                v5h0 v5h0Var = (v5h0) obj;
                return new trf1(v5h0Var.d, v5h0Var.e, v5h0Var.f, v5h0Var.g, true, v5h0Var.b, v5h0Var.c, v5h0Var.h, v5h0Var.i, v5h0Var.j, false, false, "");
            case 28:
                l5h0 l5h0Var = (l5h0) obj;
                String str2 = l5h0Var.d;
                String str3 = l5h0Var.e;
                return new fr10(str2, !ihc1.y0(str3) ? str3 : null, true, (Mode) null, l5h0Var.c, l5h0Var.f, 24);
            default:
                k5h0 k5h0Var = (k5h0) obj;
                String str4 = k5h0Var.d;
                int iC2 = l1d.C(k5h0Var.e);
                if (iC2 == 0) {
                    i2 = i3;
                } else if (iC2 == 1) {
                    i2 = 2;
                } else {
                    if (iC2 != 2) {
                        eg.o();
                        return null;
                    }
                    i3 = 3;
                    i2 = i3;
                }
                return new koy(str4, i2, k5h0Var.b, k5h0Var.c, k5h0Var.f);
        }
    }
}
