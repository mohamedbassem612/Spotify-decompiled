package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.car.app.model.Background;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarProgressBar;
import androidx.car.app.model.CarProgressBarStyle;
import androidx.car.app.model.CarText;
import androidx.car.app.model.CondensedItem;
import androidx.car.app.model.CondensedItemStyle;
import androidx.car.app.model.CondensedSection;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import androidx.car.app.model.Shape;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.party.mobile.v2.GetListeningPartyExtendedMarketingCardsResponse;
import com.spotify.party.mobile.v2.ListeningPartyExtendedMarketingCard;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mhc implements dhc, Init, ag51, yl01, Function, c290, ya, n2i1, Function4, t5f1 {
    public final /* synthetic */ byte a;

    public mhc(JSONObject jSONObject) {
        this.a = (byte) 20;
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }

    public static dtw b(Context context, ViewGroup viewGroup, laa laaVar, Object obj, ipb1 ipb1Var, int i) {
        tka0 tka0Var = dtw.C;
        y6x0 y6x0Var = m9h.c1;
        ipb1 ctsVar = (i & 16) != 0 ? null : ipb1Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a;
        if ((i & 64) != 0) {
            y6x0Var = y6x0.W0;
        }
        y6x0 y6x0Var2 = y6x0Var;
        if (ctsVar == null) {
            ctsVar = new cts();
        }
        return new dtw(context, viewGroup, laaVar, ctsVar, obj, y6x0Var2, bs50Var, 32);
    }

    public static dtw d(Context context, ViewGroup viewGroup, laa laaVar, drw drwVar, int i) {
        tka0 tka0Var = dtw.C;
        if ((i & 16) != 0) {
            drwVar = y6x0.W0;
        }
        return new dtw(context, viewGroup, laaVar, new cts(), null, drwVar, null, 176);
    }

    public static lik1 e() {
        return NowPlayingActivity.y1;
    }

    public static Intent f(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NowPlayingActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("EXTRA_SHARED_ELEMENT_TRANSITION", z);
        return intent;
    }

    public static void g(String str, List list, String str2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Set set = s4b1.f;
            if (!uic.k(str3, new b3i1[]{nyu0.e, wyu0.f}) && !uic.h(str3, new blc0[]{blc0.ti, blc0.g1, blc0.fh, blc0.Pg, blc0.ed, blc0.M3, blc0.C8, blc0.yi, blc0.zi})) {
                bhn0.n("The item uri must be either a track, episode, show (audiobook), podcast chapter, clip, an album or playlist URI: ", list, ". Originates from source context ", str2, " and source view ", str);
                return;
            } else {
                list = list;
                str2 = str2;
                str = str;
            }
        }
    }

    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bbz0 bbz0Var = (bbz0) obj4;
        boolean z = !((Boolean) obj2).booleanValue();
        return new pdm(true, bbz0Var.k.contains(((Boolean) obj3).booleanValue() ? abz0.c : abz0.d), bbz0Var.a, true, false, zBooleanValue, z, z, false, false, false, false, false, 228898);
    }

    public byte[] a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public boolean accept(Object obj) {
        le30 le30Var = ((ksk) obj).c;
        return le30Var == le30.k1 || le30Var == le30.P0;
    }

    public Object apply(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 10:
                h290<ListeningPartyExtendedMarketingCard> h290VarN = ((GetListeningPartyExtendedMarketingCardsResponse) obj).n();
                ArrayList arrayList = new ArrayList();
                for (ListeningPartyExtendedMarketingCard listeningPartyExtendedMarketingCard : h290VarN) {
                    String uri = listeningPartyExtendedMarketingCard.o().getUri();
                    Set set = s4b1.f;
                    uri.getClass();
                    zmh1 zmh1Var = null;
                    if (uic.u(uri)) {
                        String imageUrl = listeningPartyExtendedMarketingCard.o().getImageUrl();
                        if (ihc1.y0(imageUrl)) {
                            imageUrl = listeningPartyExtendedMarketingCard.n().getImageUrl();
                        }
                        zmh1Var = new zmh1(uri, listeningPartyExtendedMarketingCard.n().getName(), ihc1.y0(imageUrl) ? null : imageUrl, listeningPartyExtendedMarketingCard.o().p().q(), listeningPartyExtendedMarketingCard.p().q() && listeningPartyExtendedMarketingCard.p().o().o() != lld0.c, listeningPartyExtendedMarketingCard.p().p());
                    }
                    if (zmh1Var != null) {
                        arrayList.add(zmh1Var);
                    }
                }
                return new vyd0(arrayList);
            case 11:
            default:
                ArrayList<mvp0> arrayList2 = ((nvp0) obj).a;
                if (!arrayList2.isEmpty()) {
                    for (mvp0 mvp0Var : arrayList2) {
                        if (mvp0Var.b != 1) {
                            Set set2 = s4b1.f;
                            if (uic.x(mvp0Var.a).c != blc0.T3) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                throw td6.k(obj);
        }
    }

    @Override // p.ag51
    public List c(fpd fpdVar, utj utjVar) {
        ouk0 ouk0VarN = c8o.n(fpdVar, utjVar);
        fsk fskVar = new fsk();
        esk eskVar = new esk();
        Shape shape = Shape.CORNER_EXTRA_SMALL;
        Objects.requireNonNull(shape);
        eskVar.a = shape;
        vv9 vv9Var = new vv9();
        CarColor carColorA = zuc.l.a();
        qpd.b.a(carColorA);
        vv9Var.a = carColorA;
        Background background = new Background(vv9Var);
        if (!cx9.b.a && background.getImage() != null) {
            hhg1.n("Image backgrounds are not supported");
            return null;
        }
        eskVar.b = background;
        CondensedItemStyle condensedItemStyle = new CondensedItemStyle(eskVar, 0);
        String title = fpdVar.getTitle();
        if (title != null) {
            if (title.length() == 0) {
                title = null;
            }
            if (title != null) {
                CarText carTextCreate = CarText.create(title);
                trd.e.b(carTextCreate);
                ((af51) fskVar).b = carTextCreate;
            }
        }
        int i = 0;
        for (Object obj : fpdVar.getItems()) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            apd apdVar = (apd) obj;
            dsk dskVar = new dsk();
            dskVar.c = (byte) 1;
            dskVar.h = true;
            dskVar.e = condensedItemStyle;
            nwc nwcVar = apdVar.a;
            if (nwcVar != null) {
                CharSequence charSequenceB = hon1.B(nwcVar);
                Objects.requireNonNull(charSequenceB);
                CarText carTextCreate2 = CarText.create(charSequenceB);
                trd.f.b(carTextCreate2);
                dskVar.a = carTextCreate2;
            }
            CarIcon carIconR = lnn1.r(apdVar.c);
            yo31 yo31Var = yo31.e;
            yo31Var.j(carIconR);
            dskVar.b = carIconR;
            dskVar.c = (byte) 3;
            Float f = apdVar.g;
            if (f != null) {
                float fFloatValue = f.floatValue();
                if (Math.abs(fFloatValue) > Float.MAX_VALUE || fFloatValue <= 0.0f) {
                    f = null;
                }
                if (f != null) {
                    ord ordVar = new ord(yoi1.o(f.floatValue(), 0.0f, 1.0f));
                    prd prdVar = new prd();
                    CarColor carColorA2 = zuc.c.a();
                    qpd qpdVar = qpd.b;
                    qpdVar.a(carColorA2);
                    prdVar.a = carColorA2;
                    CarColor carColorA3 = zuc.d.a();
                    qpdVar.a(carColorA3);
                    prdVar.b = carColorA3;
                    ordVar.b = new CarProgressBarStyle(prdVar, 0);
                    dskVar.g = new CarProgressBar(ordVar);
                }
            }
            if (apdVar.f != null) {
                CarIcon carIcon = CarIcon.MEDIA_PLAYBACK;
                Objects.requireNonNull(carIcon);
                yo31Var.j(carIcon);
                dskVar.d = carIcon;
            } else {
                mwc mwcVar = apdVar.b;
                if ((mwcVar instanceof mwc) && mwcVar.a.contains(en81.e)) {
                    CarIcon carIconR2 = lnn1.r(new avc(2131233371, Integer.valueOf(zuc.e.a), 64.0f, 64.0f, 0));
                    yo31Var.j(carIconR2);
                    dskVar.d = carIconR2;
                }
            }
            dskVar.h = apdVar.e;
            if (!(apdVar.d instanceof o80)) {
                dskVar.f = OnClickDelegateImpl.create(new gsk(utjVar, apdVar, i, ouk0VarN, (byte) 0));
            }
            if (dskVar.a == null && dskVar.b == null && dskVar.d == null) {
                eg.m("At least one of title, text, leading image, or trailing image must be set");
                return null;
            }
            ((af51) fskVar).a.add(new CondensedItem(dskVar, 0));
            i = i2;
        }
        ((af51) fskVar).e = OnItemVisibilityChangedDelegateImpl.create(new aod(utjVar, fpdVar, (byte) 25));
        return Collections.singletonList(new CondensedSection(fskVar, 0));
    }

    @Override // p.c290
    public Object convert(int i) {
        lj40 lj40Var;
        if (i == 0) {
            lj40Var = lj40.b;
        } else if (i == 1) {
            lj40Var = lj40.c;
        } else if (i != 2) {
            lj40Var = i != 3 ? null : lj40.e;
        } else {
            lj40Var = lj40.d;
        }
        return lj40Var == null ? lj40.f : lj40Var;
    }

    public First e0(Object obj) {
        return First.b((qzf) obj);
    }

    public a8b0 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // p.n2i1
    public boolean s(Uri uri) {
        return u890.j(uri.getFragment(), "close");
    }

    public /* synthetic */ mhc(byte b) {
        this.a = b;
    }
}
