package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Reply;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rng extends hab0 implements vu30 {
    public static final rng N0;
    public static final rng O0;
    public static final rng P0;
    public static final rng Q0;
    public static final rng R0;
    public static final rng S0;
    public static final rng T0;
    public static final rng U0;
    public static final rng V0;
    public static final rng W0;
    public static final rng X;
    public static final rng X0;
    public static final rng Y;
    public static final rng Y0;
    public static final rng Z;
    public static final rng Z0;
    public static final rng a1;
    public static final rng b;
    public static final rng b1;
    public static final rng c;
    public static final rng c1;
    public static final rng d;
    public static final rng d1;
    public static final rng e;
    public static final rng e1;
    public static final rng f;
    public static final rng g;
    public static final rng h;
    public static final rng i;
    public static final rng t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new rng(i2, (byte) 0);
        c = new rng(i2, (byte) 1);
        d = new rng(i2, (byte) 2);
        e = new rng(i2, (byte) 3);
        f = new rng(i2, (byte) 4);
        g = new rng(i2, (byte) 5);
        h = new rng(i2, (byte) 6);
        i = new rng(i2, (byte) 7);
        t = new rng(i2, (byte) 8);
        X = new rng(i2, (byte) 9);
        Y = new rng(i2, (byte) 10);
        Z = new rng(i2, (byte) 11);
        N0 = new rng(i2, (byte) 12);
        O0 = new rng(i2, (byte) 13);
        P0 = new rng(i2, (byte) 14);
        Q0 = new rng(i2, (byte) 15);
        R0 = new rng(i2, (byte) 16);
        S0 = new rng(i2, (byte) 17);
        T0 = new rng(i2, (byte) 18);
        U0 = new rng(i2, (byte) 19);
        V0 = new rng(i2, (byte) 20);
        W0 = new rng(i2, (byte) 21);
        X0 = new rng(i2, (byte) 22);
        Y0 = new rng(i2, (byte) 23);
        Z0 = new rng(i2, (byte) 24);
        a1 = new rng(i2, (byte) 25);
        b1 = new rng(i2, (byte) 26);
        c1 = new rng(i2, (byte) 27);
        d1 = new rng(i2, (byte) 28);
        e1 = new rng(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rng(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        r6h r6hVarL;
        njb0 njb0Var;
        byte b2 = this.a;
        Set setX = w7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new mmr0((jo70) obj, (xkk1) obj2);
            case 1:
                return (aqg) obj2;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return new cx0((byte) 7);
            case 5:
                u2m0 u2m0Var = (u2m0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), u2m0Var.a, u2m0Var.b.b, System.currentTimeMillis());
            case 6:
                return new dyg((jo70) obj, (k1r) obj2);
            case 7:
                return ((Boolean) obj2).booleanValue() ? fzg.a : ezg.a;
            case 8:
                return Float.valueOf(((ozg) obj2).b.s());
            case 9:
                o6h o6hVar = (o6h) obj;
                r6h r6hVar = (s6h) obj2;
                int i2 = o6hVar.a;
                if (r6hVar instanceof r6h) {
                    r6hVarL = r6h.l(r6hVar, i2, (wkt) null, 62);
                } else if (r6hVar instanceof p6h) {
                    r6hVarL = p6h.l((p6h) r6hVar, i2, (wkt) null, 62);
                } else {
                    if (!(r6hVar instanceof q6h)) {
                        eg.o();
                        return null;
                    }
                    r6hVarL = q6h.l((q6h) r6hVar, o6hVar.a, (wkt) null, (String) null, (String) null, (String) null, 0, (llw0) null, (ilw0) null, (List) null, 0, (ArrayList) null, (sxq0) null, (cuu0) null, 131070);
                }
                if (r6hVar instanceof q6h) {
                    q6h q6hVar = (q6h) r6hVar;
                    if (i2 != q6hVar.a) {
                        setX = a4p1.x(q6hVar, dxo1.w(i2));
                    }
                }
                return Next.i(r6hVarL, setX);
            case 10:
                q6h q6hVar2 = (s6h) obj2;
                if (q6hVar2 instanceof q6h) {
                    q6h q6hVar3 = q6hVar2;
                    return First.c(q6hVar2, a4p1.x(q6hVar3, dxo1.w(q6hVar3.a)));
                }
                if (q6hVar2 instanceof p6h) {
                    return First.b(new r6h(q6hVar2.h(), q6hVar2.g(), q6hVar2.b(), q6hVar2.a(), q6hVar2.j(), (wkt) null));
                }
                if (q6hVar2 instanceof r6h) {
                    return First.b(q6hVar2);
                }
                eg.o();
                return null;
            case 11:
                return new m6h(((Number) obj).intValue(), (w8d1) obj2);
            case 12:
                ((l3x) obj).c = (gt40) obj2;
                return rih1Var;
            case 13:
                ((l3x) obj).e = ((ml3) obj2).a;
                return rih1Var;
            case 14:
                ((l3x) obj).d = ((ol3) obj2).a;
                return rih1Var;
            case 15:
                String str = (String) obj;
                ft40 ft40Var = (ft40) obj2;
                if (str.length() == 0) {
                    return ft40Var.toString();
                }
                return str + ", " + ft40Var;
            case 16:
                String str2 = (String) obj;
                pyl pylVar = (pyl) obj2;
                if (str2.length() == 0) {
                    return pylVar.toString();
                }
                return str2 + ", " + pylVar;
            case 17:
                tfh tfhVar = (tfh) obj2;
                String str3 = ((qeh) obj).a;
                return !u890.j(str3, tfhVar.a) ? Next.i(tfh.a(tfhVar, str3, null, null, 6), Collections.singleton(new lfh(str3))) : Next.j();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                tfh tfhVar2 = (tfh) obj2;
                String str4 = ((qeh) obj).a;
                return (ihc1.y0(str4) || str4.equals(tfhVar2.a)) ? First.b(tfhVar2) : First.c(tfh.a(tfhVar2, str4, null, null, 6), f46.S0(new nfh[]{new lfh(str4), new mfh(str4)}));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (zfh) obj2;
            case 20:
                return new agh((k1r) obj, (xkk1) obj2);
            case 21:
                return new yjh((jo70) obj, (xkk1) obj2);
            case 22:
                tlh tlhVar = (tlh) obj;
                ulh ulhVar = (ulh) obj2;
                if (u890.j(tlhVar.a, ulhVar.a)) {
                    return Next.j();
                }
                ulh ulhVarA = h7p1.A(tlhVar, ulhVar.g + 1);
                if (tlhVar.c == null) {
                    setX = Collections.singleton(new ilh(ulhVarA.g, ulhVarA.a, (String) null));
                }
                return Next.i(ulhVarA, setX);
            case 23:
                tlh tlhVar2 = (tlh) obj;
                ulh ulhVarA2 = (ulh) obj2;
                if (!u890.j(tlhVar2.a, ulhVarA2.a)) {
                    ulhVarA2 = h7p1.A(tlhVar2, ulhVarA2.g + 1);
                }
                ulh ulhVar2 = ulhVarA2;
                int i3 = ulhVar2.e;
                if (i3 != 2 && i3 != 3) {
                    return First.b(ulhVar2);
                }
                int i4 = ulhVar2.g + 1;
                return First.c(ulh.a(ulhVar2, (c380) null, (String) null, 0, (Exception) null, i4, 63), Collections.singleton(new ilh(i4, ulhVar2.a, i3 != 2 ? ulhVar2.d : null)));
            case 24:
                return null;
            case 25:
                umh umhVar = (umh) obj;
                rph rphVar = (rph) obj2;
                return Next.h(rph.a(rphVar, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (ace0) null, (umhVar.c || (njb0Var = umhVar.b) == null) ? rphVar.g : njb0Var, (kmh) null, (String) null, false, (String) null, (cqs0) null, (LinkedHashSet) null, false, (cqs0) null, (Comment) null, (cqs0) null, (u380) null, false, 524223));
            case 26:
                return s8p1.q((rph) obj2);
            case 27:
                ((Number) obj).intValue();
                ekh ekhVar = (pkh) obj2;
                if (ekhVar instanceof ekh) {
                    return l1d.m("comment-", ekhVar.b.r());
                }
                if (ekhVar instanceof hkh) {
                    return l1d.m("reply-", ((hkh) ekhVar).b.o());
                }
                if (ekhVar instanceof ikh) {
                    return "preview-".concat(((ikh) ekhVar).b);
                }
                if (ekhVar instanceof okh) {
                    return "footer-".concat(((okh) ekhVar).b);
                }
                if (ekhVar instanceof gkh) {
                    return l1d.m("loading-footer-", ((gkh) ekhVar).b);
                }
                if (ekhVar instanceof jkh) {
                    return "sensitive-warning";
                }
                if (ekhVar instanceof kkh) {
                    Reply reply = (Reply) o7h.s0(((kkh) ekhVar).b);
                    String strO = reply != null ? reply.o() : null;
                    if (strO == null) {
                        strO = "";
                    }
                    return "sensitive-replies-warning-".concat(strO);
                }
                if (ekhVar instanceof lkh) {
                    return "showing-all-header";
                }
                if (ekhVar instanceof nkh) {
                    return "sensitive-replies-header-".concat(((nkh) ekhVar).c);
                }
                if (ekhVar instanceof mkh) {
                    return "sensitive-replies-footer-".concat(((mkh) ekhVar).b);
                }
                eg.o();
                return null;
            case 28:
                unh unhVar = (unh) obj;
                return new vnh(unhVar.a, unhVar.b, unhVar.c, unhVar.d, unhVar.e);
            default:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
        }
    }
}
