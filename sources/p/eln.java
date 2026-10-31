package p;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eln extends hab0 implements iu30 {
    public static final eln N0;
    public static final eln O0;
    public static final eln P0;
    public static final eln Q0;
    public static final eln R0;
    public static final eln S0;
    public static final eln T0;
    public static final eln U0;
    public static final eln V0;
    public static final eln W0;
    public static final eln X;
    public static final eln X0;
    public static final eln Y;
    public static final eln Y0;
    public static final eln Z;
    public static final eln Z0;
    public static final eln a1;
    public static final eln b;
    public static final eln b1;
    public static final eln c;
    public static final eln c1;
    public static final eln d;
    public static final eln d1;
    public static final eln e;
    public static final eln e1;
    public static final eln f;
    public static final eln g;
    public static final eln h;
    public static final eln i;
    public static final eln t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new eln(i2, (byte) 0);
        c = new eln(i2, (byte) 1);
        d = new eln(i2, (byte) 2);
        e = new eln(i2, (byte) 3);
        f = new eln(i2, (byte) 4);
        g = new eln(i2, (byte) 5);
        h = new eln(i2, (byte) 6);
        i = new eln(i2, (byte) 7);
        t = new eln(i2, (byte) 8);
        X = new eln(i2, (byte) 9);
        Y = new eln(i2, (byte) 10);
        Z = new eln(i2, (byte) 11);
        N0 = new eln(i2, (byte) 12);
        O0 = new eln(i2, (byte) 13);
        P0 = new eln(i2, (byte) 14);
        Q0 = new eln(i2, (byte) 15);
        R0 = new eln(i2, (byte) 16);
        S0 = new eln(i2, (byte) 17);
        T0 = new eln(i2, (byte) 18);
        U0 = new eln(i2, (byte) 19);
        V0 = new eln(i2, (byte) 20);
        W0 = new eln(i2, (byte) 21);
        X0 = new eln(i2, (byte) 22);
        Y0 = new eln(i2, (byte) 23);
        Z0 = new eln(i2, (byte) 24);
        a1 = new eln(i2, (byte) 25);
        b1 = new eln(i2, (byte) 26);
        c1 = new eln(i2, (byte) 27);
        d1 = new eln(i2, (byte) 28);
        e1 = new eln(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eln(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayListU = jhc1.u(bundle, "create_group_page_destinations", j6q0.class);
                Map map = (HashMap) jhc1.v(bundle, "create_group_page_selected_users", new HashMap().getClass());
                if (map == null) {
                    map = b7x.a;
                }
                Map map2 = map;
                w4i1 w4i1Var = (w4i1) jhc1.t(bundle, "create_group_page_current_user", w4i1.class);
                boolean z2 = bundle.getBoolean("create_group_page_suggested_contacts_disabled", false);
                String string = bundle.getString("create_group_page_reserved_hierarchy_id");
                String string2 = bundle.getString("create_group_page_request_token");
                if (w4i1Var == null) {
                    w4i1Var = w4i1.f;
                }
                return new aln(map2, true, arrayListU, w4i1Var, string, string2, z2);
            case 1:
                return dmn.a;
            case 2:
                eqc eqcVar = (eqc) obj;
                long j = u7h.b;
                List listM = p7h.M(new u7h[]{new u7h(u7h.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                return eqcVar.b(new gjd(new mic0(0, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 0.2f) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) * 0.8f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L), listM, (List) null), (byte) 2));
            case 3:
                return new ann((xmn) obj);
            case 4:
                return Float.valueOf(((Number) obj).floatValue() * 0.5f);
            case 5:
                return "spotify:new:playlist";
            case 6:
                b261.a((e261) obj);
                return rih1.a;
            case 7:
                iun iunVar = (iun) obj;
                if (iunVar instanceof hun) {
                    hun hunVar = (hun) iunVar;
                    return mno1.h(new mmr0[]{new mmr0("HeaderElement_scrollState", hunVar.c), new mmr0("HeaderElement_inlineFindActive", Boolean.valueOf(hunVar.n))});
                }
                hhg1.n("Failed requirement.");
                return null;
            case 8:
                Bundle bundle2 = (Bundle) obj;
                fun dunVar = (fun) bundle2.getParcelable("HeaderElement_scrollState");
                if (dunVar == null) {
                    dunVar = new dun(false);
                }
                return new gun(dunVar, bundle2.getBoolean("HeaderElement_inlineFindActive"));
            case 9:
                return ((bun) obj).a.a;
            case 10:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                if (!(obj instanceof mdz) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mdz) obj;
            case 16:
                if (!(obj instanceof va81) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (va81) obj;
            case 18:
                return Boolean.valueOf(obj instanceof xkk1);
            case 19:
                return (k1r) obj;
            case 20:
                return Boolean.valueOf(obj instanceof xkk1);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (k1r) obj;
            case 22:
                return (String) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return (String) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (String) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                String str = (String) obj;
                Set set = s4b1.f;
                if (uic.h(str, new blc0[]{blc0.Pg, blc0.ld, blc0.Qg, blc0.Rg, blc0.Vg, blc0.z6})) {
                    return str;
                }
                return null;
            case 26:
                String str2 = (String) obj;
                Set set2 = s4b1.f;
                if (uic.g(str2, blc0.fh)) {
                    return str2;
                }
                return null;
            case 27:
                return Boolean.valueOf(((View) obj) instanceof TextView);
            case 28:
                eqw eqwVar = (eqw) obj;
                if (eqwVar.equals(eqw.a)) {
                    return cun.a;
                }
                if (eqwVar.equals(eqw.b)) {
                    return new dun(true);
                }
                eg.o();
                return null;
            default:
                return end1.a;
        }
    }
}
