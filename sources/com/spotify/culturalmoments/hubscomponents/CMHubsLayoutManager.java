package com.spotify.culturalmoments.hubscomponents;

import android.content.Context;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import kotlin.Metadata;
import p.l7m0;
import p.pic;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/spotify/culturalmoments/hubscomponents/CMHubsLayoutManager;", "Lcom/spotify/legacyglue/hugs/layouttraits/TraitsLayoutManager;", "src_main_java_com_spotify_culturalmoments_hubscomponents-hubscomponents"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CMHubsLayoutManager extends TraitsLayoutManager {
    public final pic s1;

    public CMHubsLayoutManager(Context context, l7m0 l7m0Var, int i, pic picVar) {
        super(l7m0Var, i);
        this.s1 = picVar;
    }

    public final boolean r() {
        return this.s1.a && super/*androidx.recyclerview.widget.LinearLayoutManager*/.r();
    }
}
