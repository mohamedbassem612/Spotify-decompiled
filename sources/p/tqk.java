package p;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tqk extends hab0 implements iu30 {
    public static final tqk N0;
    public static final tqk O0;
    public static final tqk P0;
    public static final tqk Q0;
    public static final tqk R0;
    public static final tqk S0;
    public static final tqk T0;
    public static final tqk U0;
    public static final tqk V0;
    public static final tqk W0;
    public static final tqk X;
    public static final tqk X0;
    public static final tqk Y;
    public static final tqk Y0;
    public static final tqk Z;
    public static final tqk Z0;
    public static final tqk a1;
    public static final tqk b;
    public static final tqk b1;
    public static final tqk c;
    public static final tqk c1;
    public static final tqk d;
    public static final tqk d1;
    public static final tqk e;
    public static final tqk e1;
    public static final tqk f;
    public static final tqk g;
    public static final tqk h;
    public static final tqk i;
    public static final tqk t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new tqk(i2, (byte) 0);
        c = new tqk(i2, (byte) 1);
        d = new tqk(i2, (byte) 2);
        e = new tqk(i2, (byte) 3);
        f = new tqk(i2, (byte) 4);
        g = new tqk(i2, (byte) 5);
        h = new tqk(i2, (byte) 6);
        i = new tqk(i2, (byte) 7);
        t = new tqk(i2, (byte) 8);
        X = new tqk(i2, (byte) 9);
        Y = new tqk(i2, (byte) 10);
        Z = new tqk(i2, (byte) 11);
        N0 = new tqk(i2, (byte) 12);
        O0 = new tqk(i2, (byte) 13);
        P0 = new tqk(i2, (byte) 14);
        Q0 = new tqk(i2, (byte) 15);
        R0 = new tqk(i2, (byte) 16);
        S0 = new tqk(i2, (byte) 17);
        T0 = new tqk(i2, (byte) 18);
        U0 = new tqk(i2, (byte) 19);
        V0 = new tqk(i2, (byte) 20);
        W0 = new tqk(i2, (byte) 21);
        X0 = new tqk(i2, (byte) 22);
        Y0 = new tqk(i2, (byte) 23);
        Z0 = new tqk(i2, (byte) 24);
        a1 = new tqk(i2, (byte) 25);
        b1 = new tqk(i2, (byte) 26);
        c1 = new tqk(i2, (byte) 27);
        d1 = new tqk(i2, (byte) 28);
        e1 = new tqk(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tqk(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Map map;
        byte b2 = this.a;
        e1e e1eVar = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                return Boolean.valueOf(obj instanceof j6k);
            case 2:
                if (obj != null) {
                    return (j6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
                return null;
            case 3:
                return Boolean.valueOf(obj instanceof lhe0);
            case 4:
                if (obj != null) {
                    return (lhe0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof jo70);
            case 6:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 7:
                krk krkVar = (krk) obj;
                return new lrk(krkVar.a, krkVar.b, fg91.b);
            case 8:
                c380 c380Var = ((krk) obj).c;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new kfk((String) it.next()));
                }
                return arrayList;
            case 9:
                return ((ynd0) obj).c;
            case 10:
                return ((ynd0) obj).c;
            case 11:
                vhc1 vhc1Var = (vhc1) obj;
                thc1 thc1Var = vhc1Var instanceof thc1 ? (thc1) vhc1Var : null;
                if (thc1Var != null && (map = thc1Var.j) != null) {
                    e1eVar = (String) map.get("concert_uri");
                }
                return Boolean.valueOf(!(e1eVar == null || e1eVar.length() == 0));
            case 12:
                return new rxc0((String) obj);
            case 13:
                return (qxc0) obj;
            case 14:
                return Boolean.valueOf(obj instanceof qxc0);
            case 15:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 16:
                Context context = (Context) obj;
                ContextMenuButton contextMenuButton = new ContextMenuButton(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131167144);
                contextMenuButton.setScaleType(ImageView.ScaleType.CENTER);
                contextMenuButton.setImageDrawable(azo1.r(context, j4b1.q4, R.color.white, dimensionPixelSize));
                int dimensionPixelSize2 = contextMenuButton.getContext().getResources().getDimensionPixelSize(2131166508);
                contextMenuButton.setMinimumHeight(dimensionPixelSize2);
                contextMenuButton.setMinimumWidth(dimensionPixelSize2);
                return contextMenuButton;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                oxk oxkVar = (oxk) obj;
                Bundle bundle = new Bundle();
                bundle.putParcelable("preview", oxkVar.b);
                bundle.putParcelable("voice", oxkVar.d);
                bundle.putParcelable("schedule", oxkVar.e);
                c380<s781> c380Var2 = oxkVar.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(c380Var2, 10));
                for (s781 s781Var : c380Var2) {
                    arrayList2.add(new crr0(s781Var.a, s781Var.b, s781Var.c, s781Var.d, s781Var.e, s781Var.f));
                }
                bundle.putParcelableArrayList("shows", new ArrayList<>(arrayList2));
                s781 s781Var2 = oxkVar.f;
                bundle.putParcelable("selected_show", new crr0(s781Var2.a, s781Var2.b, s781Var2.c, s781Var2.d, s781Var2.e, s781Var2.f));
                bundle.putString("bottom_sheet_state", oxkVar.n.name());
                bundle.putInt("selected_artwork_carousel_index", oxkVar.t);
                bundle.putParcelableArrayList("recommended_tools", new ArrayList<>((Collection) oxkVar.v));
                bundle.putStringArrayList("selected_tool_ids", new ArrayList<>((Collection) oxkVar.w));
                bundle.putStringArrayList("interacted_tool_ids", new ArrayList<>((Collection) oxkVar.x));
                bundle.putBoolean("has_tool_selection_override", oxkVar.y);
                c380<vcl> c380Var3 = oxkVar.z;
                ArrayList arrayList3 = new ArrayList(q7h.U(c380Var3, 10));
                for (vcl vclVar : c380Var3) {
                    arrayList3.add(new nqr0(vclVar.a, vclVar.b, vclVar.c, vclVar.d, vclVar.f, vclVar.g, vclVar.e, vclVar.h));
                }
                bundle.putParcelableArrayList("connector_apps", new ArrayList<>(arrayList3));
                bundle.putString("location", oxkVar.C);
                e1e e1eVar2 = oxkVar.s;
                e1eVar = e1eVar2 instanceof e1e ? e1eVar2 : null;
                if (e1eVar != null) {
                    f27 f27Var = e1eVar.a;
                    bundle.putString("uploaded_artwork_carousel_image_url", f27Var.a);
                    bundle.putString("uploaded_artwork_carousel_artwork_id", f27Var.b);
                }
                return bundle;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return nik1.q6.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 22:
                ((Number) obj).doubleValue();
                return rih1Var;
            case 23:
                b261.x((e261) obj, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return "spotify:internal:bluejay:connector-apps:authentication";
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return nik1.s6.a;
            default:
                return new cll();
        }
    }
}
