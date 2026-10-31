package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class is21 implements Function {
    public final /* synthetic */ js21 a;

    public is21(js21 js21Var) {
        this.a = js21Var;
    }

    public final Object apply(Object obj) {
        boolean z;
        String str;
        xn3 xn3Var = (xn3) obj;
        js21 js21Var = this.a;
        ae80 ae80Var = js21Var.a;
        List list = xn3Var.d;
        boolean z2 = xn3Var.e;
        z6x z6xVar = z6x.a;
        if (!z2) {
            return Observable.just(new gq3(z6xVar));
        }
        evm1 evm1Var = js21Var.c;
        lik1 lik1Var = js21Var.b;
        if (!evm1Var.r()) {
            return Observable.just(new gq3(list));
        }
        u0p1 u0p1Var = xn3Var.f;
        boolean z3 = u0p1Var instanceof o920;
        if (z3) {
            z = true;
        } else if (u0p1Var instanceof p920) {
            z = ((p920) u0p1Var).c.a;
        } else {
            if (!(u0p1Var instanceof q920)) {
                eg.o();
                return null;
            }
            z = ((q920) u0p1Var).c.a;
        }
        if (!z) {
            return Observable.just(new gq3(list));
        }
        if (z3 || (u0p1Var instanceof q920)) {
            str = nik1.p2.a;
        } else {
            if (!(u0p1Var instanceof p920)) {
                eg.o();
                return null;
            }
            d6c0 d6c0Var = ((p920) u0p1Var).c;
            if (d6c0Var instanceof g5c0) {
                str = "spotify:collection:audiobooks";
            } else if (d6c0Var instanceof y5c0) {
                str = "spotify:collection:playlists";
            } else if (d6c0Var instanceof e5c0) {
                str = "spotify:collection:artists";
            } else if (d6c0Var instanceof y4c0) {
                str = "spotify:collection:albums";
            } else if (d6c0Var instanceof z5c0) {
                str = "spotify:collection:podcasts";
            } else if (d6c0Var instanceof j5c0) {
                str = "spotify:collection:courses";
            } else if (d6c0Var instanceof r5c0) {
                str = "spotify:collection:events";
            } else {
                str = d6c0Var instanceof b5c0 ? "spotify:collection:downloads" : nik1.p2.a;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ae80Var.a.b(((fhy) it.next()).b.getRequestId(), DismissReason.MessageCleanup.INSTANCE);
        }
        return pd80.b(ae80Var, str, lik1Var.a, new DynamicTagsMetadata(lik1Var.a, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null), 8).toObservable().map(new hs21(str)).onErrorReturnItem(z6xVar).map(y1x0.g);
    }
}
