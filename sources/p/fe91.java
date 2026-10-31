package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fe91 extends hab0 implements iu30 {
    public static final fe91 N0;
    public static final fe91 O0;
    public static final fe91 P0;
    public static final fe91 Q0;
    public static final fe91 R0;
    public static final fe91 S0;
    public static final fe91 T0;
    public static final fe91 U0;
    public static final fe91 V0;
    public static final fe91 W0;
    public static final fe91 X;
    public static final fe91 X0;
    public static final fe91 Y;
    public static final fe91 Y0;
    public static final fe91 Z;
    public static final fe91 Z0;
    public static final fe91 a1;
    public static final fe91 b;
    public static final fe91 b1;
    public static final fe91 c;
    public static final fe91 c1;
    public static final fe91 d;
    public static final fe91 d1;
    public static final fe91 e;
    public static final fe91 e1;
    public static final fe91 f;
    public static final fe91 g;
    public static final fe91 h;
    public static final fe91 i;
    public static final fe91 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fe91(i2, (byte) 0);
        c = new fe91(i2, (byte) 1);
        d = new fe91(i2, (byte) 2);
        e = new fe91(i2, (byte) 3);
        f = new fe91(i2, (byte) 4);
        g = new fe91(i2, (byte) 5);
        h = new fe91(i2, (byte) 6);
        i = new fe91(i2, (byte) 7);
        t = new fe91(i2, (byte) 8);
        X = new fe91(i2, (byte) 9);
        Y = new fe91(i2, (byte) 10);
        Z = new fe91(i2, (byte) 11);
        N0 = new fe91(i2, (byte) 12);
        O0 = new fe91(i2, (byte) 13);
        P0 = new fe91(i2, (byte) 14);
        Q0 = new fe91(i2, (byte) 15);
        R0 = new fe91(i2, (byte) 16);
        S0 = new fe91(i2, (byte) 17);
        T0 = new fe91(i2, (byte) 18);
        U0 = new fe91(i2, (byte) 19);
        V0 = new fe91(i2, (byte) 20);
        W0 = new fe91(i2, (byte) 21);
        X0 = new fe91(i2, (byte) 22);
        Y0 = new fe91(i2, (byte) 23);
        Z0 = new fe91(i2, (byte) 24);
        a1 = new fe91(i2, (byte) 25);
        b1 = new fe91(i2, (byte) 26);
        c1 = new fe91(i2, (byte) 27);
        d1 = new fe91(i2, (byte) 28);
        e1 = new fe91(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe91(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Single singleError;
        Single singleError2;
        byte b2 = this.a;
        t2b t2bVar = lgo1.b;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ce91 ce91Var = (ce91) obj;
                return new de91(ce91Var.d, ce91Var.c);
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                return ((ef91) entry.getKey()) + "=" + ((td91) entry.getValue()).breadcrumb();
            case 2:
                return new ue91(((te91) obj).c);
            case 3:
                ((n161) obj).b(t2bVar, "TEST_TAG_ARTWORK");
                return rih1Var;
            case 4:
                ((n161) obj).b(t2bVar, "TEST_TAG_PLAY_PAUSE_BUTTON");
                return rih1Var;
            case 5:
                lm91 lm91Var = new lm91(false);
                rp91 rp91Var = rp91.a;
                return new em91("", "", lm91Var, false, new sp91(rp91Var, rp91Var, rp91.b), 40);
            case 6:
                return (em91) obj;
            case 7:
                return (am91) obj;
            case 8:
                return (qxc0) obj;
            case 9:
                return new fm91(((cxc0) obj).f.a);
            case 10:
                return Boolean.valueOf(obj instanceof qxc0);
            case 11:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 12:
                List list = ((wsc0) obj).f.y.a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y2c0) it.next()).a);
                }
                return arrayList;
            case 13:
                kjf1 kjf1Var = (kjf1) obj;
                String str = kjf1Var.a;
                String str2 = kjf1Var.b;
                String str3 = kjf1Var.c;
                String str4 = kjf1Var.d;
                String str5 = kjf1Var.e;
                String str6 = kjf1Var.g;
                String str7 = kjf1Var.f;
                vw01 vw01Var = kjf1Var.h;
                return new gyf1(str, str2, str3, str7, str4, str5, str6, vw01Var == vw01.b, vw01Var == vw01.a);
            case 14:
                return ((kjf1) obj).b;
            case 15:
                ((Number) obj).intValue();
                return null;
            case 16:
                return ((yif1) obj).a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new ko91(((zxo0) obj).a.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return w7x.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String strA0 = l4o1.a0((ContextTrack) obj, "context_uri");
                strA0.getClass();
                return strA0;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((zuc0) obj).f;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Logger.d(l1d.m("Failed sending Smart Shuffle reset signal, ", ((jy21) obj).b()), new Object[0]);
                return rih1Var;
            case 22:
                Logger.b("Success sending Smart Shuffle reset signal", new Object[0]);
                return rih1Var;
            case 23:
                Context context = (Context) obj;
                SmartShuffleButtonView smartShuffleButtonView = new SmartShuffleButtonView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166109);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166108);
                smartShuffleButtonView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
                smartShuffleButtonView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
                return smartShuffleButtonView;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rih1Var;
            case 25:
                q1a1 q1a1Var = (q1a1) obj;
                if (!(q1a1Var instanceof a1a1) && !(q1a1Var instanceof o1a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                q1a1 q1a1Var2 = (q1a1) obj;
                if (q1a1Var2 instanceof o1a1) {
                    o1a1 o1a1Var = (o1a1) q1a1Var2;
                    singleError = Single.just(new hon(o1a1Var.a, o1a1Var.b));
                } else {
                    singleError = q1a1Var2 instanceof a1a1 ? Single.error(((a1a1) q1a1Var2).a) : Single.error(eon.a);
                }
                singleError.getClass();
                return singleError;
            case 27:
                q1a1 q1a1Var3 = (q1a1) obj;
                if (!(q1a1Var3 instanceof b1a1) && !(q1a1Var3 instanceof n1a1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                q1a1 q1a1Var4 = (q1a1) obj;
                if (q1a1Var4 instanceof b1a1) {
                    singleError2 = Single.error(((b1a1) q1a1Var4).a);
                } else if (q1a1Var4 instanceof n1a1) {
                    n1a1 n1a1Var = (n1a1) q1a1Var4;
                    singleError2 = Single.just(new yqn(n1a1Var.a, n1a1Var.b));
                } else {
                    singleError2 = Single.error(eon.a);
                }
                singleError2.getClass();
                return singleError2;
            default:
                return rih1Var;
        }
    }
}
