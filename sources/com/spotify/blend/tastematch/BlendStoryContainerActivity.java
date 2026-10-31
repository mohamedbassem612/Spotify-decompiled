package com.spotify.blend.tastematch;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.jik1;
import p.kx40;
import p.lik1;
import p.mir0;
import p.p6r0;
import p.rg30;
import p.t3b1;
import p.u890;
import p.yon1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/blend/tastematch/BlendStoryContainerActivity;", "Lp/t3b1;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_blend_tastematch-tastematch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BlendStoryContainerActivity extends t3b1 implements jik1 {
    public static final /* synthetic */ int h1 = 0;
    public final lik1 f1;
    public a2k g1;

    public BlendStoryContainerActivity() {
        Parcelable.Creator creator = lik1.CREATOR;
        this.f1 = new lik1("spotify:blend:story");
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("BLEND_DATA_STORY", "blend/data-story", 215, "blend"), null, 4));
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getF1() {
        return this.f1;
    }

    public final rg30 l0() {
        a2k a2kVar = this.g1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624094);
    }
}
