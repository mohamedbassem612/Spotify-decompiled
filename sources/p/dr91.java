package p;

import android.os.Bundle;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dr91 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr91(kt91 kt91Var, g0i g0iVar) {
        super(1);
        this.a = (byte) 2;
        this.b = g0iVar;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        yt91 yt91Var;
        byte b = this.a;
        byte b2 = 0;
        ArrayList arrayListN = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((o3m0) obj).a(((vt91) obj2).b);
            case 1:
                ((gaa0) obj2).d((CancellationException) null);
                return rih1Var;
            case 2:
                return kt91.f((g0i) obj2, ((Number) obj).intValue());
            case 3:
                dhl dhlVar = (dhl) obj;
                ihl ihlVar = dhlVar.c;
                if (((unb0) obj2) == unb0.b) {
                    yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                }
                yf.p(dhlVar.e, ihlVar.e, 0.0f, 6);
                dhl.d(dhlVar, ihlVar.d, ihlVar.f, 124);
                hrt.m((p3v) null, "spread", dhlVar, (p3v) null, "wrap");
                return rih1Var;
            case 4:
                zw91 zw91Var = ((vw91) obj2).c;
                return new tw91(zw91Var.a, zw91Var.b, zw91Var.c);
            case 5:
                return ((x0a1) obj2).a(obj);
            case 6:
                i4a1 i4a1Var = (i4a1) obj;
                h3a1 h3a1Var = (h3a1) obj2;
                if (h3a1Var instanceof f3a1) {
                    return Next.i(i4a1Var, Effects.a(new n2a1[]{new n2a1(new c2a1(((f3a1) h3a1Var).a))}));
                }
                if (!(h3a1Var instanceof g3a1)) {
                    eg.o();
                    return null;
                }
                i4a1 i4a1VarG0 = rtw0.g0(i4a1Var, ((g3a1) h3a1Var).a, rqb1.b);
                HashSet hashSetA = Effects.a(new q2a1[0]);
                String str3 = i4a1VarG0.c;
                if (str3 != null && (str = i4a1VarG0.k) != null) {
                    hashSetA.add(new n2a1(new i2a1(str3, str)));
                }
                return Next.i(i4a1VarG0, hashSetA);
            case 7:
                i4a1 i4a1Var2 = (i4a1) obj;
                r3a1 r3a1Var = (r3a1) obj2;
                if (r3a1Var instanceof p3a1) {
                    fon fonVar = ((p3a1) r3a1Var).a;
                    return ((fonVar instanceof fon) && fonVar.a == 404) ? Next.i(i4a1Var2.a(), Effects.a(new n2a1[]{new n2a1(new f2a1(fonVar))})) : Next.i(i4a1Var2, Effects.a(new n2a1[]{new n2a1(new f2a1(fonVar))}));
                }
                if (!(r3a1Var instanceof q3a1)) {
                    eg.o();
                    return null;
                }
                i4a1 i4a1VarG1 = rtw0.g0(i4a1Var2, ((q3a1) r3a1Var).a, rqb1.a);
                HashSet hashSetA2 = Effects.a(new q2a1[0]);
                String str4 = i4a1VarG1.c;
                if (str4 != null && (str2 = i4a1VarG1.k) != null) {
                    hashSetA2.add(new n2a1(new l2a1(str4, str2)));
                }
                return Next.i(i4a1VarG1, hashSetA2);
            case 8:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, ((atb1) obj2).f);
                b261.x(e261Var, 0);
                return rih1Var;
            case 9:
                w6a1 w6a1Var = (w6a1) obj2;
                return d3p1.H(w6a1Var.a, w6a1Var.f, (u6a1) obj);
            case 10:
                ((i6c) obj2).a.a("spotify:internal:songdna:about", (tv80) obj, (Bundle) null);
                return rih1Var;
            case 11:
                return new m441(new ciw0((h7a1) obj, (j7a1) obj2, (lnm) null, (byte) 23));
            case 12:
                ((qtr) obj).b(new q7a1((s7a1) obj2, arrayListN, b2));
                return rih1Var;
            case 13:
                ((qtr) obj).b(new pnp0((s8a1) obj2, (lnm) null, (byte) 28));
                return rih1Var;
            case 14:
                hw2 hw2Var = (hw2) obj2;
                return d3p1.F(hw2Var.b, hw2Var.c, (r9a1) obj);
            case 15:
                jd6 jd6Var = (jd6) obj2;
                return d3p1.H((d0r) jd6Var.b, jd6Var.c, (oaa1) obj);
            case 16:
                if (((wz20) obj).b() && (yt91Var = (yt91) obj2) != null) {
                    hrr0 hrr0Var = (hrr0) yt91Var.d;
                    if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                        hrr0Var.setValue(Boolean.TRUE);
                        ((nda1) yt91Var.b).invoke();
                    }
                }
                return rih1Var;
            case 17:
                u7n0.D((rtb0) obj, (zba1) obj2, "song_dna_search_tab_item");
                return rih1Var;
            case 18:
                ((Number) obj).intValue();
                return ((b1m0) obj2).b();
            case 19:
                ((Number) obj).intValue();
                return ((e1m0) obj2).b();
            case 20:
                cas casVar = (a7m0) obj;
                casVar.a = h9a1.T0;
                casVar.b = new c0c((ug3) obj2, (byte) 5);
                casVar.a(hea1.i, hea1.t);
                casVar.d = gr81.U0;
                return rih1Var;
            case 21:
                return new rxc0(((pha1) obj2).a);
            case 22:
                dsm1 dsm1VarA = ((e960) obj2).a((esm1) obj);
                return new iia1(dsm1VarA.a, dsm1VarA.b);
            case 23:
                d261 d261Var = xia1.b;
                mma0 mma0Var = xia1.a[0];
                d261Var.getClass();
                ((e261) obj).b(d261Var, (hux) obj2);
                return rih1Var;
            case 24:
                rwq0.z((qtr) obj, new fsa1((bs0) obj2, (byte) 0));
                return rih1Var;
            case 25:
                yta1 yta1Var = (yta1) obj2;
                return new hp0(yta1Var.b.c(new d061(1, yta1Var, yta1.class, "onDismissed", "onDismissed$src_main_java_com_spotify_musicplaybackspeed_speedcontrolmessaging_speedcontrolmessaging(Lcom/spotify/tome/pagecapabilities/properties/BottomSheetProperties$BehaviorManager$DismissedReason;)V", 0, (byte) 23)), (byte) 17);
            case 26:
                return new rxc0(((zwa1) obj2).a);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((i5w) ((p2t) obj2).d).invoke((ki0) obj);
                return rih1Var;
            case 28:
                s2j0 s2j0Var = (s2j0) obj;
                t2j0 t2j0Var = ((SpotifyMainActivity) obj2).A1;
                if (t2j0Var != null) {
                    t2j0Var.a(s2j0Var);
                    return rih1Var;
                }
                u890.C("messageLiteEventPublisher");
                throw null;
            default:
                List list = (List) obj;
                try {
                    gih0 gih0Var = (gih0) obj2;
                    if (list != null) {
                        int i = SpotifyMediaBrowserService.N0;
                        arrayListN = kqn1.n(list);
                    }
                    gih0Var.d(arrayListN);
                    break;
                } catch (IllegalStateException e) {
                    n57.t("Failed to send load children results", e);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr91(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
