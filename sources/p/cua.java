package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import com.spotify.destination.SectionInfo;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.premiummarketing.premiumdestinationpage.v1.CTAClickEvent;
import com.spotify.premiummarketing.premiumdestinationpage.v1.FlavorPageViewModel;
import com.spotify.premiummarketing.premiumdestinationpage.v1.OfferCardBenefitItem;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PlanDetailViewModel;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumOfferCTA;
import com.spotify.premiummarketing.premiumdestinationpage.v1.PremiumOfferCard;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class cua implements Init, s0d, md41, av30, c290, ya, Predicate, rb {
    public final /* synthetic */ byte a;

    public /* synthetic */ cua(boolean z) {
        this.a = (byte) 29;
    }

    public static cn70 d(ak akVar, String str) {
        return new cn70(Collections.singletonList(new cz81(akVar, str)));
    }

    public static void e() {
        cn70 cn70Var = cn70.b;
    }

    public static boolean f(Map map) {
        return y7y0.z(map) && !y7y0.t("music-video-disabled", map) && y7y0.G(map);
    }

    public static cbo h(cwl cwlVar) {
        if (cwlVar instanceof gul) {
            return new sao(((gul) cwlVar).a);
        }
        if (cwlVar instanceof iul) {
            return new tao(((iul) cwlVar).a);
        }
        if (cwlVar instanceof kul) {
            return new uao(((kul) cwlVar).a);
        }
        if (cwlVar instanceof yul) {
            return new wao(((yul) cwlVar).a);
        }
        if (cwlVar instanceof nvl) {
            return new yao(((nvl) cwlVar).a);
        }
        if (cwlVar instanceof uvl) {
            return new zao(((uvl) cwlVar).a);
        }
        if (cwlVar instanceof wvl) {
            return new abo(((wvl) cwlVar).a);
        }
        if (cwlVar instanceof qul) {
            return new vao(((qul) cwlVar).a);
        }
        if (cwlVar instanceof zvl) {
            return new bbo(((zvl) cwlVar).a);
        }
        if (cwlVar instanceof avl) {
            return new xao(((avl) cwlVar).a);
        }
        return null;
    }

    public static String l(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public boolean accept(Object obj) {
        switch (this.a) {
            case 14:
                return false;
            default:
                Set set = s4b1.f;
                Intent intent = ((iw81) obj).a;
                return uic.x(intent != null ? intent.getDataString() : null).q() != null;
        }
    }

    public Object apply(Object obj) {
        y5g1 y5g1Var;
        switch (this.a) {
            case 10:
                return vb00.b.get(obj);
            default:
                String str = ((a5g1) obj).a.f;
                int iC = l1d.C(2);
                if (iC == 0) {
                    y5g1Var = y5g1.b;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    y5g1Var = y5g1.a;
                }
                return new mmr0(str, y5g1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(Context context, onm onmVar) throws Exception {
        vkx0 vkx0Var;
        g2z g2zVar;
        if (onmVar instanceof vkx0) {
            vkx0Var = (vkx0) onmVar;
            int i = vkx0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vkx0Var.d = i - Integer.MIN_VALUE;
            } else {
                vkx0Var = new vkx0(this, onmVar);
            }
        } else {
            vkx0Var = new vkx0(this, onmVar);
        }
        Object obj = vkx0Var.b;
        int i2 = vkx0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            g2z g2zVar2 = new g2z(context);
            vkx0Var.a = g2zVar2;
            vkx0Var.d = 1;
            Object objW = g2zVar2.w(vkx0Var);
            d9n d9nVar = d9n.a;
            if (objW == d9nVar) {
                return d9nVar;
            }
            g2zVar = g2zVar2;
            obj = objW;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g2zVar = vkx0Var.a;
            hm5.M(obj);
        }
        try {
            tj70 tj70Var = (vj70) obj;
            return new wkx0(g2zVar, tj70Var, tj70Var.s() ? Collections.singleton(ukx0.a) : w7x.a);
        } catch (Exception e) {
            g2zVar.z();
            throw e;
        }
    }

    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public Object convert(int i) {
        xpt xptVar;
        if (i == 0) {
            xptVar = xpt.b;
        } else if (i == 1) {
            xptVar = xpt.c;
        } else if (i == 2) {
            xptVar = xpt.d;
        } else if (i == 3) {
            xptVar = xpt.e;
        } else if (i != 4) {
            xptVar = i != 5 ? null : xpt.g;
        } else {
            xptVar = xpt.f;
        }
        return xptVar == null ? xpt.h : xptVar;
    }

    public First e0(Object obj) {
        return First.b((aua) obj);
    }

    public Object g(j2i0 j2i0Var) {
        Bitmap bitmap;
        Uri uri = j2i0Var.r;
        mre0 mre0Var = new mre0();
        mre0Var.i("android.media.metadata.MEDIA_ID", j2i0Var.a);
        mre0Var.i("android.media.metadata.TITLE", j2i0Var.b);
        mre0Var.i("android.media.metadata.ARTIST", j2i0Var.e);
        mre0Var.i("android.media.metadata.ALBUM", j2i0Var.d);
        mre0Var.i("android.media.metadata.ALBUM_ARTIST", j2i0Var.f);
        mre0Var.h(j2i0Var.i.a, "android.media.metadata.DURATION");
        mre0Var.i("android.media.metadata.ALBUM_ART_URI", j2i0Var.g.toString());
        mre0Var.i("com.spotify.music.extra.ART_HTTPS_URI", j2i0Var.q.toString());
        mre0Var.i("com.spotify.music.extra.EXTRA_EXTRACTED_COLOR_DARK_HIGH_CONTRAST_BACKGROUND_BASE", j2i0Var.o);
        mre0Var.h(j2i0Var.j ? 1L : 0L, "android.media.IS_EXPLICIT");
        mre0Var.h(j2i0Var.s ? 1L : 0L, "com.spotify.music.extra.IS_19_PLUS");
        mre0Var.h(j2i0Var.u ? 1L : 0L, "android.media.metadata.ADVERTISEMENT");
        mre0Var.i("com.spotify.music.extra.CONTEXT_SHARE_URL", j2i0Var.m);
        mre0Var.i("com.spotify.music.extra.CONTEXT_URI", j2i0Var.l);
        mre0Var.i("com.spotify.music.extra.CONTEXT_TITLE", j2i0Var.n);
        mre0Var.i("com.spotify.music.extra.CONTEXT_DESCRIPTION", j2i0Var.f36p);
        mre0Var.h(j2i0Var.k ? 1L : 0L, "android.media.extra.DOWNLOAD_STATUS");
        if (!u890.j(uri, Uri.EMPTY)) {
            mre0Var.i("com.spotify.music.extra.CANVAS_URI", uri.toString());
        }
        odn odnVar = j2i0Var.h;
        if (odnVar != null && (bitmap = odnVar.a.b) != null) {
            mre0Var.g("android.media.metadata.ALBUM_ART", bitmap);
        }
        return new MediaMetadataCompat((Bundle) mre0Var.b);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    public ktv0 i(String str, int i, PremiumOfferCard premiumOfferCard) {
        h290 h290VarO = premiumOfferCard.o();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarO, 10));
        Iterator it = h290VarO.iterator();
        while (true) {
            int i2 = 2;
            if (!it.hasNext()) {
                break;
            }
            OfferCardBenefitItem offerCardBenefitItem = (OfferCardBenefitItem) it.next();
            String strP = offerCardBenefitItem.p();
            String strN = offerCardBenefitItem.n();
            String strQ = offerCardBenefitItem.q();
            String strO = offerCardBenefitItem.o();
            if (strO == null) {
                i2 = 0;
            } else {
                int iHashCode = strO.hashCode();
                if (iHashCode != -1808450477) {
                    if (iHashCode == 0) {
                        strO.equals("");
                    } else if (iHashCode == 104264043 && strO.equals("muted")) {
                    }
                    i2 = 0;
                } else if (strO.equals("highlighted")) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
            }
            arrayList.add(new anp0(strP, strN, i2, strQ));
        }
        return new ktv0(premiumOfferCard.v() == bnp0.e ? 3 : 2, premiumOfferCard.n(), premiumOfferCard.B(), premiumOfferCard.y(), premiumOfferCard.w(), premiumOfferCard.x(), premiumOfferCard.s(), premiumOfferCard.t(), arrayList, premiumOfferCard.r(), premiumOfferCard.p(), premiumOfferCard.p(), premiumOfferCard.C() ? k(str, i, premiumOfferCard.z()) : null, premiumOfferCard.D() ? k(str, i, premiumOfferCard.A()) : null, t2b.j(str, i, premiumOfferCard.u()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public zf51 j(wsc0 wsc0Var, String str, q8c q8cVar) {
        boolean z;
        kby kbyVar = wsc0Var.f;
        String str2 = kbyVar.b;
        String str3 = kbyVar.a;
        Map map = kbyVar.q;
        SectionInfo sectionInfo = (SectionInfo) l6o1.B(map, "section_type", gi51.a);
        if (sectionInfo != null) {
            cj51 cj51VarN = sectionInfo.n();
            List list = wsc0Var.e;
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                List<zuc0> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (zuc0 zuc0Var : list2) {
                    String str4 = zuc0Var.c;
                    String str5 = (String) zuc0Var.g.get("target_uri");
                    if (str5 == null) {
                        str5 = zuc0Var.c;
                    }
                    arrayList.add(new ji90(str4, str5));
                }
                switch (cj51VarN.ordinal()) {
                    case 0:
                    case 7:
                        break;
                    case 1:
                        String str6 = kbyVar.a;
                        List<ll81> list3 = kbyVar.z;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = false;
                        } else {
                            for (ll81 ll81Var : list3) {
                                if (u890.j(ll81Var.a, "next-page") && ll81Var.b == 1) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new ff51(str, str6, str2, arrayList, z);
                    case 2:
                        return q8cVar == q8c.c ? new df51(str, str3, str2, arrayList) : new cf51(str, str3, str2, arrayList);
                    case 3:
                        String str7 = kbyVar.a;
                        String str8 = (String) map.get("decision_id");
                        if (str8 == null) {
                            str8 = "";
                        }
                        return new nf51(str, str7, str2, str8, arrayList);
                    case 4:
                        return new gf51(str, str3, str2, arrayList);
                    case 5:
                        ji90 ji90Var = (ji90) o7h.s0(arrayList);
                        if (ji90Var != null) {
                            return new jf51(str, ji90Var.a, str2, ji90Var.b);
                        }
                        break;
                    case 6:
                        ji90 ji90Var2 = (ji90) o7h.s0(arrayList);
                        if (ji90Var2 != null) {
                            return new kf51(str, str3, str2, ji90Var2.a);
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
            }
        }
        return null;
    }

    public htv0 k(String str, int i, PremiumOfferCTA premiumOfferCTA) {
        qp20 qp20Var;
        String title = premiumOfferCTA.getTitle();
        CTAClickEvent cTAClickEventN = premiumOfferCTA.n();
        doc docVar = new doc(cTAClickEventN.getName(), cTAClickEventN.getUri(), cTAClickEventN.n());
        boolean zR = premiumOfferCTA.r();
        if (premiumOfferCTA.s()) {
            FlavorPageViewModel flavorPageViewModelP = premiumOfferCTA.p();
            h290 h290VarS = flavorPageViewModelP.s();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarS, 10));
            int i2 = 0;
            for (Object obj : h290VarS) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                PlanDetailViewModel planDetailViewModel = (PlanDetailViewModel) obj;
                String strQ = planDetailViewModel.q();
                String strN = planDetailViewModel.n();
                String strR = planDetailViewModel.r();
                String strS = planDetailViewModel.s();
                if (ihc1.y0(strS)) {
                    strS = planDetailViewModel.o();
                }
                arrayList.add(new s7t0(i2, strQ, strN, strR, strS, planDetailViewModel.p()));
                i2 = i3;
            }
            qp20Var = new qp20(flavorPageViewModelP.getPlanName(), flavorPageViewModelP.n(), flavorPageViewModelP.t(), flavorPageViewModelP.q(), flavorPageViewModelP.r(), arrayList, flavorPageViewModelP.o());
        } else {
            qp20Var = null;
        }
        return new htv0(title, docVar, zR, qp20Var, t2b.j(str, i, premiumOfferCTA.q()));
    }

    public boolean test(Object obj) {
        return ((cxc0) obj).f.x.a(mm11.class) != null;
    }

    public /* synthetic */ cua(byte b) {
        this.a = b;
    }

    public cua(eoc eocVar, hfb hfbVar, t2b t2bVar) {
        this.a = (byte) 18;
    }

    public cua(int i) {
        this.a = (byte) 9;
    }

    public void unregister() {
    }
}
