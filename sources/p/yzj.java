package p;

import android.os.Bundle;
import com.spotify.concertpageview.v1.Row;
import com.spotify.connectivity.reachability.esperanto.proto.EsConnectionInfoReceiver$ConnectionInfo;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import j$.time.LocalDateTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yzj extends hab0 implements vu30 {
    public static final yzj N0;
    public static final yzj O0;
    public static final yzj P0;
    public static final yzj Q0;
    public static final yzj R0;
    public static final yzj S0;
    public static final yzj T0;
    public static final yzj U0;
    public static final yzj V0;
    public static final yzj W0;
    public static final yzj X;
    public static final yzj X0;
    public static final yzj Y;
    public static final yzj Y0;
    public static final yzj Z;
    public static final yzj Z0;
    public static final yzj a1;
    public static final yzj b;
    public static final yzj b1;
    public static final yzj c;
    public static final yzj c1;
    public static final yzj d;
    public static final yzj d1;
    public static final yzj e;
    public static final yzj e1;
    public static final yzj f;
    public static final yzj g;
    public static final yzj h;
    public static final yzj i;
    public static final yzj t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new yzj(i2, (byte) 0);
        c = new yzj(i2, (byte) 1);
        d = new yzj(i2, (byte) 2);
        e = new yzj(i2, (byte) 3);
        f = new yzj(i2, (byte) 4);
        g = new yzj(i2, (byte) 5);
        h = new yzj(i2, (byte) 6);
        i = new yzj(i2, (byte) 7);
        t = new yzj(i2, (byte) 8);
        X = new yzj(i2, (byte) 9);
        Y = new yzj(i2, (byte) 10);
        Z = new yzj(i2, (byte) 11);
        N0 = new yzj(i2, (byte) 12);
        O0 = new yzj(i2, (byte) 13);
        P0 = new yzj(i2, (byte) 14);
        Q0 = new yzj(i2, (byte) 15);
        R0 = new yzj(i2, (byte) 16);
        S0 = new yzj(i2, (byte) 17);
        T0 = new yzj(i2, (byte) 18);
        U0 = new yzj(i2, (byte) 19);
        V0 = new yzj(i2, (byte) 20);
        W0 = new yzj(i2, (byte) 21);
        X0 = new yzj(i2, (byte) 22);
        Y0 = new yzj(i2, (byte) 23);
        Z0 = new yzj(i2, (byte) 24);
        a1 = new yzj(i2, (byte) 25);
        b1 = new yzj(i2, (byte) 26);
        c1 = new yzj(i2, (byte) 27);
        d1 = new yzj(i2, (byte) 28);
        e1 = new yzj(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yzj(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:190:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    public final Object invoke(Object obj, Object obj2) {
        long jC;
        hqk hqkVar;
        upk upkVar;
        hqk hqkVar2;
        c380 c380VarA;
        nyb m231Var;
        nyb nybVar;
        c380 c380Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        String strA = null;
        switch (b2) {
            case 0:
                tzj tzjVar = (tzj) obj;
                tzjVar.f = (qyl) obj2;
                err0 err0Var = tzjVar.d;
                err0Var.t(err0Var.s() + 1);
                z2k z2kVar = tzjVar.b;
                if (z2kVar != null) {
                    z2kVar.g = true;
                    z2kVar.z();
                }
                return rih1Var;
            case 1:
                ((uzj) obj).h((lwb0) obj2);
                return rih1Var;
            case 2:
                uwr uwrVar = cbx.a;
                return new u7h(((vex) zex.a.b).j);
            case 3:
                return (xbk) obj;
            case 4:
                nbk nbkVar = (nbk) obj;
                return new obk(nbkVar.a, nbkVar.b, nbkVar.c, nbkVar.d, ((Boolean) obj2).booleanValue(), nbkVar.e, nbkVar.f != null, nbkVar.j, nbkVar.k);
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                efk efkVar = (efk) obj;
                return new ffk(efkVar.a, efkVar.b, efkVar.c, efkVar.d, efkVar.e, efkVar.f, ((Boolean) obj2).booleanValue(), efkVar.g, efkVar.h);
            case 10:
                ca00 ca00Var = (ca00) obj;
                Bundle bundle = (Bundle) obj2;
                if (bundle == null) {
                    strA = fvo0.a;
                } else {
                    strA = bundle.containsKey("notification_bottom_sheet_state") ? (hvo0) bundle.getParcelable("notification_bottom_sheet_state") : null;
                    if (strA == null) {
                        strA = fvo0.a;
                    }
                }
                return ca00.a(ca00Var, (la00) null, (ArrayList) null, (ArrayList) null, false, false, (String) null, (lto0) null, strA, false, (jmo1) null, (Long) null, 3839);
            case 11:
                return Next.h((gok) obj2);
            case 12:
                dnk dnkVar = (dnk) obj;
                String str = dnkVar.a;
                return First.c(new fok(str, dnkVar.b), Collections.singleton(new emk(str)));
            case 13:
                d6m d6mVar = (d6m) obj2;
                if (d6mVar instanceof a900) {
                    mek mekVar = ((a900) d6mVar).h;
                    jC = (mekVar == mek.CARD_KIND_ROW || mekVar == mek.CARD_KIND_LARGE) ? blo1.c(qpb0.b) : blo1.c(1);
                } else if (d6mVar instanceof iye1) {
                    jC = blo1.c(qpb0.b);
                } else if (d6mVar instanceof hvi1) {
                    jC = blo1.c(1);
                } else {
                    if (!(d6mVar instanceof w8x)) {
                        eg.o();
                        return null;
                    }
                    jC = blo1.c(qpb0.b);
                }
                return new bg50(jC);
            case 14:
                return new u7h(u7h.f);
            case 15:
                ((Number) obj).intValue();
                return ((hqk) obj2).a;
            case 16:
                krk krkVar = (krk) obj;
                List list = (List) obj2;
                String str2 = krkVar.a;
                x360 x360Var = krkVar.b;
                if (list.isEmpty()) {
                    return new lrk(str2, x360Var, fg91.b);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i1r i1rVar = (k1r) ((mmr0) it.next()).b;
                    i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                    if (i1rVar2 == null || (upkVar = (upk) i1rVar2.a) == null) {
                        hqkVar = null;
                    } else {
                        String string = xqk.a(upkVar.c.a).toString();
                        j6k j6kVar = upkVar.a;
                        k7r k7rVar = j6kVar.c.a;
                        OffsetDateTime offsetDateTimePlusMinutes = LocalDateTime.parse(k7rVar.a, DateTimeFormatter.ISO_DATE_TIME).atOffset(ZoneOffset.UTC).plusMinutes(k7rVar.b);
                        hqkVar2 = new hqk(j6kVar.a, string, offsetDateTimePlusMinutes.format(xqk.a), offsetDateTimePlusMinutes.getMonth().getDisplayName(TextStyle.SHORT, Locale.getDefault()), ihc1.F0(2, String.valueOf(offsetDateTimePlusMinutes.getDayOfMonth())), j6kVar.b, xqk.c(upkVar.b));
                    }
                    if (hqkVar != null) {
                        hqkVar = hqkVar2;
                        arrayList.add(hqkVar);
                    } else {
                        hqkVar = hqkVar2;
                    }
                }
                return new lrk(str2, x360Var, mqo1.A(arrayList));
            case 17:
                return ((ynd0) obj).b;
            case 18:
                return new isk(obj, ((Boolean) obj2).booleanValue());
            case 19:
                Bundle bundle2 = (Bundle) obj2;
                oxk oxkVar = ((mxk) obj).g;
                if (oxkVar == null) {
                    u890.C("model");
                    throw null;
                }
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                ArrayList<crr0> arrayListU = jhc1.u(bundle2, "shows", crr0.class);
                if (arrayListU != null) {
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayListU, 10));
                    for (crr0 crr0Var : arrayListU) {
                        crr0Var.getClass();
                        arrayList2.add(new s781(crr0Var.a, crr0Var.b, crr0Var.c, crr0Var.d, crr0Var.e, crr0Var.f));
                    }
                    c380VarA = mqo1.A(arrayList2);
                } else {
                    c380VarA = null;
                }
                crr0 crr0Var2 = (crr0) jhc1.t(bundle2, "selected_show", crr0.class);
                s781 s781Var = crr0Var2 != null ? new s781(crr0Var2.a, crr0Var2.b, crr0Var2.c, crr0Var2.d, crr0Var2.e, crr0Var2.f) : null;
                String string2 = bundle2.getString("bottom_sheet_state");
                if (string2 != null) {
                    try {
                        m231Var = nyb.valueOf(string2);
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (m231Var instanceof m231) {
                        m231Var = null;
                    }
                    nybVar = m231Var;
                    if (nybVar == null) {
                        nybVar = oxkVar.n;
                    }
                    break;
                } else {
                    nybVar = oxkVar.n;
                }
                nyb nybVar2 = nybVar;
                int i2 = bundle2.getInt("selected_artwork_carousel_index", 0);
                String string3 = bundle2.getString("uploaded_artwork_carousel_image_url");
                f27 f27Var = string3 != null ? new f27(string3, bundle2.getString("uploaded_artwork_carousel_artwork_id"), true) : null;
                ArrayList arrayListU2 = jhc1.u(bundle2, "recommended_tools", rxk.class);
                c380 c380VarA2 = arrayListU2 != null ? mqo1.A(arrayListU2) : null;
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("selected_tool_ids");
                u380 u380VarC = stringArrayList != null ? mqo1.C(stringArrayList) : null;
                ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("interacted_tool_ids");
                u380 u380VarC2 = stringArrayList2 != null ? mqo1.C(stringArrayList2) : null;
                ArrayList<nqr0> arrayListU3 = jhc1.u(bundle2, "connector_apps", nqr0.class);
                if (arrayListU3 != null) {
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayListU3, 10));
                    for (nqr0 nqr0Var : arrayListU3) {
                        nqr0Var.getClass();
                        arrayList3.add(new vcl(nqr0Var.a, nqr0Var.b, nqr0Var.c, nqr0Var.d, nqr0Var.f, nqr0Var.g, nqr0Var.e, nqr0Var.h));
                        c380VarA2 = c380VarA2;
                    }
                    c380Var = c380VarA2;
                    strA = mqo1.A(arrayList3);
                } else {
                    c380Var = c380VarA2;
                }
                qxk qxkVar = (qxk) jhc1.t(bundle2, "preview", qxk.class);
                if (qxkVar == null) {
                    qxkVar = oxkVar.b;
                }
                yxk yxkVar = (yxk) jhc1.t(bundle2, "voice", yxk.class);
                if (yxkVar == null) {
                    yxkVar = oxkVar.d;
                }
                yxk yxkVar2 = yxkVar;
                sxk sxkVar = (sxk) jhc1.t(bundle2, "schedule", sxk.class);
                if (sxkVar == null) {
                    sxkVar = oxkVar.e;
                }
                sxk sxkVar2 = sxkVar;
                if (c380VarA == null) {
                    c380VarA = oxkVar.c;
                }
                if (s781Var == null) {
                    s781Var = oxkVar.f;
                }
                s781 s781Var2 = s781Var;
                e1e e1eVar = f27Var != null ? new e1e(f27Var) : oxkVar.s;
                c380 c380Var2 = c380Var == null ? oxkVar.v : c380Var;
                if (u380VarC == null) {
                    u380VarC = oxkVar.w;
                }
                u380 u380Var = u380VarC;
                if (u380VarC2 == null) {
                    u380VarC2 = oxkVar.x;
                }
                u380 u380Var2 = u380VarC2;
                if (strA == null) {
                    strA = oxkVar.z;
                }
                return oxk.a(oxkVar, (String) null, qxkVar, c380VarA, yxkVar2, sxkVar2, s781Var2, (gmc1) null, false, false, false, nybVar2, (dyh1) null, (String) null, false, (mrn) null, e1eVar, i2, (sxk) null, c380Var2, u380Var, u380Var2, bundle2.containsKey("has_tool_selection_override") ? bundle2.getBoolean("has_tool_selection_override") : oxkVar.y, strA, (String) null, (r591) null, bundle2.containsKey("location") ? bundle2.getString("location") : oxkVar.C, 202629057);
            case 20:
                return Boolean.valueOf(((EsConnectionInfoReceiver$ConnectionInfo) obj).n() != ((EsConnectionInfoReceiver$ConnectionInfo) obj2).n());
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (uel) obj;
            case 22:
                return (oll) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                hzy hzyVar = (hzy) obj;
                jo70 jo70Var = (jo70) obj2;
                return new fnl(hzyVar != null ? hzyVar.a : 0, jo70Var != null ? jo70Var.a : null);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return null;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return ((ssl) obj).c;
            case 26:
                return ((tsl) obj).c;
            case 27:
                return Next.j();
            case 28:
                return First.c((w0m) obj2, Collections.singleton(new l0m("")));
            default:
                return Next.j();
        }
    }
}
