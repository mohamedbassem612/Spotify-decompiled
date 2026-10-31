package p;

import android.content.Context;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.BookUriRedirectException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.CountryRestrictedException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.RequiredMetadataMissingException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.ShowEsperantoEndpointException;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mls extends hab0 implements iu30 {
    public static final mls N0;
    public static final mls O0;
    public static final mls P0;
    public static final mls Q0;
    public static final mls R0;
    public static final mls S0;
    public static final mls T0;
    public static final mls U0;
    public static final mls V0;
    public static final mls W0;
    public static final mls X;
    public static final mls X0;
    public static final mls Y;
    public static final mls Y0;
    public static final mls Z;
    public static final mls Z0;
    public static final mls a1;
    public static final mls b;
    public static final mls b1;
    public static final mls c;
    public static final mls c1;
    public static final mls d;
    public static final mls d1;
    public static final mls e;
    public static final mls e1;
    public static final mls f;
    public static final mls g;
    public static final mls h;
    public static final mls i;
    public static final mls t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new mls(i2, (byte) 0);
        c = new mls(i2, (byte) 1);
        d = new mls(i2, (byte) 2);
        e = new mls(i2, (byte) 3);
        f = new mls(i2, (byte) 4);
        g = new mls(i2, (byte) 5);
        h = new mls(i2, (byte) 6);
        i = new mls(i2, (byte) 7);
        t = new mls(i2, (byte) 8);
        X = new mls(i2, (byte) 9);
        Y = new mls(i2, (byte) 10);
        Z = new mls(i2, (byte) 11);
        N0 = new mls(i2, (byte) 12);
        O0 = new mls(i2, (byte) 13);
        P0 = new mls(i2, (byte) 14);
        Q0 = new mls(i2, (byte) 15);
        R0 = new mls(i2, (byte) 16);
        S0 = new mls(i2, (byte) 17);
        T0 = new mls(i2, (byte) 18);
        U0 = new mls(i2, (byte) 19);
        V0 = new mls(i2, (byte) 20);
        W0 = new mls(i2, (byte) 21);
        X0 = new mls(i2, (byte) 22);
        Y0 = new mls(i2, (byte) 23);
        Z0 = new mls(i2, (byte) 24);
        a1 = new mls(i2, (byte) 25);
        b1 = new mls(i2, (byte) 26);
        c1 = new mls(i2, (byte) 27);
        d1 = new mls(i2, (byte) 28);
        e1 = new mls(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mls(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        y6l1 y6l1Var;
        byte b2 = this.a;
        boolean z = true;
        z = true;
        boolean z2 = true;
        z = true;
        z = true;
        z = true;
        boolean z3 = true;
        z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new x061((Context) obj);
            case 1:
                return new kls(((ils) obj).a);
            case 2:
                return (String) obj;
            case 3:
                return (uio) obj;
            case 4:
                return (String) obj;
            case 5:
                return (String) obj;
            case 6:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 8:
                return Boolean.valueOf(obj instanceof uio);
            case 9:
                if (obj != null) {
                    return (uio) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.curationexperiencetrait.CurationExperienceTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof jo70);
            case 11:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 12:
                ems emsVar = (ems) obj;
                ak3 ak3Var = emsVar.a;
                List list = emsVar.b;
                return new fms(ak3Var, list, list.size() > 3);
            case 13:
                ((Boolean) obj).getClass();
                return Boolean.FALSE;
            case 14:
                return new xms(z6x.a);
            case 15:
                DrawScope.S0((DrawScope) obj, v9c.t(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14))), new mmr0(Float.valueOf(0.4f), new u7h(u7h.j))}, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 16:
                return rih1Var;
            case 17:
                return gz51.c;
            case 18:
                Throwable th = (Throwable) obj;
                if (!(th instanceof RequiredMetadataMissingException) && !(th instanceof ShowEsperantoEndpointException) && !(th instanceof CountryRestrictedException) && !(th instanceof BookUriRedirectException)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 19:
                return new rw91((String) null, ((qw91) obj).c);
            case 20:
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                return ((jwz0) obj).a;
            case 26:
                return rih1Var;
            case 27:
                stk1 stk1Var = (stk1) obj;
                Float f2 = stk1Var.h;
                return new ttk1(f2 != null ? f2.floatValue() : 0.0f, stk1Var.b, stk1Var.d, (ke71) null, stk1Var.g == null, stk1Var.i, 8);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                kby kbyVar = ((cxc0) obj).f;
                f7l1 f7l1VarA = kbyVar.x.a(f7l1.class);
                sqe sqeVar = f7l1VarA != null ? f7l1VarA.a : null;
                z6l1 z6l1Var = sqeVar instanceof z6l1 ? (z6l1) sqeVar : null;
                bbl1 bbl1VarA = kbyVar.x.a(bbl1.class);
                if (z6l1Var != null) {
                    String str = bbl1VarA != null ? bbl1VarA.g : null;
                    String str2 = str == null ? "" : str;
                    String str3 = z6l1Var.d;
                    abl1 abl1Var = bbl1VarA != null ? bbl1VarA.d : null;
                    String str4 = abl1Var != null ? abl1Var.a : null;
                    String str5 = str4 == null ? "" : str4;
                    int i2 = abl1Var != null ? abl1Var.b : 0;
                    e7l1 e7l1Var = new e7l1(abl1Var != null ? abl1Var.c : 0L, abl1Var != null ? abl1Var.d : 0L, str5, (i2 == 0 ? -1 : a0t.a[l1d.C(i2)]) == 1 ? 2 : 1);
                    zal1 zal1Var = bbl1VarA != null ? bbl1VarA.c : null;
                    String str6 = zal1Var != null ? zal1Var.a : null;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = zal1Var != null ? zal1Var.b : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    x6l1 x6l1Var = new x6l1(str6, str7);
                    String str8 = bbl1VarA != null ? bbl1VarA.b : null;
                    String str9 = str8 == null ? "" : str8;
                    yal1 yal1Var = bbl1VarA != null ? bbl1VarA.i : null;
                    y6l1Var = new y6l1("", str2, str3, e7l1Var, x6l1Var, str9, "", yal1Var != null ? new w6l1(yal1Var.a, yal1Var.b, yal1Var.c, yal1Var.d) : null);
                } else {
                    y6l1Var = e0t.g;
                }
                return new cgy("playlist_page:entity_explorer", y6l1Var);
            default:
                if (!(obj instanceof f7l1) && !(obj instanceof rih1)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
        }
    }
}
