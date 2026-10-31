package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import io.reactivex.rxjava3.functions.Function;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vpf1 implements Function {
    public final /* synthetic */ wpf1 a;

    public vpf1(wpf1 wpf1Var) {
        this.a = wpf1Var;
    }

    public final Object apply(Object obj) {
        HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH;
        re70 re70Var = (re70) obj;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = re70Var.g().g("toolbarmenu");
        String strB = null;
        String strF = hubsImmutableComponentBundleG != null ? hubsImmutableComponentBundleG.F("image_uri", "") : null;
        wpf1 wpf1Var = this.a;
        wpf1Var.e = strF;
        lik1 lik1Var = wpf1Var.d;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG2 = re70Var.g().g("toolbarmenu");
        if (hubsImmutableComponentBundleG2 != null && (hubsImmutableComponentBundleArrH = hubsImmutableComponentBundleG2.h("artists")) != null) {
            strB = hubsImmutableComponentBundleArrH[0].B("name");
        }
        wpf1Var.f = strB;
        pd80 pd80Var = wpf1Var.a;
        String str = lik1Var.a;
        return pd80.b(pd80Var, str, str, new DynamicTagsMetadata(lik1Var.a, wpf1Var.f, (String) null, wpf1Var.e, 4, (DefaultConstructorMarker) null), 8).toObservable();
    }
}
