package com.spotify.fandomcollectibles.stories;

import android.os.Bundle;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a2k;
import p.d6d1;
import p.his;
import p.jik1;
import p.kx40;
import p.lik1;
import p.mir0;
import p.nik1;
import p.p6r0;
import p.qdd1;
import p.rg30;
import p.rwq0;
import p.t3b1;
import p.u890;
import p.yon1;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spotify/fandomcollectibles/stories/FandomCollectiblesStoryActivity;", "Lp/t3b1;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_fandomcollectibles_stories-stories"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FandomCollectiblesStoryActivity extends t3b1 implements jik1 {
    public static final /* synthetic */ int g1 = 0;
    public a2k f1;

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("FANDOMCOLLECTIBLES_STORIES", "fandomcollectibles/stories", 549, "fandomcollectibles"), getViewUri().a(), 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lik1 getViewUri() {
        String stringExtra = getIntent().getStringExtra("fandom_collectibles.story.uri");
        if (stringExtra == null) {
            stringExtra = "";
        }
        return nik1.s5.b(stringExtra);
    }

    public final rg30 l0() {
        a2k a2kVar = this.f1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        zlv.b(this, new qdd1(0, 0, 2, d6d1.U0), 2);
        super.onCreate(bundle);
        setContentView(2131624637);
        FrameLayout frameLayout = (FrameLayout) findViewById(2131428203);
        frameLayout.getClass();
        rwq0.s(frameLayout, new his(frameLayout, (byte) 1));
    }
}
