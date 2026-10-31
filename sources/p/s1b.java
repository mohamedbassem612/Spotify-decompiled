package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s1b extends hab0 implements zu30 {
    public static final s1b N0;
    public static final s1b O0;
    public static final s1b P0;
    public static final s1b Q0;
    public static final s1b R0;
    public static final s1b S0;
    public static final s1b T0;
    public static final s1b U0;
    public static final s1b V0;
    public static final s1b W0;
    public static final s1b X;
    public static final s1b X0;
    public static final s1b Y;
    public static final s1b Y0;
    public static final s1b Z;
    public static final s1b Z0;
    public static final s1b a1;
    public static final s1b b;
    public static final s1b b1;
    public static final s1b c;
    public static final s1b c1;
    public static final s1b d;
    public static final s1b d1;
    public static final s1b e;
    public static final s1b e1;
    public static final s1b f;
    public static final s1b g;
    public static final s1b h;
    public static final s1b i;
    public static final s1b t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 4;
        b = new s1b(i2, (byte) 0);
        c = new s1b(i2, (byte) 1);
        d = new s1b(i2, (byte) 2);
        e = new s1b(i2, (byte) 3);
        f = new s1b(i2, (byte) 4);
        g = new s1b(i2, (byte) 5);
        h = new s1b(i2, (byte) 6);
        i = new s1b(i2, (byte) 7);
        t = new s1b(i2, (byte) 8);
        X = new s1b(i2, (byte) 9);
        Y = new s1b(i2, (byte) 10);
        Z = new s1b(i2, (byte) 11);
        N0 = new s1b(i2, (byte) 12);
        O0 = new s1b(i2, (byte) 13);
        P0 = new s1b(i2, (byte) 14);
        Q0 = new s1b(i2, (byte) 15);
        R0 = new s1b(i2, (byte) 16);
        S0 = new s1b(i2, (byte) 17);
        T0 = new s1b(i2, (byte) 18);
        U0 = new s1b(i2, (byte) 19);
        V0 = new s1b(i2, (byte) 20);
        W0 = new s1b(i2, (byte) 21);
        X0 = new s1b(i2, (byte) 22);
        Y0 = new s1b(i2, (byte) 23);
        Z0 = new s1b(i2, (byte) 24);
        a1 = new s1b(i2, (byte) 25);
        b1 = new s1b(i2, (byte) 26);
        c1 = new s1b(i2, (byte) 27);
        d1 = new s1b(i2, (byte) 28);
        e1 = new s1b(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1b(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        String str;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                tll0 tll0Var = (tll0) obj;
                n1b n1bVar = (n1b) obj2;
                xjf1 xjf1Var = n1bVar.b;
                if (xjf1Var == null) {
                    return null;
                }
                Integer numValueOf = Integer.valueOf(n1bVar.a);
                String str2 = xjf1Var.b;
                x6h1 x6h1VarC = tll0Var.b.c();
                x6h1VarC.i.add(new a7h1("facepile_button", (String) null, numValueOf, str2, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), tll0Var.a, System.currentTimeMillis());
            case 1:
                ayk0 ayk0Var = (ayk0) obj;
                if (((ogb) obj4).equals(ogb.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ayk0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 2:
                ((Number) obj3).intValue();
                return new wsk0(((slb) obj).a, (r6h1) obj4);
            case 3:
                return null;
            case 4:
                ((Number) obj3).intValue();
                return new gtk0((r6h1) obj4);
            case 5:
                gtk0 gtk0Var = (gtk0) obj;
                bmb bmbVar = (bmb) obj4;
                x6h1 x6h1VarC2 = gtk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("supplementary_material_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                Integer numValueOf2 = Integer.valueOf(bmbVar.a);
                String str3 = bmbVar.b.c;
                x6h1 x6h1VarC3 = y6h1VarA.c();
                x6h1VarC3.i.add(new a7h1("supplementary_material", (String) null, numValueOf2, str3, (String) null));
                x6h1VarC3.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarC3.a(), gtk0Var.a, System.currentTimeMillis());
            case 6:
                return new as0((Context) obj2, (byte) 4);
            case 7:
                ((Number) obj3).intValue();
                return new btk0((r6h1) obj4);
            case 8:
                btk0 btk0Var = (btk0) obj;
                aob aobVar = (aob) obj2;
                if (!(((znb) obj4) instanceof znb)) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC4 = btk0Var.b.c();
                x6h1VarC4.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", aobVar.e)), x6h1VarC4.a(), btk0Var.a, System.currentTimeMillis());
            case 9:
                ((Number) obj3).intValue();
                r6h1 r6h1Var = (r6h1) obj4;
                String str4 = ((eob) obj2).b;
                return str4 == null ? new z8s((byte) 1) : new ctk0(str4, r6h1Var);
            case 10:
                ctk0 ctk0Var = (n8h1) obj;
                cob cobVar = (cob) obj4;
                String str5 = ((eob) obj3).b;
                if (str5 == null) {
                    return null;
                }
                if (cobVar.equals(cob.a)) {
                    return ctk0Var.a(str5);
                }
                eg.o();
                return null;
            case 11:
                return new qob((Context) obj2, (byte) 0);
            case 12:
                ((Number) obj3).intValue();
                return new r6l0(new s6l0());
            case 13:
                r6l0 r6l0Var = (r6l0) obj;
                String str6 = nik1.A1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), r6l0Var.a, r6l0Var.b.a, System.currentTimeMillis());
            case 14:
                return (n8h1) ((ig51) obj).c.invoke(Integer.valueOf(((Number) obj3).intValue()), (r6h1) obj4);
            case 15:
                return null;
            case 16:
                ((Number) obj3).intValue();
                return new s6l0();
            case 17:
                s6l0 s6l0Var = (s6l0) obj;
                j700 j700Var = (j700) obj4;
                r6h1 r6h1Var2 = s6l0Var.a;
                y6h1 y6h1Var = s6l0Var.b;
                if (j700Var instanceof awz) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("audio_recognition_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC5.a(), r6h1Var2, System.currentTimeMillis());
                } else if (j700Var instanceof fwz) {
                    x6h1 x6h1VarC6 = y6h1Var.c();
                    x6h1VarC6.i.add(new a7h1("scannables_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = true;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC6.a(), r6h1Var2, System.currentTimeMillis());
                } else {
                    if (!(j700Var instanceof p300)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var.c();
                    x6h1VarC7.i.add(new a7h1("profile_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:activitycenter")), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                lzl0 lzl0Var = (lzl0) obj;
                String str7 = rdc.f;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), lzl0Var.a, r6h1.c, System.currentTimeMillis());
            case 20:
                ((Number) obj3).intValue();
                r6h1 r6h1Var3 = (r6h1) obj4;
                piz pizVar = ((fbd) obj).a;
                if (u890.j(pizVar, jiz.a)) {
                    str = "opted_out";
                } else if (u890.j(pizVar, miz.a)) {
                    str = "too_young";
                } else if (u890.j(pizVar, giz.a)) {
                    str = "link_expired";
                } else if (u890.j(pizVar, niz.a)) {
                    str = "unreleased_market";
                } else if (u890.j(pizVar, hiz.a)) {
                    str = "members_limit_exceeded";
                } else if (u890.j(pizVar, kiz.a)) {
                    str = "restricted_from_messaging";
                } else if (pizVar instanceof liz) {
                    str = "should_assure_age";
                } else {
                    if (!u890.j(pizVar, iiz.a) && pizVar != null) {
                        eg.o();
                        return null;
                    }
                    str = "generic";
                }
                return new muk0(str, r6h1Var3);
            case 21:
                muk0 muk0Var = (muk0) obj;
                tad tadVar = (tad) obj4;
                if (tadVar.equals(qad.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), muk0Var.b, muk0Var.a, System.currentTimeMillis());
                }
                if (tadVar.equals(sad.a)) {
                    return muk0Var.a(nik1.e1.a);
                }
                if (tadVar instanceof rad) {
                    return muk0Var.a("spotify:age-assurance");
                }
                eg.o();
                return null;
            case 22:
                fvl0 fvl0Var = (fvl0) obj;
                if (((sfd) obj4) instanceof sfd) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), fvl0Var.a, r6h1.c, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 23:
                ((Number) obj3).intValue();
                return new w7l0(new z7l0((r6h1) obj4));
            case 24:
                w7l0 w7l0Var = (w7l0) obj;
                if (((vfd) obj4).equals(vfd.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), w7l0Var.a, w7l0Var.b.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 25:
                return new as0((Context) obj2, (ViewGroup) obj3, (iu30) obj4, (byte) 5);
            case 26:
                ((Number) obj3).intValue();
                return new ebl0((r6h1) obj4);
            case 27:
                ebl0 ebl0Var = (ebl0) obj;
                if (lgd.a[((igd) obj4).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                x6h1 x6h1VarC8 = ebl0Var.b.c();
                x6h1VarC8.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC8.a(), ebl0Var.a, System.currentTimeMillis());
            case 28:
                swl0 swl0Var = (swl0) obj;
                if (((vgd) obj4) == vgd.a) {
                    return swl0Var.a(xgd.e);
                }
                eg.o();
                return null;
            default:
                ((Number) obj3).intValue();
                return new dcl0((r6h1) obj4);
        }
    }
}
