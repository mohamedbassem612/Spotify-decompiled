package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.protobuf.Duration;
import com.spotify.ads.brandads.v1.EmbeddedAdProto;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.casita.v1.resolved.EmbeddedAdTrackingUrls;
import com.spotify.casita.v1.resolved.Heading;
import com.spotify.casita.v1.resolved.HeadingWithText;
import com.spotify.casita.v1.resolved.Item;
import com.spotify.casita.v1.resolved.PreviewPromotionCarouselItem;
import com.spotify.casita.v1.resolved.PromptableSuggestion;
import com.spotify.casita.v1.resolved.Section;
import com.spotify.casita.v1.resolved.TopStory;
import com.spotify.casita.v1.resolved.TopStoryFeedCard;
import com.spotify.casita.v1.resolved.WatchFeedItem;
import com.spotify.casita.v1.resolved.watchfeed.DecoratedEntrypointMetadata;
import com.spotify.contentagnostic.v2.RgbaColor;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uqs implements cu91 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public Object e;

    public uqs(d1d d1dVar, w2d w2dVar, g661 g661Var) {
        this.c = d1dVar;
        x2p1.m(new vq6(w2dVar, (byte) 29));
        this.d = new kdn0(0);
        d1dVar.h(new vhf1(this));
    }

    public static void d(Object obj, ArrayList arrayList, p5 p5Var) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) p5Var.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                d(it.next(), arrayList, p5Var);
            }
        }
    }

    public static rcn0 f(e8b0 e8b0Var) {
        qx81 qx81VarR;
        qx81 qx81VarR2;
        String str = j8a0.a;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ == null || (qx81VarR = d0p1.Z(dq20VarQ)) == null) {
            qx81VarR = d0p1.r(e8b0Var);
            qx81VarR.getClass();
        }
        wjz wjzVar = o1h1.a;
        beg begVarS = qx81VarR.t0().s();
        beg begVar = begVarS instanceof beg ? begVarS : null;
        if (j8a0.k.containsKey(begVar != null ? iht.f(begVar) : null)) {
            return rcn0.a;
        }
        dq20 dq20VarQ2 = d0p1.q(e8b0Var);
        if (dq20VarQ2 == null || (qx81VarR2 = d0p1.o0(dq20VarQ2)) == null) {
            qx81VarR2 = d0p1.r(e8b0Var);
            qx81VarR2.getClass();
        }
        beg begVarS2 = qx81VarR2.t0().s();
        beg begVar2 = begVarS2 instanceof beg ? begVarS2 : null;
        if (j8a0.j.containsKey(begVar2 != null ? iht.f(begVar2) : null)) {
            return rcn0.b;
        }
        return null;
    }

    public static iep0 i(e8b0 e8b0Var) {
        qx81 qx81VarR;
        qx81 qx81VarR2;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ == null || (qx81VarR = d0p1.Z(dq20VarQ)) == null) {
            qx81VarR = d0p1.r(e8b0Var);
            qx81VarR.getClass();
        }
        if (d0p1.Q(qx81VarR)) {
            return iep0.b;
        }
        dq20 dq20VarQ2 = d0p1.q(e8b0Var);
        if (dq20VarQ2 == null || (qx81VarR2 = d0p1.o0(dq20VarQ2)) == null) {
            qx81VarR2 = d0p1.r(e8b0Var);
            qx81VarR2.getClass();
        }
        if (d0p1.Q(qx81VarR2)) {
            return null;
        }
        return iep0.c;
    }

    public String a(Section section) {
        return this.b ? section.U().p() : Integer.toHexString(section.hashCode());
    }

    public void b() {
        ((dp5) this.e).o((er91) this.d);
    }

    public boolean c() {
        return this.a;
    }

    public bvl1 e(a1h1 a1h1Var) {
        List list;
        iep0 iep0Var;
        if (a1h1Var instanceof drb0) {
            if (!(a1h1Var instanceof y0h1)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(a1h1Var);
                sb.append(", ");
                hhg1.f(us71.f(rc11.a, a1h1Var.getClass(), sb));
                return null;
            }
            List upperBounds = ((y0h1) a1h1Var).getUpperBounds();
            List list2 = upperBounds;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!d0p1.M((e8b0) it.next())) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (i((e8b0) obj) != null) {
                                arrayList.add(obj);
                            }
                        }
                        znb0 znb0VarS = dm5.S(3, new ea(upperBounds, this));
                        boolean zIsEmpty = arrayList.isEmpty();
                        iep0 iep0Var2 = iep0.a;
                        if (!zIsEmpty) {
                            if (!arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                if (it2.hasNext()) {
                                    list = upperBounds;
                                }
                            }
                            return new bvl1(iep0Var2, false);
                        }
                        if (((List) znb0VarS.getValue()).isEmpty()) {
                            break;
                        }
                        List list3 = (List) znb0VarS.getValue();
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it3 = list3.iterator();
                            if (it3.hasNext()) {
                                list = (List) znb0VarS.getValue();
                            }
                        }
                        return new bvl1(iep0Var2, true);
                        List list4 = list;
                        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                            Iterator it4 = list4.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    iep0Var = iep0.b;
                                    break;
                                }
                                if (!d0p1.S((e8b0) it4.next())) {
                                    iep0Var = iep0.c;
                                    break;
                                }
                            }
                        } else {
                            iep0Var = iep0.b;
                            break;
                        }
                        return new bvl1(iep0Var, list != upperBounds);
                    }
                }
            }
        }
        return null;
    }

    public yq91 g(View view, lr91 lr91Var) {
        String string;
        String string2;
        Context context = view.getContext();
        er91 er91Var = (er91) this.d;
        Integer num = er91Var.c;
        View.OnClickListener onClickListener = er91Var.f;
        sqs sqsVar = new sqs(this, lr91Var, (byte) 1);
        if (num != null) {
            try {
                string = context.getString(num.intValue());
            } catch (Throwable th) {
                sqsVar.invoke(th);
                string = null;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = er91Var.b;
        }
        Context context2 = view.getContext();
        Integer num2 = er91Var.e;
        sqs sqsVar2 = new sqs(this, lr91Var, (byte) 0);
        if (num2 != null) {
            try {
                string2 = context2.getString(num2.intValue());
            } catch (Throwable th2) {
                sqsVar2.invoke(th2);
                string2 = null;
            }
        } else {
            string2 = null;
        }
        if (string2 == null) {
            string2 = er91Var.d;
        }
        yq91 yq91VarI = yq91.i(view, string, (string2 == null || string2.length() <= 0) ? 3000 : 5000);
        yq91VarI.j(string2, onClickListener);
        ds91 ds91Var = er91Var.a;
        View.OnClickListener onClickListener2 = er91Var.g;
        jda jdaVar = ((kda) yq91VarI).c;
        View viewInflate = LayoutInflater.from(jdaVar.getContext()).inflate(2131626172, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(2131431020);
        textView.setText(string);
        if (onClickListener2 != null) {
            textView.setOnClickListener(new tqs(yq91VarI, onClickListener2, (byte) 0));
        }
        ImageView imageView = (ImageView) viewInflate.findViewById(2131431018);
        int i = 8;
        if (ds91Var != null) {
            imageView.setContentDescription(string);
            if (onClickListener2 != null) {
                imageView.setOnClickListener(new tqs(yq91VarI, onClickListener2, (byte) 0));
            }
            lvx.t(imageView, imageView.getContext().getResources().getDimensionPixelSize(2131167008));
            if (ds91Var instanceof ds91) {
                imageView.setImageDrawable(ds91Var.a);
            } else {
                if (!(ds91Var instanceof es91)) {
                    eg.o();
                    return null;
                }
                gw70 gw70Var = (gw70) this.c;
                es91 es91Var = (es91) ds91Var;
                Drawable drawable = es91Var.b;
                ixg ixgVarF = gw70Var.f(es91Var.a);
                ixgVarF.m(drawable);
                ixgVarF.f(drawable);
                ixgVarF.h();
                ixgVarF.d();
                ixgVarF.k(imageView, (ird1) null);
            }
        } else {
            imageView.getClass();
            imageView.setVisibility(8);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(2131431016);
        textView2.setText(string2);
        if (onClickListener != null) {
            textView2.setOnClickListener(new tqs(yq91VarI, onClickListener, (byte) 0));
        }
        if (string2 != null && string2.length() > 0 && onClickListener != null) {
            i = 0;
        }
        textView2.setVisibility(i);
        jdaVar.removeAllViews();
        jdaVar.setPadding(0, 0, 0, 0);
        jdaVar.addView(viewInflate, 0);
        yq91VarI.a(new rqs(this, yq91VarI, (byte) 0));
        return yq91VarI;
    }

    public boolean h() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0361  */
    /* JADX WARN: Code duplicated, block: B:299:0x0c97 A[PHI: r0
      0x0c97: PHI (r0v152 com.spotify.casita.v1.resolved.EmbeddedAdMetadata) = (r0v143 com.spotify.casita.v1.resolved.EmbeddedAdMetadata), (r0v155 com.spotify.casita.v1.resolved.EmbeddedAdMetadata) binds: [B:304:0x0cac, B:297:0x0c94] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:336:0x0d38 A[PHI: r0
      0x0d38: PHI (r0v129 java.lang.String) = (r0v120 java.lang.String), (r0v132 java.lang.String) binds: [B:341:0x0d4a, B:334:0x0d35] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x02bd  */
    public jn60 j(Section section) {
        int i;
        int i2;
        int i3;
        String strQ;
        String str;
        HeadingWithText headingWithTextU;
        String strR;
        h290 h290VarP;
        String strQ2;
        EmbeddedAdMetadata embeddedAdMetadataS;
        EmbeddedAdMetadata embeddedAdMetadata;
        HeadingWithText headingWithTextU2;
        String strR2;
        h290 h290VarP2;
        String strQ3;
        ykw0 ykw0Var;
        fef1 fef1Var;
        fef1 fef1Var2;
        String strQ4;
        Object obj = this.c;
        yz21 yz21Var = (yz21) obj;
        kp00 kp00Var = (kp00) this.e;
        w25 w25Var = (w25) kp00Var.b;
        int iZ = section.z();
        int i4 = iZ == 0 ? -1 : vi51.a[l1d.C(iZ)];
        Object obj2 = this.d;
        fef1 fef1Var3 = def1.a;
        fef1 fef1Var4 = cef1.a;
        fef1 fef1Var5 = eef1.a;
        fef1 fef1Var6 = aef1.a;
        z6x z6xVar = z6x.a;
        switch (i4) {
            case 1:
                return n(section);
            case 2:
                return k(section);
            case 3:
                String strP = section.S().q().p().p();
                String strP2 = section.U().p();
                strP2.getClass();
                return new xq01(strP2, section.U().p(), xfo1.t(section.S().p(), false), (yz21) obj, new oq01(strP2, section.U().p(), xfo1.t(section.S().p(), false), strP, section.S().r() == vat.c));
            case 4:
                String strA = a(section);
                String strP3 = section.U().p();
                x360 x360VarT = xfo1.t(section.L().p(), true);
                yz21 yz21Var2 = (yz21) obj;
                String strQ5 = (String) o7h.s0(section.L().q().p());
                if (strQ5 == null) {
                    strQ5 = section.L().q().q();
                }
                strQ5.getClass();
                return new abw0(strA, strP3, x360VarT, yz21Var2, new lbw0(strQ5, section.L().q().q()));
            case 5:
            default:
                return null;
            case 6:
                return new v4n0(a(section), section.U().p(), xfo1.t(section.D().p(), true), yz21Var, new w4n0(section.D().q().q(), section.D().q().p()));
            case 7:
                String strA2 = a(section);
                String strP4 = section.U().p();
                x360 x360VarT2 = xfo1.t(section.V().p(), false);
                yz21 yz21Var3 = (yz21) obj;
                List<Item> itemsList = section.p().p().q().getItemsList();
                ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
                for (Item item : itemsList) {
                    arrayList.add(new oi90(item.q(), item.p()));
                }
                return new w24(strA2, strP4, x360VarT2, yz21Var3, new j34(arrayList, u890.j((String) obj2, "podcasts-chip")));
            case 8:
                int iS = section.v().s();
                int i5 = iS == 0 ? -1 : vi51.b[l1d.C(iS)];
                if (i5 == 1) {
                    String strA3 = a(section);
                    String strP5 = section.U().p();
                    int iOrdinal = section.v().q().q().ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            i2 = iOrdinal != 3 ? 1 : 4;
                        } else {
                            i = 3;
                        }
                        return new ze31(strA3, strP5, yz21Var, new byc(i2, section.v().q().getImageUrl(), section.v().q().getTitle(), section.v().q().getSubtitle(), section.v().q().n()), section.v().q().p());
                    }
                    i = 2;
                    i2 = i;
                    return new ze31(strA3, strP5, yz21Var, new byc(i2, section.v().q().getImageUrl(), section.v().q().getTitle(), section.v().q().getSubtitle(), section.v().q().n()), section.v().q().p());
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        return null;
                    }
                    return new zdi0(a(section), section.U().p(), xfo1.t(section.v().p().p(), false), yz21Var, new aei0(section.v().p().getUri(), section.v().p().getTitle(), section.v().p().getSubtitle(), section.v().p().q(), section.v().p().r(), section.v().p().n(), section.v().p().s().n(), section.v().p().s().o(), section.v().p().s().q()));
                }
                String strA4 = a(section);
                String strP6 = section.U().p();
                int iOrdinal2 = section.v().r().p().ordinal();
                if (iOrdinal2 == 1) {
                    i3 = 2;
                } else if (iOrdinal2 != 2) {
                    i3 = iOrdinal2 != 3 ? 1 : 4;
                } else {
                    i3 = 3;
                }
                return new ew81(strA4, strP6, yz21Var, new cyc(i3, section.v().r().getTitle(), section.v().r().n()));
            case 9:
                String strA5 = a(section);
                String strP7 = section.U().p();
                x360 x360VarT3 = xfo1.t(section.y().p(), false);
                List<Item> itemsList2 = section.y().getItemsList();
                ArrayList arrayList2 = new ArrayList(q7h.U(itemsList2, 10));
                for (Item item2 : itemsList2) {
                    arrayList2.add(new oi90(item2.q(), item2.p()));
                }
                return new ftl(strA5, strP7, x360VarT3, yz21Var, new gtl(arrayList2, w25Var.c0()));
            case 10:
                return q(section);
            case 11:
                String strA6 = a(section);
                String strP8 = section.U().p();
                x360 x360VarT4 = xfo1.t(section.o().p(), false);
                List<Item> itemsList3 = section.o().getItemsList();
                ArrayList arrayList3 = new ArrayList(q7h.U(itemsList3, 10));
                for (Item item3 : itemsList3) {
                    arrayList3.add(new oi90(item3.q(), item3.p()));
                }
                return new u30(strA6, strP8, x360VarT4, yz21Var, new x30(arrayList3));
            case 12:
                String strA7 = a(section);
                String strP9 = section.U().p();
                x360 x360VarT5 = xfo1.t(section.O().q(), false);
                String strA8 = a(section);
                String strQ6 = section.O().r().q();
                String strQ7 = (String) o7h.s0(section.O().r().p());
                if (strQ7 == null) {
                    strQ7 = section.O().r().q();
                }
                String str2 = strQ7;
                str2.getClass();
                return new ymx0(strA7, strP9, x360VarT5, yz21Var, new epx0(strA8, strQ6, str2, section.O().o(), wi51.b[section.O().s().ordinal()] == 1 ? 2 : 1));
            case 13:
                String strA9 = a(section);
                String strP10 = section.U().p();
                x360 x360VarT6 = xfo1.t(section.r().q(), true);
                Item itemR = section.r().r();
                String str3 = (itemR == null || (strQ2 = itemR.q()) == null) ? "" : strQ2;
                Item itemR2 = section.r().r();
                if (itemR2 == null || (h290VarP = itemR2.p()) == null || (strQ = (String) o7h.s0(h290VarP)) == null) {
                    Item itemR3 = section.r().r();
                    strQ = itemR3 != null ? itemR3.q() : null;
                    if (strQ == null) {
                        str = "";
                    } else {
                        str = strQ;
                    }
                } else {
                    str = strQ;
                }
                Heading headingQ = section.r().q();
                String str4 = (headingQ == null || (headingWithTextU = headingQ.u()) == null || (strR = headingWithTextU.r()) == null) ? "" : strR;
                EmbeddedAdMetadata embeddedAdMetadataO = section.r().o();
                String strS = section.r().s();
                strS.getClass();
                return new gbi0(strA9, strP10, x360VarT6, yz21Var, new qbi0(str3, str, str4, embeddedAdMetadataO, strS.length() > 0 ? strS : null));
            case 14:
                String strA10 = a(section);
                String strP11 = section.U().p();
                x360 x360VarT7 = xfo1.t(section.s().q(), true);
                Item itemR4 = section.s().r();
                String str5 = (itemR4 == null || (strQ3 = itemR4.q()) == null) ? "" : strQ3;
                Item itemR5 = section.s().r();
                if (itemR5 == null || (h290VarP2 = itemR5.p()) == null || (embeddedAdMetadataS = (String) o7h.s0(h290VarP2)) == null) {
                    embeddedAdMetadataS = section.s().s();
                    embeddedAdMetadataS.getClass();
                    if (embeddedAdMetadataS.length() <= 0) {
                        embeddedAdMetadataS = null;
                    }
                    if (embeddedAdMetadataS == null) {
                        Item itemR6 = section.s().r();
                        EmbeddedAdMetadata embeddedAdMetadataQ = itemR6 != null ? itemR6.q() : null;
                        embeddedAdMetadata = embeddedAdMetadataQ == null ? "" : embeddedAdMetadataQ;
                    } else {
                        embeddedAdMetadata = embeddedAdMetadataS;
                    }
                } else {
                    embeddedAdMetadata = embeddedAdMetadataS;
                }
                Heading headingQ2 = section.s().q();
                return new gbi0(strA10, strP11, x360VarT7, yz21Var, new qbi0(str5, embeddedAdMetadata, (headingQ2 == null || (headingWithTextU2 = headingQ2.u()) == null || (strR2 = headingWithTextU2.r()) == null) ? "" : strR2, section.s().o(), null));
            case 15:
                String strA11 = a(section);
                String strP12 = section.U().p();
                String strA12 = a(section);
                String strQ8 = section.P().q().q();
                String strQ9 = (String) o7h.s0(section.P().q().p());
                if (strQ9 == null) {
                    strQ9 = section.P().q().q();
                }
                strQ9.getClass();
                return new cox0(strA11, strP12, yz21Var, new gpx0(strA12, strQ8, strQ9, section.P().o()));
            case 16:
                String strA13 = a(section);
                String strP13 = section.U().p();
                x360 x360VarT8 = xfo1.t(section.G().p(), false);
                List<Item> itemsList4 = section.G().q().q().getItemsList();
                ArrayList arrayList4 = new ArrayList(q7h.U(itemsList4, 10));
                for (Item item4 : itemsList4) {
                    arrayList4.add(new oi90(item4.q(), item4.p()));
                }
                return new snd0(strA13, strP13, x360VarT8, yz21Var, new wnd0(arrayList4));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new be81(a(section), section.U().p(), yz21Var, new ce81(section.W().s().q(), section.W().o(), new ae81(section.W().r().s().p(), section.W().r().s().getSubtitle()), section.W().t() ? section.W().p() : null));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String strA14 = a(section);
                String strP14 = section.U().p();
                x360 x360VarT9 = xfo1.t(section.d0().q(), true);
                String strQ10 = (String) o7h.s0(section.d0().r().p());
                if (strQ10 == null) {
                    strQ10 = section.d0().r().q();
                }
                strQ10.getClass();
                return new whi0(strA14, strP14, x360VarT9, yz21Var, new xfi0(strQ10, section.d0().r().q(), section.d0().s(), section.d0().o()));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String str6 = (String) obj2;
                int i6 = vi51.c[section.t().q().ordinal()];
                if (i6 == 1) {
                    return new p6a(a(section), section.U().p(), yz21Var, new ld5(str6, 1, section.t().o()));
                }
                if (i6 == 2) {
                    return new p6a(a(section), section.U().p(), yz21Var, new ld5(str6, 2, section.t().o()));
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String strA15 = a(section);
                String strP15 = section.U().p();
                String strA16 = a(section);
                EmbeddedAdMetadata embeddedAdMetadataP = section.B().p();
                String id = section.B().p().getId();
                String strM = l1d.m("spotify:ad:", section.B().p().getId());
                String strN = section.B().o().n();
                String strP16 = section.B().o().p();
                xkg0 xkg0Var = new xkg0();
                String strO = section.B().o().o();
                strO.getClass();
                if (strO.length() <= 0) {
                    strO = null;
                }
                if (strO != null) {
                }
                String strT = section.B().o().t();
                strT.getClass();
                if (strT.length() <= 0) {
                    strT = null;
                }
                if (strT != null) {
                }
                String strS2 = section.B().o().s();
                strS2.getClass();
                if (strS2.length() <= 0) {
                    strS2 = null;
                }
                if (strS2 != null) {
                }
                xkg0Var.put("product_name", section.B().p().s());
                xkg0 xkg0VarB = xkg0Var.b();
                h290 h290VarR = section.B().o().r();
                ArrayList arrayList5 = new ArrayList(q7h.U(h290VarR, 10));
                Iterator it = h290VarR.iterator();
                while (it.hasNext()) {
                    arrayList5.add(new gq70(0, 0, new p57(((EmbeddedAdProto.ImageAsset) it.next()).getUrl())));
                }
                fgh0 fgh0Var = new fgh0(6, arrayList5, (List) null);
                String strQ11 = section.B().p().q();
                String strO2 = section.B().p().o();
                String strR3 = section.B().p().r();
                Format format = Format.BANNER;
                String strT2 = section.B().p().t();
                Map mapU = section.B().p().u();
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapU.size()));
                for (Map.Entry entry : mapU.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((EmbeddedAdTrackingUrls) entry.getValue()).p());
                }
                return new niu(strA15, strP15, yz21Var, new viu(strA16, new ji0(id, strM, strN, "", strP16, 1, xkg0VarB, fgh0Var, strQ11, strO2, strR3, false, false, format, false, z6xVar, strT2, linkedHashMap, 262144), embeddedAdMetadataP));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                String strP17 = section.U().p();
                strP17.getClass();
                String strP18 = section.U().p();
                EmbeddedAdMetadata embeddedAdMetadataP2 = section.b0().p();
                String id2 = section.b0().p().getId();
                String strM2 = l1d.m("spotify:ad:", section.b0().p().getId());
                String strN2 = section.b0().o().n();
                String strP19 = section.b0().o().p();
                xkg0 xkg0Var2 = new xkg0();
                String strO3 = section.b0().o().o();
                strO3.getClass();
                if (strO3.length() <= 0) {
                    strO3 = null;
                }
                if (strO3 != null) {
                }
                String strT3 = section.b0().o().t();
                strT3.getClass();
                if (strT3.length() <= 0) {
                    strT3 = null;
                }
                if (strT3 != null) {
                }
                String strS3 = section.b0().o().s();
                strS3.getClass();
                if (strS3.length() <= 0) {
                    strS3 = null;
                }
                if (strS3 != null) {
                }
                xkg0Var2.put("product_name", section.b0().p().s());
                xkg0 xkg0VarB2 = xkg0Var2.b();
                h290<EmbeddedAdProto.VideoAsset> h290VarU = section.b0().o().u();
                ArrayList arrayList6 = new ArrayList(q7h.U(h290VarU, 10));
                for (EmbeddedAdProto.VideoAsset videoAsset : h290VarU) {
                    String strP20 = videoAsset.p();
                    arrayList6.add((strP20 == null || strP20.length() == 0) ? new a7j1("video/mp4", videoAsset.q(), videoAsset.o(), 0, new p57(videoAsset.getUrl()), Long.valueOf(videoAsset.n())) : new a7j1("video/mp4", videoAsset.q(), videoAsset.o(), 0, new o57(videoAsset.p()), Long.valueOf(videoAsset.n())));
                }
                fgh0 fgh0Var2 = new fgh0(5, (List) null, arrayList6);
                String strQ12 = section.b0().p().q();
                String strO4 = section.b0().p().o();
                String strR4 = section.b0().p().r();
                Format format2 = Format.VIDEO;
                String strT4 = section.b0().p().t();
                Map mapU2 = section.b0().p().u();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(mapU2.size()));
                for (Map.Entry entry2 : mapU2.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), ((EmbeddedAdTrackingUrls) entry2.getValue()).p());
                }
                return new zbj1(strP17, strP18, yz21Var, new ucj1(strP17, new ji0(id2, strM2, strN2, "", strP19, 1, xkg0VarB2, fgh0Var2, strQ12, strO4, strR4, false, false, format2, false, z6xVar, strT4, linkedHashMap2, 262144), embeddedAdMetadataP2));
            case 22:
                String strA17 = a(section);
                String strP21 = section.U().p();
                x360 x360VarT10 = xfo1.t(section.w().q(), false);
                List itemsList5 = section.w().r().q().getItemsList();
                ArrayList arrayList7 = new ArrayList(q7h.U(itemsList5, 10));
                Iterator it2 = itemsList5.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((Item) it2.next()).q());
                }
                return new c6d(strA17, strP21, x360VarT10, yz21Var, new y9a(arrayList7), section.w().o());
            case 23:
                return new r6j1(a(section), section.U().p(), new z5j1(section.a0().r().q(), section.a0().s(), (String) o7h.s0(section.a0().r().p()), section.a0().o()), xfo1.t(section.a0().q(), false), yz21Var);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String strA18 = a(section);
                String strP22 = section.U().p();
                x360 x360VarT11 = xfo1.t(section.c0().p(), false);
                List<Item> itemsList6 = section.c0().getItemsList();
                ArrayList arrayList8 = new ArrayList(q7h.U(itemsList6, 10));
                for (Item item5 : itemsList6) {
                    String strQ13 = item5.q();
                    String str7 = (String) o7h.s0(item5.p());
                    if (str7 == null) {
                        str7 = "";
                    }
                    arrayList8.add(new bhi0(strQ13, str7));
                }
                return new tgi0(strA18, strP22, x360VarT11, yz21Var, false, arrayList8);
            case 25:
                String strA19 = a(section);
                String strP23 = section.U().p();
                x360 x360VarT12 = xfo1.t(section.M().p(), false);
                List<Item> itemsList7 = section.M().getItemsList();
                ArrayList arrayList9 = new ArrayList(q7h.U(itemsList7, 10));
                for (Item item6 : itemsList7) {
                    String strQ14 = item6.q();
                    String str8 = (String) o7h.s0(item6.p());
                    if (str8 == null) {
                        str8 = "";
                    }
                    arrayList9.add(new bhi0(strQ14, str8));
                }
                return new tgi0(strA19, strP23, x360VarT12, yz21Var, true, arrayList9);
            case 26:
                List<Item> itemsList8 = section.J().getItemsList();
                ArrayList arrayList10 = new ArrayList();
                for (Item item7 : itemsList8) {
                    String str9 = (String) o7h.s0(item7.p());
                    bhi0 bhi0Var = str9 != null ? new bhi0(item7.q(), str9) : null;
                    if (bhi0Var != null) {
                        arrayList10.add(bhi0Var);
                    }
                }
                if (!arrayList10.isEmpty()) {
                    return new v4v0(a(section), section.U().p(), xfo1.t(section.J().o(), false), yz21Var, arrayList10);
                }
                return null;
            case 27:
                String strA20 = a(section);
                String strP24 = section.U().p();
                x360 x360VarT13 = xfo1.t(section.N().q(), false);
                String strR5 = section.N().r();
                EmbeddedAdMetadata embeddedAdMetadataO2 = section.N().o();
                List<PreviewPromotionCarouselItem> itemsList9 = section.N().getItemsList();
                ArrayList arrayList11 = new ArrayList();
                for (PreviewPromotionCarouselItem previewPromotionCarouselItem : itemsList9) {
                    int iN = previewPromotionCarouselItem.n();
                    if ((iN == 0 ? -1 : vi51.d[l1d.C(iN)]) == 1) {
                        String strQ15 = previewPromotionCarouselItem.o().r().q();
                        String str10 = (String) o7h.s0(previewPromotionCarouselItem.o().r().p());
                        if (str10 == null) {
                            str10 = "";
                        }
                        ykw0Var = new ykw0(strQ15, str10, previewPromotionCarouselItem.o().s(), previewPromotionCarouselItem.o().o());
                    } else {
                        ykw0Var = null;
                    }
                    if (ykw0Var != null) {
                        arrayList11.add(ykw0Var);
                    }
                }
                return new vkw0(strA20, strP24, x360VarT13, yz21Var, strR5, embeddedAdMetadataO2, arrayList11);
            case 28:
                String strA21 = a(section);
                String strP25 = section.U().p();
                x360 x360VarT14 = xfo1.t(section.q().p(), true);
                String strQ16 = section.q().q().q();
                String str11 = (String) o7h.s0(section.q().q().p());
                if (str11 == null) {
                    str11 = "";
                }
                return new ah7(strA21, strP25, x360VarT14, yz21Var, new bh7(strQ16, str11));
            case 29:
                return new npd1(a(section), section.U().p(), yz21Var, new opd1(section.A().getImageUrl(), section.A().p(), section.A().o(), section.A().getDescription()));
            case 30:
                return new cz80(a(section), section.U().p(), yz21Var, new b7m1(section.u().q().q(), section.u().o()), (byte) 1);
            case 31:
                String strA22 = a(section);
                section.U().getClass();
                return new aln0(strA22, yz21Var, new cln0(section.H().getTitle(), section.H().p()));
            case 32:
                if (this.a && w25Var.r()) {
                    return new cz80(a(section), section.U().p(), yz21Var, new fz80(section.F().getPrompt()), (byte) 0);
                }
                return null;
            case 33:
                String strA23 = a(section);
                String strP26 = section.U().p();
                h290<TopStory> h290VarP3 = section.X().p();
                ArrayList arrayList12 = new ArrayList(q7h.U(h290VarP3, 10));
                for (TopStory topStory : h290VarP3) {
                    String title = topStory.getTitle();
                    String description = topStory.getDescription();
                    List itemsList10 = topStory.getItemsList();
                    ArrayList arrayList13 = new ArrayList(q7h.U(itemsList10, 10));
                    Iterator it3 = itemsList10.iterator();
                    while (it3.hasNext()) {
                        arrayList13.add(((Item) it3.next()).q());
                    }
                    String strO5 = topStory.o();
                    long jQ = topStory.getCreatedAt().q();
                    int iN2 = topStory.n();
                    if (iN2 == 0) {
                        fef1Var = fef1Var6;
                    } else if (iN2 == 1) {
                        fef1Var = fef1Var3;
                    } else if (iN2 != 2) {
                        if (iN2 != 3) {
                            if (iN2 == 4) {
                                fef1Var = fef1Var5;
                            }
                        }
                        fef1Var = fef1Var6;
                    } else {
                        fef1Var = fef1Var4;
                    }
                    arrayList12.add(new xef1(title, description, arrayList13, strO5, jQ, fef1Var, topStory.q() ? topStory.p() : null));
                }
                return new tdf1(strA23, strP26, yz21Var, new zdf1(arrayList12), (byte) 0);
            case 34:
                TopStoryFeedCard topStoryFeedCardY = section.Y();
                String strA24 = a(section);
                String strP27 = section.U().p();
                String strP28 = topStoryFeedCardY.p();
                String description2 = topStoryFeedCardY.getDescription();
                List itemsList11 = topStoryFeedCardY.getItemsList();
                ArrayList arrayList14 = new ArrayList(q7h.U(itemsList11, 10));
                Iterator it4 = itemsList11.iterator();
                while (it4.hasNext()) {
                    arrayList14.add(((Item) it4.next()).q());
                }
                int iN3 = topStoryFeedCardY.n();
                if (iN3 == 0) {
                    fef1Var2 = fef1Var6;
                } else if (iN3 == 1) {
                    fef1Var2 = fef1Var3;
                } else if (iN3 == 2) {
                    fef1Var2 = fef1Var4;
                } else if (iN3 == 3 || iN3 != 4) {
                    fef1Var2 = fef1Var6;
                } else {
                    fef1Var2 = fef1Var5;
                }
                return new tdf1(strA24, strP27, yz21Var, new vef1(strP28, description2, arrayList14, fef1Var2, topStoryFeedCardY.r() ? topStoryFeedCardY.q() : null), (byte) 1);
            case 35:
                String strA25 = a(section);
                String strP29 = section.U().p();
                x360 x360VarT15 = xfo1.t(section.Q().p(), false);
                String strQ17 = section.Q().q().q();
                h290 h290VarR2 = section.Q().r();
                ArrayList arrayList15 = new ArrayList(q7h.U(h290VarR2, 10));
                Iterator it5 = h290VarR2.iterator();
                while (it5.hasNext()) {
                    arrayList15.add(((PromptableSuggestion) it5.next()).d());
                }
                return new f0y0(strA25, strP29, x360VarT15, yz21Var, strQ17, arrayList15);
            case 36:
                if (((xrk) kp00Var.c).b()) {
                    String strO6 = section.x().o();
                    strO6.getClass();
                    if (strO6.length() <= 0) {
                        strO6 = null;
                    }
                    if (strO6 != null) {
                        String strA26 = a(section);
                        section.U().getClass();
                        return new cbk(strA26, yz21Var, strO6);
                    }
                }
                return null;
            case 37:
                return new bnt0(a(section), section.U().p(), xfo1.t(section.I().q(), true), yz21Var, new dnt0(section.I().r().q(), section.I().s() ? section.I().o() : null));
            case 38:
                if (vi51.e[section.E().p().ordinal()] == 1) {
                    return new sd80(a(section), section.U().p(), yz21Var, new kf80(yz21Var.a));
                }
                return null;
            case 39:
                Item item8 = (Item) o7h.s0(section.R().q().q().getItemsList());
                if (item8 != null && (strQ4 = item8.q()) != null) {
                    if (strQ4.length() <= 0) {
                        strQ4 = null;
                    }
                    if (strQ4 != null) {
                        String str12 = strQ4;
                        return new ymx0(a(section), section.U().p(), xfo1.t(section.R().p(), false), yz21Var, new epx0(a(section), str12, str12, EmbeddedAdMetadata.p(), 1));
                    }
                }
                return null;
            case 40:
                return new xc11(Integer.toHexString(section.hashCode()), section.U().p(), xfo1.t(section.T().p(), false), yz21Var, new ad11(section.T().q().q()));
            case 41:
                String strQ18 = section.Z().p().q();
                strQ18.getClass();
                String str13 = strQ18.length() > 0 ? strQ18 : null;
                if (str13 != null) {
                    return new xcy0(Integer.toHexString(section.hashCode()), section.U().p(), xfo1.t(section.Z().o(), false), yz21Var, str13);
                }
                return null;
            case 42:
                if (w25Var.K()) {
                    String strA27 = a(section);
                    String strP30 = section.U().p();
                    x360 x360VarT16 = xfo1.t(section.K().o(), true);
                    String strQ19 = (String) o7h.s0(section.K().p().p());
                    if (strQ19 == null) {
                        strQ19 = section.K().p().q();
                    }
                    strQ19.getClass();
                    return new d3w0(strA27, strP30, x360VarT16, yz21Var, new e3w0(strQ19, section.K().p().q()));
                }
                return null;
        }
    }

    public ev70 k(Section section) {
        if (section.C().r().r()) {
            return null;
        }
        String strA = a(section);
        String strP = section.U().p();
        x360 x360VarT = xfo1.t(section.C().q(), false);
        yz21 yz21Var = (yz21) this.c;
        List itemsList = section.C().r().q().getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        Iterator it = itemsList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Item) it.next()).q());
        }
        return new ev70(strA, strP, x360VarT, yz21Var, new y9a(arrayList), section.C().s() == wt70.c, section.C().o());
    }

    public void l(boolean z, boolean z2) {
        wdd1 wdd1Var = (wdd1) this.d;
        if (z && z2) {
            wdd1Var.f(new t4l1(this, z, z2));
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        ((wdd1) this.e).g(new qub1(this, atomicBoolean, (byte) 15), 1000L);
        wdd1Var.f(new u4l1(this, atomicBoolean, z, z2));
    }

    public void m(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.a) {
            l(true, z);
        }
    }

    public a181 n(Section section) {
        String strA = a(section);
        String strP = section.U().p();
        x360 x360VarT = xfo1.t(section.V().p(), false);
        yz21 yz21Var = (yz21) this.c;
        List<Item> itemsList = section.V().q().q().getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        for (Item item : itemsList) {
            arrayList.add(new oi90(item.q(), item.p()));
        }
        return new a181(strA, strP, x360VarT, yz21Var, new j181(arrayList));
    }

    public jn60 o(Section section) {
        jn60 m231Var;
        try {
            m231Var = j(section);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.t("Error mapping " + section + " section to HomeFeatureType", thA);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        return m231Var;
    }

    public ArrayList p(e8b0 e8b0Var) {
        o860 o860Var = (o860) this.d;
        fa faVar = new fa(e8b0Var, zf5.b((zf5) ((uw0) o860Var.b).Y, (r8a0) ((znb0) o860Var.d).getValue(), ((a8b0) e8b0Var).getAnnotations()), (a1h1) null);
        p5 p5Var = new p5(this, (byte) 3);
        ArrayList arrayList = new ArrayList(1);
        d(faVar, arrayList, p5Var);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x016b  */
    /* JADX WARN: Code duplicated, block: B:24:0x017b  */
    /* JADX WARN: Code duplicated, block: B:31:0x019f  */
    public i8l1 q(Section section) {
        String str;
        u6l1 u6l1Var;
        int i;
        int i2;
        Float fValueOf;
        DecoratedEntrypointMetadata decoratedEntrypointMetadataO;
        u7h u7hVar;
        String strA = a(section);
        String strP = section.U().p();
        x360 x360VarT = xfo1.t(section.e0().p(), false);
        yz21 yz21Var = (yz21) this.c;
        List<WatchFeedItem> itemsList = section.e0().getItemsList();
        ArrayList arrayList = new ArrayList(q7h.U(itemsList, 10));
        for (WatchFeedItem watchFeedItem : itemsList) {
            oi90 oi90Var = new oi90(watchFeedItem.p().q(), watchFeedItem.p().p());
            if (watchFeedItem.r()) {
                String uri = watchFeedItem.o().getUri();
                String strT = watchFeedItem.o().t();
                String strV = watchFeedItem.o().v();
                String title = watchFeedItem.o().getTitle();
                String subtitle = watchFeedItem.o().getSubtitle();
                str = null;
                aq70 aq70Var = new aq70(watchFeedItem.o().x().getUrl(), watchFeedItem.o().x().p());
                String uri2 = watchFeedItem.o().y().getUri();
                int iOrdinal = watchFeedItem.o().y().r().ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            i = 3;
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                        } else {
                            i2 = 2;
                        }
                    }
                    Duration durationQ = watchFeedItem.o().y().q();
                    long jP = durationQ.p();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long jO = (((long) durationQ.o()) / 1000000) + timeUnit.toMillis(jP);
                    Duration durationP = watchFeedItem.o().y().p();
                    blj1 blj1Var = new blj1(jO, (((long) durationP.o()) / 1000000) + timeUnit.toMillis(durationP.p()), uri2, i2);
                    String strU = watchFeedItem.o().u();
                    String strO = watchFeedItem.o().o();
                    aq70 aq70Var2 = new aq70(watchFeedItem.o().q().getUrl(), watchFeedItem.o().q().p());
                    String strR = watchFeedItem.o().r();
                    if (watchFeedItem.o().A()) {
                        fValueOf = Float.valueOf((float) watchFeedItem.o().w());
                    } else {
                        fValueOf = null;
                    }
                    decoratedEntrypointMetadataO = watchFeedItem.o();
                    if (!decoratedEntrypointMetadataO.z() && decoratedEntrypointMetadataO.p().v() && decoratedEntrypointMetadataO.p().r().y()) {
                        RgbaColor rgbaColorT = decoratedEntrypointMetadataO.p().r().t();
                        u7hVar = new u7h(z4p1.f(rgbaColorT.s(), rgbaColorT.r(), rgbaColorT.p(), rgbaColorT.o()));
                    }
                    u6l1Var = new u6l1(uri, strT, strV, title, subtitle, aq70Var, blj1Var, strU, strO, aq70Var2, strR, fValueOf, u7hVar);
                } else {
                    i = 3;
                }
                i2 = i;
                Duration durationQ2 = watchFeedItem.o().y().q();
                long jP2 = durationQ2.p();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long jO2 = (((long) durationQ2.o()) / 1000000) + timeUnit2.toMillis(jP2);
                Duration durationP2 = watchFeedItem.o().y().p();
                blj1 blj1Var2 = new blj1(jO2, (((long) durationP2.o()) / 1000000) + timeUnit2.toMillis(durationP2.p()), uri2, i2);
                String strU2 = watchFeedItem.o().u();
                String strO2 = watchFeedItem.o().o();
                aq70 aq70Var3 = new aq70(watchFeedItem.o().q().getUrl(), watchFeedItem.o().q().p());
                String strR2 = watchFeedItem.o().r();
                if (watchFeedItem.o().A()) {
                    fValueOf = Float.valueOf((float) watchFeedItem.o().w());
                } else {
                    fValueOf = null;
                }
                decoratedEntrypointMetadataO = watchFeedItem.o();
                u7hVar = !decoratedEntrypointMetadataO.z() ? null : null;
                u6l1Var = new u6l1(uri, strT, strV, title, subtitle, aq70Var, blj1Var2, strU2, strO2, aq70Var3, strR2, fValueOf, u7hVar);
            } else {
                str = null;
                u6l1Var = null;
            }
            String strQ = this.b ? watchFeedItem.p().q() : UUID.randomUUID().toString();
            strQ.getClass();
            String strO3 = watchFeedItem.q().o();
            String strR3 = watchFeedItem.q().r();
            String strQ2 = watchFeedItem.q().q();
            strQ2.getClass();
            arrayList.add(new v8l1(oi90Var, u6l1Var, strQ, strO3, strR3, strQ2.length() > 0 ? strQ2 : str));
            strA = strA;
            strP = strP;
            x360VarT = x360VarT;
        }
        return new i8l1(strA, strP, x360VarT, yz21Var, new ial1(arrayList));
    }

    public uqs(ve5 ve5Var, boolean z, o860 o860Var, wf5 wf5Var, boolean z2) {
        this.c = ve5Var;
        this.a = z;
        this.d = o860Var;
        this.e = wf5Var;
        this.b = z2;
    }

    public uqs(gw70 gw70Var, er91 er91Var, dp5 dp5Var) {
        this.c = gw70Var;
        this.d = er91Var;
        this.e = dp5Var;
        this.a = er91Var.i;
        this.b = (er91Var.d == null && er91Var.e == null) ? false : true;
    }

    public uqs(Context context, Looper looper, rdd1 rdd1Var) {
        this.c = new qpj1(context.getApplicationContext(), (byte) 11);
        this.d = rdd1Var.a(looper, (Handler.Callback) null);
        this.e = rdd1Var.a(Looper.getMainLooper(), (Handler.Callback) null);
    }

    public /* synthetic */ uqs(Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.a = z;
        this.b = z2;
    }

    public uqs(yz21 yz21Var, String str, boolean z, kp00 kp00Var, boolean z2) {
        this.c = yz21Var;
        this.d = str;
        this.a = z;
        this.e = kp00Var;
        this.b = z2;
    }
}
