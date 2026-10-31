package p;

import android.graphics.Color;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ido extends hab0 implements vu30 {
    public static final ido N0;
    public static final ido O0;
    public static final ido P0;
    public static final ido Q0;
    public static final ido R0;
    public static final ido S0;
    public static final ido T0;
    public static final ido U0;
    public static final ido V0;
    public static final ido W0;
    public static final ido X;
    public static final ido X0;
    public static final ido Y;
    public static final ido Y0;
    public static final ido Z;
    public static final ido Z0;
    public static final ido a1;
    public static final ido b;
    public static final ido b1;
    public static final ido c;
    public static final ido c1;
    public static final ido d;
    public static final ido d1;
    public static final ido e;
    public static final ido e1;
    public static final ido f;
    public static final ido g;
    public static final ido h;
    public static final ido i;
    public static final ido t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ido(i2, (byte) 0);
        c = new ido(i2, (byte) 1);
        d = new ido(i2, (byte) 2);
        e = new ido(i2, (byte) 3);
        f = new ido(i2, (byte) 4);
        g = new ido(i2, (byte) 5);
        h = new ido(i2, (byte) 6);
        i = new ido(i2, (byte) 7);
        t = new ido(i2, (byte) 8);
        X = new ido(i2, (byte) 9);
        Y = new ido(i2, (byte) 10);
        Z = new ido(i2, (byte) 11);
        N0 = new ido(i2, (byte) 12);
        O0 = new ido(i2, (byte) 13);
        P0 = new ido(i2, (byte) 14);
        Q0 = new ido(i2, (byte) 15);
        R0 = new ido(i2, (byte) 16);
        S0 = new ido(i2, (byte) 17);
        T0 = new ido(i2, (byte) 18);
        U0 = new ido(i2, (byte) 19);
        V0 = new ido(i2, (byte) 20);
        W0 = new ido(i2, (byte) 21);
        X0 = new ido(i2, (byte) 22);
        Y0 = new ido(i2, (byte) 23);
        Z0 = new ido(i2, (byte) 24);
        a1 = new ido(i2, (byte) 25);
        b1 = new ido(i2, (byte) 26);
        c1 = new ido(i2, (byte) 27);
        d1 = new ido(i2, (byte) 28);
        e1 = new ido(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ido(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        io70 io70Var;
        xn70 xn70Var;
        String strY;
        String strY2;
        String str;
        String str2;
        mq70 mq70Var;
        up70 up70VarA;
        byte b2 = this.a;
        j6u j6uVar = j6u.a;
        l6u l6uVar = l6u.a;
        c2v c2vVar = c2v.a;
        l131 l131Var = l131.c;
        l131 l131Var2 = l131.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (gdo) obj2;
            case 1:
                gfo gfoVar = (gfo) obj2;
                return new ifo(gfoVar.a, gfoVar.b, gfoVar.c, gfoVar.d, gfoVar.e);
            case 2:
                return null;
            case 3:
                uho uhoVar = (uho) obj;
                eho ehoVar = (eho) obj2;
                String str3 = uhoVar.a;
                String str4 = uhoVar.f;
                vnb1 vnb1Var = ehoVar.a;
                boolean z = vnb1Var.a;
                boolean z2 = vnb1Var.b;
                tho thoVar = uhoVar.c;
                nho nhoVar = uhoVar.d;
                String str5 = uhoVar.e;
                if (str5 == null) {
                    str5 = ehoVar.b;
                }
                return new vho(z2, str3, z, thoVar, nhoVar, str5, str4, !ehoVar.c);
            case 4:
                qjo qjoVar = (qjo) obj2;
                boolean z3 = qjoVar.b;
                if (z3 && qjoVar.c) {
                    return sjo.d;
                }
                if (z3) {
                    return sjo.c;
                }
                return qjoVar.a ? sjo.b : sjo.a;
            case 5:
                vnb1 vnb1Var2 = (vnb1) obj;
                String str6 = (String) obj2;
                boolean z4 = vnb1Var2 != null ? vnb1Var2.a : false;
                boolean z5 = vnb1Var2 != null ? vnb1Var2.b : false;
                if (str6 == null) {
                    str6 = "0";
                }
                return new qjo(z4, z5, yto.j(str6));
            case 6:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
            case 7:
                return ((upo) obj2).c();
            case 8:
                ouo ouoVar = (ouo) obj;
                return new puo(ouoVar, u890.j(((raw0) obj2).getIdentifier(), ouoVar.a));
            case 9:
                return ((kvo) obj).a;
            case 10:
                k1r k1rVar = (k1r) obj2;
                return new vwq((uho) obj, k1rVar instanceof i1r ? ((uwq) u890.k(k1rVar, (d0r) null, (n4r) null)).a : null);
            case 11:
                return (ayq) obj;
            case 12:
                return null;
            case 13:
                qfd qfdVar = (qfd) obj;
                l1z l1zVar = (l1z) obj2;
                if (qfdVar == null) {
                    return null;
                }
                boolean z6 = l1zVar != null ? l1zVar.e : false;
                int i2 = qfdVar.c;
                ArrayList arrayList = qfdVar.e;
                return (i2 == 3 || arrayList.contains(l131.a) || arrayList.contains(l131Var) || z6 || arrayList.contains(l131Var2) || arrayList.contains(l131.e)) ? l6uVar : j6uVar;
            case 14:
                h2v h2vVar = (h2v) obj;
                uwz0 uwz0Var = (uwz0) obj2;
                return (!u890.j(uwz0Var != null ? Boolean.valueOf(uwz0Var instanceof twz0) : null, Boolean.FALSE) || h2vVar == null || h2vVar.equals(c2vVar)) ? j6uVar : l6uVar;
            case 15:
                jo70 jo70Var = (jo70) obj;
                mtl mtlVar = (mtl) obj2;
                if ((mtlVar != null ? mtlVar.a : null) == ktl.b) {
                    if (jo70Var == null) {
                        return null;
                    }
                    xn70Var = new xn70(o7h.y0(jo70Var.d, (CharSequence) null, (String) null, (String) null, z3r.U0, 31), (String) null, 6, (String) null);
                } else {
                    if (jo70Var == null || (io70Var = jo70Var.e) == null) {
                        return null;
                    }
                    xn70Var = new xn70(io70Var.a, (String) null, 2, io70Var.b);
                }
                return xn70Var;
            case 16:
                h2v h2vVar2 = (h2v) obj;
                uwz0 uwz0Var2 = (uwz0) obj2;
                return Boolean.valueOf((!u890.j(uwz0Var2 != null ? Boolean.valueOf(uwz0Var2 instanceof twz0) : null, Boolean.FALSE) || h2vVar2 == null || h2vVar2.equals(c2vVar)) ? false : true);
            case 17:
                qfd qfdVar2 = (qfd) obj;
                l1z l1zVar2 = (l1z) obj2;
                o3r o3rVar = e4r.a;
                if ((qfdVar2 != null ? qfdVar2.c : 0) == 3) {
                    rh7 rh7Var = qfdVar2.d;
                    return new xry(rh7Var != null ? rh7Var.a : 0);
                }
                if (l1zVar2 != null && l1zVar2.e) {
                    return wry.a;
                }
                if (qfdVar2 == null || !qfdVar2.e.contains(l131Var2)) {
                    return (qfdVar2 == null || !qfdVar2.e.contains(l131Var)) ? yry.a : ury.a;
                }
                return vry.a;
            case 18:
                return new i5w0((qc0) obj2);
            case 19:
                return new hsf((vba0) obj2);
            case 20:
                ((Number) obj2).intValue();
                return rih1Var;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (x1l) obj2;
            case 22:
                return (g3l) obj2;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return (v3l) obj2;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                anl anlVar = (anl) obj;
                mmr0 mmr0Var = (mmr0) obj2;
                PlayerState playerState = (PlayerState) mmr0Var.a;
                pnl pnlVar = (pnl) mmr0Var.b;
                ah91 ah91Var = pnlVar.a;
                UUID uuid = pnlVar.b;
                int i3 = anlVar.a;
                int iD = -14145496;
                if (i3 != 2) {
                    try {
                        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                        if (contextTrack != null && !s3o1.v(contextTrack, false) && (strY = l4o1.y(contextTrack)) != null) {
                            iD = uah.d(uah.d(Color.parseColor(strY), -16777216, 0.5f), -16777216, 0.3f);
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                int i4 = iD;
                int color = -13421773;
                if (i3 != 2) {
                    try {
                        ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
                        if (contextTrack2 != null && !s3o1.v(contextTrack2, false) && (strY2 = l4o1.y(contextTrack2)) != null) {
                            color = Color.parseColor(strY2);
                        }
                        break;
                    } catch (Exception unused2) {
                    }
                }
                return new bnl(ah91Var, i4, color, pnlVar.c, anlVar.a, anlVar.b, uuid);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                jo70 jo70Var2 = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                String str7 = jo70Var2.a;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null || ihc1.y0(str)) {
                    str = null;
                }
                io70 io70Var2 = jo70Var2.e;
                if (io70Var2 == null || (str2 = io70Var2.a) == null) {
                    ho70 ho70Var = (ho70) o7h.s0(jo70Var2.d);
                    str2 = ho70Var != null ? ho70Var.a : null;
                }
                vnb1 vnb1Var3 = jo70Var2.b;
                return new r0v(str7, str, str2, ihc1.y0(vnb1Var3) ? null : vnb1Var3);
            case 26:
                ((Number) obj).intValue();
                ((Number) obj2).intValue();
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-1626756078);
                fwx fwxVarG = hso1.G(mrx.c, 0L, 0L, x340Var, mrx.d, 30);
                x340Var.r(false);
                return fwxVarG;
            case 28:
                return new gc20((List) obj2);
            default:
                return new tk20(((rk20) obj).a, (sk20) obj2);
        }
    }
}
