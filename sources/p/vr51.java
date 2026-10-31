package p;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import com.spotify.mobius.functions.Consumer;
import com.spotify.pam.showvalue.BenefitsHeaderSection;
import com.spotify.pam.showvalue.CarouselSection;
import com.spotify.pam.showvalue.CenteredButtonSection;
import com.spotify.pam.showvalue.ListeningStatsSection;
import com.spotify.pam.showvalue.Member;
import com.spotify.pam.showvalue.Section;
import com.spotify.pam.showvalue.Shortcut;
import com.spotify.pam.showvalue.ShortcutsSection;
import com.spotify.pam.showvalue.SongDNACard;
import com.spotify.pam.showvalue.SongDNAContributor;
import com.spotify.pam.showvalue.SongDNASection;
import com.spotify.pam.showvalue.StatsCard;
import com.spotify.pam.showvalue.SubscriptionCardProto;
import com.spotify.pam.showvalue.VideoCard;
import com.spotify.pam.showvalue.VideoCarouselSection;
import com.spotify.pam.showvalue.WatchFeedCard;
import com.spotify.pam.showvalue.WatchFeedSection;
import com.spotify.pam.showvalue.YourPremiumRequest;
import com.spotify.pam.showvalue.YourPremiumResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import com.spotify.tap.playback.TapNothingToPlayException;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vr51 implements Function, BiFunction, tmn0, hj71, cy81, xi7, l3c, qiw {
    public final /* synthetic */ byte a;
    public final Object b;

    public vr51() {
        this.a = (byte) 25;
        this.b = new SparseArray();
    }

    public File a() {
        return (File) ((u9c) this.b).e;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0114  */
    /* JADX WARN: Code duplicated, block: B:90:0x0138  */
    public Object apply(Object obj, Object obj2) {
        zsq0 xsq0Var;
        boolean z;
        boolean zContains;
        xkk1 xkk1Var;
        va81 va81VarA;
        String str;
        String strA;
        va81 va81VarA2;
        g881 g881Var;
        String str2;
        int i;
        int i2;
        int i3;
        zc8 zc8Var;
        Long lValueOf;
        v481 v481Var;
        zoy0 zoy0VarA;
        int i4;
        String str3;
        List list;
        ho70 ho70Var;
        mq70 mq70Var;
        up70 up70VarA;
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                return ((ey51) obj3).a.equals((String) obj2) ? new jy51((int) ((Long) obj).longValue()) : new jy51(0);
            default:
                Object obj4 = ((e331) obj).a;
                Boolean bool = (Boolean) obj2;
                r961 r961Var = (r961) obj3;
                Throwable thA = e331.a(obj4);
                if (thA == null) {
                    x481 x481Var = (x481) obj4;
                    String str4 = (String) r961Var.c;
                    boolean zBooleanValue = bool.booleanValue();
                    hll hllVar = x481Var.f;
                    jo70 jo70Var = x481Var.c;
                    if (hllVar != null) {
                        zContains = hllVar.b.contains(ell.b);
                    } else {
                        va81 va81VarA3 = x481Var.a();
                        if (va81VarA3 != null) {
                            zContains = va81VarA3.h;
                        } else {
                            z = false;
                        }
                        xkk1Var = x481Var.j;
                        if (xkk1Var != null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null || (strA = up70VarA.a.a) == null) {
                            va81VarA = x481Var.a();
                            if (va81VarA != null) {
                                strA = va81VarA.g.a(zdn.c);
                                str = strA;
                            } else {
                                str = null;
                            }
                        } else {
                            if (strA.length() <= 0) {
                                strA = null;
                            }
                            if (strA != null) {
                                str = strA;
                            } else {
                                va81VarA = x481Var.a();
                                if (va81VarA != null) {
                                    strA = va81VarA.g.a(zdn.c);
                                    str = strA;
                                } else {
                                    str = null;
                                }
                            }
                        }
                        if (jo70Var != null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) {
                            va81VarA2 = x481Var.a();
                            if (va81VarA2 != null) {
                                g881Var = new g881(va81VarA2.c, (String) null);
                            } else {
                                g881Var = new g881("", (String) null);
                            }
                        } else {
                            String str5 = ho70Var.a;
                            String str6 = ho70Var.b;
                            if (str6.length() <= 0) {
                                str6 = null;
                            }
                            g881Var = new g881(str5, str6);
                        }
                        g881 g881Var2 = g881Var;
                        if (jo70Var != null || (str3 = jo70Var.a) == null) {
                            va81 va81VarA4 = x481Var.a();
                            str2 = va81VarA4 != null ? va81VarA4.b : "";
                        } else {
                            str2 = str3;
                        }
                        va81 va81VarA5 = x481Var.a();
                        i = va81VarA5 != null ? va81VarA5.m : 0;
                        if (i == 0) {
                            i2 = -1;
                        } else {
                            i2 = j881.a[l1d.C(i)];
                        }
                        if (i2 == -1) {
                            i3 = 1;
                        } else if (i2 != 1) {
                            i4 = 2;
                            if (i2 != 2) {
                                i4 = 4;
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        eg.o();
                                        return null;
                                    }
                                    i3 = 1;
                                }
                            }
                            i3 = i4;
                        } else {
                            i3 = 3;
                        }
                        zc8Var = x481Var.g;
                        if (zc8Var != null) {
                            lValueOf = Long.valueOf(zc8Var.f);
                        } else {
                            lValueOf = null;
                        }
                        r9v0 r9v0Var = x481Var.i;
                        zc8 zc8Var2 = x481Var.g;
                        w281 w281Var = x481Var.h;
                        iam iamVar = x481Var.a;
                        xkk1 xkk1Var2 = x481Var.j;
                        v481Var = x481Var.b;
                        if (v481Var instanceof v481) {
                            zoy0VarA = v481Var.a();
                        } else {
                            if (v481Var instanceof s481) {
                                eg.o();
                                return null;
                            }
                            zoy0VarA = ((s481) v481Var).a;
                        }
                        xsq0Var = new zsq0(new h881(str4, str, g881Var2, str2, zBooleanValue, (String) null, i3, lValueOf, z, r9v0Var, zc8Var2, w281Var, iamVar, xkk1Var2, zoy0VarA, x481Var.f, x481Var.k, x481Var.c));
                    }
                    z = zContains;
                    xkk1Var = x481Var.j;
                    if (xkk1Var != null) {
                        va81VarA = x481Var.a();
                        if (va81VarA != null) {
                            strA = va81VarA.g.a(zdn.c);
                            str = strA;
                        } else {
                            str = null;
                        }
                    } else {
                        va81VarA = x481Var.a();
                        if (va81VarA != null) {
                            strA = va81VarA.g.a(zdn.c);
                            str = strA;
                        } else {
                            str = null;
                        }
                    }
                    if (jo70Var != null) {
                        va81VarA2 = x481Var.a();
                        if (va81VarA2 != null) {
                            g881Var = new g881(va81VarA2.c, (String) null);
                        } else {
                            g881Var = new g881("", (String) null);
                        }
                    } else {
                        va81VarA2 = x481Var.a();
                        if (va81VarA2 != null) {
                            g881Var = new g881(va81VarA2.c, (String) null);
                        } else {
                            g881Var = new g881("", (String) null);
                        }
                    }
                    g881 g881Var3 = g881Var;
                    if (jo70Var != null) {
                        va81 va81VarA6 = x481Var.a();
                        str2 = va81VarA6 != null ? va81VarA6.b : "";
                    } else {
                        va81 va81VarA7 = x481Var.a();
                        str2 = va81VarA7 != null ? va81VarA7.b : "";
                    }
                    va81 va81VarA8 = x481Var.a();
                    if (va81VarA8 != null) {
                    }
                    if (i == 0) {
                        i2 = -1;
                    } else {
                        i2 = j881.a[l1d.C(i)];
                    }
                    if (i2 == -1) {
                        i3 = 1;
                    } else if (i2 != 1) {
                        i4 = 2;
                        if (i2 != 2) {
                            i4 = 4;
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    eg.o();
                                    return null;
                                }
                                i3 = 1;
                            }
                        }
                        i3 = i4;
                    } else {
                        i3 = 3;
                    }
                    zc8Var = x481Var.g;
                    if (zc8Var != null) {
                        lValueOf = Long.valueOf(zc8Var.f);
                    } else {
                        lValueOf = null;
                    }
                    r9v0 r9v0Var2 = x481Var.i;
                    zc8 zc8Var3 = x481Var.g;
                    w281 w281Var2 = x481Var.h;
                    iam iamVar2 = x481Var.a;
                    xkk1 xkk1Var3 = x481Var.j;
                    v481Var = x481Var.b;
                    if (v481Var instanceof v481) {
                        zoy0VarA = v481Var.a();
                    } else {
                        if (v481Var instanceof s481) {
                            eg.o();
                            return null;
                        }
                        zoy0VarA = ((s481) v481Var).a;
                    }
                    xsq0Var = new zsq0(new h881(str4, str, g881Var3, str2, zBooleanValue, (String) null, i3, lValueOf, z, r9v0Var2, zc8Var3, w281Var2, iamVar2, xkk1Var3, zoy0VarA, x481Var.f, x481Var.k, x481Var.c));
                } else {
                    xsq0Var = new xsq0(thA);
                }
                return xsq0Var;
        }
    }

    public void b(JSONObject jSONObject, r3c r3cVar) {
        ((wh91) this.b).invoke(jSONObject, r3cVar);
    }

    public void c() {
        nt21 nt21Var = (nt21) this.b;
        ((un41) nt21Var.b).b = true;
        vn41 vn41Var = (vn41) nt21Var.c;
        Object obj = vn41Var.b;
        un41 un41Var = (un41) nt21Var.b;
        synchronized (obj) {
            vn41Var.d.remove(un41Var);
        }
    }

    public xhn d() {
        nt21 nt21Var = (nt21) ((u9c) this.b).a;
        if (nt21Var != null) {
            return (xhn) nt21Var.c;
        }
        return null;
    }

    public File e() {
        return (File) ((nt21) ((u9c) this.b).a).b;
    }

    public String f(long j) {
        long j2 = j / 1000;
        return ((ggv) this.b).a(j2, j2 / 3600 >= 1 ? new fgv(4, 2) : new fgv(2, 2));
    }

    public Single g() {
        return ((oi) this.b).I().map(wdx0.R0);
    }

    public File h() {
        return (File) ((u9c) this.b).b;
    }

    public File i() {
        return (File) ((u9c) this.b).d;
    }

    public File j() {
        return (File) ((u9c) this.b).f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object k(onm onmVar) {
        gb81 gb81Var;
        zb81 wb81Var;
        boolean z;
        boolean z2;
        db81 db81Var;
        db81 bb81Var;
        if (onmVar instanceof gb81) {
            gb81Var = (gb81) onmVar;
            int i = gb81Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb81Var.c = i - Integer.MIN_VALUE;
            } else {
                gb81Var = new gb81(this, onmVar);
            }
        } else {
            gb81Var = new gb81(this, onmVar);
        }
        Object objM = gb81Var.a;
        int i2 = gb81Var.c;
        zb81 zb81Var = null;
        boolean z3 = true;
        if (i2 == 0) {
            hm5.M(objM);
            enr0 enr0Var = (enr0) this.b;
            gb81Var.c = 1;
            objM = enr0.m(enr0Var, (YourPremiumRequest) null, gb81Var, 1, (Object) null);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        YourPremiumResponse yourPremiumResponse = (YourPremiumResponse) objM;
        String strO = yourPremiumResponse.o();
        String strN = yourPremiumResponse.n();
        h290 h290VarP = yourPremiumResponse.p();
        ArrayList arrayList = new ArrayList();
        Iterator it = h290VarP.iterator();
        while (it.hasNext()) {
            Section section = (Section) it.next();
            section.getClass();
            String strS = section.s();
            int iQ = section.q();
            int i3 = 10;
            switch (iQ == 0 ? -1 : ob81.a[l1d.C(iQ)]) {
                case 1:
                    it = it;
                    boolean z4 = z3;
                    SubscriptionCardProto subscriptionCardProtoV = section.v();
                    strS.getClass();
                    String planName = subscriptionCardProtoV.getPlanName();
                    String strT = subscriptionCardProtoV.t();
                    String strR = subscriptionCardProtoV.r();
                    String strS2 = subscriptionCardProtoV.s();
                    h290<Member> h290VarQ = subscriptionCardProtoV.q();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarQ, 10));
                    for (Member member : h290VarQ) {
                        arrayList2.add(new lb81(member.getName(), member.n()));
                    }
                    z = z4;
                    wb81Var = new wb81(strS, planName, strT, strR, strS2, arrayList2, subscriptionCardProtoV.u() ? subscriptionCardProtoV.p() : null, subscriptionCardProtoV.o());
                    break;
                case 2:
                    z2 = z3;
                    ShortcutsSection shortcutsSectionT = section.t();
                    strS.getClass();
                    h290<Shortcut> h290VarO = shortcutsSectionT.o();
                    ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                    for (Shortcut shortcut : h290VarO) {
                        arrayList3.add(new ac81(shortcut.n(), shortcut.getTitle(), shortcut.getUri()));
                    }
                    wb81Var = new ub81(strS, arrayList3);
                    z = z2;
                    break;
                case 3:
                    CarouselSection carouselSectionO = section.o();
                    strS.getClass();
                    String strQ = carouselSectionO.q();
                    String strP = carouselSectionO.u() ? carouselSectionO.p() : null;
                    h290 urisList = carouselSectionO.getUrisList();
                    eb81 eb81VarA = carouselSectionO.v() ? pb81.a(carouselSectionO.r()) : null;
                    eb81 eb81VarA2 = carouselSectionO.w() ? pb81.a(carouselSectionO.s()) : null;
                    if (carouselSectionO.t()) {
                        CarouselSection.Action actionN = carouselSectionO.n();
                        int i4 = ob81.b[actionN.p().ordinal()];
                        z2 = true;
                        if (i4 == 1) {
                            bb81Var = ab81.a;
                        } else if (i4 == 2) {
                            bb81Var = cb81.a;
                        } else if (i4 != 3) {
                            bb81Var = i4 != 4 ? null : za81.a;
                        } else {
                            bb81Var = new bb81(actionN.o());
                        }
                        db81Var = bb81Var;
                    } else {
                        z2 = true;
                        db81Var = null;
                    }
                    wb81Var = new rb81(strS, strQ, strP, urisList, eb81VarA, eb81VarA2, db81Var);
                    z = z2;
                    break;
                case 4:
                    it = it;
                    VideoCarouselSection videoCarouselSectionW = section.w();
                    strS.getClass();
                    String strQ2 = videoCarouselSectionW.q();
                    String strP2 = videoCarouselSectionW.s() ? videoCarouselSectionW.p() : null;
                    h290<VideoCard> h290VarN = videoCarouselSectionW.n();
                    ArrayList arrayList4 = new ArrayList(q7h.U(h290VarN, 10));
                    for (VideoCard videoCard : h290VarN) {
                        arrayList4.add(new ec81(videoCard.getEntityUri(), videoCard.n()));
                    }
                    wb81Var = new xb81(strS, strQ2, strP2, arrayList4, videoCarouselSectionW.t() ? pb81.a(videoCarouselSectionW.r()) : null);
                    z = true;
                    break;
                case 5:
                    it = it;
                    BenefitsHeaderSection benefitsHeaderSectionN = section.n();
                    strS.getClass();
                    wb81Var = new qb81(strS, benefitsHeaderSectionN.p(), benefitsHeaderSectionN.getTitle(), benefitsHeaderSectionN.q() ? pb81.a(benefitsHeaderSectionN.o()) : null);
                    z = true;
                    break;
                case 6:
                    it = it;
                    ListeningStatsSection listeningStatsSectionR = section.r();
                    strS.getClass();
                    String strQ3 = listeningStatsSectionR.q();
                    String strP3 = listeningStatsSectionR.p();
                    h290<StatsCard> h290VarN2 = listeningStatsSectionR.n();
                    ArrayList arrayList5 = new ArrayList(q7h.U(h290VarN2, 10));
                    for (StatsCard statsCard : h290VarN2) {
                        String strN2 = statsCard.n();
                        String strO2 = statsCard.o();
                        String entityUri = statsCard.getEntityUri();
                        int iP = statsCard.p();
                        int iOrdinal = statsCard.q().ordinal();
                        arrayList5.add(new dc81(iP, iOrdinal != 1 ? iOrdinal != 2 ? 1 : 3 : 2, strN2, strO2, entityUri));
                    }
                    wb81Var = new tb81(strS, strQ3, strP3, arrayList5);
                    z = true;
                    break;
                case 7:
                    it = it;
                    WatchFeedSection watchFeedSectionX = section.x();
                    strS.getClass();
                    String strQ4 = watchFeedSectionX.q();
                    String strP4 = watchFeedSectionX.s() ? watchFeedSectionX.p() : null;
                    h290<WatchFeedCard> h290VarN3 = watchFeedSectionX.n();
                    ArrayList arrayList6 = new ArrayList(q7h.U(h290VarN3, 10));
                    for (WatchFeedCard watchFeedCard : h290VarN3) {
                        arrayList6.add(new fc81(watchFeedCard.getUri(), watchFeedCard.o(), watchFeedCard.q(), watchFeedCard.getTitle(), watchFeedCard.getSubtitle(), watchFeedCard.t() ? watchFeedCard.r() : null, watchFeedCard.p(), watchFeedCard.s() ? watchFeedCard.n() : null));
                    }
                    wb81Var = new yb81(strS, strQ4, strP4, arrayList6, watchFeedSectionX.t() ? pb81.a(watchFeedSectionX.r()) : null);
                    z = true;
                    break;
                case 8:
                    SongDNASection songDNASectionU = section.u();
                    strS.getClass();
                    String strQ5 = songDNASectionU.q();
                    zb81 zb81VarP = songDNASectionU.r() ? songDNASectionU.p() : zb81Var;
                    h290 h290VarN4 = songDNASectionU.n();
                    ArrayList arrayList7 = new ArrayList(q7h.U(h290VarN4, 10));
                    Iterator it2 = h290VarN4.iterator();
                    while (it2.hasNext()) {
                        SongDNACard songDNACard = (SongDNACard) it2.next();
                        String strT2 = songDNACard.t();
                        zb81 zb81VarS = songDNACard.v() ? songDNACard.s() : zb81Var;
                        String strU = songDNACard.u();
                        h290 h290VarO2 = songDNACard.o();
                        ArrayList arrayList8 = new ArrayList(q7h.U(h290VarO2, i3));
                        Iterator it3 = h290VarO2.iterator();
                        while (it3.hasNext()) {
                            SongDNAContributor songDNAContributor = (SongDNAContributor) it3.next();
                            arrayList8.add(new cc81(songDNAContributor.getName(), songDNAContributor.getSubtitle(), songDNAContributor.getEntityUri(), songDNAContributor.n()));
                            it3 = it3;
                            it = it;
                            it2 = it2;
                        }
                        arrayList7.add(new bc81(strT2, zb81VarS, strU, arrayList8, songDNACard.q(), songDNACard.r(), songDNACard.p(), songDNACard.n()));
                        zb81Var = null;
                        i3 = 10;
                    }
                    it = it;
                    wb81Var = new vb81(strS, strQ5, zb81VarP, arrayList7);
                    z = true;
                    break;
                case 9:
                    CenteredButtonSection centeredButtonSectionP = section.p();
                    strS.getClass();
                    wb81Var = new sb81(strS, centeredButtonSectionP.o(), centeredButtonSectionP.getUri());
                    z = z3;
                    break;
                default:
                    wb81Var = zb81Var;
                    z = z3;
                    break;
            }
            if (wb81Var != null) {
                arrayList.add(wb81Var);
            }
            z3 = z;
            it = it;
            zb81Var = null;
        }
        return new nb81(strO, strN, arrayList);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((v5a1) this.b).b(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, String str2, f8d f8dVar, boolean z, onm onmVar) {
        y261 y261Var;
        if (onmVar instanceof y261) {
            y261Var = (y261) onmVar;
            int i = y261Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y261Var.c = i - Integer.MIN_VALUE;
            } else {
                y261Var = new y261(this, onmVar);
            }
        } else {
            y261Var = new y261(this, onmVar);
        }
        Object objG = y261Var.a;
        int i2 = y261Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                bfd bfdVar = (bfd) this.b;
                g8d g8dVar = new g8d(str, str2, f8dVar, z);
                y261Var.c = 1;
                objG = bfdVar.G(g8dVar, y261Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objG);
            }
            return (goe) objG;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(k371 k371Var, lnm lnmVar) {
        vd71 vd71Var;
        if (lnmVar instanceof vd71) {
            vd71Var = (vd71) lnmVar;
            int i = vd71Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd71Var.c = i - Integer.MIN_VALUE;
            } else {
                vd71Var = new vd71(this, (onm) lnmVar);
            }
        } else {
            vd71Var = new vd71(this, (onm) lnmVar);
        }
        Object objInvoke = vd71Var.a;
        int i2 = vd71Var.c;
        if (i2 == 0) {
            hm5.M(objInvoke);
            wa71 wa71Var = k371Var.a;
            if (wa71Var == null) {
                return null;
            }
            nsm0 nsm0Var = (nsm0) this.b;
            vd71Var.c = 1;
            objInvoke = nsm0Var.invoke(wa71Var, vd71Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objInvoke);
        }
        b871 b871Var = (b871) objInvoke;
        return new qj71(b871Var.a, b871Var.b, puk.d);
    }

    public void o(zx61 zx61Var, tv80 tv80Var) {
        xh71.b((xh71) this.b, new wa71(zx61Var.d, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, mno1.h(new mmr0[]{new mmr0("transcript.share.asset_content", zx61Var)}), 62), (Bundle) null, new vm71("transcriptsharing"), tv80Var, (List) null, 18);
    }

    public File p() {
        return (File) ((u9c) this.b).c;
    }

    public void v(Object obj) {
        Drawable drawableC;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 21:
                ((Consumer) obj2).accept((d7c1) obj);
                break;
            case 22:
                ((c4c1) ((he7) obj2).d).a(((Boolean) obj).booleanValue() ? b5c1.a : c5c1.a);
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                j5g1 j5g1Var = (j5g1) obj2;
                String str = (String) mmr0Var.a;
                y5g1 y5g1Var = (y5g1) mmr0Var.b;
                ImageView imageView = j5g1Var.i;
                gw70 gw70Var = j5g1Var.d;
                Context context = j5g1Var.g;
                int iOrdinal = y5g1Var.ordinal();
                if (iOrdinal == 0) {
                    drawableC = qz70.c(context, 2131232442, 4, 16);
                } else if (iOrdinal == 1) {
                    drawableC = qz70.c(context, 2131231469, 0, 20);
                }
                gw70Var.d(imageView);
                ixg ixgVarF = gw70Var.f(str);
                ixgVarF.m(drawableC);
                ixgVarF.f(drawableC);
                int i = j5g1Var.h;
                ixgVarF.p(i, i, 1);
                ixgVarF.d();
                ixgVarF.r(String.valueOf(rc11.a.b(j5g1.class).r()));
                q5g1 q5g1Var = j5g1Var.O0;
                s5g1 s5g1Var = (s5g1) imageView.getTag(2131430335);
                if (s5g1Var == null) {
                    s5g1Var = new s5g1(imageView, q5g1Var);
                    imageView.setTag(2131430335, s5g1Var);
                } else {
                    s5g1Var.b = q5g1Var;
                }
                j5g1Var.P0 = s5g1Var;
                ixgVarF.j(s5g1Var);
                break;
        }
    }

    public void z() {
        ty81 ty81Var = (ty81) this.b;
        View view = ty81Var.o;
        if (view == null) {
            u890.C("titleView");
            throw null;
        }
        View view2 = ty81Var.p;
        if (view2 == null) {
            u890.C("subtitleView");
            throw null;
        }
        View view3 = ty81Var.q;
        if (view3 == null) {
            u890.C("trackTitleView");
            throw null;
        }
        ImageView imageView = ty81Var.r;
        if (imageView == null) {
            u890.C("imageView");
            throw null;
        }
        for (View view4 : p7h.M(new View[]{view, view2, view3, imageView})) {
            view4.setVisibility(0);
            view4.setAlpha(ty81Var.m ? 0.0f : 1.0f);
        }
    }

    public /* synthetic */ vr51(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pze0.m(obj);
                return new CompletableFromAction(new sr51((zr51) obj2, (byte) 1)).w();
            case 3:
                ip91 ip91Var = (ip91) obj2;
                return ip91Var.k("reset", (String) null, (String) null).flatMapCompletable(new ap91((byte) 3, ((tj91) obj).a, ip91Var)).h(w841.S0).o(Functions.h).w();
            case 7:
                return j2h1.D(igu.b, new lm61((yx11) obj2, (ef7) obj, (lnm) null, (byte) 21));
            case 10:
                return Observable.create(new n381((x981) obj2, (f301) obj, (byte) 3));
            case 13:
                String str = (String) obj;
                yp91 yp91Var = (yp91) obj2;
                if (!nhc1.Y(str, "spotify:episode:", false)) {
                    return Flowable.I(vp91.a);
                }
                return rqt0.F(yp91Var.b, new uk71(yp91Var, str, (lnm) null, (byte) 19)).toFlowable().J(new fjb(yp91Var, (byte) 25));
            case 23:
                ((wec1) obj2).V((StatusResponseOuterClass.StatusResponse) obj, 2);
                return CompletableEmpty.a;
            case 24:
                String str2 = ((ou80) obj2).a;
                if (((ogz0) obj) instanceof mgz0) {
                    return Single.error(new TapNothingToPlayException(str2));
                }
                return Single.just(str2);
            default:
                PlayerState playerState = (PlayerState) obj;
                if (u890.j((String) ((fip0) obj2).c, playerState.contextUri()) && playerState.isPlaying() && !playerState.isPaused()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
