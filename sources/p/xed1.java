package p;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.entitypages.common.hubframework.trackcloud.TrackCloudTextView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xed1 implements q570, o570 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ xed1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final int a() {
        switch (this.a) {
            case 0:
                return 2131428332;
            default:
                return 2131428965;
        }
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        a layoutManager;
        switch (this.a) {
            case 0:
                RecyclerView recyclerViewL = eqq.l(viewGroup, 2131626224, viewGroup, false);
                l7m0 l7m0Var = new l7m0(new nay(l670Var.d, (byte) 29), new hx40(recyclerViewL.getContext(), false));
                int integer = recyclerViewL.getResources().getInteger(2131492895);
                recyclerViewL.getContext();
                TraitsLayoutManager traitsLayoutManager = new TraitsLayoutManager(l7m0Var, integer);
                recyclerViewL.setAdapter(new s470(l670Var, (xb01) null));
                recyclerViewL.setLayoutManager(traitsLayoutManager);
                recyclerViewL.m(new hqc0(this, recyclerViewL, (byte) 2));
                wnd1 wnd1Var = (wnd1) this.b;
                if (wnd1Var.b != null && (layoutManager = recyclerViewL.getLayoutManager()) != null) {
                    layoutManager.w0(wnd1Var.b);
                }
                return recyclerViewL;
            default:
                return (ViewGroup) eqq.l(viewGroup, 2131626275, viewGroup, false);
        }
    }

    public final EnumSet c() {
        byte b = this.a;
        ix40 ix40Var = ix40.h;
        switch (b) {
            case 0:
                break;
        }
        return EnumSet.of(ix40Var);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        switch (this.a) {
            case 0:
                s470 adapter = ((RecyclerView) view).getAdapter();
                adapter.B(y570Var.s());
                adapter.h();
                return;
            default:
                alf1 alf1Var = (alf1) this.b;
                String strB = y570Var.g().B("ellipsis");
                Integer numR = y570Var.g().r("maxLines");
                int iIntValue = numR != null ? numR.intValue() : 4;
                Boolean boolA = y570Var.g().a("showArtists");
                boolean z = false;
                boolean zBooleanValue = boolA != null ? boolA.booleanValue() : false;
                HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var.g().h("tracks");
                if (hubsImmutableComponentBundleArrH == null) {
                    hubsImmutableComponentBundleArrH = new HubsImmutableComponentBundle[0];
                }
                Boolean boolA2 = y570Var.g().a("leftAligned");
                boolean zBooleanValue2 = boolA2 != null ? boolA2.booleanValue() : false;
                ArrayList arrayList = new ArrayList(hubsImmutableComponentBundleArrH.length);
                int length = hubsImmutableComponentBundleArrH.length;
                int i = 0;
                while (i < length) {
                    HubsImmutableComponentBundle hubsImmutableComponentBundle = hubsImmutableComponentBundleArrH[i];
                    arrayList.add(new ykf1(hubsImmutableComponentBundle.B("trackName"), hubsImmutableComponentBundle.b("isHearted", z), hubsImmutableComponentBundle.B("artistName"), hubsImmutableComponentBundle.b("isEnabled", true)));
                    i++;
                    z = false;
                }
                alf1Var.c = view;
                alf1Var.b = (TextView) view.findViewById(2131431468);
                alf1Var.a = (TrackCloudTextView) view.findViewById(2131431467);
                uwd uwdVarA = uwd.a();
                Objects.requireNonNull(strB);
                uwdVarA.h = strB;
                uwdVarA.a = iIntValue;
                uwdVarA.b = zBooleanValue;
                uwdVarA.i = arrayList;
                uwdVarA.f = zBooleanValue2;
                zkf1 zkf1Var = alf1Var.d;
                EncoreTextView encoreTextView = alf1Var.a;
                if (encoreTextView == null) {
                    u890.C("textView");
                    throw null;
                }
                zkf1Var.c(encoreTextView, uwdVarA);
                TrackCloudTextView trackCloudTextView = alf1Var.a;
                if (trackCloudTextView == null) {
                    u890.C("textView");
                    throw null;
                }
                trackCloudTextView.setTrackCloudText(zkf1Var);
                TextView textView = alf1Var.b;
                if (textView == null) {
                    u890.C("titleView");
                    throw null;
                }
                textView.setText((String) uwdVarA.g);
                TextView textView2 = alf1Var.b;
                if (textView2 == null) {
                    u890.C("titleView");
                    throw null;
                }
                textView2.setVisibility(!TextUtils.isEmpty((String) uwdVarA.g) ? 0 : 8);
                TextView textView3 = alf1Var.b;
                if (textView3 != null) {
                    textView3.setGravity(uwdVarA.f ? 8388611 : 17);
                    return;
                } else {
                    u890.C("titleView");
                    throw null;
                }
        }
    }

    public final void e(View view, y570 y570Var, int[] iArr) {
        switch (this.a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) view;
                recyclerView.addOnLayoutChangeListener(new x37(recyclerView, iArr, (byte) 17));
                break;
        }
    }

    private final void f(View view, y570 y570Var, int... iArr) {
    }
}
